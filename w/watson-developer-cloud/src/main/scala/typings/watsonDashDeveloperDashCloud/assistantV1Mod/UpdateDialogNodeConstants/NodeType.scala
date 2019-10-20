package typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants

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
  
  /* "event_handler" */ val EVENT_HANDLER: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.NodeType.EVENT_HANDLER with String = js.native
  /* "folder" */ val FOLDER: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.NodeType.FOLDER with String = js.native
  /* "frame" */ val FRAME: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.NodeType.FRAME with String = js.native
  /* "response_condition" */ val RESPONSE_CONDITION: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.NodeType.RESPONSE_CONDITION with String = js.native
  /* "slot" */ val SLOT: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.NodeType.SLOT with String = js.native
  /* "standard" */ val STANDARD: typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateDialogNodeConstants.NodeType.STANDARD with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NodeType with String] = js.native
}

