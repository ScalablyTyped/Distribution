package typings.tensorflowTfjsNode.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayBuffer
import typings.std.File
import typings.std.RequestInit
import typings.tensorflowTfjsCore.anon.Data
import typings.tensorflowTfjsCore.routerRegistryMod.IORouter
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensor
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.typesMod.IOHandler
import typings.tensorflowTfjsCore.typesMod.LoadOptions
import typings.tensorflowTfjsCore.typesMod.ModelArtifacts
import typings.tensorflowTfjsCore.typesMod.ModelArtifactsInfo
import typings.tensorflowTfjsCore.typesMod.SaveResult
import typings.tensorflowTfjsCore.typesMod.TrainingConfig
import typings.tensorflowTfjsCore.typesMod.WeightGroup
import typings.tensorflowTfjsCore.typesMod.WeightsManifestConfig
import typings.tensorflowTfjsCore.typesMod.WeightsManifestEntry
import typings.tensorflowTfjsNode.anon.FnCall
import typings.tensorflowTfjsNode.anon.FnCallManifestFilePathPrefixWeightNamesRequestInit
import typings.tensorflowTfjsNode.anon.FnCallModelArtifactsWeightSpecsWeightDataTrainingConfig
import typings.tensorflowTfjsNode.anon.FnCallTensorsGroup
import typings.tensorflowTfjsNode.fileSystemMod.NodeFileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object io {
  
  @JSImport("@tensorflow/tfjs-node", "io")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-node", "io.browserFiles")
  @js.native
  def browserFiles: js.Function1[/* files */ js.Array[File], IOHandler] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.browserFiles")
  @js.native
  def browserFiles(files: js.Array[File]): IOHandler = js.native
  @scala.inline
  def browserFiles_=(x: js.Function1[/* files */ js.Array[File], IOHandler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("browserFiles")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.browserHTTPRequest")
  @js.native
  def browserHTTPRequest: FnCall = js.native
  @JSImport("@tensorflow/tfjs-node", "io.browserHTTPRequest")
  @js.native
  def browserHTTPRequest(path: String): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-node", "io.browserHTTPRequest")
  @js.native
  def browserHTTPRequest(path: String, loadOptions: LoadOptions): IOHandler = js.native
  @scala.inline
  def browserHTTPRequest_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("browserHTTPRequest")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.concatenateArrayBuffers")
  @js.native
  def concatenateArrayBuffers: js.Function1[/* buffers */ js.Array[ArrayBuffer], ArrayBuffer] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.concatenateArrayBuffers")
  @js.native
  def concatenateArrayBuffers(buffers: js.Array[ArrayBuffer]): ArrayBuffer = js.native
  @scala.inline
  def concatenateArrayBuffers_=(x: js.Function1[/* buffers */ js.Array[ArrayBuffer], ArrayBuffer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("concatenateArrayBuffers")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.copyModel")
  @js.native
  def copyModel: js.Function2[/* sourceURL */ String, /* destURL */ String, js.Promise[ModelArtifactsInfo]] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.copyModel")
  @js.native
  def copyModel(sourceURL: String, destURL: String): js.Promise[ModelArtifactsInfo] = js.native
  @scala.inline
  def copyModel_=(x: js.Function2[/* sourceURL */ String, /* destURL */ String, js.Promise[ModelArtifactsInfo]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("copyModel")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.decodeWeights")
  @js.native
  def decodeWeights: js.Function2[/* buffer */ ArrayBuffer, /* specs */ js.Array[WeightsManifestEntry], NamedTensorMap] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.decodeWeights")
  @js.native
  def decodeWeights(buffer: ArrayBuffer, specs: js.Array[WeightsManifestEntry]): NamedTensorMap = js.native
  @scala.inline
  def decodeWeights_=(
    x: js.Function2[/* buffer */ ArrayBuffer, /* specs */ js.Array[WeightsManifestEntry], NamedTensorMap]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodeWeights")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.encodeWeights")
  @js.native
  def encodeWeights: FnCallTensorsGroup = js.native
  @JSImport("@tensorflow/tfjs-node", "io.encodeWeights")
  @js.native
  def encodeWeights(tensors: js.Array[NamedTensor]): js.Promise[Data] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.encodeWeights")
  @js.native
  def encodeWeights(tensors: js.Array[NamedTensor], group: WeightGroup): js.Promise[Data] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.encodeWeights")
  @js.native
  def encodeWeights(tensors: NamedTensorMap): js.Promise[Data] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.encodeWeights")
  @js.native
  def encodeWeights(tensors: NamedTensorMap, group: WeightGroup): js.Promise[Data] = js.native
  @scala.inline
  def encodeWeights_=(x: FnCallTensorsGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encodeWeights")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.fileSystem")
  @js.native
  def fileSystem: js.Function1[/* path */ String | js.Array[String], NodeFileSystem] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.fileSystem")
  @js.native
  def fileSystem(path: String): NodeFileSystem = js.native
  @JSImport("@tensorflow/tfjs-node", "io.fileSystem")
  @js.native
  def fileSystem(path: js.Array[String]): NodeFileSystem = js.native
  @scala.inline
  def fileSystem_=(x: js.Function1[/* path */ String | js.Array[String], NodeFileSystem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fileSystem")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.fromMemory")
  @js.native
  def fromMemory: FnCallModelArtifactsWeightSpecsWeightDataTrainingConfig = js.native
  @JSImport("@tensorflow/tfjs-node", "io.fromMemory")
  @js.native
  def fromMemory(modelArtifacts: js.Object): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-node", "io.fromMemory")
  @js.native
  def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.UndefOr[scala.Nothing],
    weightData: js.UndefOr[scala.Nothing],
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-node", "io.fromMemory")
  @js.native
  def fromMemory(modelArtifacts: js.Object, weightSpecs: js.UndefOr[scala.Nothing], weightData: ArrayBuffer): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-node", "io.fromMemory")
  @js.native
  def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.UndefOr[scala.Nothing],
    weightData: ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-node", "io.fromMemory")
  @js.native
  def fromMemory(modelArtifacts: js.Object, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-node", "io.fromMemory")
  @js.native
  def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.UndefOr[scala.Nothing],
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-node", "io.fromMemory")
  @js.native
  def fromMemory(modelArtifacts: js.Object, weightSpecs: js.Array[WeightsManifestEntry], weightData: ArrayBuffer): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-node", "io.fromMemory")
  @js.native
  def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-node", "io.fromMemory")
  @js.native
  def fromMemory(modelArtifacts: ModelArtifacts): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-node", "io.fromMemory")
  @js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.UndefOr[scala.Nothing],
    weightData: js.UndefOr[scala.Nothing],
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-node", "io.fromMemory")
  @js.native
  def fromMemory(modelArtifacts: ModelArtifacts, weightSpecs: js.UndefOr[scala.Nothing], weightData: ArrayBuffer): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-node", "io.fromMemory")
  @js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.UndefOr[scala.Nothing],
    weightData: ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-node", "io.fromMemory")
  @js.native
  def fromMemory(modelArtifacts: ModelArtifacts, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-node", "io.fromMemory")
  @js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.UndefOr[scala.Nothing],
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-node", "io.fromMemory")
  @js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: ArrayBuffer
  ): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-node", "io.fromMemory")
  @js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  @scala.inline
  def fromMemory_=(x: FnCallModelArtifactsWeightSpecsWeightDataTrainingConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromMemory")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.getLoadHandlers")
  @js.native
  def getLoadHandlers(url: String): js.Array[IOHandler] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.getLoadHandlers")
  @js.native
  def getLoadHandlers(url: String, loadOptions: LoadOptions): js.Array[IOHandler] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.getLoadHandlers")
  @js.native
  def getLoadHandlers(url: js.Array[String]): js.Array[IOHandler] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.getLoadHandlers")
  @js.native
  def getLoadHandlers(url: js.Array[String], loadOptions: LoadOptions): js.Array[IOHandler] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "io.getModelArtifactsInfoForJSON")
  @js.native
  def getModelArtifactsInfoForJSON: js.Function1[/* modelArtifacts */ ModelArtifacts, ModelArtifactsInfo] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.getModelArtifactsInfoForJSON")
  @js.native
  def getModelArtifactsInfoForJSON(modelArtifacts: ModelArtifacts): ModelArtifactsInfo = js.native
  @scala.inline
  def getModelArtifactsInfoForJSON_=(x: js.Function1[/* modelArtifacts */ ModelArtifacts, ModelArtifactsInfo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getModelArtifactsInfoForJSON")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.getSaveHandlers")
  @js.native
  def getSaveHandlers(url: String): js.Array[IOHandler] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.getSaveHandlers")
  @js.native
  def getSaveHandlers(url: js.Array[String]): js.Array[IOHandler] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "io.http")
  @js.native
  def http: FnCall = js.native
  @JSImport("@tensorflow/tfjs-node", "io.http")
  @js.native
  def http(path: String): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-node", "io.http")
  @js.native
  def http(path: String, loadOptions: LoadOptions): IOHandler = js.native
  @scala.inline
  def http_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("http")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.isHTTPScheme")
  @js.native
  def isHTTPScheme: js.Function1[/* url */ String, Boolean] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.isHTTPScheme")
  @js.native
  def isHTTPScheme(url: String): Boolean = js.native
  @scala.inline
  def isHTTPScheme_=(x: js.Function1[/* url */ String, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isHTTPScheme")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.listModels")
  @js.native
  def listModels(): js.Promise[StringDictionary[ModelArtifactsInfo]] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.listModels")
  @js.native
  def listModels_Fio: js.Function0[js.Promise[StringDictionary[ModelArtifactsInfo]]] = js.native
  
  @scala.inline
  def listModels_Fio_=(x: js.Function0[js.Promise[StringDictionary[ModelArtifactsInfo]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("listModels")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.loadWeights")
  @js.native
  def loadWeights: FnCallManifestFilePathPrefixWeightNamesRequestInit = js.native
  @JSImport("@tensorflow/tfjs-node", "io.loadWeights")
  @js.native
  def loadWeights(manifest: WeightsManifestConfig): js.Promise[NamedTensorMap] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.loadWeights")
  @js.native
  def loadWeights(
    manifest: WeightsManifestConfig,
    filePathPrefix: js.UndefOr[scala.Nothing],
    weightNames: js.UndefOr[scala.Nothing],
    requestInit: RequestInit
  ): js.Promise[NamedTensorMap] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.loadWeights")
  @js.native
  def loadWeights(
    manifest: WeightsManifestConfig,
    filePathPrefix: js.UndefOr[scala.Nothing],
    weightNames: js.Array[String]
  ): js.Promise[NamedTensorMap] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.loadWeights")
  @js.native
  def loadWeights(
    manifest: WeightsManifestConfig,
    filePathPrefix: js.UndefOr[scala.Nothing],
    weightNames: js.Array[String],
    requestInit: RequestInit
  ): js.Promise[NamedTensorMap] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.loadWeights")
  @js.native
  def loadWeights(manifest: WeightsManifestConfig, filePathPrefix: String): js.Promise[NamedTensorMap] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.loadWeights")
  @js.native
  def loadWeights(
    manifest: WeightsManifestConfig,
    filePathPrefix: String,
    weightNames: js.UndefOr[scala.Nothing],
    requestInit: RequestInit
  ): js.Promise[NamedTensorMap] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.loadWeights")
  @js.native
  def loadWeights(manifest: WeightsManifestConfig, filePathPrefix: String, weightNames: js.Array[String]): js.Promise[NamedTensorMap] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.loadWeights")
  @js.native
  def loadWeights(
    manifest: WeightsManifestConfig,
    filePathPrefix: String,
    weightNames: js.Array[String],
    requestInit: RequestInit
  ): js.Promise[NamedTensorMap] = js.native
  @scala.inline
  def loadWeights_=(x: FnCallManifestFilePathPrefixWeightNamesRequestInit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadWeights")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.moveModel")
  @js.native
  def moveModel: js.Function2[/* sourceURL */ String, /* destURL */ String, js.Promise[ModelArtifactsInfo]] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.moveModel")
  @js.native
  def moveModel(sourceURL: String, destURL: String): js.Promise[ModelArtifactsInfo] = js.native
  @scala.inline
  def moveModel_=(x: js.Function2[/* sourceURL */ String, /* destURL */ String, js.Promise[ModelArtifactsInfo]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moveModel")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.nodeHTTPRequest")
  @js.native
  def nodeHTTPRequest: js.Function3[
    /* path */ String, 
    /* requestInit */ js.UndefOr[RequestInit], 
    /* weightPathPrefix */ js.UndefOr[String], 
    IOHandler
  ] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.nodeHTTPRequest")
  @js.native
  def nodeHTTPRequest(path: String): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-node", "io.nodeHTTPRequest")
  @js.native
  def nodeHTTPRequest(path: String, requestInit: js.UndefOr[scala.Nothing], weightPathPrefix: String): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-node", "io.nodeHTTPRequest")
  @js.native
  def nodeHTTPRequest(path: String, requestInit: RequestInit): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-node", "io.nodeHTTPRequest")
  @js.native
  def nodeHTTPRequest(path: String, requestInit: RequestInit, weightPathPrefix: String): IOHandler = js.native
  @scala.inline
  def nodeHTTPRequest_=(
    x: js.Function3[
      /* path */ String, 
      /* requestInit */ js.UndefOr[RequestInit], 
      /* weightPathPrefix */ js.UndefOr[String], 
      IOHandler
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeHTTPRequest")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.registerLoadRouter")
  @js.native
  def registerLoadRouter(loudRouter: IORouter): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-node", "io.registerSaveRouter")
  @js.native
  def registerSaveRouter(loudRouter: IORouter): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-node", "io.removeModel")
  @js.native
  def removeModel: js.Function1[/* url */ String, js.Promise[ModelArtifactsInfo]] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.removeModel")
  @js.native
  def removeModel(url: String): js.Promise[ModelArtifactsInfo] = js.native
  @scala.inline
  def removeModel_=(x: js.Function1[/* url */ String, js.Promise[ModelArtifactsInfo]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeModel")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.weightsLoaderFactory")
  @js.native
  def weightsLoaderFactory: js.Function1[
    /* fetchWeightsFunction */ js.Function1[/* fetchUrls */ js.Array[String], js.Promise[js.Array[ArrayBuffer]]], 
    js.Function3[
      /* manifest */ WeightsManifestConfig, 
      /* filePathPrefix */ js.UndefOr[String], 
      /* weightNames */ js.UndefOr[js.Array[String]], 
      js.Promise[NamedTensorMap]
    ]
  ] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.weightsLoaderFactory")
  @js.native
  def weightsLoaderFactory(
    fetchWeightsFunction: js.Function1[/* fetchUrls */ js.Array[String], js.Promise[js.Array[ArrayBuffer]]]
  ): js.Function3[
    /* manifest */ WeightsManifestConfig, 
    /* filePathPrefix */ js.UndefOr[String], 
    /* weightNames */ js.UndefOr[js.Array[String]], 
    js.Promise[NamedTensorMap]
  ] = js.native
  @scala.inline
  def weightsLoaderFactory_=(
    x: js.Function1[
      /* fetchWeightsFunction */ js.Function1[/* fetchUrls */ js.Array[String], js.Promise[js.Array[ArrayBuffer]]], 
      js.Function3[
        /* manifest */ WeightsManifestConfig, 
        /* filePathPrefix */ js.UndefOr[String], 
        /* weightNames */ js.UndefOr[js.Array[String]], 
        js.Promise[NamedTensorMap]
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weightsLoaderFactory")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.withSaveHandler")
  @js.native
  def withSaveHandler: js.Function1[
    /* saveHandler */ js.Function1[/* artifacts */ ModelArtifacts, js.Promise[SaveResult]], 
    IOHandler
  ] = js.native
  @JSImport("@tensorflow/tfjs-node", "io.withSaveHandler")
  @js.native
  def withSaveHandler(saveHandler: js.Function1[/* artifacts */ ModelArtifacts, js.Promise[SaveResult]]): IOHandler = js.native
  @scala.inline
  def withSaveHandler_=(
    x: js.Function1[
      /* saveHandler */ js.Function1[/* artifacts */ ModelArtifacts, js.Promise[SaveResult]], 
      IOHandler
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("withSaveHandler")(x.asInstanceOf[js.Any])
}
