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

