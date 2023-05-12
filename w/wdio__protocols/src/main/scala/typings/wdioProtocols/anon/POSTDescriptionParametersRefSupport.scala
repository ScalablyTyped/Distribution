package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTDescriptionParametersRefSupport extends StObject {
  
  var POST: DescriptionParametersRefSupport
}
object POSTDescriptionParametersRefSupport {
  
  inline def apply(POST: DescriptionParametersRefSupport): POSTDescriptionParametersRefSupport = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTDescriptionParametersRefSupport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTDescriptionParametersRefSupport] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: DescriptionParametersRefSupport): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
