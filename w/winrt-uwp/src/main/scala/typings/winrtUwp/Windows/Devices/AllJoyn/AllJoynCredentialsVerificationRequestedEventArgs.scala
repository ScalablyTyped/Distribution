package typings.winrtUwp.Windows.Devices.AllJoyn

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Deferral
import typings.winrtUwp.Windows.Networking.Sockets.SocketSslErrorSeverity
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to allow the application to indicate whether the credentials provided by a peer are valid. */
trait AllJoynCredentialsVerificationRequestedEventArgs extends js.Object {
  /** The mechanism used to authenticate credentials. */
  var authenticationMechanism: AllJoynAuthenticationMechanism
  /** The cryptography certificate provided for authentication. */
  var peerCertificate: Certificate
  /** The category of an errors encountered authenticating the cryptography certificate. */
  var peerCertificateErrorSeverity: SocketSslErrorSeverity
  /** A list of errors that occurred during authentication of the provided cryptography certificate. */
  var peerCertificateErrors: IVectorView[ChainValidationResult]
  /** Retrieves the intermediate certificates sent during authentication. */
  var peerIntermediateCertificates: IVectorView[Certificate]
  /** The unique bus name of the remote app being authenticated. */
  var peerUniqueName: String
  /** Calling this method indicates that the credentials provided for authentication are valid. */
  def accept(): Unit
  /**
    * Conducts verification of provided of credentials asynchronously.
    * @return The verification deferral.
    */
  def getDeferral(): Deferral
}

object AllJoynCredentialsVerificationRequestedEventArgs {
  @scala.inline
  def apply(
    accept: () => Unit,
    authenticationMechanism: AllJoynAuthenticationMechanism,
    getDeferral: () => Deferral,
    peerCertificate: Certificate,
    peerCertificateErrorSeverity: SocketSslErrorSeverity,
    peerCertificateErrors: IVectorView[ChainValidationResult],
    peerIntermediateCertificates: IVectorView[Certificate],
    peerUniqueName: String
  ): AllJoynCredentialsVerificationRequestedEventArgs = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), authenticationMechanism = authenticationMechanism.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), peerCertificate = peerCertificate.asInstanceOf[js.Any], peerCertificateErrorSeverity = peerCertificateErrorSeverity.asInstanceOf[js.Any], peerCertificateErrors = peerCertificateErrors.asInstanceOf[js.Any], peerIntermediateCertificates = peerIntermediateCertificates.asInstanceOf[js.Any], peerUniqueName = peerUniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynCredentialsVerificationRequestedEventArgs]
  }
}

