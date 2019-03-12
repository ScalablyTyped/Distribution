package typings
package twoDotJsLib.twoDotJsMod.TwoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anchor extends Vector {
  var command: java.lang.String
  var controls: js.UndefOr[twoDotJsLib.Anon_Left] = js.undefined
  def ignore(): this.type
  def listen(): this.type
}

object Anchor {
  @scala.inline
  def apply(
    add: (Vector, Vector) => Anchor,
    addSelf: Vector => Anchor,
    clear: () => Anchor,
    clone: () => Anchor,
    command: java.lang.String,
    copy: Vector => Anchor,
    distanceSquared: Vector => scala.Double,
    distanceTo: Vector => scala.Double,
    divideScalar: scala.Double => Anchor,
    dot: Vector => scala.Double,
    equals: Vector => scala.Boolean,
    ignore: () => Anchor,
    isZero: () => scala.Boolean,
    length: () => scala.Double,
    lengthSquared: () => scala.Double,
    lerp: (Vector, scala.Double) => Anchor,
    listen: () => Anchor,
    multiplyScalar: scala.Double => Anchor,
    multiplySelf: Vector => Anchor,
    negate: () => Anchor,
    normalize: () => Anchor,
    set: (scala.Double, scala.Double) => Anchor,
    setLength: scala.Double => Anchor,
    sub: (Vector, Vector) => Anchor,
    subSelf: Vector => Anchor,
    x: scala.Double,
    y: scala.Double,
    controls: twoDotJsLib.Anon_Left = null
  ): Anchor = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), addSelf = js.Any.fromFunction1(addSelf), clear = js.Any.fromFunction0(clear), clone = js.Any.fromFunction0(clone), command = command, copy = js.Any.fromFunction1(copy), distanceSquared = js.Any.fromFunction1(distanceSquared), distanceTo = js.Any.fromFunction1(distanceTo), divideScalar = js.Any.fromFunction1(divideScalar), dot = js.Any.fromFunction1(dot), equals = js.Any.fromFunction1(equals), ignore = js.Any.fromFunction0(ignore), isZero = js.Any.fromFunction0(isZero), length = js.Any.fromFunction0(length), lengthSquared = js.Any.fromFunction0(lengthSquared), lerp = js.Any.fromFunction2(lerp), listen = js.Any.fromFunction0(listen), multiplyScalar = js.Any.fromFunction1(multiplyScalar), multiplySelf = js.Any.fromFunction1(multiplySelf), negate = js.Any.fromFunction0(negate), normalize = js.Any.fromFunction0(normalize), set = js.Any.fromFunction2(set), setLength = js.Any.fromFunction1(setLength), sub = js.Any.fromFunction2(sub), subSelf = js.Any.fromFunction1(subSelf), x = x, y = y)
    if (controls != null) __obj.updateDynamic("controls")(controls)
    __obj.asInstanceOf[Anchor]
  }
}

