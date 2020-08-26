package typings.tensorflowTfjsLayers.paddingSerializationMod

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormatSerialization
import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZeroPadding2DLayerConfig extends LayerConfig {
  var data_format: js.UndefOr[DataFormatSerialization] = js.native
  var padding: js.UndefOr[
    Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
  ] = js.native
}

object ZeroPadding2DLayerConfig {
  @scala.inline
  def apply(): ZeroPadding2DLayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZeroPadding2DLayerConfig]
  }
  @scala.inline
  implicit class ZeroPadding2DLayerConfigOps[Self <: ZeroPadding2DLayerConfig] (val x: Self) extends AnyVal {
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
    def setPadding(
      value: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
    ): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
  }
  
}

