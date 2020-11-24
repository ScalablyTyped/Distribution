package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides info about a subject alternative name. */
@js.native
trait SubjectAlternativeNameInfo extends js.Object {
  
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
  implicit class SubjectAlternativeNameInfoOps[Self <: SubjectAlternativeNameInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDistinguishedName(value: IVectorView[String]): Self = this.set("distinguishedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsName(value: IVectorView[String]): Self = this.set("dnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailName(value: IVectorView[String]): Self = this.set("emailName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddress(value: IVectorView[String]): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalName(value: IVectorView[String]): Self = this.set("principalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: IVectorView[String]): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
