package typings
package stripeLib.stripeMod.reviewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReview
  extends stripeLib.stripeMod.IResourceObject {
  /**
    * The charge associated with this review. [Expandable]
    */
  var charge: java.lang.String | stripeLib.stripeMod.chargesNs.ICharge
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: scala.Double
  /**
    * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
    */
  var livemode: scala.Boolean
  /**
    * String representing the object’s type. Objects of the same type share the same value.
    */
  @JSName("object")
  var object_IReview: stripeLib.stripeLibStrings.review
  /**
    * If true, the review needs action.
    */
  var open: scala.Boolean
  /**
    * The reason the review is currently open or closed.
    */
  var reason: stripeLib.stripeLibStrings.rule | stripeLib.stripeLibStrings.manual | stripeLib.stripeLibStrings.approved | stripeLib.stripeLibStrings.refunded | stripeLib.stripeLibStrings.refunded_as_fraud | stripeLib.stripeLibStrings.disputed
}

object IReview {
  @scala.inline
  def apply(
    charge: java.lang.String | stripeLib.stripeMod.chargesNs.ICharge,
    created: scala.Double,
    id: java.lang.String,
    livemode: scala.Boolean,
    `object`: stripeLib.stripeLibStrings.review,
    open: scala.Boolean,
    reason: stripeLib.stripeLibStrings.rule | stripeLib.stripeLibStrings.manual | stripeLib.stripeLibStrings.approved | stripeLib.stripeLibStrings.refunded | stripeLib.stripeLibStrings.refunded_as_fraud | stripeLib.stripeLibStrings.disputed
  ): IReview = {
    val __obj = js.Dynamic.literal(charge = charge.asInstanceOf[js.Any], created = created, id = id, livemode = livemode, open = open, reason = reason.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[IReview]
  }
}

