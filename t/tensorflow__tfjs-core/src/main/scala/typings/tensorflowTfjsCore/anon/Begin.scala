package typings.tensorflowTfjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Begin extends StObject {
  
  var begin: js.Array[Double]
  
  var end: js.Array[Double]
  
  var strides: js.Array[Double]
}
object Begin {
  
  inline def apply(begin: js.Array[Double], end: js.Array[Double], strides: js.Array[Double]): Begin = {
    val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Begin]
  }
  
  extension [Self <: Begin](x: Self) {
    
    inline def setBegin(value: js.Array[Double]): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    inline def setBeginVarargs(value: Double*): Self = StObject.set(x, "begin", js.Array(value :_*))
    
    inline def setEnd(value: js.Array[Double]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndVarargs(value: Double*): Self = StObject.set(x, "end", js.Array(value :_*))
    
    inline def setStrides(value: js.Array[Double]): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
    
    inline def setStridesVarargs(value: Double*): Self = StObject.set(x, "strides", js.Array(value :_*))
  }
}
