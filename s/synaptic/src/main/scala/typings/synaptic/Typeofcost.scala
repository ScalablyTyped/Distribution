package typings.synaptic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcost extends js.Object {
  def BINARY(targetValues: js.Array[Double], outputValues: js.Array[Double]): Double
  def CROSS_ENTROPY(targetValues: js.Array[Double], outputValues: js.Array[Double]): Double
  def MSE(targetValues: js.Array[Double], outputValues: js.Array[Double]): Double
}

object Typeofcost {
  @scala.inline
  def apply(
    BINARY: (js.Array[Double], js.Array[Double]) => Double,
    CROSS_ENTROPY: (js.Array[Double], js.Array[Double]) => Double,
    MSE: (js.Array[Double], js.Array[Double]) => Double
  ): Typeofcost = {
    val __obj = js.Dynamic.literal(BINARY = js.Any.fromFunction2(BINARY), CROSS_ENTROPY = js.Any.fromFunction2(CROSS_ENTROPY), MSE = js.Any.fromFunction2(MSE))
  
    __obj.asInstanceOf[Typeofcost]
  }
}

