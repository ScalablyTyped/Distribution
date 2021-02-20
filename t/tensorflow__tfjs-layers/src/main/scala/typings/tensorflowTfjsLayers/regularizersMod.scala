package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Scalar
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.ConfigDictValue
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.l1l2_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regularizersMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/regularizers", "L1L2")
  @js.native
  class L1L2 () extends Regularizer {
    def this(args: L1L2Args) = this()
    
    val hasL1: js.Any = js.native
    
    val hasL2: js.Any = js.native
    
    val l1: js.Any = js.native
    
    val l2: js.Any = js.native
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
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/regularizers", "L1L2.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/regularizers", "Regularizer")
  @js.native
  abstract class Regularizer () extends Serializable {
    
    @JSName("apply")
    def apply(x: Tensor[Rank]): Scalar = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/regularizers", "deserializeRegularizer")
  @js.native
  def deserializeRegularizer(config: ConfigDict): Regularizer = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/regularizers", "deserializeRegularizer")
  @js.native
  def deserializeRegularizer(config: ConfigDict, customObjects: ConfigDict): Regularizer = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/regularizers", "getRegularizer")
  @js.native
  def getRegularizer(identifier: ConfigDict): Regularizer = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/regularizers", "getRegularizer")
  @js.native
  def getRegularizer(identifier: Regularizer): Regularizer = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/regularizers", "getRegularizer")
  @js.native
  def getRegularizer(identifier: RegularizerIdentifier): Regularizer = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/regularizers", "l1")
  @js.native
  def l1(): L1L2 = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/regularizers", "l1")
  @js.native
  def l1(args: L1Args): L1L2 = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/regularizers", "l2")
  @js.native
  def l2(args: L2Args): L1L2 = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/regularizers", "serializeRegularizer")
  @js.native
  def serializeRegularizer(constraint: Regularizer): ConfigDictValue = js.native
  
  @js.native
  trait L1Args extends StObject {
    
    /** L1 regularization rate. Defaults to 0.01. */
    var l1: Double = js.native
  }
  object L1Args {
    
    @scala.inline
    def apply(l1: Double): L1Args = {
      val __obj = js.Dynamic.literal(l1 = l1.asInstanceOf[js.Any])
      __obj.asInstanceOf[L1Args]
    }
    
    @scala.inline
    implicit class L1ArgsMutableBuilder[Self <: L1Args] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setL1(value: Double): Self = StObject.set(x, "l1", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait L1L2Args extends StObject {
    
    /** L1 regularization rate. Defaults to 0.01. */
    var l1: js.UndefOr[Double] = js.native
    
    /** L2 regularization rate. Defaults to 0.01. */
    var l2: js.UndefOr[Double] = js.native
  }
  object L1L2Args {
    
    @scala.inline
    def apply(): L1L2Args = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[L1L2Args]
    }
    
    @scala.inline
    implicit class L1L2ArgsMutableBuilder[Self <: L1L2Args] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setL1(value: Double): Self = StObject.set(x, "l1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL1Undefined: Self = StObject.set(x, "l1", js.undefined)
      
      @scala.inline
      def setL2(value: Double): Self = StObject.set(x, "l2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL2Undefined: Self = StObject.set(x, "l2", js.undefined)
    }
  }
  
  @js.native
  trait L2Args extends StObject {
    
    /** L2 regularization rate. Defaults to 0.01. */
    var l2: Double = js.native
  }
  object L2Args {
    
    @scala.inline
    def apply(l2: Double): L2Args = {
      val __obj = js.Dynamic.literal(l2 = l2.asInstanceOf[js.Any])
      __obj.asInstanceOf[L2Args]
    }
    
    @scala.inline
    implicit class L2ArgsMutableBuilder[Self <: L2Args] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setL2(value: Double): Self = StObject.set(x, "l2", value.asInstanceOf[js.Any])
    }
  }
  
  type RegularizerIdentifier = l1l2_ | String
}
