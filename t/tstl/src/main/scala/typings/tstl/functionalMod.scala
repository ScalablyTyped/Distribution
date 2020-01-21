package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/functional", JSImport.Namespace)
@js.native
object functionalMod extends js.Object {
  @JSName("bit_and")
  def bitAnd(x: Double, y: Double): Double = js.native
  @JSName("bit_or")
  def bitOr(x: Double, y: Double): Double = js.native
  @JSName("bit_xor")
  def bitXor(x: Double, y: Double): Double = js.native
  @JSName("equal_to")
  def equalTo[T](x: T, y: T): Boolean = js.native
  @JSName("get_uid")
  def getUid(): Double = js.native
  @JSName("get_uid")
  def getUid(obj: js.Object): Double = js.native
  def greater[T](x: T, y: T): Boolean = js.native
  @JSName("greater_equal")
  def greaterEqual[T](x: T, y: T): Boolean = js.native
  def hash(items: js.Any*): Double = js.native
  def less[T](x: T, y: T): Boolean = js.native
  @JSName("less_equal")
  def lessEqual[T](x: T, y: T): Boolean = js.native
  @JSName("logical_and")
  def logicalAnd[T](x: T, y: T): Boolean = js.native
  @JSName("logical_not")
  def logicalNot[T](x: T): Boolean = js.native
  @JSName("logical_or")
  def logicalOr[T](x: T, y: T): Boolean = js.native
  @JSName("not_equal_to")
  def notEqualTo[T](x: T, y: T): Boolean = js.native
}

