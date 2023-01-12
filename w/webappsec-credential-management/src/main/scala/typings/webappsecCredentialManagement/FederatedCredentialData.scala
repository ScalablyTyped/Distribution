package typings.webappsecCredentialManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#dictdef-federatedcredentialdata}
  */
trait FederatedCredentialData
  extends StObject
     with SiteBoundCredentialData {
  
  var protocol: js.UndefOr[String] = js.undefined
  
  var provider: String
}
object FederatedCredentialData {
  
  inline def apply(id: String, provider: String): FederatedCredentialData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[FederatedCredentialData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FederatedCredentialData] (val x: Self) extends AnyVal {
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
