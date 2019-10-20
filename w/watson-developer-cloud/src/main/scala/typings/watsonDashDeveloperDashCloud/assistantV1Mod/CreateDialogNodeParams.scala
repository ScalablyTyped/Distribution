package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import typings.watsonDashDeveloperDashCloud.assistantV1Mod.CreateDialogNodeConstants.DigressIn
import typings.watsonDashDeveloperDashCloud.assistantV1Mod.CreateDialogNodeConstants.DigressOut
import typings.watsonDashDeveloperDashCloud.assistantV1Mod.CreateDialogNodeConstants.DigressOutSlots
import typings.watsonDashDeveloperDashCloud.assistantV1Mod.CreateDialogNodeConstants.EventName
import typings.watsonDashDeveloperDashCloud.assistantV1Mod.CreateDialogNodeConstants.NodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createDialogNode` operation. */
trait CreateDialogNodeParams extends js.Object {
  /** An array of objects describing any actions to be invoked by the dialog node. */
  var actions: js.UndefOr[js.Array[DialogNodeAction]] = js.undefined
  /** The condition that will trigger the dialog node. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 2048 characters. */
  var conditions: js.UndefOr[String] = js.undefined
  /** The context for the dialog node. */
  var context: js.UndefOr[js.Object] = js.undefined
  /** The description of the dialog node. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var description: js.UndefOr[String] = js.undefined
  /** The dialog node ID. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, space, underscore, hyphen, and dot characters. - It must be no longer than 1024 characters. */
  var dialog_node: String
  /** Whether this top-level dialog node can be digressed into. */
  var digress_in: js.UndefOr[DigressIn | String] = js.undefined
  /** Whether this dialog node can be returned to after a digression. */
  var digress_out: js.UndefOr[DigressOut | String] = js.undefined
  /** Whether the user can digress to top-level nodes while filling out slots. */
  var digress_out_slots: js.UndefOr[DigressOutSlots | String] = js.undefined
  /** How an `event_handler` node is processed. */
  var event_name: js.UndefOr[EventName | String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The metadata for the dialog node. */
  var metadata: js.UndefOr[js.Object] = js.undefined
  /** The next step to execute following this dialog node. */
  var next_step: js.UndefOr[DialogNodeNextStep] = js.undefined
  /** How the dialog node is processed. */
  var node_type: js.UndefOr[NodeType | String] = js.undefined
  /** The output of the dialog node. For more information about how to specify dialog node output, see the [documentation](https://cloud.ibm.com/docs/services/assistant/dialog-overview.html#dialog-overview-responses). */
  var output: js.UndefOr[DialogNodeOutput] = js.undefined
  /** The ID of the parent dialog node. This property is omitted if the dialog node has no parent. */
  var parent: js.UndefOr[String] = js.undefined
  /** The ID of the previous sibling dialog node. This property is omitted if the dialog node has no previous sibling. */
  var previous_sibling: js.UndefOr[String] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** The alias used to identify the dialog node. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, space, underscore, hyphen, and dot characters. - It must be no longer than 64 characters. */
  var title: js.UndefOr[String] = js.undefined
  /** A label that can be displayed externally to describe the purpose of the node to users. This string must be no longer than 512 characters. */
  var user_label: js.UndefOr[String] = js.undefined
  /** The location in the dialog context where output is stored. */
  var variable: js.UndefOr[String] = js.undefined
  /** Unique identifier of the workspace. */
  var workspace_id: String
}

object CreateDialogNodeParams {
  @scala.inline
  def apply(
    dialog_node: String,
    workspace_id: String,
    actions: js.Array[DialogNodeAction] = null,
    conditions: String = null,
    context: js.Object = null,
    description: String = null,
    digress_in: DigressIn | String = null,
    digress_out: DigressOut | String = null,
    digress_out_slots: DigressOutSlots | String = null,
    event_name: EventName | String = null,
    headers: js.Object = null,
    metadata: js.Object = null,
    next_step: DialogNodeNextStep = null,
    node_type: NodeType | String = null,
    output: DialogNodeOutput = null,
    parent: String = null,
    previous_sibling: String = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    user_label: String = null,
    variable: String = null
  ): CreateDialogNodeParams = {
    val __obj = js.Dynamic.literal(dialog_node = dialog_node, workspace_id = workspace_id)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (conditions != null) __obj.updateDynamic("conditions")(conditions)
    if (context != null) __obj.updateDynamic("context")(context)
    if (description != null) __obj.updateDynamic("description")(description)
    if (digress_in != null) __obj.updateDynamic("digress_in")(digress_in.asInstanceOf[js.Any])
    if (digress_out != null) __obj.updateDynamic("digress_out")(digress_out.asInstanceOf[js.Any])
    if (digress_out_slots != null) __obj.updateDynamic("digress_out_slots")(digress_out_slots.asInstanceOf[js.Any])
    if (event_name != null) __obj.updateDynamic("event_name")(event_name.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (next_step != null) __obj.updateDynamic("next_step")(next_step)
    if (node_type != null) __obj.updateDynamic("node_type")(node_type.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (previous_sibling != null) __obj.updateDynamic("previous_sibling")(previous_sibling)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    if (title != null) __obj.updateDynamic("title")(title)
    if (user_label != null) __obj.updateDynamic("user_label")(user_label)
    if (variable != null) __obj.updateDynamic("variable")(variable)
    __obj.asInstanceOf[CreateDialogNodeParams]
  }
}

