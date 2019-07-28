package typings.winrt.WindowsNs.DevicesNs.EnumerationNs.PnpNs

import typings.winrt.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Enumeration.Pnp.PnpObjectWatcher")
@js.native
class PnpObjectWatcher () extends IPnpObjectWatcher {
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

