package typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.CoreNs

import typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.CapturedFrame
import typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.CapturedFrameControlValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the PhotoCaptured event. */
@JSGlobal("Windows.Media.Capture.Core.VariablePhotoCapturedEventArgs")
@js.native
abstract class VariablePhotoCapturedEventArgs () extends js.Object {
  /** Gets the time offset of the capture of the associated frame in a variable photo sequence. */
  var captureTimeOffset: Double = js.native
  /** Gets a CapturedFrameControlValues object that indicates the capture settings used for the associated frame in a variable photo sequence. */
  var capturedFrameControlValues: CapturedFrameControlValues = js.native
  /** Gets a CapturedFrame object representing a captured frame of a variable photo sequence. */
  var frame: CapturedFrame = js.native
  /** Gets an index value that indicates which element of the DesiredFrameControllers vector was used to specify the requested control values for the associated frame of a variable photo sequence. */
  var usedFrameControllerIndex: Double = js.native
}

