package typings.uiGrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BEGINCELLEDIT extends StObject {
  
  var BEGIN_CELL_EDIT: String
  
  var CANCEL_CELL_EDIT: String
  
  var END_CELL_EDIT: String
}
object BEGINCELLEDIT {
  
  inline def apply(BEGIN_CELL_EDIT: String, CANCEL_CELL_EDIT: String, END_CELL_EDIT: String): BEGINCELLEDIT = {
    val __obj = js.Dynamic.literal(BEGIN_CELL_EDIT = BEGIN_CELL_EDIT.asInstanceOf[js.Any], CANCEL_CELL_EDIT = CANCEL_CELL_EDIT.asInstanceOf[js.Any], END_CELL_EDIT = END_CELL_EDIT.asInstanceOf[js.Any])
    __obj.asInstanceOf[BEGINCELLEDIT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BEGINCELLEDIT] (val x: Self) extends AnyVal {
    
    inline def setBEGIN_CELL_EDIT(value: String): Self = StObject.set(x, "BEGIN_CELL_EDIT", value.asInstanceOf[js.Any])
    
    inline def setCANCEL_CELL_EDIT(value: String): Self = StObject.set(x, "CANCEL_CELL_EDIT", value.asInstanceOf[js.Any])
    
    inline def setEND_CELL_EDIT(value: String): Self = StObject.set(x, "END_CELL_EDIT", value.asInstanceOf[js.Any])
  }
}
