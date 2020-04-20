package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Iconpicker dialog options object
  */
trait ITreePickerOptions extends js.Object {
  /*callback function*/
  var callback: js.Function
  /*should the tree pick one or multiple items before returning*/
  var multiPicker: Boolean
  /*tree section to display*/
  var section: String
  /*specific tree to display*/
  var treeAlias: String
}

object ITreePickerOptions {
  @scala.inline
  def apply(callback: js.Function, multiPicker: Boolean, section: String, treeAlias: String): ITreePickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], multiPicker = multiPicker.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], treeAlias = treeAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITreePickerOptions]
  }
}

