package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods for capturing photos using system-provided computational photography techniques. */
@JSGlobal("Windows.Media.Capture.AdvancedPhotoCapture")
@js.native
abstract class AdvancedPhotoCapture () extends js.Object {
  /** Occurs when all of the frames required for the advanced photo capture have been captured. */
  @JSName("onallphotoscaptured")
  var onallphotoscaptured_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AdvancedPhotoCapture, _] = js.native
  /** Raised when a reference photo for the advanced photo operation has been captured, on devices that support this feature. */
  @JSName("onoptionalreferencephotocaptured")
  var onoptionalreferencephotocaptured_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AdvancedPhotoCapture, OptionalReferencePhotoCapturedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_allphotoscaptured(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.allphotoscaptured,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AdvancedPhotoCapture, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionalreferencephotocaptured(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.optionalreferencephotocaptured,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AdvancedPhotoCapture, OptionalReferencePhotoCapturedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Asynchronously performs an advanced photo capture.
                   * @return An asynchronous operation that returns an AdvancedCapturedPhoto upon successful completion.
                   */
  def captureAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[AdvancedCapturedPhoto] = js.native
  /**
                   * Asynchronously performs an advanced photo capture passing the provided app-defined context object to the result of the operation.
                   * @param context An app-defined context object that passes context information to the result of the operation.
                   * @return An asynchronous operation that returns an AdvancedCapturedPhoto upon successful completion.
                   */
  def captureAsync(context: js.Any): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[AdvancedCapturedPhoto] = js.native
  /**
                   * Asynchronously releases the AdvancedPhotoCapture object and resources used by the advanced photo capture operation.
                   * @return An asynchronous action.
                   */
  def finishAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /** Occurs when all of the frames required for the advanced photo capture have been captured. */
  def onallphotoscaptured(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[AdvancedPhotoCapture]): scala.Unit = js.native
  /** Raised when a reference photo for the advanced photo operation has been captured, on devices that support this feature. */
  def onoptionalreferencephotocaptured(
    ev: OptionalReferencePhotoCapturedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[AdvancedPhotoCapture]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_allphotoscaptured(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.allphotoscaptured,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AdvancedPhotoCapture, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_optionalreferencephotocaptured(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.optionalreferencephotocaptured,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AdvancedPhotoCapture, OptionalReferencePhotoCapturedEventArgs]
  ): scala.Unit = js.native
}

