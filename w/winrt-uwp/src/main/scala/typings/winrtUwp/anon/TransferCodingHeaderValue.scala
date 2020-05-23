package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpTransferCodingHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferCodingHeaderValue extends js.Object {
  /** true if input is valid HttpTransferCodingHeaderValue information; otherwise, false. */ var returnValue: Boolean
  /** The HttpTransferCodingHeaderValue version of the string. */ var transferCodingHeaderValue: HttpTransferCodingHeaderValue
}

object TransferCodingHeaderValue {
  @scala.inline
  def apply(returnValue: Boolean, transferCodingHeaderValue: HttpTransferCodingHeaderValue): TransferCodingHeaderValue = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], transferCodingHeaderValue = transferCodingHeaderValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferCodingHeaderValue]
  }
}

