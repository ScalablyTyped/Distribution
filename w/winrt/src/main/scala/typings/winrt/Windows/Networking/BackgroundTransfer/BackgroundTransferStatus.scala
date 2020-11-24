package typings.winrt.Windows.Networking.BackgroundTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BackgroundTransferStatus extends js.Object
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferStatus")
@js.native
object BackgroundTransferStatus extends js.Object {
  
  @js.native
  sealed trait canceled extends BackgroundTransferStatus
  
  @js.native
  sealed trait completed extends BackgroundTransferStatus
  
  @js.native
  sealed trait error extends BackgroundTransferStatus
  
  @js.native
  sealed trait idle extends BackgroundTransferStatus
  
  @js.native
  sealed trait pausedByApplication extends BackgroundTransferStatus
  
  @js.native
  sealed trait pausedCostedNetwork extends BackgroundTransferStatus
  
  @js.native
  sealed trait pausedNoNetwork extends BackgroundTransferStatus
  
  @js.native
  sealed trait running extends BackgroundTransferStatus
}
