package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Content picker dialog options object
  */
trait IContentPickerOptions extends js.Object {
  /*callback function*/
  var callback: angularLib.angularMod.Global.Function
  /*should the picker return one or multiple items*/
  var multipicker: scala.Boolean
}

object IContentPickerOptions {
  @scala.inline
  def apply(callback: angularLib.angularMod.Global.Function, multipicker: scala.Boolean): IContentPickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callback")(callback)
    __obj.updateDynamic("multipicker")(multipicker)
    __obj.asInstanceOf[IContentPickerOptions]
  }
}

