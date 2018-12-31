package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods for taking a rapid sequence of low shutter lag photos. */
@JSGlobal("Windows.Media.Capture.LowLagPhotoSequenceCapture")
@js.native
abstract class LowLagPhotoSequenceCapture () extends js.Object {
  /** Occurs when a photo has been captured. */
  @JSName("onphotocaptured")
  var onphotocaptured_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LowLagPhotoSequenceCapture, PhotoCapturedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_photocaptured(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.photocaptured,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LowLagPhotoSequenceCapture, PhotoCapturedEventArgs]
  ): scala.Unit = js.native
  /**
    * Asynchronously releases the LowLagPhotoSequenceCapture object and resources used by the photo sequence capture operation.
    * @return Object that is used to control the asynchronous operation.
    */
  def finishAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /** Occurs when a photo has been captured. */
  def onphotocaptured(ev: PhotoCapturedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[LowLagPhotoSequenceCapture]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_photocaptured(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.photocaptured,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LowLagPhotoSequenceCapture, PhotoCapturedEventArgs]
  ): scala.Unit = js.native
  /**
    * Asynchronously starts capturing photos.
    * @return Object that is used to control the asynchronous operation.
    */
  def startAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously stops capturing photos.
    * @return Object that is used to control the asynchronous operation.
    */
  def stopAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

