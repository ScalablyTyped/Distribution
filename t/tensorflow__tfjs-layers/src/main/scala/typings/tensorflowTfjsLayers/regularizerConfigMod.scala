package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.L1L2
import typings.tensorflowTfjsLayers.typesMod.BaseSerialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regularizerConfigMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/regularizer_config", "regularizerClassNames")
  @js.native
  val regularizerClassNames: js.Array[RegularizerClassName] = js.native
  
  trait L1L2Config extends StObject {
    
    var l1: js.UndefOr[Double] = js.undefined
    
    var l2: js.UndefOr[Double] = js.undefined
  }
  object L1L2Config {
    
    inline def apply(): L1L2Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[L1L2Config]
    }
    
    extension [Self <: L1L2Config](x: Self) {
      
      inline def setL1(value: Double): Self = StObject.set(x, "l1", value.asInstanceOf[js.Any])
      
      inline def setL1Undefined: Self = StObject.set(x, "l1", js.undefined)
      
      inline def setL2(value: Double): Self = StObject.set(x, "l2", value.asInstanceOf[js.Any])
      
      inline def setL2Undefined: Self = StObject.set(x, "l2", js.undefined)
    }
  }
  
  type L1L2Serialization = BaseSerialization[L1L2, L1L2Config]
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/regularizer_config.RegularizerSerialization['class_name'] */
  type RegularizerClassName = L1L2
  
  type RegularizerSerialization = L1L2Serialization
}
