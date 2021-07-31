package typings.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides settings for capturing videos. The settings include format, maximum resolution, maximum duration, and whether or not to allow trimming. */
trait CameraCaptureUIVideoCaptureSettings extends StObject {
  
  /** Determines whether or not the video trimming user interface will be enabled. */
  var allowTrimming: Boolean
  
  /** Determines the format for storing captured videos. */
  var format: CameraCaptureUIVideoFormat
  
  /** Determines the maximum duration of a video. */
  var maxDurationInSeconds: Double
  
  /** Determines the maximum resolution that the user can select. */
  var maxResolution: CameraCaptureUIMaxVideoResolution
}
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
  
  @scala.inline
  implicit class CameraCaptureUIVideoCaptureSettingsMutableBuilder[Self <: CameraCaptureUIVideoCaptureSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowTrimming(value: Boolean): Self = StObject.set(x, "allowTrimming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: CameraCaptureUIVideoFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDurationInSeconds(value: Double): Self = StObject.set(x, "maxDurationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResolution(value: CameraCaptureUIMaxVideoResolution): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
  }
}
