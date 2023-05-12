package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTSupportIosWindows extends StObject {
  
  var POST: SupportIosWindows
}
object POSTSupportIosWindows {
  
  inline def apply(POST: SupportIosWindows): POSTSupportIosWindows = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTSupportIosWindows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTSupportIosWindows] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: SupportIosWindows): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
