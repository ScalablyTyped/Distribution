package typings.tensorflowTfjsLayers.distLayersRecurrentMod

import typings.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typings.tensorflowTfjsCore.distSerializationMod.SerializableConstructor
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsLayers.distEngineTopologyMod.InputSpec
import typings.tensorflowTfjsLayers.distEngineTopologyMod.Layer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "RNN")
@js.native
open class RNN_ protected () extends Layer {
  def this(args: RNNLayerArgs) = this()
  
  val cell: RNNCell = js.native
  
  def getInitialState(inputs: Tensor[Rank]): js.Array[Tensor[Rank]] = js.native
  
  def getStates(): js.Array[Tensor[Rank]] = js.native
  
  val goBackwards: Boolean = js.native
  
  /* protected */ var keptStates: js.Array[js.Array[Tensor[Rank]]] = js.native
  
  /* private */ var numConstants: Any = js.native
  
  def resetStates(states: js.Array[Tensor[Rank]]): Unit = js.native
  def resetStates(states: js.Array[Tensor[Rank]], training: Boolean): Unit = js.native
  def resetStates(states: Unit, training: Boolean): Unit = js.native
  def resetStates(states: Tensor[Rank]): Unit = js.native
  def resetStates(states: Tensor[Rank], training: Boolean): Unit = js.native
  
  val returnSequences: Boolean = js.native
  
  val returnState: Boolean = js.native
  
  def setStates(states: js.Array[Tensor[Rank]]): Unit = js.native
  
  var stateSpec: js.Array[InputSpec] = js.native
  
  /**
    * Get the current state tensors of the RNN.
    *
    * If the state hasn't been set, return an array of `null`s of the correct
    * length.
    */
  def states: js.Array[Tensor[Rank]] = js.native
  
  /* protected */ var states_ : js.Array[Tensor[Rank]] = js.native
  
  def states_=(s: js.Array[Tensor[Rank]]): Unit = js.native
  
  val unroll: Boolean = js.native
}
/* static members */
object RNN_ {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "RNN")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "RNN.className")
  @js.native
  def className: String = js.native
  inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  
  /** @nocollapse */
  inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[T]
}
