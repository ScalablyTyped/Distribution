package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocketErrorStatus extends StObject
@JSGlobal("Windows.Networking.Sockets.SocketErrorStatus")
@js.native
object SocketErrorStatus extends StObject {
  
  @js.native
  sealed trait addressAlreadyInUse
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait addressFamilyNotSupported
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait cannotAssignRequestedAddress
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait certificateCommonNameIsIncorrect
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait certificateExpired
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait certificateIsInvalid
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait certificateNoRevocationCheck
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait certificateRevocationServerOffline
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait certificateRevoked
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait certificateUntrustedRoot
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait certificateWrongUsage
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait classTypeNotFound
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait connectionRefused
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait connectionResetByPeer
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait connectionTimedOut
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait hostIsDown
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait hostNotFound
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait httpInvalidServerResponse
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait messageTooLong
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait networkDroppedConnectionOnReset
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait networkIsDown
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait networkIsUnreachable
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait noAddressesFound
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait noDataRecordOfRequestedType
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait nonAuthoritativeHostNotFound
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait operationAborted
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait socketTypeNotSupported
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait softwareCausedConnectionAbort
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait tooManyOpenFiles
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait unknown
    extends StObject
       with SocketErrorStatus
  
  @js.native
  sealed trait unreachableHost
    extends StObject
       with SocketErrorStatus
}
