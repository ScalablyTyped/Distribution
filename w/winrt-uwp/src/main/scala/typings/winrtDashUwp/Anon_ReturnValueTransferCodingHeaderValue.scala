package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Web.Http.Headers.HttpTransferCodingHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReturnValueTransferCodingHeaderValue extends js.Object {
  /** true if input is valid HttpTransferCodingHeaderValue information; otherwise, false. */ var returnValue: Boolean
  /** The HttpTransferCodingHeaderValue version of the string. */ var transferCodingHeaderValue: HttpTransferCodingHeaderValue
}

object Anon_ReturnValueTransferCodingHeaderValue {
  @scala.inline
  def apply(returnValue: Boolean, transferCodingHeaderValue: HttpTransferCodingHeaderValue): Anon_ReturnValueTransferCodingHeaderValue = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], transferCodingHeaderValue = transferCodingHeaderValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ReturnValueTransferCodingHeaderValue]
  }
}

