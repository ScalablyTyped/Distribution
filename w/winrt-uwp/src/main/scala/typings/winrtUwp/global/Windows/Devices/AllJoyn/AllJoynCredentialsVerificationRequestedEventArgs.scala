package typings.winrtUwp.global.Windows.Devices.AllJoyn

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Deferral
import typings.winrtUwp.Windows.Networking.Sockets.SocketSslErrorSeverity
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to allow the application to indicate whether the credentials provided by a peer are valid. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynCredentialsVerificationRequestedEventArgs")
@js.native
abstract class AllJoynCredentialsVerificationRequestedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynCredentialsVerificationRequestedEventArgs {
  /** The mechanism used to authenticate credentials. */
  /* CompleteClass */
  override var authenticationMechanism: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAuthenticationMechanism = js.native
  /** The cryptography certificate provided for authentication. */
  /* CompleteClass */
  override var peerCertificate: Certificate = js.native
  /** The category of an errors encountered authenticating the cryptography certificate. */
  /* CompleteClass */
  override var peerCertificateErrorSeverity: SocketSslErrorSeverity = js.native
  /** A list of errors that occurred during authentication of the provided cryptography certificate. */
  /* CompleteClass */
  override var peerCertificateErrors: IVectorView[ChainValidationResult] = js.native
  /** Retrieves the intermediate certificates sent during authentication. */
  /* CompleteClass */
  override var peerIntermediateCertificates: IVectorView[Certificate] = js.native
  /** The unique bus name of the remote app being authenticated. */
  /* CompleteClass */
  override var peerUniqueName: String = js.native
  /** Calling this method indicates that the credentials provided for authentication are valid. */
  /* CompleteClass */
  override def accept(): Unit = js.native
  /**
    * Conducts verification of provided of credentials asynchronously.
    * @return The verification deferral.
    */
  /* CompleteClass */
  override def getDeferral(): Deferral = js.native
}

