package typings.winrt.Windows.System.Threading.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.System.Threading.Core.SignalNotifier")
@js.native
class SignalNotifier () extends ISignalNotifier {
  /* CompleteClass */
  override def enable(): Unit = js.native
  /* CompleteClass */
  override def terminate(): Unit = js.native
}

/* static members */
@JSGlobal("Windows.System.Threading.Core.SignalNotifier")
@js.native
object SignalNotifier extends js.Object {
  def attachToEvent(name: String, handler: SignalHandler): SignalNotifier = js.native
  def attachToEvent(name: String, handler: SignalHandler, timeout: Double): SignalNotifier = js.native
  def attachToSemaphore(name: String, handler: SignalHandler): SignalNotifier = js.native
  def attachToSemaphore(name: String, handler: SignalHandler, timeout: Double): SignalNotifier = js.native
}

