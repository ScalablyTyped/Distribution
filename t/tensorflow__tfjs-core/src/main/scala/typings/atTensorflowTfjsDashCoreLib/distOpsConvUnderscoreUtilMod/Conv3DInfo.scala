package typings
package atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conv3DInfo extends js.Object {
  var batchSize: scala.Double
  var dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsFirst | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsLast
  var dilationDepth: scala.Double
  var dilationHeight: scala.Double
  var dilationWidth: scala.Double
  var filterDepth: scala.Double
  var filterHeight: scala.Double
  var filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double]
  var filterWidth: scala.Double
  var inChannels: scala.Double
  var inDepth: scala.Double
  var inHeight: scala.Double
  var inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double]
  var inWidth: scala.Double
  var outChannels: scala.Double
  var outDepth: scala.Double
  var outHeight: scala.Double
  var outShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double]
  var outWidth: scala.Double
  var padInfo: PadInfo3D
  var strideDepth: scala.Double
  var strideHeight: scala.Double
  var strideWidth: scala.Double
}

object Conv3DInfo {
  @scala.inline
  def apply(
    batchSize: scala.Double,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsFirst | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsLast,
    dilationDepth: scala.Double,
    dilationHeight: scala.Double,
    dilationWidth: scala.Double,
    filterDepth: scala.Double,
    filterHeight: scala.Double,
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterWidth: scala.Double,
    inChannels: scala.Double,
    inDepth: scala.Double,
    inHeight: scala.Double,
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    inWidth: scala.Double,
    outChannels: scala.Double,
    outDepth: scala.Double,
    outHeight: scala.Double,
    outShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    outWidth: scala.Double,
    padInfo: PadInfo3D,
    strideDepth: scala.Double,
    strideHeight: scala.Double,
    strideWidth: scala.Double
  ): Conv3DInfo = {
    val __obj = js.Dynamic.literal(batchSize = batchSize, dataFormat = dataFormat.asInstanceOf[js.Any], dilationDepth = dilationDepth, dilationHeight = dilationHeight, dilationWidth = dilationWidth, filterDepth = filterDepth, filterHeight = filterHeight, filterShape = filterShape, filterWidth = filterWidth, inChannels = inChannels, inDepth = inDepth, inHeight = inHeight, inShape = inShape, inWidth = inWidth, outChannels = outChannels, outDepth = outDepth, outHeight = outHeight, outShape = outShape, outWidth = outWidth, padInfo = padInfo, strideDepth = strideDepth, strideHeight = strideHeight, strideWidth = strideWidth)
  
    __obj.asInstanceOf[Conv3DInfo]
  }
}

