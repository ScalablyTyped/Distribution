package typings.winrtUwp.Windows.Media.Devices.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the flash capabilities of the capture device for frames in a variable photo sequences. */
@js.native
trait FrameFlashCapabilities extends js.Object {
  
  /** Gets a value indicating whether flash power is supported for frames in a variable photo sequences. */
  var powerSupported: Boolean = js.native
  
  /** Gets a value indicating whether red eye reduction is supported for frames in a variable photo sequences. */
  var redEyeReductionSupported: Boolean = js.native
  
  /** Gets a value that indicates if the capture device supports the flash control for frames in a variable photo sequence. */
  var supported: Boolean = js.native
}
object FrameFlashCapabilities {
  
  @scala.inline
  def apply(powerSupported: Boolean, redEyeReductionSupported: Boolean, supported: Boolean): FrameFlashCapabilities = {
    val __obj = js.Dynamic.literal(powerSupported = powerSupported.asInstanceOf[js.Any], redEyeReductionSupported = redEyeReductionSupported.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameFlashCapabilities]
  }
  
  @scala.inline
  implicit class FrameFlashCapabilitiesOps[Self <: FrameFlashCapabilities] (val x: Self) extends AnyVal {
    
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
    def setPowerSupported(value: Boolean): Self = this.set("powerSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedEyeReductionSupported(value: Boolean): Self = this.set("redEyeReductionSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupported(value: Boolean): Self = this.set("supported", value.asInstanceOf[js.Any])
  }
}
