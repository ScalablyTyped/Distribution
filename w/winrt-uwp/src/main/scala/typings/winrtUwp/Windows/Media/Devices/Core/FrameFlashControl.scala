package typings.winrtUwp.Windows.Media.Devices.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the flash settings for a frame in a variable photo sequence. */
@js.native
trait FrameFlashControl extends StObject {
  
  /** Gets or sets a value indicating whether flash settings are automatically set for a frame in a variable photo sequence. */
  var auto: Boolean = js.native
  
  /** Gets or sets the flash mode for a frame in a variable photo sequence. */
  var mode: FrameFlashMode = js.native
  
  /** Gets or sets the flash power for a frame in a variable photo sequence. */
  var powerPercent: Double = js.native
  
  /** Gets or sets a value indicating if red eye reduction is enabled for a frame in a variable photo sequence. */
  var redEyeReduction: Boolean = js.native
}
object FrameFlashControl {
  
  @scala.inline
  def apply(auto: Boolean, mode: FrameFlashMode, powerPercent: Double, redEyeReduction: Boolean): FrameFlashControl = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], powerPercent = powerPercent.asInstanceOf[js.Any], redEyeReduction = redEyeReduction.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameFlashControl]
  }
  
  @scala.inline
  implicit class FrameFlashControlMutableBuilder[Self <: FrameFlashControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: FrameFlashMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPercent(value: Double): Self = StObject.set(x, "powerPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedEyeReduction(value: Boolean): Self = StObject.set(x, "redEyeReduction", value.asInstanceOf[js.Any])
  }
}
