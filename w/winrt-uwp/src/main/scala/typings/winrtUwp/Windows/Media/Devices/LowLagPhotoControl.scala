package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Media.MediaProperties.IMediaEncodingProperties
import typings.winrtUwp.Windows.Media.MediaProperties.MediaRatio
import typings.winrtUwp.Windows.Media.MediaProperties.MediaThumbnailFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for managing the low shutter lag photo capture mode on the capture device. */
@js.native
trait LowLagPhotoControl extends StObject {
  
  /** Gets or sets the desired size for thumbnails, which is the largest length of the image, either width or height. */
  var desiredThumbnailSize: Double = js.native
  
  /**
    * Gets the current frame rate at which pictures can be taken.
    * @return The current frame rate.
    */
  def getCurrentFrameRate(): MediaRatio = js.native
  
  /**
    * Gets the highest frame rate supported when video and photos are being captured concurrently.
    * @param captureProperties The media encoding properties.
    * @return The highest concurrent frames per second.
    */
  def getHighestConcurrentFrameRate(captureProperties: IMediaEncodingProperties): MediaRatio = js.native
  
  /** Gets a value that specifies if hardware acceleration is supported for thumbnails. */
  var hardwareAcceleratedThumbnailSupported: Double = js.native
  
  /** Gets a value that enables and disables thumbnail support. */
  var thumbnailEnabled: Boolean = js.native
  
  /** Gets or sets the media format for the thumbnails. */
  var thumbnailFormat: MediaThumbnailFormat = js.native
}
object LowLagPhotoControl {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class LowLagPhotoControlMutableBuilder[Self <: LowLagPhotoControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesiredThumbnailSize(value: Double): Self = StObject.set(x, "desiredThumbnailSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCurrentFrameRate(value: () => MediaRatio): Self = StObject.set(x, "getCurrentFrameRate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHighestConcurrentFrameRate(value: IMediaEncodingProperties => MediaRatio): Self = StObject.set(x, "getHighestConcurrentFrameRate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHardwareAcceleratedThumbnailSupported(value: Double): Self = StObject.set(x, "hardwareAcceleratedThumbnailSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailEnabled(value: Boolean): Self = StObject.set(x, "thumbnailEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailFormat(value: MediaThumbnailFormat): Self = StObject.set(x, "thumbnailFormat", value.asInstanceOf[js.Any])
  }
}
