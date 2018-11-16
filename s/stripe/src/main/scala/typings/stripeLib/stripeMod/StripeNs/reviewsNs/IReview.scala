package typings
package stripeLib.stripeMod.StripeNs.reviewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IReview
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  /**
               * The charge associated with this review. [Expandable]
               */
  var charge: java.lang.String | stripeLib.stripeMod.StripeNs.chargesNs.ICharge
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

