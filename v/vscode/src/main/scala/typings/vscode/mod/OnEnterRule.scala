package typings.vscode.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnEnterRule extends StObject {
  
  /**
    * The action to execute.
    */
  var action: EnterAction = js.native
  
  /**
    * This rule will only execute if the text after the cursor matches this regular expression.
    */
  var afterText: js.UndefOr[RegExp] = js.native
  
  /**
    * This rule will only execute if the text before the cursor matches this regular expression.
    */
  var beforeText: RegExp = js.native
}
object OnEnterRule {
  
  @scala.inline
  def apply(action: EnterAction, beforeText: RegExp): OnEnterRule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], beforeText = beforeText.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEnterRule]
  }
  
  @scala.inline
  implicit class OnEnterRuleMutableBuilder[Self <: OnEnterRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: EnterAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterText(value: RegExp): Self = StObject.set(x, "afterText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterTextUndefined: Self = StObject.set(x, "afterText", js.undefined)
    
    @scala.inline
    def setBeforeText(value: RegExp): Self = StObject.set(x, "beforeText", value.asInstanceOf[js.Any])
  }
}
