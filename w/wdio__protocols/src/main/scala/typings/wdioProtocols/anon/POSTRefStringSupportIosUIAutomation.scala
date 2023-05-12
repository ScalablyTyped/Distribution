package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTRefStringSupportIosUIAutomation extends StObject {
  
  var POST: RefStringSupportIosUIAutomation
}
object POSTRefStringSupportIosUIAutomation {
  
  inline def apply(POST: RefStringSupportIosUIAutomation): POSTRefStringSupportIosUIAutomation = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTRefStringSupportIosUIAutomation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTRefStringSupportIosUIAutomation] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: RefStringSupportIosUIAutomation): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
