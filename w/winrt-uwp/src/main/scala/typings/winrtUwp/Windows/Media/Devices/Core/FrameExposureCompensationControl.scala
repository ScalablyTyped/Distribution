package typings.winrtUwp.Windows.Media.Devices.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the exposure compensation settings for a frame in a variable photo sequence. */
trait FrameExposureCompensationControl extends StObject {
  
  /** Gets or sets the exposure compensation time for a frame in a variable photo sequence. */
  var value: Double
}
object FrameExposureCompensationControl {
  
  inline def apply(value: Double): FrameExposureCompensationControl = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameExposureCompensationControl]
  }
  
  extension [Self <: FrameExposureCompensationControl](x: Self) {
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
