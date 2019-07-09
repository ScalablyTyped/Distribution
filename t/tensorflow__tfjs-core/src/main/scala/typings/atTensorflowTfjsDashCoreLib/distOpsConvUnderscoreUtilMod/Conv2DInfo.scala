package typings
package atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conv2DInfo extends js.Object {
  var batchSize: scala.Double
  var dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsFirst | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsLast
  var dilationHeight: scala.Double
  var dilationWidth: scala.Double
  var effectiveFilterHeight: scala.Double
  var effectiveFilterWidth: scala.Double
  var filterHeight: scala.Double
  var filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  var filterWidth: scala.Double
  var inChannels: scala.Double
  var inHeight: scala.Double
  var inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  var inWidth: scala.Double
  var outChannels: scala.Double
  var outHeight: scala.Double
  var outShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  var outWidth: scala.Double
  var padInfo: PadInfo
  var strideHeight: scala.Double
  var strideWidth: scala.Double
}

object Conv2DInfo {
  @scala.inline
  def apply(
    batchSize: scala.Double,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsFirst | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsLast,
    dilationHeight: scala.Double,
    dilationWidth: scala.Double,
    effectiveFilterHeight: scala.Double,
    effectiveFilterWidth: scala.Double,
    filterHeight: scala.Double,
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    filterWidth: scala.Double,
    inChannels: scala.Double,
    inHeight: scala.Double,
    inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    inWidth: scala.Double,
    outChannels: scala.Double,
    outHeight: scala.Double,
    outShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    outWidth: scala.Double,
    padInfo: PadInfo,
    strideHeight: scala.Double,
    strideWidth: scala.Double
  ): Conv2DInfo = {
    val __obj = js.Dynamic.literal(batchSize = batchSize, dataFormat = dataFormat.asInstanceOf[js.Any], dilationHeight = dilationHeight, dilationWidth = dilationWidth, effectiveFilterHeight = effectiveFilterHeight, effectiveFilterWidth = effectiveFilterWidth, filterHeight = filterHeight, filterShape = filterShape, filterWidth = filterWidth, inChannels = inChannels, inHeight = inHeight, inShape = inShape, inWidth = inWidth, outChannels = outChannels, outHeight = outHeight, outShape = outShape, outWidth = outWidth, padInfo = padInfo, strideHeight = strideHeight, strideWidth = strideWidth)
  
    __obj.asInstanceOf[Conv2DInfo]
  }
}

