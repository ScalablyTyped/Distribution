package typings
package winrtLib.WindowsNs.SystemNs.ThreadingNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.System.Threading.Core.SignalNotifier")
@js.native
class SignalNotifier () extends ISignalNotifier {
  /* CompleteClass */
  override def enable(): scala.Unit = js.native
  /* CompleteClass */
  override def terminate(): scala.Unit = js.native
}

/* static members */
@JSGlobal("Windows.System.Threading.Core.SignalNotifier")
@js.native
object SignalNotifier extends js.Object {
  def attachToEvent(name: java.lang.String, handler: winrtLib.WindowsNs.SystemNs.ThreadingNs.CoreNs.SignalHandler): winrtLib.WindowsNs.SystemNs.ThreadingNs.CoreNs.SignalNotifier = js.native
  def attachToEvent(
    name: java.lang.String,
    handler: winrtLib.WindowsNs.SystemNs.ThreadingNs.CoreNs.SignalHandler,
    timeout: scala.Double
  ): winrtLib.WindowsNs.SystemNs.ThreadingNs.CoreNs.SignalNotifier = js.native
  def attachToSemaphore(name: java.lang.String, handler: winrtLib.WindowsNs.SystemNs.ThreadingNs.CoreNs.SignalHandler): winrtLib.WindowsNs.SystemNs.ThreadingNs.CoreNs.SignalNotifier = js.native
  def attachToSemaphore(
    name: java.lang.String,
    handler: winrtLib.WindowsNs.SystemNs.ThreadingNs.CoreNs.SignalHandler,
    timeout: scala.Double
  ): winrtLib.WindowsNs.SystemNs.ThreadingNs.CoreNs.SignalNotifier = js.native
}

