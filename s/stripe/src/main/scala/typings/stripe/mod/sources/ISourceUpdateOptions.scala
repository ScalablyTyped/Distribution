package typings.stripe.mod.sources

import typings.stripe.anon.Currency
import typings.stripe.anon.EmailName
import typings.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISourceUpdateOptions extends IDataOptionsWithMetadata {
  var mandate: js.UndefOr[Currency] = js.native
  var owner: js.UndefOr[EmailName] = js.native
}

object ISourceUpdateOptions {
  @scala.inline
  def apply(): ISourceUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISourceUpdateOptions]
  }
  @scala.inline
  implicit class ISourceUpdateOptionsOps[Self <: ISourceUpdateOptions] (val x: Self) extends AnyVal {
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
    def setMandate(value: Currency): Self = this.set("mandate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMandate: Self = this.set("mandate", js.undefined)
    @scala.inline
    def setOwner(value: EmailName): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

