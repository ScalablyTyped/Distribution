package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Content picker dialog options object
  */
trait IContentPickerOptions extends js.Object {
  /*callback function*/
  var callback: js.Function
  /*should the picker return one or multiple items*/
  var multipicker: Boolean
}

object IContentPickerOptions {
  @scala.inline
  def apply(callback: js.Function, multipicker: Boolean): IContentPickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback, multipicker = multipicker)
  
    __obj.asInstanceOf[IContentPickerOptions]
  }
}

