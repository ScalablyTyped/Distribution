package typings
package winrtLib.WindowsNs.SystemNs.ThreadingNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPreallocatedWorkItemFactory extends js.Object {
  def createWorkItem(handler: winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemHandler): PreallocatedWorkItem
  def createWorkItemWithPriority(
    handler: winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemHandler,
    priority: winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemPriority
  ): PreallocatedWorkItem
  def createWorkItemWithPriorityAndOptions(
    handler: winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemHandler,
    priority: winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemPriority,
    options: winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemOptions
  ): PreallocatedWorkItem
}

