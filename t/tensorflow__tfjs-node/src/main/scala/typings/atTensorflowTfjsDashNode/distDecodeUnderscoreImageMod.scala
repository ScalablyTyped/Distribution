package typings.atTensorflowTfjsDashNode

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/decode_image", JSImport.Namespace)
@js.native
object distDecodeUnderscoreImageMod extends js.Object {
  def decodeBmp(contents: Uint8Array): Tensor3D = js.native
  def decodeBmp(contents: Uint8Array, channels: Double): Tensor3D = js.native
  def decodeGif(contents: Uint8Array): Tensor4D = js.native
  def decodeImage(content: Uint8Array): Tensor3D | Tensor4D = js.native
  def decodeImage(content: Uint8Array, channels: Double): Tensor3D | Tensor4D = js.native
  def decodeImage(content: Uint8Array, channels: Double, dtype: String): Tensor3D | Tensor4D = js.native
  def decodeImage(content: Uint8Array, channels: Double, dtype: String, expandAnimations: Boolean): Tensor3D | Tensor4D = js.native
  def decodeJpeg(
    contents: Uint8Array,
    channels: js.UndefOr[Double],
    ratio: js.UndefOr[Double],
    fancyUpscaling: js.UndefOr[Boolean],
    tryRecoverTruncated: js.UndefOr[Boolean],
    acceptableFraction: js.UndefOr[Double],
    dctMethod: js.UndefOr[String]
  ): Tensor3D = js.native
  def decodePng(contents: Uint8Array): Tensor3D = js.native
  def decodePng(contents: Uint8Array, channels: Double): Tensor3D = js.native
  def decodePng(contents: Uint8Array, channels: Double, dtype: String): Tensor3D = js.native
}

