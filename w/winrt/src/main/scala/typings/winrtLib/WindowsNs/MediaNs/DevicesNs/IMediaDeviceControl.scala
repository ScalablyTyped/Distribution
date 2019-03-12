package typings
package winrtLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaDeviceControl extends js.Object {
  var capabilities: MediaDeviceControlCapabilities
  def tryGetAuto(): winrtLib.Anon_SucceededValueBoolean
  def tryGetValue(): winrtLib.Anon_SucceededValue
  def trySetAuto(value: scala.Boolean): scala.Boolean
  def trySetValue(value: scala.Double): scala.Boolean
}

object IMediaDeviceControl {
  @scala.inline
  def apply(
    capabilities: MediaDeviceControlCapabilities,
    tryGetAuto: () => winrtLib.Anon_SucceededValueBoolean,
    tryGetValue: () => winrtLib.Anon_SucceededValue,
    trySetAuto: scala.Boolean => scala.Boolean,
    trySetValue: scala.Double => scala.Boolean
  ): IMediaDeviceControl = {
    val __obj = js.Dynamic.literal(capabilities = capabilities, tryGetAuto = js.Any.fromFunction0(tryGetAuto), tryGetValue = js.Any.fromFunction0(tryGetValue), trySetAuto = js.Any.fromFunction1(trySetAuto), trySetValue = js.Any.fromFunction1(trySetValue))
  
    __obj.asInstanceOf[IMediaDeviceControl]
  }
}

