package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods for taking a low shutter lag photo. */
trait LowLagPhotoCapture extends StObject {
  
  /**
    * Asynchronously captures a low shutter lag photo.
    * @return When this method completes, a CapturedPhoto object is returned which contains the captured photo.
    */
  def captureAsync(): IPromiseWithIAsyncOperation[CapturedPhoto]
  
  /**
    * Asynchronously releases the LowLagPhotoCapture object and resources used by the capture photo operation.
    * @return Object that is used to control the asynchronous operation.
    */
  def finishAsync(): IPromiseWithIAsyncAction
}
object LowLagPhotoCapture {
  
  inline def apply(
    captureAsync: () => IPromiseWithIAsyncOperation[CapturedPhoto],
    finishAsync: () => IPromiseWithIAsyncAction
  ): LowLagPhotoCapture = {
    val __obj = js.Dynamic.literal(captureAsync = js.Any.fromFunction0(captureAsync), finishAsync = js.Any.fromFunction0(finishAsync))
    __obj.asInstanceOf[LowLagPhotoCapture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LowLagPhotoCapture] (val x: Self) extends AnyVal {
    
    inline def setCaptureAsync(value: () => IPromiseWithIAsyncOperation[CapturedPhoto]): Self = StObject.set(x, "captureAsync", js.Any.fromFunction0(value))
    
    inline def setFinishAsync(value: () => IPromiseWithIAsyncAction): Self = StObject.set(x, "finishAsync", js.Any.fromFunction0(value))
  }
}
