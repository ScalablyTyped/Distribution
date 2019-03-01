package typings
package w3cDashPermissionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/permissions/#navigator-and-workernavigator-extension
trait Navigator extends js.Object {
  val permissions: Permissions
}

object Navigator {
  @scala.inline
  def apply(permissions: Permissions): Navigator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("permissions")(permissions)
    __obj.asInstanceOf[Navigator]
  }
}

