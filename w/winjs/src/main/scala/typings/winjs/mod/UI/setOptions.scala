package typings.winjs.mod.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("winjs", "UI.setOptions")
@js.native
object setOptions extends js.Object {
  /**
    * Adds the set of declaratively specified options (properties and events) to the specified control. If name of the options property begins with "on", the property value is a function and the control supports addEventListener, setOptions calls addEventListener on the control.
    * @param control The control on which the properties and events are to be applied.
    * @param options The set of options that are specified declaratively.
    **/
  def apply(control: js.Any): Unit = js.native
  def apply(control: js.Any, options: js.Any): Unit = js.native
}

