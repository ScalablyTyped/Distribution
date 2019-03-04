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
    add: js.Function2[Vector, Vector, Anchor],
    addSelf: js.Function1[Vector, Anchor],
    clear: js.Function0[Anchor],
    clone: js.Function0[Anchor],
    command: java.lang.String,
    copy: js.Function1[Vector, Anchor],
    distanceSquared: js.Function1[Vector, scala.Double],
    distanceTo: js.Function1[Vector, scala.Double],
    divideScalar: js.Function1[scala.Double, Anchor],
    dot: js.Function1[Vector, scala.Double],
    equals: js.Function1[Vector, scala.Boolean],
    ignore: js.Function0[Anchor],
    isZero: js.Function0[scala.Boolean],
    length: js.Function0[scala.Double],
    lengthSquared: js.Function0[scala.Double],
    lerp: js.Function2[Vector, scala.Double, Anchor],
    listen: js.Function0[Anchor],
    multiplyScalar: js.Function1[scala.Double, Anchor],
    multiplySelf: js.Function1[Vector, Anchor],
    negate: js.Function0[Anchor],
    normalize: js.Function0[Anchor],
    set: js.Function2[scala.Double, scala.Double, Anchor],
    setLength: js.Function1[scala.Double, Anchor],
    sub: js.Function2[Vector, Vector, Anchor],
    subSelf: js.Function1[Vector, Anchor],
    x: scala.Double,
    y: scala.Double,
    controls: twoDotJsLib.Anon_Left = null
  ): Anchor = {
    val __obj = js.Dynamic.literal(add = add, addSelf = addSelf, clear = clear, clone = clone, command = command, copy = copy, distanceSquared = distanceSquared, distanceTo = distanceTo, divideScalar = divideScalar, dot = dot, equals = equals, ignore = ignore, isZero = isZero, length = length, lengthSquared = lengthSquared, lerp = lerp, listen = listen, multiplyScalar = multiplyScalar, multiplySelf = multiplySelf, negate = negate, normalize = normalize, set = set, setLength = setLength, sub = sub, subSelf = subSelf, x = x, y = y)
    if (controls != null) __obj.updateDynamic("controls")(controls)
    __obj.asInstanceOf[Anchor]
  }
}

