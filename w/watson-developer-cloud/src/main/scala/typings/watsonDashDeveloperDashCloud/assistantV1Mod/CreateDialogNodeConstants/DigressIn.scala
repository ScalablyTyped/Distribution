package typings.watsonDashDeveloperDashCloud.assistantV1Mod.CreateDialogNodeConstants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DigressIn extends js.Object

/** Whether this top-level dialog node can be digressed into. */
@JSImport("watson-developer-cloud/assistant/v1", "CreateDialogNodeConstants.DigressIn")
@js.native
object DigressIn extends js.Object {
  @js.native
  sealed trait DOES_NOT_RETURN extends DigressIn
  
  @js.native
  sealed trait NOT_AVAILABLE extends DigressIn
  
  @js.native
  sealed trait RETURNS extends DigressIn
  
  /* "does_not_return" */ val DOES_NOT_RETURN: typings.watsonDashDeveloperDashCloud.assistantV1Mod.CreateDialogNodeConstants.DigressIn.DOES_NOT_RETURN with String = js.native
  /* "not_available" */ val NOT_AVAILABLE: typings.watsonDashDeveloperDashCloud.assistantV1Mod.CreateDialogNodeConstants.DigressIn.NOT_AVAILABLE with String = js.native
  /* "returns" */ val RETURNS: typings.watsonDashDeveloperDashCloud.assistantV1Mod.CreateDialogNodeConstants.DigressIn.RETURNS with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DigressIn with String] = js.native
}

