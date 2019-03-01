package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalTrackOptions extends js.Object {
  var logLevel: LogLevel | LogLevels
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object LocalTrackOptions {
  @scala.inline
  def apply(logLevel: LogLevel | LogLevels, name: java.lang.String = null): LocalTrackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[LocalTrackOptions]
  }
}

