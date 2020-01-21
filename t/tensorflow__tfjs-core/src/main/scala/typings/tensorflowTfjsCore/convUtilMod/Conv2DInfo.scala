package typings.tensorflowTfjsCore.convUtilMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.channelsFirst
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.channelsLast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conv2DInfo extends js.Object {
  var batchSize: Double
  var dataFormat: channelsFirst | channelsLast
  var dilationHeight: Double
  var dilationWidth: Double
  var effectiveFilterHeight: Double
  var effectiveFilterWidth: Double
  var filterHeight: Double
  var filterShape: js.Tuple4[Double, Double, Double, Double]
  var filterWidth: Double
  var inChannels: Double
  var inHeight: Double
  var inShape: js.Tuple4[Double, Double, Double, Double]
  var inWidth: Double
  var outChannels: Double
  var outHeight: Double
  var outShape: js.Tuple4[Double, Double, Double, Double]
  var outWidth: Double
  var padInfo: PadInfo
  var strideHeight: Double
  var strideWidth: Double
}

object Conv2DInfo {
  @scala.inline
  def apply(
    batchSize: Double,
    dataFormat: channelsFirst | channelsLast,
    dilationHeight: Double,
    dilationWidth: Double,
    effectiveFilterHeight: Double,
    effectiveFilterWidth: Double,
    filterHeight: Double,
    filterShape: js.Tuple4[Double, Double, Double, Double],
    filterWidth: Double,
    inChannels: Double,
    inHeight: Double,
    inShape: js.Tuple4[Double, Double, Double, Double],
    inWidth: Double,
    outChannels: Double,
    outHeight: Double,
    outShape: js.Tuple4[Double, Double, Double, Double],
    outWidth: Double,
    padInfo: PadInfo,
    strideHeight: Double,
    strideWidth: Double
  ): Conv2DInfo = {
    val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], dataFormat = dataFormat.asInstanceOf[js.Any], dilationHeight = dilationHeight.asInstanceOf[js.Any], dilationWidth = dilationWidth.asInstanceOf[js.Any], effectiveFilterHeight = effectiveFilterHeight.asInstanceOf[js.Any], effectiveFilterWidth = effectiveFilterWidth.asInstanceOf[js.Any], filterHeight = filterHeight.asInstanceOf[js.Any], filterShape = filterShape.asInstanceOf[js.Any], filterWidth = filterWidth.asInstanceOf[js.Any], inChannels = inChannels.asInstanceOf[js.Any], inHeight = inHeight.asInstanceOf[js.Any], inShape = inShape.asInstanceOf[js.Any], inWidth = inWidth.asInstanceOf[js.Any], outChannels = outChannels.asInstanceOf[js.Any], outHeight = outHeight.asInstanceOf[js.Any], outShape = outShape.asInstanceOf[js.Any], outWidth = outWidth.asInstanceOf[js.Any], padInfo = padInfo.asInstanceOf[js.Any], strideHeight = strideHeight.asInstanceOf[js.Any], strideWidth = strideWidth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Conv2DInfo]
  }
}

