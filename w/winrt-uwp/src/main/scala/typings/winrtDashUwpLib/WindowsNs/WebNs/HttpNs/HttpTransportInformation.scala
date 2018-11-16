package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the underlying transport used by the HTTP connection. */
@JSGlobal("Windows.Web.Http.HttpTransportInformation")
@js.native
abstract class HttpTransportInformation () extends js.Object {
  /** Gets the certificate from the server with the SSL information. */
  var serverCertificate: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.Certificate = js.native
  /** Gets the category of an error on an SSL connection. */
  var serverCertificateErrorSeverity: winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketSslErrorSeverity = js.native
  /** Gets the list of errors that occurred making an SSL connection. */
  var serverCertificateErrors: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[
    winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ChainValidationResult
  ] = js.native
  /** Gets the intermediate certificates sent by the server during SSL negotiation on this HttpTransportInformation object. */
  var serverIntermediateCertificates: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.Certificate] = js.native
}

