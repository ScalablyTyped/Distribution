package typings
package w3cDashPermissionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/permissions/#navigator-and-workernavigator-extension
trait WorkerNavigator extends js.Object {
  val permissions: Permissions
}

object WorkerNavigator {
  @scala.inline
  def apply(permissions: Permissions): WorkerNavigator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("permissions")(permissions)
    __obj.asInstanceOf[WorkerNavigator]
  }
}

