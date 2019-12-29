package typings.atTensorflowTfjsDashNode

import typings.atTensorflowTfjsDashCore.distModelUnderscoreTypesMod.MetaGraph
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings._empty
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.cm
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.grayscale
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.in
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.rgb
import typings.atTensorflowTfjsDashNode.distCallbacksMod.TensorBoardCallback
import typings.atTensorflowTfjsDashNode.distCallbacksMod.TensorBoardCallbackArgs
import typings.atTensorflowTfjsDashNode.distSavedUnderscoreModelMod.TFSavedModel
import typings.atTensorflowTfjsDashNode.distTensorboardMod.SummaryFileWriter
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/node", JSImport.Namespace)
@js.native
object distNodeMod extends js.Object {
  @js.native
  object node extends js.Object {
    @JSName("decodeBmp")
    var decodeBmp_Original: js.Function2[/* contents */ Uint8Array, /* channels */ js.UndefOr[Double], Tensor3D] = js.native
    @JSName("decodeGif")
    var decodeGif_Original: js.Function1[/* contents */ Uint8Array, Tensor4D] = js.native
    @JSName("decodeImage")
    var decodeImage_Original: js.Function4[
        /* content */ Uint8Array, 
        /* channels */ js.UndefOr[Double], 
        /* dtype */ js.UndefOr[String], 
        /* expandAnimations */ js.UndefOr[Boolean], 
        Tensor3D | Tensor4D
      ] = js.native
    @JSName("decodeJpeg")
    var decodeJpeg_Original: js.Function7[
        /* contents */ Uint8Array, 
        /* channels */ js.UndefOr[Double], 
        /* ratio */ js.UndefOr[Double], 
        /* fancyUpscaling */ js.UndefOr[Boolean], 
        /* tryRecoverTruncated */ js.UndefOr[Boolean], 
        /* acceptableFraction */ js.UndefOr[Double], 
        /* dctMethod */ js.UndefOr[String], 
        Tensor3D
      ] = js.native
    @JSName("decodePng")
    var decodePng_Original: js.Function3[
        /* contents */ Uint8Array, 
        /* channels */ js.UndefOr[Double], 
        /* dtype */ js.UndefOr[String], 
        Tensor3D
      ] = js.native
    @JSName("encodeJpeg")
    var encodeJpeg_Original: js.Function10[
        /* image */ Tensor3D, 
        /* format */ js.UndefOr[_empty | grayscale | rgb], 
        /* quality */ js.UndefOr[Double], 
        /* progressive */ js.UndefOr[Boolean], 
        /* optimizeSize */ js.UndefOr[Boolean], 
        /* chromaDownsampling */ js.UndefOr[Boolean], 
        /* densityUnit */ js.UndefOr[in | cm], 
        /* xDensity */ js.UndefOr[Double], 
        /* yDensity */ js.UndefOr[Double], 
        /* xmpMetadata */ js.UndefOr[String], 
        js.Promise[Uint8Array]
      ] = js.native
    @JSName("encodePng")
    var encodePng_Original: js.Function2[/* image */ Tensor3D, /* compression */ js.UndefOr[Double], js.Promise[Uint8Array]] = js.native
    @JSName("getMetaGraphsFromSavedModel")
    var getMetaGraphsFromSavedModel_Original: js.Function1[/* path */ String, js.Promise[js.Array[MetaGraph]]] = js.native
    @JSName("loadSavedModel")
    var loadSavedModel_Original: js.Function3[
        /* path */ String, 
        /* tags */ js.UndefOr[js.Array[String]], 
        /* signature */ js.UndefOr[String], 
        js.Promise[TFSavedModel]
      ] = js.native
    @JSName("summaryFileWriter")
    var summaryFileWriter_Original: js.Function4[
        /* logdir */ String, 
        /* maxQueue */ js.UndefOr[Double], 
        /* flushMillis */ js.UndefOr[Double], 
        /* filenameSuffix */ js.UndefOr[String], 
        SummaryFileWriter
      ] = js.native
    @JSName("tensorBoard")
    var tensorBoard_Original: js.Function2[
        /* logdir */ js.UndefOr[String], 
        /* args */ js.UndefOr[TensorBoardCallbackArgs], 
        TensorBoardCallback
      ] = js.native
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
      format: js.UndefOr[_empty],
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
      format: js.UndefOr[_empty],
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
    def getMetaGraphsFromSavedModel(path: String): js.Promise[js.Array[MetaGraph]] = js.native
    def loadSavedModel(path: String): js.Promise[TFSavedModel] = js.native
    def loadSavedModel(path: String, tags: js.Array[String]): js.Promise[TFSavedModel] = js.native
    def loadSavedModel(path: String, tags: js.Array[String], signature: String): js.Promise[TFSavedModel] = js.native
    def summaryFileWriter(logdir: String): SummaryFileWriter = js.native
    def summaryFileWriter(logdir: String, maxQueue: Double): SummaryFileWriter = js.native
    def summaryFileWriter(logdir: String, maxQueue: Double, flushMillis: Double): SummaryFileWriter = js.native
    def summaryFileWriter(logdir: String, maxQueue: Double, flushMillis: Double, filenameSuffix: String): SummaryFileWriter = js.native
    def tensorBoard(): TensorBoardCallback = js.native
    def tensorBoard(logdir: String): TensorBoardCallback = js.native
    def tensorBoard(logdir: String, args: TensorBoardCallbackArgs): TensorBoardCallback = js.native
  }
  
}

