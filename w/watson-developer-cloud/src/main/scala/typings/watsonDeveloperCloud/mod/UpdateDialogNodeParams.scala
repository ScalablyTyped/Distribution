package typings.watsonDeveloperCloud.mod

import typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressIn
import typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressOut
import typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressOutSlots
import typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.EventName
import typings.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.NodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `updateDialogNode` operation. */
@js.native
trait UpdateDialogNodeParams extends js.Object {
  
  /** The dialog node ID (for example, `get_order`). */
  var dialog_node: String = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  /** An array of objects describing any actions to be invoked by the dialog node. */
  var new_actions: js.UndefOr[js.Array[DialogNodeAction]] = js.native
  
  /** The condition that will trigger the dialog node. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 2048 characters. */
  var new_conditions: js.UndefOr[String] = js.native
  
  /** The context for the dialog node. */
  var new_context: js.UndefOr[js.Object] = js.native
  
  /** The description of the dialog node. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var new_description: js.UndefOr[String] = js.native
  
  /** The dialog node ID. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, space, underscore, hyphen, and dot characters. - It must be no longer than 1024 characters. */
  var new_dialog_node: js.UndefOr[String] = js.native
  
  /** Whether this top-level dialog node can be digressed into. */
  var new_digress_in: js.UndefOr[DigressIn | String] = js.native
  
  /** Whether this dialog node can be returned to after a digression. */
  var new_digress_out: js.UndefOr[DigressOut | String] = js.native
  
  /** Whether the user can digress to top-level nodes while filling out slots. */
  var new_digress_out_slots: js.UndefOr[DigressOutSlots | String] = js.native
  
  /** How an `event_handler` node is processed. */
  var new_event_name: js.UndefOr[EventName | String] = js.native
  
  /** The metadata for the dialog node. */
  var new_metadata: js.UndefOr[js.Object] = js.native
  
  /** The next step to execute following this dialog node. */
  var new_next_step: js.UndefOr[DialogNodeNextStep] = js.native
  
  /** How the dialog node is processed. */
  var new_node_type: js.UndefOr[NodeType | String] = js.native
  
  /** The output of the dialog node. For more information about how to specify dialog node output, see the [documentation](https://cloud.ibm.com/docs/services/assistant/dialog-overview.html#dialog-overview-responses). */
  var new_output: js.UndefOr[DialogNodeOutput] = js.native
  
  /** The ID of the parent dialog node. This property is omitted if the dialog node has no parent. */
  var new_parent: js.UndefOr[String] = js.native
  
  /** The ID of the previous sibling dialog node. This property is omitted if the dialog node has no previous sibling. */
  var new_previous_sibling: js.UndefOr[String] = js.native
  
  /** The alias used to identify the dialog node. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, space, underscore, hyphen, and dot characters. - It must be no longer than 64 characters. */
  var new_title: js.UndefOr[String] = js.native
  
  /** A label that can be displayed externally to describe the purpose of the node to users. This string must be no longer than 512 characters. */
  var new_user_label: js.UndefOr[String] = js.native
  
  /** The location in the dialog context where output is stored. */
  var new_variable: js.UndefOr[String] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
  
  /** Unique identifier of the workspace. */
  var workspace_id: String = js.native
}
object UpdateDialogNodeParams {
  
  @scala.inline
  def apply(dialog_node: String, workspace_id: String): UpdateDialogNodeParams = {
    val __obj = js.Dynamic.literal(dialog_node = dialog_node.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDialogNodeParams]
  }
  
  @scala.inline
  implicit class UpdateDialogNodeParamsOps[Self <: UpdateDialogNodeParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDialog_node(value: String): Self = this.set("dialog_node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspace_id(value: String): Self = this.set("workspace_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setNew_actionsVarargs(value: DialogNodeAction*): Self = this.set("new_actions", js.Array(value :_*))
    
    @scala.inline
    def setNew_actions(value: js.Array[DialogNodeAction]): Self = this.set("new_actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_actions: Self = this.set("new_actions", js.undefined)
    
    @scala.inline
    def setNew_conditions(value: String): Self = this.set("new_conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_conditions: Self = this.set("new_conditions", js.undefined)
    
    @scala.inline
    def setNew_context(value: js.Object): Self = this.set("new_context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_context: Self = this.set("new_context", js.undefined)
    
    @scala.inline
    def setNew_description(value: String): Self = this.set("new_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_description: Self = this.set("new_description", js.undefined)
    
    @scala.inline
    def setNew_dialog_node(value: String): Self = this.set("new_dialog_node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_dialog_node: Self = this.set("new_dialog_node", js.undefined)
    
    @scala.inline
    def setNew_digress_in(value: DigressIn | String): Self = this.set("new_digress_in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_digress_in: Self = this.set("new_digress_in", js.undefined)
    
    @scala.inline
    def setNew_digress_out(value: DigressOut | String): Self = this.set("new_digress_out", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_digress_out: Self = this.set("new_digress_out", js.undefined)
    
    @scala.inline
    def setNew_digress_out_slots(value: DigressOutSlots | String): Self = this.set("new_digress_out_slots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_digress_out_slots: Self = this.set("new_digress_out_slots", js.undefined)
    
    @scala.inline
    def setNew_event_name(value: EventName | String): Self = this.set("new_event_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_event_name: Self = this.set("new_event_name", js.undefined)
    
    @scala.inline
    def setNew_metadata(value: js.Object): Self = this.set("new_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_metadata: Self = this.set("new_metadata", js.undefined)
    
    @scala.inline
    def setNew_next_step(value: DialogNodeNextStep): Self = this.set("new_next_step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_next_step: Self = this.set("new_next_step", js.undefined)
    
    @scala.inline
    def setNew_node_type(value: NodeType | String): Self = this.set("new_node_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_node_type: Self = this.set("new_node_type", js.undefined)
    
    @scala.inline
    def setNew_output(value: DialogNodeOutput): Self = this.set("new_output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_output: Self = this.set("new_output", js.undefined)
    
    @scala.inline
    def setNew_parent(value: String): Self = this.set("new_parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_parent: Self = this.set("new_parent", js.undefined)
    
    @scala.inline
    def setNew_previous_sibling(value: String): Self = this.set("new_previous_sibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_previous_sibling: Self = this.set("new_previous_sibling", js.undefined)
    
    @scala.inline
    def setNew_title(value: String): Self = this.set("new_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_title: Self = this.set("new_title", js.undefined)
    
    @scala.inline
    def setNew_user_label(value: String): Self = this.set("new_user_label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_user_label: Self = this.set("new_user_label", js.undefined)
    
    @scala.inline
    def setNew_variable(value: String): Self = this.set("new_variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_variable: Self = this.set("new_variable", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
}
