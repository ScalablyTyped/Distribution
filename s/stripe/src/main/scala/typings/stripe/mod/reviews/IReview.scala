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
import scala.scalajs.js.annotation._

trait IReview extends IResourceObject {
  /**
    * The charge associated with this review. [Expandable]
    */
  var charge: String | ICharge
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  /**
    * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
    */
  var livemode: Boolean
  /**
    * String representing the object’s type. Objects of the same type share the same value.
    */
  @JSName("object")
  var object_IReview: review
  /**
    * If true, the review needs action.
    */
  var open: Boolean
  /**
    * The reason the review is currently open or closed.
    */
  var reason: rule | manual | approved | refunded | refunded_as_fraud | disputed
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
}

