package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXCandidate extends StObject {
  
  var jsxAttributes: js.Any
  
  var set: js.Any
}
object JSXCandidate {
  
  @scala.inline
  def apply(jsxAttributes: js.Any, set: js.Any): JSXCandidate = {
    val __obj = js.Dynamic.literal(jsxAttributes = jsxAttributes.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXCandidate]
  }
  
  @scala.inline
  implicit class JSXCandidateMutableBuilder[Self <: JSXCandidate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJsxAttributes(value: js.Any): Self = StObject.set(x, "jsxAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: js.Any): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
  }
}
