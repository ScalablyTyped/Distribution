package typings.typescriptServices.anon

import typings.typescriptServices.TypeScript.PullSignatureSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllSignatures extends js.Object {
  var allSignatures: js.Array[PullSignatureSymbol] = js.native
  var signature: PullSignatureSymbol = js.native
}

object AllSignatures {
  @scala.inline
  def apply(allSignatures: js.Array[PullSignatureSymbol], signature: PullSignatureSymbol): AllSignatures = {
    val __obj = js.Dynamic.literal(allSignatures = allSignatures.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllSignatures]
  }
  @scala.inline
  implicit class AllSignaturesOps[Self <: AllSignatures] (val x: Self) extends AnyVal {
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
    def setAllSignaturesVarargs(value: PullSignatureSymbol*): Self = this.set("allSignatures", js.Array(value :_*))
    @scala.inline
    def setAllSignatures(value: js.Array[PullSignatureSymbol]): Self = this.set("allSignatures", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignature(value: PullSignatureSymbol): Self = this.set("signature", value.asInstanceOf[js.Any])
  }
  
}

