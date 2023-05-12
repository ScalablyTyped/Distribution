package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTParametersArrayRefString extends StObject {
  
  var POST: ParametersArrayRefString
}
object POSTParametersArrayRefString {
  
  inline def apply(POST: ParametersArrayRefString): POSTParametersArrayRefString = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTParametersArrayRefString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTParametersArrayRefString] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: ParametersArrayRefString): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
