package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "EventEmitter")
@js.native
class EventEmitter[T] () extends StObject {
  
  /**
    * Dispose this object and free resources.
    */
  def dispose(): Unit = js.native
  
  /**
    * The event listeners can subscribe to.
    */
  def event(listener: js.Function1[/* e */ T, _]): Disposable = js.native
  def event(
    listener: js.Function1[/* e */ T, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def event(listener: js.Function1[/* e */ T, _], thisArgs: js.Any): Disposable = js.native
  def event(listener: js.Function1[/* e */ T, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  /**
    * The event listeners can subscribe to.
    */
  @JSName("event")
  var event_Original: Event[T] = js.native
  
  /**
    * Notify all subscribers of the [event](#EventEmitter.event). Failure
    * of one or more listener will not fail this function call.
    *
    * @param data The event object.
    */
  def fire(data: T): Unit = js.native
}
