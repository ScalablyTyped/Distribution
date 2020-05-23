package typings.winrtUwp.Windows.Media.Capture.Core

import typings.winrtUwp.Windows.Media.Capture.CapturedFrame
import typings.winrtUwp.Windows.Media.Capture.CapturedFrameControlValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the PhotoCaptured event. */
trait VariablePhotoCapturedEventArgs extends js.Object {
  /** Gets the time offset of the capture of the associated frame in a variable photo sequence. */
  var captureTimeOffset: Double
  /** Gets a CapturedFrameControlValues object that indicates the capture settings used for the associated frame in a variable photo sequence. */
  var capturedFrameControlValues: CapturedFrameControlValues
  /** Gets a CapturedFrame object representing a captured frame of a variable photo sequence. */
  var frame: CapturedFrame
  /** Gets an index value that indicates which element of the DesiredFrameControllers vector was used to specify the requested control values for the associated frame of a variable photo sequence. */
  var usedFrameControllerIndex: Double
}

object VariablePhotoCapturedEventArgs {
  @scala.inline
  def apply(
    captureTimeOffset: Double,
    capturedFrameControlValues: CapturedFrameControlValues,
    frame: CapturedFrame,
    usedFrameControllerIndex: Double
  ): VariablePhotoCapturedEventArgs = {
    val __obj = js.Dynamic.literal(captureTimeOffset = captureTimeOffset.asInstanceOf[js.Any], capturedFrameControlValues = capturedFrameControlValues.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], usedFrameControllerIndex = usedFrameControllerIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariablePhotoCapturedEventArgs]
  }
}

