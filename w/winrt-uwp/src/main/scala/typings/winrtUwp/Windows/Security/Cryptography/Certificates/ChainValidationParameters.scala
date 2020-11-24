package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import typings.winrtUwp.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents values to use when verifying a certificate chain. */
@js.native
trait ChainValidationParameters extends js.Object {
  
  /** Gets or sets the certificate chain policy to use when verifying the certificate chain. */
  var certificateChainPolicy: CertificateChainPolicy = js.native
  
  /** Gets or sets the server DNS name to use for SSL policy. */
  var serverDnsName: HostName = js.native
}
object ChainValidationParameters {
  
  @scala.inline
  def apply(certificateChainPolicy: CertificateChainPolicy, serverDnsName: HostName): ChainValidationParameters = {
    val __obj = js.Dynamic.literal(certificateChainPolicy = certificateChainPolicy.asInstanceOf[js.Any], serverDnsName = serverDnsName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChainValidationParameters]
  }
  
  @scala.inline
  implicit class ChainValidationParametersOps[Self <: ChainValidationParameters] (val x: Self) extends AnyVal {
    
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
    def setCertificateChainPolicy(value: CertificateChainPolicy): Self = this.set("certificateChainPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerDnsName(value: HostName): Self = this.set("serverDnsName", value.asInstanceOf[js.Any])
  }
}
