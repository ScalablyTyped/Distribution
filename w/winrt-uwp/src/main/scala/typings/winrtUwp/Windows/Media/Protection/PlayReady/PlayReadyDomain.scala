package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to metadata about a domain to which the current system is a member. */
trait PlayReadyDomain extends StObject {
  
  /** Gets the current domain account identifier property. */
  var accountId: String
  
  /** Gets the URL used to join the domain. */
  var domainJoinUrl: Uri
  
  /** Gets the current domain friendly name. */
  var friendlyName: String
  
  /** Gets the current domain revision number. */
  var revision: Double
  
  /** Gets the current domain service identifier property. */
  var serviceId: String
}
object PlayReadyDomain {
  
  inline def apply(accountId: String, domainJoinUrl: Uri, friendlyName: String, revision: Double, serviceId: String): PlayReadyDomain = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], domainJoinUrl = domainJoinUrl.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayReadyDomain]
  }
  
  extension [Self <: PlayReadyDomain](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setDomainJoinUrl(value: Uri): Self = StObject.set(x, "domainJoinUrl", value.asInstanceOf[js.Any])
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
  }
}
