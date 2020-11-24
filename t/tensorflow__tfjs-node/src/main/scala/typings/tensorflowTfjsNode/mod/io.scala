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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-node", "io")
@js.native
object io extends js.Object {
  
  def browserFiles(files: js.Array[File]): IOHandler = js.native
  @JSName("browserFiles")
  var browserFiles_Original: js.Function1[/* files */ js.Array[File], IOHandler] = js.native
  
  def browserHTTPRequest(path: String): IOHandler = js.native
  def browserHTTPRequest(path: String, loadOptions: LoadOptions): IOHandler = js.native
  @JSName("browserHTTPRequest")
  var browserHTTPRequest_Original: FnCall = js.native
  
  def concatenateArrayBuffers(buffers: js.Array[ArrayBuffer]): ArrayBuffer = js.native
  @JSName("concatenateArrayBuffers")
  var concatenateArrayBuffers_Original: js.Function1[/* buffers */ js.Array[ArrayBuffer], ArrayBuffer] = js.native
  
  def copyModel(sourceURL: String, destURL: String): js.Promise[ModelArtifactsInfo] = js.native
  @JSName("copyModel")
  var copyModel_Original: js.Function2[/* sourceURL */ String, /* destURL */ String, js.Promise[ModelArtifactsInfo]] = js.native
  
  def decodeWeights(buffer: ArrayBuffer, specs: js.Array[WeightsManifestEntry]): NamedTensorMap = js.native
  @JSName("decodeWeights")
  var decodeWeights_Original: js.Function2[/* buffer */ ArrayBuffer, /* specs */ js.Array[WeightsManifestEntry], NamedTensorMap] = js.native
  
  def encodeWeights(tensors: js.Array[NamedTensor]): js.Promise[Data] = js.native
  def encodeWeights(tensors: js.Array[NamedTensor], group: WeightGroup): js.Promise[Data] = js.native
  def encodeWeights(tensors: NamedTensorMap): js.Promise[Data] = js.native
  def encodeWeights(tensors: NamedTensorMap, group: WeightGroup): js.Promise[Data] = js.native
  @JSName("encodeWeights")
  var encodeWeights_Original: FnCallTensorsGroup = js.native
  
  def fileSystem(path: String): NodeFileSystem = js.native
  def fileSystem(path: js.Array[String]): NodeFileSystem = js.native
  @JSName("fileSystem")
  var fileSystem_Original: js.Function1[/* path */ String | js.Array[String], NodeFileSystem] = js.native
  
  def fromMemory(modelArtifacts: js.Object): IOHandler = js.native
  def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.UndefOr[scala.Nothing],
    weightData: js.UndefOr[scala.Nothing],
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  def fromMemory(modelArtifacts: js.Object, weightSpecs: js.UndefOr[scala.Nothing], weightData: ArrayBuffer): IOHandler = js.native
  def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.UndefOr[scala.Nothing],
    weightData: ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  def fromMemory(modelArtifacts: js.Object, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = js.native
  def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.UndefOr[scala.Nothing],
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  def fromMemory(modelArtifacts: js.Object, weightSpecs: js.Array[WeightsManifestEntry], weightData: ArrayBuffer): IOHandler = js.native
  def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  def fromMemory(modelArtifacts: ModelArtifacts): IOHandler = js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.UndefOr[scala.Nothing],
    weightData: js.UndefOr[scala.Nothing],
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  def fromMemory(modelArtifacts: ModelArtifacts, weightSpecs: js.UndefOr[scala.Nothing], weightData: ArrayBuffer): IOHandler = js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.UndefOr[scala.Nothing],
    weightData: ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  def fromMemory(modelArtifacts: ModelArtifacts, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.UndefOr[scala.Nothing],
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: ArrayBuffer
  ): IOHandler = js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  @JSName("fromMemory")
  var fromMemory_Original: FnCallModelArtifactsWeightSpecsWeightDataTrainingConfig = js.native
  
  def getLoadHandlers(url: String): js.Array[IOHandler] = js.native
  def getLoadHandlers(url: String, loadOptions: LoadOptions): js.Array[IOHandler] = js.native
  def getLoadHandlers(url: js.Array[String]): js.Array[IOHandler] = js.native
  def getLoadHandlers(url: js.Array[String], loadOptions: LoadOptions): js.Array[IOHandler] = js.native
  
  def getModelArtifactsInfoForJSON(modelArtifacts: ModelArtifacts): ModelArtifactsInfo = js.native
  @JSName("getModelArtifactsInfoForJSON")
  var getModelArtifactsInfoForJSON_Original: js.Function1[/* modelArtifacts */ ModelArtifacts, ModelArtifactsInfo] = js.native
  
  def getSaveHandlers(url: String): js.Array[IOHandler] = js.native
  def getSaveHandlers(url: js.Array[String]): js.Array[IOHandler] = js.native
  
  def http(path: String): IOHandler = js.native
  def http(path: String, loadOptions: LoadOptions): IOHandler = js.native
  @JSName("http")
  var http_Original: FnCall = js.native
  
  def isHTTPScheme(url: String): Boolean = js.native
  @JSName("isHTTPScheme")
  var isHTTPScheme_Original: js.Function1[/* url */ String, Boolean] = js.native
  
  def listModels(): js.Promise[StringDictionary[ModelArtifactsInfo]] = js.native
  @JSName("listModels")
  var listModels_Original: js.Function0[js.Promise[StringDictionary[ModelArtifactsInfo]]] = js.native
  
  def loadWeights(manifest: WeightsManifestConfig): js.Promise[NamedTensorMap] = js.native
  def loadWeights(
    manifest: WeightsManifestConfig,
    filePathPrefix: js.UndefOr[scala.Nothing],
    weightNames: js.UndefOr[scala.Nothing],
    requestInit: RequestInit
  ): js.Promise[NamedTensorMap] = js.native
  def loadWeights(
    manifest: WeightsManifestConfig,
    filePathPrefix: js.UndefOr[scala.Nothing],
    weightNames: js.Array[String]
  ): js.Promise[NamedTensorMap] = js.native
  def loadWeights(
    manifest: WeightsManifestConfig,
    filePathPrefix: js.UndefOr[scala.Nothing],
    weightNames: js.Array[String],
    requestInit: RequestInit
  ): js.Promise[NamedTensorMap] = js.native
  def loadWeights(manifest: WeightsManifestConfig, filePathPrefix: String): js.Promise[NamedTensorMap] = js.native
  def loadWeights(
    manifest: WeightsManifestConfig,
    filePathPrefix: String,
    weightNames: js.UndefOr[scala.Nothing],
    requestInit: RequestInit
  ): js.Promise[NamedTensorMap] = js.native
  def loadWeights(manifest: WeightsManifestConfig, filePathPrefix: String, weightNames: js.Array[String]): js.Promise[NamedTensorMap] = js.native
  def loadWeights(
    manifest: WeightsManifestConfig,
    filePathPrefix: String,
    weightNames: js.Array[String],
    requestInit: RequestInit
  ): js.Promise[NamedTensorMap] = js.native
  @JSName("loadWeights")
  var loadWeights_Original: FnCallManifestFilePathPrefixWeightNamesRequestInit = js.native
  
  def moveModel(sourceURL: String, destURL: String): js.Promise[ModelArtifactsInfo] = js.native
  @JSName("moveModel")
  var moveModel_Original: js.Function2[/* sourceURL */ String, /* destURL */ String, js.Promise[ModelArtifactsInfo]] = js.native
  
  def nodeHTTPRequest(path: String): IOHandler = js.native
  def nodeHTTPRequest(path: String, requestInit: js.UndefOr[scala.Nothing], weightPathPrefix: String): IOHandler = js.native
  def nodeHTTPRequest(path: String, requestInit: RequestInit): IOHandler = js.native
  def nodeHTTPRequest(path: String, requestInit: RequestInit, weightPathPrefix: String): IOHandler = js.native
  @JSName("nodeHTTPRequest")
  var nodeHTTPRequest_Original: js.Function3[
    /* path */ String, 
    /* requestInit */ js.UndefOr[RequestInit], 
    /* weightPathPrefix */ js.UndefOr[String], 
    IOHandler
  ] = js.native
  
  def registerLoadRouter(loudRouter: IORouter): Unit = js.native
  
  def registerSaveRouter(loudRouter: IORouter): Unit = js.native
  
  def removeModel(url: String): js.Promise[ModelArtifactsInfo] = js.native
  @JSName("removeModel")
  var removeModel_Original: js.Function1[/* url */ String, js.Promise[ModelArtifactsInfo]] = js.native
  
  def weightsLoaderFactory(
    fetchWeightsFunction: js.Function1[/* fetchUrls */ js.Array[String], js.Promise[js.Array[ArrayBuffer]]]
  ): js.Function3[
    /* manifest */ WeightsManifestConfig, 
    /* filePathPrefix */ js.UndefOr[String], 
    /* weightNames */ js.UndefOr[js.Array[String]], 
    js.Promise[NamedTensorMap]
  ] = js.native
  @JSName("weightsLoaderFactory")
  var weightsLoaderFactory_Original: js.Function1[
    /* fetchWeightsFunction */ js.Function1[/* fetchUrls */ js.Array[String], js.Promise[js.Array[ArrayBuffer]]], 
    js.Function3[
      /* manifest */ WeightsManifestConfig, 
      /* filePathPrefix */ js.UndefOr[String], 
      /* weightNames */ js.UndefOr[js.Array[String]], 
      js.Promise[NamedTensorMap]
    ]
  ] = js.native
  
  def withSaveHandler(saveHandler: js.Function1[/* artifacts */ ModelArtifacts, js.Promise[SaveResult]]): IOHandler = js.native
  @JSName("withSaveHandler")
  var withSaveHandler_Original: js.Function1[
    /* saveHandler */ js.Function1[/* artifacts */ ModelArtifacts, js.Promise[SaveResult]], 
    IOHandler
  ] = js.native
}
