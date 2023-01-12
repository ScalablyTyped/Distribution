package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessStatm extends StObject {
  
  var data: Double
  
  var resident: Double
  
  var shared: Double
  
  var size: Double
  
  var text: Double
}
object ProcessStatm {
  
  inline def apply(data: Double, resident: Double, shared: Double, size: Double, text: Double): ProcessStatm = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], resident = resident.asInstanceOf[js.Any], shared = shared.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessStatm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessStatm] (val x: Self) extends AnyVal {
    
    inline def setData(value: Double): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setResident(value: Double): Self = StObject.set(x, "resident", value.asInstanceOf[js.Any])
    
    inline def setShared(value: Double): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setText(value: Double): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
