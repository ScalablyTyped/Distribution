package typings.stripe.mod.issuing.cards

import typings.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the specified Issuing Card object by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
  */
@js.native
trait IIssuingCardUpdateOptions extends js.Object {
  /**
    * Spending rules that give you some control over how your cards can be used. Refer to our authorizations documentation for more details.
    */
  var auhtorization_controls: js.UndefOr[ICardAuthorizationControls] = js.native
  /**
    * The Cardholder to associate the card with.
    */
  var cardholder: js.UndefOr[String] = js.native
  var metadata: js.UndefOr[IOptionsMetadata] = js.native
  /**
    * Specifies whether to permit authorizations on this card. Possible values are active, inactive, or the terminal states: canceled, lost, stolen.
    */
  var status: js.UndefOr[IssuingCardStatus] = js.native
}

object IIssuingCardUpdateOptions {
  @scala.inline
  def apply(): IIssuingCardUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIssuingCardUpdateOptions]
  }
  @scala.inline
  implicit class IIssuingCardUpdateOptionsOps[Self <: IIssuingCardUpdateOptions] (val x: Self) extends AnyVal {
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
    def setAuhtorization_controls(value: ICardAuthorizationControls): Self = this.set("auhtorization_controls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuhtorization_controls: Self = this.set("auhtorization_controls", js.undefined)
    @scala.inline
    def setCardholder(value: String): Self = this.set("cardholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardholder: Self = this.set("cardholder", js.undefined)
    @scala.inline
    def setMetadata(value: IOptionsMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setStatus(value: IssuingCardStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

