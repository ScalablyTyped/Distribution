package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.anon.ReturnValueValue
import typings.winrtUwp.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets or sets a device setting on a camera. */
trait MediaDeviceControl extends js.Object {
  /** Gets the capabilities of the camera for this camera setting. */
  var capabilities: MediaDeviceControlCapabilities
  /**
    * Indicates whether automatic adjustment of the camera setting is enabled.
    */
  def tryGetAuto(): Value
  /**
    * Gets the value of the camera setting.
    */
  def tryGetValue(): ReturnValueValue
  /**
    * Enables or disables automatic adjustment of the camera setting.
    * @param value True to enable automatic adjustment; or false to disable automatic adjustment. If false, call TrySetValue to adjust the setting.
    * @return Returns true if the method succeeds, or false otherwise.
    */
  def trySetAuto(value: Boolean): Boolean
  /**
    * Sets the camera setting.
    * @param value The new value of the camera setting. The units depend on the setting.
    * @return Returns true if the method succeeds, or false otherwise.
    */
  def trySetValue(value: Double): Boolean
}

object MediaDeviceControl {
  @scala.inline
  def apply(
    capabilities: MediaDeviceControlCapabilities,
    tryGetAuto: () => Value,
    tryGetValue: () => ReturnValueValue,
    trySetAuto: Boolean => Boolean,
    trySetValue: Double => Boolean
  ): MediaDeviceControl = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], tryGetAuto = js.Any.fromFunction0(tryGetAuto), tryGetValue = js.Any.fromFunction0(tryGetValue), trySetAuto = js.Any.fromFunction1(trySetAuto), trySetValue = js.Any.fromFunction1(trySetValue))
    __obj.asInstanceOf[MediaDeviceControl]
  }
}

