package typings.winrtUwp.Windows.Media.Casting

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the filter used to determine which devices to show in a casting device picker UI. The filter parameters are OR-ed together to build the resulting filter. In other words, if SupportsAudio and SupportsVideo are both true, the picker will display Audio-only devices, video-only devices, and audio/video devices. */
@js.native
trait CastingDevicePickerFilter extends js.Object {
  
  /** Gets the casting sources supported. */
  var supportedCastingSources: IVector[CastingSource] = js.native
  
  /** Gets and sets whether the devices in the device picker should support audio playback. */
  var supportsAudio: Boolean = js.native
  
  /** Gets and sets whether the devices in the device picker should support rending still images. */
  var supportsPictures: Boolean = js.native
  
  /** Gets and sets whether the devices in the device picker should support video playback. */
  var supportsVideo: Boolean = js.native
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
  
  @scala.inline
  implicit class CastingDevicePickerFilterOps[Self <: CastingDevicePickerFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSupportedCastingSources(value: IVector[CastingSource]): Self = this.set("supportedCastingSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsAudio(value: Boolean): Self = this.set("supportsAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsPictures(value: Boolean): Self = this.set("supportsPictures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsVideo(value: Boolean): Self = this.set("supportsVideo", value.asInstanceOf[js.Any])
  }
}
