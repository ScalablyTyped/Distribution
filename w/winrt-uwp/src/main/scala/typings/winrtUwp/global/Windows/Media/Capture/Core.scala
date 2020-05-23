package typings.winrtUwp.global.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides classes for the capture of variable photo sequences. */
@JSGlobal("Windows.Media.Capture.Core")
@js.native
object Core extends js.Object {
  /** Provides data for the PhotoCaptured event. */
  @js.native
  abstract class VariablePhotoCapturedEventArgs ()
    extends typings.winrtUwp.Windows.Media.Capture.Core.VariablePhotoCapturedEventArgs {
    /** Gets the time offset of the capture of the associated frame in a variable photo sequence. */
    /* CompleteClass */
    override var captureTimeOffset: Double = js.native
    /** Gets a CapturedFrameControlValues object that indicates the capture settings used for the associated frame in a variable photo sequence. */
    /* CompleteClass */
    override var capturedFrameControlValues: typings.winrtUwp.Windows.Media.Capture.CapturedFrameControlValues = js.native
    /** Gets a CapturedFrame object representing a captured frame of a variable photo sequence. */
    /* CompleteClass */
    override var frame: typings.winrtUwp.Windows.Media.Capture.CapturedFrame = js.native
    /** Gets an index value that indicates which element of the DesiredFrameControllers vector was used to specify the requested control values for the associated frame of a variable photo sequence. */
    /* CompleteClass */
    override var usedFrameControllerIndex: Double = js.native
  }
  
  /** Provides methods and events that enable the capture of variable photo sequences. */
  @js.native
  abstract class VariablePhotoSequenceCapture ()
    extends typings.winrtUwp.Windows.Media.Capture.Core.VariablePhotoSequenceCapture
  
}

