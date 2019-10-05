package typings.stripe.stripeMod.tokens

import typings.stripe.stripeMod.IDataOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITokenCreationOptionsBase extends IDataOptions {
  /**
    * The customer (owned by the application's account) to create a
    * token for. For use with Stripe Connect only; this can only be used
    * with an OAuth access token or Stripe-Account header. For more
    * details, see the shared customers documentation.
    *
    * Stripe connect only
    */
  var customer: js.UndefOr[String] = js.undefined
}

object ITokenCreationOptionsBase {
  @scala.inline
  def apply(customer: String = null, expand: js.Array[String] = null, include: js.Array[String] = null): ITokenCreationOptionsBase = {
    val __obj = js.Dynamic.literal()
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    __obj.asInstanceOf[ITokenCreationOptionsBase]
  }
}

