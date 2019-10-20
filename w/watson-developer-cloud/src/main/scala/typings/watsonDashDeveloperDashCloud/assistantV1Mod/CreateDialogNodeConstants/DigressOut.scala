package typings.watsonDashDeveloperDashCloud.assistantV1Mod.CreateDialogNodeConstants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DigressOut extends js.Object

/** Whether this dialog node can be returned to after a digression. */
@JSImport("watson-developer-cloud/assistant/v1", "CreateDialogNodeConstants.DigressOut")
@js.native
object DigressOut extends js.Object {
  @js.native
  sealed trait ALLOW_ALL extends DigressOut
  
  @js.native
  sealed trait ALLOW_ALL_NEVER_RETURN extends DigressOut
  
  @js.native
  sealed trait ALLOW_RETURNING extends DigressOut
  
  /* "allow_all" */ val ALLOW_ALL: typings.watsonDashDeveloperDashCloud.assistantV1Mod.CreateDialogNodeConstants.DigressOut.ALLOW_ALL with String = js.native
  /* "allow_all_never_return" */ val ALLOW_ALL_NEVER_RETURN: typings.watsonDashDeveloperDashCloud.assistantV1Mod.CreateDialogNodeConstants.DigressOut.ALLOW_ALL_NEVER_RETURN with String = js.native
  /* "allow_returning" */ val ALLOW_RETURNING: typings.watsonDashDeveloperDashCloud.assistantV1Mod.CreateDialogNodeConstants.DigressOut.ALLOW_RETURNING with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DigressOut with String] = js.native
}

