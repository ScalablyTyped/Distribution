package typings.winrtDashUwp.Windows.Media.Capture

import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.allphotoscaptured
import typings.winrtDashUwp.winrtDashUwpStrings.optionalreferencephotocaptured
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods for capturing photos using system-provided computational photography techniques. */
@JSGlobal("Windows.Media.Capture.AdvancedPhotoCapture")
@js.native
abstract class AdvancedPhotoCapture () extends js.Object {
  /** Occurs when all of the frames required for the advanced photo capture have been captured. */
  @JSName("onallphotoscaptured")
  var onallphotoscaptured_Original: TypedEventHandler[AdvancedPhotoCapture, _] = js.native
  /** Raised when a reference photo for the advanced photo operation has been captured, on devices that support this feature. */
  @JSName("onoptionalreferencephotocaptured")
  var onoptionalreferencephotocaptured_Original: TypedEventHandler[AdvancedPhotoCapture, OptionalReferencePhotoCapturedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_allphotoscaptured(`type`: allphotoscaptured, listener: TypedEventHandler[AdvancedPhotoCapture, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionalreferencephotocaptured(
    `type`: optionalreferencephotocaptured,
    listener: TypedEventHandler[AdvancedPhotoCapture, OptionalReferencePhotoCapturedEventArgs]
  ): Unit = js.native
  /**
    * Asynchronously performs an advanced photo capture.
    * @return An asynchronous operation that returns an AdvancedCapturedPhoto upon successful completion.
    */
  def captureAsync(): IPromiseWithIAsyncOperation[AdvancedCapturedPhoto] = js.native
  /**
    * Asynchronously performs an advanced photo capture passing the provided app-defined context object to the result of the operation.
    * @param context An app-defined context object that passes context information to the result of the operation.
    * @return An asynchronous operation that returns an AdvancedCapturedPhoto upon successful completion.
    */
  def captureAsync(context: js.Any): IPromiseWithIAsyncOperation[AdvancedCapturedPhoto] = js.native
  /**
    * Asynchronously releases the AdvancedPhotoCapture object and resources used by the advanced photo capture operation.
    * @return An asynchronous action.
    */
  def finishAsync(): IPromiseWithIAsyncAction = js.native
  /** Occurs when all of the frames required for the advanced photo capture have been captured. */
  def onallphotoscaptured(ev: js.Any with WinRTEvent[AdvancedPhotoCapture]): Unit = js.native
  /** Raised when a reference photo for the advanced photo operation has been captured, on devices that support this feature. */
  def onoptionalreferencephotocaptured(ev: OptionalReferencePhotoCapturedEventArgs with WinRTEvent[AdvancedPhotoCapture]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_allphotoscaptured(`type`: allphotoscaptured, listener: TypedEventHandler[AdvancedPhotoCapture, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_optionalreferencephotocaptured(
    `type`: optionalreferencephotocaptured,
    listener: TypedEventHandler[AdvancedPhotoCapture, OptionalReferencePhotoCapturedEventArgs]
  ): Unit = js.native
}

