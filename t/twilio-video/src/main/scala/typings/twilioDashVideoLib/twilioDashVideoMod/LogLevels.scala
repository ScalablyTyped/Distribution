package typings
package twilioDashVideoLib.twilioDashVideoMod

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("default")(default)
    __obj.updateDynamic("media")(media)
    __obj.updateDynamic("signaling")(signaling)
    __obj.updateDynamic("webrtc")(webrtc)
    __obj.asInstanceOf[LogLevels]
  }
}

