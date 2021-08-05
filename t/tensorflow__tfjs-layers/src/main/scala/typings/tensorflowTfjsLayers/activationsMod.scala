package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsLayers.activationConfigMod.ActivationIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activationsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/activations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/activations", "Activation")
  @js.native
  abstract class Activation () extends Serializable {
    
    @JSName("apply")
    def apply(tensor: Tensor[Rank]): Tensor[Rank] = js.native
    @JSName("apply")
    def apply(tensor: Tensor[Rank], axis: Double): Tensor[Rank] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/activations", "Elu")
  @js.native
  class Elu () extends Activation
  /* static members */
  object Elu {
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/activations", "Elu.className")
    @js.native
    val className: /* "elu" */ String = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/activations", "HardSigmoid")
  @js.native
  class HardSigmoid () extends Activation
  /* static members */
  object HardSigmoid {
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/activations", "HardSigmoid.className")
    @js.native
    val className: /* "hardSigmoid" */ String = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/activations", "Linear")
  @js.native
  class Linear () extends Activation
  /* static members */
  object Linear {
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/activations", "Linear.className")
    @js.native
    val className: /* "linear" */ String = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/activations", "LogSoftmax")
  @js.native
  class LogSoftmax () extends Activation
  /* static members */
  object LogSoftmax {
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/activations", "LogSoftmax.className")
    @js.native
    val className: /* "logSoftmax" */ String = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/activations", "Relu")
  @js.native
  class Relu () extends Activation
  /* static members */
  object Relu {
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/activations", "Relu.className")
    @js.native
    val className: /* "relu" */ String = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/activations", "Relu6")
  @js.native
  class Relu6 () extends Activation
  /* static members */
  object Relu6 {
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/activations", "Relu6.className")
    @js.native
    val className: /* "relu6" */ String = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/activations", "Selu")
  @js.native
  class Selu () extends Activation
  /* static members */
  object Selu {
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/activations", "Selu.className")
    @js.native
    val className: /* "selu" */ String = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/activations", "Sigmoid")
  @js.native
  class Sigmoid () extends Activation
  /* static members */
  object Sigmoid {
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/activations", "Sigmoid.className")
    @js.native
    val className: /* "sigmoid" */ String = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/activations", "Softmax")
  @js.native
  class Softmax () extends Activation
  /* static members */
  object Softmax {
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/activations", "Softmax.className")
    @js.native
    val className: /* "softmax" */ String = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/activations", "Softplus")
  @js.native
  class Softplus () extends Activation
  /* static members */
  object Softplus {
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/activations", "Softplus.className")
    @js.native
    val className: /* "softplus" */ String = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/activations", "Softsign")
  @js.native
  class Softsign () extends Activation
  /* static members */
  object Softsign {
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/activations", "Softsign.className")
    @js.native
    val className: /* "softsign" */ String = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/activations", "Swish")
  @js.native
  class Swish () extends Activation
  /* static members */
  object Swish {
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/activations", "Swish.className")
    @js.native
    val className: /* "swish" */ String = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/activations", "Tanh")
  @js.native
  class Tanh () extends Activation
  /* static members */
  object Tanh {
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/activations", "Tanh.className")
    @js.native
    val className: /* "tanh" */ String = js.native
  }
  
  inline def deserializeActivation(config: ConfigDict): Activation = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeActivation")(config.asInstanceOf[js.Any]).asInstanceOf[Activation]
  inline def deserializeActivation(config: ConfigDict, customObjects: ConfigDict): Activation = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeActivation")(config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[Activation]
  
  inline def getActivation(identifier: ConfigDict): Activation = ^.asInstanceOf[js.Dynamic].applyDynamic("getActivation")(identifier.asInstanceOf[js.Any]).asInstanceOf[Activation]
  inline def getActivation(identifier: ActivationIdentifier): Activation = ^.asInstanceOf[js.Dynamic].applyDynamic("getActivation")(identifier.asInstanceOf[js.Any]).asInstanceOf[Activation]
  inline def getActivation(identifier: Activation): Activation = ^.asInstanceOf[js.Dynamic].applyDynamic("getActivation")(identifier.asInstanceOf[js.Any]).asInstanceOf[Activation]
  
  inline def serializeActivation(activation: Activation): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeActivation")(activation.asInstanceOf[js.Any]).asInstanceOf[String]
}
