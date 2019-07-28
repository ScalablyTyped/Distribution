package typings.winrtDashUwp

import typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HeadersNs.HttpProductHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProductHeaderValue extends js.Object {
  /** The HttpProductHeaderValue version of the string. */ var productHeaderValue: HttpProductHeaderValue
  /** true if input is valid HttpProductHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object Anon_ProductHeaderValue {
  @scala.inline
  def apply(productHeaderValue: HttpProductHeaderValue, returnValue: Boolean): Anon_ProductHeaderValue = {
    val __obj = js.Dynamic.literal(productHeaderValue = productHeaderValue, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ProductHeaderValue]
  }
}

