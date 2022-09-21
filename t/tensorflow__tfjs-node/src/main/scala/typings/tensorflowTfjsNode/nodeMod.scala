package typings.tensorflowTfjsNode

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  object node {
    
    @JSImport("@tensorflow/tfjs-node/dist/node", "node")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.decodeBmp")
    @js.native
    def decodeBmp: js.Function2[/* contents */ js.typedarray.Uint8Array, /* channels */ js.UndefOr[Double], Tensor3D] = js.native
    inline def decodeBmp(contents: js.typedarray.Uint8Array): Tensor3D = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeBmp")(contents.asInstanceOf[js.Any]).asInstanceOf[Tensor3D]
    inline def decodeBmp(contents: js.typedarray.Uint8Array, channels: Double): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeBmp")(contents.asInstanceOf[js.Any], channels.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
    inline def decodeBmp_=(
      x: js.Function2[/* contents */ js.typedarray.Uint8Array, /* channels */ js.UndefOr[Double], Tensor3D]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodeBmp")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.decodeGif")
    @js.native
    def decodeGif: js.Function1[/* contents */ js.typedarray.Uint8Array, Tensor4D] = js.native
    inline def decodeGif(contents: js.typedarray.Uint8Array): Tensor4D = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeGif")(contents.asInstanceOf[js.Any]).asInstanceOf[Tensor4D]
    inline def decodeGif_=(x: js.Function1[/* contents */ js.typedarray.Uint8Array, Tensor4D]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodeGif")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.decodeImage")
    @js.native
    def decodeImage: js.Function4[
        /* content */ js.typedarray.Uint8Array, 
        /* channels */ js.UndefOr[Double], 
        /* dtype */ js.UndefOr[String], 
        /* expandAnimations */ js.UndefOr[Boolean], 
        Tensor3D | Tensor4D
      ] = js.native
    inline def decodeImage(content: js.typedarray.Uint8Array): Tensor3D | Tensor4D = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeImage")(content.asInstanceOf[js.Any]).asInstanceOf[Tensor3D | Tensor4D]
    inline def decodeImage(content: js.typedarray.Uint8Array, channels: Double): Tensor3D | Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeImage")(content.asInstanceOf[js.Any], channels.asInstanceOf[js.Any])).asInstanceOf[Tensor3D | Tensor4D]
    inline def decodeImage(content: js.typedarray.Uint8Array, channels: Double, dtype: String): Tensor3D | Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeImage")(content.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor3D | Tensor4D]
    inline def decodeImage(content: js.typedarray.Uint8Array, channels: Double, dtype: String, expandAnimations: Boolean): Tensor3D | Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeImage")(content.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], expandAnimations.asInstanceOf[js.Any])).asInstanceOf[Tensor3D | Tensor4D]
    inline def decodeImage(content: js.typedarray.Uint8Array, channels: Double, dtype: Unit, expandAnimations: Boolean): Tensor3D | Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeImage")(content.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], expandAnimations.asInstanceOf[js.Any])).asInstanceOf[Tensor3D | Tensor4D]
    inline def decodeImage(content: js.typedarray.Uint8Array, channels: Unit, dtype: String): Tensor3D | Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeImage")(content.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor3D | Tensor4D]
    inline def decodeImage(content: js.typedarray.Uint8Array, channels: Unit, dtype: String, expandAnimations: Boolean): Tensor3D | Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeImage")(content.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], expandAnimations.asInstanceOf[js.Any])).asInstanceOf[Tensor3D | Tensor4D]
    inline def decodeImage(content: js.typedarray.Uint8Array, channels: Unit, dtype: Unit, expandAnimations: Boolean): Tensor3D | Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeImage")(content.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], expandAnimations.asInstanceOf[js.Any])).asInstanceOf[Tensor3D | Tensor4D]
    inline def decodeImage_=(
      x: js.Function4[
          /* content */ js.typedarray.Uint8Array, 
          /* channels */ js.UndefOr[Double], 
          /* dtype */ js.UndefOr[String], 
          /* expandAnimations */ js.UndefOr[Boolean], 
          Tensor3D | Tensor4D
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodeImage")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.decodeJpeg")
    @js.native
    def decodeJpeg: js.Function7[
        /* contents */ js.typedarray.Uint8Array, 
        /* channels */ js.UndefOr[Double], 
        /* ratio */ js.UndefOr[Double], 
        /* fancyUpscaling */ js.UndefOr[Boolean], 
        /* tryRecoverTruncated */ js.UndefOr[Boolean], 
        /* acceptableFraction */ js.UndefOr[Double], 
        /* dctMethod */ js.UndefOr[String], 
        Tensor3D
      ] = js.native
    inline def decodeJpeg(
      contents: js.typedarray.Uint8Array,
      channels: js.UndefOr[Double],
      ratio: js.UndefOr[Double],
      fancyUpscaling: js.UndefOr[Boolean],
      tryRecoverTruncated: js.UndefOr[Boolean],
      acceptableFraction: js.UndefOr[Double],
      dctMethod: js.UndefOr[String]
    ): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeJpeg")(contents.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], ratio.asInstanceOf[js.Any], fancyUpscaling.asInstanceOf[js.Any], tryRecoverTruncated.asInstanceOf[js.Any], acceptableFraction.asInstanceOf[js.Any], dctMethod.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
    inline def decodeJpeg_=(
      x: js.Function7[
          /* contents */ js.typedarray.Uint8Array, 
          /* channels */ js.UndefOr[Double], 
          /* ratio */ js.UndefOr[Double], 
          /* fancyUpscaling */ js.UndefOr[Boolean], 
          /* tryRecoverTruncated */ js.UndefOr[Boolean], 
          /* acceptableFraction */ js.UndefOr[Double], 
          /* dctMethod */ js.UndefOr[String], 
          Tensor3D
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodeJpeg")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.decodePng")
    @js.native
    def decodePng: js.Function3[
        /* contents */ js.typedarray.Uint8Array, 
        /* channels */ js.UndefOr[Double], 
        /* dtype */ js.UndefOr[String], 
        Tensor3D
      ] = js.native
    inline def decodePng(contents: js.typedarray.Uint8Array): Tensor3D = ^.asInstanceOf[js.Dynamic].applyDynamic("decodePng")(contents.asInstanceOf[js.Any]).asInstanceOf[Tensor3D]
    inline def decodePng(contents: js.typedarray.Uint8Array, channels: Double): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("decodePng")(contents.asInstanceOf[js.Any], channels.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
    inline def decodePng(contents: js.typedarray.Uint8Array, channels: Double, dtype: String): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("decodePng")(contents.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
    inline def decodePng(contents: js.typedarray.Uint8Array, channels: Unit, dtype: String): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("decodePng")(contents.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
    inline def decodePng_=(
      x: js.Function3[
          /* contents */ js.typedarray.Uint8Array, 
          /* channels */ js.UndefOr[Double], 
          /* dtype */ js.UndefOr[String], 
          Tensor3D
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodePng")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.encodeJpeg")
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
        js.Promise[js.typedarray.Uint8Array]
      ] = js.native
    inline def encodeJpeg(
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
    ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeJpeg")(image.asInstanceOf[js.Any], format.asInstanceOf[js.Any], quality.asInstanceOf[js.Any], progressive.asInstanceOf[js.Any], optimizeSize.asInstanceOf[js.Any], chromaDownsampling.asInstanceOf[js.Any], densityUnit.asInstanceOf[js.Any], xDensity.asInstanceOf[js.Any], yDensity.asInstanceOf[js.Any], xmpMetadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
    inline def encodeJpeg_=(
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
          js.Promise[js.typedarray.Uint8Array]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encodeJpeg")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.encodePng")
    @js.native
    def encodePng: js.Function2[
        /* image */ Tensor3D, 
        /* compression */ js.UndefOr[Double], 
        js.Promise[js.typedarray.Uint8Array]
      ] = js.native
    inline def encodePng(image: Tensor3D): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("encodePng")(image.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
    inline def encodePng(image: Tensor3D, compression: Double): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodePng")(image.asInstanceOf[js.Any], compression.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
    inline def encodePng_=(
      x: js.Function2[
          /* image */ Tensor3D, 
          /* compression */ js.UndefOr[Double], 
          js.Promise[js.typedarray.Uint8Array]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encodePng")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.getMetaGraphsFromSavedModel")
    @js.native
    def getMetaGraphsFromSavedModel: js.Function1[/* path */ String, js.Promise[js.Array[MetaGraph]]] = js.native
    inline def getMetaGraphsFromSavedModel(path: String): js.Promise[js.Array[MetaGraph]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetaGraphsFromSavedModel")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[MetaGraph]]]
    inline def getMetaGraphsFromSavedModel_=(x: js.Function1[/* path */ String, js.Promise[js.Array[MetaGraph]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getMetaGraphsFromSavedModel")(x.asInstanceOf[js.Any])
    
    inline def getNumOfSavedModels(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumOfSavedModels")().asInstanceOf[Double]
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.getNumOfSavedModels")
    @js.native
    def getNumOfSavedModels_Fnode: js.Function0[Double] = js.native
    
    inline def getNumOfSavedModels_Fnode_=(x: js.Function0[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getNumOfSavedModels")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.loadSavedModel")
    @js.native
    def loadSavedModel: js.Function3[
        /* path */ String, 
        /* tags */ js.UndefOr[js.Array[String]], 
        /* signature */ js.UndefOr[String], 
        js.Promise[TFSavedModel]
      ] = js.native
    inline def loadSavedModel(path: String): js.Promise[TFSavedModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSavedModel")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TFSavedModel]]
    inline def loadSavedModel(path: String, tags: js.Array[String]): js.Promise[TFSavedModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSavedModel")(path.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TFSavedModel]]
    inline def loadSavedModel(path: String, tags: js.Array[String], signature: String): js.Promise[TFSavedModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSavedModel")(path.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TFSavedModel]]
    inline def loadSavedModel(path: String, tags: Unit, signature: String): js.Promise[TFSavedModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSavedModel")(path.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TFSavedModel]]
    inline def loadSavedModel_=(
      x: js.Function3[
          /* path */ String, 
          /* tags */ js.UndefOr[js.Array[String]], 
          /* signature */ js.UndefOr[String], 
          js.Promise[TFSavedModel]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadSavedModel")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.summaryFileWriter")
    @js.native
    def summaryFileWriter: js.Function4[
        /* logdir */ String, 
        /* maxQueue */ js.UndefOr[Double], 
        /* flushMillis */ js.UndefOr[Double], 
        /* filenameSuffix */ js.UndefOr[String], 
        SummaryFileWriter_
      ] = js.native
    inline def summaryFileWriter(logdir: String): SummaryFileWriter_ = ^.asInstanceOf[js.Dynamic].applyDynamic("summaryFileWriter")(logdir.asInstanceOf[js.Any]).asInstanceOf[SummaryFileWriter_]
    inline def summaryFileWriter(logdir: String, maxQueue: Double): SummaryFileWriter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("summaryFileWriter")(logdir.asInstanceOf[js.Any], maxQueue.asInstanceOf[js.Any])).asInstanceOf[SummaryFileWriter_]
    inline def summaryFileWriter(logdir: String, maxQueue: Double, flushMillis: Double): SummaryFileWriter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("summaryFileWriter")(logdir.asInstanceOf[js.Any], maxQueue.asInstanceOf[js.Any], flushMillis.asInstanceOf[js.Any])).asInstanceOf[SummaryFileWriter_]
    inline def summaryFileWriter(logdir: String, maxQueue: Double, flushMillis: Double, filenameSuffix: String): SummaryFileWriter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("summaryFileWriter")(logdir.asInstanceOf[js.Any], maxQueue.asInstanceOf[js.Any], flushMillis.asInstanceOf[js.Any], filenameSuffix.asInstanceOf[js.Any])).asInstanceOf[SummaryFileWriter_]
    inline def summaryFileWriter(logdir: String, maxQueue: Double, flushMillis: Unit, filenameSuffix: String): SummaryFileWriter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("summaryFileWriter")(logdir.asInstanceOf[js.Any], maxQueue.asInstanceOf[js.Any], flushMillis.asInstanceOf[js.Any], filenameSuffix.asInstanceOf[js.Any])).asInstanceOf[SummaryFileWriter_]
    inline def summaryFileWriter(logdir: String, maxQueue: Unit, flushMillis: Double): SummaryFileWriter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("summaryFileWriter")(logdir.asInstanceOf[js.Any], maxQueue.asInstanceOf[js.Any], flushMillis.asInstanceOf[js.Any])).asInstanceOf[SummaryFileWriter_]
    inline def summaryFileWriter(logdir: String, maxQueue: Unit, flushMillis: Double, filenameSuffix: String): SummaryFileWriter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("summaryFileWriter")(logdir.asInstanceOf[js.Any], maxQueue.asInstanceOf[js.Any], flushMillis.asInstanceOf[js.Any], filenameSuffix.asInstanceOf[js.Any])).asInstanceOf[SummaryFileWriter_]
    inline def summaryFileWriter(logdir: String, maxQueue: Unit, flushMillis: Unit, filenameSuffix: String): SummaryFileWriter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("summaryFileWriter")(logdir.asInstanceOf[js.Any], maxQueue.asInstanceOf[js.Any], flushMillis.asInstanceOf[js.Any], filenameSuffix.asInstanceOf[js.Any])).asInstanceOf[SummaryFileWriter_]
    inline def summaryFileWriter_=(
      x: js.Function4[
          /* logdir */ String, 
          /* maxQueue */ js.UndefOr[Double], 
          /* flushMillis */ js.UndefOr[Double], 
          /* filenameSuffix */ js.UndefOr[String], 
          SummaryFileWriter_
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("summaryFileWriter")(x.asInstanceOf[js.Any])
    
    inline def tensorBoard(): TensorBoardCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("tensorBoard")().asInstanceOf[TensorBoardCallback]
    inline def tensorBoard(logdir: String): TensorBoardCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("tensorBoard")(logdir.asInstanceOf[js.Any]).asInstanceOf[TensorBoardCallback]
    inline def tensorBoard(logdir: String, args: TensorBoardCallbackArgs): TensorBoardCallback = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorBoard")(logdir.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[TensorBoardCallback]
    inline def tensorBoard(logdir: Unit, args: TensorBoardCallbackArgs): TensorBoardCallback = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorBoard")(logdir.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[TensorBoardCallback]
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.tensorBoard")
    @js.native
    def tensorBoard_Fnode: js.Function2[
        /* logdir */ js.UndefOr[String], 
        /* args */ js.UndefOr[TensorBoardCallbackArgs], 
        TensorBoardCallback
      ] = js.native
    
    inline def tensorBoard_Fnode_=(
      x: js.Function2[
          /* logdir */ js.UndefOr[String], 
          /* args */ js.UndefOr[TensorBoardCallbackArgs], 
          TensorBoardCallback
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tensorBoard")(x.asInstanceOf[js.Any])
  }
}
