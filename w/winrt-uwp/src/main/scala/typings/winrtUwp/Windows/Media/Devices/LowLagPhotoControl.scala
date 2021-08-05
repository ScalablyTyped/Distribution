package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Media.MediaProperties.IMediaEncodingProperties
import typings.winrtUwp.Windows.Media.MediaProperties.MediaRatio
import typings.winrtUwp.Windows.Media.MediaProperties.MediaThumbnailFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for managing the low shutter lag photo capture mode on the capture device. */
trait LowLagPhotoControl extends StObject {
  
  /** Gets or sets the desired size for thumbnails, which is the largest length of the image, either width or height. */
  var desiredThumbnailSize: Double
  
  /**
    * Gets the current frame rate at which pictures can be taken.
    * @return The current frame rate.
    */
  def getCurrentFrameRate(): MediaRatio
  
  /**
    * Gets the highest frame rate supported when video and photos are being captured concurrently.
    * @param captureProperties The media encoding properties.
    * @return The highest concurrent frames per second.
    */
  def getHighestConcurrentFrameRate(captureProperties: IMediaEncodingProperties): MediaRatio
  
  /** Gets a value that specifies if hardware acceleration is supported for thumbnails. */
  var hardwareAcceleratedThumbnailSupported: Double
  
  /** Gets a value that enables and disables thumbnail support. */
  var thumbnailEnabled: Boolean
  
  /** Gets or sets the media format for the thumbnails. */
  var thumbnailFormat: MediaThumbnailFormat
}
object LowLagPhotoControl {
  
  inline def apply(
    desiredThumbnailSize: Double,
    getCurrentFrameRate: () => MediaRatio,
    getHighestConcurrentFrameRate: IMediaEncodingProperties => MediaRatio,
    hardwareAcceleratedThumbnailSupported: Double,
    thumbnailEnabled: Boolean,
    thumbnailFormat: MediaThumbnailFormat
  ): LowLagPhotoControl = {
    val __obj = js.Dynamic.literal(desiredThumbnailSize = desiredThumbnailSize.asInstanceOf[js.Any], getCurrentFrameRate = js.Any.fromFunction0(getCurrentFrameRate), getHighestConcurrentFrameRate = js.Any.fromFunction1(getHighestConcurrentFrameRate), hardwareAcceleratedThumbnailSupported = hardwareAcceleratedThumbnailSupported.asInstanceOf[js.Any], thumbnailEnabled = thumbnailEnabled.asInstanceOf[js.Any], thumbnailFormat = thumbnailFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[LowLagPhotoControl]
  }
  
  extension [Self <: LowLagPhotoControl](x: Self) {
    
    inline def setDesiredThumbnailSize(value: Double): Self = StObject.set(x, "desiredThumbnailSize", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentFrameRate(value: () => MediaRatio): Self = StObject.set(x, "getCurrentFrameRate", js.Any.fromFunction0(value))
    
    inline def setGetHighestConcurrentFrameRate(value: IMediaEncodingProperties => MediaRatio): Self = StObject.set(x, "getHighestConcurrentFrameRate", js.Any.fromFunction1(value))
    
    inline def setHardwareAcceleratedThumbnailSupported(value: Double): Self = StObject.set(x, "hardwareAcceleratedThumbnailSupported", value.asInstanceOf[js.Any])
    
    inline def setThumbnailEnabled(value: Boolean): Self = StObject.set(x, "thumbnailEnabled", value.asInstanceOf[js.Any])
    
    inline def setThumbnailFormat(value: MediaThumbnailFormat): Self = StObject.set(x, "thumbnailFormat", value.asInstanceOf[js.Any])
  }
}
