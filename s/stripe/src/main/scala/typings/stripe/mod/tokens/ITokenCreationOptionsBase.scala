package typings.stripe.mod.tokens

import typings.stripe.mod.IDataOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITokenCreationOptionsBase extends IDataOptions {
  /**
    * The customer (owned by the application's account) to create a
    * token for. For use with Stripe Connect only; this can only be used
    * with an OAuth access token or Stripe-Account header. For more
    * details, see the shared customers documentation.
    *
    * Stripe connect only
    */
  var customer: js.UndefOr[String] = js.native
}

object ITokenCreationOptionsBase {
  @scala.inline
  def apply(): ITokenCreationOptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITokenCreationOptionsBase]
  }
  @scala.inline
  implicit class ITokenCreationOptionsBaseOps[Self <: ITokenCreationOptionsBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
  }
  
}

