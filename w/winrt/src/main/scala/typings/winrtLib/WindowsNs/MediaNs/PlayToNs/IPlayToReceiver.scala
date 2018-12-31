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

