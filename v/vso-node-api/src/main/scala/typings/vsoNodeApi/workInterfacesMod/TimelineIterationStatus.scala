package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineIterationStatus extends js.Object {
  var message: String
  var `type`: TimelineIterationStatusCode
}

object TimelineIterationStatus {
  @scala.inline
  def apply(message: String, `type`: TimelineIterationStatusCode): TimelineIterationStatus = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineIterationStatus]
  }
}

