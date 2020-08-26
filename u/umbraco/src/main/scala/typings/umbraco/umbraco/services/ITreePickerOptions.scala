package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Iconpicker dialog options object
  */
@js.native
trait ITreePickerOptions extends js.Object {
  /*callback function*/
  var callback: js.Function = js.native
  /*should the tree pick one or multiple items before returning*/
  var multiPicker: Boolean = js.native
  /*tree section to display*/
  var section: String = js.native
  /*specific tree to display*/
  var treeAlias: String = js.native
}

object ITreePickerOptions {
  @scala.inline
  def apply(callback: js.Function, multiPicker: Boolean, section: String, treeAlias: String): ITreePickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], multiPicker = multiPicker.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], treeAlias = treeAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITreePickerOptions]
  }
  @scala.inline
  implicit class ITreePickerOptionsOps[Self <: ITreePickerOptions] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setSection(value: String): Self = this.set("section", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeAlias(value: String): Self = this.set("treeAlias", value.asInstanceOf[js.Any])
  }
  
}

