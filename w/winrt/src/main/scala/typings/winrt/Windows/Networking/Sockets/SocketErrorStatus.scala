package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocketErrorStatus with Double] = js.native
  /* 10 */ @js.native
  object addressAlreadyInUse extends TopLevel[addressAlreadyInUse with Double]
  
  /* 4 */ @js.native
  object addressFamilyNotSupported extends TopLevel[addressFamilyNotSupported with Double]
  
  /* 11 */ @js.native
  object cannotAssignRequestedAddress extends TopLevel[cannotAssignRequestedAddress with Double]
  
  /* 25 */ @js.native
  object certificateCommonNameIsIncorrect extends TopLevel[certificateCommonNameIsIncorrect with Double]
  
  /* 23 */ @js.native
  object certificateExpired extends TopLevel[certificateExpired with Double]
  
  /* 30 */ @js.native
  object certificateIsInvalid extends TopLevel[certificateIsInvalid with Double]
  
  /* 28 */ @js.native
  object certificateNoRevocationCheck extends TopLevel[certificateNoRevocationCheck with Double]
  
  /* 29 */ @js.native
  object certificateRevocationServerOffline extends TopLevel[certificateRevocationServerOffline with Double]
  
  /* 27 */ @js.native
  object certificateRevoked extends TopLevel[certificateRevoked with Double]
  
  /* 24 */ @js.native
  object certificateUntrustedRoot extends TopLevel[certificateUntrustedRoot with Double]
  
  /* 26 */ @js.native
  object certificateWrongUsage extends TopLevel[certificateWrongUsage with Double]
  
  /* 9 */ @js.native
  object classTypeNotFound extends TopLevel[classTypeNotFound with Double]
  
  /* 12 */ @js.native
  object connectionRefused extends TopLevel[connectionRefused with Double]
  
  /* 18 */ @js.native
  object connectionResetByPeer extends TopLevel[connectionResetByPeer with Double]
  
  /* 3 */ @js.native
  object connectionTimedOut extends TopLevel[connectionTimedOut with Double]
  
  /* 19 */ @js.native
  object hostIsDown extends TopLevel[hostIsDown with Double]
  
  /* 6 */ @js.native
  object hostNotFound extends TopLevel[hostNotFound with Double]
  
  /* 2 */ @js.native
  object httpInvalidServerResponse extends TopLevel[httpInvalidServerResponse with Double]
  
  /* 22 */ @js.native
  object messageTooLong extends TopLevel[messageTooLong with Double]
  
  /* 16 */ @js.native
  object networkDroppedConnectionOnReset extends TopLevel[networkDroppedConnectionOnReset with Double]
  
  /* 15 */ @js.native
  object networkIsDown extends TopLevel[networkIsDown with Double]
  
  /* 13 */ @js.native
  object networkIsUnreachable extends TopLevel[networkIsUnreachable with Double]
  
  /* 20 */ @js.native
  object noAddressesFound extends TopLevel[noAddressesFound with Double]
  
  /* 7 */ @js.native
  object noDataRecordOfRequestedType extends TopLevel[noDataRecordOfRequestedType with Double]
  
  /* 8 */ @js.native
  object nonAuthoritativeHostNotFound extends TopLevel[nonAuthoritativeHostNotFound with Double]
  
  /* 1 */ @js.native
  object operationAborted extends TopLevel[operationAborted with Double]
  
  /* 5 */ @js.native
  object socketTypeNotSupported extends TopLevel[socketTypeNotSupported with Double]
  
  /* 17 */ @js.native
  object softwareCausedConnectionAbort extends TopLevel[softwareCausedConnectionAbort with Double]
  
  /* 21 */ @js.native
  object tooManyOpenFiles extends TopLevel[tooManyOpenFiles with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 14 */ @js.native
  object unreachableHost extends TopLevel[unreachableHost with Double]
  
}

