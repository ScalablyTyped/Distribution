package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Linkpicker dialog options object
  */
trait ILinkPickerOptions extends js.Object {
  /*callback function*/
  var callback: angularLib.angularMod.Global.Function
}

object ILinkPickerOptions {
  @scala.inline
  def apply(callback: angularLib.angularMod.Global.Function): ILinkPickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback)
  
    __obj.asInstanceOf[ILinkPickerOptions]
  }
}

