package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "EventEmitter")
@js.native
class EventEmitter[T] () extends js.Object {
  /**
  		 * The event listeners can subscribe to.
  		 */
  @JSName("event")
  var event_Original: Event[T] = js.native
  /**
  		 * Dispose this object and free resources.
  		 */
  def dispose(): scala.Unit = js.native
  /**
  		 * The event listeners can subscribe to.
  		 */
  def event(listener: js.Function1[/* e */ T, _]): Disposable = js.native
  def event(listener: js.Function1[/* e */ T, _], thisArgs: js.Any): Disposable = js.native
  def event(listener: js.Function1[/* e */ T, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  /**
  		 * Notify all subscribers of the [event](#EventEmitter.event). Failure
  		 * of one or more listener will not fail this function call.
  		 *
  		 * @param data The event object.
  		 */
  def fire(): scala.Unit = js.native
  def fire(data: T): scala.Unit = js.native
}

