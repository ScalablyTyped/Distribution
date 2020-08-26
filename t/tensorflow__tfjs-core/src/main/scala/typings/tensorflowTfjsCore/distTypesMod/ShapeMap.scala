package typings.tensorflowTfjsCore.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShapeMap extends js.Object {
  var R0: js.Array[Double] = js.native
  var R1: js.Array[Double] = js.native
  var R2: js.Tuple2[Double, Double] = js.native
  var R3: js.Tuple3[Double, Double, Double] = js.native
  var R4: js.Tuple4[Double, Double, Double, Double] = js.native
  var R5: js.Tuple5[Double, Double, Double, Double, Double] = js.native
  var R6: js.Tuple6[Double, Double, Double, Double, Double, Double] = js.native
}

object ShapeMap {
  @scala.inline
  def apply(
    R0: js.Array[Double],
    R1: js.Array[Double],
    R2: js.Tuple2[Double, Double],
    R3: js.Tuple3[Double, Double, Double],
    R4: js.Tuple4[Double, Double, Double, Double],
    R5: js.Tuple5[Double, Double, Double, Double, Double],
    R6: js.Tuple6[Double, Double, Double, Double, Double, Double]
  ): ShapeMap = {
    val __obj = js.Dynamic.literal(R0 = R0.asInstanceOf[js.Any], R1 = R1.asInstanceOf[js.Any], R2 = R2.asInstanceOf[js.Any], R3 = R3.asInstanceOf[js.Any], R4 = R4.asInstanceOf[js.Any], R5 = R5.asInstanceOf[js.Any], R6 = R6.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeMap]
  }
  @scala.inline
  implicit class ShapeMapOps[Self <: ShapeMap] (val x: Self) extends AnyVal {
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
    def setR0Varargs(value: Double*): Self = this.set("R0", js.Array(value :_*))
    @scala.inline
    def setR0(value: js.Array[Double]): Self = this.set("R0", value.asInstanceOf[js.Any])
    @scala.inline
    def setR1Varargs(value: Double*): Self = this.set("R1", js.Array(value :_*))
    @scala.inline
    def setR1(value: js.Array[Double]): Self = this.set("R1", value.asInstanceOf[js.Any])
    @scala.inline
    def setR2(value: js.Tuple2[Double, Double]): Self = this.set("R2", value.asInstanceOf[js.Any])
    @scala.inline
    def setR3(value: js.Tuple3[Double, Double, Double]): Self = this.set("R3", value.asInstanceOf[js.Any])
    @scala.inline
    def setR4(value: js.Tuple4[Double, Double, Double, Double]): Self = this.set("R4", value.asInstanceOf[js.Any])
    @scala.inline
    def setR5(value: js.Tuple5[Double, Double, Double, Double, Double]): Self = this.set("R5", value.asInstanceOf[js.Any])
    @scala.inline
    def setR6(value: js.Tuple6[Double, Double, Double, Double, Double, Double]): Self = this.set("R6", value.asInstanceOf[js.Any])
  }
  
}

