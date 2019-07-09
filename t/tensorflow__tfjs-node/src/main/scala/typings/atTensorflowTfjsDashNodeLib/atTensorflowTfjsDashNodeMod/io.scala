package typings
package atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "io")
@js.native
object io extends js.Object {
  @JSName("browserFiles")
  var browserFiles_Original: js.Function1[
    /* files */ js.Array[stdLib.File], 
    atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler
  ] = js.native
  @JSName("browserHTTPRequest")
  var browserHTTPRequest_Original: atTensorflowTfjsDashNodeLib.Fn_LoadOptions = js.native
  @JSName("concatenateArrayBuffers")
  var concatenateArrayBuffers_Original: js.Function1[/* buffers */ js.Array[stdLib.ArrayBuffer], stdLib.ArrayBuffer] = js.native
  @JSName("copyModel")
  var copyModel_Original: js.Function2[
    /* sourceURL */ java.lang.String, 
    /* destURL */ java.lang.String, 
    js.Promise[atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifactsInfo]
  ] = js.native
  @JSName("decodeWeights")
  var decodeWeights_Original: js.Function2[
    /* buffer */ stdLib.ArrayBuffer, 
    /* specs */ js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestEntry], 
    atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap
  ] = js.native
  @JSName("encodeWeights")
  var encodeWeights_Original: atTensorflowTfjsDashNodeLib.Fn_Group = js.native
  @JSName("fileSystem")
  var fileSystem_Original: js.Function1[
    /* path */ java.lang.String | js.Array[java.lang.String], 
    atTensorflowTfjsDashNodeLib.distIoFileUnderscoreSystemMod.NodeFileSystem
  ] = js.native
  @JSName("fromMemory")
  var fromMemory_Original: atTensorflowTfjsDashNodeLib.Fn_ModelTopology = js.native
  @JSName("getModelArtifactsInfoForJSON")
  var getModelArtifactsInfoForJSON_Original: js.Function1[
    /* modelArtifacts */ atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifacts, 
    atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifactsInfo
  ] = js.native
  @JSName("http")
  var http_Original: atTensorflowTfjsDashNodeLib.Fn_LoadOptions = js.native
  @JSName("isHTTPScheme")
  var isHTTPScheme_Original: js.Function1[/* url */ java.lang.String, scala.Boolean] = js.native
  @JSName("listModels")
  var listModels_Original: js.Function0[
    js.Promise[
      org.scalablytyped.runtime.StringDictionary[atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifactsInfo]
    ]
  ] = js.native
  @JSName("loadWeights")
  var loadWeights_Original: atTensorflowTfjsDashNodeLib.Fn_FilePathPrefix = js.native
  @JSName("moveModel")
  var moveModel_Original: js.Function2[
    /* sourceURL */ java.lang.String, 
    /* destURL */ java.lang.String, 
    js.Promise[atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifactsInfo]
  ] = js.native
  @JSName("nodeHTTPRequest")
  var nodeHTTPRequest_Original: js.Function3[
    /* path */ java.lang.String, 
    /* requestInit */ js.UndefOr[stdLib.RequestInit], 
    /* weightPathPrefix */ js.UndefOr[java.lang.String], 
    atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler
  ] = js.native
  @JSName("removeModel")
  var removeModel_Original: js.Function1[
    /* url */ java.lang.String, 
    js.Promise[atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifactsInfo]
  ] = js.native
  @JSName("weightsLoaderFactory")
  var weightsLoaderFactory_Original: js.Function1[
    /* fetchWeightsFunction */ js.Function1[
      /* fetchUrls */ js.Array[java.lang.String], 
      js.Promise[js.Array[stdLib.ArrayBuffer]]
    ], 
    js.Function3[
      /* manifest */ atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestConfig, 
      /* filePathPrefix */ js.UndefOr[java.lang.String], 
      /* weightNames */ js.UndefOr[js.Array[java.lang.String]], 
      js.Promise[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap]
    ]
  ] = js.native
  @JSName("withSaveHandler")
  var withSaveHandler_Original: js.Function1[
    /* saveHandler */ js.Function1[
      /* artifacts */ atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifacts, 
      js.Promise[atTensorflowTfjsDashCoreLib.distIoTypesMod.SaveResult]
    ], 
    atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler
  ] = js.native
  def browserFiles(files: js.Array[stdLib.File]): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def browserHTTPRequest(path: java.lang.String): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def browserHTTPRequest(path: java.lang.String, loadOptions: atTensorflowTfjsDashCoreLib.distIoTypesMod.LoadOptions): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def concatenateArrayBuffers(buffers: js.Array[stdLib.ArrayBuffer]): stdLib.ArrayBuffer = js.native
  def copyModel(sourceURL: java.lang.String, destURL: java.lang.String): js.Promise[atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifactsInfo] = js.native
  def decodeWeights(
    buffer: stdLib.ArrayBuffer,
    specs: js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestEntry]
  ): atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap = js.native
  def encodeWeights(tensors: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap): js.Promise[atTensorflowTfjsDashCoreLib.Anon_Data] = js.native
  def encodeWeights(
    tensors: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap,
    group: atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightGroup
  ): js.Promise[atTensorflowTfjsDashCoreLib.Anon_Data] = js.native
  def encodeWeights(tensors: js.Array[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensor]): js.Promise[atTensorflowTfjsDashCoreLib.Anon_Data] = js.native
  def encodeWeights(
    tensors: js.Array[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensor],
    group: atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightGroup
  ): js.Promise[atTensorflowTfjsDashCoreLib.Anon_Data] = js.native
  def fileSystem(path: java.lang.String): atTensorflowTfjsDashNodeLib.distIoFileUnderscoreSystemMod.NodeFileSystem = js.native
  def fileSystem(path: js.Array[java.lang.String]): atTensorflowTfjsDashNodeLib.distIoFileUnderscoreSystemMod.NodeFileSystem = js.native
  def fromMemory(modelTopology: js.Object): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def fromMemory(
    modelTopology: js.Object,
    weightSpecs: js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestEntry]
  ): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def fromMemory(
    modelTopology: js.Object,
    weightSpecs: js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestEntry],
    weightData: stdLib.ArrayBuffer
  ): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def fromMemory(
    modelTopology: js.Object,
    weightSpecs: js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestEntry],
    weightData: stdLib.ArrayBuffer,
    trainingConfig: atTensorflowTfjsDashCoreLib.distIoTypesMod.TrainingConfig
  ): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def getLoadHandlers(url: java.lang.String): js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler] = js.native
  def getLoadHandlers(url: java.lang.String, onProgress: js.Function): js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler] = js.native
  def getLoadHandlers(url: js.Array[java.lang.String]): js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler] = js.native
  def getLoadHandlers(url: js.Array[java.lang.String], onProgress: js.Function): js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler] = js.native
  def getModelArtifactsInfoForJSON(modelArtifacts: atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifacts): atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifactsInfo = js.native
  def getSaveHandlers(url: java.lang.String): js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler] = js.native
  def getSaveHandlers(url: js.Array[java.lang.String]): js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler] = js.native
  def http(path: java.lang.String): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def http(path: java.lang.String, loadOptions: atTensorflowTfjsDashCoreLib.distIoTypesMod.LoadOptions): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def isHTTPScheme(url: java.lang.String): scala.Boolean = js.native
  def listModels(): js.Promise[
    org.scalablytyped.runtime.StringDictionary[atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifactsInfo]
  ] = js.native
  def loadWeights(manifest: atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestConfig): js.Promise[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap] = js.native
  def loadWeights(
    manifest: atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestConfig,
    filePathPrefix: java.lang.String
  ): js.Promise[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap] = js.native
  def loadWeights(
    manifest: atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestConfig,
    filePathPrefix: java.lang.String,
    weightNames: js.Array[java.lang.String]
  ): js.Promise[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap] = js.native
  def loadWeights(
    manifest: atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestConfig,
    filePathPrefix: java.lang.String,
    weightNames: js.Array[java.lang.String],
    requestInit: stdLib.RequestInit
  ): js.Promise[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap] = js.native
  def moveModel(sourceURL: java.lang.String, destURL: java.lang.String): js.Promise[atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifactsInfo] = js.native
  def nodeHTTPRequest(path: java.lang.String): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def nodeHTTPRequest(path: java.lang.String, requestInit: stdLib.RequestInit): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def nodeHTTPRequest(path: java.lang.String, requestInit: stdLib.RequestInit, weightPathPrefix: java.lang.String): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def registerLoadRouter(loudRouter: atTensorflowTfjsDashCoreLib.distIoRouterUnderscoreRegistryMod.IORouter): scala.Unit = js.native
  def registerSaveRouter(loudRouter: atTensorflowTfjsDashCoreLib.distIoRouterUnderscoreRegistryMod.IORouter): scala.Unit = js.native
  def removeModel(url: java.lang.String): js.Promise[atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifactsInfo] = js.native
  def weightsLoaderFactory(
    fetchWeightsFunction: js.Function1[
      /* fetchUrls */ js.Array[java.lang.String], 
      js.Promise[js.Array[stdLib.ArrayBuffer]]
    ]
  ): js.Function3[
    /* manifest */ atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestConfig, 
    /* filePathPrefix */ js.UndefOr[java.lang.String], 
    /* weightNames */ js.UndefOr[js.Array[java.lang.String]], 
    js.Promise[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap]
  ] = js.native
  def withSaveHandler(
    saveHandler: js.Function1[
      /* artifacts */ atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifacts, 
      js.Promise[atTensorflowTfjsDashCoreLib.distIoTypesMod.SaveResult]
    ]
  ): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
}

