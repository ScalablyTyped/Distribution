package typings.webdriverio.anon

import typings.wdioTypes.buildOptionsMod.SupportedProtocols
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `26` extends StObject {
  
  var automationProtocol: js.UndefOr[SupportedProtocols] = js.undefined
}
object `26` {
  
  inline def apply(): `26` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`26`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `26`] (val x: Self) extends AnyVal {
    
    inline def setAutomationProtocol(value: SupportedProtocols): Self = StObject.set(x, "automationProtocol", value.asInstanceOf[js.Any])
    
    inline def setAutomationProtocolUndefined: Self = StObject.set(x, "automationProtocol", js.undefined)
  }
}
