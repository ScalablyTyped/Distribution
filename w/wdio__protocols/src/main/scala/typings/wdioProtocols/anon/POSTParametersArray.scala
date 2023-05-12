package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTParametersArray extends StObject {
  
  var POST: ParametersArray
}
object POSTParametersArray {
  
  inline def apply(POST: ParametersArray): POSTParametersArray = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTParametersArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTParametersArray] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: ParametersArray): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
