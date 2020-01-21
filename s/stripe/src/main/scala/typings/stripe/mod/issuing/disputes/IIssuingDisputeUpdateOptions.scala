package typings.stripe.mod.issuing.disputes

import typings.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIssuingDisputeUpdateOptions extends js.Object {
  var metadata: js.UndefOr[IOptionsMetadata] = js.undefined
}

object IIssuingDisputeUpdateOptions {
  @scala.inline
  def apply(metadata: IOptionsMetadata = null): IIssuingDisputeUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIssuingDisputeUpdateOptions]
  }
}

