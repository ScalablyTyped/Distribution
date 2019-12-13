package typings.stripe.stripeMod.issuing.transactions

import typings.stripe.stripeMod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransactionUpdateOptions extends js.Object {
  var metadata: js.UndefOr[IOptionsMetadata] = js.undefined
}

object ITransactionUpdateOptions {
  @scala.inline
  def apply(metadata: IOptionsMetadata = null): ITransactionUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransactionUpdateOptions]
  }
}

