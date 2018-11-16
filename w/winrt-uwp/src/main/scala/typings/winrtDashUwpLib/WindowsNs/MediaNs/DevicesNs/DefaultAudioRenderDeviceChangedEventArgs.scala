package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a default audio render device change event. */
@JSGlobal("Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs")
@js.native
abstract class DefaultAudioRenderDeviceChangedEventArgs () extends js.Object {
  /** Gets the ID of the newly selected default audio render device that caused the change event. */
  var id: java.lang.String = js.native
  /** Gets the role of the newly selected default audio render device that caused the change event. */
  var role: AudioDeviceRole = js.native
}

