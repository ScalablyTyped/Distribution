package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DialogNodeAction. */
trait DialogNodeAction extends js.Object {
  /** The type of action to invoke. */
  var action_type: js.UndefOr[String] = js.undefined
  /** The name of the context variable that the client application will use to pass in credentials for the action. */
  var credentials: js.UndefOr[String] = js.undefined
  /** The name of the action. */
  var name: String
  /** A map of key/value pairs to be provided to the action. */
  var parameters: js.UndefOr[js.Object] = js.undefined
  /** The location in the dialog context where the result of the action is stored. */
  var result_variable: String
}

object DialogNodeAction {
  @scala.inline
  def apply(
    name: String,
    result_variable: String,
    action_type: String = null,
    credentials: String = null,
    parameters: js.Object = null
  ): DialogNodeAction = {
    val __obj = js.Dynamic.literal(name = name, result_variable = result_variable)
    if (action_type != null) __obj.updateDynamic("action_type")(action_type)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[DialogNodeAction]
  }
}

