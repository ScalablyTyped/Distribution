package typings.thunderbirdWebextBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewValue extends StObject {
  
  var newValue: String | Null
  
  var oldValue: String | Null
}
object NewValue {
  
  inline def apply(): NewValue = {
    val __obj = js.Dynamic.literal(newValue = null, oldValue = null)
    __obj.asInstanceOf[NewValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NewValue] (val x: Self) extends AnyVal {
    
    inline def setNewValue(value: String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueNull: Self = StObject.set(x, "newValue", null)
    
    inline def setOldValue(value: String): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueNull: Self = StObject.set(x, "oldValue", null)
  }
}
