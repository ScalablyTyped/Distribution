package typings.yaDisk.mod

import typings.yaDisk.yaDiskStrings.DELETE
import typings.yaDisk.yaDiskStrings.GET
import typings.yaDisk.yaDiskStrings.PATCH
import typings.yaDisk.yaDiskStrings.POST
import typings.yaDisk.yaDiskStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Link extends StObject {
  
  var href: String
  
  var method: GET | POST | PUT | DELETE | PATCH
  
  var templated: Boolean
}
object Link {
  
  inline def apply(href: String, method: GET | POST | PUT | DELETE | PATCH, templated: Boolean): Link = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], templated = templated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
  
  extension [Self <: Link](x: Self) {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: GET | POST | PUT | DELETE | PATCH): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setTemplated(value: Boolean): Self = StObject.set(x, "templated", value.asInstanceOf[js.Any])
  }
}
