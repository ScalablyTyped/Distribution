package typings.stripe.mod.issuing.authorizations

import typings.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuthorizationApproveOptions extends js.Object {
  /**
    * If the authorization’s is_held_amount_controllable property is true, you may provide this value to control how much to hold for the authorization.
    * Must be positive (use decline to decline an authorization request).
    */
  var held_amount: js.UndefOr[Double] = js.undefined
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.undefined
}

object IAuthorizationApproveOptions {
  @scala.inline
  def apply(held_amount: Int | Double = null, metadata: IOptionsMetadata = null): IAuthorizationApproveOptions = {
    val __obj = js.Dynamic.literal()
    if (held_amount != null) __obj.updateDynamic("held_amount")(held_amount.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthorizationApproveOptions]
  }
}

