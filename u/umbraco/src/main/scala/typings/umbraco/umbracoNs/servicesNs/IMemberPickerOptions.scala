package typings.umbraco.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Member picker dialog options object
  */
trait IMemberPickerOptions extends js.Object {
  /*callback function*/
  var callback: js.Function
  /*should the tree pick one or multiple members before returning*/
  var multiPicker: Boolean
}

object IMemberPickerOptions {
  @scala.inline
  def apply(callback: js.Function, multiPicker: Boolean): IMemberPickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback, multiPicker = multiPicker)
  
    __obj.asInstanceOf[IMemberPickerOptions]
  }
}

