package typings.winrtUwp.Windows.Media.Devices.Core

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Media.MediaProperties.IMediaEncodingProperties
import typings.winrtUwp.Windows.Media.MediaProperties.MediaRatio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the settings for a variable photo sequence. */
@js.native
trait VariablePhotoSequenceController extends js.Object {
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

object VariablePhotoSequenceController {
  @scala.inline
  def apply(
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
  @scala.inline
  implicit class VariablePhotoSequenceControllerOps[Self <: VariablePhotoSequenceController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDesiredFrameControllers(value: IVector[FrameController]): Self = this.set("desiredFrameControllers", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameCapabilities(value: FrameControlCapabilities): Self = this.set("frameCapabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCurrentFrameRate(value: () => MediaRatio): Self = this.set("getCurrentFrameRate", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHighestConcurrentFrameRate(value: IMediaEncodingProperties => MediaRatio): Self = this.set("getHighestConcurrentFrameRate", js.Any.fromFunction1(value))
    @scala.inline
    def setMaxPhotosPerSecond(value: Double): Self = this.set("maxPhotosPerSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhotosPerSecondLimit(value: Double): Self = this.set("photosPerSecondLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupported(value: Boolean): Self = this.set("supported", value.asInstanceOf[js.Any])
  }
  
}

