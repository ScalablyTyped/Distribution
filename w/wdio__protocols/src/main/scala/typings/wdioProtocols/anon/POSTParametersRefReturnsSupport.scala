package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTParametersRefReturnsSupport extends StObject {
  
  var POST: ParametersRefReturnsSupport
}
object POSTParametersRefReturnsSupport {
  
  inline def apply(POST: ParametersRefReturnsSupport): POSTParametersRefReturnsSupport = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTParametersRefReturnsSupport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTParametersRefReturnsSupport] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: ParametersRefReturnsSupport): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
