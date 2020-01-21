package typings.winrtUwp.Windows.Media.Protection

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RenewalStatus extends js.Object

/** Defines the possible values returned from RenewSystemComponentsAsync . */
@JSGlobal("Windows.Media.Protection.RenewalStatus")
@js.native
object RenewalStatus extends js.Object {
  /** Specifies that no system components were detected that need updating. But app components may need to be updated, in which case the user may need to get an updated application from the store. */
  @js.native
  sealed trait appComponentsMayNeedUpdating extends RenewalStatus
  
  /** Specifies that no components were found that need to be updated. */
  @js.native
  sealed trait noComponentsFound extends RenewalStatus
  
  /** Specifies that renewal has not started. */
  @js.native
  sealed trait notStarted extends RenewalStatus
  
  /** Specifies that there are updates and the user has allowed updated to proceed */
  @js.native
  sealed trait updatesInProgress extends RenewalStatus
  
  /** Specifies that the user declined to allow updates to proceed. */
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

