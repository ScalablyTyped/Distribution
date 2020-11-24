package typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DigressOutSlots extends js.Object
/** Whether the user can digress to top-level nodes while filling out slots. */
@JSImport("watson-developer-cloud/assistant/v1", "CreateDialogNodeConstants.DigressOutSlots")
@js.native
object DigressOutSlots extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DigressOutSlots with String] = js.native
  
  @js.native
  sealed trait ALLOW_ALL extends DigressOutSlots
  /* "allow_all" */ @js.native
  object ALLOW_ALL extends TopLevel[ALLOW_ALL with String]
  
  @js.native
  sealed trait ALLOW_RETURNING extends DigressOutSlots
  /* "allow_returning" */ @js.native
  object ALLOW_RETURNING extends TopLevel[ALLOW_RETURNING with String]
  
  @js.native
  sealed trait NOT_ALLOWED extends DigressOutSlots
  /* "not_allowed" */ @js.native
  object NOT_ALLOWED extends TopLevel[NOT_ALLOWED with String]
}
