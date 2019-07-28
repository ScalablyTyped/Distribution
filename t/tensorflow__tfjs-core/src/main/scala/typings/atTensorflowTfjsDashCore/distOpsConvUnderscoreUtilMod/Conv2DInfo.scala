package typings.atTensorflowTfjsDashCore.distOpsConvUnderscoreUtilMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.channelsFirst
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.channelsLast
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
    val __obj = js.Dynamic.literal(batchSize = batchSize, dataFormat = dataFormat.asInstanceOf[js.Any], dilationHeight = dilationHeight, dilationWidth = dilationWidth, effectiveFilterHeight = effectiveFilterHeight, effectiveFilterWidth = effectiveFilterWidth, filterHeight = filterHeight, filterShape = filterShape, filterWidth = filterWidth, inChannels = inChannels, inHeight = inHeight, inShape = inShape, inWidth = inWidth, outChannels = outChannels, outHeight = outHeight, outShape = outShape, outWidth = outWidth, padInfo = padInfo, strideHeight = strideHeight, strideWidth = strideWidth)
  
    __obj.asInstanceOf[Conv2DInfo]
  }
}

