package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Iconpicker dialog options object
  */
trait IIconPickerOptions extends js.Object {
  /*callback function*/
  var callback: angularLib.angularMod.Global.Function
}

object IIconPickerOptions {
  @scala.inline
  def apply(callback: angularLib.angularMod.Global.Function): IIconPickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback)
  
    __obj.asInstanceOf[IIconPickerOptions]
  }
}

