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
    tryGetAuto: js.Function0[winrtLib.Anon_SucceededValueBoolean],
    tryGetValue: js.Function0[winrtLib.Anon_SucceededValue],
    trySetAuto: js.Function1[scala.Boolean, scala.Boolean],
    trySetValue: js.Function1[scala.Double, scala.Boolean]
  ): IMediaDeviceControl = {
    val __obj = js.Dynamic.literal(capabilities = capabilities, tryGetAuto = tryGetAuto, tryGetValue = tryGetValue, trySetAuto = trySetAuto, trySetValue = trySetValue)
  
    __obj.asInstanceOf[IMediaDeviceControl]
  }
}

