package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides info about a subject alternative name. */
@js.native
trait SubjectAlternativeNameInfo extends StObject {
  
  /** Gets the distinguished name. */
  var distinguishedName: IVectorView[String] = js.native
  
  /** Gets the DNS name. */
  var dnsName: IVectorView[String] = js.native
  
  /** Gets the email name. */
  var emailName: IVectorView[String] = js.native
  
  /** Gets the IP address. */
  var ipAddress: IVectorView[String] = js.native
  
  /** Gets the principal name. */
  var principalName: IVectorView[String] = js.native
  
  /** Gets the URL. */
  var url: IVectorView[String] = js.native
}
object SubjectAlternativeNameInfo {
  
  @scala.inline
  def apply(
    distinguishedName: IVectorView[String],
    dnsName: IVectorView[String],
    emailName: IVectorView[String],
    ipAddress: IVectorView[String],
    principalName: IVectorView[String],
    url: IVectorView[String]
  ): SubjectAlternativeNameInfo = {
    val __obj = js.Dynamic.literal(distinguishedName = distinguishedName.asInstanceOf[js.Any], dnsName = dnsName.asInstanceOf[js.Any], emailName = emailName.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], principalName = principalName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectAlternativeNameInfo]
  }
  
  @scala.inline
  implicit class SubjectAlternativeNameInfoMutableBuilder[Self <: SubjectAlternativeNameInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistinguishedName(value: IVectorView[String]): Self = StObject.set(x, "distinguishedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsName(value: IVectorView[String]): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailName(value: IVectorView[String]): Self = StObject.set(x, "emailName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddress(value: IVectorView[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalName(value: IVectorView[String]): Self = StObject.set(x, "principalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: IVectorView[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
