package typings.tensorflowTfjsCore.distKernelNamesMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OneHotAttrs extends StObject {
  
  var depth: Double
  
  var dtype: DataType
  
  var offValue: Double
  
  var onValue: Double
}
object OneHotAttrs {
  
  inline def apply(depth: Double, dtype: DataType, offValue: Double, onValue: Double): OneHotAttrs = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], offValue = offValue.asInstanceOf[js.Any], onValue = onValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[OneHotAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OneHotAttrs] (val x: Self) extends AnyVal {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
    
    inline def setOffValue(value: Double): Self = StObject.set(x, "offValue", value.asInstanceOf[js.Any])
    
    inline def setOnValue(value: Double): Self = StObject.set(x, "onValue", value.asInstanceOf[js.Any])
  }
}
