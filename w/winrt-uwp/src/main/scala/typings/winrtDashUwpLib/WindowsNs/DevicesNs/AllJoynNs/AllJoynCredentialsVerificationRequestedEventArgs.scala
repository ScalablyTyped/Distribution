package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to allow the application to indicate whether the credentials provided by a peer are valid. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynCredentialsVerificationRequestedEventArgs")
@js.native
abstract class AllJoynCredentialsVerificationRequestedEventArgs () extends js.Object {
  /** The mechanism used to authenticate credentials. */
  var authenticationMechanism: AllJoynAuthenticationMechanism = js.native
  /** The cryptography certificate provided for authentication. */
  var peerCertificate: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.Certificate = js.native
  /** The category of an errors encountered authenticating the cryptography certificate. */
  var peerCertificateErrorSeverity: winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketSslErrorSeverity = js.native
  /** A list of errors that occurred during authentication of the provided cryptography certificate. */
  var peerCertificateErrors: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[
    winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ChainValidationResult
  ] = js.native
  /** Retrieves the intermediate certificates sent during authentication. */
  var peerIntermediateCertificates: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.Certificate] = js.native
  /** The unique bus name of the remote app being authenticated. */
  var peerUniqueName: java.lang.String = js.native
  /** Calling this method indicates that the credentials provided for authentication are valid. */
  def accept(): scala.Unit = js.native
  /**
                   * Conducts verification of provided of credentials asynchronously.
                   * @return The verification deferral.
                   */
  def getDeferral(): winrtDashUwpLib.WindowsNs.FoundationNs.Deferral = js.native
}

