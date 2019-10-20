package typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DigressOutSlots extends js.Object

/** Whether the user can digress to top-level nodes while filling out slots. */
@JSImport("watson-developer-cloud/assistant/v1", "UpdateDialogNodeConstants.DigressOutSlots")
@js.native
object DigressOutSlots extends js.Object {
  @js.native
  sealed trait ALLOW_ALL extends DigressOutSlots
  
  @js.native
  sealed trait ALLOW_RETURNING extends DigressOutSlots
  
  @js.native
  sealed trait NOT_ALLOWED extends DigressOutSlots
  
  /* "allow_all" */ val ALLOW_ALL: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressOutSlots.ALLOW_ALL with String = js.native
  /* "allow_returning" */ val ALLOW_RETURNING: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressOutSlots.ALLOW_RETURNING with String = js.native
  /* "not_allowed" */ val NOT_ALLOWED: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressOutSlots.NOT_ALLOWED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DigressOutSlots with String] = js.native
}

