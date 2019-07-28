package typings.winrt.WindowsNs.MediaNs.PlayToNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.PlayTo.PlayToReceiver")
@js.native
class PlayToReceiver () extends IPlayToReceiver {
  /* CompleteClass */
  override var friendlyName: String = js.native
  /* CompleteClass */
  override var oncurrenttimechangerequested: js.Any = js.native
  /* CompleteClass */
  override var onmutechangerequested: js.Any = js.native
  /* CompleteClass */
  override var onpauserequested: js.Any = js.native
  /* CompleteClass */
  override var onplaybackratechangerequested: js.Any = js.native
  /* CompleteClass */
  override var onplayrequested: js.Any = js.native
  /* CompleteClass */
  override var onsourcechangerequested: js.Any = js.native
  /* CompleteClass */
  override var onstoprequested: js.Any = js.native
  /* CompleteClass */
  override var ontimeupdaterequested: js.Any = js.native
  /* CompleteClass */
  override var onvolumechangerequested: js.Any = js.native
  /* CompleteClass */
  override var properties: IPropertySet = js.native
  /* CompleteClass */
  override var supportsAudio: Boolean = js.native
  /* CompleteClass */
  override var supportsImage: Boolean = js.native
  /* CompleteClass */
  override var supportsVideo: Boolean = js.native
  /* CompleteClass */
  override def notifyDurationChange(duration: Double): Unit = js.native
  /* CompleteClass */
  override def notifyEnded(): Unit = js.native
  /* CompleteClass */
  override def notifyError(): Unit = js.native
  /* CompleteClass */
  override def notifyLoadedMetadata(): Unit = js.native
  /* CompleteClass */
  override def notifyPaused(): Unit = js.native
  /* CompleteClass */
  override def notifyPlaying(): Unit = js.native
  /* CompleteClass */
  override def notifyRateChange(rate: Double): Unit = js.native
  /* CompleteClass */
  override def notifySeeked(): Unit = js.native
  /* CompleteClass */
  override def notifySeeking(): Unit = js.native
  /* CompleteClass */
  override def notifyStopped(): Unit = js.native
  /* CompleteClass */
  override def notifyTimeUpdate(currentTime: Double): Unit = js.native
  /* CompleteClass */
  override def notifyVolumeChange(volume: Double, mute: Boolean): Unit = js.native
  /* CompleteClass */
  override def startAsync(): IAsyncAction = js.native
  /* CompleteClass */
  override def stopAsync(): IAsyncAction = js.native
}

