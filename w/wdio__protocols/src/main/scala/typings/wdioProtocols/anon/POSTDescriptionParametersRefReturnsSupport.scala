package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTDescriptionParametersRefReturnsSupport extends StObject {
  
  var POST: DescriptionParametersRefReturnsSupport
}
object POSTDescriptionParametersRefReturnsSupport {
  
  inline def apply(POST: DescriptionParametersRefReturnsSupport): POSTDescriptionParametersRefReturnsSupport = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTDescriptionParametersRefReturnsSupport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTDescriptionParametersRefReturnsSupport] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: DescriptionParametersRefReturnsSupport): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
