package typings.winrtUwp.Windows.Web.Http

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Networking.Sockets.SocketSslErrorSeverity
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the underlying transport used by the HTTP connection. */
@js.native
trait HttpTransportInformation extends js.Object {
  
  /** Gets the certificate from the server with the SSL information. */
  var serverCertificate: Certificate = js.native
  
  /** Gets the category of an error on an SSL connection. */
  var serverCertificateErrorSeverity: SocketSslErrorSeverity = js.native
  
  /** Gets the list of errors that occurred making an SSL connection. */
  var serverCertificateErrors: IVectorView[ChainValidationResult] = js.native
  
  /** Gets the intermediate certificates sent by the server during SSL negotiation on this HttpTransportInformation object. */
  var serverIntermediateCertificates: IVectorView[Certificate] = js.native
}
object HttpTransportInformation {
  
  @scala.inline
  def apply(
    serverCertificate: Certificate,
    serverCertificateErrorSeverity: SocketSslErrorSeverity,
    serverCertificateErrors: IVectorView[ChainValidationResult],
    serverIntermediateCertificates: IVectorView[Certificate]
  ): HttpTransportInformation = {
    val __obj = js.Dynamic.literal(serverCertificate = serverCertificate.asInstanceOf[js.Any], serverCertificateErrorSeverity = serverCertificateErrorSeverity.asInstanceOf[js.Any], serverCertificateErrors = serverCertificateErrors.asInstanceOf[js.Any], serverIntermediateCertificates = serverIntermediateCertificates.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpTransportInformation]
  }
  
  @scala.inline
  implicit class HttpTransportInformationOps[Self <: HttpTransportInformation] (val x: Self) extends AnyVal {
    
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
    def setServerCertificate(value: Certificate): Self = this.set("serverCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCertificateErrorSeverity(value: SocketSslErrorSeverity): Self = this.set("serverCertificateErrorSeverity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCertificateErrors(value: IVectorView[ChainValidationResult]): Self = this.set("serverCertificateErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerIntermediateCertificates(value: IVectorView[Certificate]): Self = this.set("serverIntermediateCertificates", value.asInstanceOf[js.Any])
  }
}
