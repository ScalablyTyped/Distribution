package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineCriteriaStatus extends js.Object {
  var message: String
  var `type`: TimelineCriteriaStatusCode
}

object TimelineCriteriaStatus {
  @scala.inline
  def apply(message: String, `type`: TimelineCriteriaStatusCode): TimelineCriteriaStatus = {
    val __obj = js.Dynamic.literal(message = message)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TimelineCriteriaStatus]
  }
}

