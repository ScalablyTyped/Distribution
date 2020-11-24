package typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DigressOut extends js.Object
/** Whether this dialog node can be returned to after a digression. */
@JSImport("watson-developer-cloud/assistant/v1", "UpdateDialogNodeConstants.DigressOut")
@js.native
object DigressOut extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DigressOut with String] = js.native
  
  @js.native
  sealed trait ALLOW_ALL extends DigressOut
  /* "allow_all" */ @js.native
  object ALLOW_ALL extends TopLevel[ALLOW_ALL with String]
  
  @js.native
  sealed trait ALLOW_ALL_NEVER_RETURN extends DigressOut
  /* "allow_all_never_return" */ @js.native
  object ALLOW_ALL_NEVER_RETURN extends TopLevel[ALLOW_ALL_NEVER_RETURN with String]
  
  @js.native
  sealed trait ALLOW_RETURNING extends DigressOut
  /* "allow_returning" */ @js.native
  object ALLOW_RETURNING extends TopLevel[ALLOW_RETURNING with String]
}
