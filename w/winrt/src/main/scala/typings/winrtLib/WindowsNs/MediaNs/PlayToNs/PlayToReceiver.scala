package typings
package winrtLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.PlayTo.PlayToReceiver")
@js.native
class PlayToReceiver () extends IPlayToReceiver {
  /* CompleteClass */
  override var friendlyName: java.lang.String = js.native
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
  override var properties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet = js.native
  /* CompleteClass */
  override var supportsAudio: scala.Boolean = js.native
  /* CompleteClass */
  override var supportsImage: scala.Boolean = js.native
  /* CompleteClass */
  override var supportsVideo: scala.Boolean = js.native
  /* CompleteClass */
  override def notifyDurationChange(duration: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def notifyEnded(): scala.Unit = js.native
  /* CompleteClass */
  override def notifyError(): scala.Unit = js.native
  /* CompleteClass */
  override def notifyLoadedMetadata(): scala.Unit = js.native
  /* CompleteClass */
  override def notifyPaused(): scala.Unit = js.native
  /* CompleteClass */
  override def notifyPlaying(): scala.Unit = js.native
  /* CompleteClass */
  override def notifyRateChange(rate: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def notifySeeked(): scala.Unit = js.native
  /* CompleteClass */
  override def notifySeeking(): scala.Unit = js.native
  /* CompleteClass */
  override def notifyStopped(): scala.Unit = js.native
  /* CompleteClass */
  override def notifyTimeUpdate(currentTime: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def notifyVolumeChange(volume: scala.Double, mute: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def startAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  /* CompleteClass */
  override def stopAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
}

