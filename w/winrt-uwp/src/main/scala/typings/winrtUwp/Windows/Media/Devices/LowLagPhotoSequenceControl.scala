package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Media.MediaProperties.IMediaEncodingProperties
import typings.winrtUwp.Windows.Media.MediaProperties.MediaRatio
import typings.winrtUwp.Windows.Media.MediaProperties.MediaThumbnailFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for managing the low shutter lag photo sequence mode on the capture device. */
trait LowLagPhotoSequenceControl extends js.Object {
  /** Gets or sets the desired size for thumbnails, which is the largest length of the image, either width or height. */
  var desiredThumbnailSize: Double
  /** Gets a value that specifies if hardware acceleration is supported for thumbnails in photo sequence mode. */
  var hardwareAcceleratedThumbnailSupported: Double
  /** Gets the maximum number of past photos that can be stored. */
  var maxPastPhotos: Double
  /** Gets the maximum number of photos that can be taken per second. */
  var maxPhotosPerSecond: Double
  /** Gets or sets a value that specifies the number of past photos to store. */
  var pastPhotoLimit: Double
  /** Gets or sets the number of photos that are taken per second. */
  var photosPerSecondLimit: Double
  /** Gets a value that specifies if the capture device supports low shutter lag photo sequence mode. */
  var supported: Boolean
  /** Gets a value that enables and disables thumbnail support in photo sequence mode. */
  var thumbnailEnabled: Boolean
  /** Gets or sets the media format for the thumbnails. */
  var thumbnailFormat: MediaThumbnailFormat
  /**
    * Gets the current frame rate at which pictures can be taken.
    * @return The current frame rate.
    */
  def getCurrentFrameRate(): MediaRatio
  /**
    * Gets the highest frame rate supported when video and photos sequences are being captured concurrently.
    * @param captureProperties The media encoding properties.
    * @return The highest concurrent frames per second.
    */
  def getHighestConcurrentFrameRate(captureProperties: IMediaEncodingProperties): MediaRatio
}

object LowLagPhotoSequenceControl {
  @scala.inline
  def apply(
    desiredThumbnailSize: Double,
    getCurrentFrameRate: () => MediaRatio,
    getHighestConcurrentFrameRate: IMediaEncodingProperties => MediaRatio,
    hardwareAcceleratedThumbnailSupported: Double,
    maxPastPhotos: Double,
    maxPhotosPerSecond: Double,
    pastPhotoLimit: Double,
    photosPerSecondLimit: Double,
    supported: Boolean,
    thumbnailEnabled: Boolean,
    thumbnailFormat: MediaThumbnailFormat
  ): LowLagPhotoSequenceControl = {
    val __obj = js.Dynamic.literal(desiredThumbnailSize = desiredThumbnailSize.asInstanceOf[js.Any], getCurrentFrameRate = js.Any.fromFunction0(getCurrentFrameRate), getHighestConcurrentFrameRate = js.Any.fromFunction1(getHighestConcurrentFrameRate), hardwareAcceleratedThumbnailSupported = hardwareAcceleratedThumbnailSupported.asInstanceOf[js.Any], maxPastPhotos = maxPastPhotos.asInstanceOf[js.Any], maxPhotosPerSecond = maxPhotosPerSecond.asInstanceOf[js.Any], pastPhotoLimit = pastPhotoLimit.asInstanceOf[js.Any], photosPerSecondLimit = photosPerSecondLimit.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], thumbnailEnabled = thumbnailEnabled.asInstanceOf[js.Any], thumbnailFormat = thumbnailFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[LowLagPhotoSequenceControl]
  }
}

