package typings.stripe.stripeMod.issuing.cards

import typings.stripe.stripeMod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the specified Issuing Card object by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
  */
trait IIssuingCardUpdateOptions extends js.Object {
  /**
    * Spending rules that give you some control over how your cards can be used. Refer to our authorizations documentation for more details.
    */
  var auhtorization_controls: js.UndefOr[ICardAuthorizationControls] = js.undefined
  /**
    * The Cardholder to associate the card with.
    */
  var cardholder: js.UndefOr[String] = js.undefined
  var metadata: js.UndefOr[IOptionsMetadata] = js.undefined
  /**
    * Specifies whether to permit authorizations on this card. Possible values are active, inactive, or the terminal states: canceled, lost, stolen.
    */
  var status: js.UndefOr[IssuingCardStatus] = js.undefined
}

object IIssuingCardUpdateOptions {
  @scala.inline
  def apply(
    auhtorization_controls: ICardAuthorizationControls = null,
    cardholder: String = null,
    metadata: IOptionsMetadata = null,
    status: IssuingCardStatus = null
  ): IIssuingCardUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (auhtorization_controls != null) __obj.updateDynamic("auhtorization_controls")(auhtorization_controls.asInstanceOf[js.Any])
    if (cardholder != null) __obj.updateDynamic("cardholder")(cardholder.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIssuingCardUpdateOptions]
  }
}

