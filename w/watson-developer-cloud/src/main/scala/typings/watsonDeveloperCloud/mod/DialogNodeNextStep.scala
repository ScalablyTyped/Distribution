package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The next step to execute following this dialog node. */
trait DialogNodeNextStep extends js.Object {
  /** What happens after the dialog node completes. The valid values depend on the node type: - The following values are valid for any node: - `get_user_input` - `skip_user_input` - `jump_to` - If the node is of type `event_handler` and its parent node is of type `slot` or `frame`, additional values are also valid: - if **event_name**=`filled` and the type of the parent node is `slot`: - `reprompt` - `skip_all_slots` - if **event_name**=`nomatch` and the type of the parent node is `slot`: - `reprompt` - `skip_slot` - `skip_all_slots` - if **event_name**=`generic` and the type of the parent node is `frame`: - `reprompt` - `skip_slot` - `skip_all_slots` If you specify `jump_to`, then you must also specify a value for the `dialog_node` property. */
  var behavior: String
  /** The ID of the dialog node to process next. This parameter is required if **behavior**=`jump_to`. */
  var dialog_node: js.UndefOr[String] = js.undefined
  /** Which part of the dialog node to process next. */
  var selector: js.UndefOr[String] = js.undefined
}

object DialogNodeNextStep {
  @scala.inline
  def apply(behavior: String, dialog_node: String = null, selector: String = null): DialogNodeNextStep = {
    val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any])
    if (dialog_node != null) __obj.updateDynamic("dialog_node")(dialog_node.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogNodeNextStep]
  }
}

