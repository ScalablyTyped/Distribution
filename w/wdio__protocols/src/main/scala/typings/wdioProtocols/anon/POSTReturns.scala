package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTReturns extends StObject {
  
  var POST: Returns
}
object POSTReturns {
  
  inline def apply(POST: Returns): POSTReturns = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTReturns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTReturns] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: Returns): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
