package typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NodeType extends js.Object

/** How the dialog node is processed. */
@JSImport("watson-developer-cloud/assistant/v1", "UpdateDialogNodeConstants.NodeType")
@js.native
object NodeType extends js.Object {
  @js.native
  sealed trait EVENT_HANDLER extends NodeType
  
  @js.native
  sealed trait FOLDER extends NodeType
  
  @js.native
  sealed trait FRAME extends NodeType
  
  @js.native
  sealed trait RESPONSE_CONDITION extends NodeType
  
  @js.native
  sealed trait SLOT extends NodeType
  
  @js.native
  sealed trait STANDARD extends NodeType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NodeType with String] = js.native
  /* "event_handler" */ @js.native
  object EVENT_HANDLER extends TopLevel[EVENT_HANDLER with String]
  
  /* "folder" */ @js.native
  object FOLDER extends TopLevel[FOLDER with String]
  
  /* "frame" */ @js.native
  object FRAME extends TopLevel[FRAME with String]
  
  /* "response_condition" */ @js.native
  object RESPONSE_CONDITION extends TopLevel[RESPONSE_CONDITION with String]
  
  /* "slot" */ @js.native
  object SLOT extends TopLevel[SLOT with String]
  
  /* "standard" */ @js.native
  object STANDARD extends TopLevel[STANDARD with String]
  
}

