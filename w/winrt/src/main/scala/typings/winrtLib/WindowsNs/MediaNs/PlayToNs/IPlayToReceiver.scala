package typings
package winrtLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlayToReceiver extends js.Object {
  var friendlyName: java.lang.String
  var oncurrenttimechangerequested: js.Any
  var onmutechangerequested: js.Any
  var onpauserequested: js.Any
  var onplaybackratechangerequested: js.Any
  var onplayrequested: js.Any
  var onsourcechangerequested: js.Any
  var onstoprequested: js.Any
  var ontimeupdaterequested: js.Any
  var onvolumechangerequested: js.Any
  var properties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  var supportsAudio: scala.Boolean
  var supportsImage: scala.Boolean
  var supportsVideo: scala.Boolean
  def notifyDurationChange(duration: scala.Double): scala.Unit
  def notifyEnded(): scala.Unit
  def notifyError(): scala.Unit
  def notifyLoadedMetadata(): scala.Unit
  def notifyPaused(): scala.Unit
  def notifyPlaying(): scala.Unit
  def notifyRateChange(rate: scala.Double): scala.Unit
  def notifySeeked(): scala.Unit
  def notifySeeking(): scala.Unit
  def notifyStopped(): scala.Unit
  def notifyTimeUpdate(currentTime: scala.Double): scala.Unit
  def notifyVolumeChange(volume: scala.Double, mute: scala.Boolean): scala.Unit
  def startAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncAction
  def stopAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncAction
}

object IPlayToReceiver {
  @scala.inline
  def apply(
    friendlyName: java.lang.String,
    notifyDurationChange: scala.Double => scala.Unit,
    notifyEnded: () => scala.Unit,
    notifyError: () => scala.Unit,
    notifyLoadedMetadata: () => scala.Unit,
    notifyPaused: () => scala.Unit,
    notifyPlaying: () => scala.Unit,
    notifyRateChange: scala.Double => scala.Unit,
    notifySeeked: () => scala.Unit,
    notifySeeking: () => scala.Unit,
    notifyStopped: () => scala.Unit,
    notifyTimeUpdate: scala.Double => scala.Unit,
    notifyVolumeChange: (scala.Double, scala.Boolean) => scala.Unit,
    oncurrenttimechangerequested: js.Any,
    onmutechangerequested: js.Any,
    onpauserequested: js.Any,
    onplaybackratechangerequested: js.Any,
    onplayrequested: js.Any,
    onsourcechangerequested: js.Any,
    onstoprequested: js.Any,
    ontimeupdaterequested: js.Any,
    onvolumechangerequested: js.Any,
    properties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet,
    startAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncAction,
    stopAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncAction,
    supportsAudio: scala.Boolean,
    supportsImage: scala.Boolean,
    supportsVideo: scala.Boolean
  ): IPlayToReceiver = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName, notifyDurationChange = js.Any.fromFunction1(notifyDurationChange), notifyEnded = js.Any.fromFunction0(notifyEnded), notifyError = js.Any.fromFunction0(notifyError), notifyLoadedMetadata = js.Any.fromFunction0(notifyLoadedMetadata), notifyPaused = js.Any.fromFunction0(notifyPaused), notifyPlaying = js.Any.fromFunction0(notifyPlaying), notifyRateChange = js.Any.fromFunction1(notifyRateChange), notifySeeked = js.Any.fromFunction0(notifySeeked), notifySeeking = js.Any.fromFunction0(notifySeeking), notifyStopped = js.Any.fromFunction0(notifyStopped), notifyTimeUpdate = js.Any.fromFunction1(notifyTimeUpdate), notifyVolumeChange = js.Any.fromFunction2(notifyVolumeChange), oncurrenttimechangerequested = oncurrenttimechangerequested, onmutechangerequested = onmutechangerequested, onpauserequested = onpauserequested, onplaybackratechangerequested = onplaybackratechangerequested, onplayrequested = onplayrequested, onsourcechangerequested = onsourcechangerequested, onstoprequested = onstoprequested, ontimeupdaterequested = ontimeupdaterequested, onvolumechangerequested = onvolumechangerequested, properties = properties, startAsync = js.Any.fromFunction0(startAsync), stopAsync = js.Any.fromFunction0(stopAsync), supportsAudio = supportsAudio, supportsImage = supportsImage, supportsVideo = supportsVideo)
  
    __obj.asInstanceOf[IPlayToReceiver]
  }
}

