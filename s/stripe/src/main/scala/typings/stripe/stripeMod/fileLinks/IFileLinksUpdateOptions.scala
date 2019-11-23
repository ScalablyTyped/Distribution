package typings.stripe.stripeMod.fileLinks

import typings.stripe.stripeMod.IDataOptionsWithMetadata
import typings.stripe.stripeMod.IOptionsMetadata
import typings.stripe.stripeStrings.now
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileLinksUpdateOptions extends IDataOptionsWithMetadata {
  var expires_at: js.UndefOr[Double | now] = js.undefined
}

object IFileLinksUpdateOptions {
  @scala.inline
  def apply(
    expand: js.Array[String] = null,
    expires_at: Double | now = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null
  ): IFileLinksUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (expires_at != null) __obj.updateDynamic("expires_at")(expires_at.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[IFileLinksUpdateOptions]
  }
}

