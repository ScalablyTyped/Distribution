package typings.stripe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHeaderOptions extends js.Object {
  
  var api_key: js.UndefOr[String] = js.native
  
  /**
    * Many objects contain the ID of a related object in their response properties. For example, a Charge may have an associated Customer ID.
    * Those objects can be expanded inline with the expand request parameter. Objects that can be expanded are noted in this documentation.
    * This parameter is available on all API requests, and applies to the response of that request only.
    *
    * You can nest expand requests with the dot property. For example, requesting invoice.customer on a charge will expand the invoice property
    * into a full Invoice object, and will then expand the customer property on that invoice into a full Customer object.
    *
    * You can expand multiple objects at once by identifying multiple items in the expand array.
    */
  var expand: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * To safely retry an API request without accidentally performing the same operation twice,
    * you can attach a unique key to any POST request made to the Stripe API via the Idempotency-Key: <key> header.
    * For example, if a request to create a charge fails due to a network connection error, you can make
    * a second request with the same key to guarantee that only a single charge is created.
    * The creation of the key is completely up to you. We suggest using random strings or UUIDs.
    * We'll always send back the same response for requests made with the same key, even if you make the request
    * with different request parameters. The keys expire after 24 hours.
    */
  var idempotency_key: js.UndefOr[String] = js.native
  
  var stripe_account: js.UndefOr[String] = js.native
}
object IHeaderOptions {
  
  @scala.inline
  def apply(): IHeaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHeaderOptions]
  }
  
  @scala.inline
  implicit class IHeaderOptionsOps[Self <: IHeaderOptions] (val x: Self) extends AnyVal {
    
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
    def setApi_key(value: String): Self = this.set("api_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApi_key: Self = this.set("api_key", js.undefined)
    
    @scala.inline
    def setExpandVarargs(value: String*): Self = this.set("expand", js.Array(value :_*))
    
    @scala.inline
    def setExpand(value: js.Array[String]): Self = this.set("expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    
    @scala.inline
    def setIdempotency_key(value: String): Self = this.set("idempotency_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdempotency_key: Self = this.set("idempotency_key", js.undefined)
    
    @scala.inline
    def setStripe_account(value: String): Self = this.set("stripe_account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripe_account: Self = this.set("stripe_account", js.undefined)
  }
}
