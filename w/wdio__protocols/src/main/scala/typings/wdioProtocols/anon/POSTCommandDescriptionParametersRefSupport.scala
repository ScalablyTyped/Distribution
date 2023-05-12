package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTCommandDescriptionParametersRefSupport extends StObject {
  
  var POST: CommandDescriptionParametersRefSupport
}
object POSTCommandDescriptionParametersRefSupport {
  
  inline def apply(POST: CommandDescriptionParametersRefSupport): POSTCommandDescriptionParametersRefSupport = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTCommandDescriptionParametersRefSupport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTCommandDescriptionParametersRefSupport] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: CommandDescriptionParametersRefSupport): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
