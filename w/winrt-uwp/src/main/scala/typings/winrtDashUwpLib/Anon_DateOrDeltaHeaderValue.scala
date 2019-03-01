package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateOrDeltaHeaderValue extends js.Object {
  /** The HttpDateOrDeltaHeaderValue version of the string. */ var dateOrDeltaHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpDateOrDeltaHeaderValue
  /** true if input is valid HttpDateOrDeltaHeaderValue information; otherwise, false. */ var returnValue: scala.Boolean
}

object Anon_DateOrDeltaHeaderValue {
  @scala.inline
  def apply(
    dateOrDeltaHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpDateOrDeltaHeaderValue,
    returnValue: scala.Boolean
  ): Anon_DateOrDeltaHeaderValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dateOrDeltaHeaderValue")(dateOrDeltaHeaderValue)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_DateOrDeltaHeaderValue]
  }
}

