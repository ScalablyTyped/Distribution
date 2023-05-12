package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTSupportIosUIAutomation extends StObject {
  
  var POST: SupportIosUIAutomation
}
object POSTSupportIosUIAutomation {
  
  inline def apply(POST: SupportIosUIAutomation): POSTSupportIosUIAutomation = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTSupportIosUIAutomation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTSupportIosUIAutomation] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: SupportIosUIAutomation): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
