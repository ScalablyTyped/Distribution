package typings.wordpressComponents.selectControlMod.SelectControl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  /**
    * The label to be shown to the user.
    */
  var label: String
  /**
    * The internal value used to choose the selected value. This is also
    * the value passed to `onChange` when the option is selected.
    */
  var value: String
}

object Option {
  @scala.inline
  def apply(label: String, value: String): Option = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

