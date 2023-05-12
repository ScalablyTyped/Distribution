package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTReturnsSupport extends StObject {
  
  var POST: ReturnsSupport
}
object POSTReturnsSupport {
  
  inline def apply(POST: ReturnsSupport): POSTReturnsSupport = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTReturnsSupport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTReturnsSupport] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: ReturnsSupport): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
