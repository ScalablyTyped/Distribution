package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Member group picker dialog options object
  */
trait IMemberGroupPickerOptions extends js.Object {
  /*callback function*/
  var callback: js.Function
  /*should the tree pick one or multiple members before returning*/
  var multiPicker: Boolean
}

object IMemberGroupPickerOptions {
  @scala.inline
  def apply(callback: js.Function, multiPicker: Boolean): IMemberGroupPickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback, multiPicker = multiPicker)
  
    __obj.asInstanceOf[IMemberGroupPickerOptions]
  }
}

