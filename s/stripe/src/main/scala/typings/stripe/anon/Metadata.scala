package typings.stripe.anon

import typings.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var metadata: js.UndefOr[IOptionsMetadata] = js.undefined
}

object Metadata {
  @scala.inline
  def apply(metadata: IOptionsMetadata = null): Metadata = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}

