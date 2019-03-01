package typings
package typedDashGithubDashApiLib.distInterfacesCommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitActor extends js.Object {
  var date: momentLib.momentMod.momentNs.Moment
  var email: java.lang.String
  var name: java.lang.String
}

object GitActor {
  @scala.inline
  def apply(date: momentLib.momentMod.momentNs.Moment, email: java.lang.String, name: java.lang.String): GitActor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GitActor]
  }
}

