package typings.winrt.Windows.Networking.BackgroundTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BackgroundTransferStatus extends StObject
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferStatus")
@js.native
object BackgroundTransferStatus extends StObject {
  
  @js.native
  sealed trait canceled
    extends StObject
       with BackgroundTransferStatus
  
  @js.native
  sealed trait completed
    extends StObject
       with BackgroundTransferStatus
  
  @js.native
  sealed trait error
    extends StObject
       with BackgroundTransferStatus
  
  @js.native
  sealed trait idle
    extends StObject
       with BackgroundTransferStatus
  
  @js.native
  sealed trait pausedByApplication
    extends StObject
       with BackgroundTransferStatus
  
  @js.native
  sealed trait pausedCostedNetwork
    extends StObject
       with BackgroundTransferStatus
  
  @js.native
  sealed trait pausedNoNetwork
    extends StObject
       with BackgroundTransferStatus
  
  @js.native
  sealed trait running
    extends StObject
       with BackgroundTransferStatus
}
