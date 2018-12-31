package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreDispatcher extends ICoreAcceleratorKeys {
  var hasThreadAccess: scala.Boolean
  def processEvents(options: CoreProcessEventsOption): scala.Unit
  def runAsync(priority: CoreDispatcherPriority, agileCallback: DispatchedHandler): winrtLib.WindowsNs.FoundationNs.IAsyncAction
  def runIdleAsync(agileCallback: IdleDispatchedHandler): winrtLib.WindowsNs.FoundationNs.IAsyncAction
}

