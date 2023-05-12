package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTCommandDescriptionParametersRefReturns extends StObject {
  
  var POST: CommandDescriptionParametersRefReturns
}
object POSTCommandDescriptionParametersRefReturns {
  
  inline def apply(POST: CommandDescriptionParametersRefReturns): POSTCommandDescriptionParametersRefReturns = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTCommandDescriptionParametersRefReturns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTCommandDescriptionParametersRefReturns] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: CommandDescriptionParametersRefReturns): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
