package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Macropicker dialog options object
  */
trait IMacroPickerOptions extends js.Object {
  /*callback function*/
  var callback: js.Function
}

object IMacroPickerOptions {
  @scala.inline
  def apply(callback: js.Function): IMacroPickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMacroPickerOptions]
  }
}

