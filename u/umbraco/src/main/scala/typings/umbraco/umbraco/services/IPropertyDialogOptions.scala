package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Property dialog options object
  */
trait IPropertyDialogOptions extends js.Object {
  /*callback function*/
  var callback: js.Function
  /*editor to use to edit a given value and return on callback*/
  var editor: String
  /*value sent to the property editor*/
  var value: js.Object
}

object IPropertyDialogOptions {
  @scala.inline
  def apply(callback: js.Function, editor: String, value: js.Object): IPropertyDialogOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyDialogOptions]
  }
}

