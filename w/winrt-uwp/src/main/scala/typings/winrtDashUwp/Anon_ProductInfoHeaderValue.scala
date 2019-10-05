package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Web.Http.Headers.HttpProductInfoHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProductInfoHeaderValue extends js.Object {
  /** The HttpProductInfoHeaderValue version of the string. */ var productInfoHeaderValue: HttpProductInfoHeaderValue
  /** true if input is valid HttpProductInfoHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object Anon_ProductInfoHeaderValue {
  @scala.inline
  def apply(productInfoHeaderValue: HttpProductInfoHeaderValue, returnValue: Boolean): Anon_ProductInfoHeaderValue = {
    val __obj = js.Dynamic.literal(productInfoHeaderValue = productInfoHeaderValue, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ProductInfoHeaderValue]
  }
}

