package typings.atTensorflowTfjsDashNode

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.Empty
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.cm
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.grayscale
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.in
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.rgb
import typings.atTensorflowTfjsDashNode.distImageMod.ImageType
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/image", JSImport.Namespace)
@js.native
object distImageMod extends js.Object {
  @js.native
  sealed trait ImageType extends js.Object
  
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
  def encodeJpeg(
    image: Tensor3D,
    format: js.UndefOr[grayscale | rgb],
    quality: js.UndefOr[Double],
    progressive: js.UndefOr[Boolean],
    optimizeSize: js.UndefOr[Boolean],
    chromaDownsampling: js.UndefOr[Boolean],
    densityUnit: js.UndefOr[cm | in],
    xDensity: js.UndefOr[Double],
    yDensity: js.UndefOr[Double],
    xmpMetadata: js.UndefOr[String]
  ): js.Promise[Uint8Array] = js.native
  @JSName("encodeJpeg")
  def encodeJpeg_cm(
    image: Tensor3D,
    format: js.UndefOr[Empty],
    quality: js.UndefOr[Double],
    progressive: js.UndefOr[Boolean],
    optimizeSize: js.UndefOr[Boolean],
    chromaDownsampling: js.UndefOr[Boolean],
    densityUnit: js.UndefOr[cm],
    xDensity: js.UndefOr[Double],
    yDensity: js.UndefOr[Double],
    xmpMetadata: js.UndefOr[String]
  ): js.Promise[Uint8Array] = js.native
  @JSName("encodeJpeg")
  def encodeJpeg_in(
    image: Tensor3D,
    format: js.UndefOr[Empty],
    quality: js.UndefOr[Double],
    progressive: js.UndefOr[Boolean],
    optimizeSize: js.UndefOr[Boolean],
    chromaDownsampling: js.UndefOr[Boolean],
    densityUnit: js.UndefOr[in],
    xDensity: js.UndefOr[Double],
    yDensity: js.UndefOr[Double],
    xmpMetadata: js.UndefOr[String]
  ): js.Promise[Uint8Array] = js.native
  def encodePng(image: Tensor3D): js.Promise[Uint8Array] = js.native
  def encodePng(image: Tensor3D, compression: Double): js.Promise[Uint8Array] = js.native
  def getImageType(content: Uint8Array): String = js.native
  @js.native
  object ImageType extends js.Object {
    @js.native
    sealed trait BMP extends ImageType
    
    @js.native
    sealed trait GIF extends ImageType
    
    @js.native
    sealed trait JPEG extends ImageType
    
    @js.native
    sealed trait PNG extends ImageType
    
    /* "BMP" */ val BMP: typings.atTensorflowTfjsDashNode.distImageMod.ImageType.BMP with String = js.native
    /* "gif" */ val GIF: typings.atTensorflowTfjsDashNode.distImageMod.ImageType.GIF with String = js.native
    /* "jpeg" */ val JPEG: typings.atTensorflowTfjsDashNode.distImageMod.ImageType.JPEG with String = js.native
    /* "png" */ val PNG: typings.atTensorflowTfjsDashNode.distImageMod.ImageType.PNG with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ImageType with String] = js.native
  }
  
}

