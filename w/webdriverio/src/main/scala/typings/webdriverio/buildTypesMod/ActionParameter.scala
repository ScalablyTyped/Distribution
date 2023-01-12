package typings.webdriverio.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionParameter extends StObject {
  
  var actions: js.Array[Action]
}
object ActionParameter {
  
  inline def apply(actions: js.Array[Action]): ActionParameter = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionParameter] (val x: Self) extends AnyVal {
    
    inline def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value*))
  }
}
