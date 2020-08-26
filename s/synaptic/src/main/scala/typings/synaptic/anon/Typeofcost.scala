package typings.synaptic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcost extends js.Object {
  def BINARY(targetValues: js.Array[Double], outputValues: js.Array[Double]): Double = js.native
  def CROSS_ENTROPY(targetValues: js.Array[Double], outputValues: js.Array[Double]): Double = js.native
  def MSE(targetValues: js.Array[Double], outputValues: js.Array[Double]): Double = js.native
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
  @scala.inline
  implicit class TypeofcostOps[Self <: Typeofcost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBINARY(value: (js.Array[Double], js.Array[Double]) => Double): Self = this.set("BINARY", js.Any.fromFunction2(value))
    @scala.inline
    def setCROSS_ENTROPY(value: (js.Array[Double], js.Array[Double]) => Double): Self = this.set("CROSS_ENTROPY", js.Any.fromFunction2(value))
    @scala.inline
    def setMSE(value: (js.Array[Double], js.Array[Double]) => Double): Self = this.set("MSE", js.Any.fromFunction2(value))
  }
  
}

