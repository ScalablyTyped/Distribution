package typings.stripe

import typings.stripe.stripeMod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Metadata extends js.Object {
  var metadata: js.UndefOr[IOptionsMetadata] = js.undefined
}

object Anon_Metadata {
  @scala.inline
  def apply(metadata: IOptionsMetadata = null): Anon_Metadata = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Metadata]
  }
}

