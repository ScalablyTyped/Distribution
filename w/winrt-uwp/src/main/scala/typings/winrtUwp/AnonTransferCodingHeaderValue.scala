package typings.winrtUwp

import typings.winrtUwp.Windows.Web.Http.Headers.HttpTransferCodingHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTransferCodingHeaderValue extends js.Object {
  /** true if input is valid HttpTransferCodingHeaderValue information; otherwise, false. */ var returnValue: Boolean
  /** The HttpTransferCodingHeaderValue version of the string. */ var transferCodingHeaderValue: HttpTransferCodingHeaderValue
}

object AnonTransferCodingHeaderValue {
  @scala.inline
  def apply(returnValue: Boolean, transferCodingHeaderValue: HttpTransferCodingHeaderValue): AnonTransferCodingHeaderValue = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], transferCodingHeaderValue = transferCodingHeaderValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTransferCodingHeaderValue]
  }
}

