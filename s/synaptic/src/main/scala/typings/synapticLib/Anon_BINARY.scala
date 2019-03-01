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
    BINARY: js.Function2[js.Array[scala.Double], js.Array[scala.Double], scala.Double],
    CROSS_ENTROPY: js.Function2[js.Array[scala.Double], js.Array[scala.Double], scala.Double],
    MSE: js.Function2[js.Array[scala.Double], js.Array[scala.Double], scala.Double]
  ): Anon_BINARY = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BINARY")(BINARY)
    __obj.updateDynamic("CROSS_ENTROPY")(CROSS_ENTROPY)
    __obj.updateDynamic("MSE")(MSE)
    __obj.asInstanceOf[Anon_BINARY]
  }
}

