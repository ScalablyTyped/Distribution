package typings
package winrtLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceWatcher extends js.Object {
  var onadded: js.Any
  var onenumerationcompleted: js.Any
  var onremoved: js.Any
  var onstopped: js.Any
  var onupdated: js.Any
  var status: DeviceWatcherStatus
  def start(): scala.Unit
  def stop(): scala.Unit
}

object IDeviceWatcher {
  @scala.inline
  def apply(
    onadded: js.Any,
    onenumerationcompleted: js.Any,
    onremoved: js.Any,
    onstopped: js.Any,
    onupdated: js.Any,
    start: js.Function0[scala.Unit],
    status: DeviceWatcherStatus,
    stop: js.Function0[scala.Unit]
  ): IDeviceWatcher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onadded")(onadded)
    __obj.updateDynamic("onenumerationcompleted")(onenumerationcompleted)
    __obj.updateDynamic("onremoved")(onremoved)
    __obj.updateDynamic("onstopped")(onstopped)
    __obj.updateDynamic("onupdated")(onupdated)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[IDeviceWatcher]
  }
}

