package typings.winrt.Windows.Media.Protection

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RenewalStatus extends js.Object

@JSGlobal("Windows.Media.Protection.RenewalStatus")
@js.native
object RenewalStatus extends js.Object {
  @js.native
  sealed trait appComponentsMayNeedUpdating extends RenewalStatus
  
  @js.native
  sealed trait noComponentsFound extends RenewalStatus
  
  @js.native
  sealed trait notStarted extends RenewalStatus
  
  @js.native
  sealed trait updatesInProgress extends RenewalStatus
  
  @js.native
  sealed trait userCancelled extends RenewalStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RenewalStatus with Double] = js.native
  /* 3 */ @js.native
  object appComponentsMayNeedUpdating extends TopLevel[appComponentsMayNeedUpdating with Double]
  
  /* 4 */ @js.native
  object noComponentsFound extends TopLevel[noComponentsFound with Double]
  
  /* 0 */ @js.native
  object notStarted extends TopLevel[notStarted with Double]
  
  /* 1 */ @js.native
  object updatesInProgress extends TopLevel[updatesInProgress with Double]
  
  /* 2 */ @js.native
  object userCancelled extends TopLevel[userCancelled with Double]
  
}

