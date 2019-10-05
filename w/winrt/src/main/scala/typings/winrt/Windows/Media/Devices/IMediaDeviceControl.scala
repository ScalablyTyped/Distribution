package typings.winrt.Windows.Media.Devices

import typings.winrt.Anon_SucceededValue
import typings.winrt.Anon_SucceededValueBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaDeviceControl extends js.Object {
  var capabilities: MediaDeviceControlCapabilities
  def tryGetAuto(): Anon_SucceededValueBoolean
  def tryGetValue(): Anon_SucceededValue
  def trySetAuto(value: Boolean): Boolean
  def trySetValue(value: Double): Boolean
}

object IMediaDeviceControl {
  @scala.inline
  def apply(
    capabilities: MediaDeviceControlCapabilities,
    tryGetAuto: () => Anon_SucceededValueBoolean,
    tryGetValue: () => Anon_SucceededValue,
    trySetAuto: Boolean => Boolean,
    trySetValue: Double => Boolean
  ): IMediaDeviceControl = {
    val __obj = js.Dynamic.literal(capabilities = capabilities, tryGetAuto = js.Any.fromFunction0(tryGetAuto), tryGetValue = js.Any.fromFunction0(tryGetValue), trySetAuto = js.Any.fromFunction1(trySetAuto), trySetValue = js.Any.fromFunction1(trySetValue))
  
    __obj.asInstanceOf[IMediaDeviceControl]
  }
}

