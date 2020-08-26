package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexSignatureInfo extends js.Object {
  var numericSignature: PullSignatureSymbol = js.native
  var stringSignature: PullSignatureSymbol = js.native
}

object IndexSignatureInfo {
  @scala.inline
  def apply(numericSignature: PullSignatureSymbol, stringSignature: PullSignatureSymbol): IndexSignatureInfo = {
    val __obj = js.Dynamic.literal(numericSignature = numericSignature.asInstanceOf[js.Any], stringSignature = stringSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexSignatureInfo]
  }
  @scala.inline
  implicit class IndexSignatureInfoOps[Self <: IndexSignatureInfo] (val x: Self) extends AnyVal {
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
    def setNumericSignature(value: PullSignatureSymbol): Self = this.set("numericSignature", value.asInstanceOf[js.Any])
    @scala.inline
    def setStringSignature(value: PullSignatureSymbol): Self = this.set("stringSignature", value.asInstanceOf[js.Any])
  }
  
}

