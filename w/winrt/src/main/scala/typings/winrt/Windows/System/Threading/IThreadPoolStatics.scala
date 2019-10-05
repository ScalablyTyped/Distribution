package typings.winrt.Windows.System.Threading

import typings.winrt.Windows.Foundation.IAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThreadPoolStatics extends js.Object {
  def runAsync(handler: WorkItemHandler): IAsyncAction = js.native
  def runAsync(handler: WorkItemHandler, priority: WorkItemPriority): IAsyncAction = js.native
  def runAsync(handler: WorkItemHandler, priority: WorkItemPriority, options: WorkItemOptions): IAsyncAction = js.native
}

