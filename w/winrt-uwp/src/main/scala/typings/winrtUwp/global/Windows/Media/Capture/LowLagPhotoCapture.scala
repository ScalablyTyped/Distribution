package typings.winrtUwp.global.Windows.Media.Capture

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods for taking a low shutter lag photo. */
/* note: abstract class */ @JSGlobal("Windows.Media.Capture.LowLagPhotoCapture")
@js.native
open class LowLagPhotoCapture ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Capture.LowLagPhotoCapture {
  
  /**
    * Asynchronously captures a low shutter lag photo.
    * @return When this method completes, a CapturedPhoto object is returned which contains the captured photo.
    */
  /* CompleteClass */
  override def captureAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Capture.CapturedPhoto] = js.native
  
  /**
    * Asynchronously releases the LowLagPhotoCapture object and resources used by the capture photo operation.
    * @return Object that is used to control the asynchronous operation.
    */
  /* CompleteClass */
  override def finishAsync(): IPromiseWithIAsyncAction = js.native
}
