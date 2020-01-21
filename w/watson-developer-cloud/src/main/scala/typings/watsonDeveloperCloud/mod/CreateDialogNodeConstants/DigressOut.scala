package typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DigressOut with String] = js.native
  /* "allow_all" */ @js.native
  object ALLOW_ALL extends TopLevel[ALLOW_ALL with String]
  
  /* "allow_all_never_return" */ @js.native
  object ALLOW_ALL_NEVER_RETURN extends TopLevel[ALLOW_ALL_NEVER_RETURN with String]
  
  /* "allow_returning" */ @js.native
  object ALLOW_RETURNING extends TopLevel[ALLOW_RETURNING with String]
  
}

