package typings.winrt.Windows.Devices.Enumeration

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
  def start(): Unit
  def stop(): Unit
}

object IDeviceWatcher {
  @scala.inline
  def apply(
    onadded: js.Any,
    onenumerationcompleted: js.Any,
    onremoved: js.Any,
    onstopped: js.Any,
    onupdated: js.Any,
    start: () => Unit,
    status: DeviceWatcherStatus,
    stop: () => Unit
  ): IDeviceWatcher = {
    val __obj = js.Dynamic.literal(onadded = onadded, onenumerationcompleted = onenumerationcompleted, onremoved = onremoved, onstopped = onstopped, onupdated = onupdated, start = js.Any.fromFunction0(start), status = status, stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[IDeviceWatcher]
  }
}

