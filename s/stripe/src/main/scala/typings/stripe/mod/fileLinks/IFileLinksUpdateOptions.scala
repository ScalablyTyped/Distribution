package typings.stripe.mod.fileLinks

import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.stripeStrings.now
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileLinksUpdateOptions extends IDataOptionsWithMetadata {
  var expires_at: js.UndefOr[Double | now] = js.native
}

object IFileLinksUpdateOptions {
  @scala.inline
  def apply(): IFileLinksUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileLinksUpdateOptions]
  }
  @scala.inline
  implicit class IFileLinksUpdateOptionsOps[Self <: IFileLinksUpdateOptions] (val x: Self) extends AnyVal {
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
    def setExpires_at(value: Double | now): Self = this.set("expires_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires_at: Self = this.set("expires_at", js.undefined)
  }
  
}

