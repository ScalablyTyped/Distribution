package typings.winrt.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocketErrorStatus extends js.Object

@JSGlobal("Windows.Networking.Sockets.SocketErrorStatus")
@js.native
object SocketErrorStatus extends js.Object {
  @js.native
  sealed trait addressAlreadyInUse extends SocketErrorStatus
  
  @js.native
  sealed trait addressFamilyNotSupported extends SocketErrorStatus
  
  @js.native
  sealed trait cannotAssignRequestedAddress extends SocketErrorStatus
  
  @js.native
  sealed trait certificateCommonNameIsIncorrect extends SocketErrorStatus
  
  @js.native
  sealed trait certificateExpired extends SocketErrorStatus
  
  @js.native
  sealed trait certificateIsInvalid extends SocketErrorStatus
  
  @js.native
  sealed trait certificateNoRevocationCheck extends SocketErrorStatus
  
  @js.native
  sealed trait certificateRevocationServerOffline extends SocketErrorStatus
  
  @js.native
  sealed trait certificateRevoked extends SocketErrorStatus
  
  @js.native
  sealed trait certificateUntrustedRoot extends SocketErrorStatus
  
  @js.native
  sealed trait certificateWrongUsage extends SocketErrorStatus
  
  @js.native
  sealed trait classTypeNotFound extends SocketErrorStatus
  
  @js.native
  sealed trait connectionRefused extends SocketErrorStatus
  
  @js.native
  sealed trait connectionResetByPeer extends SocketErrorStatus
  
  @js.native
  sealed trait connectionTimedOut extends SocketErrorStatus
  
  @js.native
  sealed trait hostIsDown extends SocketErrorStatus
  
  @js.native
  sealed trait hostNotFound extends SocketErrorStatus
  
  @js.native
  sealed trait httpInvalidServerResponse extends SocketErrorStatus
  
  @js.native
  sealed trait messageTooLong extends SocketErrorStatus
  
  @js.native
  sealed trait networkDroppedConnectionOnReset extends SocketErrorStatus
  
  @js.native
  sealed trait networkIsDown extends SocketErrorStatus
  
  @js.native
  sealed trait networkIsUnreachable extends SocketErrorStatus
  
  @js.native
  sealed trait noAddressesFound extends SocketErrorStatus
  
  @js.native
  sealed trait noDataRecordOfRequestedType extends SocketErrorStatus
  
  @js.native
  sealed trait nonAuthoritativeHostNotFound extends SocketErrorStatus
  
  @js.native
  sealed trait operationAborted extends SocketErrorStatus
  
  @js.native
  sealed trait socketTypeNotSupported extends SocketErrorStatus
  
  @js.native
  sealed trait softwareCausedConnectionAbort extends SocketErrorStatus
  
  @js.native
  sealed trait tooManyOpenFiles extends SocketErrorStatus
  
  @js.native
  sealed trait unknown extends SocketErrorStatus
  
  @js.native
  sealed trait unreachableHost extends SocketErrorStatus
  
  /* 10 */ val addressAlreadyInUse: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.addressAlreadyInUse with Double = js.native
  /* 4 */ val addressFamilyNotSupported: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.addressFamilyNotSupported with Double = js.native
  /* 11 */ val cannotAssignRequestedAddress: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.cannotAssignRequestedAddress with Double = js.native
  /* 25 */ val certificateCommonNameIsIncorrect: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.certificateCommonNameIsIncorrect with Double = js.native
  /* 23 */ val certificateExpired: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.certificateExpired with Double = js.native
  /* 30 */ val certificateIsInvalid: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.certificateIsInvalid with Double = js.native
  /* 28 */ val certificateNoRevocationCheck: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.certificateNoRevocationCheck with Double = js.native
  /* 29 */ val certificateRevocationServerOffline: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.certificateRevocationServerOffline with Double = js.native
  /* 27 */ val certificateRevoked: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.certificateRevoked with Double = js.native
  /* 24 */ val certificateUntrustedRoot: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.certificateUntrustedRoot with Double = js.native
  /* 26 */ val certificateWrongUsage: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.certificateWrongUsage with Double = js.native
  /* 9 */ val classTypeNotFound: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.classTypeNotFound with Double = js.native
  /* 12 */ val connectionRefused: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.connectionRefused with Double = js.native
  /* 18 */ val connectionResetByPeer: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.connectionResetByPeer with Double = js.native
  /* 3 */ val connectionTimedOut: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.connectionTimedOut with Double = js.native
  /* 19 */ val hostIsDown: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.hostIsDown with Double = js.native
  /* 6 */ val hostNotFound: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.hostNotFound with Double = js.native
  /* 2 */ val httpInvalidServerResponse: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.httpInvalidServerResponse with Double = js.native
  /* 22 */ val messageTooLong: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.messageTooLong with Double = js.native
  /* 16 */ val networkDroppedConnectionOnReset: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.networkDroppedConnectionOnReset with Double = js.native
  /* 15 */ val networkIsDown: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.networkIsDown with Double = js.native
  /* 13 */ val networkIsUnreachable: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.networkIsUnreachable with Double = js.native
  /* 20 */ val noAddressesFound: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.noAddressesFound with Double = js.native
  /* 7 */ val noDataRecordOfRequestedType: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.noDataRecordOfRequestedType with Double = js.native
  /* 8 */ val nonAuthoritativeHostNotFound: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.nonAuthoritativeHostNotFound with Double = js.native
  /* 1 */ val operationAborted: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.operationAborted with Double = js.native
  /* 5 */ val socketTypeNotSupported: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.socketTypeNotSupported with Double = js.native
  /* 17 */ val softwareCausedConnectionAbort: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.softwareCausedConnectionAbort with Double = js.native
  /* 21 */ val tooManyOpenFiles: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.tooManyOpenFiles with Double = js.native
  /* 0 */ val unknown: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.unknown with Double = js.native
  /* 14 */ val unreachableHost: typings.winrt.WindowsNs.NetworkingNs.SocketsNs.SocketErrorStatus.unreachableHost with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocketErrorStatus with Double] = js.native
}

