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
    val __obj = js.Dynamic.literal(onadded = onadded, onenumerationcompleted = onenumerationcompleted, onremoved = onremoved, onstopped = onstopped, onupdated = onupdated, start = start, status = status, stop = stop)
  
    __obj.asInstanceOf[IDeviceWatcher]
  }
}

