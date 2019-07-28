package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineTeamStatus extends js.Object {
  var message: String
  var `type`: TimelineTeamStatusCode
}

object TimelineTeamStatus {
  @scala.inline
  def apply(message: String, `type`: TimelineTeamStatusCode): TimelineTeamStatus = {
    val __obj = js.Dynamic.literal(message = message)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TimelineTeamStatus]
  }
}

