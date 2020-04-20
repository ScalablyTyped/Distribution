package typings.stripe.mod.plans

import typings.stripe.stripeStrings.down
import typings.stripe.stripeStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransformUsage extends js.Object {
  /**
    * Divide usage by this number.
    */
  var divide_by: Double
  /**
    * After division, either round the result `up` or `down`.
    */
  var round: up | down
}

object ITransformUsage {
  @scala.inline
  def apply(divide_by: Double, round: up | down): ITransformUsage = {
    val __obj = js.Dynamic.literal(divide_by = divide_by.asInstanceOf[js.Any], round = round.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransformUsage]
  }
}

