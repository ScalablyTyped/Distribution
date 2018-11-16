package typings
package winrtLib.WindowsNs.SystemNs.ThreadingNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISignalNotifierStatics extends js.Object {
  def attachToEvent(name: java.lang.String, handler: SignalHandler): SignalNotifier = js.native
  def attachToEvent(name: java.lang.String, handler: SignalHandler, timeout: scala.Double): SignalNotifier = js.native
  def attachToSemaphore(name: java.lang.String, handler: SignalHandler): SignalNotifier = js.native
  def attachToSemaphore(name: java.lang.String, handler: SignalHandler, timeout: scala.Double): SignalNotifier = js.native
}

