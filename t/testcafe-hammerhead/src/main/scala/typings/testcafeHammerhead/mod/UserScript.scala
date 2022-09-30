package typings.testcafeHammerhead.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserScript extends StObject {
  
  var page: RequestFilterRule
  
  var url: String
}
object UserScript {
  
  inline def apply(page: RequestFilterRule, url: String): UserScript = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserScript]
  }
  
  extension [Self <: UserScript](x: Self) {
    
    inline def setPage(value: RequestFilterRule): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
