package typings.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Proxy extends StObject {
  
  var authorization: ProxyAuthorization = js.native
  
  /**
    * This is a description string
    */
  var description: String = js.native
  
  /**
    * The friendly name of the server
    */
  var friendlyName: String = js.native
  
  var globalDefault: Boolean = js.native
  
  /**
    * This is a string representation of the site that the proxy server is located in (e.g. "NA-WA-RED")
    */
  var site: String = js.native
  
  var siteDefault: Boolean = js.native
  
  /**
    * The URL of the proxy server
    */
  var url: String = js.native
}
object Proxy {
  
  @scala.inline
  def apply(
    authorization: ProxyAuthorization,
    description: String,
    friendlyName: String,
    globalDefault: Boolean,
    site: String,
    siteDefault: Boolean,
    url: String
  ): Proxy = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], globalDefault = globalDefault.asInstanceOf[js.Any], site = site.asInstanceOf[js.Any], siteDefault = siteDefault.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Proxy]
  }
  
  @scala.inline
  implicit class ProxyMutableBuilder[Self <: Proxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorization(value: ProxyAuthorization): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalDefault(value: Boolean): Self = StObject.set(x, "globalDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSite(value: String): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteDefault(value: Boolean): Self = StObject.set(x, "siteDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
