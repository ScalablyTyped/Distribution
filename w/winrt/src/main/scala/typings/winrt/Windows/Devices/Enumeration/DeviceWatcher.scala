package typings.winrt.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Enumeration.DeviceWatcher")
@js.native
class DeviceWatcher () extends IDeviceWatcher {
  /* CompleteClass */
  override var onadded: js.Any = js.native
  /* CompleteClass */
  override var onenumerationcompleted: js.Any = js.native
  /* CompleteClass */
  override var onremoved: js.Any = js.native
  /* CompleteClass */
  override var onstopped: js.Any = js.native
  /* CompleteClass */
  override var onupdated: js.Any = js.native
  /* CompleteClass */
  override var status: DeviceWatcherStatus = js.native
  /* CompleteClass */
  override def start(): Unit = js.native
  /* CompleteClass */
  override def stop(): Unit = js.native
}

