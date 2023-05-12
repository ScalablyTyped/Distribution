package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTDescriptionParametersRef extends StObject {
  
  var POST: DescriptionParametersRef
}
object POSTDescriptionParametersRef {
  
  inline def apply(POST: DescriptionParametersRef): POSTDescriptionParametersRef = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTDescriptionParametersRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTDescriptionParametersRef] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: DescriptionParametersRef): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
