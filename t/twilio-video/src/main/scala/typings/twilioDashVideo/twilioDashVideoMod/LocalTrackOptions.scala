package typings.twilioDashVideo.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalTrackOptions extends js.Object {
  var logLevel: LogLevel | LogLevels
  var name: js.UndefOr[String] = js.undefined
}

object LocalTrackOptions {
  @scala.inline
  def apply(logLevel: LogLevel | LogLevels, name: String = null): LocalTrackOptions = {
    val __obj = js.Dynamic.literal(logLevel = logLevel.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalTrackOptions]
  }
}

