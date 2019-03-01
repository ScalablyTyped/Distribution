package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RequestingUser extends js.Object {
  var requestingUser: scala.Double
  var serviceAccount: scala.Double
}

object Anon_RequestingUser {
  @scala.inline
  def apply(requestingUser: scala.Double, serviceAccount: scala.Double): Anon_RequestingUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requestingUser")(requestingUser)
    __obj.updateDynamic("serviceAccount")(serviceAccount)
    __obj.asInstanceOf[Anon_RequestingUser]
  }
}

