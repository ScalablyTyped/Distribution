package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.elu_
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.hard_sigmoid
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.linear
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu6
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu_
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.selu
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sigmoid
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softmax_
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softplus
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softsign
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tanh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activationConfigMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/activation_config", "activationOptions")
  @js.native
  val activationOptions: js.Array[
    linear | relu_ | elu_ | relu6 | selu | sigmoid | softmax_ | softplus | tanh | hard_sigmoid | softsign
  ] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.elu_
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.hardSigmoid
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.linear
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu_
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu6
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.selu
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sigmoid
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softmax_
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softplus
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softsign
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tanh
  */
  trait ActivationIdentifier extends StObject
  object ActivationIdentifier {
    
    @scala.inline
    def elu: elu_ = "elu".asInstanceOf[elu_]
    
    @scala.inline
    def hardSigmoid: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.hardSigmoid = "hardSigmoid".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.hardSigmoid]
    
    @scala.inline
    def linear: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.linear = "linear".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.linear]
    
    @scala.inline
    def relu: relu_ = "relu".asInstanceOf[relu_]
    
    @scala.inline
    def relu6: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu6 = "relu6".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu6]
    
    @scala.inline
    def selu: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.selu = "selu".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.selu]
    
    @scala.inline
    def sigmoid: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sigmoid = "sigmoid".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sigmoid]
    
    @scala.inline
    def softmax: softmax_ = "softmax".asInstanceOf[softmax_]
    
    @scala.inline
    def softplus: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softplus = "softplus".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softplus]
    
    @scala.inline
    def softsign: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softsign = "softsign".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softsign]
    
    @scala.inline
    def tanh: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tanh = "tanh".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tanh]
  }
  
  type ActivationSerialization = /* import warning: importer.ImportType#apply Failed type conversion: std.Array<'linear' | 'relu' | 'elu' | 'relu6' | 'selu' | 'sigmoid' | 'softmax' | 'softplus' | 'tanh' | 'hard_sigmoid' | 'softsign'>[number] */ js.Any
}
