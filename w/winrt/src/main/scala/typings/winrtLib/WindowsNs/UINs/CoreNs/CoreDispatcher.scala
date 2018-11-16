package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Core.CoreDispatcher")
@js.native
class CoreDispatcher () extends ICoreDispatcher {
  /* CompleteClass */
  override var hasThreadAccess: scala.Boolean = js.native
  /* CompleteClass */
  override var onacceleratorkeyactivated: js.Any = js.native
  /* CompleteClass */
  override def processEvents(options: CoreProcessEventsOption): scala.Unit = js.native
  /* CompleteClass */
  override def runAsync(priority: CoreDispatcherPriority, agileCallback: DispatchedHandler): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  /* CompleteClass */
  override def runIdleAsync(agileCallback: IdleDispatchedHandler): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
}

