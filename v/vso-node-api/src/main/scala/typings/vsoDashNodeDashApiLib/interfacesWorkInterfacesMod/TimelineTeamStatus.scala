package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineTeamStatus extends js.Object {
  var message: java.lang.String
  var `type`: TimelineTeamStatusCode
}

object TimelineTeamStatus {
  @scala.inline
  def apply(message: java.lang.String, `type`: TimelineTeamStatusCode): TimelineTeamStatus = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[TimelineTeamStatus]
  }
}

