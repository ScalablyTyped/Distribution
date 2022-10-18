package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.elu_
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.hard_sigmoid
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.linear
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mish
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu6
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu_
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.selu
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sigmoid
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softmax_
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softplus
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softsign
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.swish
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tanh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKerasFormatActivationConfigMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/activation_config", "activationOptions")
  @js.native
  val activationOptions: js.Array[
    linear | relu_ | elu_ | relu6 | sigmoid | hard_sigmoid | selu | softmax_ | softplus | softsign | tanh | swish | mish
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
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.swish
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mish
  */
  trait ActivationIdentifier extends StObject
  object ActivationIdentifier {
    
    inline def elu: elu_ = "elu".asInstanceOf[elu_]
    
    inline def hardSigmoid: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.hardSigmoid = "hardSigmoid".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.hardSigmoid]
    
    inline def linear: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.linear = "linear".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.linear]
    
    inline def mish: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mish = "mish".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mish]
    
    inline def relu: relu_ = "relu".asInstanceOf[relu_]
    
    inline def relu6: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu6 = "relu6".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu6]
    
    inline def selu: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.selu = "selu".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.selu]
    
    inline def sigmoid: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sigmoid = "sigmoid".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sigmoid]
    
    inline def softmax: softmax_ = "softmax".asInstanceOf[softmax_]
    
    inline def softplus: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softplus = "softplus".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softplus]
    
    inline def softsign: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softsign = "softsign".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softsign]
    
    inline def swish: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.swish = "swish".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.swish]
    
    inline def tanh: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tanh = "tanh".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tanh]
  }
  
  type ActivationSerialization = /* import warning: importer.ImportType#apply Failed type conversion: std.Array<'linear' | 'relu' | 'elu' | 'relu6' | 'sigmoid' | 'hard_sigmoid' | 'selu' | 'softmax' | 'softplus' | 'softsign' | 'tanh' | 'swish' | 'mish'>[number] */ js.Any
}
