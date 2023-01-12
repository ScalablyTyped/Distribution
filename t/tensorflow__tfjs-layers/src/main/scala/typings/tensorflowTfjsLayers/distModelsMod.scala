package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distIoTypesMod.IOHandler
import typings.tensorflowTfjsCore.distIoTypesMod.LoadOptions
import typings.tensorflowTfjsCore.distIoTypesMod.WeightsManifestConfig
import typings.tensorflowTfjsCore.distIoTypesMod.WeightsManifestGroupConfig
import typings.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typings.tensorflowTfjsCore.distSerializationMod.SerializableConstructor
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsLayers.distEngineTopologyMod.Layer
import typings.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel
import typings.tensorflowTfjsLayers.distKerasFormatTypesMod.PyJsonDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModelsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/models", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/models", "Sequential")
  @js.native
  open class Sequential () extends LayersModel {
    def this(args: SequentialArgs) = this()
    
    /**
      * Adds a layer instance on top of the layer stack.
      *
      * ```js
      *  const model = tf.sequential();
      *  model.add(tf.layers.dense({units: 8, inputShape: [1]}));
      *  model.add(tf.layers.dense({units: 4, activation: 'relu6'}));
      *  model.add(tf.layers.dense({units: 1, activation: 'relu6'}));
      *  // Note that the untrained model is random at this point.
      *  model.predict(tf.randomNormal([10, 1])).print();
      * ```
      * @param layer Layer instance.
      *
      * @exception ValueError In case the `layer` argument does not know its
      * input shape.
      * @exception ValueError In case the `layer` argument has multiple output
      *   tensors, or is already connected somewhere else (forbidden in
      *   `Sequential` models).
      *
      * @doc {heading: 'Models', subheading: 'Classes'}
      */
    def add(layer: Layer): Unit = js.native
    
    def build(): Unit = js.native
    
    /* private */ var checkShape: Any = js.native
    
    /* private */ var model: Any = js.native
    
    /**
      * Removes the last layer in the model.
      *
      * @exception TypeError if there are no layers in the model.
      */
    def pop(): Unit = js.native
    
    def predict(x: js.Array[Tensor[Rank]], args: ModelPredictArgs): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    def predict(x: Tensor[Rank], args: ModelPredictArgs): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  }
  /* static members */
  object Sequential {
    
    @JSImport("@tensorflow/tfjs-layers/dist/models", "Sequential")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/models", "Sequential.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: Unit, fastWeightInit: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def fromConfig[T /* <: Serializable */](
      cls: SerializableConstructor[T],
      config: ConfigDict,
      customObjects: ConfigDict,
      fastWeightInit: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[T]
  }
  
  inline def loadLayersModel(pathOrIOHandler: String): js.Promise[LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadLayersModel")(pathOrIOHandler.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LayersModel]]
  inline def loadLayersModel(pathOrIOHandler: String, options: LoadOptions): js.Promise[LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadLayersModel")(pathOrIOHandler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LayersModel]]
  inline def loadLayersModel(pathOrIOHandler: IOHandler): js.Promise[LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadLayersModel")(pathOrIOHandler.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LayersModel]]
  inline def loadLayersModel(pathOrIOHandler: IOHandler, options: LoadOptions): js.Promise[LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadLayersModel")(pathOrIOHandler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LayersModel]]
  
  inline def loadLayersModelFromIOHandler(handler: IOHandler): js.Promise[LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadLayersModelFromIOHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LayersModel]]
  inline def loadLayersModelFromIOHandler(handler: IOHandler, customObjects: Unit, options: LoadOptions): js.Promise[LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadLayersModelFromIOHandler")(handler.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LayersModel]]
  inline def loadLayersModelFromIOHandler(handler: IOHandler, customObjects: ConfigDict): js.Promise[LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadLayersModelFromIOHandler")(handler.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LayersModel]]
  inline def loadLayersModelFromIOHandler(handler: IOHandler, customObjects: ConfigDict, options: LoadOptions): js.Promise[LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadLayersModelFromIOHandler")(handler.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LayersModel]]
  
  inline def modelFromJSON(modelAndWeightsConfig: PyJsonDict): js.Promise[LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LayersModel]]
  inline def modelFromJSON(modelAndWeightsConfig: PyJsonDict, customObjects: ConfigDict): js.Promise[LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LayersModel]]
  inline def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LayersModel]]
  inline def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: ConfigDict): js.Promise[LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LayersModel]]
  
  trait ModelAndWeightsConfig extends StObject {
    
    /**
      * A JSON object or JSON string containing the model config.
      *
      * This can be either of the following two formats:
      *   - A model archiecture-only config,  i.e., a format consistent with the
      *     return value of`keras.Model.to_json()`.
      *   - A full model config, containing not only model architecture, but also
      *     training options and state, i.e., a format consistent with the return
      *     value of `keras.models.save_model()`.
      */
    var modelTopology: PyJsonDict
    
    /**
      * Path to prepend to the paths in `weightManifest` before fetching.
      *
      * The path may optionally end in a slash ('/').
      */
    var pathPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * A weights manifest in TensorFlow.js format.
      */
    var weightsManifest: js.UndefOr[WeightsManifestConfig] = js.undefined
  }
  object ModelAndWeightsConfig {
    
    inline def apply(modelTopology: PyJsonDict): ModelAndWeightsConfig = {
      val __obj = js.Dynamic.literal(modelTopology = modelTopology.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelAndWeightsConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModelAndWeightsConfig] (val x: Self) extends AnyVal {
      
      inline def setModelTopology(value: PyJsonDict): Self = StObject.set(x, "modelTopology", value.asInstanceOf[js.Any])
      
      inline def setPathPrefix(value: String): Self = StObject.set(x, "pathPrefix", value.asInstanceOf[js.Any])
      
      inline def setPathPrefixUndefined: Self = StObject.set(x, "pathPrefix", js.undefined)
      
      inline def setWeightsManifest(value: WeightsManifestConfig): Self = StObject.set(x, "weightsManifest", value.asInstanceOf[js.Any])
      
      inline def setWeightsManifestUndefined: Self = StObject.set(x, "weightsManifest", js.undefined)
      
      inline def setWeightsManifestVarargs(value: WeightsManifestGroupConfig*): Self = StObject.set(x, "weightsManifest", js.Array(value*))
    }
  }
  
  trait ModelPredictArgs extends StObject {
    
    /**
      * Optional. Batch size (Integer). If unspecified, it will default to 32.
      */
    var batchSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional. Verbosity mode. Defaults to false.
      */
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object ModelPredictArgs {
    
    inline def apply(): ModelPredictArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelPredictArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModelPredictArgs] (val x: Self) extends AnyVal {
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait SequentialArgs extends StObject {
    
    /** Stack of layers for the model. */
    var layers: js.UndefOr[js.Array[Layer]] = js.undefined
    
    /** The name of this model. */
    var name: js.UndefOr[String] = js.undefined
  }
  object SequentialArgs {
    
    inline def apply(): SequentialArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SequentialArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SequentialArgs] (val x: Self) extends AnyVal {
      
      inline def setLayers(value: js.Array[Layer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: Layer*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
