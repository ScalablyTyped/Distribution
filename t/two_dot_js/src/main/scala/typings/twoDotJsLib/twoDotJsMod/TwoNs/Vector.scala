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
    add: js.Function2[Vector, Vector, Vector],
    addSelf: js.Function1[Vector, Vector],
    clear: js.Function0[Vector],
    clone: js.Function0[Vector],
    copy: js.Function1[Vector, Vector],
    distanceSquared: js.Function1[Vector, scala.Double],
    distanceTo: js.Function1[Vector, scala.Double],
    divideScalar: js.Function1[scala.Double, Vector],
    dot: js.Function1[Vector, scala.Double],
    equals: js.Function1[Vector, scala.Boolean],
    isZero: js.Function0[scala.Boolean],
    length: js.Function0[scala.Double],
    lengthSquared: js.Function0[scala.Double],
    lerp: js.Function2[Vector, scala.Double, Vector],
    multiplyScalar: js.Function1[scala.Double, Vector],
    multiplySelf: js.Function1[Vector, Vector],
    negate: js.Function0[Vector],
    normalize: js.Function0[Vector],
    set: js.Function2[scala.Double, scala.Double, Vector],
    setLength: js.Function1[scala.Double, Vector],
    sub: js.Function2[Vector, Vector, Vector],
    subSelf: js.Function1[Vector, Vector],
    x: scala.Double,
    y: scala.Double
  ): Vector = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("addSelf")(addSelf)
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("clone")(clone)
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("distanceSquared")(distanceSquared)
    __obj.updateDynamic("distanceTo")(distanceTo)
    __obj.updateDynamic("divideScalar")(divideScalar)
    __obj.updateDynamic("dot")(dot)
    __obj.updateDynamic("equals")(equals)
    __obj.updateDynamic("isZero")(isZero)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("lengthSquared")(lengthSquared)
    __obj.updateDynamic("lerp")(lerp)
    __obj.updateDynamic("multiplyScalar")(multiplyScalar)
    __obj.updateDynamic("multiplySelf")(multiplySelf)
    __obj.updateDynamic("negate")(negate)
    __obj.updateDynamic("normalize")(normalize)
    __obj.updateDynamic("set")(set)
    __obj.updateDynamic("setLength")(setLength)
    __obj.updateDynamic("sub")(sub)
    __obj.updateDynamic("subSelf")(subSelf)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Vector]
  }
}

