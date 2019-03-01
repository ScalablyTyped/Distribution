package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReturnValueTransferCodingHeaderValue extends js.Object {
  /** true if input is valid HttpTransferCodingHeaderValue information; otherwise, false. */ var returnValue: scala.Boolean
  /** The HttpTransferCodingHeaderValue version of the string. */ var transferCodingHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpTransferCodingHeaderValue
}

object Anon_ReturnValueTransferCodingHeaderValue {
  @scala.inline
  def apply(
    returnValue: scala.Boolean,
    transferCodingHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpTransferCodingHeaderValue
  ): Anon_ReturnValueTransferCodingHeaderValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.updateDynamic("transferCodingHeaderValue")(transferCodingHeaderValue)
    __obj.asInstanceOf[Anon_ReturnValueTransferCodingHeaderValue]
  }
}

