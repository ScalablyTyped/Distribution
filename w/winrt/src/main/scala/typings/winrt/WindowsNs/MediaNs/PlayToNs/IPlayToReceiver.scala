package typings.winrt.WindowsNs.MediaNs.PlayToNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlayToReceiver extends js.Object {
  var friendlyName: String
  var oncurrenttimechangerequested: js.Any
  var onmutechangerequested: js.Any
  var onpauserequested: js.Any
  var onplaybackratechangerequested: js.Any
  var onplayrequested: js.Any
  var onsourcechangerequested: js.Any
  var onstoprequested: js.Any
  var ontimeupdaterequested: js.Any
  var onvolumechangerequested: js.Any
  var properties: IPropertySet
  var supportsAudio: Boolean
  var supportsImage: Boolean
  var supportsVideo: Boolean
  def notifyDurationChange(duration: Double): Unit
  def notifyEnded(): Unit
  def notifyError(): Unit
  def notifyLoadedMetadata(): Unit
  def notifyPaused(): Unit
  def notifyPlaying(): Unit
  def notifyRateChange(rate: Double): Unit
  def notifySeeked(): Unit
  def notifySeeking(): Unit
  def notifyStopped(): Unit
  def notifyTimeUpdate(currentTime: Double): Unit
  def notifyVolumeChange(volume: Double, mute: Boolean): Unit
  def startAsync(): IAsyncAction
  def stopAsync(): IAsyncAction
}

object IPlayToReceiver {
  @scala.inline
  def apply(
    friendlyName: String,
    notifyDurationChange: Double => Unit,
    notifyEnded: () => Unit,
    notifyError: () => Unit,
    notifyLoadedMetadata: () => Unit,
    notifyPaused: () => Unit,
    notifyPlaying: () => Unit,
    notifyRateChange: Double => Unit,
    notifySeeked: () => Unit,
    notifySeeking: () => Unit,
    notifyStopped: () => Unit,
    notifyTimeUpdate: Double => Unit,
    notifyVolumeChange: (Double, Boolean) => Unit,
    oncurrenttimechangerequested: js.Any,
    onmutechangerequested: js.Any,
    onpauserequested: js.Any,
    onplaybackratechangerequested: js.Any,
    onplayrequested: js.Any,
    onsourcechangerequested: js.Any,
    onstoprequested: js.Any,
    ontimeupdaterequested: js.Any,
    onvolumechangerequested: js.Any,
    properties: IPropertySet,
    startAsync: () => IAsyncAction,
    stopAsync: () => IAsyncAction,
    supportsAudio: Boolean,
    supportsImage: Boolean,
    supportsVideo: Boolean
  ): IPlayToReceiver = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName, notifyDurationChange = js.Any.fromFunction1(notifyDurationChange), notifyEnded = js.Any.fromFunction0(notifyEnded), notifyError = js.Any.fromFunction0(notifyError), notifyLoadedMetadata = js.Any.fromFunction0(notifyLoadedMetadata), notifyPaused = js.Any.fromFunction0(notifyPaused), notifyPlaying = js.Any.fromFunction0(notifyPlaying), notifyRateChange = js.Any.fromFunction1(notifyRateChange), notifySeeked = js.Any.fromFunction0(notifySeeked), notifySeeking = js.Any.fromFunction0(notifySeeking), notifyStopped = js.Any.fromFunction0(notifyStopped), notifyTimeUpdate = js.Any.fromFunction1(notifyTimeUpdate), notifyVolumeChange = js.Any.fromFunction2(notifyVolumeChange), oncurrenttimechangerequested = oncurrenttimechangerequested, onmutechangerequested = onmutechangerequested, onpauserequested = onpauserequested, onplaybackratechangerequested = onplaybackratechangerequested, onplayrequested = onplayrequested, onsourcechangerequested = onsourcechangerequested, onstoprequested = onstoprequested, ontimeupdaterequested = ontimeupdaterequested, onvolumechangerequested = onvolumechangerequested, properties = properties, startAsync = js.Any.fromFunction0(startAsync), stopAsync = js.Any.fromFunction0(stopAsync), supportsAudio = supportsAudio, supportsImage = supportsImage, supportsVideo = supportsVideo)
  
    __obj.asInstanceOf[IPlayToReceiver]
  }
}

