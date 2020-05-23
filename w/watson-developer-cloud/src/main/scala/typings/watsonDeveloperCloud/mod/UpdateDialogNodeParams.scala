package typings.watsonDeveloperCloud.mod

import typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressIn
import typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressOut
import typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressOutSlots
import typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.EventName
import typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.NodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `updateDialogNode` operation. */
trait UpdateDialogNodeParams extends js.Object {
  /** The dialog node ID (for example, `get_order`). */
  var dialog_node: String
  var headers: js.UndefOr[js.Object] = js.undefined
  /** An array of objects describing any actions to be invoked by the dialog node. */
  var new_actions: js.UndefOr[js.Array[DialogNodeAction]] = js.undefined
  /** The condition that will trigger the dialog node. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 2048 characters. */
  var new_conditions: js.UndefOr[String] = js.undefined
  /** The context for the dialog node. */
  var new_context: js.UndefOr[js.Object] = js.undefined
  /** The description of the dialog node. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var new_description: js.UndefOr[String] = js.undefined
  /** The dialog node ID. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, space, underscore, hyphen, and dot characters. - It must be no longer than 1024 characters. */
  var new_dialog_node: js.UndefOr[String] = js.undefined
  /** Whether this top-level dialog node can be digressed into. */
  var new_digress_in: js.UndefOr[DigressIn | String] = js.undefined
  /** Whether this dialog node can be returned to after a digression. */
  var new_digress_out: js.UndefOr[DigressOut | String] = js.undefined
  /** Whether the user can digress to top-level nodes while filling out slots. */
  var new_digress_out_slots: js.UndefOr[DigressOutSlots | String] = js.undefined
  /** How an `event_handler` node is processed. */
  var new_event_name: js.UndefOr[EventName | String] = js.undefined
  /** The metadata for the dialog node. */
  var new_metadata: js.UndefOr[js.Object] = js.undefined
  /** The next step to execute following this dialog node. */
  var new_next_step: js.UndefOr[DialogNodeNextStep] = js.undefined
  /** How the dialog node is processed. */
  var new_node_type: js.UndefOr[NodeType | String] = js.undefined
  /** The output of the dialog node. For more information about how to specify dialog node output, see the [documentation](https://cloud.ibm.com/docs/services/assistant/dialog-overview.html#dialog-overview-responses). */
  var new_output: js.UndefOr[DialogNodeOutput] = js.undefined
  /** The ID of the parent dialog node. This property is omitted if the dialog node has no parent. */
  var new_parent: js.UndefOr[String] = js.undefined
  /** The ID of the previous sibling dialog node. This property is omitted if the dialog node has no previous sibling. */
  var new_previous_sibling: js.UndefOr[String] = js.undefined
  /** The alias used to identify the dialog node. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, space, underscore, hyphen, and dot characters. - It must be no longer than 64 characters. */
  var new_title: js.UndefOr[String] = js.undefined
  /** A label that can be displayed externally to describe the purpose of the node to users. This string must be no longer than 512 characters. */
  var new_user_label: js.UndefOr[String] = js.undefined
  /** The location in the dialog context where output is stored. */
  var new_variable: js.UndefOr[String] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** Unique identifier of the workspace. */
  var workspace_id: String
}

object UpdateDialogNodeParams {
  @scala.inline
  def apply(
    dialog_node: String,
    workspace_id: String,
    headers: js.Object = null,
    new_actions: js.Array[DialogNodeAction] = null,
    new_conditions: String = null,
    new_context: js.Object = null,
    new_description: String = null,
    new_dialog_node: String = null,
    new_digress_in: DigressIn | String = null,
    new_digress_out: DigressOut | String = null,
    new_digress_out_slots: DigressOutSlots | String = null,
    new_event_name: EventName | String = null,
    new_metadata: js.Object = null,
    new_next_step: DialogNodeNextStep = null,
    new_node_type: NodeType | String = null,
    new_output: DialogNodeOutput = null,
    new_parent: String = null,
    new_previous_sibling: String = null,
    new_title: String = null,
    new_user_label: String = null,
    new_variable: String = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): UpdateDialogNodeParams = {
    val __obj = js.Dynamic.literal(dialog_node = dialog_node.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (new_actions != null) __obj.updateDynamic("new_actions")(new_actions.asInstanceOf[js.Any])
    if (new_conditions != null) __obj.updateDynamic("new_conditions")(new_conditions.asInstanceOf[js.Any])
    if (new_context != null) __obj.updateDynamic("new_context")(new_context.asInstanceOf[js.Any])
    if (new_description != null) __obj.updateDynamic("new_description")(new_description.asInstanceOf[js.Any])
    if (new_dialog_node != null) __obj.updateDynamic("new_dialog_node")(new_dialog_node.asInstanceOf[js.Any])
    if (new_digress_in != null) __obj.updateDynamic("new_digress_in")(new_digress_in.asInstanceOf[js.Any])
    if (new_digress_out != null) __obj.updateDynamic("new_digress_out")(new_digress_out.asInstanceOf[js.Any])
    if (new_digress_out_slots != null) __obj.updateDynamic("new_digress_out_slots")(new_digress_out_slots.asInstanceOf[js.Any])
    if (new_event_name != null) __obj.updateDynamic("new_event_name")(new_event_name.asInstanceOf[js.Any])
    if (new_metadata != null) __obj.updateDynamic("new_metadata")(new_metadata.asInstanceOf[js.Any])
    if (new_next_step != null) __obj.updateDynamic("new_next_step")(new_next_step.asInstanceOf[js.Any])
    if (new_node_type != null) __obj.updateDynamic("new_node_type")(new_node_type.asInstanceOf[js.Any])
    if (new_output != null) __obj.updateDynamic("new_output")(new_output.asInstanceOf[js.Any])
    if (new_parent != null) __obj.updateDynamic("new_parent")(new_parent.asInstanceOf[js.Any])
    if (new_previous_sibling != null) __obj.updateDynamic("new_previous_sibling")(new_previous_sibling.asInstanceOf[js.Any])
    if (new_title != null) __obj.updateDynamic("new_title")(new_title.asInstanceOf[js.Any])
    if (new_user_label != null) __obj.updateDynamic("new_user_label")(new_user_label.asInstanceOf[js.Any])
    if (new_variable != null) __obj.updateDynamic("new_variable")(new_variable.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDialogNodeParams]
  }
}

