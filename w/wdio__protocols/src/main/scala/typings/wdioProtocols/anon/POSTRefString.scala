package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTRefString extends StObject {
  
  var POST: RefString
}
object POSTRefString {
  
  inline def apply(POST: RefString): POSTRefString = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTRefString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTRefString] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: RefString): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
