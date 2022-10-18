package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typings.tensorflowTfjsCore.distSerializationMod.ConfigDictValue
import typings.tensorflowTfjsCore.distSerializationMod.SerializableConstructor
import typings.tensorflowTfjsCore.distTensorMod.Scalar
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.l1l2_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRegularizersMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/regularizers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/regularizers", "L1L2")
  @js.native
  open class L1L2 () extends Regularizer {
    def this(args: L1L2Args) = this()
    
    /* private */ val hasL1: Any = js.native
    
    /* private */ val hasL2: Any = js.native
    
    /* private */ val l1: Any = js.native
    
    /* private */ val l2: Any = js.native
  }
  /* static members */
  object L1L2 {
    
    @JSImport("@tensorflow/tfjs-layers/dist/regularizers", "L1L2")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/regularizers", "L1L2.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
  }
  
  /* note: abstract class */ @JSImport("@tensorflow/tfjs-layers/dist/regularizers", "Regularizer")
  @js.native
  open class Regularizer () extends Serializable {
    
    @JSName("apply")
    def apply(x: Tensor[Rank]): Scalar = js.native
  }
  
  inline def deserializeRegularizer(config: ConfigDict): Regularizer = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeRegularizer")(config.asInstanceOf[js.Any]).asInstanceOf[Regularizer]
  inline def deserializeRegularizer(config: ConfigDict, customObjects: ConfigDict): Regularizer = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeRegularizer")(config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[Regularizer]
  
  inline def getRegularizer(identifier: ConfigDict): Regularizer = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegularizer")(identifier.asInstanceOf[js.Any]).asInstanceOf[Regularizer]
  inline def getRegularizer(identifier: Regularizer): Regularizer = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegularizer")(identifier.asInstanceOf[js.Any]).asInstanceOf[Regularizer]
  inline def getRegularizer(identifier: RegularizerIdentifier): Regularizer = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegularizer")(identifier.asInstanceOf[js.Any]).asInstanceOf[Regularizer]
  
  inline def l1(): L1L2 = ^.asInstanceOf[js.Dynamic].applyDynamic("l1")().asInstanceOf[L1L2]
  inline def l1(args: L1Args): L1L2 = ^.asInstanceOf[js.Dynamic].applyDynamic("l1")(args.asInstanceOf[js.Any]).asInstanceOf[L1L2]
  
  inline def l2(args: L2Args): L1L2 = ^.asInstanceOf[js.Dynamic].applyDynamic("l2")(args.asInstanceOf[js.Any]).asInstanceOf[L1L2]
  
  inline def serializeRegularizer(constraint: Regularizer): ConfigDictValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeRegularizer")(constraint.asInstanceOf[js.Any]).asInstanceOf[ConfigDictValue]
  
  trait L1Args extends StObject {
    
    /** L1 regularization rate. Defaults to 0.01. */
    var l1: Double
  }
  object L1Args {
    
    inline def apply(l1: Double): L1Args = {
      val __obj = js.Dynamic.literal(l1 = l1.asInstanceOf[js.Any])
      __obj.asInstanceOf[L1Args]
    }
    
    extension [Self <: L1Args](x: Self) {
      
      inline def setL1(value: Double): Self = StObject.set(x, "l1", value.asInstanceOf[js.Any])
    }
  }
  
  trait L1L2Args extends StObject {
    
    /** L1 regularization rate. Defaults to 0.01. */
    var l1: js.UndefOr[Double] = js.undefined
    
    /** L2 regularization rate. Defaults to 0.01. */
    var l2: js.UndefOr[Double] = js.undefined
  }
  object L1L2Args {
    
    inline def apply(): L1L2Args = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[L1L2Args]
    }
    
    extension [Self <: L1L2Args](x: Self) {
      
      inline def setL1(value: Double): Self = StObject.set(x, "l1", value.asInstanceOf[js.Any])
      
      inline def setL1Undefined: Self = StObject.set(x, "l1", js.undefined)
      
      inline def setL2(value: Double): Self = StObject.set(x, "l2", value.asInstanceOf[js.Any])
      
      inline def setL2Undefined: Self = StObject.set(x, "l2", js.undefined)
    }
  }
  
  trait L2Args extends StObject {
    
    /** L2 regularization rate. Defaults to 0.01. */
    var l2: Double
  }
  object L2Args {
    
    inline def apply(l2: Double): L2Args = {
      val __obj = js.Dynamic.literal(l2 = l2.asInstanceOf[js.Any])
      __obj.asInstanceOf[L2Args]
    }
    
    extension [Self <: L2Args](x: Self) {
      
      inline def setL2(value: Double): Self = StObject.set(x, "l2", value.asInstanceOf[js.Any])
    }
  }
  
  type RegularizerIdentifier = l1l2_ | String
}
