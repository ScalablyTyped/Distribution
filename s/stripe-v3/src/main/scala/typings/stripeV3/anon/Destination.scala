package typings.stripeV3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Destination extends js.Object {
  /**
    * The account (if any) the payment will be attributed to for tax reporting,
    * and where funds from the payment will be transferred to upon payment success.
    */
  var destination: String
}

object Destination {
  @scala.inline
  def apply(destination: String): Destination = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
}

