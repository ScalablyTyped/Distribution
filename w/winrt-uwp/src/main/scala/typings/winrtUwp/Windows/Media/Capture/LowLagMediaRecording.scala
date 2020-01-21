package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Media.Devices.MediaCapturePauseBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods for taking a low lag media recording. */
@JSGlobal("Windows.Media.Capture.LowLagMediaRecording")
@js.native
abstract class LowLagMediaRecording () extends js.Object {
  /**
    * Asynchronously releases the LowLagMediaRecording object and resources used by the media recording operation.
    * @return Object that is used to control the asynchronous operation.
    */
  def finishAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Pauses an ongoing low lag media record operation
    * @param behavior A value indicating whether the media capture hardware resources should be preserved or released while recording is paused.
    * @return An asynchronous action.
    */
  def pauseAsync(behavior: MediaCapturePauseBehavior): IPromiseWithIAsyncAction = js.native
  /**
    * Resumes a paused low lag recording operation.
    * @return An asynchronous action.
    */
  def resumeAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously starts the low lag media recording.
    * @return Object that is used to control the asynchronous operation.
    */
  def startAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously stops the low lag media recording.
    * @return Object that is used to control the asynchronous operation.
    */
  def stopAsync(): IPromiseWithIAsyncAction = js.native
}

