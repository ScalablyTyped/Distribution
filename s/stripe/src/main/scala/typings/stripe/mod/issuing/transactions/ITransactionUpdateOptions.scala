package typings.stripe.mod.issuing.transactions

import typings.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransactionUpdateOptions extends js.Object {
  var metadata: js.UndefOr[IOptionsMetadata] = js.native
}

object ITransactionUpdateOptions {
  @scala.inline
  def apply(): ITransactionUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITransactionUpdateOptions]
  }
  @scala.inline
  implicit class ITransactionUpdateOptionsOps[Self <: ITransactionUpdateOptions] (val x: Self) extends AnyVal {
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
    def setMetadata(value: IOptionsMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}

