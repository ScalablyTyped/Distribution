package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import typings.winrtUwp.Windows.Networking.HostName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents values to use when verifying a certificate chain. */
trait ChainValidationParameters extends StObject {
  
  /** Gets or sets the certificate chain policy to use when verifying the certificate chain. */
  var certificateChainPolicy: CertificateChainPolicy
  
  /** Gets or sets the server DNS name to use for SSL policy. */
  var serverDnsName: HostName
}
object ChainValidationParameters {
  
  @scala.inline
  def apply(certificateChainPolicy: CertificateChainPolicy, serverDnsName: HostName): ChainValidationParameters = {
    val __obj = js.Dynamic.literal(certificateChainPolicy = certificateChainPolicy.asInstanceOf[js.Any], serverDnsName = serverDnsName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChainValidationParameters]
  }
  
  @scala.inline
  implicit class ChainValidationParametersMutableBuilder[Self <: ChainValidationParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateChainPolicy(value: CertificateChainPolicy): Self = StObject.set(x, "certificateChainPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerDnsName(value: HostName): Self = StObject.set(x, "serverDnsName", value.asInstanceOf[js.Any])
  }
}
