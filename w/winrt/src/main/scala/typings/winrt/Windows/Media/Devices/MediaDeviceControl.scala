package typings.winrt.Windows.Media.Devices

import typings.winrt.anon.SucceededBoolean
import typings.winrt.anon.SucceededValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaDeviceControl extends IMediaDeviceControl

object MediaDeviceControl {
  @scala.inline
  def apply(
    capabilities: MediaDeviceControlCapabilities,
    tryGetAuto: () => SucceededBoolean,
    tryGetValue: () => SucceededValue,
    trySetAuto: Boolean => Boolean,
    trySetValue: Double => Boolean
  ): MediaDeviceControl = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], tryGetAuto = js.Any.fromFunction0(tryGetAuto), tryGetValue = js.Any.fromFunction0(tryGetValue), trySetAuto = js.Any.fromFunction1(trySetAuto), trySetValue = js.Any.fromFunction1(trySetValue))
    __obj.asInstanceOf[MediaDeviceControl]
  }
}

