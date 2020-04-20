package typings.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogLevels extends js.Object {
  var default: LogLevel
  var media: LogLevel
  var signaling: LogLevel
  var webrtc: LogLevel
}

object LogLevels {
  @scala.inline
  def apply(default: LogLevel, media: LogLevel, signaling: LogLevel, webrtc: LogLevel): LogLevels = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], signaling = signaling.asInstanceOf[js.Any], webrtc = webrtc.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogLevels]
  }
}

