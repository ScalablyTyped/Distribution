package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DialogNode. */
@js.native
trait DialogNode extends js.Object {
  
  /** An array of objects describing any actions to be invoked by the dialog node. */
  var actions: js.UndefOr[js.Array[DialogNodeAction]] = js.native
  
  /** The condition that will trigger the dialog node. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 2048 characters. */
  var conditions: js.UndefOr[String] = js.native
  
  /** The context for the dialog node. */
  var context: js.UndefOr[js.Object] = js.native
  
  /** The timestamp for creation of the object. */
  var created: js.UndefOr[String] = js.native
  
  /** The description of the dialog node. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var description: js.UndefOr[String] = js.native
  
  /** The dialog node ID. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, space, underscore, hyphen, and dot characters. - It must be no longer than 1024 characters. */
  var dialog_node: String = js.native
  
  /** Whether this top-level dialog node can be digressed into. */
  var digress_in: js.UndefOr[String] = js.native
  
  /** Whether this dialog node can be returned to after a digression. */
  var digress_out: js.UndefOr[String] = js.native
  
  /** Whether the user can digress to top-level nodes while filling out slots. */
  var digress_out_slots: js.UndefOr[String] = js.native
  
  /** For internal use only. */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** How an `event_handler` node is processed. */
  var event_name: js.UndefOr[String] = js.native
  
  /** The metadata for the dialog node. */
  var metadata: js.UndefOr[js.Object] = js.native
  
  /** The next step to execute following this dialog node. */
  var next_step: js.UndefOr[DialogNodeNextStep] = js.native
  
  /** How the dialog node is processed. */
  var node_type: js.UndefOr[String] = js.native
  
  /** The output of the dialog node. For more information about how to specify dialog node output, see the [documentation](https://cloud.ibm.com/docs/services/assistant/dialog-overview.html#dialog-overview-responses). */
  var output: js.UndefOr[DialogNodeOutput] = js.native
  
  /** The ID of the parent dialog node. This property is omitted if the dialog node has no parent. */
  var parent: js.UndefOr[String] = js.native
  
  /** The ID of the previous sibling dialog node. This property is omitted if the dialog node has no previous sibling. */
  var previous_sibling: js.UndefOr[String] = js.native
  
  /** The alias used to identify the dialog node. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, space, underscore, hyphen, and dot characters. - It must be no longer than 64 characters. */
  var title: js.UndefOr[String] = js.native
  
  /** The timestamp for the most recent update to the object. */
  var updated: js.UndefOr[String] = js.native
  
  /** A label that can be displayed externally to describe the purpose of the node to users. This string must be no longer than 512 characters. */
  var user_label: js.UndefOr[String] = js.native
  
  /** The location in the dialog context where output is stored. */
  var variable: js.UndefOr[String] = js.native
}
object DialogNode {
  
  @scala.inline
  def apply(dialog_node: String): DialogNode = {
    val __obj = js.Dynamic.literal(dialog_node = dialog_node.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogNode]
  }
  
  @scala.inline
  implicit class DialogNodeOps[Self <: DialogNode] (val x: Self) extends AnyVal {
    
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
    def setActionsVarargs(value: DialogNodeAction*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[DialogNodeAction]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setConditions(value: String): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    
    @scala.inline
    def setContext(value: js.Object): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDigress_in(value: String): Self = this.set("digress_in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigress_in: Self = this.set("digress_in", js.undefined)
    
    @scala.inline
    def setDigress_out(value: String): Self = this.set("digress_out", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigress_out: Self = this.set("digress_out", js.undefined)
    
    @scala.inline
    def setDigress_out_slots(value: String): Self = this.set("digress_out_slots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigress_out_slots: Self = this.set("digress_out_slots", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setEvent_name(value: String): Self = this.set("event_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent_name: Self = this.set("event_name", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Object): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setNext_step(value: DialogNodeNextStep): Self = this.set("next_step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext_step: Self = this.set("next_step", js.undefined)
    
    @scala.inline
    def setNode_type(value: String): Self = this.set("node_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode_type: Self = this.set("node_type", js.undefined)
    
    @scala.inline
    def setOutput(value: DialogNodeOutput): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setPrevious_sibling(value: String): Self = this.set("previous_sibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevious_sibling: Self = this.set("previous_sibling", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    
    @scala.inline
    def setUser_label(value: String): Self = this.set("user_label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser_label: Self = this.set("user_label", js.undefined)
    
    @scala.inline
    def setVariable(value: String): Self = this.set("variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariable: Self = this.set("variable", js.undefined)
  }
}
