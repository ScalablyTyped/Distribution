package typings.tensorflowTfjsCore.typesMod

import typings.tensorflowTfjsCore.anon.Dtype
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeightsManifestEntry extends js.Object {
  /**
    * Data type of the weight.
    */
  var dtype: float32 | int32 | bool | string | complex64 = js.native
  /**
    * Type of the weight.
    *
    * Optional.
    *
    * The value 'optimizer' indicates the weight belongs to an optimizer
    * (i.e., used only during model training and not during inference).
    */
  var group: js.UndefOr[WeightGroup] = js.native
  /**
    * Name of the weight, e.g., 'Dense_1/bias'
    */
  var name: String = js.native
  /**
    * Information for dequantization of the weight.
    */
  var quantization: js.UndefOr[Dtype] = js.native
  /**
    * Shape of the weight.
    */
  var shape: js.Array[Double] = js.native
}

object WeightsManifestEntry {
  @scala.inline
  def apply(dtype: float32 | int32 | bool | string | complex64, name: String, shape: js.Array[Double]): WeightsManifestEntry = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightsManifestEntry]
  }
  @scala.inline
  implicit class WeightsManifestEntryOps[Self <: WeightsManifestEntry] (val x: Self) extends AnyVal {
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
    def setDtype(value: float32 | int32 | bool | string | complex64): Self = this.set("dtype", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setShapeVarargs(value: Double*): Self = this.set("shape", js.Array(value :_*))
    @scala.inline
    def setShape(value: js.Array[Double]): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroup(value: WeightGroup): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setQuantization(value: Dtype): Self = this.set("quantization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantization: Self = this.set("quantization", js.undefined)
  }
  
}

