package typings.winrtUwp.Windows.Media.Devices.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the exposure time settings for a frame in a variable photo sequence. */
trait FrameExposureControl extends StObject {
  
  /** Gets or sets a value indicating whether auto exposure is enabled for a frame in a variable photo sequence. */
  var auto: Boolean
  
  /** Gets or sets the exposure time for a frame in a variable photo sequence. */
  var value: Double
}
object FrameExposureControl {
  
  inline def apply(auto: Boolean, value: Double): FrameExposureControl = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameExposureControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FrameExposureControl] (val x: Self) extends AnyVal {
    
    inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
