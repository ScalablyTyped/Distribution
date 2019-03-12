package typings
package synapticLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BINARY extends js.Object {
  def BINARY(targetValues: js.Array[scala.Double], outputValues: js.Array[scala.Double]): scala.Double
  def CROSS_ENTROPY(targetValues: js.Array[scala.Double], outputValues: js.Array[scala.Double]): scala.Double
  def MSE(targetValues: js.Array[scala.Double], outputValues: js.Array[scala.Double]): scala.Double
}

object Anon_BINARY {
  @scala.inline
  def apply(
    BINARY: (js.Array[scala.Double], js.Array[scala.Double]) => scala.Double,
    CROSS_ENTROPY: (js.Array[scala.Double], js.Array[scala.Double]) => scala.Double,
    MSE: (js.Array[scala.Double], js.Array[scala.Double]) => scala.Double
  ): Anon_BINARY = {
    val __obj = js.Dynamic.literal(BINARY = js.Any.fromFunction2(BINARY), CROSS_ENTROPY = js.Any.fromFunction2(CROSS_ENTROPY), MSE = js.Any.fromFunction2(MSE))
  
    __obj.asInstanceOf[Anon_BINARY]
  }
}

