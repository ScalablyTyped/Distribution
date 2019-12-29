package typings.winrt.Windows.Networking.BackgroundTransfer

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BackgroundTransferStatus with Double] = js.native
  /* 6 */ @js.native
  object canceled extends TopLevel[canceled with Double]
  
  /* 5 */ @js.native
  object completed extends TopLevel[completed with Double]
  
  /* 7 */ @js.native
  object error extends TopLevel[error with Double]
  
  /* 0 */ @js.native
  object idle extends TopLevel[idle with Double]
  
  /* 2 */ @js.native
  object pausedByApplication extends TopLevel[pausedByApplication with Double]
  
  /* 3 */ @js.native
  object pausedCostedNetwork extends TopLevel[pausedCostedNetwork with Double]
  
  /* 4 */ @js.native
  object pausedNoNetwork extends TopLevel[pausedNoNetwork with Double]
  
  /* 1 */ @js.native
  object running extends TopLevel[running with Double]
  
}

