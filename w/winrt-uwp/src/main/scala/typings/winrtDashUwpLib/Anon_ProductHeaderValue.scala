package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProductHeaderValue extends js.Object {
  /** The HttpProductHeaderValue version of the string. */ var productHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpProductHeaderValue
  /** true if input is valid HttpProductHeaderValue information; otherwise, false. */ var returnValue: scala.Boolean
}

object Anon_ProductHeaderValue {
  @scala.inline
  def apply(
    productHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpProductHeaderValue,
    returnValue: scala.Boolean
  ): Anon_ProductHeaderValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("productHeaderValue")(productHeaderValue)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ProductHeaderValue]
  }
}

