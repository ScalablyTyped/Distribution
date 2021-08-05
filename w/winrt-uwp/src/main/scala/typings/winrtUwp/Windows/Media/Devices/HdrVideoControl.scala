package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** When supported, allows an app to enable High Dynamic Range (HDR) video recording on the capture device. */
trait HdrVideoControl extends StObject {
  
  /** Gets or sets a value indicating the current High Dynamic Range (HDR) video recording mode of the capture device. */
  var mode: HdrVideoMode
  
  /** Gets a value that indicates if the capture device supports the HdrVideoControl . */
  var supported: Boolean
  
  /** Gets the list of HdrVideoMode values indicating the modes supported by the capture device. */
  var supportedModes: IVectorView[HdrVideoMode]
}
object HdrVideoControl {
  
  inline def apply(mode: HdrVideoMode, supported: Boolean, supportedModes: IVectorView[HdrVideoMode]): HdrVideoControl = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], supportedModes = supportedModes.asInstanceOf[js.Any])
    __obj.asInstanceOf[HdrVideoControl]
  }
  
  extension [Self <: HdrVideoControl](x: Self) {
    
    inline def setMode(value: HdrVideoMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    
    inline def setSupportedModes(value: IVectorView[HdrVideoMode]): Self = StObject.set(x, "supportedModes", value.asInstanceOf[js.Any])
  }
}
