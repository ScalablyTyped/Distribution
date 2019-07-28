package typings.winrt.WindowsNs.UINs.CoreNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Core.CoreDispatcher")
@js.native
class CoreDispatcher () extends ICoreDispatcher {
  /* CompleteClass */
  override var hasThreadAccess: Boolean = js.native
  /* CompleteClass */
  override var onacceleratorkeyactivated: js.Any = js.native
  /* CompleteClass */
  override def processEvents(options: CoreProcessEventsOption): Unit = js.native
  /* CompleteClass */
  override def runAsync(priority: CoreDispatcherPriority, agileCallback: DispatchedHandler): IAsyncAction = js.native
  /* CompleteClass */
  override def runIdleAsync(agileCallback: IdleDispatchedHandler): IAsyncAction = js.native
}

