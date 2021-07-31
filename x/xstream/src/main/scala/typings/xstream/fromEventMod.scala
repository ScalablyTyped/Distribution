package typings.xstream

import typings.node.eventsMod.EventEmitter
import typings.std.Event
import typings.std.EventTarget
import typings.xstream.mod.InternalListener
import typings.xstream.mod.InternalProducer
import typings.xstream.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromEventMod {
  
  @JSImport("xstream/extra/fromEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](element: EventEmitter, eventName: String): Stream[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Stream[T]]
  @scala.inline
  def default[T /* <: Event */](element: EventTarget, eventName: String): Stream[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Stream[T]]
  @scala.inline
  def default[T /* <: Event */](element: EventTarget, eventName: String, useCapture: Boolean): Stream[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Stream[T]]
  
  @JSImport("xstream/extra/fromEvent", "DOMEventProducer")
  @js.native
  class DOMEventProducer protected ()
    extends StObject
       with InternalProducer[Event] {
    def this(node: EventTarget, eventType: String, useCapture: Boolean) = this()
    
    /* CompleteClass */
    override def _start(listener: InternalListener[Event]): Unit = js.native
    
    /* CompleteClass */
    override def _stop(): Unit = js.native
    
    var eventType: js.Any = js.native
    
    var listener: js.Any = js.native
    
    var node: js.Any = js.native
    
    var `type`: String = js.native
    
    var useCapture: js.Any = js.native
  }
  
  @JSImport("xstream/extra/fromEvent", "NodeEventProducer")
  @js.native
  class NodeEventProducer protected ()
    extends StObject
       with InternalProducer[js.Any] {
    def this(node: EventEmitter, eventName: String) = this()
    
    /* CompleteClass */
    override def _start(listener: InternalListener[js.Any]): Unit = js.native
    
    /* CompleteClass */
    override def _stop(): Unit = js.native
    
    var eventName: js.Any = js.native
    
    var listener: js.Any = js.native
    
    var node: js.Any = js.native
    
    var `type`: String = js.native
  }
}
