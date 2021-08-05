package typings.winrt.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICameraCaptureUIVideoCaptureSettings extends StObject {
  
  var allowTrimming: Boolean
  
  var format: CameraCaptureUIVideoFormat
  
  var maxDurationInSeconds: Double
  
  var maxResolution: CameraCaptureUIMaxVideoResolution
}
object ICameraCaptureUIVideoCaptureSettings {
  
  inline def apply(
    allowTrimming: Boolean,
    format: CameraCaptureUIVideoFormat,
    maxDurationInSeconds: Double,
    maxResolution: CameraCaptureUIMaxVideoResolution
  ): ICameraCaptureUIVideoCaptureSettings = {
    val __obj = js.Dynamic.literal(allowTrimming = allowTrimming.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], maxDurationInSeconds = maxDurationInSeconds.asInstanceOf[js.Any], maxResolution = maxResolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICameraCaptureUIVideoCaptureSettings]
  }
  
  extension [Self <: ICameraCaptureUIVideoCaptureSettings](x: Self) {
    
    inline def setAllowTrimming(value: Boolean): Self = StObject.set(x, "allowTrimming", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: CameraCaptureUIVideoFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setMaxDurationInSeconds(value: Double): Self = StObject.set(x, "maxDurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxResolution(value: CameraCaptureUIMaxVideoResolution): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
  }
}
