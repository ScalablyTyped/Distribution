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
    winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus with java.lang.String
  ] = js.native
}

