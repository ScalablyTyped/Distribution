package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accepted extends js.Object {
  var accepted: scala.Double
  var open: scala.Double
  var rejected: scala.Double
}

object Anon_Accepted {
  @scala.inline
  def apply(accepted: scala.Double, open: scala.Double, rejected: scala.Double): Anon_Accepted = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accepted")(accepted)
    __obj.updateDynamic("open")(open)
    __obj.updateDynamic("rejected")(rejected)
    __obj.asInstanceOf[Anon_Accepted]
  }
}

