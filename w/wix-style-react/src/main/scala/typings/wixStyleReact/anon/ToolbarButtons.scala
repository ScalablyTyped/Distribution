package typings.wixStyleReact.anon

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolbarButtons extends StObject {
  
  var insertionForm: Requireable[InferProps[CancelButtonLabel]]
  
  var toolbarButtons: Requireable[InferProps[BoldButtonLabel]]
}
object ToolbarButtons {
  
  inline def apply(
    insertionForm: Requireable[InferProps[CancelButtonLabel]],
    toolbarButtons: Requireable[InferProps[BoldButtonLabel]]
  ): ToolbarButtons = {
    val __obj = js.Dynamic.literal(insertionForm = insertionForm.asInstanceOf[js.Any], toolbarButtons = toolbarButtons.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarButtons]
  }
  
  extension [Self <: ToolbarButtons](x: Self) {
    
    inline def setInsertionForm(value: Requireable[InferProps[CancelButtonLabel]]): Self = StObject.set(x, "insertionForm", value.asInstanceOf[js.Any])
    
    inline def setToolbarButtons(value: Requireable[InferProps[BoldButtonLabel]]): Self = StObject.set(x, "toolbarButtons", value.asInstanceOf[js.Any])
  }
}
