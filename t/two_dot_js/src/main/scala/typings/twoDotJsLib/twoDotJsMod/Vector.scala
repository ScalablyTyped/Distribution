package typings
package twoDotJsLib.twoDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("two.js", "Vector")
@js.native
class Vector protected () extends js.Object {
  def this(x: scala.Double, y: scala.Double) = this()
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def add(v1: Vector, v2: Vector): this.type = js.native
  def addSelf(v: Vector): this.type = js.native
  def clear(): this.type = js.native
  def copy(v: Vector): this.type = js.native
  def distanceSquared(v: Vector): scala.Double = js.native
  def distanceTo(v: Vector): scala.Double = js.native
  def divideScalar(value: scala.Double): this.type = js.native
  def dot(v: Vector): scala.Double = js.native
  def equals(v: Vector): scala.Boolean = js.native
  def isZero(): scala.Boolean = js.native
  def length(): scala.Double = js.native
  def lengthSquared(): scala.Double = js.native
  def lerp(v: Vector, t: scala.Double): this.type = js.native
  def multiplyScalar(value: scala.Double): this.type = js.native
  def multiplySelf(v: Vector): this.type = js.native
  def negate(): this.type = js.native
  def normalize(): this.type = js.native
  def set(x: scala.Double, y: scala.Double): this.type = js.native
  def setLength(length: scala.Double): this.type = js.native
  def sub(v1: Vector, v2: Vector): this.type = js.native
  def subSelf(v: Vector): this.type = js.native
}

