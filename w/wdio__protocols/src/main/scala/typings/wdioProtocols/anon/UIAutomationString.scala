package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIAutomationString extends StObject {
  
  var UIAutomation: String
}
object UIAutomationString {
  
  inline def apply(UIAutomation: String): UIAutomationString = {
    val __obj = js.Dynamic.literal(UIAutomation = UIAutomation.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIAutomationString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UIAutomationString] (val x: Self) extends AnyVal {
    
    inline def setUIAutomation(value: String): Self = StObject.set(x, "UIAutomation", value.asInstanceOf[js.Any])
  }
}
