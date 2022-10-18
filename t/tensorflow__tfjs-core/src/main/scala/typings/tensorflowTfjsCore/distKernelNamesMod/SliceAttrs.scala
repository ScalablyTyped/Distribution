package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliceAttrs extends StObject {
  
  var begin: Double | js.Array[Double]
  
  var size: Double | js.Array[Double]
}
object SliceAttrs {
  
  inline def apply(begin: Double | js.Array[Double], size: Double | js.Array[Double]): SliceAttrs = {
    val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliceAttrs]
  }
  
  extension [Self <: SliceAttrs](x: Self) {
    
    inline def setBegin(value: Double | js.Array[Double]): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    inline def setBeginVarargs(value: Double*): Self = StObject.set(x, "begin", js.Array(value*))
    
    inline def setSize(value: Double | js.Array[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value*))
  }
}
