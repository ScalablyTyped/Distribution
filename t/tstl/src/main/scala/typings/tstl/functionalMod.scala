package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/functional", JSImport.Namespace)
@js.native
object functionalMod extends js.Object {
  def bit_and(x: Double, y: Double): Double = js.native
  def bit_or(x: Double, y: Double): Double = js.native
  def bit_xor(x: Double, y: Double): Double = js.native
  def equal_to[T](x: T, y: T): Boolean = js.native
  def get_uid(): Double = js.native
  def get_uid(obj: js.Object): Double = js.native
  def greater[T](x: T, y: T): Boolean = js.native
  def greater_equal[T](x: T, y: T): Boolean = js.native
  def hash(items: js.Any*): Double = js.native
  def less[T](x: T, y: T): Boolean = js.native
  def less_equal[T](x: T, y: T): Boolean = js.native
  def logical_and[T](x: T, y: T): Boolean = js.native
  def logical_not[T](x: T): Boolean = js.native
  def logical_or[T](x: T, y: T): Boolean = js.native
  def not_equal_to[T](x: T, y: T): Boolean = js.native
}

