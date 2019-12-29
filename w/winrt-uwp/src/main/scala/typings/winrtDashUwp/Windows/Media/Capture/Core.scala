package typings.winrtDashUwp.Windows.Media.Capture

import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.photocaptured
import typings.winrtDashUwp.winrtDashUwpStrings.stopped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides classes for the capture of variable photo sequences. */
@JSGlobal("Windows.Media.Capture.Core")
@js.native
object Core extends js.Object {
  /** Provides data for the PhotoCaptured event. */
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
  
  /** Provides methods and events that enable the capture of variable photo sequences. */
  @js.native
  abstract class VariablePhotoSequenceCapture () extends js.Object {
    /** Occurs when a frame of a variable photo sequence is captured. */
    @JSName("onphotocaptured")
    var onphotocaptured_Original: TypedEventHandler[VariablePhotoSequenceCapture, VariablePhotoCapturedEventArgs] = js.native
    /** Occurs when the VariablePhotoSequenceCapture object stops capturing frames for a variable photo sequence. */
    @JSName("onstopped")
    var onstopped_Original: TypedEventHandler[VariablePhotoSequenceCapture, _] = js.native
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_photocaptured(
      `type`: photocaptured,
      listener: TypedEventHandler[VariablePhotoSequenceCapture, VariablePhotoCapturedEventArgs]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stopped(`type`: stopped, listener: TypedEventHandler[VariablePhotoSequenceCapture, _]): Unit = js.native
    /**
      * Asynchronously releases the VariablePhotoSequenceCapture object and resources used by the capture operation.
      * @return An asynchronous action.
      */
    def finishAsync(): IPromiseWithIAsyncAction = js.native
    /** Occurs when a frame of a variable photo sequence is captured. */
    def onphotocaptured(ev: VariablePhotoCapturedEventArgs with WinRTEvent[VariablePhotoSequenceCapture]): Unit = js.native
    /** Occurs when the VariablePhotoSequenceCapture object stops capturing frames for a variable photo sequence. */
    def onstopped(ev: js.Any with WinRTEvent[VariablePhotoSequenceCapture]): Unit = js.native
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_photocaptured(
      `type`: photocaptured,
      listener: TypedEventHandler[VariablePhotoSequenceCapture, VariablePhotoCapturedEventArgs]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stopped(`type`: stopped, listener: TypedEventHandler[VariablePhotoSequenceCapture, _]): Unit = js.native
    /**
      * Starts the capturing of variable photo sequence frames.
      * @return An asynchronous action.
      */
    def startAsync(): IPromiseWithIAsyncAction = js.native
    /**
      * Stops the capturing of variable photo sequence frames.
      * @return An asynchronous action.
      */
    def stopAsync(): IPromiseWithIAsyncAction = js.native
    /**
      * Updates the frame control values of the variable photo sequence.
      * @return An asynchronous action.
      */
    def updateSettingsAsync(): IPromiseWithIAsyncAction = js.native
  }
  
}

