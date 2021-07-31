package typings.winrtUwp.global.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes for the capture of variable photo sequences. */
object Core {
  
  /** Provides data for the PhotoCaptured event. */
  @JSGlobal("Windows.Media.Capture.Core.VariablePhotoCapturedEventArgs")
  @js.native
  abstract class VariablePhotoCapturedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Capture.Core.VariablePhotoCapturedEventArgs {
    
    /** Gets the time offset of the capture of the associated frame in a variable photo sequence. */
    /* CompleteClass */
    var captureTimeOffset: Double = js.native
    
    /** Gets a CapturedFrameControlValues object that indicates the capture settings used for the associated frame in a variable photo sequence. */
    /* CompleteClass */
    var capturedFrameControlValues: typings.winrtUwp.Windows.Media.Capture.CapturedFrameControlValues = js.native
    
    /** Gets a CapturedFrame object representing a captured frame of a variable photo sequence. */
    /* CompleteClass */
    var frame: typings.winrtUwp.Windows.Media.Capture.CapturedFrame = js.native
    
    /** Gets an index value that indicates which element of the DesiredFrameControllers vector was used to specify the requested control values for the associated frame of a variable photo sequence. */
    /* CompleteClass */
    var usedFrameControllerIndex: Double = js.native
  }
  
  /** Provides methods and events that enable the capture of variable photo sequences. */
  @JSGlobal("Windows.Media.Capture.Core.VariablePhotoSequenceCapture")
  @js.native
  abstract class VariablePhotoSequenceCapture ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Capture.Core.VariablePhotoSequenceCapture
}
