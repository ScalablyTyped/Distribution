package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIAutomation extends StObject {
  
  var UIAutomation: String
  
  var XCUITest: String
}
object UIAutomation {
  
  inline def apply(UIAutomation: String, XCUITest: String): UIAutomation = {
    val __obj = js.Dynamic.literal(UIAutomation = UIAutomation.asInstanceOf[js.Any], XCUITest = XCUITest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIAutomation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UIAutomation] (val x: Self) extends AnyVal {
    
    inline def setUIAutomation(value: String): Self = StObject.set(x, "UIAutomation", value.asInstanceOf[js.Any])
    
    inline def setXCUITest(value: String): Self = StObject.set(x, "XCUITest", value.asInstanceOf[js.Any])
  }
}
