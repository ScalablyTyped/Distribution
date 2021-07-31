package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The next step to execute following this dialog node. */
trait DialogNodeNextStep extends StObject {
  
  /** What happens after the dialog node completes. The valid values depend on the node type: - The following values are valid for any node: - `get_user_input` - `skip_user_input` - `jump_to` - If the node is of type `event_handler` and its parent node is of type `slot` or `frame`, additional values are also valid: - if **event_name**=`filled` and the type of the parent node is `slot`: - `reprompt` - `skip_all_slots` - if **event_name**=`nomatch` and the type of the parent node is `slot`: - `reprompt` - `skip_slot` - `skip_all_slots` - if **event_name**=`generic` and the type of the parent node is `frame`: - `reprompt` - `skip_slot` - `skip_all_slots` If you specify `jump_to`, then you must also specify a value for the `dialog_node` property. */
  var behavior: String
  
  /** The ID of the dialog node to process next. This parameter is required if **behavior**=`jump_to`. */
  var dialog_node: js.UndefOr[String] = js.undefined
  
  /** Which part of the dialog node to process next. */
  var selector: js.UndefOr[String] = js.undefined
}
object DialogNodeNextStep {
  
  @scala.inline
  def apply(behavior: String): DialogNodeNextStep = {
    val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogNodeNextStep]
  }
  
  @scala.inline
  implicit class DialogNodeNextStepMutableBuilder[Self <: DialogNodeNextStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBehavior(value: String): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialog_node(value: String): Self = StObject.set(x, "dialog_node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialog_nodeUndefined: Self = StObject.set(x, "dialog_node", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
