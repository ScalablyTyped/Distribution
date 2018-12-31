package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for managing the low shutter lag photo sequence mode on the capture device. */
@JSGlobal("Windows.Media.Devices.LowLagPhotoSequenceControl")
@js.native
abstract class LowLagPhotoSequenceControl () extends js.Object {
  /** Gets or sets the desired size for thumbnails, which is the largest length of the image, either width or height. */
  var desiredThumbnailSize: scala.Double = js.native
  /** Gets a value that specifies if hardware acceleration is supported for thumbnails in photo sequence mode. */
  var hardwareAcceleratedThumbnailSupported: scala.Double = js.native
  /** Gets the maximum number of past photos that can be stored. */
  var maxPastPhotos: scala.Double = js.native
  /** Gets the maximum number of photos that can be taken per second. */
  var maxPhotosPerSecond: scala.Double = js.native
  /** Gets or sets a value that specifies the number of past photos to store. */
  var pastPhotoLimit: scala.Double = js.native
  /** Gets or sets the number of photos that are taken per second. */
  var photosPerSecondLimit: scala.Double = js.native
  /** Gets a value that specifies if the capture device supports low shutter lag photo sequence mode. */
  var supported: scala.Boolean = js.native
  /** Gets a value that enables and disables thumbnail support in photo sequence mode. */
  var thumbnailEnabled: scala.Boolean = js.native
  /** Gets or sets the media format for the thumbnails. */
  var thumbnailFormat: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaThumbnailFormat = js.native
  /**
    * Gets the current frame rate at which pictures can be taken.
    * @return The current frame rate.
    */
  def getCurrentFrameRate(): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaRatio = js.native
  /**
    * Gets the highest frame rate supported when video and photos sequences are being captured concurrently.
    * @param captureProperties The media encoding properties.
    * @return The highest concurrent frames per second.
    */
  def getHighestConcurrentFrameRate(captureProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaRatio = js.native
}

