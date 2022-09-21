package typings.tensorflowTfjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllDims extends StObject {
  
  var allDims: js.Array[String]
  
  var idDims: js.Array[js.Array[Double]]
  
  var summedDims: js.Array[Double]
}
object AllDims {
  
  inline def apply(allDims: js.Array[String], idDims: js.Array[js.Array[Double]], summedDims: js.Array[Double]): AllDims = {
    val __obj = js.Dynamic.literal(allDims = allDims.asInstanceOf[js.Any], idDims = idDims.asInstanceOf[js.Any], summedDims = summedDims.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDims]
  }
  
  extension [Self <: AllDims](x: Self) {
    
    inline def setAllDims(value: js.Array[String]): Self = StObject.set(x, "allDims", value.asInstanceOf[js.Any])
    
    inline def setAllDimsVarargs(value: String*): Self = StObject.set(x, "allDims", js.Array(value*))
    
    inline def setIdDims(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "idDims", value.asInstanceOf[js.Any])
    
    inline def setIdDimsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "idDims", js.Array(value*))
    
    inline def setSummedDims(value: js.Array[Double]): Self = StObject.set(x, "summedDims", value.asInstanceOf[js.Any])
    
    inline def setSummedDimsVarargs(value: Double*): Self = StObject.set(x, "summedDims", js.Array(value*))
  }
}
