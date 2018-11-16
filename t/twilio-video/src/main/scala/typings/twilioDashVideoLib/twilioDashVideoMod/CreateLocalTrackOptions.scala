package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreateLocalTrackOptions
  extends stdLib.MediaTrackConstraints {
  // In API reference logLevel is not optional, but in the Twilio examples it is
  var logLevel: js.UndefOr[LogLevel | LogLevels] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var workaroundWebKitBug180748: js.UndefOr[scala.Boolean] = js.undefined
}

