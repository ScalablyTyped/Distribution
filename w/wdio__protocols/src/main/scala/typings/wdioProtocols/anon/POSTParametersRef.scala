package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTParametersRef extends StObject {
  
  var POST: ParametersRef
}
object POSTParametersRef {
  
  inline def apply(POST: ParametersRef): POSTParametersRef = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTParametersRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTParametersRef] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: ParametersRef): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
