package typings
package winrtLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaDeviceControl extends js.Object {
  var capabilities: MediaDeviceControlCapabilities
  def tryGetAuto(): winrtLib.Anon_ValueSucceeded
  def tryGetValue(): winrtLib.Anon_ValueSucceededNumber
  def trySetAuto(value: scala.Boolean): scala.Boolean
  def trySetValue(value: scala.Double): scala.Boolean
}

