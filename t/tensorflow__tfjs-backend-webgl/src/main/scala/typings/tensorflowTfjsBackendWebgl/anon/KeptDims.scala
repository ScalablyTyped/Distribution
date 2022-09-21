package typings.tensorflowTfjsBackendWebgl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeptDims extends StObject {
  
  var keptDims: js.Array[Double]
  
  var uniformShape: js.Array[Double]
  
  var useSqueezeShape: Boolean
}
object KeptDims {
  
  inline def apply(keptDims: js.Array[Double], uniformShape: js.Array[Double], useSqueezeShape: Boolean): KeptDims = {
    val __obj = js.Dynamic.literal(keptDims = keptDims.asInstanceOf[js.Any], uniformShape = uniformShape.asInstanceOf[js.Any], useSqueezeShape = useSqueezeShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeptDims]
  }
  
  extension [Self <: KeptDims](x: Self) {
    
    inline def setKeptDims(value: js.Array[Double]): Self = StObject.set(x, "keptDims", value.asInstanceOf[js.Any])
    
    inline def setKeptDimsVarargs(value: Double*): Self = StObject.set(x, "keptDims", js.Array(value*))
    
    inline def setUniformShape(value: js.Array[Double]): Self = StObject.set(x, "uniformShape", value.asInstanceOf[js.Any])
    
    inline def setUniformShapeVarargs(value: Double*): Self = StObject.set(x, "uniformShape", js.Array(value*))
    
    inline def setUseSqueezeShape(value: Boolean): Self = StObject.set(x, "useSqueezeShape", value.asInstanceOf[js.Any])
  }
}
