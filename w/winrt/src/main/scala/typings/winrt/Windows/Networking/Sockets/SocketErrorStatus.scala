package typings.winrt.Windows.Networking.Sockets

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
  
}

