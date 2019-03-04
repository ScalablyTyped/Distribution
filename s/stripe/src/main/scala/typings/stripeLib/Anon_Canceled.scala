package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Canceled extends js.Object {
  var canceled: scala.Double
  var fulfiled: scala.Double
  var paid: scala.Double
  var returned: scala.Double
}

object Anon_Canceled {
  @scala.inline
  def apply(canceled: scala.Double, fulfiled: scala.Double, paid: scala.Double, returned: scala.Double): Anon_Canceled = {
    val __obj = js.Dynamic.literal(canceled = canceled, fulfiled = fulfiled, paid = paid, returned = returned)
  
    __obj.asInstanceOf[Anon_Canceled]
  }
}

