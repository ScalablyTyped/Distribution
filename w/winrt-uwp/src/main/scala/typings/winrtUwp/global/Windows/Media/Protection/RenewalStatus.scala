package typings.winrtUwp.global.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the possible values returned from RenewSystemComponentsAsync . */
@JSGlobal("Windows.Media.Protection.RenewalStatus")
@js.native
object RenewalStatus extends js.Object {
  /* 3 */ val appComponentsMayNeedUpdating: typings.winrtUwp.Windows.Media.Protection.RenewalStatus.appComponentsMayNeedUpdating with Double = js.native
  /* 4 */ val noComponentsFound: typings.winrtUwp.Windows.Media.Protection.RenewalStatus.noComponentsFound with Double = js.native
  /* 0 */ val notStarted: typings.winrtUwp.Windows.Media.Protection.RenewalStatus.notStarted with Double = js.native
  /* 1 */ val updatesInProgress: typings.winrtUwp.Windows.Media.Protection.RenewalStatus.updatesInProgress with Double = js.native
  /* 2 */ val userCancelled: typings.winrtUwp.Windows.Media.Protection.RenewalStatus.userCancelled with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Protection.RenewalStatus with Double] = js.native
}

