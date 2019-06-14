package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocketErrorStatus extends js.Object

@JSGlobal("Windows.Networking.Sockets.SocketErrorStatus")
@js.native
object SocketErrorStatus extends js.Object {
  @js.native
  sealed trait addressAlreadyInUse
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait addressFamilyNotSupported
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait cannotAssignRequestedAddress
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait certificateCommonNameIsIncorrect
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait certificateExpired
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait certificateIsInvalid
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait certificateNoRevocationCheck
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait certificateRevocationServerOffline
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait certificateRevoked
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait certificateUntrustedRoot
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait certificateWrongUsage
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait classTypeNotFound
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait connectionRefused
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait connectionResetByPeer
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait connectionTimedOut
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait hostIsDown
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait hostNotFound
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait httpInvalidServerResponse
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait messageTooLong
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait networkDroppedConnectionOnReset
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait networkIsDown
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait networkIsUnreachable
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait noAddressesFound
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait noDataRecordOfRequestedType
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait nonAuthoritativeHostNotFound
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait operationAborted
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait socketTypeNotSupported
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait softwareCausedConnectionAbort
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait tooManyOpenFiles
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait unknown
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
  @js.native
  sealed trait unreachableHost
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus
  
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
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus with scala.Double] = js.native
}

