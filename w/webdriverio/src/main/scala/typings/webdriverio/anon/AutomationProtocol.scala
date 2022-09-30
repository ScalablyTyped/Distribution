package typings.webdriverio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomationProtocol extends StObject {
  
  var automationProtocol: js.UndefOr[String] = js.undefined
}
object AutomationProtocol {
  
  inline def apply(): AutomationProtocol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomationProtocol]
  }
  
  extension [Self <: AutomationProtocol](x: Self) {
    
    inline def setAutomationProtocol(value: String): Self = StObject.set(x, "automationProtocol", value.asInstanceOf[js.Any])
    
    inline def setAutomationProtocolUndefined: Self = StObject.set(x, "automationProtocol", js.undefined)
  }
}
