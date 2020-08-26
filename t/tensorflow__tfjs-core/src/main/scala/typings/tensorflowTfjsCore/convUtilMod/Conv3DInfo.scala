package typings.tensorflowTfjsCore.convUtilMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.channelsFirst
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.channelsLast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conv3DInfo extends js.Object {
  var batchSize: Double = js.native
  var dataFormat: channelsFirst | channelsLast = js.native
  var dilationDepth: Double = js.native
  var dilationHeight: Double = js.native
  var dilationWidth: Double = js.native
  var effectiveFilterDepth: Double = js.native
  var effectiveFilterHeight: Double = js.native
  var effectiveFilterWidth: Double = js.native
  var filterDepth: Double = js.native
  var filterHeight: Double = js.native
  var filterShape: js.Tuple5[Double, Double, Double, Double, Double] = js.native
  var filterWidth: Double = js.native
  var inChannels: Double = js.native
  var inDepth: Double = js.native
  var inHeight: Double = js.native
  var inShape: js.Tuple5[Double, Double, Double, Double, Double] = js.native
  var inWidth: Double = js.native
  var outChannels: Double = js.native
  var outDepth: Double = js.native
  var outHeight: Double = js.native
  var outShape: js.Tuple5[Double, Double, Double, Double, Double] = js.native
  var outWidth: Double = js.native
  var padInfo: PadInfo3D = js.native
  var strideDepth: Double = js.native
  var strideHeight: Double = js.native
  var strideWidth: Double = js.native
}

object Conv3DInfo {
  @scala.inline
  def apply(
    batchSize: Double,
    dataFormat: channelsFirst | channelsLast,
    dilationDepth: Double,
    dilationHeight: Double,
    dilationWidth: Double,
    effectiveFilterDepth: Double,
    effectiveFilterHeight: Double,
    effectiveFilterWidth: Double,
    filterDepth: Double,
    filterHeight: Double,
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterWidth: Double,
    inChannels: Double,
    inDepth: Double,
    inHeight: Double,
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    inWidth: Double,
    outChannels: Double,
    outDepth: Double,
    outHeight: Double,
    outShape: js.Tuple5[Double, Double, Double, Double, Double],
    outWidth: Double,
    padInfo: PadInfo3D,
    strideDepth: Double,
    strideHeight: Double,
    strideWidth: Double
  ): Conv3DInfo = {
    val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], dataFormat = dataFormat.asInstanceOf[js.Any], dilationDepth = dilationDepth.asInstanceOf[js.Any], dilationHeight = dilationHeight.asInstanceOf[js.Any], dilationWidth = dilationWidth.asInstanceOf[js.Any], effectiveFilterDepth = effectiveFilterDepth.asInstanceOf[js.Any], effectiveFilterHeight = effectiveFilterHeight.asInstanceOf[js.Any], effectiveFilterWidth = effectiveFilterWidth.asInstanceOf[js.Any], filterDepth = filterDepth.asInstanceOf[js.Any], filterHeight = filterHeight.asInstanceOf[js.Any], filterShape = filterShape.asInstanceOf[js.Any], filterWidth = filterWidth.asInstanceOf[js.Any], inChannels = inChannels.asInstanceOf[js.Any], inDepth = inDepth.asInstanceOf[js.Any], inHeight = inHeight.asInstanceOf[js.Any], inShape = inShape.asInstanceOf[js.Any], inWidth = inWidth.asInstanceOf[js.Any], outChannels = outChannels.asInstanceOf[js.Any], outDepth = outDepth.asInstanceOf[js.Any], outHeight = outHeight.asInstanceOf[js.Any], outShape = outShape.asInstanceOf[js.Any], outWidth = outWidth.asInstanceOf[js.Any], padInfo = padInfo.asInstanceOf[js.Any], strideDepth = strideDepth.asInstanceOf[js.Any], strideHeight = strideHeight.asInstanceOf[js.Any], strideWidth = strideWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conv3DInfo]
  }
  @scala.inline
  implicit class Conv3DInfoOps[Self <: Conv3DInfo] (val x: Self) extends AnyVal {
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
    def setBatchSize(value: Double): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataFormat(value: channelsFirst | channelsLast): Self = this.set("dataFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setDilationDepth(value: Double): Self = this.set("dilationDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def setDilationHeight(value: Double): Self = this.set("dilationHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setDilationWidth(value: Double): Self = this.set("dilationWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setEffectiveFilterDepth(value: Double): Self = this.set("effectiveFilterDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def setEffectiveFilterHeight(value: Double): Self = this.set("effectiveFilterHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setEffectiveFilterWidth(value: Double): Self = this.set("effectiveFilterWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterDepth(value: Double): Self = this.set("filterDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterHeight(value: Double): Self = this.set("filterHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterShape(value: js.Tuple5[Double, Double, Double, Double, Double]): Self = this.set("filterShape", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterWidth(value: Double): Self = this.set("filterWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setInChannels(value: Double): Self = this.set("inChannels", value.asInstanceOf[js.Any])
    @scala.inline
    def setInDepth(value: Double): Self = this.set("inDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def setInHeight(value: Double): Self = this.set("inHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setInShape(value: js.Tuple5[Double, Double, Double, Double, Double]): Self = this.set("inShape", value.asInstanceOf[js.Any])
    @scala.inline
    def setInWidth(value: Double): Self = this.set("inWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutChannels(value: Double): Self = this.set("outChannels", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutDepth(value: Double): Self = this.set("outDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutHeight(value: Double): Self = this.set("outHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutShape(value: js.Tuple5[Double, Double, Double, Double, Double]): Self = this.set("outShape", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutWidth(value: Double): Self = this.set("outWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setPadInfo(value: PadInfo3D): Self = this.set("padInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrideDepth(value: Double): Self = this.set("strideDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrideHeight(value: Double): Self = this.set("strideHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrideWidth(value: Double): Self = this.set("strideWidth", value.asInstanceOf[js.Any])
  }
  
}

