package typings.webix.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Confirm extends StObject {
  
  var confirm: String
  
  var copy: String
  
  var dnd: String
  
  var editor: Add
  
  var menu: Copy
  
  var remove: String
  
  var save: String
}
object Confirm {
  
  inline def apply(confirm: String, copy: String, dnd: String, editor: Add, menu: Copy, remove: String, save: String): Confirm = {
    val __obj = js.Dynamic.literal(confirm = confirm.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
    __obj.asInstanceOf[Confirm]
  }
  
  extension [Self <: Confirm](x: Self) {
    
    inline def setConfirm(value: String): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: String): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    inline def setDnd(value: String): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
    
    inline def setEditor(value: Add): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setMenu(value: Copy): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: String): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setSave(value: String): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
  }
}
