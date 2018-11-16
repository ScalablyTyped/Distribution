package typings
package winrtLib.WindowsNs.SystemNs.ThreadingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThreadPoolStatics extends js.Object {
  def runAsync(handler: WorkItemHandler): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def runAsync(handler: WorkItemHandler, priority: WorkItemPriority): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def runAsync(handler: WorkItemHandler, priority: WorkItemPriority, options: WorkItemOptions): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
}

