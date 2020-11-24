package typings.twoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("two.js", "Vector")
@js.native
class Vector protected () extends js.Object {
  def this(x: Double, y: Double) = this()
  
  def add(v1: Vector, v2: Vector): this.type = js.native
  
  def addSelf(v: Vector): this.type = js.native
  
  def clear(): this.type = js.native
  
  def copy(v: Vector): this.type = js.native
  
  def distanceTo(v: Vector): Double = js.native
  
  def distanceToSquared(v: Vector): Double = js.native
  
  def divideScalar(value: Double): this.type = js.native
  
  def dot(v: Vector): Double = js.native
  
  def equals(v: Vector): Boolean = js.native
  
  def isZero(): Boolean = js.native
  
  def length(): Double = js.native
  
  def lengthSquared(): Double = js.native
  
  def lerp(v: Vector, t: Double): this.type = js.native
  
  def multiplyScalar(value: Double): this.type = js.native
  
  def multiplySelf(v: Vector): this.type = js.native
  
  def negate(): this.type = js.native
  
  def normalize(): this.type = js.native
  
  def set(x: Double, y: Double): this.type = js.native
  
  def setLength(length: Double): this.type = js.native
  
  def sub(v1: Vector, v2: Vector): this.type = js.native
  
  def subSelf(v: Vector): this.type = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
