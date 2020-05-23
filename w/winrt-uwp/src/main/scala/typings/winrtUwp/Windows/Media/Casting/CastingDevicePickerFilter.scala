package typings.winrtUwp.Windows.Media.Casting

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the filter used to determine which devices to show in a casting device picker UI. The filter parameters are OR-ed together to build the resulting filter. In other words, if SupportsAudio and SupportsVideo are both true, the picker will display Audio-only devices, video-only devices, and audio/video devices. */
trait CastingDevicePickerFilter extends js.Object {
  /** Gets the casting sources supported. */
  var supportedCastingSources: IVector[CastingSource]
  /** Gets and sets whether the devices in the device picker should support audio playback. */
  var supportsAudio: Boolean
  /** Gets and sets whether the devices in the device picker should support rending still images. */
  var supportsPictures: Boolean
  /** Gets and sets whether the devices in the device picker should support video playback. */
  var supportsVideo: Boolean
}

object CastingDevicePickerFilter {
  @scala.inline
  def apply(
    supportedCastingSources: IVector[CastingSource],
    supportsAudio: Boolean,
    supportsPictures: Boolean,
    supportsVideo: Boolean
  ): CastingDevicePickerFilter = {
    val __obj = js.Dynamic.literal(supportedCastingSources = supportedCastingSources.asInstanceOf[js.Any], supportsAudio = supportsAudio.asInstanceOf[js.Any], supportsPictures = supportsPictures.asInstanceOf[js.Any], supportsVideo = supportsVideo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastingDevicePickerFilter]
  }
}

