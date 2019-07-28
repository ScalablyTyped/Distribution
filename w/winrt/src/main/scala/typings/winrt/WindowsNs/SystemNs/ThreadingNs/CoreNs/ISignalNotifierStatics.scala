package typings.winrt.WindowsNs.SystemNs.ThreadingNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISignalNotifierStatics extends js.Object {
  def attachToEvent(name: String, handler: SignalHandler): SignalNotifier = js.native
  def attachToEvent(name: String, handler: SignalHandler, timeout: Double): SignalNotifier = js.native
  def attachToSemaphore(name: String, handler: SignalHandler): SignalNotifier = js.native
  def attachToSemaphore(name: String, handler: SignalHandler, timeout: Double): SignalNotifier = js.native
}

