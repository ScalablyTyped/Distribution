package typings.winrtDashUwp.Windows.Devices.AllJoyn

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.Deferral
import typings.winrtDashUwp.Windows.Networking.Sockets.SocketSslErrorSeverity
import typings.winrtDashUwp.Windows.Security.Cryptography.Certificates.Certificate
import typings.winrtDashUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
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
  var peerCertificate: Certificate = js.native
  /** The category of an errors encountered authenticating the cryptography certificate. */
  var peerCertificateErrorSeverity: SocketSslErrorSeverity = js.native
  /** A list of errors that occurred during authentication of the provided cryptography certificate. */
  var peerCertificateErrors: IVectorView[ChainValidationResult] = js.native
  /** Retrieves the intermediate certificates sent during authentication. */
  var peerIntermediateCertificates: IVectorView[Certificate] = js.native
  /** The unique bus name of the remote app being authenticated. */
  var peerUniqueName: String = js.native
  /** Calling this method indicates that the credentials provided for authentication are valid. */
  def accept(): Unit = js.native
  /**
    * Conducts verification of provided of credentials asynchronously.
    * @return The verification deferral.
    */
  def getDeferral(): Deferral = js.native
}

