package typings.xstream

import typings.node.eventsMod.EventEmitter
import typings.std.Event
import typings.std.EventTarget
import typings.xstream.xstreamMod.InternalListener
import typings.xstream.xstreamMod.InternalProducer
import typings.xstream.xstreamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstream/extra/fromEvent", JSImport.Namespace)
@js.native
object extraFromEventMod extends js.Object {
  @js.native
  class DOMEventProducer protected () extends InternalProducer[Event] {
    def this(node: EventTarget, eventType: String, useCapture: Boolean) = this()
    var eventType: js.Any = js.native
    var listener: js.UndefOr[js.Any] = js.native
    var node: js.Any = js.native
    var `type`: String = js.native
    var useCapture: js.Any = js.native
    /* CompleteClass */
    override def _start(listener: InternalListener[Event]): Unit = js.native
    /* CompleteClass */
    override def _stop(): Unit = js.native
  }
  
  @js.native
  class NodeEventProducer protected ()
    extends InternalProducer[js.Any] {
    def this(node: EventEmitter, eventName: String) = this()
    var eventName: js.Any = js.native
    var listener: js.UndefOr[js.Any] = js.native
    var node: js.Any = js.native
    var `type`: String = js.native
    /* CompleteClass */
    override def _start(listener: InternalListener[js.Any]): Unit = js.native
    /* CompleteClass */
    override def _stop(): Unit = js.native
  }
  
  def default[T](element: EventEmitter, eventName: String): Stream[T] = js.native
  def default[T /* <: Event */](element: EventTarget, eventName: String): Stream[T] = js.native
  def default[T /* <: Event */](element: EventTarget, eventName: String, useCapture: Boolean): Stream[T] = js.native
}

