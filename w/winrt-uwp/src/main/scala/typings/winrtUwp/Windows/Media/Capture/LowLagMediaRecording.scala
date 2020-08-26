package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Media.Devices.MediaCapturePauseBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods for taking a low lag media recording. */
@js.native
trait LowLagMediaRecording extends js.Object {
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

object LowLagMediaRecording {
  @scala.inline
  def apply(
    finishAsync: () => IPromiseWithIAsyncAction,
    pauseAsync: MediaCapturePauseBehavior => IPromiseWithIAsyncAction,
    resumeAsync: () => IPromiseWithIAsyncAction,
    startAsync: () => IPromiseWithIAsyncAction,
    stopAsync: () => IPromiseWithIAsyncAction
  ): LowLagMediaRecording = {
    val __obj = js.Dynamic.literal(finishAsync = js.Any.fromFunction0(finishAsync), pauseAsync = js.Any.fromFunction1(pauseAsync), resumeAsync = js.Any.fromFunction0(resumeAsync), startAsync = js.Any.fromFunction0(startAsync), stopAsync = js.Any.fromFunction0(stopAsync))
    __obj.asInstanceOf[LowLagMediaRecording]
  }
  @scala.inline
  implicit class LowLagMediaRecordingOps[Self <: LowLagMediaRecording] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFinishAsync(value: () => IPromiseWithIAsyncAction): Self = this.set("finishAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setPauseAsync(value: MediaCapturePauseBehavior => IPromiseWithIAsyncAction): Self = this.set("pauseAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setResumeAsync(value: () => IPromiseWithIAsyncAction): Self = this.set("resumeAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setStartAsync(value: () => IPromiseWithIAsyncAction): Self = this.set("startAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setStopAsync(value: () => IPromiseWithIAsyncAction): Self = this.set("stopAsync", js.Any.fromFunction0(value))
  }
  
}

