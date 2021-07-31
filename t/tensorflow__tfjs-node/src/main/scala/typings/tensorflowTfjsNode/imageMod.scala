package typings.tensorflowTfjsNode

import typings.std.Uint8Array
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings._empty
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.cm
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.grayscale
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.in
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.rgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMod {
  
  @JSImport("@tensorflow/tfjs-node/dist/image", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ImageType extends StObject
  @JSImport("@tensorflow/tfjs-node/dist/image", "ImageType")
  @js.native
  object ImageType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ImageType & String] = js.native
    
    @js.native
    sealed trait BMP
      extends StObject
         with ImageType
    /* "BMP" */ val BMP: typings.tensorflowTfjsNode.imageMod.ImageType.BMP & String = js.native
    
    @js.native
    sealed trait GIF
      extends StObject
         with ImageType
    /* "gif" */ val GIF: typings.tensorflowTfjsNode.imageMod.ImageType.GIF & String = js.native
    
    @js.native
    sealed trait JPEG
      extends StObject
         with ImageType
    /* "jpeg" */ val JPEG: typings.tensorflowTfjsNode.imageMod.ImageType.JPEG & String = js.native
    
    @js.native
    sealed trait PNG
      extends StObject
         with ImageType
    /* "png" */ val PNG: typings.tensorflowTfjsNode.imageMod.ImageType.PNG & String = js.native
  }
  
  @scala.inline
  def decodeBmp(contents: Uint8Array): Tensor3D = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeBmp")(contents.asInstanceOf[js.Any]).asInstanceOf[Tensor3D]
  @scala.inline
  def decodeBmp(contents: Uint8Array, channels: Double): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeBmp")(contents.asInstanceOf[js.Any], channels.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  
  @scala.inline
  def decodeGif(contents: Uint8Array): Tensor4D = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeGif")(contents.asInstanceOf[js.Any]).asInstanceOf[Tensor4D]
  
  @scala.inline
  def decodeImage(content: Uint8Array): Tensor3D | Tensor4D = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeImage")(content.asInstanceOf[js.Any]).asInstanceOf[Tensor3D | Tensor4D]
  @scala.inline
  def decodeImage(content: Uint8Array, channels: Double): Tensor3D | Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeImage")(content.asInstanceOf[js.Any], channels.asInstanceOf[js.Any])).asInstanceOf[Tensor3D | Tensor4D]
  @scala.inline
  def decodeImage(content: Uint8Array, channels: Double, dtype: String): Tensor3D | Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeImage")(content.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor3D | Tensor4D]
  @scala.inline
  def decodeImage(content: Uint8Array, channels: Double, dtype: String, expandAnimations: Boolean): Tensor3D | Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeImage")(content.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], expandAnimations.asInstanceOf[js.Any])).asInstanceOf[Tensor3D | Tensor4D]
  @scala.inline
  def decodeImage(content: Uint8Array, channels: Double, dtype: Unit, expandAnimations: Boolean): Tensor3D | Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeImage")(content.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], expandAnimations.asInstanceOf[js.Any])).asInstanceOf[Tensor3D | Tensor4D]
  @scala.inline
  def decodeImage(content: Uint8Array, channels: Unit, dtype: String): Tensor3D | Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeImage")(content.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor3D | Tensor4D]
  @scala.inline
  def decodeImage(content: Uint8Array, channels: Unit, dtype: String, expandAnimations: Boolean): Tensor3D | Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeImage")(content.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], expandAnimations.asInstanceOf[js.Any])).asInstanceOf[Tensor3D | Tensor4D]
  @scala.inline
  def decodeImage(content: Uint8Array, channels: Unit, dtype: Unit, expandAnimations: Boolean): Tensor3D | Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeImage")(content.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], expandAnimations.asInstanceOf[js.Any])).asInstanceOf[Tensor3D | Tensor4D]
  
  @scala.inline
  def decodeJpeg(
    contents: Uint8Array,
    channels: js.UndefOr[Double],
    ratio: js.UndefOr[Double],
    fancyUpscaling: js.UndefOr[Boolean],
    tryRecoverTruncated: js.UndefOr[Boolean],
    acceptableFraction: js.UndefOr[Double],
    dctMethod: js.UndefOr[String]
  ): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeJpeg")(contents.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], ratio.asInstanceOf[js.Any], fancyUpscaling.asInstanceOf[js.Any], tryRecoverTruncated.asInstanceOf[js.Any], acceptableFraction.asInstanceOf[js.Any], dctMethod.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  
  @scala.inline
  def decodePng(contents: Uint8Array): Tensor3D = ^.asInstanceOf[js.Dynamic].applyDynamic("decodePng")(contents.asInstanceOf[js.Any]).asInstanceOf[Tensor3D]
  @scala.inline
  def decodePng(contents: Uint8Array, channels: Double): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("decodePng")(contents.asInstanceOf[js.Any], channels.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  @scala.inline
  def decodePng(contents: Uint8Array, channels: Double, dtype: String): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("decodePng")(contents.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  @scala.inline
  def decodePng(contents: Uint8Array, channels: Unit, dtype: String): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("decodePng")(contents.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  
  @scala.inline
  def encodeJpeg(
    image: Tensor3D,
    format: js.UndefOr[_empty | grayscale | rgb],
    quality: js.UndefOr[Double],
    progressive: js.UndefOr[Boolean],
    optimizeSize: js.UndefOr[Boolean],
    chromaDownsampling: js.UndefOr[Boolean],
    densityUnit: js.UndefOr[in | cm],
    xDensity: js.UndefOr[Double],
    yDensity: js.UndefOr[Double],
    xmpMetadata: js.UndefOr[String]
  ): js.Promise[Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeJpeg")(image.asInstanceOf[js.Any], format.asInstanceOf[js.Any], quality.asInstanceOf[js.Any], progressive.asInstanceOf[js.Any], optimizeSize.asInstanceOf[js.Any], chromaDownsampling.asInstanceOf[js.Any], densityUnit.asInstanceOf[js.Any], xDensity.asInstanceOf[js.Any], yDensity.asInstanceOf[js.Any], xmpMetadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Uint8Array]]
  
  @scala.inline
  def encodePng(image: Tensor3D): js.Promise[Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("encodePng")(image.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Uint8Array]]
  @scala.inline
  def encodePng(image: Tensor3D, compression: Double): js.Promise[Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodePng")(image.asInstanceOf[js.Any], compression.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Uint8Array]]
  
  @scala.inline
  def getImageType(content: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageType")(content.asInstanceOf[js.Any]).asInstanceOf[String]
}
