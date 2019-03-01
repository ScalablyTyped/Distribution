package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Member group picker dialog options object
  */
trait IMemberGroupPickerOptions extends js.Object {
  /*callback function*/
  var callback: angularLib.angularMod.Global.Function
  /*should the tree pick one or multiple members before returning*/
  var multiPicker: scala.Boolean
}

object IMemberGroupPickerOptions {
  @scala.inline
  def apply(callback: angularLib.angularMod.Global.Function, multiPicker: scala.Boolean): IMemberGroupPickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callback")(callback)
    __obj.updateDynamic("multiPicker")(multiPicker)
    __obj.asInstanceOf[IMemberGroupPickerOptions]
  }
}

