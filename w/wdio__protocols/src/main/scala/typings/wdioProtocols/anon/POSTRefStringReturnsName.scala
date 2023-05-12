package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTRefStringReturnsName extends StObject {
  
  var POST: RefStringReturnsName
}
object POSTRefStringReturnsName {
  
  inline def apply(POST: RefStringReturnsName): POSTRefStringReturnsName = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTRefStringReturnsName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTRefStringReturnsName] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: RefStringReturnsName): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
