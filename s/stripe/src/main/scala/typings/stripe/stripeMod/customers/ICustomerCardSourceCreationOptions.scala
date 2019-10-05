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
    val __obj = js.Dynamic.literal(source = source)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[ICustomerCardSourceCreationOptions]
  }
}

