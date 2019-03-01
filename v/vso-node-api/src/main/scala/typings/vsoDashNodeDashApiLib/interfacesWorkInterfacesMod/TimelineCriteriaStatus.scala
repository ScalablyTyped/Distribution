package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineCriteriaStatus extends js.Object {
  var message: java.lang.String
  var `type`: TimelineCriteriaStatusCode
}

object TimelineCriteriaStatus {
  @scala.inline
  def apply(message: java.lang.String, `type`: TimelineCriteriaStatusCode): TimelineCriteriaStatus = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[TimelineCriteriaStatus]
  }
}

