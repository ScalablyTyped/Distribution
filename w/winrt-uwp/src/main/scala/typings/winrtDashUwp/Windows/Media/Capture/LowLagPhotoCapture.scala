package typings.winrtDashUwp.Windows.Media.Capture

import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods for taking a low shutter lag photo. */
@JSGlobal("Windows.Media.Capture.LowLagPhotoCapture")
@js.native
abstract class LowLagPhotoCapture () extends js.Object {
  /**
    * Asynchronously captures a low shutter lag photo.
    * @return When this method completes, a CapturedPhoto object is returned which contains the captured photo.
    */
  def captureAsync(): IPromiseWithIAsyncOperation[CapturedPhoto] = js.native
  /**
    * Asynchronously releases the LowLagPhotoCapture object and resources used by the capture photo operation.
    * @return Object that is used to control the asynchronous operation.
    */
  def finishAsync(): IPromiseWithIAsyncAction = js.native
}

