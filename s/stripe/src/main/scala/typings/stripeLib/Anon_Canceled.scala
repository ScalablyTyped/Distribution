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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canceled")(canceled)
    __obj.updateDynamic("fulfiled")(fulfiled)
    __obj.updateDynamic("paid")(paid)
    __obj.updateDynamic("returned")(returned)
    __obj.asInstanceOf[Anon_Canceled]
  }
}

