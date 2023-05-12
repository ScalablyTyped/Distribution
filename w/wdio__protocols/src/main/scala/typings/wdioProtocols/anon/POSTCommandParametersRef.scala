package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTCommandParametersRef extends StObject {
  
  var POST: CommandParametersRef
}
object POSTCommandParametersRef {
  
  inline def apply(POST: CommandParametersRef): POSTCommandParametersRef = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTCommandParametersRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTCommandParametersRef] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: CommandParametersRef): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
