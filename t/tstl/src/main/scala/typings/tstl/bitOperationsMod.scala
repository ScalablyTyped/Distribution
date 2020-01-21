package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/functional/bit_operations", JSImport.Namespace)
@js.native
object bitOperationsMod extends js.Object {
  @JSName("bit_and")
  def bitAnd(x: Double, y: Double): Double = js.native
  @JSName("bit_or")
  def bitOr(x: Double, y: Double): Double = js.native
  @JSName("bit_xor")
  def bitXor(x: Double, y: Double): Double = js.native
  @JSName("logical_and")
  def logicalAnd[T](x: T, y: T): Boolean = js.native
  @JSName("logical_not")
  def logicalNot[T](x: T): Boolean = js.native
  @JSName("logical_or")
  def logicalOr[T](x: T, y: T): Boolean = js.native
}

