package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the settings for a variable photo sequence. */
@JSGlobal("Windows.Media.Devices.Core.VariablePhotoSequenceController")
@js.native
abstract class VariablePhotoSequenceController () extends js.Object {
  /** Gets the list of FrameController objects that determine the settings for each frame in a variable photo sequence. */
  var desiredFrameControllers: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[FrameController] = js.native
  /** Gets a FrameControlCapabilities object that provides information about the variable photo sequence capabilities of the capture device. */
  var frameCapabilities: FrameControlCapabilities = js.native
  /** Gets the maximum number of photos that can be taken per second in a variable photo sequence. */
  var maxPhotosPerSecond: scala.Double = js.native
  /** Gets or sets the number of photos that are taken per second in a variable photo sequence. */
  var photosPerSecondLimit: scala.Double = js.native
  /** Gets a value that indicates whether variable photo sequences are supported by the capture device. */
  var supported: scala.Boolean = js.native
  /**
                       * Gets the current frame rate at which pictures can be taken in a variable photo sequence.
                       * @return The current frame rate at which pictures can be taken in a variable photo sequence.
                       */
  def getCurrentFrameRate(): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaRatio = js.native
  /**
                       * Gets the highest frame rate supported when video and a variable photo sequence are being captured concurrently.
                       * @param captureProperties The media encoding properties.
                       * @return The highest supported concurrent frame rate.
                       */
  def getHighestConcurrentFrameRate(captureProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaRatio = js.native
}

