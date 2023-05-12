package typings.tampermonkey.Tampermonkey

import typings.tampermonkey.anon.Cancel
import typings.tampermonkey.anon.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebRequestRule extends StObject {
  
  var action: String | Cancel
  
  var selector: Exclude | String
}
object WebRequestRule {
  
  inline def apply(action: String | Cancel, selector: Exclude | String): WebRequestRule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebRequestRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebRequestRule] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String | Cancel): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: Exclude | String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
  }
}
