package typings.watsonDeveloperCloud.mod

import typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressIn
import typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOut
import typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOutSlots
import typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName
import typings.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `createDialogNode` operation. */
@js.native
trait CreateDialogNodeParams extends StObject {
  
  /** An array of objects describing any actions to be invoked by the dialog node. */
  var actions: js.UndefOr[js.Array[DialogNodeAction]] = js.native
  
  /** The condition that will trigger the dialog node. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 2048 characters. */
  var conditions: js.UndefOr[String] = js.native
  
  /** The context for the dialog node. */
  var context: js.UndefOr[js.Object] = js.native
  
  /** The description of the dialog node. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var description: js.UndefOr[String] = js.native
  
  /** The dialog node ID. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, space, underscore, hyphen, and dot characters. - It must be no longer than 1024 characters. */
  var dialog_node: String = js.native
  
  /** Whether this top-level dialog node can be digressed into. */
  var digress_in: js.UndefOr[DigressIn | String] = js.native
  
  /** Whether this dialog node can be returned to after a digression. */
  var digress_out: js.UndefOr[DigressOut | String] = js.native
  
  /** Whether the user can digress to top-level nodes while filling out slots. */
  var digress_out_slots: js.UndefOr[DigressOutSlots | String] = js.native
  
  /** How an `event_handler` node is processed. */
  var event_name: js.UndefOr[EventName | String] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  /** The metadata for the dialog node. */
  var metadata: js.UndefOr[js.Object] = js.native
  
  /** The next step to execute following this dialog node. */
  var next_step: js.UndefOr[DialogNodeNextStep] = js.native
  
  /** How the dialog node is processed. */
  var node_type: js.UndefOr[NodeType | String] = js.native
  
  /** The output of the dialog node. For more information about how to specify dialog node output, see the [documentation](https://cloud.ibm.com/docs/services/assistant/dialog-overview.html#dialog-overview-responses). */
  var output: js.UndefOr[DialogNodeOutput] = js.native
  
  /** The ID of the parent dialog node. This property is omitted if the dialog node has no parent. */
  var parent: js.UndefOr[String] = js.native
  
  /** The ID of the previous sibling dialog node. This property is omitted if the dialog node has no previous sibling. */
  var previous_sibling: js.UndefOr[String] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
  
  /** The alias used to identify the dialog node. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, space, underscore, hyphen, and dot characters. - It must be no longer than 64 characters. */
  var title: js.UndefOr[String] = js.native
  
  /** A label that can be displayed externally to describe the purpose of the node to users. This string must be no longer than 512 characters. */
  var user_label: js.UndefOr[String] = js.native
  
  /** The location in the dialog context where output is stored. */
  var variable: js.UndefOr[String] = js.native
  
  /** Unique identifier of the workspace. */
  var workspace_id: String = js.native
}
object CreateDialogNodeParams {
  
  @scala.inline
  def apply(dialog_node: String, workspace_id: String): CreateDialogNodeParams = {
    val __obj = js.Dynamic.literal(dialog_node = dialog_node.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDialogNodeParams]
  }
  
  @scala.inline
  implicit class CreateDialogNodeParamsMutableBuilder[Self <: CreateDialogNodeParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[DialogNodeAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: DialogNodeAction*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: String): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDialog_node(value: String): Self = StObject.set(x, "dialog_node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigress_in(value: DigressIn | String): Self = StObject.set(x, "digress_in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigress_inUndefined: Self = StObject.set(x, "digress_in", js.undefined)
    
    @scala.inline
    def setDigress_out(value: DigressOut | String): Self = StObject.set(x, "digress_out", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigress_outUndefined: Self = StObject.set(x, "digress_out", js.undefined)
    
    @scala.inline
    def setDigress_out_slots(value: DigressOutSlots | String): Self = StObject.set(x, "digress_out_slots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigress_out_slotsUndefined: Self = StObject.set(x, "digress_out_slots", js.undefined)
    
    @scala.inline
    def setEvent_name(value: EventName | String): Self = StObject.set(x, "event_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent_nameUndefined: Self = StObject.set(x, "event_name", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setNext_step(value: DialogNodeNextStep): Self = StObject.set(x, "next_step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_stepUndefined: Self = StObject.set(x, "next_step", js.undefined)
    
    @scala.inline
    def setNode_type(value: NodeType | String): Self = StObject.set(x, "node_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_typeUndefined: Self = StObject.set(x, "node_type", js.undefined)
    
    @scala.inline
    def setOutput(value: DialogNodeOutput): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setPrevious_sibling(value: String): Self = StObject.set(x, "previous_sibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious_siblingUndefined: Self = StObject.set(x, "previous_sibling", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUser_label(value: String): Self = StObject.set(x, "user_label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_labelUndefined: Self = StObject.set(x, "user_label", js.undefined)
    
    @scala.inline
    def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    
    @scala.inline
    def setWorkspace_id(value: String): Self = StObject.set(x, "workspace_id", value.asInstanceOf[js.Any])
  }
}
