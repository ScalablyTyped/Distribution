package typings.vscode.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnEnterRule extends StObject {
  
  /**
    * The action to execute.
    */
  var action: EnterAction
  
  /**
    * This rule will only execute if the text after the cursor matches this regular expression.
    */
  var afterText: js.UndefOr[RegExp] = js.undefined
  
  /**
    * This rule will only execute if the text before the cursor matches this regular expression.
    */
  var beforeText: RegExp
}
object OnEnterRule {
  
  inline def apply(action: EnterAction, beforeText: RegExp): OnEnterRule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], beforeText = beforeText.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEnterRule]
  }
  
  extension [Self <: OnEnterRule](x: Self) {
    
    inline def setAction(value: EnterAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setAfterText(value: RegExp): Self = StObject.set(x, "afterText", value.asInstanceOf[js.Any])
    
    inline def setAfterTextUndefined: Self = StObject.set(x, "afterText", js.undefined)
    
    inline def setBeforeText(value: RegExp): Self = StObject.set(x, "beforeText", value.asInstanceOf[js.Any])
  }
}
