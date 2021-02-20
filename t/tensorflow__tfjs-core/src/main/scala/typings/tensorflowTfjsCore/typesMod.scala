package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayBuffer
import typings.std.Date
import typings.std.RequestInit
import typings.std.Response
import typings.tensorflowTfjsCore.anon.Dtype
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GraphDef
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.JSON
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait IOHandler extends StObject {
    
    var load: js.UndefOr[LoadHandler] = js.native
    
    var save: js.UndefOr[SaveHandler] = js.native
  }
  object IOHandler {
    
    @scala.inline
    def apply(): IOHandler = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOHandler]
    }
    
    @scala.inline
    implicit class IOHandlerMutableBuilder[Self <: IOHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoad(value: () => js.Promise[ModelArtifacts]): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      @scala.inline
      def setSave(value: /* modelArtifact */ ModelArtifacts => js.Promise[SaveResult]): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    }
  }
  
  type LoadHandler = js.Function0[js.Promise[ModelArtifacts]]
  
  @js.native
  trait LoadOptions extends StObject {
    
    /**
      * A function used to override the `window.fetch` function.
      */
    var fetchFunc: js.UndefOr[js.Function] = js.native
    
    /**
      * Whether the module or model is to be loaded from TF Hub.
      *
      * Setting this to `true` allows passing a TF-Hub module URL, omitting the
      * standard model file name and the query parameters.
      *
      * Default: `false`.
      */
    var fromTFHub: js.UndefOr[Boolean] = js.native
    
    /**
      * Progress callback.
      */
    var onProgress: js.UndefOr[OnProgressCallback] = js.native
    
    /**
      * RequestInit (options) for HTTP requests.
      *
      * For detailed information on the supported fields, see
      * [https://developer.mozilla.org/en-US/docs/Web/API/Request/Request](
      *     https://developer.mozilla.org/en-US/docs/Web/API/Request/Request)
      */
    var requestInit: js.UndefOr[RequestInit] = js.native
    
    /**
      * Strict loading model: whether extraneous weights or missing
      * weights should trigger an `Error`.
      *
      * If `true`, require that the provided weights exactly match those
      * required by the layers. `false` means that both extra weights
      * and missing weights will be silently ignored.
      *
      * Default: `true`.
      */
    var strict: js.UndefOr[Boolean] = js.native
    
    /**
      * Path prefix for weight files, by default this is calculated from the
      * path of the model JSON file.
      *
      * For instance, if the path to the model JSON file is
      * `http://localhost/foo/model.json`, then the default path prefix will be
      * `http://localhost/foo/`. If a weight file has the path value
      * `group1-shard1of2` in the weight manifest, then the weight file will be
      * loaded from `http://localhost/foo/group1-shard1of2` by default. However,
      * if you provide a `weightPathPrefix` value of
      * `http://localhost/foo/alt-weights`, then the weight file will be loaded
      * from the path `http://localhost/foo/alt-weights/group1-shard1of2` instead.
      */
    var weightPathPrefix: js.UndefOr[String] = js.native
    
    /**
      * An async function to convert weight file name to URL. The weight file
      * names are stored in model.json's weightsManifest.paths field. By default we
      * consider weight files are colocated with the model.json file. For example:
      *     model.json URL: https://www.google.com/models/1/model.json
      *     group1-shard1of1.bin url:
      *        https://www.google.com/models/1/group1-shard1of1.bin
      *
      * With this func you can convert the weight file name to any URL.
      */
    var weightUrlConverter: js.UndefOr[js.Function1[/* weightFileName */ String, js.Promise[String]]] = js.native
  }
  object LoadOptions {
    
    @scala.inline
    def apply(): LoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadOptions]
    }
    
    @scala.inline
    implicit class LoadOptionsMutableBuilder[Self <: LoadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetchFunc(value: js.Function): Self = StObject.set(x, "fetchFunc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchFuncUndefined: Self = StObject.set(x, "fetchFunc", js.undefined)
      
      @scala.inline
      def setFromTFHub(value: Boolean): Self = StObject.set(x, "fromTFHub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromTFHubUndefined: Self = StObject.set(x, "fromTFHub", js.undefined)
      
      @scala.inline
      def setOnProgress(value: /* fraction */ Double => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setRequestInit(value: RequestInit): Self = StObject.set(x, "requestInit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestInitUndefined: Self = StObject.set(x, "requestInit", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setWeightPathPrefix(value: String): Self = StObject.set(x, "weightPathPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightPathPrefixUndefined: Self = StObject.set(x, "weightPathPrefix", js.undefined)
      
      @scala.inline
      def setWeightUrlConverter(value: /* weightFileName */ String => js.Promise[String]): Self = StObject.set(x, "weightUrlConverter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWeightUrlConverterUndefined: Self = StObject.set(x, "weightUrlConverter", js.undefined)
    }
  }
  
  @js.native
  trait ModelArtifacts extends StObject {
    
    /**
      * What library or tool is responsible for converting the original model
      * to this format, applicable only if the model is output by a converter.
      *
      * Used for debugging purposes.  E.g., 'TensorFlow.js Converter v1.0.0'.
      *
      * A value of `null` means the model artifacts are generated without any
      * conversion process (e.g., saved directly from a TensorFlow.js
      * `tf.LayersModel` instance.)
      */
    var convertedBy: js.UndefOr[String | Null] = js.native
    
    /**
      * Hard-coded format name for models saved from TensorFlow.js or converted
      * by TensorFlow.js Converter.
      */
    var format: js.UndefOr[String] = js.native
    
    /**
      * What library is responsible for originally generating this artifact.
      *
      * Used for debugging purposes. E.g., 'TensorFlow.js v1.0.0'.
      */
    var generatedBy: js.UndefOr[String] = js.native
    
    /**
      * Initializer for the model.
      */
    var modelInitializer: js.UndefOr[js.Object] = js.native
    
    /**
      * Model topology.
      *
      * For Keras-style `tf.Model`s, this is a JSON object.
      * For TensorFlow-style models (e.g., `SavedModel`), this is the JSON
      * encoding of the `GraphDef` protocol buffer.
      */
    var modelTopology: js.UndefOr[js.Object | ArrayBuffer] = js.native
    
    /**
      * Serialized configuration for the model's training.
      */
    var trainingConfig: js.UndefOr[TrainingConfig] = js.native
    
    /**
      * User-defined metadata about the model.
      */
    var userDefinedMetadata: js.UndefOr[js.Object] = js.native
    
    /**
      * Binary buffer for all weight values concatenated in the order specified
      * by `weightSpecs`.
      */
    var weightData: js.UndefOr[ArrayBuffer] = js.native
    
    /**
      * Weight specifications.
      *
      * This corresponds to the weightsData below.
      */
    var weightSpecs: js.UndefOr[js.Array[WeightsManifestEntry]] = js.native
  }
  object ModelArtifacts {
    
    @scala.inline
    def apply(): ModelArtifacts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelArtifacts]
    }
    
    @scala.inline
    implicit class ModelArtifactsMutableBuilder[Self <: ModelArtifacts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConvertedBy(value: String): Self = StObject.set(x, "convertedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConvertedByNull: Self = StObject.set(x, "convertedBy", null)
      
      @scala.inline
      def setConvertedByUndefined: Self = StObject.set(x, "convertedBy", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setGeneratedBy(value: String): Self = StObject.set(x, "generatedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneratedByUndefined: Self = StObject.set(x, "generatedBy", js.undefined)
      
      @scala.inline
      def setModelInitializer(value: js.Object): Self = StObject.set(x, "modelInitializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelInitializerUndefined: Self = StObject.set(x, "modelInitializer", js.undefined)
      
      @scala.inline
      def setModelTopology(value: js.Object | ArrayBuffer): Self = StObject.set(x, "modelTopology", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelTopologyUndefined: Self = StObject.set(x, "modelTopology", js.undefined)
      
      @scala.inline
      def setTrainingConfig(value: TrainingConfig): Self = StObject.set(x, "trainingConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrainingConfigUndefined: Self = StObject.set(x, "trainingConfig", js.undefined)
      
      @scala.inline
      def setUserDefinedMetadata(value: js.Object): Self = StObject.set(x, "userDefinedMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserDefinedMetadataUndefined: Self = StObject.set(x, "userDefinedMetadata", js.undefined)
      
      @scala.inline
      def setWeightData(value: ArrayBuffer): Self = StObject.set(x, "weightData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightDataUndefined: Self = StObject.set(x, "weightData", js.undefined)
      
      @scala.inline
      def setWeightSpecs(value: js.Array[WeightsManifestEntry]): Self = StObject.set(x, "weightSpecs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightSpecsUndefined: Self = StObject.set(x, "weightSpecs", js.undefined)
      
      @scala.inline
      def setWeightSpecsVarargs(value: WeightsManifestEntry*): Self = StObject.set(x, "weightSpecs", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ModelArtifactsInfo extends StObject {
    
    /**
      * Timestamp for when the model is saved.
      */
    var dateSaved: Date = js.native
    
    /**
      * Size of model topology (Keras JSON or GraphDef), in bytes.
      */
    var modelTopologyBytes: js.UndefOr[Double] = js.native
    
    /**
      * TODO (cais,yassogba) consider removing GraphDef as GraphDefs now
      * come in a JSON format and none of our IOHandlers support a non json
      * format. We could conder replacing this with 'Binary' if we want to
      * allow future handlers to save to non json formats (though they will
      * probably want more information than 'Binary').
      * Type of the model topology
      *
      * Type of the model topology
      *
      * Possible values:
      *   - JSON: JSON config (human-readable, e.g., Keras JSON).
      *   - GraphDef: TensorFlow
      *     [GraphDef](https://www.tensorflow.org/extend/tool_developers/#graphdef)
      *     protocol buffer (binary).
      */
    var modelTopologyType: JSON | GraphDef = js.native
    
    /**
      * Size of weight value data, in bytes.
      */
    var weightDataBytes: js.UndefOr[Double] = js.native
    
    /**
      * Size of weight specification or manifest, in bytes.
      */
    var weightSpecsBytes: js.UndefOr[Double] = js.native
  }
  object ModelArtifactsInfo {
    
    @scala.inline
    def apply(dateSaved: Date, modelTopologyType: JSON | GraphDef): ModelArtifactsInfo = {
      val __obj = js.Dynamic.literal(dateSaved = dateSaved.asInstanceOf[js.Any], modelTopologyType = modelTopologyType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelArtifactsInfo]
    }
    
    @scala.inline
    implicit class ModelArtifactsInfoMutableBuilder[Self <: ModelArtifactsInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDateSaved(value: Date): Self = StObject.set(x, "dateSaved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelTopologyBytes(value: Double): Self = StObject.set(x, "modelTopologyBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelTopologyBytesUndefined: Self = StObject.set(x, "modelTopologyBytes", js.undefined)
      
      @scala.inline
      def setModelTopologyType(value: JSON | GraphDef): Self = StObject.set(x, "modelTopologyType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightDataBytes(value: Double): Self = StObject.set(x, "weightDataBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightDataBytesUndefined: Self = StObject.set(x, "weightDataBytes", js.undefined)
      
      @scala.inline
      def setWeightSpecsBytes(value: Double): Self = StObject.set(x, "weightSpecsBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightSpecsBytesUndefined: Self = StObject.set(x, "weightSpecsBytes", js.undefined)
    }
  }
  
  @js.native
  trait ModelJSON extends StObject {
    
    /**
      * What library or tool is responsible for converting the original model
      * to this format, applicable only if the model is output by a converter.
      *
      * Used for debugging purposes.  E.g., 'TensorFlow.js Converter v1.0.0'.
      *
      * A value of `null` means the model artifacts are generated without any
      * conversion process (e.g., saved directly from a TensorFlow.js
      * `tf.LayersModel` instance.)
      */
    var convertedBy: js.UndefOr[String | Null] = js.native
    
    /**
      * Hard-coded format name for models saved from TensorFlow.js or converted
      * by TensorFlow.js Converter.
      */
    var format: js.UndefOr[String] = js.native
    
    /**
      * What library is responsible for originally generating this artifact.
      *
      * Used for debugging purposes. E.g., 'TensorFlow.js v1.0.0'.
      */
    var generatedBy: js.UndefOr[String] = js.native
    
    /**
      * Initializer for the model.
      */
    var modelInitializer: js.UndefOr[js.Object] = js.native
    
    /** Model training configuration. */
    var trainingConfig: js.UndefOr[TrainingConfig] = js.native
    
    /**
      * User-defined metadata about the model.
      */
    var userDefinedMetadata: js.UndefOr[js.Object] = js.native
    
    /**
      * Weights manifest.
      *
      * The weights manifest consists of an ordered list of weight-manifest
      * groups. Each weight-manifest group consists of a number of weight values
      * stored in a number of paths. See the documentation of
      * `WeightsManifestConfig` for more details.
      */
    var weightsManifest: WeightsManifestConfig = js.native
  }
  object ModelJSON {
    
    @scala.inline
    def apply(weightsManifest: WeightsManifestConfig): ModelJSON = {
      val __obj = js.Dynamic.literal(weightsManifest = weightsManifest.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelJSON]
    }
    
    @scala.inline
    implicit class ModelJSONMutableBuilder[Self <: ModelJSON] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConvertedBy(value: String): Self = StObject.set(x, "convertedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConvertedByNull: Self = StObject.set(x, "convertedBy", null)
      
      @scala.inline
      def setConvertedByUndefined: Self = StObject.set(x, "convertedBy", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setGeneratedBy(value: String): Self = StObject.set(x, "generatedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneratedByUndefined: Self = StObject.set(x, "generatedBy", js.undefined)
      
      @scala.inline
      def setModelInitializer(value: js.Object): Self = StObject.set(x, "modelInitializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelInitializerUndefined: Self = StObject.set(x, "modelInitializer", js.undefined)
      
      @scala.inline
      def setTrainingConfig(value: TrainingConfig): Self = StObject.set(x, "trainingConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrainingConfigUndefined: Self = StObject.set(x, "trainingConfig", js.undefined)
      
      @scala.inline
      def setUserDefinedMetadata(value: js.Object): Self = StObject.set(x, "userDefinedMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserDefinedMetadataUndefined: Self = StObject.set(x, "userDefinedMetadata", js.undefined)
      
      @scala.inline
      def setWeightsManifest(value: WeightsManifestConfig): Self = StObject.set(x, "weightsManifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightsManifestVarargs(value: WeightsManifestGroupConfig*): Self = StObject.set(x, "weightsManifest", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ModelStoreManager extends StObject {
    
    /**
      * List all models in the model store.
      *
      * @returns A dictionary mapping paths of existing models to their
      *   model artifacts info. Model artifacts info include type of the model's
      *   topology, byte sizes of the topology, weights, etc.
      */
    def listModels(): js.Promise[StringDictionary[ModelArtifactsInfo]] = js.native
    
    /**
      * Remove a model specified by `path`.
      *
      * @param path
      * @returns ModelArtifactsInfo of the deleted model (if and only if deletion
      *   is successful).
      * @throws Error if deletion fails, e.g., if no model exists at `path`.
      */
    def removeModel(path: String): js.Promise[ModelArtifactsInfo] = js.native
  }
  object ModelStoreManager {
    
    @scala.inline
    def apply(
      listModels: () => js.Promise[StringDictionary[ModelArtifactsInfo]],
      removeModel: String => js.Promise[ModelArtifactsInfo]
    ): ModelStoreManager = {
      val __obj = js.Dynamic.literal(listModels = js.Any.fromFunction0(listModels), removeModel = js.Any.fromFunction1(removeModel))
      __obj.asInstanceOf[ModelStoreManager]
    }
    
    @scala.inline
    implicit class ModelStoreManagerMutableBuilder[Self <: ModelStoreManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setListModels(value: () => js.Promise[StringDictionary[ModelArtifactsInfo]]): Self = StObject.set(x, "listModels", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveModel(value: String => js.Promise[ModelArtifactsInfo]): Self = StObject.set(x, "removeModel", js.Any.fromFunction1(value))
    }
  }
  
  type OnProgressCallback = js.Function1[/* fraction */ Double, Unit]
  
  @js.native
  trait RequestDetails extends StObject {
    
    /**
      * Is this request for a binary file (as opposed to a json file)
      */
    var isBinary: js.UndefOr[Boolean] = js.native
  }
  object RequestDetails {
    
    @scala.inline
    def apply(): RequestDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestDetails]
    }
    
    @scala.inline
    implicit class RequestDetailsMutableBuilder[Self <: RequestDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsBinary(value: Boolean): Self = StObject.set(x, "isBinary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBinaryUndefined: Self = StObject.set(x, "isBinary", js.undefined)
    }
  }
  
  @js.native
  trait SaveConfig extends StObject {
    
    /**
      * Whether the optimizer will be saved (if exists).
      *
      * Default: `false`.
      */
    var includeOptimizer: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to save only the trainable weights of the model, ignoring the
      * non-trainable ones.
      */
    var trainableOnly: js.UndefOr[Boolean] = js.native
  }
  object SaveConfig {
    
    @scala.inline
    def apply(): SaveConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SaveConfig]
    }
    
    @scala.inline
    implicit class SaveConfigMutableBuilder[Self <: SaveConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeOptimizer(value: Boolean): Self = StObject.set(x, "includeOptimizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeOptimizerUndefined: Self = StObject.set(x, "includeOptimizer", js.undefined)
      
      @scala.inline
      def setTrainableOnly(value: Boolean): Self = StObject.set(x, "trainableOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrainableOnlyUndefined: Self = StObject.set(x, "trainableOnly", js.undefined)
    }
  }
  
  type SaveHandler = js.Function1[/* modelArtifact */ ModelArtifacts, js.Promise[SaveResult]]
  
  @js.native
  trait SaveResult extends StObject {
    
    /**
      * Error messages and related data (if any).
      */
    var errors: js.UndefOr[js.Array[js.Object | String]] = js.native
    
    /**
      * Information about the model artifacts saved.
      */
    var modelArtifactsInfo: ModelArtifactsInfo = js.native
    
    /**
      * HTTP responses from the server that handled the model-saving request (if
      * any). This is applicable only to server-based saving routes.
      */
    var responses: js.UndefOr[js.Array[Response]] = js.native
  }
  object SaveResult {
    
    @scala.inline
    def apply(modelArtifactsInfo: ModelArtifactsInfo): SaveResult = {
      val __obj = js.Dynamic.literal(modelArtifactsInfo = modelArtifactsInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[SaveResult]
    }
    
    @scala.inline
    implicit class SaveResultMutableBuilder[Self <: SaveResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[js.Object | String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      @scala.inline
      def setErrorsVarargs(value: (js.Object | String)*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setModelArtifactsInfo(value: ModelArtifactsInfo): Self = StObject.set(x, "modelArtifactsInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponses(value: js.Array[Response]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
      
      @scala.inline
      def setResponsesVarargs(value: Response*): Self = StObject.set(x, "responses", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TrainingConfig extends StObject {
    
    /** Loss function(s) for the model's output(s). */
    var loss: String | js.Array[String] | StringDictionary[String] = js.native
    
    var loss_weights: js.UndefOr[js.Array[Double] | StringDictionary[Double]] = js.native
    
    /** Metric function(s) for the model's output(s). */
    var metrics: js.UndefOr[js.Array[String] | StringDictionary[String]] = js.native
    
    var sample_weight_mode: js.UndefOr[String] = js.native
    
    var weighted_metrics: js.UndefOr[js.Array[String]] = js.native
  }
  object TrainingConfig {
    
    @scala.inline
    def apply(loss: String | js.Array[String] | StringDictionary[String]): TrainingConfig = {
      val __obj = js.Dynamic.literal(loss = loss.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrainingConfig]
    }
    
    @scala.inline
    implicit class TrainingConfigMutableBuilder[Self <: TrainingConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoss(value: String | js.Array[String] | StringDictionary[String]): Self = StObject.set(x, "loss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLossVarargs(value: String*): Self = StObject.set(x, "loss", js.Array(value :_*))
      
      @scala.inline
      def setLoss_weights(value: js.Array[Double] | StringDictionary[Double]): Self = StObject.set(x, "loss_weights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoss_weightsUndefined: Self = StObject.set(x, "loss_weights", js.undefined)
      
      @scala.inline
      def setLoss_weightsVarargs(value: Double*): Self = StObject.set(x, "loss_weights", js.Array(value :_*))
      
      @scala.inline
      def setMetrics(value: js.Array[String] | StringDictionary[String]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      @scala.inline
      def setMetricsVarargs(value: String*): Self = StObject.set(x, "metrics", js.Array(value :_*))
      
      @scala.inline
      def setSample_weight_mode(value: String): Self = StObject.set(x, "sample_weight_mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSample_weight_modeUndefined: Self = StObject.set(x, "sample_weight_mode", js.undefined)
      
      @scala.inline
      def setWeighted_metrics(value: js.Array[String]): Self = StObject.set(x, "weighted_metrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeighted_metricsUndefined: Self = StObject.set(x, "weighted_metrics", js.undefined)
      
      @scala.inline
      def setWeighted_metricsVarargs(value: String*): Self = StObject.set(x, "weighted_metrics", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.model
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.optimizer
  */
  trait WeightGroup extends StObject
  object WeightGroup {
    
    @scala.inline
    def model: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.model = "model".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.model]
    
    @scala.inline
    def optimizer: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.optimizer = "optimizer".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.optimizer]
  }
  
  type WeightsManifestConfig = js.Array[WeightsManifestGroupConfig]
  
  @js.native
  trait WeightsManifestEntry extends StObject {
    
    /**
      * Data type of the weight.
      */
    var dtype: float32 | int32 | bool | string | complex64 = js.native
    
    /**
      * Type of the weight.
      *
      * Optional.
      *
      * The value 'optimizer' indicates the weight belongs to an optimizer
      * (i.e., used only during model training and not during inference).
      */
    var group: js.UndefOr[WeightGroup] = js.native
    
    /**
      * Name of the weight, e.g., 'Dense_1/bias'
      */
    var name: String = js.native
    
    /**
      * Information for dequantization of the weight.
      */
    var quantization: js.UndefOr[Dtype] = js.native
    
    /**
      * Shape of the weight.
      */
    var shape: js.Array[Double] = js.native
  }
  object WeightsManifestEntry {
    
    @scala.inline
    def apply(dtype: float32 | int32 | bool | string | complex64, name: String, shape: js.Array[Double]): WeightsManifestEntry = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[WeightsManifestEntry]
    }
    
    @scala.inline
    implicit class WeightsManifestEntryMutableBuilder[Self <: WeightsManifestEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDtype(value: float32 | int32 | bool | string | complex64): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroup(value: WeightGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantization(value: Dtype): Self = StObject.set(x, "quantization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantizationUndefined: Self = StObject.set(x, "quantization", js.undefined)
      
      @scala.inline
      def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value :_*))
    }
  }
  
  @js.native
  trait WeightsManifestGroupConfig extends StObject {
    
    /**
      * An ordered list of paths.
      *
      * Paths are intentionally abstract in order to be general. For example, they
      * can be relative URL paths or relative paths on the file system.
      */
    var paths: js.Array[String] = js.native
    
    /**
      * Specifications of the weights stored in the paths.
      */
    var weights: js.Array[WeightsManifestEntry] = js.native
  }
  object WeightsManifestGroupConfig {
    
    @scala.inline
    def apply(paths: js.Array[String], weights: js.Array[WeightsManifestEntry]): WeightsManifestGroupConfig = {
      val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], weights = weights.asInstanceOf[js.Any])
      __obj.asInstanceOf[WeightsManifestGroupConfig]
    }
    
    @scala.inline
    implicit class WeightsManifestGroupConfigMutableBuilder[Self <: WeightsManifestGroupConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
      
      @scala.inline
      def setWeights(value: js.Array[WeightsManifestEntry]): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightsVarargs(value: WeightsManifestEntry*): Self = StObject.set(x, "weights", js.Array(value :_*))
    }
  }
}
