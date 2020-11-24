package typings.winrtUwp.Windows.Devices.AllJoyn

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Deferral
import typings.winrtUwp.Windows.Networking.Sockets.SocketSslErrorSeverity
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to allow the application to indicate whether the credentials provided by a peer are valid. */
@js.native
trait AllJoynCredentialsVerificationRequestedEventArgs extends js.Object {
  
  /** Calling this method indicates that the credentials provided for authentication are valid. */
  def accept(): Unit = js.native
  
  /** The mechanism used to authenticate credentials. */
  var authenticationMechanism: AllJoynAuthenticationMechanism = js.native
  
  /**
    * Conducts verification of provided of credentials asynchronously.
    * @return The verification deferral.
    */
  def getDeferral(): Deferral = js.native
  
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
  
  @scala.inline
  implicit class AllJoynCredentialsVerificationRequestedEventArgsOps[Self <: AllJoynCredentialsVerificationRequestedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setAccept(value: () => Unit): Self = this.set("accept", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAuthenticationMechanism(value: AllJoynAuthenticationMechanism): Self = this.set("authenticationMechanism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeferral(value: () => Deferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPeerCertificate(value: Certificate): Self = this.set("peerCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerCertificateErrorSeverity(value: SocketSslErrorSeverity): Self = this.set("peerCertificateErrorSeverity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerCertificateErrors(value: IVectorView[ChainValidationResult]): Self = this.set("peerCertificateErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerIntermediateCertificates(value: IVectorView[Certificate]): Self = this.set("peerIntermediateCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerUniqueName(value: String): Self = this.set("peerUniqueName", value.asInstanceOf[js.Any])
  }
}
