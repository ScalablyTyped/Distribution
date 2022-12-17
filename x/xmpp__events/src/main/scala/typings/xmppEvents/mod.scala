package typings.xmppEvents

import org.scalablytyped.runtime.Instantiable0
import typings.std.Error
import typings.std.PromiseLike
import typings.xmppEvents.anon.PromisevoidtimeoutTimeout
import typings.xmppEvents.anon.TypeofEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@xmpp/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@xmpp/events", "Deferred")
  @js.native
  open class Deferred[TValue] () extends StObject {
    
    val promise: js.Promise[TValue] = js.native
    
    def reject(): Unit = js.native
    def reject(reason: Any): Unit = js.native
    
    def resolve(value: TValue): Unit = js.native
    def resolve(value: PromiseLike[TValue]): Unit = js.native
  }
  
  @JSImport("@xmpp/events", "EventEmitter")
  @js.native
  val EventEmitter: Instantiable0[typings.node.eventsMod.EventEmitter] & TypeofEventEmitter = js.native
  type EventEmitter = typings.node.eventsMod.EventEmitter
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@xmpp/events", "EventEmitter")
  @js.native
  open class EventEmitterCls ()
    extends typings.node.eventsMod.EventEmitter
  
  @JSImport("@xmpp/events", "TimeoutError")
  @js.native
  open class TimeoutError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    val name_TimeoutError: typings.xmppEvents.xmppEventsStrings.TimeoutError = js.native
  }
  
  inline def delay(ms: Double): PromisevoidtimeoutTimeout = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(ms.asInstanceOf[js.Any]).asInstanceOf[PromisevoidtimeoutTimeout]
  
  inline def promise(emitter: typings.xmppEvents.mod.EventEmitter, event: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("promise")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def promise(emitter: typings.xmppEvents.mod.EventEmitter, event: String, rejectEvent: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("promise")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], rejectEvent.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def promise(emitter: typings.xmppEvents.mod.EventEmitter, event: String, rejectEvent: String, timeout: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("promise")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], rejectEvent.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def promise(emitter: typings.xmppEvents.mod.EventEmitter, event: String, rejectEvent: js.Symbol): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("promise")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], rejectEvent.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def promise(
    emitter: typings.xmppEvents.mod.EventEmitter,
    event: String,
    rejectEvent: js.Symbol,
    timeout: Double
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("promise")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], rejectEvent.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def promise(emitter: typings.xmppEvents.mod.EventEmitter, event: String, rejectEvent: Null, timeout: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("promise")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], rejectEvent.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def promise(emitter: typings.xmppEvents.mod.EventEmitter, event: String, rejectEvent: Unit, timeout: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("promise")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], rejectEvent.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def promise(emitter: typings.xmppEvents.mod.EventEmitter, event: js.Symbol): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("promise")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def promise(emitter: typings.xmppEvents.mod.EventEmitter, event: js.Symbol, rejectEvent: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("promise")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], rejectEvent.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def promise(
    emitter: typings.xmppEvents.mod.EventEmitter,
    event: js.Symbol,
    rejectEvent: String,
    timeout: Double
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("promise")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], rejectEvent.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def promise(emitter: typings.xmppEvents.mod.EventEmitter, event: js.Symbol, rejectEvent: js.Symbol): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("promise")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], rejectEvent.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def promise(
    emitter: typings.xmppEvents.mod.EventEmitter,
    event: js.Symbol,
    rejectEvent: js.Symbol,
    timeout: Double
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("promise")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], rejectEvent.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def promise(emitter: typings.xmppEvents.mod.EventEmitter, event: js.Symbol, rejectEvent: Null, timeout: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("promise")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], rejectEvent.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def promise(emitter: typings.xmppEvents.mod.EventEmitter, event: js.Symbol, rejectEvent: Unit, timeout: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("promise")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], rejectEvent.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def timeout[TPromise /* <: PromiseLike[Any] */](promise: TPromise, ms: Double): /* import warning: importer.ImportType#apply Failed type conversion: TPromise extends std.PromiseLike<infer TValue> ? std.Promise<TValue> : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(promise.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TPromise extends std.PromiseLike<infer TValue> ? std.Promise<TValue> : never */ js.Any]
}
