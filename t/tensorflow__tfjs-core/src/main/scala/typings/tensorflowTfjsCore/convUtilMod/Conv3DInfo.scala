package typings.tensorflowTfjsCore.convUtilMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.channelsFirst
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.channelsLast
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
    val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], dataFormat = dataFormat.asInstanceOf[js.Any], dilationDepth = dilationDepth.asInstanceOf[js.Any], dilationHeight = dilationHeight.asInstanceOf[js.Any], dilationWidth = dilationWidth.asInstanceOf[js.Any], effectiveFilterDepth = effectiveFilterDepth.asInstanceOf[js.Any], effectiveFilterHeight = effectiveFilterHeight.asInstanceOf[js.Any], effectiveFilterWidth = effectiveFilterWidth.asInstanceOf[js.Any], filterDepth = filterDepth.asInstanceOf[js.Any], filterHeight = filterHeight.asInstanceOf[js.Any], filterShape = filterShape.asInstanceOf[js.Any], filterWidth = filterWidth.asInstanceOf[js.Any], inChannels = inChannels.asInstanceOf[js.Any], inDepth = inDepth.asInstanceOf[js.Any], inHeight = inHeight.asInstanceOf[js.Any], inShape = inShape.asInstanceOf[js.Any], inWidth = inWidth.asInstanceOf[js.Any], outChannels = outChannels.asInstanceOf[js.Any], outDepth = outDepth.asInstanceOf[js.Any], outHeight = outHeight.asInstanceOf[js.Any], outShape = outShape.asInstanceOf[js.Any], outWidth = outWidth.asInstanceOf[js.Any], padInfo = padInfo.asInstanceOf[js.Any], strideDepth = strideDepth.asInstanceOf[js.Any], strideHeight = strideHeight.asInstanceOf[js.Any], strideWidth = strideWidth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Conv3DInfo]
  }
}

