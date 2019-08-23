package typings.atTensorflowTfjsDashCore.distOpsConvUnderscoreUtilMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.channelsFirst
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.channelsLast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conv3DInfo extends js.Object {
  var batchSize: Double
  var dataFormat: channelsFirst | channelsLast
  var dilationDepth: Double
  var dilationHeight: Double
  var dilationWidth: Double
  var effectiveFilterDepth: Double
  var effectiveFilterHeight: Double
  var effectiveFilterWidth: Double
  var filterDepth: Double
  var filterHeight: Double
  var filterShape: js.Tuple5[Double, Double, Double, Double, Double]
  var filterWidth: Double
  var inChannels: Double
  var inDepth: Double
  var inHeight: Double
  var inShape: js.Tuple5[Double, Double, Double, Double, Double]
  var inWidth: Double
  var outChannels: Double
  var outDepth: Double
  var outHeight: Double
  var outShape: js.Tuple5[Double, Double, Double, Double, Double]
  var outWidth: Double
  var padInfo: PadInfo3D
  var strideDepth: Double
  var strideHeight: Double
  var strideWidth: Double
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
    val __obj = js.Dynamic.literal(batchSize = batchSize, dataFormat = dataFormat.asInstanceOf[js.Any], dilationDepth = dilationDepth, dilationHeight = dilationHeight, dilationWidth = dilationWidth, effectiveFilterDepth = effectiveFilterDepth, effectiveFilterHeight = effectiveFilterHeight, effectiveFilterWidth = effectiveFilterWidth, filterDepth = filterDepth, filterHeight = filterHeight, filterShape = filterShape, filterWidth = filterWidth, inChannels = inChannels, inDepth = inDepth, inHeight = inHeight, inShape = inShape, inWidth = inWidth, outChannels = outChannels, outDepth = outDepth, outHeight = outHeight, outShape = outShape, outWidth = outWidth, padInfo = padInfo, strideDepth = strideDepth, strideHeight = strideHeight, strideWidth = strideWidth)
  
    __obj.asInstanceOf[Conv3DInfo]
  }
}

