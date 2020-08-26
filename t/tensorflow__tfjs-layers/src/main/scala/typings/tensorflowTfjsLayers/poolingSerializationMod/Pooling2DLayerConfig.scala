package typings.tensorflowTfjsLayers.poolingSerializationMod

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormatSerialization
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pooling2DLayerConfig extends LayerConfig {
  var data_format: js.UndefOr[DataFormatSerialization] = js.native
  var padding: js.UndefOr[PaddingMode] = js.native
  var pool_size: js.UndefOr[Double | (js.Tuple2[Double, Double])] = js.native
  var strides: js.UndefOr[Double | (js.Tuple2[Double, Double])] = js.native
}

object Pooling2DLayerConfig {
  @scala.inline
  def apply(): Pooling2DLayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pooling2DLayerConfig]
  }
  @scala.inline
  implicit class Pooling2DLayerConfigOps[Self <: Pooling2DLayerConfig] (val x: Self) extends AnyVal {
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
    def setData_format(value: DataFormatSerialization): Self = this.set("data_format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData_format: Self = this.set("data_format", js.undefined)
    @scala.inline
    def setPadding(value: PaddingMode): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPool_size(value: Double | (js.Tuple2[Double, Double])): Self = this.set("pool_size", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePool_size: Self = this.set("pool_size", js.undefined)
    @scala.inline
    def setStrides(value: Double | (js.Tuple2[Double, Double])): Self = this.set("strides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrides: Self = this.set("strides", js.undefined)
  }
  
}

