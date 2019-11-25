package typings.stripe.stripeMod.customers

import typings.stripe.stripeMod.IOptionsMetadata
import typings.stripe.stripeMod.cards.ICardSourceCreationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomerCardSourceCreationOptions extends ICustomerSourceCreationOptions {
  @JSName("source")
  var source_ICustomerCardSourceCreationOptions: ICardSourceCreationOptions
}

object ICustomerCardSourceCreationOptions {
  @scala.inline
  def apply(
    source: ICardSourceCreationOptions,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null
  ): ICustomerCardSourceCreationOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomerCardSourceCreationOptions]
  }
}

