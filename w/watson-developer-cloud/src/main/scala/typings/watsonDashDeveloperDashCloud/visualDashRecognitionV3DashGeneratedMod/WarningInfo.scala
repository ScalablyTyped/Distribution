package typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about something that went wrong. */
trait WarningInfo extends js.Object {
  /** Information about the error. */
  var description: String
  /** Codified warning string, such as `limit_reached`. */
  var warning_id: String
}

object WarningInfo {
  @scala.inline
  def apply(description: String, warning_id: String): WarningInfo = {
    val __obj = js.Dynamic.literal(description = description, warning_id = warning_id)
  
    __obj.asInstanceOf[WarningInfo]
  }
}

