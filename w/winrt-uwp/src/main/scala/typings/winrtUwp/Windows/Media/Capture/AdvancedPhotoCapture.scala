package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.allphotoscaptured
import typings.winrtUwp.winrtUwpStrings.optionalreferencephotocaptured
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods for capturing photos using system-provided computational photography techniques. */
@js.native
trait AdvancedPhotoCapture extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_allphotoscaptured(`type`: allphotoscaptured, listener: TypedEventHandler[AdvancedPhotoCapture, Any]): Unit = js.native
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
  def captureAsync(context: Any): IPromiseWithIAsyncOperation[AdvancedCapturedPhoto] = js.native
  
  /**
    * Asynchronously releases the AdvancedPhotoCapture object and resources used by the advanced photo capture operation.
    * @return An asynchronous action.
    */
  def finishAsync(): IPromiseWithIAsyncAction = js.native
  
  /** Occurs when all of the frames required for the advanced photo capture have been captured. */
  def onallphotoscaptured(ev: Any & WinRTEvent[AdvancedPhotoCapture]): Unit = js.native
  /** Occurs when all of the frames required for the advanced photo capture have been captured. */
  @JSName("onallphotoscaptured")
  var onallphotoscaptured_Original: TypedEventHandler[AdvancedPhotoCapture, Any] = js.native
  
  /** Raised when a reference photo for the advanced photo operation has been captured, on devices that support this feature. */
  def onoptionalreferencephotocaptured(ev: OptionalReferencePhotoCapturedEventArgs & WinRTEvent[AdvancedPhotoCapture]): Unit = js.native
  /** Raised when a reference photo for the advanced photo operation has been captured, on devices that support this feature. */
  @JSName("onoptionalreferencephotocaptured")
  var onoptionalreferencephotocaptured_Original: TypedEventHandler[AdvancedPhotoCapture, OptionalReferencePhotoCapturedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_allphotoscaptured(`type`: allphotoscaptured, listener: TypedEventHandler[AdvancedPhotoCapture, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_optionalreferencephotocaptured(
    `type`: optionalreferencephotocaptured,
    listener: TypedEventHandler[AdvancedPhotoCapture, OptionalReferencePhotoCapturedEventArgs]
  ): Unit = js.native
}
