package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typings.tensorflowTfjsCore.distSerializationMod.SerializableConstructor
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsLayers.distEngineTopologyMod.Layer
import typings.tensorflowTfjsLayers.distEngineTopologyMod.LayerArgs
import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.BidirectionalMergeMode
import typings.tensorflowTfjsLayers.distLayersRecurrentMod.RNN_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLayersWrappersMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/wrappers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/wrappers", "Bidirectional")
  @js.native
  open class Bidirectional protected () extends Wrapper {
    def this(args: BidirectionalLayerArgs) = this()
    
    /* private */ var _trainable: Any = js.native
    
    /* private */ var backwardLayer: Any = js.native
    
    /* private */ var forwardLayer: Any = js.native
    
    var mergeMode: BidirectionalMergeMode = js.native
    
    /* private */ var numConstants: Any = js.native
    
    def resetStates(states: js.Array[Tensor[Rank]]): Unit = js.native
    def resetStates(states: Tensor[Rank]): Unit = js.native
    
    /* private */ var returnSequences: Any = js.native
    
    /* private */ var returnState: Any = js.native
  }
  /* static members */
  object Bidirectional {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/wrappers", "Bidirectional")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/wrappers", "Bidirectional.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/wrappers", "TimeDistributed")
  @js.native
  open class TimeDistributed protected () extends Wrapper {
    def this(args: WrapperLayerArgs) = this()
  }
  /* static members */
  object TimeDistributed {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/wrappers", "TimeDistributed")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/wrappers", "TimeDistributed.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  /* note: abstract class */ @JSImport("@tensorflow/tfjs-layers/dist/layers/wrappers", "Wrapper")
  @js.native
  open class Wrapper protected () extends Layer {
    def this(args: WrapperLayerArgs) = this()
    
    val layer: Layer = js.native
  }
  /* static members */
  object Wrapper {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/wrappers", "Wrapper")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[T]
  }
  
  inline def checkBidirectionalMergeMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkBidirectionalMergeMode")().asInstanceOf[Unit]
  inline def checkBidirectionalMergeMode(value: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkBidirectionalMergeMode")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait BidirectionalLayerArgs
    extends StObject
       with WrapperLayerArgs {
    
    /**
      * The instance of an `RNN` layer to be wrapped.
      */
    @JSName("layer")
    var layer_BidirectionalLayerArgs: RNN_
    
    /**
      * Mode by which outputs of the forward and backward RNNs are
      * combined. If `null` or `undefined`, the output will not be
      * combined, they will be returned as an `Array`.
      *
      * If `undefined` (i.e., not provided), defaults to `'concat'`.
      */
    var mergeMode: js.UndefOr[BidirectionalMergeMode] = js.undefined
  }
  object BidirectionalLayerArgs {
    
    inline def apply(layer: RNN_): BidirectionalLayerArgs = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
      __obj.asInstanceOf[BidirectionalLayerArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BidirectionalLayerArgs] (val x: Self) extends AnyVal {
      
      inline def setLayer(value: RNN_): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setMergeMode(value: BidirectionalMergeMode): Self = StObject.set(x, "mergeMode", value.asInstanceOf[js.Any])
      
      inline def setMergeModeUndefined: Self = StObject.set(x, "mergeMode", js.undefined)
    }
  }
  
  trait WrapperLayerArgs
    extends StObject
       with LayerArgs {
    
    /**
      * The layer to be wrapped.
      */
    var layer: Layer
  }
  object WrapperLayerArgs {
    
    inline def apply(layer: Layer): WrapperLayerArgs = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrapperLayerArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WrapperLayerArgs] (val x: Self) extends AnyVal {
      
      inline def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    }
  }
}
