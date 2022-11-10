package typings.webix.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Copy extends StObject {
  
  var copy: String
  
  var edit: String
  
  var remove: String
}
object Copy {
  
  inline def apply(copy: String, edit: String, remove: String): Copy = {
    val __obj = js.Dynamic.literal(copy = copy.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[Copy]
  }
  
  extension [Self <: Copy](x: Self) {
    
    inline def setCopy(value: String): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    inline def setEdit(value: String): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: String): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
  }
}
