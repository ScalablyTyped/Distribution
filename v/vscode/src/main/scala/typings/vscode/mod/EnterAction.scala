package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterAction extends StObject {
  
  /**
    * Describes text to be appended after the new line and after the indentation.
    */
  var appendText: js.UndefOr[String] = js.undefined
  
  /**
    * Describe what to do with the indentation.
    */
  var indentAction: IndentAction
  
  /**
    * Describes the number of characters to remove from the new line's indentation.
    */
  var removeText: js.UndefOr[Double] = js.undefined
}
object EnterAction {
  
  @scala.inline
  def apply(indentAction: IndentAction): EnterAction = {
    val __obj = js.Dynamic.literal(indentAction = indentAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterAction]
  }
  
  @scala.inline
  implicit class EnterActionMutableBuilder[Self <: EnterAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendText(value: String): Self = StObject.set(x, "appendText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendTextUndefined: Self = StObject.set(x, "appendText", js.undefined)
    
    @scala.inline
    def setIndentAction(value: IndentAction): Self = StObject.set(x, "indentAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveText(value: Double): Self = StObject.set(x, "removeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveTextUndefined: Self = StObject.set(x, "removeText", js.undefined)
  }
}
