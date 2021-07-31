package typings.winrtUwp.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocketErrorStatus extends StObject
/** Specifies status values for a socket operation. */
@JSGlobal("Windows.Networking.Sockets.SocketErrorStatus")
@js.native
object SocketErrorStatus extends StObject {
  
  /** The address is already in use. */
  @js.native
  sealed trait addressAlreadyInUse
    extends StObject
       with SocketErrorStatus
  
  /** The address family is not supported. */
  @js.native
  sealed trait addressFamilyNotSupported
    extends StObject
       with SocketErrorStatus
  
  /** Cannot assign requested address. */
  @js.native
  sealed trait cannotAssignRequestedAddress
    extends StObject
       with SocketErrorStatus
  
  /** The certificate is not valid for the requested usage. This error is also returned if the certificate has an invalid name. The name is not included in the permitted list or is explicitly excluded. */
  @js.native
  sealed trait certificateCommonNameIsIncorrect
    extends StObject
       with SocketErrorStatus
  
  /** A required certificate is not within its validity period when verifying against the current system clock or the timestamp in the signed file. This error is also returned if the validity periods of the certification chain do not nest correctly. */
  @js.native
  sealed trait certificateExpired
    extends StObject
       with SocketErrorStatus
  
  /** The supplied certificate is invalid. This can be returned for a number of reasons: */
  @js.native
  sealed trait certificateIsInvalid
    extends StObject
       with SocketErrorStatus
  
  /** The revocation function was unable to check revocation for the certificate. */
  @js.native
  sealed trait certificateNoRevocationCheck
    extends StObject
       with SocketErrorStatus
  
  /** The revocation function was unable to check revocation because the revocation server was offline. */
  @js.native
  sealed trait certificateRevocationServerOffline
    extends StObject
       with SocketErrorStatus
  
  /** A certificate was explicitly revoked by its issuer. This error is also returned if the certificate was explicitly marked as untrusted by the user. */
  @js.native
  sealed trait certificateRevoked
    extends StObject
       with SocketErrorStatus
  
  /** A certificate chain processed, but terminated in a root certificate which is not trusted by the trust provider. This error is also returned if a certificate chain could not be built to a trusted root authority. */
  @js.native
  sealed trait certificateUntrustedRoot
    extends StObject
       with SocketErrorStatus
  
  /** The certificate is not valid for the requested usage. */
  @js.native
  sealed trait certificateWrongUsage
    extends StObject
       with SocketErrorStatus
  
  /** The specified class was not found. */
  @js.native
  sealed trait classTypeNotFound
    extends StObject
       with SocketErrorStatus
  
  /** The connection was refused. */
  @js.native
  sealed trait connectionRefused
    extends StObject
       with SocketErrorStatus
  
  /** The connection was reset by the peer. */
  @js.native
  sealed trait connectionResetByPeer
    extends StObject
       with SocketErrorStatus
  
  /** A connection timeout was exceeded. */
  @js.native
  sealed trait connectionTimedOut
    extends StObject
       with SocketErrorStatus
  
  /** The host is down. */
  @js.native
  sealed trait hostIsDown
    extends StObject
       with SocketErrorStatus
  
  /** The host was not found. */
  @js.native
  sealed trait hostNotFound
    extends StObject
       with SocketErrorStatus
  
  /** A bad response was received from the HTTP server. */
  @js.native
  sealed trait httpInvalidServerResponse
    extends StObject
       with SocketErrorStatus
  
  /** A message sent on a datagram socket was larger than the internal message buffer or some other network limit, or the buffer used to receive a datagram was smaller than the datagram itself. */
  @js.native
  sealed trait messageTooLong
    extends StObject
       with SocketErrorStatus
  
  /** The network dropped connection on reset. */
  @js.native
  sealed trait networkDroppedConnectionOnReset
    extends StObject
       with SocketErrorStatus
  
  /** The network is down. */
  @js.native
  sealed trait networkIsDown
    extends StObject
       with SocketErrorStatus
  
  /** The network is unreachable. */
  @js.native
  sealed trait networkIsUnreachable
    extends StObject
       with SocketErrorStatus
  
  /** The pipe is being closed. */
  @js.native
  sealed trait noAddressesFound
    extends StObject
       with SocketErrorStatus
  
  /** The requested name is valid and was found in the database, but it does not have the correct associated data being resolved for. */
  @js.native
  sealed trait noDataRecordOfRequestedType
    extends StObject
       with SocketErrorStatus
  
  /** This is usually a temporary error during hostname resolution and means that the local server did not receive a response from an authoritative server. */
  @js.native
  sealed trait nonAuthoritativeHostNotFound
    extends StObject
       with SocketErrorStatus
  
  /** The operation was aborted. */
  @js.native
  sealed trait operationAborted
    extends StObject
       with SocketErrorStatus
  
  /** The socket type is not supported. */
  @js.native
  sealed trait socketTypeNotSupported
    extends StObject
       with SocketErrorStatus
  
  /** Software caused a connection abort. */
  @js.native
  sealed trait softwareCausedConnectionAbort
    extends StObject
       with SocketErrorStatus
  
  /** Too many open files. */
  @js.native
  sealed trait tooManyOpenFiles
    extends StObject
       with SocketErrorStatus
  
  /** The socket status is unknown. */
  @js.native
  sealed trait unknown
    extends StObject
       with SocketErrorStatus
  
  /** The host is unreachable. */
  @js.native
  sealed trait unreachableHost
    extends StObject
       with SocketErrorStatus
}
