package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTParameters extends StObject {
  
  var POST: Parameters
}
object POSTParameters {
  
  inline def apply(POST: Parameters): POSTParameters = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTParameters] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: Parameters): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
