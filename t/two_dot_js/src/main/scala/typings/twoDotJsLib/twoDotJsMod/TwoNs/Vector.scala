package typings
package twoDotJsLib.twoDotJsMod.TwoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vector extends js.Object {
  var x: scala.Double
  var y: scala.Double
  def add(v1: Vector, v2: Vector): this.type
  def addSelf(v: Vector): this.type
  def clear(): this.type
  def copy(v: Vector): this.type
  def distanceSquared(v: Vector): scala.Double
  def distanceTo(v: Vector): scala.Double
  def divideScalar(value: scala.Double): this.type
  def dot(v: Vector): scala.Double
  def equals(v: Vector): scala.Boolean
  def isZero(): scala.Boolean
  def length(): scala.Double
  def lengthSquared(): scala.Double
  def lerp(v: Vector, t: scala.Double): this.type
  def multiplyScalar(value: scala.Double): this.type
  def multiplySelf(v: Vector): this.type
  def negate(): this.type
  def normalize(): this.type
  def set(x: scala.Double, y: scala.Double): this.type
  def setLength(length: scala.Double): this.type
  def sub(v1: Vector, v2: Vector): this.type
  def subSelf(v: Vector): this.type
}

object Vector {
  @scala.inline
  def apply(
    add: (Vector, Vector) => Vector,
    addSelf: Vector => Vector,
    clear: () => Vector,
    clone: () => Vector,
    copy: Vector => Vector,
    distanceSquared: Vector => scala.Double,
    distanceTo: Vector => scala.Double,
    divideScalar: scala.Double => Vector,
    dot: Vector => scala.Double,
    equals: Vector => scala.Boolean,
    isZero: () => scala.Boolean,
    length: () => scala.Double,
    lengthSquared: () => scala.Double,
    lerp: (Vector, scala.Double) => Vector,
    multiplyScalar: scala.Double => Vector,
    multiplySelf: Vector => Vector,
    negate: () => Vector,
    normalize: () => Vector,
    set: (scala.Double, scala.Double) => Vector,
    setLength: scala.Double => Vector,
    sub: (Vector, Vector) => Vector,
    subSelf: Vector => Vector,
    x: scala.Double,
    y: scala.Double
  ): Vector = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), addSelf = js.Any.fromFunction1(addSelf), clear = js.Any.fromFunction0(clear), clone = js.Any.fromFunction0(clone), copy = js.Any.fromFunction1(copy), distanceSquared = js.Any.fromFunction1(distanceSquared), distanceTo = js.Any.fromFunction1(distanceTo), divideScalar = js.Any.fromFunction1(divideScalar), dot = js.Any.fromFunction1(dot), equals = js.Any.fromFunction1(equals), isZero = js.Any.fromFunction0(isZero), length = js.Any.fromFunction0(length), lengthSquared = js.Any.fromFunction0(lengthSquared), lerp = js.Any.fromFunction2(lerp), multiplyScalar = js.Any.fromFunction1(multiplyScalar), multiplySelf = js.Any.fromFunction1(multiplySelf), negate = js.Any.fromFunction0(negate), normalize = js.Any.fromFunction0(normalize), set = js.Any.fromFunction2(set), setLength = js.Any.fromFunction1(setLength), sub = js.Any.fromFunction2(sub), subSelf = js.Any.fromFunction1(subSelf), x = x, y = y)
  
    __obj.asInstanceOf[Vector]
  }
}

