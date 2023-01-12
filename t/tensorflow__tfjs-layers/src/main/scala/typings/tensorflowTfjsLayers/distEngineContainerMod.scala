package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.StringDictionary
import typings.std.Set
import typings.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typings.tensorflowTfjsCore.distSerializationMod.SerializableConstructor
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsLayers.distEngineTopologyMod.Layer
import typings.tensorflowTfjsLayers.distEngineTopologyMod.Node
import typings.tensorflowTfjsLayers.distEngineTopologyMod.SymbolicTensor
import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.distKerasFormatTypesMod.PyJsonDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEngineContainerMod {
  
  /* note: abstract class */ @JSImport("@tensorflow/tfjs-layers/dist/engine/container", "Container")
  @js.native
  open class Container protected () extends Layer {
    def this(args: ContainerArgs) = this()
    
    /**
      * Builds a map of internal node keys to node ordering.
      * Used in serializaion a node orderings may change as unused nodes are
      * dropped. Porting Note:  This helper method was pulled out of getConfig to
      * improve readability.
      * @param layers An array of Layers in the model.
      * @returns Map of Node Keys to index order within the layer.
      */
    /* private */ var buildNodeConversionMap: Any = js.native
    
    var containerNodes: Set[String] = js.native
    
    /* protected */ var feedInputNames: js.Array[String] = js.native
    
    var feedInputShapes: js.Array[Shape] = js.native
    
    /* protected */ var feedOutputNames: js.Array[String] = js.native
    
    /**
      * Retrieves a layer based on either its name (unique) or index.
      *
      * Indices are based on order of horizontal graph traversal (bottom-up).
      *
      * If both `name` and `index` are specified, `index` takes precedence.
      *
      * @param name Name of layer.
      * @param index Index of layer.
      * @returns A Layer instance.
      * @throws ValueError: In case of invalid layer name or index.
      *
      * @doc {
      *    heading: 'Layers',
      *    subheading: 'Classes',
      *    namespace: 'layers',
      *    subclasses: ['LayersModel']
      * }
      */
    def getLayer(): Layer = js.native
    def getLayer(name: String): Layer = js.native
    def getLayer(name: String, index: Double): Layer = js.native
    def getLayer(name: Unit, index: Double): Layer = js.native
    
    var inputLayers: js.Array[Layer] = js.native
    
    var inputLayersNodeIndices: js.Array[Double] = js.native
    
    var inputLayersTensorIndices: js.Array[Double] = js.native
    
    var inputNames: js.Array[String] = js.native
    
    var inputs: js.Array[SymbolicTensor] = js.native
    
    var internalContainerRefs: js.Array[Container] = js.native
    
    /* protected */ var internalInputShapes: js.Array[Shape] = js.native
    
    /* protected */ var internalOutputShapes: js.Array[Shape] = js.native
    
    var layers: js.Array[Layer] = js.native
    
    var layersByDepth: StringDictionary[js.Array[Layer]] = js.native
    
    /**
      * Loads all layer weights from a JSON object.
      *
      * Porting Note: HDF5 weight files cannot be directly loaded in JavaScript /
      *   TypeScript. The utility script at `scripts/pykeras.py` offers means
      *   to convert them into JSON strings compatible with this method.
      * Porting Note: TensorFlow.js Layers supports only loading by name currently.
      *
      * @param weights A JSON mapping weight names to weight values as nested
      *   arrays of numbers, or a `NamedTensorMap`, i.e., a JSON mapping weight
      *   names to `tf.Tensor` objects.
      * @param strict Require that the provided weights exactly match those
      *   required by the container.  Default: `true`.  Passing `false` means that
      *   extra weights and missing weights will be silently ignored.
      */
    def loadWeights(weights: NamedTensorMap): Unit = js.native
    def loadWeights(weights: NamedTensorMap, strict: Boolean): Unit = js.native
    
    var nodesByDepth: StringDictionary[js.Array[Node]] = js.native
    
    var outputLayers: js.Array[Layer] = js.native
    
    var outputLayersNodeIndices: js.Array[Double] = js.native
    
    var outputLayersTensorIndices: js.Array[Double] = js.native
    
    var outputNames: js.Array[String] = js.native
    
    var outputs: js.Array[SymbolicTensor] = js.native
    
    /**
      * Computes output tensors for new inputs.
      *
      * Note:
      *   - Expects `inputs` to be a list (potentially with 1 element).
      *
      * @param inputs List of tensors
      * @param masks List of masks (tensors or null).
      * @return Three lists: outputTensors, outputMasks, outputShapes
      */
    /* protected */ def runInternalGraph(inputs: js.Array[Tensor[Rank]]): js.Tuple3[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]], js.Array[Shape]] = js.native
    /* protected */ def runInternalGraph(inputs: js.Array[Tensor[Rank]], masks: js.Array[Tensor[Rank]]): js.Tuple3[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]], js.Array[Shape]] = js.native
    
    /**
      * Returns a JSON string containing the network configuration.
      *
      * To load a network from a JSON save file, use
      * models.modelFromJSON(jsonString);
      * @param extraJsonArgs Unused in tfjs-layers, maintained for PyKeras
      * @param returnString Whether the return value should be stringified
      *    (default: `true`).
      * @returns a JSON string if `returnString` (default), or a JSON object if
      *   `!returnString`.
      */
    def toJSON(): String | PyJsonDict = js.native
    def toJSON(unused: Any): String | PyJsonDict = js.native
    def toJSON(unused: Any, returnString: Boolean): String | PyJsonDict = js.native
    def toJSON(unused: Unit, returnString: Boolean): String | PyJsonDict = js.native
    
    /**
      * Util shared between different serialization methods.
      * @returns LayersModel config with Keras version information added.
      */
    /* protected */ def updatedConfig(): ConfigDict = js.native
  }
  /* static members */
  object Container {
    
    @JSImport("@tensorflow/tfjs-layers/dist/engine/container", "Container")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Instantiates a LayersModel from its config (output of `get_config()`).
      * @param cls the class to create
      * @param config LayersModel config dictionary.
      * @param customObjects An optional dictionary of custom objects.
      * @param fastWeightInit Optional flag to use fast weight initialization
      *   during deserialization. This is applicable to cases in which
      *   the initialization will be immediately overwritten by loaded weight
      *   values. Default: `false`.
      * @returns A LayersModel instance.
      * @throws ValueError: In case of improperly formatted config dict.
      */
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
  
  trait ContainerArgs extends StObject {
    
    var inputs: SymbolicTensor | js.Array[SymbolicTensor]
    
    var name: js.UndefOr[String] = js.undefined
    
    var outputs: SymbolicTensor | js.Array[SymbolicTensor]
  }
  object ContainerArgs {
    
    inline def apply(
      inputs: SymbolicTensor | js.Array[SymbolicTensor],
      outputs: SymbolicTensor | js.Array[SymbolicTensor]
    ): ContainerArgs = {
      val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContainerArgs] (val x: Self) extends AnyVal {
      
      inline def setInputs(value: SymbolicTensor | js.Array[SymbolicTensor]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsVarargs(value: SymbolicTensor*): Self = StObject.set(x, "inputs", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOutputs(value: SymbolicTensor | js.Array[SymbolicTensor]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setOutputsVarargs(value: SymbolicTensor*): Self = StObject.set(x, "outputs", js.Array(value*))
    }
  }
}
