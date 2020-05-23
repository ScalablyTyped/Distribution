package typings.winrt.global.Windows.UI.Core

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.UI.Core.DispatchedHandler
import typings.winrt.Windows.UI.Core.IdleDispatchedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Core.CoreDispatcher")
@js.native
class CoreDispatcher ()
  extends typings.winrt.Windows.UI.Core.CoreDispatcher {
  /* CompleteClass */
  override var hasThreadAccess: Boolean = js.native
  /* CompleteClass */
  override var onacceleratorkeyactivated: js.Any = js.native
  /* CompleteClass */
  override def processEvents(options: typings.winrt.Windows.UI.Core.CoreProcessEventsOption): Unit = js.native
  /* CompleteClass */
  override def runAsync(priority: typings.winrt.Windows.UI.Core.CoreDispatcherPriority, agileCallback: DispatchedHandler): IAsyncAction = js.native
  /* CompleteClass */
  override def runIdleAsync(agileCallback: IdleDispatchedHandler): IAsyncAction = js.native
}

