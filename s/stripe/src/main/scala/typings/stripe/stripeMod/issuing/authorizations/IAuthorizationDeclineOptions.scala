package typings.stripe.stripeMod.issuing.authorizations

import typings.stripe.stripeMod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuthorizationDeclineOptions extends js.Object {
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.undefined
}

object IAuthorizationDeclineOptions {
  @scala.inline
  def apply(metadata: IOptionsMetadata = null): IAuthorizationDeclineOptions = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthorizationDeclineOptions]
  }
}

