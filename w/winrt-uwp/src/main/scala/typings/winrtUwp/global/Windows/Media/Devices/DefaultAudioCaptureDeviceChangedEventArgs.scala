package typings.winrtUwp.global.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a default audio capture device change event. */
@JSGlobal("Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs")
@js.native
abstract class DefaultAudioCaptureDeviceChangedEventArgs ()
  extends typings.winrtUwp.Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs {
  /** Gets the ID of the newly selected audio capture device that caused the change event. */
  /* CompleteClass */
  override var id: String = js.native
  /** Gets the role of the newly selected audio capture device that caused the change event. */
  /* CompleteClass */
  override var role: typings.winrtUwp.Windows.Media.Devices.AudioDeviceRole = js.native
}

