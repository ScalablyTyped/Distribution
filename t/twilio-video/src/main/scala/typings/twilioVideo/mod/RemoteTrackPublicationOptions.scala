package typings.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteTrackPublicationOptions extends js.Object {
  var logLevel: LogLevel | LogLevels = js.native
}

object RemoteTrackPublicationOptions {
  @scala.inline
  def apply(logLevel: LogLevel | LogLevels): RemoteTrackPublicationOptions = {
    val __obj = js.Dynamic.literal(logLevel = logLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteTrackPublicationOptions]
  }
  @scala.inline
  implicit class RemoteTrackPublicationOptionsOps[Self <: RemoteTrackPublicationOptions] (val x: Self) extends AnyVal {
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
    def setLogLevel(value: LogLevel | LogLevels): Self = this.set("logLevel", value.asInstanceOf[js.Any])
  }
  
}

