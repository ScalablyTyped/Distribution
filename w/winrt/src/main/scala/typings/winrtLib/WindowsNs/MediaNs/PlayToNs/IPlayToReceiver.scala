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
    notifyDurationChange: js.Function1[scala.Double, scala.Unit],
    notifyEnded: js.Function0[scala.Unit],
    notifyError: js.Function0[scala.Unit],
    notifyLoadedMetadata: js.Function0[scala.Unit],
    notifyPaused: js.Function0[scala.Unit],
    notifyPlaying: js.Function0[scala.Unit],
    notifyRateChange: js.Function1[scala.Double, scala.Unit],
    notifySeeked: js.Function0[scala.Unit],
    notifySeeking: js.Function0[scala.Unit],
    notifyStopped: js.Function0[scala.Unit],
    notifyTimeUpdate: js.Function1[scala.Double, scala.Unit],
    notifyVolumeChange: js.Function2[scala.Double, scala.Boolean, scala.Unit],
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
    startAsync: js.Function0[winrtLib.WindowsNs.FoundationNs.IAsyncAction],
    stopAsync: js.Function0[winrtLib.WindowsNs.FoundationNs.IAsyncAction],
    supportsAudio: scala.Boolean,
    supportsImage: scala.Boolean,
    supportsVideo: scala.Boolean
  ): IPlayToReceiver = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName, notifyDurationChange = notifyDurationChange, notifyEnded = notifyEnded, notifyError = notifyError, notifyLoadedMetadata = notifyLoadedMetadata, notifyPaused = notifyPaused, notifyPlaying = notifyPlaying, notifyRateChange = notifyRateChange, notifySeeked = notifySeeked, notifySeeking = notifySeeking, notifyStopped = notifyStopped, notifyTimeUpdate = notifyTimeUpdate, notifyVolumeChange = notifyVolumeChange, oncurrenttimechangerequested = oncurrenttimechangerequested, onmutechangerequested = onmutechangerequested, onpauserequested = onpauserequested, onplaybackratechangerequested = onplaybackratechangerequested, onplayrequested = onplayrequested, onsourcechangerequested = onsourcechangerequested, onstoprequested = onstoprequested, ontimeupdaterequested = ontimeupdaterequested, onvolumechangerequested = onvolumechangerequested, properties = properties, startAsync = startAsync, stopAsync = stopAsync, supportsAudio = supportsAudio, supportsImage = supportsImage, supportsVideo = supportsVideo)
  
    __obj.asInstanceOf[IPlayToReceiver]
  }
}

