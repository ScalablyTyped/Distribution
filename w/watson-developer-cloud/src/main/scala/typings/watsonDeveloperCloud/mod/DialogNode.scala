package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DialogNode. */
trait DialogNode extends StObject {
  
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
  
  inline def apply(dialog_node: String): DialogNode = {
    val __obj = js.Dynamic.literal(dialog_node = dialog_node.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogNode]
  }
  
  extension [Self <: DialogNode](x: Self) {
    
    inline def setActions(value: js.Array[DialogNodeAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: DialogNodeAction*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    inline def setConditions(value: String): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDialog_node(value: String): Self = StObject.set(x, "dialog_node", value.asInstanceOf[js.Any])
    
    inline def setDigress_in(value: String): Self = StObject.set(x, "digress_in", value.asInstanceOf[js.Any])
    
    inline def setDigress_inUndefined: Self = StObject.set(x, "digress_in", js.undefined)
    
    inline def setDigress_out(value: String): Self = StObject.set(x, "digress_out", value.asInstanceOf[js.Any])
    
    inline def setDigress_outUndefined: Self = StObject.set(x, "digress_out", js.undefined)
    
    inline def setDigress_out_slots(value: String): Self = StObject.set(x, "digress_out_slots", value.asInstanceOf[js.Any])
    
    inline def setDigress_out_slotsUndefined: Self = StObject.set(x, "digress_out_slots", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEvent_name(value: String): Self = StObject.set(x, "event_name", value.asInstanceOf[js.Any])
    
    inline def setEvent_nameUndefined: Self = StObject.set(x, "event_name", js.undefined)
    
    inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNext_step(value: DialogNodeNextStep): Self = StObject.set(x, "next_step", value.asInstanceOf[js.Any])
    
    inline def setNext_stepUndefined: Self = StObject.set(x, "next_step", js.undefined)
    
    inline def setNode_type(value: String): Self = StObject.set(x, "node_type", value.asInstanceOf[js.Any])
    
    inline def setNode_typeUndefined: Self = StObject.set(x, "node_type", js.undefined)
    
    inline def setOutput(value: DialogNodeOutput): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPrevious_sibling(value: String): Self = StObject.set(x, "previous_sibling", value.asInstanceOf[js.Any])
    
    inline def setPrevious_siblingUndefined: Self = StObject.set(x, "previous_sibling", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    inline def setUser_label(value: String): Self = StObject.set(x, "user_label", value.asInstanceOf[js.Any])
    
    inline def setUser_labelUndefined: Self = StObject.set(x, "user_label", js.undefined)
    
    inline def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
  }
}
