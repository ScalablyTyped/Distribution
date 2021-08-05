package typings.xhr2Cookies

import typings.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BaseUrl extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var httpAgent: js.UndefOr[Agent] = js.undefined
    
    var httpsAgent: js.UndefOr[typings.node.httpsMod.Agent] = js.undefined
  }
  object BaseUrl {
    
    inline def apply(): BaseUrl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseUrl]
    }
    
    extension [Self <: BaseUrl](x: Self) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setHttpAgent(value: Agent): Self = StObject.set(x, "httpAgent", value.asInstanceOf[js.Any])
      
      inline def setHttpAgentUndefined: Self = StObject.set(x, "httpAgent", js.undefined)
      
      inline def setHttpsAgent(value: typings.node.httpsMod.Agent): Self = StObject.set(x, "httpsAgent", value.asInstanceOf[js.Any])
      
      inline def setHttpsAgentUndefined: Self = StObject.set(x, "httpsAgent", js.undefined)
    }
  }
}
