package typings.web3CoreHelpers.mod

import typings.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpAgent extends StObject {
  
  var baseUrl: js.UndefOr[String] = js.native
  
  var http: js.UndefOr[Agent] = js.native
  
  var https: js.UndefOr[typings.node.httpsMod.Agent] = js.native
}
object HttpAgent {
  
  @scala.inline
  def apply(): HttpAgent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpAgent]
  }
  
  @scala.inline
  implicit class HttpAgentMutableBuilder[Self <: HttpAgent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    @scala.inline
    def setHttp(value: Agent): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    
    @scala.inline
    def setHttps(value: typings.node.httpsMod.Agent): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
  }
}
