package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Property dialog options object
  */
@js.native
trait IPropertyDialogOptions extends js.Object {
  /*callback function*/
  var callback: js.Function = js.native
  /*editor to use to edit a given value and return on callback*/
  var editor: String = js.native
  /*value sent to the property editor*/
  var value: js.Object = js.native
}

object IPropertyDialogOptions {
  @scala.inline
  def apply(callback: js.Function, editor: String, value: js.Object): IPropertyDialogOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyDialogOptions]
  }
  @scala.inline
  implicit class IPropertyDialogOptionsOps[Self <: IPropertyDialogOptions] (val x: Self) extends AnyVal {
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
    def setEditor(value: String): Self = this.set("editor", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Object): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

