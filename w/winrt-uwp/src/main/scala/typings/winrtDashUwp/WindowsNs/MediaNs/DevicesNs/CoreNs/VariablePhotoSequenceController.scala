package typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CoreNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties
import typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs.MediaRatio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the settings for a variable photo sequence. */
@JSGlobal("Windows.Media.Devices.Core.VariablePhotoSequenceController")
@js.native
abstract class VariablePhotoSequenceController () extends js.Object {
  /** Gets the list of FrameController objects that determine the settings for each frame in a variable photo sequence. */
  var desiredFrameControllers: IVector[FrameController] = js.native
  /** Gets a FrameControlCapabilities object that provides information about the variable photo sequence capabilities of the capture device. */
  var frameCapabilities: FrameControlCapabilities = js.native
  /** Gets the maximum number of photos that can be taken per second in a variable photo sequence. */
  var maxPhotosPerSecond: Double = js.native
  /** Gets or sets the number of photos that are taken per second in a variable photo sequence. */
  var photosPerSecondLimit: Double = js.native
  /** Gets a value that indicates whether variable photo sequences are supported by the capture device. */
  var supported: Boolean = js.native
  /**
    * Gets the current frame rate at which pictures can be taken in a variable photo sequence.
    * @return The current frame rate at which pictures can be taken in a variable photo sequence.
    */
  def getCurrentFrameRate(): MediaRatio = js.native
  /**
    * Gets the highest frame rate supported when video and a variable photo sequence are being captured concurrently.
    * @param captureProperties The media encoding properties.
    * @return The highest supported concurrent frame rate.
    */
  def getHighestConcurrentFrameRate(captureProperties: IMediaEncodingProperties): MediaRatio = js.native
}

