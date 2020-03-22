package typings.vscodeJsonrpc.eventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/events", "Emitter")
@js.native
class Emitter[T] () extends js.Object {
  def this(_options: EmitterOptions) = this()
  var _callbacks: js.Any = js.native
  var _event: js.Any = js.native
  var _options: js.UndefOr[js.Any] = js.native
  def dispose(): Unit = js.native
  /**
    * For the public to allow to subscribe
    * to events from this Emitter
    */
  def event(): Event[T] = js.native
  /**
    * To be kept private to fire an event to
    * subscribers
    */
  def fire(event: T): js.Any = js.native
}

/* static members */
@JSImport("vscode-jsonrpc/lib/events", "Emitter")
@js.native
object Emitter extends js.Object {
  var _noop: js.Any = js.native
}

