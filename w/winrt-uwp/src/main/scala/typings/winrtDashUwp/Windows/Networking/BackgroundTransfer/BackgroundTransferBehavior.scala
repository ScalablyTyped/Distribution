package typings.winrtDashUwp.Windows.Networking.BackgroundTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BackgroundTransferBehavior extends js.Object

/** Defines values used to indicate if downloads and uploads within a BackgroundTransferGroup run in simultaneously or in serial. */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferBehavior")
@js.native
object BackgroundTransferBehavior extends js.Object {
  /** Background Transfer operations run simultaneously. */
  @js.native
  sealed trait parallel extends BackgroundTransferBehavior
  
  /** Background Transfer operations run in serial. */
  @js.native
  sealed trait serialized extends BackgroundTransferBehavior
  
  /* 0 */ val parallel: typings.winrtDashUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferBehavior.parallel with Double = js.native
  /* 1 */ val serialized: typings.winrtDashUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferBehavior.serialized with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BackgroundTransferBehavior with Double] = js.native
}

