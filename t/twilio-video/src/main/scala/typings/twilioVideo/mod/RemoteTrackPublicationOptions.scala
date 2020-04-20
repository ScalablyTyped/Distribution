package typings.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteTrackPublicationOptions extends js.Object {
  var logLevel: LogLevel | LogLevels
}

object RemoteTrackPublicationOptions {
  @scala.inline
  def apply(logLevel: LogLevel | LogLevels): RemoteTrackPublicationOptions = {
    val __obj = js.Dynamic.literal(logLevel = logLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteTrackPublicationOptions]
  }
}

