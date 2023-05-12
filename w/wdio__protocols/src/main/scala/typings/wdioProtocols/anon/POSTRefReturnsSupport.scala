package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTRefReturnsSupport extends StObject {
  
  var POST: RefReturnsSupport
}
object POSTRefReturnsSupport {
  
  inline def apply(POST: RefReturnsSupport): POSTRefReturnsSupport = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTRefReturnsSupport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTRefReturnsSupport] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: RefReturnsSupport): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
