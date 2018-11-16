package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the PhotoCaptured event. */
@JSGlobal("Windows.Media.Capture.Core.VariablePhotoCapturedEventArgs")
@js.native
abstract class VariablePhotoCapturedEventArgs () extends js.Object {
  /** Gets the time offset of the capture of the associated frame in a variable photo sequence. */
  var captureTimeOffset: scala.Double = js.native
  /** Gets a CapturedFrameControlValues object that indicates the capture settings used for the associated frame in a variable photo sequence. */
  var capturedFrameControlValues: winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CapturedFrameControlValues = js.native
  /** Gets a CapturedFrame object representing a captured frame of a variable photo sequence. */
  var frame: winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CapturedFrame = js.native
  /** Gets an index value that indicates which element of the DesiredFrameControllers vector was used to specify the requested control values for the associated frame of a variable photo sequence. */
  var usedFrameControllerIndex: scala.Double = js.native
}

