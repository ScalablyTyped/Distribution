package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildLog extends BuildLogReference {
  /**
    * The date and time the log was created.
    */
  var createdOn: Date = js.native
  /**
    * The date and time the log was last changed.
    */
  var lastChangedOn: Date = js.native
  /**
    * The number of lines in the log.
    */
  var lineCount: Double = js.native
}

object BuildLog {
  @scala.inline
  def apply(createdOn: Date, id: Double, lastChangedOn: Date, lineCount: Double, `type`: String, url: String): BuildLog = {
    val __obj = js.Dynamic.literal(createdOn = createdOn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastChangedOn = lastChangedOn.asInstanceOf[js.Any], lineCount = lineCount.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildLog]
  }
  @scala.inline
  implicit class BuildLogOps[Self <: BuildLog] (val x: Self) extends AnyVal {
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
    def setCreatedOn(value: Date): Self = this.set("createdOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastChangedOn(value: Date): Self = this.set("lastChangedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineCount(value: Double): Self = this.set("lineCount", value.asInstanceOf[js.Any])
  }
  
}

