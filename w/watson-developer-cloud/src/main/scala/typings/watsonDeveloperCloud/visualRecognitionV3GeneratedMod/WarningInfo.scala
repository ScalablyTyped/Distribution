package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about something that went wrong. */
@js.native
trait WarningInfo extends js.Object {
  /** Information about the error. */
  var description: String = js.native
  /** Codified warning string, such as `limit_reached`. */
  var warning_id: String = js.native
}

object WarningInfo {
  @scala.inline
  def apply(description: String, warning_id: String): WarningInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], warning_id = warning_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WarningInfo]
  }
  @scala.inline
  implicit class WarningInfoOps[Self <: WarningInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarning_id(value: String): Self = this.set("warning_id", value.asInstanceOf[js.Any])
  }
  
}

