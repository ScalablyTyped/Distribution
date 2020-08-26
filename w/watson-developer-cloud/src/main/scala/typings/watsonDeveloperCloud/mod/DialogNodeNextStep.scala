package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The next step to execute following this dialog node. */
@js.native
trait DialogNodeNextStep extends js.Object {
  /** What happens after the dialog node completes. The valid values depend on the node type: - The following values are valid for any node: - `get_user_input` - `skip_user_input` - `jump_to` - If the node is of type `event_handler` and its parent node is of type `slot` or `frame`, additional values are also valid: - if **event_name**=`filled` and the type of the parent node is `slot`: - `reprompt` - `skip_all_slots` - if **event_name**=`nomatch` and the type of the parent node is `slot`: - `reprompt` - `skip_slot` - `skip_all_slots` - if **event_name**=`generic` and the type of the parent node is `frame`: - `reprompt` - `skip_slot` - `skip_all_slots` If you specify `jump_to`, then you must also specify a value for the `dialog_node` property. */
  var behavior: String = js.native
  /** The ID of the dialog node to process next. This parameter is required if **behavior**=`jump_to`. */
  var dialog_node: js.UndefOr[String] = js.native
  /** Which part of the dialog node to process next. */
  var selector: js.UndefOr[String] = js.native
}

object DialogNodeNextStep {
  @scala.inline
  def apply(behavior: String): DialogNodeNextStep = {
    val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogNodeNextStep]
  }
  @scala.inline
  implicit class DialogNodeNextStepOps[Self <: DialogNodeNextStep] (val x: Self) extends AnyVal {
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
    def setBehavior(value: String): Self = this.set("behavior", value.asInstanceOf[js.Any])
    @scala.inline
    def setDialog_node(value: String): Self = this.set("dialog_node", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialog_node: Self = this.set("dialog_node", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
  
}

