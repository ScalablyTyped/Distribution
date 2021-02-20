package typings.tensorflowTfjsNode.mod

import typings.std.Uint8Array
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.modelTypesMod.MetaGraph
import typings.tensorflowTfjsNode.callbacksMod.TensorBoardCallback
import typings.tensorflowTfjsNode.callbacksMod.TensorBoardCallbackArgs
import typings.tensorflowTfjsNode.savedModelMod.TFSavedModel
import typings.tensorflowTfjsNode.tensorboardMod.SummaryFileWriter_
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings._empty
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.cm
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.grayscale
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.in
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.rgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object node {
  
  @JSImport("@tensorflow/tfjs-node", "node")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-node", "node.decodeBmp")
  @js.native
  def decodeBmp: js.Function2[/* contents */ Uint8Array, /* channels */ js.UndefOr[Double], Tensor3D] = js.native
  @JSImport("@tensorflow/tfjs-node", "node.decodeBmp")
  @js.native
  def decodeBmp(contents: Uint8Array): Tensor3D = js.native
  @JSImport("@tensorflow/tfjs-node", "node.decodeBmp")
  @js.native
  def decodeBmp(contents: Uint8Array, channels: Double): Tensor3D = js.native
  @scala.inline
  def decodeBmp_=(x: js.Function2[/* contents */ Uint8Array, /* channels */ js.UndefOr[Double], Tensor3D]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodeBmp")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "node.decodeGif")
  @js.native
  def decodeGif: js.Function1[/* contents */ Uint8Array, Tensor4D] = js.native
  @JSImport("@tensorflow/tfjs-node", "node.decodeGif")
  @js.native
  def decodeGif(contents: Uint8Array): Tensor4D = js.native
  @scala.inline
  def decodeGif_=(x: js.Function1[/* contents */ Uint8Array, Tensor4D]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodeGif")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "node.decodeImage")
  @js.native
  def decodeImage: js.Function4[
    /* content */ Uint8Array, 
    /* channels */ js.UndefOr[Double], 
    /* dtype */ js.UndefOr[String], 
    /* expandAnimations */ js.UndefOr[Boolean], 
    Tensor3D | Tensor4D
  ] = js.native
  @JSImport("@tensorflow/tfjs-node", "node.decodeImage")
  @js.native
  def decodeImage(content: Uint8Array): Tensor3D | Tensor4D = js.native
  @JSImport("@tensorflow/tfjs-node", "node.decodeImage")
  @js.native
  def decodeImage(
    content: Uint8Array,
    channels: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[scala.Nothing],
    expandAnimations: Boolean
  ): Tensor3D | Tensor4D = js.native
  @JSImport("@tensorflow/tfjs-node", "node.decodeImage")
  @js.native
  def decodeImage(content: Uint8Array, channels: js.UndefOr[scala.Nothing], dtype: String): Tensor3D | Tensor4D = js.native
  @JSImport("@tensorflow/tfjs-node", "node.decodeImage")
  @js.native
  def decodeImage(content: Uint8Array, channels: js.UndefOr[scala.Nothing], dtype: String, expandAnimations: Boolean): Tensor3D | Tensor4D = js.native
  @JSImport("@tensorflow/tfjs-node", "node.decodeImage")
  @js.native
  def decodeImage(content: Uint8Array, channels: Double): Tensor3D | Tensor4D = js.native
  @JSImport("@tensorflow/tfjs-node", "node.decodeImage")
  @js.native
  def decodeImage(content: Uint8Array, channels: Double, dtype: js.UndefOr[scala.Nothing], expandAnimations: Boolean): Tensor3D | Tensor4D = js.native
  @JSImport("@tensorflow/tfjs-node", "node.decodeImage")
  @js.native
  def decodeImage(content: Uint8Array, channels: Double, dtype: String): Tensor3D | Tensor4D = js.native
  @JSImport("@tensorflow/tfjs-node", "node.decodeImage")
  @js.native
  def decodeImage(content: Uint8Array, channels: Double, dtype: String, expandAnimations: Boolean): Tensor3D | Tensor4D = js.native
  @scala.inline
  def decodeImage_=(
    x: js.Function4[
      /* content */ Uint8Array, 
      /* channels */ js.UndefOr[Double], 
      /* dtype */ js.UndefOr[String], 
      /* expandAnimations */ js.UndefOr[Boolean], 
      Tensor3D | Tensor4D
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodeImage")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "node.decodeJpeg")
  @js.native
  def decodeJpeg: js.Function7[
    /* contents */ Uint8Array, 
    /* channels */ js.UndefOr[Double], 
    /* ratio */ js.UndefOr[Double], 
    /* fancyUpscaling */ js.UndefOr[Boolean], 
    /* tryRecoverTruncated */ js.UndefOr[Boolean], 
    /* acceptableFraction */ js.UndefOr[Double], 
    /* dctMethod */ js.UndefOr[String], 
    Tensor3D
  ] = js.native
  @JSImport("@tensorflow/tfjs-node", "node.decodeJpeg")
  @js.native
  def decodeJpeg(
    contents: Uint8Array,
    channels: js.UndefOr[Double],
    ratio: js.UndefOr[Double],
    fancyUpscaling: js.UndefOr[Boolean],
    tryRecoverTruncated: js.UndefOr[Boolean],
    acceptableFraction: js.UndefOr[Double],
    dctMethod: js.UndefOr[String]
  ): Tensor3D = js.native
  @scala.inline
  def decodeJpeg_=(
    x: js.Function7[
      /* contents */ Uint8Array, 
      /* channels */ js.UndefOr[Double], 
      /* ratio */ js.UndefOr[Double], 
      /* fancyUpscaling */ js.UndefOr[Boolean], 
      /* tryRecoverTruncated */ js.UndefOr[Boolean], 
      /* acceptableFraction */ js.UndefOr[Double], 
      /* dctMethod */ js.UndefOr[String], 
      Tensor3D
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodeJpeg")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "node.decodePng")
  @js.native
  def decodePng: js.Function3[
    /* contents */ Uint8Array, 
    /* channels */ js.UndefOr[Double], 
    /* dtype */ js.UndefOr[String], 
    Tensor3D
  ] = js.native
  @JSImport("@tensorflow/tfjs-node", "node.decodePng")
  @js.native
  def decodePng(contents: Uint8Array): Tensor3D = js.native
  @JSImport("@tensorflow/tfjs-node", "node.decodePng")
  @js.native
  def decodePng(contents: Uint8Array, channels: js.UndefOr[scala.Nothing], dtype: String): Tensor3D = js.native
  @JSImport("@tensorflow/tfjs-node", "node.decodePng")
  @js.native
  def decodePng(contents: Uint8Array, channels: Double): Tensor3D = js.native
  @JSImport("@tensorflow/tfjs-node", "node.decodePng")
  @js.native
  def decodePng(contents: Uint8Array, channels: Double, dtype: String): Tensor3D = js.native
  @scala.inline
  def decodePng_=(
    x: js.Function3[
      /* contents */ Uint8Array, 
      /* channels */ js.UndefOr[Double], 
      /* dtype */ js.UndefOr[String], 
      Tensor3D
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodePng")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "node.encodeJpeg")
  @js.native
  def encodeJpeg: js.Function10[
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
  @JSImport("@tensorflow/tfjs-node", "node.encodeJpeg")
  @js.native
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
  ): js.Promise[Uint8Array] = js.native
  @scala.inline
  def encodeJpeg_=(
    x: js.Function10[
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
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encodeJpeg")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "node.encodePng")
  @js.native
  def encodePng: js.Function2[/* image */ Tensor3D, /* compression */ js.UndefOr[Double], js.Promise[Uint8Array]] = js.native
  @JSImport("@tensorflow/tfjs-node", "node.encodePng")
  @js.native
  def encodePng(image: Tensor3D): js.Promise[Uint8Array] = js.native
  @JSImport("@tensorflow/tfjs-node", "node.encodePng")
  @js.native
  def encodePng(image: Tensor3D, compression: Double): js.Promise[Uint8Array] = js.native
  @scala.inline
  def encodePng_=(
    x: js.Function2[/* image */ Tensor3D, /* compression */ js.UndefOr[Double], js.Promise[Uint8Array]]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encodePng")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "node.getMetaGraphsFromSavedModel")
  @js.native
  def getMetaGraphsFromSavedModel: js.Function1[/* path */ String, js.Promise[js.Array[MetaGraph]]] = js.native
  @JSImport("@tensorflow/tfjs-node", "node.getMetaGraphsFromSavedModel")
  @js.native
  def getMetaGraphsFromSavedModel(path: String): js.Promise[js.Array[MetaGraph]] = js.native
  @scala.inline
  def getMetaGraphsFromSavedModel_=(x: js.Function1[/* path */ String, js.Promise[js.Array[MetaGraph]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getMetaGraphsFromSavedModel")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "node.getNumOfSavedModels")
  @js.native
  def getNumOfSavedModels(): Double = js.native
  @JSImport("@tensorflow/tfjs-node", "node.getNumOfSavedModels")
  @js.native
  def getNumOfSavedModels_Fnode: js.Function0[Double] = js.native
  
  @scala.inline
  def getNumOfSavedModels_Fnode_=(x: js.Function0[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getNumOfSavedModels")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "node.loadSavedModel")
  @js.native
  def loadSavedModel: js.Function3[
    /* path */ String, 
    /* tags */ js.UndefOr[js.Array[String]], 
    /* signature */ js.UndefOr[String], 
    js.Promise[TFSavedModel]
  ] = js.native
  @JSImport("@tensorflow/tfjs-node", "node.loadSavedModel")
  @js.native
  def loadSavedModel(path: String): js.Promise[TFSavedModel] = js.native
  @JSImport("@tensorflow/tfjs-node", "node.loadSavedModel")
  @js.native
  def loadSavedModel(path: String, tags: js.UndefOr[scala.Nothing], signature: String): js.Promise[TFSavedModel] = js.native
  @JSImport("@tensorflow/tfjs-node", "node.loadSavedModel")
  @js.native
  def loadSavedModel(path: String, tags: js.Array[String]): js.Promise[TFSavedModel] = js.native
  @JSImport("@tensorflow/tfjs-node", "node.loadSavedModel")
  @js.native
  def loadSavedModel(path: String, tags: js.Array[String], signature: String): js.Promise[TFSavedModel] = js.native
  @scala.inline
  def loadSavedModel_=(
    x: js.Function3[
      /* path */ String, 
      /* tags */ js.UndefOr[js.Array[String]], 
      /* signature */ js.UndefOr[String], 
      js.Promise[TFSavedModel]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadSavedModel")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "node.summaryFileWriter")
  @js.native
  def summaryFileWriter: js.Function4[
    /* logdir */ String, 
    /* maxQueue */ js.UndefOr[Double], 
    /* flushMillis */ js.UndefOr[Double], 
    /* filenameSuffix */ js.UndefOr[String], 
    SummaryFileWriter_
  ] = js.native
  @JSImport("@tensorflow/tfjs-node", "node.summaryFileWriter")
  @js.native
  def summaryFileWriter(logdir: String): SummaryFileWriter_ = js.native
  @JSImport("@tensorflow/tfjs-node", "node.summaryFileWriter")
  @js.native
  def summaryFileWriter(
    logdir: String,
    maxQueue: js.UndefOr[scala.Nothing],
    flushMillis: js.UndefOr[scala.Nothing],
    filenameSuffix: String
  ): SummaryFileWriter_ = js.native
  @JSImport("@tensorflow/tfjs-node", "node.summaryFileWriter")
  @js.native
  def summaryFileWriter(logdir: String, maxQueue: js.UndefOr[scala.Nothing], flushMillis: Double): SummaryFileWriter_ = js.native
  @JSImport("@tensorflow/tfjs-node", "node.summaryFileWriter")
  @js.native
  def summaryFileWriter(logdir: String, maxQueue: js.UndefOr[scala.Nothing], flushMillis: Double, filenameSuffix: String): SummaryFileWriter_ = js.native
  @JSImport("@tensorflow/tfjs-node", "node.summaryFileWriter")
  @js.native
  def summaryFileWriter(logdir: String, maxQueue: Double): SummaryFileWriter_ = js.native
  @JSImport("@tensorflow/tfjs-node", "node.summaryFileWriter")
  @js.native
  def summaryFileWriter(logdir: String, maxQueue: Double, flushMillis: js.UndefOr[scala.Nothing], filenameSuffix: String): SummaryFileWriter_ = js.native
  @JSImport("@tensorflow/tfjs-node", "node.summaryFileWriter")
  @js.native
  def summaryFileWriter(logdir: String, maxQueue: Double, flushMillis: Double): SummaryFileWriter_ = js.native
  @JSImport("@tensorflow/tfjs-node", "node.summaryFileWriter")
  @js.native
  def summaryFileWriter(logdir: String, maxQueue: Double, flushMillis: Double, filenameSuffix: String): SummaryFileWriter_ = js.native
  @scala.inline
  def summaryFileWriter_=(
    x: js.Function4[
      /* logdir */ String, 
      /* maxQueue */ js.UndefOr[Double], 
      /* flushMillis */ js.UndefOr[Double], 
      /* filenameSuffix */ js.UndefOr[String], 
      SummaryFileWriter_
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("summaryFileWriter")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "node.tensorBoard")
  @js.native
  def tensorBoard(): TensorBoardCallback = js.native
  @JSImport("@tensorflow/tfjs-node", "node.tensorBoard")
  @js.native
  def tensorBoard(logdir: js.UndefOr[scala.Nothing], args: TensorBoardCallbackArgs): TensorBoardCallback = js.native
  @JSImport("@tensorflow/tfjs-node", "node.tensorBoard")
  @js.native
  def tensorBoard(logdir: String): TensorBoardCallback = js.native
  @JSImport("@tensorflow/tfjs-node", "node.tensorBoard")
  @js.native
  def tensorBoard(logdir: String, args: TensorBoardCallbackArgs): TensorBoardCallback = js.native
  @JSImport("@tensorflow/tfjs-node", "node.tensorBoard")
  @js.native
  def tensorBoard_Fnode: js.Function2[
    /* logdir */ js.UndefOr[String], 
    /* args */ js.UndefOr[TensorBoardCallbackArgs], 
    TensorBoardCallback
  ] = js.native
  
  @scala.inline
  def tensorBoard_Fnode_=(
    x: js.Function2[
      /* logdir */ js.UndefOr[String], 
      /* args */ js.UndefOr[TensorBoardCallbackArgs], 
      TensorBoardCallback
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tensorBoard")(x.asInstanceOf[js.Any])
}
