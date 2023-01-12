package typings.webix.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Edit extends StObject {
  
  var edit: String
}
object Edit {
  
  inline def apply(edit: String): Edit = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Edit] (val x: Self) extends AnyVal {
    
    inline def setEdit(value: String): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
  }
}
