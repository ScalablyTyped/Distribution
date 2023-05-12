package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTParametersRefSupport extends StObject {
  
  var POST: ParametersRefSupport
}
object POSTParametersRefSupport {
  
  inline def apply(POST: ParametersRefSupport): POSTParametersRefSupport = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTParametersRefSupport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTParametersRefSupport] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: ParametersRefSupport): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
