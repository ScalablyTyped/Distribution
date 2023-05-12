package typings.xmppEvents

import typings.node.eventsMod.DOMEventTarget
import typings.node.eventsMod.NodeEventTarget
import typings.node.eventsMod.StaticEventEmitterOptions
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.node.timersMod.global.NodeJS.Timeout
import typings.std.AsyncIterableIterator
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Promise<void> & {  timeout :node.timers.<global>.NodeJS.Timeout | number} */
  @js.native
  trait PromisevoidtimeoutTimeout extends StObject {
    
    /**
      * Attaches a callback for only the rejection of the Promise.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of the callback.
      */
    /* standard es5 */
    def `catch`[TResult](): js.Promise[Unit | TResult] = js.native
    def `catch`[TResult](onrejected: js.Function1[/* reason */ Any, TResult | PromiseLike[TResult]]): js.Promise[Unit | TResult] = js.native
    
    /**
      * Attaches a callback that is invoked when the Promise is settled (fulfilled or rejected). The
      * resolved value cannot be modified from the callback.
      * @param onfinally The callback to execute when the Promise is settled (fulfilled or rejected).
      * @returns A Promise for the completion of the callback.
      */
    /* standard es2018.promise */
    def `finally`(): js.Promise[Unit] = js.native
    def `finally`(onfinally: js.Function0[Unit]): js.Promise[Unit] = js.native
    
    /**
      * Attaches callbacks for the resolution and/or rejection of the Promise.
      * @param onfulfilled The callback to execute when the Promise is resolved.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of which ever callback is executed.
      */
    /* standard es5 */
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ Unit, TResult1 | PromiseLike[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ Unit, TResult1 | PromiseLike[TResult1]],
      onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
    
    var timeout: Timeout | Double = js.native
    
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.toStringTag)
    val toStringTag: String = js.native
  }
  
  @js.native
  trait TypeofEventEmitter extends StObject {
    
    /**
      * Value: `Symbol.for('nodejs.rejection')`
      *
      * See how to write a custom `rejection handler`.
      * @since v13.4.0, v12.16.0
      */
    /* static member */
    val captureRejectionSymbol: js.Symbol = js.native
    
    /**
      * Value: [boolean](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#Boolean_type)
      *
      * Change the default `captureRejections` option on all new `EventEmitter` objects.
      * @since v13.4.0, v12.16.0
      */
    /* static member */
    var captureRejections: Boolean = js.native
    
    /**
      * By default, a maximum of `10` listeners can be registered for any single
      * event. This limit can be changed for individual `EventEmitter` instances
      * using the `emitter.setMaxListeners(n)` method. To change the default
      * for _all_`EventEmitter` instances, the `events.defaultMaxListeners`property can be used. If this value is not a positive number, a `RangeError`is thrown.
      *
      * Take caution when setting the `events.defaultMaxListeners` because the
      * change affects _all_`EventEmitter` instances, including those created before
      * the change is made. However, calling `emitter.setMaxListeners(n)` still has
      * precedence over `events.defaultMaxListeners`.
      *
      * This is not a hard limit. The `EventEmitter` instance will allow
      * more listeners to be added but will output a trace warning to stderr indicating
      * that a "possible EventEmitter memory leak" has been detected. For any single`EventEmitter`, the `emitter.getMaxListeners()` and `emitter.setMaxListeners()`methods can be used to
      * temporarily avoid this warning:
      *
      * ```js
      * import { EventEmitter } from 'node:events';
      * const emitter = new EventEmitter();
      * emitter.setMaxListeners(emitter.getMaxListeners() + 1);
      * emitter.once('event', () => {
      *   // do stuff
      *   emitter.setMaxListeners(Math.max(emitter.getMaxListeners() - 1, 0));
      * });
      * ```
      *
      * The `--trace-warnings` command-line flag can be used to display the
      * stack trace for such warnings.
      *
      * The emitted warning can be inspected with `process.on('warning')` and will
      * have the additional `emitter`, `type`, and `count` properties, referring to
      * the event emitter instance, the event's name and the number of attached
      * listeners, respectively.
      * Its `name` property is set to `'MaxListenersExceededWarning'`.
      * @since v0.11.2
      */
    /* static member */
    var defaultMaxListeners: Double = js.native
    
    /**
      * This symbol shall be used to install a listener for only monitoring `'error'`events. Listeners installed using this symbol are called before the regular`'error'` listeners are called.
      *
      * Installing a listener using this symbol does not change the behavior once an`'error'` event is emitted. Therefore, the process will still crash if no
      * regular `'error'` listener is installed.
      * @since v13.6.0, v12.17.0
      */
    /* static member */
    val errorMonitor: js.Symbol = js.native
    
    /**
      * Returns a copy of the array of listeners for the event named `eventName`.
      *
      * For `EventEmitter`s this behaves exactly the same as calling `.listeners` on
      * the emitter.
      *
      * For `EventTarget`s this is the only way to get the event listeners for the
      * event target. This is useful for debugging and diagnostic purposes.
      *
      * ```js
      * import { getEventListeners, EventEmitter } from 'node:events';
      *
      * {
      *   const ee = new EventEmitter();
      *   const listener = () => console.log('Events are fun');
      *   ee.on('foo', listener);
      *   console.log(getEventListeners(ee, 'foo')); // [ [Function: listener] ]
      * }
      * {
      *   const et = new EventTarget();
      *   const listener = () => console.log('Events are fun');
      *   et.addEventListener('foo', listener);
      *   console.log(getEventListeners(et, 'foo')); // [ [Function: listener] ]
      * }
      * ```
      * @since v15.2.0, v14.17.0
      */
    /* static member */
    def getEventListeners(emitter: DOMEventTarget, name: String): js.Array[js.Function] = js.native
    def getEventListeners(emitter: DOMEventTarget, name: js.Symbol): js.Array[js.Function] = js.native
    def getEventListeners(emitter: EventEmitter, name: String): js.Array[js.Function] = js.native
    def getEventListeners(emitter: EventEmitter, name: js.Symbol): js.Array[js.Function] = js.native
    
    /**
      * A class method that returns the number of listeners for the given `eventName`registered on the given `emitter`.
      *
      * ```js
      * import { EventEmitter, listenerCount } from 'node:events';
      *
      * const myEmitter = new EventEmitter();
      * myEmitter.on('event', () => {});
      * myEmitter.on('event', () => {});
      * console.log(listenerCount(myEmitter, 'event'));
      * // Prints: 2
      * ```
      * @since v0.9.12
      * @deprecated Since v3.2.0 - Use `listenerCount` instead.
      * @param emitter The emitter to query
      * @param eventName The event name
      */
    /* static member */
    def listenerCount(emitter: EventEmitter, eventName: String): Double = js.native
    def listenerCount(emitter: EventEmitter, eventName: js.Symbol): Double = js.native
    
    /**
      * ```js
      * import { on, EventEmitter } from 'node:events';
      * import process from 'node:process';
      *
      * const ee = new EventEmitter();
      *
      * // Emit later on
      * process.nextTick(() => {
      *   ee.emit('foo', 'bar');
      *   ee.emit('foo', 42);
      * });
      *
      * for await (const event of on(ee, 'foo')) {
      *   // The execution of this inner block is synchronous and it
      *   // processes one event at a time (even with await). Do not use
      *   // if concurrent execution is required.
      *   console.log(event); // prints ['bar'] [42]
      * }
      * // Unreachable here
      * ```
      *
      * Returns an `AsyncIterator` that iterates `eventName` events. It will throw
      * if the `EventEmitter` emits `'error'`. It removes all listeners when
      * exiting the loop. The `value` returned by each iteration is an array
      * composed of the emitted event arguments.
      *
      * An `AbortSignal` can be used to cancel waiting on events:
      *
      * ```js
      * import { on, EventEmitter } from 'node:events';
      * import process from 'node:process';
      *
      * const ac = new AbortController();
      *
      * (async () => {
      *   const ee = new EventEmitter();
      *
      *   // Emit later on
      *   process.nextTick(() => {
      *     ee.emit('foo', 'bar');
      *     ee.emit('foo', 42);
      *   });
      *
      *   for await (const event of on(ee, 'foo', { signal: ac.signal })) {
      *     // The execution of this inner block is synchronous and it
      *     // processes one event at a time (even with await). Do not use
      *     // if concurrent execution is required.
      *     console.log(event); // prints ['bar'] [42]
      *   }
      *   // Unreachable here
      * })();
      *
      * process.nextTick(() => ac.abort());
      * ```
      * @since v13.6.0, v12.16.0
      * @param eventName The name of the event being listened for
      * @return that iterates `eventName` events emitted by the `emitter`
      */
    /* static member */
    def on(emitter: EventEmitter, eventName: String): AsyncIterableIterator[Any] = js.native
    def on(emitter: EventEmitter, eventName: String, options: StaticEventEmitterOptions): AsyncIterableIterator[Any] = js.native
    
    /* static member */
    def once(emitter: DOMEventTarget, eventName: String): js.Promise[js.Array[Any]] = js.native
    def once(emitter: DOMEventTarget, eventName: String, options: StaticEventEmitterOptions): js.Promise[js.Array[Any]] = js.native
    /**
      * Creates a `Promise` that is fulfilled when the `EventEmitter` emits the given
      * event or that is rejected if the `EventEmitter` emits `'error'` while waiting.
      * The `Promise` will resolve with an array of all the arguments emitted to the
      * given event.
      *
      * This method is intentionally generic and works with the web platform [EventTarget](https://dom.spec.whatwg.org/#interface-eventtarget) interface, which has no special`'error'` event
      * semantics and does not listen to the `'error'` event.
      *
      * ```js
      * import { once, EventEmitter } from 'node:events';
      * import process from 'node:process';
      *
      * const ee = new EventEmitter();
      *
      * process.nextTick(() => {
      *   ee.emit('myevent', 42);
      * });
      *
      * const [value] = await once(ee, 'myevent');
      * console.log(value);
      *
      * const err = new Error('kaboom');
      * process.nextTick(() => {
      *   ee.emit('error', err);
      * });
      *
      * try {
      *   await once(ee, 'myevent');
      * } catch (err) {
      *   console.error('error happened', err);
      * }
      * ```
      *
      * The special handling of the `'error'` event is only used when `events.once()`is used to wait for another event. If `events.once()` is used to wait for the
      * '`error'` event itself, then it is treated as any other kind of event without
      * special handling:
      *
      * ```js
      * import { EventEmitter, once } from 'node:events';
      *
      * const ee = new EventEmitter();
      *
      * once(ee, 'error')
      *   .then(([err]) => console.log('ok', err.message))
      *   .catch((err) => console.error('error', err.message));
      *
      * ee.emit('error', new Error('boom'));
      *
      * // Prints: ok boom
      * ```
      *
      * An `AbortSignal` can be used to cancel waiting for the event:
      *
      * ```js
      * import { EventEmitter, once } from 'node:events';
      *
      * const ee = new EventEmitter();
      * const ac = new AbortController();
      *
      * async function foo(emitter, event, signal) {
      *   try {
      *     await once(emitter, event, { signal });
      *     console.log('event emitted!');
      *   } catch (error) {
      *     if (error.name === 'AbortError') {
      *       console.error('Waiting for the event was canceled!');
      *     } else {
      *       console.error('There was an error', error.message);
      *     }
      *   }
      * }
      *
      * foo(ee, 'foo', ac.signal);
      * ac.abort(); // Abort waiting for the event
      * ee.emit('foo'); // Prints: Waiting for the event was canceled!
      * ```
      * @since v11.13.0, v10.16.0
      */
    /* static member */
    def once(emitter: NodeEventTarget, eventName: String): js.Promise[js.Array[Any]] = js.native
    def once(emitter: NodeEventTarget, eventName: String, options: StaticEventEmitterOptions): js.Promise[js.Array[Any]] = js.native
    def once(emitter: NodeEventTarget, eventName: js.Symbol): js.Promise[js.Array[Any]] = js.native
    def once(emitter: NodeEventTarget, eventName: js.Symbol, options: StaticEventEmitterOptions): js.Promise[js.Array[Any]] = js.native
    
    /**
      * ```js
      * import { setMaxListeners, EventEmitter } from 'node:events';
      *
      * const target = new EventTarget();
      * const emitter = new EventEmitter();
      *
      * setMaxListeners(5, target, emitter);
      * ```
      * @since v15.4.0
      * @param n A non-negative number. The maximum number of listeners per `EventTarget` event.
      * @param eventsTargets Zero or more {EventTarget} or {EventEmitter} instances. If none are specified, `n` is set as the default max for all newly created {EventTarget} and {EventEmitter}
      * objects.
      */
    /* static member */
    def setMaxListeners(n: Double, eventTargets: (DOMEventTarget | EventEmitter)*): Unit = js.native
    def setMaxListeners(n: Unit, eventTargets: (DOMEventTarget | EventEmitter)*): Unit = js.native
  }
}
