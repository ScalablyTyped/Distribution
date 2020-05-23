package typings.winrtUwp.global.Windows.Media.Devices

import typings.winrtUwp.Windows.Media.MediaProperties.IMediaEncodingProperties
import typings.winrtUwp.Windows.Media.MediaProperties.MediaRatio
import typings.winrtUwp.Windows.Media.MediaProperties.MediaThumbnailFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for managing the low shutter lag photo sequence mode on the capture device. */
@JSGlobal("Windows.Media.Devices.LowLagPhotoSequenceControl")
@js.native
abstract class LowLagPhotoSequenceControl ()
  extends typings.winrtUwp.Windows.Media.Devices.LowLagPhotoSequenceControl {
  /** Gets or sets the desired size for thumbnails, which is the largest length of the image, either width or height. */
  /* CompleteClass */
  override var desiredThumbnailSize: Double = js.native
  /** Gets a value that specifies if hardware acceleration is supported for thumbnails in photo sequence mode. */
  /* CompleteClass */
  override var hardwareAcceleratedThumbnailSupported: Double = js.native
  /** Gets the maximum number of past photos that can be stored. */
  /* CompleteClass */
  override var maxPastPhotos: Double = js.native
  /** Gets the maximum number of photos that can be taken per second. */
  /* CompleteClass */
  override var maxPhotosPerSecond: Double = js.native
  /** Gets or sets a value that specifies the number of past photos to store. */
  /* CompleteClass */
  override var pastPhotoLimit: Double = js.native
  /** Gets or sets the number of photos that are taken per second. */
  /* CompleteClass */
  override var photosPerSecondLimit: Double = js.native
  /** Gets a value that specifies if the capture device supports low shutter lag photo sequence mode. */
  /* CompleteClass */
  override var supported: Boolean = js.native
  /** Gets a value that enables and disables thumbnail support in photo sequence mode. */
  /* CompleteClass */
  override var thumbnailEnabled: Boolean = js.native
  /** Gets or sets the media format for the thumbnails. */
  /* CompleteClass */
  override var thumbnailFormat: MediaThumbnailFormat = js.native
  /**
    * Gets the current frame rate at which pictures can be taken.
    * @return The current frame rate.
    */
  /* CompleteClass */
  override def getCurrentFrameRate(): MediaRatio = js.native
  /**
    * Gets the highest frame rate supported when video and photos sequences are being captured concurrently.
    * @param captureProperties The media encoding properties.
    * @return The highest concurrent frames per second.
    */
  /* CompleteClass */
  override def getHighestConcurrentFrameRate(captureProperties: IMediaEncodingProperties): MediaRatio = js.native
}

