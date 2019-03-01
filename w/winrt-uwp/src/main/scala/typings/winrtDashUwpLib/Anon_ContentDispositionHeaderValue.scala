package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentDispositionHeaderValue extends js.Object {
  /** The HttpContentDispositionHeaderValue version of the string. */ var contentDispositionHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpContentDispositionHeaderValue
  /** true if input is valid HttpContentDispositionHeaderValue information; otherwise, false. */ var returnValue: scala.Boolean
}

object Anon_ContentDispositionHeaderValue {
  @scala.inline
  def apply(
    contentDispositionHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpContentDispositionHeaderValue,
    returnValue: scala.Boolean
  ): Anon_ContentDispositionHeaderValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentDispositionHeaderValue")(contentDispositionHeaderValue)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ContentDispositionHeaderValue]
  }
}

