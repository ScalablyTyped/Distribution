package typings.winrt.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraCaptureUIVideoCaptureSettings
  extends StObject
     with ICameraCaptureUIVideoCaptureSettings
object CameraCaptureUIVideoCaptureSettings {
  
  @scala.inline
  def apply(
    allowTrimming: Boolean,
    format: CameraCaptureUIVideoFormat,
    maxDurationInSeconds: Double,
    maxResolution: CameraCaptureUIMaxVideoResolution
  ): CameraCaptureUIVideoCaptureSettings = {
    val __obj = js.Dynamic.literal(allowTrimming = allowTrimming.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], maxDurationInSeconds = maxDurationInSeconds.asInstanceOf[js.Any], maxResolution = maxResolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraCaptureUIVideoCaptureSettings]
  }
}
