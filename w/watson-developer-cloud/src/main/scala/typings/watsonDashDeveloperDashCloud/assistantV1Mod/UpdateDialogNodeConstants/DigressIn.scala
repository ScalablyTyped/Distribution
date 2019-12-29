package typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DigressIn extends js.Object

/** Whether this top-level dialog node can be digressed into. */
@JSImport("watson-developer-cloud/assistant/v1", "UpdateDialogNodeConstants.DigressIn")
@js.native
object DigressIn extends js.Object {
  @js.native
  sealed trait DOES_NOT_RETURN extends DigressIn
  
  @js.native
  sealed trait NOT_AVAILABLE extends DigressIn
  
  @js.native
  sealed trait RETURNS extends DigressIn
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DigressIn with String] = js.native
  /* "does_not_return" */ @js.native
  object DOES_NOT_RETURN extends TopLevel[DOES_NOT_RETURN with String]
  
  /* "not_available" */ @js.native
  object NOT_AVAILABLE extends TopLevel[NOT_AVAILABLE with String]
  
  /* "returns" */ @js.native
  object RETURNS extends TopLevel[RETURNS with String]
  
}

