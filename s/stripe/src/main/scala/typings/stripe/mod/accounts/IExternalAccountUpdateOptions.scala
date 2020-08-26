package typings.stripe.mod.accounts

import typings.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExternalAccountUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * If set to true, this bank account will become the default external account for its currency.
    */
  var default_for_currency: js.UndefOr[Boolean] = js.native
}

object IExternalAccountUpdateOptions {
  @scala.inline
  def apply(): IExternalAccountUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExternalAccountUpdateOptions]
  }
  @scala.inline
  implicit class IExternalAccountUpdateOptionsOps[Self <: IExternalAccountUpdateOptions] (val x: Self) extends AnyVal {
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
    def setDefault_for_currency(value: Boolean): Self = this.set("default_for_currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault_for_currency: Self = this.set("default_for_currency", js.undefined)
  }
  
}

