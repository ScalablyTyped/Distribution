package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineIterationStatus extends js.Object {
  var message: java.lang.String
  var `type`: TimelineIterationStatusCode
}

object TimelineIterationStatus {
  @scala.inline
  def apply(message: java.lang.String, `type`: TimelineIterationStatusCode): TimelineIterationStatus = {
    val __obj = js.Dynamic.literal(message = message)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TimelineIterationStatus]
  }
}

