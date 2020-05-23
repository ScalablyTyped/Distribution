package typings.winrtUwp.global.Windows.Media.Devices

import typings.winrtUwp.Windows.Media.MediaProperties.IMediaEncodingProperties
import typings.winrtUwp.Windows.Media.MediaProperties.MediaRatio
import typings.winrtUwp.Windows.Media.MediaProperties.MediaThumbnailFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for managing the low shutter lag photo capture mode on the capture device. */
@JSGlobal("Windows.Media.Devices.LowLagPhotoControl")
@js.native
abstract class LowLagPhotoControl ()
  extends typings.winrtUwp.Windows.Media.Devices.LowLagPhotoControl {
  /** Gets or sets the desired size for thumbnails, which is the largest length of the image, either width or height. */
  /* CompleteClass */
  override var desiredThumbnailSize: Double = js.native
  /** Gets a value that specifies if hardware acceleration is supported for thumbnails. */
  /* CompleteClass */
  override var hardwareAcceleratedThumbnailSupported: Double = js.native
  /** Gets a value that enables and disables thumbnail support. */
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
    * Gets the highest frame rate supported when video and photos are being captured concurrently.
    * @param captureProperties The media encoding properties.
    * @return The highest concurrent frames per second.
    */
  /* CompleteClass */
  override def getHighestConcurrentFrameRate(captureProperties: IMediaEncodingProperties): MediaRatio = js.native
}

