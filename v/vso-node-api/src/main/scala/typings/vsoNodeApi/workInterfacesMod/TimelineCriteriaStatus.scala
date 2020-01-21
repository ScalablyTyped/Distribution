package typings.vsoNodeApi.workInterfacesMod

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
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineCriteriaStatus]
  }
}

