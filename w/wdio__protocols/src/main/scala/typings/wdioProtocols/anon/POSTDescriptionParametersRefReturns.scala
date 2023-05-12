package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTDescriptionParametersRefReturns extends StObject {
  
  var POST: DescriptionParametersRefReturns
}
object POSTDescriptionParametersRefReturns {
  
  inline def apply(POST: DescriptionParametersRefReturns): POSTDescriptionParametersRefReturns = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTDescriptionParametersRefReturns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTDescriptionParametersRefReturns] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: DescriptionParametersRefReturns): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
