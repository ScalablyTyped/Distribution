package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTRefReturns extends StObject {
  
  var POST: RefReturns
}
object POSTRefReturns {
  
  inline def apply(POST: RefReturns): POSTRefReturns = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTRefReturns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTRefReturns] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: RefReturns): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
