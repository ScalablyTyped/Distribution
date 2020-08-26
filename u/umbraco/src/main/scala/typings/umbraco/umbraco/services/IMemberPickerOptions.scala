package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Member picker dialog options object
  */
@js.native
trait IMemberPickerOptions extends js.Object {
  /*callback function*/
  var callback: js.Function = js.native
  /*should the tree pick one or multiple members before returning*/
  var multiPicker: Boolean = js.native
}

object IMemberPickerOptions {
  @scala.inline
  def apply(callback: js.Function, multiPicker: Boolean): IMemberPickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], multiPicker = multiPicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMemberPickerOptions]
  }
  @scala.inline
  implicit class IMemberPickerOptionsOps[Self <: IMemberPickerOptions] (val x: Self) extends AnyVal {
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
    def setCallback(value: js.Function): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiPicker(value: Boolean): Self = this.set("multiPicker", value.asInstanceOf[js.Any])
  }
  
}

