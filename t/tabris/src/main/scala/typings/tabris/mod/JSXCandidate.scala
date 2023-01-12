package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXCandidate extends StObject {
  
  var jsxAttributes: Any
  
  var set: Any
}
object JSXCandidate {
  
  inline def apply(jsxAttributes: Any, set: Any): JSXCandidate = {
    val __obj = js.Dynamic.literal(jsxAttributes = jsxAttributes.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXCandidate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSXCandidate] (val x: Self) extends AnyVal {
    
    inline def setJsxAttributes(value: Any): Self = StObject.set(x, "jsxAttributes", value.asInstanceOf[js.Any])
    
    inline def setSet(value: Any): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
  }
}
