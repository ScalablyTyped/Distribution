package typings.winrtDashUwp.Windows.Media.Protection

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
  
  /* 3 */ val appComponentsMayNeedUpdating: typings.winrtDashUwp.Windows.Media.Protection.RenewalStatus.appComponentsMayNeedUpdating with Double = js.native
  /* 4 */ val noComponentsFound: typings.winrtDashUwp.Windows.Media.Protection.RenewalStatus.noComponentsFound with Double = js.native
  /* 0 */ val notStarted: typings.winrtDashUwp.Windows.Media.Protection.RenewalStatus.notStarted with Double = js.native
  /* 1 */ val updatesInProgress: typings.winrtDashUwp.Windows.Media.Protection.RenewalStatus.updatesInProgress with Double = js.native
  /* 2 */ val userCancelled: typings.winrtDashUwp.Windows.Media.Protection.RenewalStatus.userCancelled with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RenewalStatus with Double] = js.native
}

