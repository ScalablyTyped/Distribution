package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for controlling the zoom settings on a capture device. */
trait ZoomControl extends StObject {
  
  /**
    * Configures the zoom control with the provided zoom settings.
    * @param settings The zoom settings.
    */
  def configure(settings: ZoomSettings): Unit
  
  /** Gets the maximum zoom value supported by the capture device. */
  var max: Double
  
  /** Gets the minimum zoom value supported by the capture device. */
  var min: Double
  
  /** Gets a value indicating the current zoom transition mode. */
  var mode: ZoomTransitionMode
  
  /** Gets the smallest zoom value increment supported by the capture device. */
  var step: Double
  
  /** Gets a value indicating whether zoom control is supported by the capture device. */
  var supported: Boolean
  
  /** Gets the list of ZoomTransitionMode values indicating the modes supported by the capture device. */
  var supportedModes: IVectorView[ZoomTransitionMode]
  
  /** Gets or sets the zoom value to be used by the capture device. */
  var value: Double
}
object ZoomControl {
  
  inline def apply(
    configure: ZoomSettings => Unit,
    max: Double,
    min: Double,
    mode: ZoomTransitionMode,
    step: Double,
    supported: Boolean,
    supportedModes: IVectorView[ZoomTransitionMode],
    value: Double
  ): ZoomControl = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure), max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], supportedModes = supportedModes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZoomControl] (val x: Self) extends AnyVal {
    
    inline def setConfigure(value: ZoomSettings => Unit): Self = StObject.set(x, "configure", js.Any.fromFunction1(value))
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMode(value: ZoomTransitionMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    
    inline def setSupportedModes(value: IVectorView[ZoomTransitionMode]): Self = StObject.set(x, "supportedModes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
