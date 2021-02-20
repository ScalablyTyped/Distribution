package typings.winrtUwp.Windows.Media.Devices.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the ISO speed settings for a frame in a variable photo sequence. */
@js.native
trait FrameIsoSpeedControl extends StObject {
  
  /** Gets or sets a value indicating whether ISO speed is automatically set for a frame in a variable photo sequence. */
  var auto: Boolean = js.native
  
  /** Gets or sets the ISO speed for a frame in a variable photo sequence. */
  var value: Double = js.native
}
object FrameIsoSpeedControl {
  
  @scala.inline
  def apply(auto: Boolean, value: Double): FrameIsoSpeedControl = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameIsoSpeedControl]
  }
  
  @scala.inline
  implicit class FrameIsoSpeedControlMutableBuilder[Self <: FrameIsoSpeedControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
