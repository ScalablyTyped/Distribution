package typings.winrtUwp.Windows.Devices.Scanners

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the scan resolution. */
@js.native
trait ImageScannerResolution extends StObject {
  
  /** The horizontal size. */
  var dpiX: Double = js.native
  
  /** The vertical size. */
  var dpiY: Double = js.native
}
object ImageScannerResolution {
  
  @scala.inline
  def apply(dpiX: Double, dpiY: Double): ImageScannerResolution = {
    val __obj = js.Dynamic.literal(dpiX = dpiX.asInstanceOf[js.Any], dpiY = dpiY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageScannerResolution]
  }
  
  @scala.inline
  implicit class ImageScannerResolutionMutableBuilder[Self <: ImageScannerResolution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDpiX(value: Double): Self = StObject.set(x, "dpiX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpiY(value: Double): Self = StObject.set(x, "dpiY", value.asInstanceOf[js.Any])
  }
}
