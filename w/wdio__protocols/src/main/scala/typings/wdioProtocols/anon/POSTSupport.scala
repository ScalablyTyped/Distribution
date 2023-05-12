package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTSupport extends StObject {
  
  var POST: Support
}
object POSTSupport {
  
  inline def apply(POST: Support): POSTSupport = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTSupport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTSupport] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: Support): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
