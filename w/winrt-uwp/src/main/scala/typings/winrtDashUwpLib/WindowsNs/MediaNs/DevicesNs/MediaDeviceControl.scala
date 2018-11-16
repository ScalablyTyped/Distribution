package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets or sets a device setting on a camera. */
@JSGlobal("Windows.Media.Devices.MediaDeviceControl")
@js.native
abstract class MediaDeviceControl () extends js.Object {
  /** Gets the capabilities of the camera for this camera setting. */
  var capabilities: MediaDeviceControlCapabilities = js.native
  /**
                   * Indicates whether automatic adjustment of the camera setting is enabled.
                   */
  def tryGetAuto(): winrtDashUwpLib.Anon_ValueReturnValue = js.native
  /**
                   * Gets the value of the camera setting.
                   */
  def tryGetValue(): winrtDashUwpLib.Anon_ValueReturnValueNumber = js.native
  /**
                   * Enables or disables automatic adjustment of the camera setting.
                   * @param value True to enable automatic adjustment; or false to disable automatic adjustment. If false, call TrySetValue to adjust the setting.
                   * @return Returns true if the method succeeds, or false otherwise.
                   */
  def trySetAuto(value: scala.Boolean): scala.Boolean = js.native
  /**
                   * Sets the camera setting.
                   * @param value The new value of the camera setting. The units depend on the setting.
                   * @return Returns true if the method succeeds, or false otherwise.
                   */
  def trySetValue(value: scala.Double): scala.Boolean = js.native
}

