package typings.stripe.mod.topups

import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITopupCreationOptions extends IDataOptionsWithMetadata {
  /**
    * A positive integer representing how much to transfer.
    */
  var amount: Double
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The ID of a source to transfer funds from. For most users, this should be left unspecified
    * which will use the bank account that was set up in the dashboard for the specified currency.
    * In test mode, this can be a test bank token (see https://stripe.com/docs/connect/testing#testing-top-ups).
    */
  var source: js.UndefOr[String] = js.undefined
  /**
    * Extra information about a top-up for the source’s bank statement. Limited to 15 ASCII characters.
    */
  var statement_descriptor: js.UndefOr[String] = js.undefined
  /**
    * A string that identifies this top-up as part of a group.
    */
  var transfer_group: js.UndefOr[String] = js.undefined
}

object ITopupCreationOptions {
  @scala.inline
  def apply(
    amount: Double,
    currency: String,
    description: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null,
    source: String = null,
    statement_descriptor: String = null,
    transfer_group: String = null
  ): ITopupCreationOptions = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor.asInstanceOf[js.Any])
    if (transfer_group != null) __obj.updateDynamic("transfer_group")(transfer_group.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITopupCreationOptions]
  }
}

