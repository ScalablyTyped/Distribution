package typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NodeType extends js.Object
/** How the dialog node is processed. */
@JSImport("watson-developer-cloud/assistant/v1", "CreateDialogNodeConstants.NodeType")
@js.native
object NodeType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NodeType with String] = js.native
  
  @js.native
  sealed trait EVENT_HANDLER extends NodeType
  /* "event_handler" */ @js.native
  object EVENT_HANDLER extends TopLevel[EVENT_HANDLER with String]
  
  @js.native
  sealed trait FOLDER extends NodeType
  /* "folder" */ @js.native
  object FOLDER extends TopLevel[FOLDER with String]
  
  @js.native
  sealed trait FRAME extends NodeType
  /* "frame" */ @js.native
  object FRAME extends TopLevel[FRAME with String]
  
  @js.native
  sealed trait RESPONSE_CONDITION extends NodeType
  /* "response_condition" */ @js.native
  object RESPONSE_CONDITION extends TopLevel[RESPONSE_CONDITION with String]
  
  @js.native
  sealed trait SLOT extends NodeType
  /* "slot" */ @js.native
  object SLOT extends TopLevel[SLOT with String]
  
  @js.native
  sealed trait STANDARD extends NodeType
  /* "standard" */ @js.native
  object STANDARD extends TopLevel[STANDARD with String]
}
