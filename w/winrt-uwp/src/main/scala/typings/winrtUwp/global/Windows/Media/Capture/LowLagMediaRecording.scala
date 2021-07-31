package typings.winrtUwp.global.Windows.Media.Capture

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Media.Devices.MediaCapturePauseBehavior
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods for taking a low lag media recording. */
@JSGlobal("Windows.Media.Capture.LowLagMediaRecording")
@js.native
abstract class LowLagMediaRecording ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Capture.LowLagMediaRecording {
  
  /**
    * Asynchronously releases the LowLagMediaRecording object and resources used by the media recording operation.
    * @return Object that is used to control the asynchronous operation.
    */
  /* CompleteClass */
  override def finishAsync(): IPromiseWithIAsyncAction = js.native
  
  /**
    * Pauses an ongoing low lag media record operation
    * @param behavior A value indicating whether the media capture hardware resources should be preserved or released while recording is paused.
    * @return An asynchronous action.
    */
  /* CompleteClass */
  override def pauseAsync(behavior: MediaCapturePauseBehavior): IPromiseWithIAsyncAction = js.native
  
  /**
    * Resumes a paused low lag recording operation.
    * @return An asynchronous action.
    */
  /* CompleteClass */
  override def resumeAsync(): IPromiseWithIAsyncAction = js.native
  
  /**
    * Asynchronously starts the low lag media recording.
    * @return Object that is used to control the asynchronous operation.
    */
  /* CompleteClass */
  override def startAsync(): IPromiseWithIAsyncAction = js.native
  
  /**
    * Asynchronously stops the low lag media recording.
    * @return Object that is used to control the asynchronous operation.
    */
  /* CompleteClass */
  override def stopAsync(): IPromiseWithIAsyncAction = js.native
}
