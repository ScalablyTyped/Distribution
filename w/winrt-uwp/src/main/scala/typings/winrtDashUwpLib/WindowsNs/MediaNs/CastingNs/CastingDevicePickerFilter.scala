package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CastingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the filter used to determine which devices to show in a casting device picker UI. The filter parameters are OR-ed together to build the resulting filter. In other words, if SupportsAudio and SupportsVideo are both true, the picker will display Audio-only devices, video-only devices, and audio/video devices. */
@JSGlobal("Windows.Media.Casting.CastingDevicePickerFilter")
@js.native
abstract class CastingDevicePickerFilter () extends js.Object {
  /** Gets the casting sources supported. */
  var supportedCastingSources: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[CastingSource] = js.native
  /** Gets and sets whether the devices in the device picker should support audio playback. */
  var supportsAudio: scala.Boolean = js.native
  /** Gets and sets whether the devices in the device picker should support rending still images. */
  var supportsPictures: scala.Boolean = js.native
  /** Gets and sets whether the devices in the device picker should support video playback. */
  var supportsVideo: scala.Boolean = js.native
}

