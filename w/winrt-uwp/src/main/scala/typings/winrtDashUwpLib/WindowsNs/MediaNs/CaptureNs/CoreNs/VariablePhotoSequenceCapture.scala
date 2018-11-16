package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods and events that enable the capture of variable photo sequences. */
@JSGlobal("Windows.Media.Capture.Core.VariablePhotoSequenceCapture")
@js.native
abstract class VariablePhotoSequenceCapture () extends js.Object {
  /** Occurs when a frame of a variable photo sequence is captured. */
  @JSName("onphotocaptured")
  var onphotocaptured_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[VariablePhotoSequenceCapture, VariablePhotoCapturedEventArgs] = js.native
  /** Occurs when the VariablePhotoSequenceCapture object stops capturing frames for a variable photo sequence. */
  @JSName("onstopped")
  var onstopped_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[VariablePhotoSequenceCapture, _] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_photocaptured(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.photocaptured,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[VariablePhotoSequenceCapture, VariablePhotoCapturedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stopped(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stopped,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[VariablePhotoSequenceCapture, _]
  ): scala.Unit = js.native
  /**
                       * Asynchronously releases the VariablePhotoSequenceCapture object and resources used by the capture operation.
                       * @return An asynchronous action.
                       */
  def finishAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /** Occurs when a frame of a variable photo sequence is captured. */
  def onphotocaptured(
    ev: VariablePhotoCapturedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[VariablePhotoSequenceCapture]
  ): scala.Unit = js.native
  /** Occurs when the VariablePhotoSequenceCapture object stops capturing frames for a variable photo sequence. */
  def onstopped(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[VariablePhotoSequenceCapture]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_photocaptured(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.photocaptured,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[VariablePhotoSequenceCapture, VariablePhotoCapturedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stopped(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stopped,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[VariablePhotoSequenceCapture, _]
  ): scala.Unit = js.native
  /**
                       * Starts the capturing of variable photo sequence frames.
                       * @return An asynchronous action.
                       */
  def startAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                       * Stops the capturing of variable photo sequence frames.
                       * @return An asynchronous action.
                       */
  def stopAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                       * Updates the frame control values of the variable photo sequence.
                       * @return An asynchronous action.
                       */
  def updateSettingsAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

