package typings.tensorflowTfjsLayers.convolutionalSerializationMod

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormatSerialization
import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cropping2DLayerConfig extends LayerConfig {
  var cropping: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])]) = js.native
  var data_format: js.UndefOr[DataFormatSerialization] = js.native
}

object Cropping2DLayerConfig {
  @scala.inline
  def apply(
    cropping: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
  ): Cropping2DLayerConfig = {
    val __obj = js.Dynamic.literal(cropping = cropping.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cropping2DLayerConfig]
  }
  @scala.inline
  implicit class Cropping2DLayerConfigOps[Self <: Cropping2DLayerConfig] (val x: Self) extends AnyVal {
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
    def setCropping(
      value: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
    ): Self = this.set("cropping", value.asInstanceOf[js.Any])
    @scala.inline
    def setData_format(value: DataFormatSerialization): Self = this.set("data_format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData_format: Self = this.set("data_format", js.undefined)
  }
  
}

