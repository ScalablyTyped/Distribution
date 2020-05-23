package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DialogNode. */
trait DialogNode extends js.Object {
  /** An array of objects describing any actions to be invoked by the dialog node. */
  var actions: js.UndefOr[js.Array[DialogNodeAction]] = js.undefined
  /** The condition that will trigger the dialog node. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 2048 characters. */
  var conditions: js.UndefOr[String] = js.undefined
  /** The context for the dialog node. */
  var context: js.UndefOr[js.Object] = js.undefined
  /** The timestamp for creation of the object. */
  var created: js.UndefOr[String] = js.undefined
  /** The description of the dialog node. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var description: js.UndefOr[String] = js.undefined
  /** The dialog node ID. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, space, underscore, hyphen, and dot characters. - It must be no longer than 1024 characters. */
  var dialog_node: String
  /** Whether this top-level dialog node can be digressed into. */
  var digress_in: js.UndefOr[String] = js.undefined
  /** Whether this dialog node can be returned to after a digression. */
  var digress_out: js.UndefOr[String] = js.undefined
  /** Whether the user can digress to top-level nodes while filling out slots. */
  var digress_out_slots: js.UndefOr[String] = js.undefined
  /** For internal use only. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** How an `event_handler` node is processed. */
  var event_name: js.UndefOr[String] = js.undefined
  /** The metadata for the dialog node. */
  var metadata: js.UndefOr[js.Object] = js.undefined
  /** The next step to execute following this dialog node. */
  var next_step: js.UndefOr[DialogNodeNextStep] = js.undefined
  /** How the dialog node is processed. */
  var node_type: js.UndefOr[String] = js.undefined
  /** The output of the dialog node. For more information about how to specify dialog node output, see the [documentation](https://cloud.ibm.com/docs/services/assistant/dialog-overview.html#dialog-overview-responses). */
  var output: js.UndefOr[DialogNodeOutput] = js.undefined
  /** The ID of the parent dialog node. This property is omitted if the dialog node has no parent. */
  var parent: js.UndefOr[String] = js.undefined
  /** The ID of the previous sibling dialog node. This property is omitted if the dialog node has no previous sibling. */
  var previous_sibling: js.UndefOr[String] = js.undefined
  /** The alias used to identify the dialog node. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, space, underscore, hyphen, and dot characters. - It must be no longer than 64 characters. */
  var title: js.UndefOr[String] = js.undefined
  /** The timestamp for the most recent update to the object. */
  var updated: js.UndefOr[String] = js.undefined
  /** A label that can be displayed externally to describe the purpose of the node to users. This string must be no longer than 512 characters. */
  var user_label: js.UndefOr[String] = js.undefined
  /** The location in the dialog context where output is stored. */
  var variable: js.UndefOr[String] = js.undefined
}

object DialogNode {
  @scala.inline
  def apply(
    dialog_node: String,
    actions: js.Array[DialogNodeAction] = null,
    conditions: String = null,
    context: js.Object = null,
    created: String = null,
    description: String = null,
    digress_in: String = null,
    digress_out: String = null,
    digress_out_slots: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    event_name: String = null,
    metadata: js.Object = null,
    next_step: DialogNodeNextStep = null,
    node_type: String = null,
    output: DialogNodeOutput = null,
    parent: String = null,
    previous_sibling: String = null,
    title: String = null,
    updated: String = null,
    user_label: String = null,
    variable: String = null
  ): DialogNode = {
    val __obj = js.Dynamic.literal(dialog_node = dialog_node.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (digress_in != null) __obj.updateDynamic("digress_in")(digress_in.asInstanceOf[js.Any])
    if (digress_out != null) __obj.updateDynamic("digress_out")(digress_out.asInstanceOf[js.Any])
    if (digress_out_slots != null) __obj.updateDynamic("digress_out_slots")(digress_out_slots.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (event_name != null) __obj.updateDynamic("event_name")(event_name.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (next_step != null) __obj.updateDynamic("next_step")(next_step.asInstanceOf[js.Any])
    if (node_type != null) __obj.updateDynamic("node_type")(node_type.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (previous_sibling != null) __obj.updateDynamic("previous_sibling")(previous_sibling.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (user_label != null) __obj.updateDynamic("user_label")(user_label.asInstanceOf[js.Any])
    if (variable != null) __obj.updateDynamic("variable")(variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogNode]
  }
}

