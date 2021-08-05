package typings.winrtUwp.Windows.Media.Devices.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the ISO speed settings for a frame in a variable photo sequence. */
trait FrameIsoSpeedControl extends StObject {
  
  /** Gets or sets a value indicating whether ISO speed is automatically set for a frame in a variable photo sequence. */
  var auto: Boolean
  
  /** Gets or sets the ISO speed for a frame in a variable photo sequence. */
  var value: Double
}
object FrameIsoSpeedControl {
  
  inline def apply(auto: Boolean, value: Double): FrameIsoSpeedControl = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameIsoSpeedControl]
  }
  
  extension [Self <: FrameIsoSpeedControl](x: Self) {
    
    inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
