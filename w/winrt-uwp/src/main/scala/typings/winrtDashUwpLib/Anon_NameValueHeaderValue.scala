package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameValueHeaderValue extends js.Object {
  /** The HttpNameValueHeaderValue version of the string. */ var nameValueHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpNameValueHeaderValue
  /** true if input is valid HttpNameValueHeaderValue information; otherwise, false. */ var returnValue: scala.Boolean
}

object Anon_NameValueHeaderValue {
  @scala.inline
  def apply(
    nameValueHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpNameValueHeaderValue,
    returnValue: scala.Boolean
  ): Anon_NameValueHeaderValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nameValueHeaderValue")(nameValueHeaderValue)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_NameValueHeaderValue]
  }
}

