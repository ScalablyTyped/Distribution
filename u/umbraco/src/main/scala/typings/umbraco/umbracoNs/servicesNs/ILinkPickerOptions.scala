package typings.umbraco.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Linkpicker dialog options object
  */
trait ILinkPickerOptions extends js.Object {
  /*callback function*/
  var callback: js.Function
}

object ILinkPickerOptions {
  @scala.inline
  def apply(callback: js.Function): ILinkPickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback)
  
    __obj.asInstanceOf[ILinkPickerOptions]
  }
}

