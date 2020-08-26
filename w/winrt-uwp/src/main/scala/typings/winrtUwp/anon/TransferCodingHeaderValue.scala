package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpTransferCodingHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferCodingHeaderValue extends js.Object {
  /** true if input is valid HttpTransferCodingHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
  /** The HttpTransferCodingHeaderValue version of the string. */ var transferCodingHeaderValue: HttpTransferCodingHeaderValue = js.native
}

object TransferCodingHeaderValue {
  @scala.inline
  def apply(returnValue: Boolean, transferCodingHeaderValue: HttpTransferCodingHeaderValue): TransferCodingHeaderValue = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], transferCodingHeaderValue = transferCodingHeaderValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferCodingHeaderValue]
  }
  @scala.inline
  implicit class TransferCodingHeaderValueOps[Self <: TransferCodingHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReturnValue(value: Boolean): Self = this.set("returnValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransferCodingHeaderValue(value: HttpTransferCodingHeaderValue): Self = this.set("transferCodingHeaderValue", value.asInstanceOf[js.Any])
  }
  
}

