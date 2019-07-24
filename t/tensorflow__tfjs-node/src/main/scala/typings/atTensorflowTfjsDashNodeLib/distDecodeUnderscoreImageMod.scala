package typings
package atTensorflowTfjsDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/decode_image", JSImport.Namespace)
@js.native
object distDecodeUnderscoreImageMod extends js.Object {
  def decodeBmp(contents: stdLib.Uint8Array): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
  def decodeBmp(contents: stdLib.Uint8Array, channels: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
  def decodeGif(contents: stdLib.Uint8Array): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def decodeImage(content: stdLib.Uint8Array): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def decodeImage(content: stdLib.Uint8Array, channels: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def decodeImage(content: stdLib.Uint8Array, channels: scala.Double, dtype: java.lang.String): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def decodeImage(
    content: stdLib.Uint8Array,
    channels: scala.Double,
    dtype: java.lang.String,
    expandAnimations: scala.Boolean
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def decodeJpeg(
    contents: stdLib.Uint8Array,
    channels: js.UndefOr[scala.Double],
    ratio: js.UndefOr[scala.Double],
    fancyUpscaling: js.UndefOr[scala.Boolean],
    tryRecoverTruncated: js.UndefOr[scala.Boolean],
    acceptableFraction: js.UndefOr[scala.Double],
    dctMethod: js.UndefOr[java.lang.String]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
  def decodePng(contents: stdLib.Uint8Array): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
  def decodePng(contents: stdLib.Uint8Array, channels: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
  def decodePng(contents: stdLib.Uint8Array, channels: scala.Double, dtype: java.lang.String): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
}

