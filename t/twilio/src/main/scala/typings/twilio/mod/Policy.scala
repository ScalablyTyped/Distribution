package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Policy extends StObject {
  
  // Map<string, FilterRequirement>, where FilterRequirement ::= Map<string, boolean>
  var allow: Boolean
  
  var method: String
  
  // Map<string, FilterRequirement>, where FilterRequirement ::= Map<string, boolean>
  var post_filter: js.UndefOr[js.Any] = js.undefined
  
  var query_filter: js.UndefOr[js.Any] = js.undefined
  
  var url: String
}
object Policy {
  
  inline def apply(allow: Boolean, method: String, url: String): Policy = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Policy]
  }
  
  extension [Self <: Policy](x: Self) {
    
    inline def setAllow(value: Boolean): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPost_filter(value: js.Any): Self = StObject.set(x, "post_filter", value.asInstanceOf[js.Any])
    
    inline def setPost_filterUndefined: Self = StObject.set(x, "post_filter", js.undefined)
    
    inline def setQuery_filter(value: js.Any): Self = StObject.set(x, "query_filter", value.asInstanceOf[js.Any])
    
    inline def setQuery_filterUndefined: Self = StObject.set(x, "query_filter", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
