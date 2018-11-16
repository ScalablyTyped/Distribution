package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs

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
  sealed trait addressAlreadyInUse
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** The address family is not supported. */
  @js.native
  sealed trait addressFamilyNotSupported
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** Cannot assign requested address. */
  @js.native
  sealed trait cannotAssignRequestedAddress
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** The certificate is not valid for the requested usage. This error is also returned if the certificate has an invalid name. The name is not included in the permitted list or is explicitly excluded. */
  @js.native
  sealed trait certificateCommonNameIsIncorrect
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** A required certificate is not within its validity period when verifying against the current system clock or the timestamp in the signed file. This error is also returned if the validity periods of the certification chain do not nest correctly. */
  @js.native
  sealed trait certificateExpired
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** The supplied certificate is invalid. This can be returned for a number of reasons: */
  @js.native
  sealed trait certificateIsInvalid
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** The revocation function was unable to check revocation for the certificate. */
  @js.native
  sealed trait certificateNoRevocationCheck
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** The revocation function was unable to check revocation because the revocation server was offline. */
  @js.native
  sealed trait certificateRevocationServerOffline
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** A certificate was explicitly revoked by its issuer. This error is also returned if the certificate was explicitly marked as untrusted by the user. */
  @js.native
  sealed trait certificateRevoked
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** A certificate chain processed, but terminated in a root certificate which is not trusted by the trust provider. This error is also returned if a certificate chain could not be built to a trusted root authority. */
  @js.native
  sealed trait certificateUntrustedRoot
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** The certificate is not valid for the requested usage. */
  @js.native
  sealed trait certificateWrongUsage
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** The specified class was not found. */
  @js.native
  sealed trait classTypeNotFound
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** The connection was refused. */
  @js.native
  sealed trait connectionRefused
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** The connection was reset by the peer. */
  @js.native
  sealed trait connectionResetByPeer
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** A connection timeout was exceeded. */
  @js.native
  sealed trait connectionTimedOut
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** The host is down. */
  @js.native
  sealed trait hostIsDown
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** The host was not found. */
  @js.native
  sealed trait hostNotFound
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** A bad response was received from the HTTP server. */
  @js.native
  sealed trait httpInvalidServerResponse
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** A message sent on a datagram socket was larger than the internal message buffer or some other network limit, or the buffer used to receive a datagram was smaller than the datagram itself. */
  @js.native
  sealed trait messageTooLong
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** The network dropped connection on reset. */
  @js.native
  sealed trait networkDroppedConnectionOnReset
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** The network is down. */
  @js.native
  sealed trait networkIsDown
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** The network is unreachable. */
  @js.native
  sealed trait networkIsUnreachable
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** The pipe is being closed. */
  @js.native
  sealed trait noAddressesFound
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** The requested name is valid and was found in the database, but it does not have the correct associated data being resolved for. */
  @js.native
  sealed trait noDataRecordOfRequestedType
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** This is usually a temporary error during hostname resolution and means that the local server did not receive a response from an authoritative server. */
  @js.native
  sealed trait nonAuthoritativeHostNotFound
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** The operation was aborted. */
  @js.native
  sealed trait operationAborted
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** The socket type is not supported. */
  @js.native
  sealed trait socketTypeNotSupported
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** Software caused a connection abort. */
  @js.native
  sealed trait softwareCausedConnectionAbort
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** Too many open files. */
  @js.native
  sealed trait tooManyOpenFiles
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** The socket status is unknown. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  /** The host is unreachable. */
  @js.native
  sealed trait unreachableHost
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  val addressAlreadyInUse: addressAlreadyInUse with java.lang.String = js.native
  val addressFamilyNotSupported: addressFamilyNotSupported with java.lang.String = js.native
  val cannotAssignRequestedAddress: cannotAssignRequestedAddress with java.lang.String = js.native
  val certificateCommonNameIsIncorrect: certificateCommonNameIsIncorrect with java.lang.String = js.native
  val certificateExpired: certificateExpired with java.lang.String = js.native
  val certificateIsInvalid: certificateIsInvalid with java.lang.String = js.native
  val certificateNoRevocationCheck: certificateNoRevocationCheck with java.lang.String = js.native
  val certificateRevocationServerOffline: certificateRevocationServerOffline with java.lang.String = js.native
  val certificateRevoked: certificateRevoked with java.lang.String = js.native
  val certificateUntrustedRoot: certificateUntrustedRoot with java.lang.String = js.native
  val certificateWrongUsage: certificateWrongUsage with java.lang.String = js.native
  val classTypeNotFound: classTypeNotFound with java.lang.String = js.native
  val connectionRefused: connectionRefused with java.lang.String = js.native
  val connectionResetByPeer: connectionResetByPeer with java.lang.String = js.native
  val connectionTimedOut: connectionTimedOut with java.lang.String = js.native
  val hostIsDown: hostIsDown with java.lang.String = js.native
  val hostNotFound: hostNotFound with java.lang.String = js.native
  val httpInvalidServerResponse: httpInvalidServerResponse with java.lang.String = js.native
  val messageTooLong: messageTooLong with java.lang.String = js.native
  val networkDroppedConnectionOnReset: networkDroppedConnectionOnReset with java.lang.String = js.native
  val networkIsDown: networkIsDown with java.lang.String = js.native
  val networkIsUnreachable: networkIsUnreachable with java.lang.String = js.native
  val noAddressesFound: noAddressesFound with java.lang.String = js.native
  val noDataRecordOfRequestedType: noDataRecordOfRequestedType with java.lang.String = js.native
  val nonAuthoritativeHostNotFound: nonAuthoritativeHostNotFound with java.lang.String = js.native
  val operationAborted: operationAborted with java.lang.String = js.native
  val socketTypeNotSupported: socketTypeNotSupported with java.lang.String = js.native
  val softwareCausedConnectionAbort: softwareCausedConnectionAbort with java.lang.String = js.native
  val tooManyOpenFiles: tooManyOpenFiles with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val unreachableHost: unreachableHost with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus with java.lang.String
  ] = js.native
}

