package typings
package atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "io")
@js.native
object ioNs extends js.Object {
  def browserFiles(files: js.Array[stdLib.File]): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def browserHTTPRequest(path: java.lang.String): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def browserHTTPRequest(path: java.lang.String, loadOptions: atTensorflowTfjsDashCoreLib.distIoTypesMod.LoadOptions): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def concatenateArrayBuffers(buffers: js.Array[stdLib.ArrayBuffer]): stdLib.ArrayBuffer = js.native
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
    */
  /**
    * @doc {
    *   heading: 'Models',
    *   subheading: 'Management',
    *   namespace: 'io',
    *   ignoreCI: true
    * }
    */
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
    */
  /**
    * @doc {
    *   heading: 'Models',
    *   subheading: 'Management',
    *   namespace: 'io',
    *   ignoreCI: true
    * }
    */
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
    */
  /**
    * @doc {
    *   heading: 'Models',
    *   subheading: 'Management',
    *   namespace: 'io',
    *   ignoreCI: true
    * }
    */
  def moveModel(sourceURL: java.lang.String, destURL: java.lang.String): js.Promise[atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifactsInfo] = js.native
  def registerLoadRouter(loudRouter: atTensorflowTfjsDashCoreLib.distIoRouterUnderscoreRegistryMod.IORouter): scala.Unit = js.native
  def registerSaveRouter(loudRouter: atTensorflowTfjsDashCoreLib.distIoRouterUnderscoreRegistryMod.IORouter): scala.Unit = js.native
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
    */
  /**
    * @doc {
    *   heading: 'Models',
    *   subheading: 'Management',
    *   namespace: 'io',
    *   ignoreCI: true
    * }
    */
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

