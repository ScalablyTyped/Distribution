package typings.tensorflowTfjs.mod

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object io {
  
  @JSImport("@tensorflow/tfjs", "io")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def browserFiles(files: js.Array[File]): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("browserFiles")(files.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
  
  @scala.inline
  def browserHTTPRequest(path: String): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("browserHTTPRequest")(path.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
  @scala.inline
  def browserHTTPRequest(path: String, loadOptions: LoadOptions): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("browserHTTPRequest")(path.asInstanceOf[js.Any], loadOptions.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  
  @scala.inline
  def concatenateArrayBuffers(buffers: js.Array[ArrayBuffer]): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenateArrayBuffers")(buffers.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
  
  /**
    * Copy a model from one URL to another.
    *
    * This function supports:
    *
    * 1. Copying within a storage medium, e.g.,
    *    `tf.io.copyModel('localstorage://model-1', 'localstorage://model-2')`
    * 2. Copying between two storage mediums, e.g.,
    *    `tf.io.copyModel('localstorage://model-1', 'indexeddb://model-1')`
    *
    * ```js
    * // First create and save a model.
    * const model = tf.sequential();
    * model.add(tf.layers.dense(
    *     {units: 1, inputShape: [10], activation: 'sigmoid'}));
    * await model.save('localstorage://demo/management/model1');
    *
    * // Then list existing models.
    * console.log(JSON.stringify(await tf.io.listModels()));
    *
    * // Copy the model, from Local Storage to IndexedDB.
    * await tf.io.copyModel(
    *     'localstorage://demo/management/model1',
    *     'indexeddb://demo/management/model1');
    *
    * // List models again.
    * console.log(JSON.stringify(await tf.io.listModels()));
    *
    * // Remove both models.
    * await tf.io.removeModel('localstorage://demo/management/model1');
    * await tf.io.removeModel('indexeddb://demo/management/model1');
    * ```
    *
    * @param sourceURL Source URL of copying.
    * @param destURL Destination URL of copying.
    * @returns ModelArtifactsInfo of the copied model (if and only if copying
    *   is successful).
    * @throws Error if copying fails, e.g., if no model exists at `sourceURL`, or
    *   if `oldPath` and `newPath` are identical.
    *
    * @doc {
    *   heading: 'Models',
    *   subheading: 'Management',
    *   namespace: 'io',
    *   ignoreCI: true
    * }
    */
  @scala.inline
  def copyModel(sourceURL: String, destURL: String): js.Promise[ModelArtifactsInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyModel")(sourceURL.asInstanceOf[js.Any], destURL.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ModelArtifactsInfo]]
  
  @scala.inline
  def decodeWeights(buffer: ArrayBuffer, specs: js.Array[WeightsManifestEntry]): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeWeights")(buffer.asInstanceOf[js.Any], specs.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  
  @scala.inline
  def encodeWeights(tensors: js.Array[NamedTensor]): js.Promise[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeWeights")(tensors.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Data]]
  @scala.inline
  def encodeWeights(tensors: js.Array[NamedTensor], group: WeightGroup): js.Promise[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWeights")(tensors.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Data]]
  @scala.inline
  def encodeWeights(tensors: NamedTensorMap): js.Promise[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeWeights")(tensors.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Data]]
  @scala.inline
  def encodeWeights(tensors: NamedTensorMap, group: WeightGroup): js.Promise[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWeights")(tensors.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Data]]
  
  @scala.inline
  def fromMemory(modelArtifacts: js.Object): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
  @scala.inline
  def fromMemory(modelArtifacts: js.Object, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  @scala.inline
  def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: Unit,
    trainingConfig: TrainingConfig
  ): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  @scala.inline
  def fromMemory(modelArtifacts: js.Object, weightSpecs: js.Array[WeightsManifestEntry], weightData: ArrayBuffer): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  @scala.inline
  def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  @scala.inline
  def fromMemory(modelArtifacts: js.Object, weightSpecs: Unit, weightData: Unit, trainingConfig: TrainingConfig): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  @scala.inline
  def fromMemory(modelArtifacts: js.Object, weightSpecs: Unit, weightData: ArrayBuffer): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  @scala.inline
  def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: Unit,
    weightData: ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  @scala.inline
  def fromMemory(modelArtifacts: ModelArtifacts): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
  @scala.inline
  def fromMemory(modelArtifacts: ModelArtifacts, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  @scala.inline
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: Unit,
    trainingConfig: TrainingConfig
  ): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  @scala.inline
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: ArrayBuffer
  ): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  @scala.inline
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  @scala.inline
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: Unit,
    weightData: Unit,
    trainingConfig: TrainingConfig
  ): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  @scala.inline
  def fromMemory(modelArtifacts: ModelArtifacts, weightSpecs: Unit, weightData: ArrayBuffer): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  @scala.inline
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: Unit,
    weightData: ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  
  @scala.inline
  def getLoadHandlers(url: String): js.Array[IOHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoadHandlers")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[IOHandler]]
  @scala.inline
  def getLoadHandlers(url: String, loadOptions: LoadOptions): js.Array[IOHandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLoadHandlers")(url.asInstanceOf[js.Any], loadOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[IOHandler]]
  @scala.inline
  def getLoadHandlers(url: js.Array[String]): js.Array[IOHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoadHandlers")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[IOHandler]]
  @scala.inline
  def getLoadHandlers(url: js.Array[String], loadOptions: LoadOptions): js.Array[IOHandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLoadHandlers")(url.asInstanceOf[js.Any], loadOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[IOHandler]]
  
  @scala.inline
  def getModelArtifactsInfoForJSON(modelArtifacts: ModelArtifacts): ModelArtifactsInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getModelArtifactsInfoForJSON")(modelArtifacts.asInstanceOf[js.Any]).asInstanceOf[ModelArtifactsInfo]
  
  @scala.inline
  def getSaveHandlers(url: String): js.Array[IOHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSaveHandlers")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[IOHandler]]
  @scala.inline
  def getSaveHandlers(url: js.Array[String]): js.Array[IOHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSaveHandlers")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[IOHandler]]
  
  @scala.inline
  def http(path: String): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("http")(path.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
  @scala.inline
  def http(path: String, loadOptions: LoadOptions): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("http")(path.asInstanceOf[js.Any], loadOptions.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  
  @scala.inline
  def isHTTPScheme(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTTPScheme")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * List all models stored in registered storage mediums.
    *
    * For a web browser environment, the registered mediums are Local Storage and
    * IndexedDB.
    *
    * ```js
    * // First create and save a model.
    * const model = tf.sequential();
    * model.add(tf.layers.dense(
    *     {units: 1, inputShape: [10], activation: 'sigmoid'}));
    * await model.save('localstorage://demo/management/model1');
    *
    * // Then list existing models.
    * console.log(JSON.stringify(await tf.io.listModels()));
    *
    * // Delete the model.
    * await tf.io.removeModel('localstorage://demo/management/model1');
    *
    * // List models again.
    * console.log(JSON.stringify(await tf.io.listModels()));
    * ```
    *
    * @returns A `Promise` of a dictionary mapping URLs of existing models to
    * their model artifacts info. URLs include medium-specific schemes, e.g.,
    *   'indexeddb://my/model/1'. Model artifacts info include type of the
    * model's topology, byte sizes of the topology, weights, etc.
    *
    * @doc {
    *   heading: 'Models',
    *   subheading: 'Management',
    *   namespace: 'io',
    *   ignoreCI: true
    * }
    */
  @scala.inline
  def listModels(): js.Promise[StringDictionary[ModelArtifactsInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listModels")().asInstanceOf[js.Promise[StringDictionary[ModelArtifactsInfo]]]
  
  @scala.inline
  def loadWeights(manifest: WeightsManifestConfig): js.Promise[NamedTensorMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadWeights")(manifest.asInstanceOf[js.Any]).asInstanceOf[js.Promise[NamedTensorMap]]
  @scala.inline
  def loadWeights(manifest: WeightsManifestConfig, filePathPrefix: String): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadWeights")(manifest.asInstanceOf[js.Any], filePathPrefix.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  @scala.inline
  def loadWeights(manifest: WeightsManifestConfig, filePathPrefix: String, weightNames: js.Array[String]): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadWeights")(manifest.asInstanceOf[js.Any], filePathPrefix.asInstanceOf[js.Any], weightNames.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  @scala.inline
  def loadWeights(
    manifest: WeightsManifestConfig,
    filePathPrefix: String,
    weightNames: js.Array[String],
    requestInit: RequestInit
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadWeights")(manifest.asInstanceOf[js.Any], filePathPrefix.asInstanceOf[js.Any], weightNames.asInstanceOf[js.Any], requestInit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  @scala.inline
  def loadWeights(
    manifest: WeightsManifestConfig,
    filePathPrefix: String,
    weightNames: Unit,
    requestInit: RequestInit
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadWeights")(manifest.asInstanceOf[js.Any], filePathPrefix.asInstanceOf[js.Any], weightNames.asInstanceOf[js.Any], requestInit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  @scala.inline
  def loadWeights(manifest: WeightsManifestConfig, filePathPrefix: Unit, weightNames: js.Array[String]): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadWeights")(manifest.asInstanceOf[js.Any], filePathPrefix.asInstanceOf[js.Any], weightNames.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  @scala.inline
  def loadWeights(
    manifest: WeightsManifestConfig,
    filePathPrefix: Unit,
    weightNames: js.Array[String],
    requestInit: RequestInit
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadWeights")(manifest.asInstanceOf[js.Any], filePathPrefix.asInstanceOf[js.Any], weightNames.asInstanceOf[js.Any], requestInit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  @scala.inline
  def loadWeights(manifest: WeightsManifestConfig, filePathPrefix: Unit, weightNames: Unit, requestInit: RequestInit): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadWeights")(manifest.asInstanceOf[js.Any], filePathPrefix.asInstanceOf[js.Any], weightNames.asInstanceOf[js.Any], requestInit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  
  /**
    * Move a model from one URL to another.
    *
    * This function supports:
    *
    * 1. Moving within a storage medium, e.g.,
    *    `tf.io.moveModel('localstorage://model-1', 'localstorage://model-2')`
    * 2. Moving between two storage mediums, e.g.,
    *    `tf.io.moveModel('localstorage://model-1', 'indexeddb://model-1')`
    *
    * ```js
    * // First create and save a model.
    * const model = tf.sequential();
    * model.add(tf.layers.dense(
    *     {units: 1, inputShape: [10], activation: 'sigmoid'}));
    * await model.save('localstorage://demo/management/model1');
    *
    * // Then list existing models.
    * console.log(JSON.stringify(await tf.io.listModels()));
    *
    * // Move the model, from Local Storage to IndexedDB.
    * await tf.io.moveModel(
    *     'localstorage://demo/management/model1',
    *     'indexeddb://demo/management/model1');
    *
    * // List models again.
    * console.log(JSON.stringify(await tf.io.listModels()));
    *
    * // Remove the moved model.
    * await tf.io.removeModel('indexeddb://demo/management/model1');
    * ```
    *
    * @param sourceURL Source URL of moving.
    * @param destURL Destination URL of moving.
    * @returns ModelArtifactsInfo of the copied model (if and only if copying
    *   is successful).
    * @throws Error if moving fails, e.g., if no model exists at `sourceURL`, or
    *   if `oldPath` and `newPath` are identical.
    *
    * @doc {
    *   heading: 'Models',
    *   subheading: 'Management',
    *   namespace: 'io',
    *   ignoreCI: true
    * }
    */
  @scala.inline
  def moveModel(sourceURL: String, destURL: String): js.Promise[ModelArtifactsInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveModel")(sourceURL.asInstanceOf[js.Any], destURL.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ModelArtifactsInfo]]
  
  @scala.inline
  def registerLoadRouter(loudRouter: IORouter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerLoadRouter")(loudRouter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def registerSaveRouter(loudRouter: IORouter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerSaveRouter")(loudRouter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Remove a model specified by URL from a reigstered storage medium.
    *
    * ```js
    * // First create and save a model.
    * const model = tf.sequential();
    * model.add(tf.layers.dense(
    *     {units: 1, inputShape: [10], activation: 'sigmoid'}));
    * await model.save('localstorage://demo/management/model1');
    *
    * // Then list existing models.
    * console.log(JSON.stringify(await tf.io.listModels()));
    *
    * // Delete the model.
    * await tf.io.removeModel('localstorage://demo/management/model1');
    *
    * // List models again.
    * console.log(JSON.stringify(await tf.io.listModels()));
    * ```
    *
    * @param url A URL to a stored model, with a scheme prefix, e.g.,
    *   'localstorage://my-model-1', 'indexeddb://my/model/2'.
    * @returns ModelArtifactsInfo of the deleted model (if and only if deletion
    *   is successful).
    * @throws Error if deletion fails, e.g., if no model exists at `path`.
    *
    * @doc {
    *   heading: 'Models',
    *   subheading: 'Management',
    *   namespace: 'io',
    *   ignoreCI: true
    * }
    */
  @scala.inline
  def removeModel(url: String): js.Promise[ModelArtifactsInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeModel")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ModelArtifactsInfo]]
  
  @scala.inline
  def weightsLoaderFactory(
    fetchWeightsFunction: js.Function1[/* fetchUrls */ js.Array[String], js.Promise[js.Array[ArrayBuffer]]]
  ): js.Function3[
    /* manifest */ WeightsManifestConfig, 
    /* filePathPrefix */ js.UndefOr[String], 
    /* weightNames */ js.UndefOr[js.Array[String]], 
    js.Promise[NamedTensorMap]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("weightsLoaderFactory")(fetchWeightsFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* manifest */ WeightsManifestConfig, 
    /* filePathPrefix */ js.UndefOr[String], 
    /* weightNames */ js.UndefOr[js.Array[String]], 
    js.Promise[NamedTensorMap]
  ]]
  
  @scala.inline
  def withSaveHandler(saveHandler: js.Function1[/* artifacts */ ModelArtifacts, js.Promise[SaveResult]]): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("withSaveHandler")(saveHandler.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
}
