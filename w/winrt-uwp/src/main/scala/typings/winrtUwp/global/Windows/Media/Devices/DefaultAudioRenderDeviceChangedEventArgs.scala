package typings.winrtUwp.global.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a default audio render device change event. */
@JSGlobal("Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs")
@js.native
abstract class DefaultAudioRenderDeviceChangedEventArgs ()
  extends typings.winrtUwp.Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs {
  /** Gets the ID of the newly selected default audio render device that caused the change event. */
  /* CompleteClass */
  override var id: String = js.native
  /** Gets the role of the newly selected default audio render device that caused the change event. */
  /* CompleteClass */
  override var role: typings.winrtUwp.Windows.Media.Devices.AudioDeviceRole = js.native
}

