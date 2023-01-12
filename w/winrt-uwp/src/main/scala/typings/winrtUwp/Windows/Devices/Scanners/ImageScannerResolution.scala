package typings.winrtUwp.Windows.Devices.Scanners

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the scan resolution. */
trait ImageScannerResolution extends StObject {
  
  /** The horizontal size. */
  var dpiX: Double
  
  /** The vertical size. */
  var dpiY: Double
}
object ImageScannerResolution {
  
  inline def apply(dpiX: Double, dpiY: Double): ImageScannerResolution = {
    val __obj = js.Dynamic.literal(dpiX = dpiX.asInstanceOf[js.Any], dpiY = dpiY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageScannerResolution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageScannerResolution] (val x: Self) extends AnyVal {
    
    inline def setDpiX(value: Double): Self = StObject.set(x, "dpiX", value.asInstanceOf[js.Any])
    
    inline def setDpiY(value: Double): Self = StObject.set(x, "dpiY", value.asInstanceOf[js.Any])
  }
}
