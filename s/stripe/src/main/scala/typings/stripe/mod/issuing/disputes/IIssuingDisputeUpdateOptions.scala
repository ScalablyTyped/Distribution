package typings.stripe.mod.issuing.disputes

import typings.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIssuingDisputeUpdateOptions extends js.Object {
  var metadata: js.UndefOr[IOptionsMetadata] = js.native
}

object IIssuingDisputeUpdateOptions {
  @scala.inline
  def apply(): IIssuingDisputeUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIssuingDisputeUpdateOptions]
  }
  @scala.inline
  implicit class IIssuingDisputeUpdateOptionsOps[Self <: IIssuingDisputeUpdateOptions] (val x: Self) extends AnyVal {
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

