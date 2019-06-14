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
  
  /* 10 */ val addressAlreadyInUse: addressAlreadyInUse with scala.Double = js.native
  /* 4 */ val addressFamilyNotSupported: addressFamilyNotSupported with scala.Double = js.native
  /* 11 */ val cannotAssignRequestedAddress: cannotAssignRequestedAddress with scala.Double = js.native
  /* 25 */ val certificateCommonNameIsIncorrect: certificateCommonNameIsIncorrect with scala.Double = js.native
  /* 23 */ val certificateExpired: certificateExpired with scala.Double = js.native
  /* 30 */ val certificateIsInvalid: certificateIsInvalid with scala.Double = js.native
  /* 28 */ val certificateNoRevocationCheck: certificateNoRevocationCheck with scala.Double = js.native
  /* 29 */ val certificateRevocationServerOffline: certificateRevocationServerOffline with scala.Double = js.native
  /* 27 */ val certificateRevoked: certificateRevoked with scala.Double = js.native
  /* 24 */ val certificateUntrustedRoot: certificateUntrustedRoot with scala.Double = js.native
  /* 26 */ val certificateWrongUsage: certificateWrongUsage with scala.Double = js.native
  /* 9 */ val classTypeNotFound: classTypeNotFound with scala.Double = js.native
  /* 12 */ val connectionRefused: connectionRefused with scala.Double = js.native
  /* 18 */ val connectionResetByPeer: connectionResetByPeer with scala.Double = js.native
  /* 3 */ val connectionTimedOut: connectionTimedOut with scala.Double = js.native
  /* 19 */ val hostIsDown: hostIsDown with scala.Double = js.native
  /* 6 */ val hostNotFound: hostNotFound with scala.Double = js.native
  /* 2 */ val httpInvalidServerResponse: httpInvalidServerResponse with scala.Double = js.native
  /* 22 */ val messageTooLong: messageTooLong with scala.Double = js.native
  /* 16 */ val networkDroppedConnectionOnReset: networkDroppedConnectionOnReset with scala.Double = js.native
  /* 15 */ val networkIsDown: networkIsDown with scala.Double = js.native
  /* 13 */ val networkIsUnreachable: networkIsUnreachable with scala.Double = js.native
  /* 20 */ val noAddressesFound: noAddressesFound with scala.Double = js.native
  /* 7 */ val noDataRecordOfRequestedType: noDataRecordOfRequestedType with scala.Double = js.native
  /* 8 */ val nonAuthoritativeHostNotFound: nonAuthoritativeHostNotFound with scala.Double = js.native
  /* 1 */ val operationAborted: operationAborted with scala.Double = js.native
  /* 5 */ val socketTypeNotSupported: socketTypeNotSupported with scala.Double = js.native
  /* 17 */ val softwareCausedConnectionAbort: softwareCausedConnectionAbort with scala.Double = js.native
  /* 21 */ val tooManyOpenFiles: tooManyOpenFiles with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  /* 14 */ val unreachableHost: unreachableHost with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus with scala.Double
  ] = js.native
}

