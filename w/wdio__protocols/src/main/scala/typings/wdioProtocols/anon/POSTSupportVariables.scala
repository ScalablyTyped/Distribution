package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTSupportVariables extends StObject {
  
  var POST: SupportVariables
}
object POSTSupportVariables {
  
  inline def apply(POST: SupportVariables): POSTSupportVariables = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTSupportVariables]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTSupportVariables] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: SupportVariables): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
