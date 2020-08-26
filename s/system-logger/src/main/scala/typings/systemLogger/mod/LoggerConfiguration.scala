package typings.systemLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggerConfiguration extends js.Object {
  var externalDisplayFormat: js.UndefOr[js.Any] = js.native
  var level: typings.systemLogger.mod.level = js.native
  var silent: js.UndefOr[Boolean] = js.native
}

object LoggerConfiguration {
  @scala.inline
  def apply(level: level): LoggerConfiguration = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerConfiguration]
  }
  @scala.inline
  implicit class LoggerConfigurationOps[Self <: LoggerConfiguration] (val x: Self) extends AnyVal {
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
    def setLevel(value: level): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternalDisplayFormat(value: js.Any): Self = this.set("externalDisplayFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalDisplayFormat: Self = this.set("externalDisplayFormat", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
  }
  
}

