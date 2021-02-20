package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import typings.tensorflowTfjsCore.typesMod.IOHandler
import typings.tensorflowTfjsCore.typesMod.LoadOptions
import typings.tensorflowTfjsCore.typesMod.WeightsManifestConfig
import typings.tensorflowTfjsCore.typesMod.WeightsManifestGroupConfig
import typings.tensorflowTfjsLayers.topologyMod.Layer
import typings.tensorflowTfjsLayers.trainingMod.LayersModel
import typings.tensorflowTfjsLayers.typesMod.PyJsonDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/models", "Sequential")
  @js.native
  class Sequential () extends LayersModel {
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
    
    var checkShape: js.Any = js.native
    
    var model: js.Any = js.native
    
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
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/models", "Sequential.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
    @JSImport("@tensorflow/tfjs-layers/dist/models", "Sequential.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](
      cls: SerializableConstructor[T],
      config: ConfigDict,
      customObjects: js.UndefOr[scala.Nothing],
      fastWeightInit: Boolean
    ): T = js.native
    @JSImport("@tensorflow/tfjs-layers/dist/models", "Sequential.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
    @JSImport("@tensorflow/tfjs-layers/dist/models", "Sequential.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](
      cls: SerializableConstructor[T],
      config: ConfigDict,
      customObjects: ConfigDict,
      fastWeightInit: Boolean
    ): T = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/models", "loadLayersModelFromIOHandler")
  @js.native
  def loadLayersModelFromIOHandler(handler: IOHandler): js.Promise[LayersModel] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/models", "loadLayersModelFromIOHandler")
  @js.native
  def loadLayersModelFromIOHandler(handler: IOHandler, customObjects: js.UndefOr[scala.Nothing], options: LoadOptions): js.Promise[LayersModel] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/models", "loadLayersModelFromIOHandler")
  @js.native
  def loadLayersModelFromIOHandler(handler: IOHandler, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/models", "loadLayersModelFromIOHandler")
  @js.native
  def loadLayersModelFromIOHandler(handler: IOHandler, customObjects: ConfigDict, options: LoadOptions): js.Promise[LayersModel] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/models", "loadLayersModelInternal")
  @js.native
  def loadLayersModelInternal(pathOrIOHandler: String): js.Promise[LayersModel] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/models", "loadLayersModelInternal")
  @js.native
  def loadLayersModelInternal(pathOrIOHandler: String, options: LoadOptions): js.Promise[LayersModel] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/models", "loadLayersModelInternal")
  @js.native
  def loadLayersModelInternal(pathOrIOHandler: IOHandler): js.Promise[LayersModel] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/models", "loadLayersModelInternal")
  @js.native
  def loadLayersModelInternal(pathOrIOHandler: IOHandler, options: LoadOptions): js.Promise[LayersModel] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/models", "modelFromJSON")
  @js.native
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[LayersModel] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/models", "modelFromJSON")
  @js.native
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/models", "modelFromJSON")
  @js.native
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict): js.Promise[LayersModel] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/models", "modelFromJSON")
  @js.native
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
  
  @js.native
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
    var modelTopology: PyJsonDict = js.native
    
    /**
      * Path to prepend to the paths in `weightManifest` before fetching.
      *
      * The path may optionally end in a slash ('/').
      */
    var pathPrefix: js.UndefOr[String] = js.native
    
    /**
      * A weights manifest in TensorFlow.js format.
      */
    var weightsManifest: js.UndefOr[WeightsManifestConfig] = js.native
  }
  object ModelAndWeightsConfig {
    
    @scala.inline
    def apply(modelTopology: PyJsonDict): ModelAndWeightsConfig = {
      val __obj = js.Dynamic.literal(modelTopology = modelTopology.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelAndWeightsConfig]
    }
    
    @scala.inline
    implicit class ModelAndWeightsConfigMutableBuilder[Self <: ModelAndWeightsConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModelTopology(value: PyJsonDict): Self = StObject.set(x, "modelTopology", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathPrefix(value: String): Self = StObject.set(x, "pathPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathPrefixUndefined: Self = StObject.set(x, "pathPrefix", js.undefined)
      
      @scala.inline
      def setWeightsManifest(value: WeightsManifestConfig): Self = StObject.set(x, "weightsManifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightsManifestUndefined: Self = StObject.set(x, "weightsManifest", js.undefined)
      
      @scala.inline
      def setWeightsManifestVarargs(value: WeightsManifestGroupConfig*): Self = StObject.set(x, "weightsManifest", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ModelPredictArgs extends StObject {
    
    /**
      * Optional. Batch size (Integer). If unspecified, it will default to 32.
      */
    var batchSize: js.UndefOr[Double] = js.native
    
    /**
      * Optional. Verbosity mode. Defaults to false.
      */
    var verbose: js.UndefOr[Boolean] = js.native
  }
  object ModelPredictArgs {
    
    @scala.inline
    def apply(): ModelPredictArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelPredictArgs]
    }
    
    @scala.inline
    implicit class ModelPredictArgsMutableBuilder[Self <: ModelPredictArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  @js.native
  trait SequentialArgs extends StObject {
    
    /** Stack of layers for the model. */
    var layers: js.UndefOr[js.Array[Layer]] = js.native
    
    /** The name of this model. */
    var name: js.UndefOr[String] = js.native
  }
  object SequentialArgs {
    
    @scala.inline
    def apply(): SequentialArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SequentialArgs]
    }
    
    @scala.inline
    implicit class SequentialArgsMutableBuilder[Self <: SequentialArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLayers(value: js.Array[Layer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      @scala.inline
      def setLayersVarargs(value: Layer*): Self = StObject.set(x, "layers", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
