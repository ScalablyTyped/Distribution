package typings.winrtDashUwp.WindowsNs.WebNs.HttpNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs.SocketSslErrorSeverity
import typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.Certificate
import typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ChainValidationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the underlying transport used by the HTTP connection. */
@JSGlobal("Windows.Web.Http.HttpTransportInformation")
@js.native
abstract class HttpTransportInformation () extends js.Object {
  /** Gets the certificate from the server with the SSL information. */
  var serverCertificate: Certificate = js.native
  /** Gets the category of an error on an SSL connection. */
  var serverCertificateErrorSeverity: SocketSslErrorSeverity = js.native
  /** Gets the list of errors that occurred making an SSL connection. */
  var serverCertificateErrors: IVectorView[ChainValidationResult] = js.native
  /** Gets the intermediate certificates sent by the server during SSL negotiation on this HttpTransportInformation object. */
  var serverIntermediateCertificates: IVectorView[Certificate] = js.native
}

