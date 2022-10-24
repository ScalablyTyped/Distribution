package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertionForm extends StObject {
  
  var insertionForm: Any
  
  var toolbarButtons: Any
}
object InsertionForm {
  
  inline def apply(insertionForm: Any, toolbarButtons: Any): InsertionForm = {
    val __obj = js.Dynamic.literal(insertionForm = insertionForm.asInstanceOf[js.Any], toolbarButtons = toolbarButtons.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertionForm]
  }
  
  extension [Self <: InsertionForm](x: Self) {
    
    inline def setInsertionForm(value: Any): Self = StObject.set(x, "insertionForm", value.asInstanceOf[js.Any])
    
    inline def setToolbarButtons(value: Any): Self = StObject.set(x, "toolbarButtons", value.asInstanceOf[js.Any])
  }
}
