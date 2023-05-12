package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTRefSupport extends StObject {
  
  var POST: RefSupport
}
object POSTRefSupport {
  
  inline def apply(POST: RefSupport): POSTRefSupport = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTRefSupport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTRefSupport] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: RefSupport): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
