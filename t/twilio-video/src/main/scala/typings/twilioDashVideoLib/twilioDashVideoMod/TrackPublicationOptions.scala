package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackPublicationOptions extends js.Object {
  var logLevel: LogLevel | LogLevels
}

object TrackPublicationOptions {
  @scala.inline
  def apply(logLevel: LogLevel | LogLevels): TrackPublicationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackPublicationOptions]
  }
}

