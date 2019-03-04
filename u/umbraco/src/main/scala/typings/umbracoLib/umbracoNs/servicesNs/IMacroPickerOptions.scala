package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Macropicker dialog options object
  */
trait IMacroPickerOptions extends js.Object {
  /*callback function*/
  var callback: angularLib.angularMod.Global.Function
}

object IMacroPickerOptions {
  @scala.inline
  def apply(callback: angularLib.angularMod.Global.Function): IMacroPickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback)
  
    __obj.asInstanceOf[IMacroPickerOptions]
  }
}

