package typings.winrtUwp.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocketErrorStatus extends js.Object

/** Specifies status values for a socket operation. */
@JSGlobal("Windows.Networking.Sockets.SocketErrorStatus")
@js.native
object SocketErrorStatus extends js.Object {
  /** The address is already in use. */
  @js.native
  sealed trait addressAlreadyInUse extends SocketErrorStatus
  
  /** The address family is not supported. */
  @js.native
  sealed trait addressFamilyNotSupported extends SocketErrorStatus
  
  /** Cannot assign requested address. */
  @js.native
  sealed trait cannotAssignRequestedAddress extends SocketErrorStatus
  
  /** The certificate is not valid for the requested usage. This error is also returned if the certificate has an invalid name. The name is not included in the permitted list or is explicitly excluded. */
  @js.native
  sealed trait certificateCommonNameIsIncorrect extends SocketErrorStatus
  
  /** A required certificate is not within its validity period when verifying against the current system clock or the timestamp in the signed file. This error is also returned if the validity periods of the certification chain do not nest correctly. */
  @js.native
  sealed trait certificateExpired extends SocketErrorStatus
  
  /** The supplied certificate is invalid. This can be returned for a number of reasons: */
  @js.native
  sealed trait certificateIsInvalid extends SocketErrorStatus
  
  /** The revocation function was unable to check revocation for the certificate. */
  @js.native
  sealed trait certificateNoRevocationCheck extends SocketErrorStatus
  
  /** The revocation function was unable to check revocation because the revocation server was offline. */
  @js.native
  sealed trait certificateRevocationServerOffline extends SocketErrorStatus
  
  /** A certificate was explicitly revoked by its issuer. This error is also returned if the certificate was explicitly marked as untrusted by the user. */
  @js.native
  sealed trait certificateRevoked extends SocketErrorStatus
  
  /** A certificate chain processed, but terminated in a root certificate which is not trusted by the trust provider. This error is also returned if a certificate chain could not be built to a trusted root authority. */
  @js.native
  sealed trait certificateUntrustedRoot extends SocketErrorStatus
  
  /** The certificate is not valid for the requested usage. */
  @js.native
  sealed trait certificateWrongUsage extends SocketErrorStatus
  
  /** The specified class was not found. */
  @js.native
  sealed trait classTypeNotFound extends SocketErrorStatus
  
  /** The connection was refused. */
  @js.native
  sealed trait connectionRefused extends SocketErrorStatus
  
  /** The connection was reset by the peer. */
  @js.native
  sealed trait connectionResetByPeer extends SocketErrorStatus
  
  /** A connection timeout was exceeded. */
  @js.native
  sealed trait connectionTimedOut extends SocketErrorStatus
  
  /** The host is down. */
  @js.native
  sealed trait hostIsDown extends SocketErrorStatus
  
  /** The host was not found. */
  @js.native
  sealed trait hostNotFound extends SocketErrorStatus
  
  /** A bad response was received from the HTTP server. */
  @js.native
  sealed trait httpInvalidServerResponse extends SocketErrorStatus
  
  /** A message sent on a datagram socket was larger than the internal message buffer or some other network limit, or the buffer used to receive a datagram was smaller than the datagram itself. */
  @js.native
  sealed trait messageTooLong extends SocketErrorStatus
  
  /** The network dropped connection on reset. */
  @js.native
  sealed trait networkDroppedConnectionOnReset extends SocketErrorStatus
  
  /** The network is down. */
  @js.native
  sealed trait networkIsDown extends SocketErrorStatus
  
  /** The network is unreachable. */
  @js.native
  sealed trait networkIsUnreachable extends SocketErrorStatus
  
  /** The pipe is being closed. */
  @js.native
  sealed trait noAddressesFound extends SocketErrorStatus
  
  /** The requested name is valid and was found in the database, but it does not have the correct associated data being resolved for. */
  @js.native
  sealed trait noDataRecordOfRequestedType extends SocketErrorStatus
  
  /** This is usually a temporary error during hostname resolution and means that the local server did not receive a response from an authoritative server. */
  @js.native
  sealed trait nonAuthoritativeHostNotFound extends SocketErrorStatus
  
  /** The operation was aborted. */
  @js.native
  sealed trait operationAborted extends SocketErrorStatus
  
  /** The socket type is not supported. */
  @js.native
  sealed trait socketTypeNotSupported extends SocketErrorStatus
  
  /** Software caused a connection abort. */
  @js.native
  sealed trait softwareCausedConnectionAbort extends SocketErrorStatus
  
  /** Too many open files. */
  @js.native
  sealed trait tooManyOpenFiles extends SocketErrorStatus
  
  /** The socket status is unknown. */
  @js.native
  sealed trait unknown extends SocketErrorStatus
  
  /** The host is unreachable. */
  @js.native
  sealed trait unreachableHost extends SocketErrorStatus
  
}

