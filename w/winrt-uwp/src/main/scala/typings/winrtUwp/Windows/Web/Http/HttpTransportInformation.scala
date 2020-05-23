package typings.winrtUwp.Windows.Web.Http

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Networking.Sockets.SocketSslErrorSeverity
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the underlying transport used by the HTTP connection. */
trait HttpTransportInformation extends js.Object {
  /** Gets the certificate from the server with the SSL information. */
  var serverCertificate: Certificate
  /** Gets the category of an error on an SSL connection. */
  var serverCertificateErrorSeverity: SocketSslErrorSeverity
  /** Gets the list of errors that occurred making an SSL connection. */
  var serverCertificateErrors: IVectorView[ChainValidationResult]
  /** Gets the intermediate certificates sent by the server during SSL negotiation on this HttpTransportInformation object. */
  var serverIntermediateCertificates: IVectorView[Certificate]
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
}

