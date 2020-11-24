package typings.stripe.mod.reviews

import typings.stripe.mod.IResourceObject
import typings.stripe.mod.charges.ICharge
import typings.stripe.stripeStrings.approved
import typings.stripe.stripeStrings.disputed
import typings.stripe.stripeStrings.manual
import typings.stripe.stripeStrings.refunded
import typings.stripe.stripeStrings.refunded_as_fraud
import typings.stripe.stripeStrings.review
import typings.stripe.stripeStrings.rule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IReview extends IResourceObject {
  
  /**
    * The charge associated with this review. [Expandable]
    */
  var charge: String | ICharge = js.native
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  
  /**
    * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
    */
  var livemode: Boolean = js.native
  
  /**
    * String representing the object’s type. Objects of the same type share the same value.
    */
  @JSName("object")
  var object_IReview: review = js.native
  
  /**
    * If true, the review needs action.
    */
  var open: Boolean = js.native
  
  /**
    * The reason the review is currently open or closed.
    */
  var reason: rule | manual | approved | refunded | refunded_as_fraud | disputed = js.native
}
object IReview {
  
  @scala.inline
  def apply(
    charge: String | ICharge,
    created: Double,
    id: String,
    livemode: Boolean,
    `object`: review,
    open: Boolean,
    reason: rule | manual | approved | refunded | refunded_as_fraud | disputed
  ): IReview = {
    val __obj = js.Dynamic.literal(charge = charge.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReview]
  }
  
  @scala.inline
  implicit class IReviewOps[Self <: IReview] (val x: Self) extends AnyVal {
    
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
    def setCharge(value: String | ICharge): Self = this.set("charge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: review): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: rule | manual | approved | refunded | refunded_as_fraud | disputed): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
}
