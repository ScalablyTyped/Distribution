package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Canceled extends js.Object {
  var canceled: Double
  var fulfiled: Double
  var paid: Double
  var returned: Double
}

object Canceled {
  @scala.inline
  def apply(canceled: Double, fulfiled: Double, paid: Double, returned: Double): Canceled = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], fulfiled = fulfiled.asInstanceOf[js.Any], paid = paid.asInstanceOf[js.Any], returned = returned.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canceled]
  }
}

