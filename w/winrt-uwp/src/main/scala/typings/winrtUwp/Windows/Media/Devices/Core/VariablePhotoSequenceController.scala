package typings.winrtUwp.Windows.Media.Devices.Core

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Media.MediaProperties.IMediaEncodingProperties
import typings.winrtUwp.Windows.Media.MediaProperties.MediaRatio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the settings for a variable photo sequence. */
trait VariablePhotoSequenceController extends StObject {
  
  /** Gets the list of FrameController objects that determine the settings for each frame in a variable photo sequence. */
  var desiredFrameControllers: IVector[FrameController]
  
  /** Gets a FrameControlCapabilities object that provides information about the variable photo sequence capabilities of the capture device. */
  var frameCapabilities: FrameControlCapabilities
  
  /**
    * Gets the current frame rate at which pictures can be taken in a variable photo sequence.
    * @return The current frame rate at which pictures can be taken in a variable photo sequence.
    */
  def getCurrentFrameRate(): MediaRatio
  
  /**
    * Gets the highest frame rate supported when video and a variable photo sequence are being captured concurrently.
    * @param captureProperties The media encoding properties.
    * @return The highest supported concurrent frame rate.
    */
  def getHighestConcurrentFrameRate(captureProperties: IMediaEncodingProperties): MediaRatio
  
  /** Gets the maximum number of photos that can be taken per second in a variable photo sequence. */
  var maxPhotosPerSecond: Double
  
  /** Gets or sets the number of photos that are taken per second in a variable photo sequence. */
  var photosPerSecondLimit: Double
  
  /** Gets a value that indicates whether variable photo sequences are supported by the capture device. */
  var supported: Boolean
}
object VariablePhotoSequenceController {
  
  inline def apply(
    desiredFrameControllers: IVector[FrameController],
    frameCapabilities: FrameControlCapabilities,
    getCurrentFrameRate: () => MediaRatio,
    getHighestConcurrentFrameRate: IMediaEncodingProperties => MediaRatio,
    maxPhotosPerSecond: Double,
    photosPerSecondLimit: Double,
    supported: Boolean
  ): VariablePhotoSequenceController = {
    val __obj = js.Dynamic.literal(desiredFrameControllers = desiredFrameControllers.asInstanceOf[js.Any], frameCapabilities = frameCapabilities.asInstanceOf[js.Any], getCurrentFrameRate = js.Any.fromFunction0(getCurrentFrameRate), getHighestConcurrentFrameRate = js.Any.fromFunction1(getHighestConcurrentFrameRate), maxPhotosPerSecond = maxPhotosPerSecond.asInstanceOf[js.Any], photosPerSecondLimit = photosPerSecondLimit.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariablePhotoSequenceController]
  }
  
  extension [Self <: VariablePhotoSequenceController](x: Self) {
    
    inline def setDesiredFrameControllers(value: IVector[FrameController]): Self = StObject.set(x, "desiredFrameControllers", value.asInstanceOf[js.Any])
    
    inline def setFrameCapabilities(value: FrameControlCapabilities): Self = StObject.set(x, "frameCapabilities", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentFrameRate(value: () => MediaRatio): Self = StObject.set(x, "getCurrentFrameRate", js.Any.fromFunction0(value))
    
    inline def setGetHighestConcurrentFrameRate(value: IMediaEncodingProperties => MediaRatio): Self = StObject.set(x, "getHighestConcurrentFrameRate", js.Any.fromFunction1(value))
    
    inline def setMaxPhotosPerSecond(value: Double): Self = StObject.set(x, "maxPhotosPerSecond", value.asInstanceOf[js.Any])
    
    inline def setPhotosPerSecondLimit(value: Double): Self = StObject.set(x, "photosPerSecondLimit", value.asInstanceOf[js.Any])
    
    inline def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
  }
}
