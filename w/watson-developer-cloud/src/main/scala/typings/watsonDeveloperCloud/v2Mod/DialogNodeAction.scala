package typings.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DialogNodeAction. */
@js.native
trait DialogNodeAction extends js.Object {
  /** The type of action to invoke. */
  var action_type: js.UndefOr[String] = js.native
  /** The name of the context variable that the client application will use to pass in credentials for the action. */
  var credentials: js.UndefOr[String] = js.native
  /** The name of the action. */
  var name: String = js.native
  /** A map of key/value pairs to be provided to the action. */
  var parameters: js.UndefOr[js.Object] = js.native
  /** The location in the dialog context where the result of the action is stored. */
  var result_variable: String = js.native
}

object DialogNodeAction {
  @scala.inline
  def apply(name: String, result_variable: String): DialogNodeAction = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], result_variable = result_variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogNodeAction]
  }
  @scala.inline
  implicit class DialogNodeActionOps[Self <: DialogNodeAction] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult_variable(value: String): Self = this.set("result_variable", value.asInstanceOf[js.Any])
    @scala.inline
    def setAction_type(value: String): Self = this.set("action_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction_type: Self = this.set("action_type", js.undefined)
    @scala.inline
    def setCredentials(value: String): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    @scala.inline
    def setParameters(value: js.Object): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
  
}

