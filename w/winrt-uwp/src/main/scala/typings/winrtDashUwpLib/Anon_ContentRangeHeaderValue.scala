package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentRangeHeaderValue extends js.Object {
  /** The HttpContentRangeHeaderValue version of the string. */ var contentRangeHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpContentRangeHeaderValue
  /** true if input is valid HttpContentRangeHeaderValue information; otherwise, false. */ var returnValue: scala.Boolean
}

object Anon_ContentRangeHeaderValue {
  @scala.inline
  def apply(
    contentRangeHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpContentRangeHeaderValue,
    returnValue: scala.Boolean
  ): Anon_ContentRangeHeaderValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentRangeHeaderValue")(contentRangeHeaderValue)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ContentRangeHeaderValue]
  }
}

