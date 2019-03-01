package typings
package universalDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Status extends js.Object {
  var status: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Status {
  @scala.inline
  def apply(status: scala.Int | scala.Double = null): Anon_Status = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Status]
  }
}

