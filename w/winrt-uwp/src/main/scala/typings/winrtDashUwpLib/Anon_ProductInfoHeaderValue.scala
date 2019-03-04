package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProductInfoHeaderValue extends js.Object {
  /** The HttpProductInfoHeaderValue version of the string. */ var productInfoHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpProductInfoHeaderValue
  /** true if input is valid HttpProductInfoHeaderValue information; otherwise, false. */ var returnValue: scala.Boolean
}

object Anon_ProductInfoHeaderValue {
  @scala.inline
  def apply(
    productInfoHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpProductInfoHeaderValue,
    returnValue: scala.Boolean
  ): Anon_ProductInfoHeaderValue = {
    val __obj = js.Dynamic.literal(productInfoHeaderValue = productInfoHeaderValue, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ProductInfoHeaderValue]
  }
}

