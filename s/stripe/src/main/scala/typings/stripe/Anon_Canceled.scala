package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Canceled extends js.Object {
  var canceled: Double
  var fulfiled: Double
  var paid: Double
  var returned: Double
}

object Anon_Canceled {
  @scala.inline
  def apply(canceled: Double, fulfiled: Double, paid: Double, returned: Double): Anon_Canceled = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], fulfiled = fulfiled.asInstanceOf[js.Any], paid = paid.asInstanceOf[js.Any], returned = returned.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Canceled]
  }
}

