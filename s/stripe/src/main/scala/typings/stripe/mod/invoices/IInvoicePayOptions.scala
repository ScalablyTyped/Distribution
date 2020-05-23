package typings.stripe.mod.invoices

import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.IOptionsMetadata
import typings.stripe.mod.cards.ICardSourceCreationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInvoicePayOptions extends IDataOptionsWithMetadata {
  /**
    * In cases where the source used to pay the invoice has insufficient
    * funds, passing forgive=true controls whether a charge should be
    * attempted for the full amount available on the source, up to the
    * amount to fully pay the invoice. This effectively forgives the
    * difference between the amount available on the source and the amount due.
    * Passing forgive=false will fail the charge if the source hasn’t
    * been pre-funded with the right amount. An example for this case is
    * with ACH Credit Transfers and wires: if the amount wired is less
    * than the amount due by a small amount, you might want to forgive
    * the difference.
    */
  var forgive: js.UndefOr[Boolean] = js.undefined
  /**
    * Boolean representing whether an invoice is paid outside of Stripe.
    * This will result in no charge being made.
    */
  var paid_out_of_band: js.UndefOr[Boolean] = js.undefined
  /**
    * A payment source to be charged. The source must be the ID of a source
    * belonging to the customer associated with the invoice being paid.
    */
  var source: js.UndefOr[String | ICardSourceCreationOptions] = js.undefined
}

object IInvoicePayOptions {
  @scala.inline
  def apply(
    expand: js.Array[String] = null,
    forgive: js.UndefOr[Boolean] = js.undefined,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null,
    paid_out_of_band: js.UndefOr[Boolean] = js.undefined,
    source: String | ICardSourceCreationOptions = null
  ): IInvoicePayOptions = {
    val __obj = js.Dynamic.literal()
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (!js.isUndefined(forgive)) __obj.updateDynamic("forgive")(forgive.get.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(paid_out_of_band)) __obj.updateDynamic("paid_out_of_band")(paid_out_of_band.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvoicePayOptions]
  }
}

