package typings.xstream.mod

import typings.std.Partial
import typings.xstream.anon.Subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstream", "Stream")
@js.native
class Stream[T] () extends InternalListener[T] {
  def this(producer: InternalProducer[T]) = this()
  var _d: Boolean = js.native
  var _dl: InternalListener[T] = js.native
  var _err: js.Any = js.native
  var _ils: js.Array[InternalListener[T]] = js.native
  var _prod: InternalProducer[T] = js.native
  var _stopID: js.Any = js.native
  var _target: Stream[T] | Null = js.native
  var ctor: js.Any = js.native
  def _add(il: InternalListener[T]): Unit = js.native
  def _hasNoSinks(x: InternalListener[_], trace: js.Array[_]): Boolean = js.native
  /* protected */ def _map[U](project: js.Function1[/* t */ T, U]): Stream[U] | MemoryStream[U] = js.native
  def _pruneCycles(): Unit = js.native
  def _remove(il: InternalListener[T]): Unit = js.native
  def _stopNow(): Unit = js.native
  def _x(): Unit = js.native
  /**
    * Adds a Listener to the Stream.
    *
    * @param {Listener} listener
    */
  def addListener(listener: Partial[Listener[T]]): Unit = js.native
  /**
    * Passes the input stream to a custom operator, to produce an output stream.
    *
    * *compose* is a handy way of using an existing function in a chained style.
    * Instead of writing `outStream = f(inStream)` you can write
    * `outStream = inStream.compose(f)`.
    *
    * @param {function} operator A function that takes a stream as input and
    * returns a stream as well.
    * @return {Stream}
    */
  def compose[U](operator: js.Function1[/* stream */ Stream[T], U]): U = js.native
  def debug(): Stream[T] = js.native
  def debug(labelOrSpy: String): Stream[T] = js.native
  def debug(labelOrSpy: js.Function1[/* t */ T, _]): Stream[T] = js.native
  /**
    * Ignores the first `amount` many events from the input stream, and then
    * after that starts forwarding events from the input stream to the output
    * stream.
    *
    * Marble diagram:
    *
    * ```text
    * --a---b--c----d---e--
    *       drop(3)
    * --------------d---e--
    * ```
    *
    * @param {number} amount How many events to ignore from the input stream
    * before forwarding all events from the input stream to the output stream.
    * @return {Stream}
    */
  def drop(amount: Double): Stream[T] = js.native
  /**
    * Uses another stream to determine when to complete the current stream.
    *
    * When the given `other` stream emits an event or completes, the output
    * stream will complete. Before that happens, the output stream will behaves
    * like the input stream.
    *
    * Marble diagram:
    *
    * ```text
    * ---1---2-----3--4----5----6---
    *   endWhen( --------a--b--| )
    * ---1---2-----3--4--|
    * ```
    *
    * @param other Some other stream that is used to know when should the output
    * stream of this operator complete.
    * @return {Stream}
    */
  def endWhen(other: Stream[_]): Stream[T] = js.native
  def filter(passes: js.Function1[/* t */ T, Boolean]): Stream[T] = js.native
  @JSName("filter")
  def filter_S_T[S /* <: T */](passes: js.Function1[/* t */ T, /* is S */ Boolean]): Stream[S] = js.native
  /**
    * Flattens a "stream of streams", handling only one nested stream at a time
    * (no concurrency).
    *
    * If the input stream is a stream that emits streams, then this operator will
    * return an output stream which is a flat stream: emits regular events. The
    * flattening happens without concurrency. It works like this: when the input
    * stream emits a nested stream, *flatten* will start imitating that nested
    * one. However, as soon as the next nested stream is emitted on the input
    * stream, *flatten* will forget the previous nested one it was imitating, and
    * will start imitating the new nested one.
    *
    * Marble diagram:
    *
    * ```text
    * --+--------+---------------
    *   \        \
    *    \       ----1----2---3--
    *    --a--b----c----d--------
    *           flatten
    * -----a--b------1----2---3--
    * ```
    *
    * @return {Stream}
    */
  def flatten[R](): Stream[R] = js.native
  /**
    * "Folds" the stream onto itself.
    *
    * Combines events from the past throughout
    * the entire execution of the input stream, allowing you to accumulate them
    * together. It's essentially like `Array.prototype.reduce`. The returned
    * stream is a MemoryStream, which means it is already `remember()`'d.
    *
    * The output stream starts by emitting the `seed` which you give as argument.
    * Then, when an event happens on the input stream, it is combined with that
    * seed value through the `accumulate` function, and the output value is
    * emitted on the output stream. `fold` remembers that output value as `acc`
    * ("accumulator"), and then when a new input event `t` happens, `acc` will be
    * combined with that to produce the new `acc` and so forth.
    *
    * Marble diagram:
    *
    * ```text
    * ------1-----1--2----1----1------
    *   fold((acc, x) => acc + x, 3)
    * 3-----4-----5--7----8----9------
    * ```
    *
    * @param {Function} accumulate A function of type `(acc: R, t: T) => R` that
    * takes the previous accumulated value `acc` and the incoming event from the
    * input stream and produces the new accumulated value.
    * @param seed The initial accumulated value, of type `R`.
    * @return {MemoryStream}
    */
  def fold[R](accumulate: js.Function2[/* acc */ R, /* t */ T, R], seed: R): MemoryStream[R] = js.native
  /**
    * *imitate* changes this current Stream to emit the same events that the
    * `other` given Stream does. This method returns nothing.
    *
    * This method exists to allow one thing: **circular dependency of streams**.
    * For instance, let's imagine that for some reason you need to create a
    * circular dependency where stream `first$` depends on stream `second$`
    * which in turn depends on `first$`:
    *
    * <!-- skip-example -->
    * ```js
    * import delay from 'xstream/extra/delay'
    *
    * var first$ = second$.map(x => x * 10).take(3);
    * var second$ = first$.map(x => x + 1).startWith(1).compose(delay(100));
    * ```
    *
    * However, that is invalid JavaScript, because `second$` is undefined
    * on the first line. This is how *imitate* can help solve it:
    *
    * ```js
    * import delay from 'xstream/extra/delay'
    *
    * var secondProxy$ = xs.create();
    * var first$ = secondProxy$.map(x => x * 10).take(3);
    * var second$ = first$.map(x => x + 1).startWith(1).compose(delay(100));
    * secondProxy$.imitate(second$);
    * ```
    *
    * We create `secondProxy$` before the others, so it can be used in the
    * declaration of `first$`. Then, after both `first$` and `second$` are
    * defined, we hook `secondProxy$` with `second$` with `imitate()` to tell
    * that they are "the same". `imitate` will not trigger the start of any
    * stream, it just binds `secondProxy$` and `second$` together.
    *
    * The following is an example where `imitate()` is important in Cycle.js
    * applications. A parent component contains some child components. A child
    * has an action stream which is given to the parent to define its state:
    *
    * <!-- skip-example -->
    * ```js
    * const childActionProxy$ = xs.create();
    * const parent = Parent({...sources, childAction$: childActionProxy$});
    * const childAction$ = parent.state$.map(s => s.child.action$).flatten();
    * childActionProxy$.imitate(childAction$);
    * ```
    *
    * Note, though, that **`imitate()` does not support MemoryStreams**. If we
    * would attempt to imitate a MemoryStream in a circular dependency, we would
    * either get a race condition (where the symptom would be "nothing happens")
    * or an infinite cyclic emission of values. It's useful to think about
    * MemoryStreams as cells in a spreadsheet. It doesn't make any sense to
    * define a spreadsheet cell `A1` with a formula that depends on `B1` and
    * cell `B1` defined with a formula that depends on `A1`.
    *
    * If you find yourself wanting to use `imitate()` with a
    * MemoryStream, you should rework your code around `imitate()` to use a
    * Stream instead. Look for the stream in the circular dependency that
    * represents an event stream, and that would be a candidate for creating a
    * proxy Stream which then imitates the target Stream.
    *
    * @param {Stream} target The other stream to imitate on the current one. Must
    * not be a MemoryStream.
    */
  def imitate(target: Stream[T]): Unit = js.native
  /**
    * When the input stream completes, the output stream will emit the last event
    * emitted by the input stream, and then will also complete.
    *
    * Marble diagram:
    *
    * ```text
    * --a---b--c--d----|
    *       last()
    * -----------------d|
    * ```
    *
    * @return {Stream}
    */
  def last(): Stream[T] = js.native
  /**
    * Transforms each event from the input Stream through a `project` function,
    * to get a Stream that emits those transformed events.
    *
    * Marble diagram:
    *
    * ```text
    * --1---3--5-----7------
    *    map(i => i * 10)
    * --10--30-50----70-----
    * ```
    *
    * @param {Function} project A function of type `(t: T) => U` that takes event
    * `t` of type `T` from the input Stream and produces an event of type `U`, to
    * be emitted on the output Stream.
    * @return {Stream}
    */
  def map[U](project: js.Function1[/* t */ T, U]): Stream[U] = js.native
  /**
    * It's like `map`, but transforms each input event to always the same
    * constant value on the output Stream.
    *
    * Marble diagram:
    *
    * ```text
    * --1---3--5-----7-----
    *       mapTo(10)
    * --10--10-10----10----
    * ```
    *
    * @param projectedValue A value to emit on the output Stream whenever the
    * input Stream emits any value.
    * @return {Stream}
    */
  def mapTo[U](projectedValue: U): Stream[U] = js.native
  /**
    * Returns an output stream that behaves like the input stream, but also
    * remembers the most recent event that happens on the input stream, so that a
    * newly added listener will immediately receive that memorised event.
    *
    * @return {MemoryStream}
    */
  def remember(): MemoryStream[T] = js.native
  /**
    * Removes a Listener from the Stream, assuming the Listener was added to it.
    *
    * @param {Listener<T>} listener
    */
  def removeListener(listener: Partial[Listener[T]]): Unit = js.native
  /**
    * Replaces an error with another stream.
    *
    * When (and if) an error happens on the input stream, instead of forwarding
    * that error to the output stream, *replaceError* will call the `replace`
    * function which returns the stream that the output stream will replicate.
    * And, in case that new stream also emits an error, `replace` will be called
    * again to get another stream to start replicating.
    *
    * Marble diagram:
    *
    * ```text
    * --1---2-----3--4-----X
    *   replaceError( () => --10--| )
    * --1---2-----3--4--------10--|
    * ```
    *
    * @param {Function} replace A function of type `(err) => Stream` that takes
    * the error that occurred on the input stream or on the previous replacement
    * stream and returns a new stream. The output stream will behave like the
    * stream that this function returns.
    * @return {Stream}
    */
  def replaceError(replace: js.Function1[/* err */ js.Any, Stream[T]]): Stream[T] = js.native
  /**
    * Adds a "debug" listener to the stream. There can only be one debug
    * listener, that's why this is 'setDebugListener'. To remove the debug
    * listener, just call setDebugListener(null).
    *
    * A debug listener is like any other listener. The only difference is that a
    * debug listener is "stealthy": its presence/absence does not trigger the
    * start/stop of the stream (or the producer inside the stream). This is
    * useful so you can inspect what is going on without changing the behavior
    * of the program. If you have an idle stream and you add a normal listener to
    * it, the stream will start executing. But if you set a debug listener on an
    * idle stream, it won't start executing (not until the first normal listener
    * is added).
    *
    * As the name indicates, we don't recommend using this method to build app
    * logic. In fact, in most cases the debug operator works just fine. Only use
    * this one if you know what you're doing.
    *
    * @param {Listener<T>} listener
    */
  def setDebugListener(): Unit = js.native
  def setDebugListener(listener: Partial[Listener[T]]): Unit = js.native
  /**
    * Forces the Stream to emit the "completed" event to its listeners.
    *
    * As the name indicates, if you use this, you are most likely doing something
    * The Wrong Way. Please try to understand the reactive way before using this
    * method. Use it only when you know what you are doing.
    */
  def shamefullySendComplete(): Unit = js.native
  /**
    * Forces the Stream to emit the given error to its listeners.
    *
    * As the name indicates, if you use this, you are most likely doing something
    * The Wrong Way. Please try to understand the reactive way before using this
    * method. Use it only when you know what you are doing.
    *
    * @param {any} error The error you want to broadcast to all the listeners of
    * this Stream.
    */
  def shamefullySendError(error: js.Any): Unit = js.native
  /**
    * Forces the Stream to emit the given value to its listeners.
    *
    * As the name indicates, if you use this, you are most likely doing something
    * The Wrong Way. Please try to understand the reactive way before using this
    * method. Use it only when you know what you are doing.
    *
    * @param value The "next" value you want to broadcast to all listeners of
    * this Stream.
    */
  def shamefullySendNext(value: T): Unit = js.native
  /**
    * Prepends the given `initial` value to the sequence of events emitted by the
    * input stream. The returned stream is a MemoryStream, which means it is
    * already `remember()`'d.
    *
    * Marble diagram:
    *
    * ```text
    * ---1---2-----3---
    *   startWith(0)
    * 0--1---2-----3---
    * ```
    *
    * @param initial The value or event to prepend.
    * @return {MemoryStream}
    */
  def startWith(initial: T): MemoryStream[T] = js.native
  /**
    * Adds a Listener to the Stream returning a Subscription to remove that
    * listener.
    *
    * @param {Listener} listener
    * @returns {Subscription}
    */
  def subscribe(listener: Partial[Listener[T]]): Subscription = js.native
  /**
    * Lets the first `amount` many events from the input stream pass to the
    * output stream, then makes the output stream complete.
    *
    * Marble diagram:
    *
    * ```text
    * --a---b--c----d---e--
    *    take(3)
    * --a---b--c|
    * ```
    *
    * @param {number} amount How many events to allow from the input stream
    * before completing the output stream.
    * @return {Stream}
    */
  def take(amount: Double): Stream[T] = js.native
}

/* static members */
@JSImport("xstream", "Stream")
@js.native
object Stream extends js.Object {
  /**
    * Combines multiple input streams together to return a stream whose events
    * are arrays that collect the latest events from each input stream.
    *
    * *combine* internally remembers the most recent event from each of the input
    * streams. When any of the input streams emits an event, that event together
    * with all the other saved events are combined into an array. That array will
    * be emitted on the output stream. It's essentially a way of joining together
    * the events from multiple streams.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b-----c--d------
    *          combine
    * ----1a-2a-2b-3b-3c-3d-4d--
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to combine together with other streams.
    * @param {Stream} stream2 A stream to combine together with other streams.
    * Multiple streams, not just two, may be given as arguments.
    * @return {Stream}
    */
  @JSName("combine")
  var combine_Original: CombineSignature = js.native
  /**
    * Blends multiple streams together, emitting events from all of them
    * concurrently.
    *
    * *merge* takes multiple streams as arguments, and creates a stream that
    * behaves like each of the argument streams, in parallel.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b----c---d------
    *            merge
    * --1-a--2--b--3-c---d--4---
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to merge together with other streams.
    * @param {Stream} stream2 A stream to merge together with other streams. Two
    * or more streams may be given as arguments.
    * @return {Stream}
    */
  @JSName("merge")
  var merge_Original: MergeSignature = js.native
  /**
    * Combines multiple input streams together to return a stream whose events
    * are arrays that collect the latest events from each input stream.
    *
    * *combine* internally remembers the most recent event from each of the input
    * streams. When any of the input streams emits an event, that event together
    * with all the other saved events are combined into an array. That array will
    * be emitted on the output stream. It's essentially a way of joining together
    * the events from multiple streams.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b-----c--d------
    *          combine
    * ----1a-2a-2b-3b-3c-3d-4d--
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to combine together with other streams.
    * @param {Stream} stream2 A stream to combine together with other streams.
    * Multiple streams, not just two, may be given as arguments.
    * @return {Stream}
    */
  def combine(): Stream[js.Array[_]] = js.native
  /**
    * Combines multiple input streams together to return a stream whose events
    * are arrays that collect the latest events from each input stream.
    *
    * *combine* internally remembers the most recent event from each of the input
    * streams. When any of the input streams emits an event, that event together
    * with all the other saved events are combined into an array. That array will
    * be emitted on the output stream. It's essentially a way of joining together
    * the events from multiple streams.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b-----c--d------
    *          combine
    * ----1a-2a-2b-3b-3c-3d-4d--
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to combine together with other streams.
    * @param {Stream} stream2 A stream to combine together with other streams.
    * Multiple streams, not just two, may be given as arguments.
    * @return {Stream}
    */
  def combine(stream: Stream[_]*): Stream[js.Array[_]] = js.native
  /**
    * Combines multiple input streams together to return a stream whose events
    * are arrays that collect the latest events from each input stream.
    *
    * *combine* internally remembers the most recent event from each of the input
    * streams. When any of the input streams emits an event, that event together
    * with all the other saved events are combined into an array. That array will
    * be emitted on the output stream. It's essentially a way of joining together
    * the events from multiple streams.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b-----c--d------
    *          combine
    * ----1a-2a-2b-3b-3c-3d-4d--
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to combine together with other streams.
    * @param {Stream} stream2 A stream to combine together with other streams.
    * Multiple streams, not just two, may be given as arguments.
    * @return {Stream}
    */
  def combine[T1](s1: Stream[T1]): Stream[js.Array[T1]] = js.native
  /**
    * Combines multiple input streams together to return a stream whose events
    * are arrays that collect the latest events from each input stream.
    *
    * *combine* internally remembers the most recent event from each of the input
    * streams. When any of the input streams emits an event, that event together
    * with all the other saved events are combined into an array. That array will
    * be emitted on the output stream. It's essentially a way of joining together
    * the events from multiple streams.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b-----c--d------
    *          combine
    * ----1a-2a-2b-3b-3c-3d-4d--
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to combine together with other streams.
    * @param {Stream} stream2 A stream to combine together with other streams.
    * Multiple streams, not just two, may be given as arguments.
    * @return {Stream}
    */
  def combine[T1, T2](s1: Stream[T1], s2: Stream[T2]): Stream[js.Tuple2[T1, T2]] = js.native
  /**
    * Combines multiple input streams together to return a stream whose events
    * are arrays that collect the latest events from each input stream.
    *
    * *combine* internally remembers the most recent event from each of the input
    * streams. When any of the input streams emits an event, that event together
    * with all the other saved events are combined into an array. That array will
    * be emitted on the output stream. It's essentially a way of joining together
    * the events from multiple streams.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b-----c--d------
    *          combine
    * ----1a-2a-2b-3b-3c-3d-4d--
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to combine together with other streams.
    * @param {Stream} stream2 A stream to combine together with other streams.
    * Multiple streams, not just two, may be given as arguments.
    * @return {Stream}
    */
  def combine[T1, T2, T3](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3]): Stream[js.Tuple3[T1, T2, T3]] = js.native
  /**
    * Combines multiple input streams together to return a stream whose events
    * are arrays that collect the latest events from each input stream.
    *
    * *combine* internally remembers the most recent event from each of the input
    * streams. When any of the input streams emits an event, that event together
    * with all the other saved events are combined into an array. That array will
    * be emitted on the output stream. It's essentially a way of joining together
    * the events from multiple streams.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b-----c--d------
    *          combine
    * ----1a-2a-2b-3b-3c-3d-4d--
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to combine together with other streams.
    * @param {Stream} stream2 A stream to combine together with other streams.
    * Multiple streams, not just two, may be given as arguments.
    * @return {Stream}
    */
  def combine[T1, T2, T3, T4](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4]): Stream[js.Tuple4[T1, T2, T3, T4]] = js.native
  /**
    * Combines multiple input streams together to return a stream whose events
    * are arrays that collect the latest events from each input stream.
    *
    * *combine* internally remembers the most recent event from each of the input
    * streams. When any of the input streams emits an event, that event together
    * with all the other saved events are combined into an array. That array will
    * be emitted on the output stream. It's essentially a way of joining together
    * the events from multiple streams.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b-----c--d------
    *          combine
    * ----1a-2a-2b-3b-3c-3d-4d--
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to combine together with other streams.
    * @param {Stream} stream2 A stream to combine together with other streams.
    * Multiple streams, not just two, may be given as arguments.
    * @return {Stream}
    */
  def combine[T1, T2, T3, T4, T5](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4], s5: Stream[T5]): Stream[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  /**
    * Combines multiple input streams together to return a stream whose events
    * are arrays that collect the latest events from each input stream.
    *
    * *combine* internally remembers the most recent event from each of the input
    * streams. When any of the input streams emits an event, that event together
    * with all the other saved events are combined into an array. That array will
    * be emitted on the output stream. It's essentially a way of joining together
    * the events from multiple streams.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b-----c--d------
    *          combine
    * ----1a-2a-2b-3b-3c-3d-4d--
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to combine together with other streams.
    * @param {Stream} stream2 A stream to combine together with other streams.
    * Multiple streams, not just two, may be given as arguments.
    * @return {Stream}
    */
  def combine[T1, T2, T3, T4, T5, T6](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4], s5: Stream[T5], s6: Stream[T6]): Stream[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
  /**
    * Combines multiple input streams together to return a stream whose events
    * are arrays that collect the latest events from each input stream.
    *
    * *combine* internally remembers the most recent event from each of the input
    * streams. When any of the input streams emits an event, that event together
    * with all the other saved events are combined into an array. That array will
    * be emitted on the output stream. It's essentially a way of joining together
    * the events from multiple streams.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b-----c--d------
    *          combine
    * ----1a-2a-2b-3b-3c-3d-4d--
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to combine together with other streams.
    * @param {Stream} stream2 A stream to combine together with other streams.
    * Multiple streams, not just two, may be given as arguments.
    * @return {Stream}
    */
  def combine[T1, T2, T3, T4, T5, T6, T7](
    s1: Stream[T1],
    s2: Stream[T2],
    s3: Stream[T3],
    s4: Stream[T4],
    s5: Stream[T5],
    s6: Stream[T6],
    s7: Stream[T7]
  ): Stream[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
  /**
    * Combines multiple input streams together to return a stream whose events
    * are arrays that collect the latest events from each input stream.
    *
    * *combine* internally remembers the most recent event from each of the input
    * streams. When any of the input streams emits an event, that event together
    * with all the other saved events are combined into an array. That array will
    * be emitted on the output stream. It's essentially a way of joining together
    * the events from multiple streams.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b-----c--d------
    *          combine
    * ----1a-2a-2b-3b-3c-3d-4d--
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to combine together with other streams.
    * @param {Stream} stream2 A stream to combine together with other streams.
    * Multiple streams, not just two, may be given as arguments.
    * @return {Stream}
    */
  def combine[T1, T2, T3, T4, T5, T6, T7, T8](
    s1: Stream[T1],
    s2: Stream[T2],
    s3: Stream[T3],
    s4: Stream[T4],
    s5: Stream[T5],
    s6: Stream[T6],
    s7: Stream[T7],
    s8: Stream[T8]
  ): Stream[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
  /**
    * Combines multiple input streams together to return a stream whose events
    * are arrays that collect the latest events from each input stream.
    *
    * *combine* internally remembers the most recent event from each of the input
    * streams. When any of the input streams emits an event, that event together
    * with all the other saved events are combined into an array. That array will
    * be emitted on the output stream. It's essentially a way of joining together
    * the events from multiple streams.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b-----c--d------
    *          combine
    * ----1a-2a-2b-3b-3c-3d-4d--
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to combine together with other streams.
    * @param {Stream} stream2 A stream to combine together with other streams.
    * Multiple streams, not just two, may be given as arguments.
    * @return {Stream}
    */
  def combine[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    s1: Stream[T1],
    s2: Stream[T2],
    s3: Stream[T3],
    s4: Stream[T4],
    s5: Stream[T5],
    s6: Stream[T6],
    s7: Stream[T7],
    s8: Stream[T8],
    s9: Stream[T9]
  ): Stream[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
  /**
    * Combines multiple input streams together to return a stream whose events
    * are arrays that collect the latest events from each input stream.
    *
    * *combine* internally remembers the most recent event from each of the input
    * streams. When any of the input streams emits an event, that event together
    * with all the other saved events are combined into an array. That array will
    * be emitted on the output stream. It's essentially a way of joining together
    * the events from multiple streams.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b-----c--d------
    *          combine
    * ----1a-2a-2b-3b-3c-3d-4d--
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to combine together with other streams.
    * @param {Stream} stream2 A stream to combine together with other streams.
    * Multiple streams, not just two, may be given as arguments.
    * @return {Stream}
    */
  def combine[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    s1: Stream[T1],
    s2: Stream[T2],
    s3: Stream[T3],
    s4: Stream[T4],
    s5: Stream[T5],
    s6: Stream[T6],
    s7: Stream[T7],
    s8: Stream[T8],
    s9: Stream[T9],
    s10: Stream[T10]
  ): Stream[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
  /**
    * Combines multiple input streams together to return a stream whose events
    * are arrays that collect the latest events from each input stream.
    *
    * *combine* internally remembers the most recent event from each of the input
    * streams. When any of the input streams emits an event, that event together
    * with all the other saved events are combined into an array. That array will
    * be emitted on the output stream. It's essentially a way of joining together
    * the events from multiple streams.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b-----c--d------
    *          combine
    * ----1a-2a-2b-3b-3c-3d-4d--
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to combine together with other streams.
    * @param {Stream} stream2 A stream to combine together with other streams.
    * Multiple streams, not just two, may be given as arguments.
    * @return {Stream}
    */
  @JSName("combine")
  def combine_T[T](stream: Stream[T]*): Stream[js.Array[T]] = js.native
  /**
    * Creates a new Stream given a Producer.
    *
    * @factory true
    * @param {Producer} producer An optional Producer that dictates how to
    * start, generate events, and stop the Stream.
    * @return {Stream}
    */
  def create[T](): Stream[T] = js.native
  def create[T](producer: Producer[T]): Stream[T] = js.native
  /**
    * Creates a new MemoryStream given a Producer.
    *
    * @factory true
    * @param {Producer} producer An optional Producer that dictates how to
    * start, generate events, and stop the Stream.
    * @return {MemoryStream}
    */
  def createWithMemory[T](): MemoryStream[T] = js.native
  def createWithMemory[T](producer: Producer[T]): MemoryStream[T] = js.native
  /**
    * Creates a Stream that immediately emits the "complete" notification when
    * started, and that's it.
    *
    * Marble diagram:
    *
    * ```text
    * empty
    * -|
    * ```
    *
    * @factory true
    * @return {Stream}
    */
  def empty(): Stream[_] = js.native
  def from[T](input: js.Array[T]): Stream[T] = js.native
  /**
    * Creates a stream from an Array, Promise, or an Observable.
    *
    * @factory true
    * @param {Array|PromiseLike|Observable} input The input to make a stream from.
    * @return {Stream}
    */
  def from[T](input: js.Thenable[T]): Stream[T] = js.native
  def from[T](input: Observable[T]): Stream[T] = js.native
  def from[T](input: Stream[T]): Stream[T] = js.native
  /**
    * Converts an array to a stream. The returned stream will emit synchronously
    * all the items in the array, and then complete.
    *
    * Marble diagram:
    *
    * ```text
    * fromArray([1,2,3])
    * 123|
    * ```
    *
    * @factory true
    * @param {Array} array The array to be converted as a stream.
    * @return {Stream}
    */
  def fromArray[T](array: js.Array[T]): Stream[T] = js.native
  /**
    * Converts an Observable into a Stream.
    *
    * @factory true
    * @param {any} observable The observable to be converted as a stream.
    * @return {Stream}
    */
  def fromObservable[T](obs: Subscribe): Stream[T] = js.native
  /**
    * Converts a promise to a stream. The returned stream will emit the resolved
    * value of the promise, and then complete. However, if the promise is
    * rejected, the stream will emit the corresponding error.
    *
    * Marble diagram:
    *
    * ```text
    * fromPromise( ----42 )
    * -----------------42|
    * ```
    *
    * @factory true
    * @param {PromiseLike} promise The promise to be converted as a stream.
    * @return {Stream}
    */
  def fromPromise[T](promise: js.Thenable[T]): Stream[T] = js.native
  /**
    * Blends multiple streams together, emitting events from all of them
    * concurrently.
    *
    * *merge* takes multiple streams as arguments, and creates a stream that
    * behaves like each of the argument streams, in parallel.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b----c---d------
    *            merge
    * --1-a--2--b--3-c---d--4---
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to merge together with other streams.
    * @param {Stream} stream2 A stream to merge together with other streams. Two
    * or more streams may be given as arguments.
    * @return {Stream}
    */
  def merge(): Stream[_] = js.native
  /**
    * Blends multiple streams together, emitting events from all of them
    * concurrently.
    *
    * *merge* takes multiple streams as arguments, and creates a stream that
    * behaves like each of the argument streams, in parallel.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b----c---d------
    *            merge
    * --1-a--2--b--3-c---d--4---
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to merge together with other streams.
    * @param {Stream} stream2 A stream to merge together with other streams. Two
    * or more streams may be given as arguments.
    * @return {Stream}
    */
  def merge[T1](s1: Stream[T1]): Stream[T1] = js.native
  /**
    * Blends multiple streams together, emitting events from all of them
    * concurrently.
    *
    * *merge* takes multiple streams as arguments, and creates a stream that
    * behaves like each of the argument streams, in parallel.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b----c---d------
    *            merge
    * --1-a--2--b--3-c---d--4---
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to merge together with other streams.
    * @param {Stream} stream2 A stream to merge together with other streams. Two
    * or more streams may be given as arguments.
    * @return {Stream}
    */
  def merge[T](stream: Stream[T]*): Stream[T] = js.native
  /**
    * Blends multiple streams together, emitting events from all of them
    * concurrently.
    *
    * *merge* takes multiple streams as arguments, and creates a stream that
    * behaves like each of the argument streams, in parallel.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b----c---d------
    *            merge
    * --1-a--2--b--3-c---d--4---
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to merge together with other streams.
    * @param {Stream} stream2 A stream to merge together with other streams. Two
    * or more streams may be given as arguments.
    * @return {Stream}
    */
  def merge[T1, T2](s1: Stream[T1], s2: Stream[T2]): Stream[T1 | T2] = js.native
  /**
    * Blends multiple streams together, emitting events from all of them
    * concurrently.
    *
    * *merge* takes multiple streams as arguments, and creates a stream that
    * behaves like each of the argument streams, in parallel.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b----c---d------
    *            merge
    * --1-a--2--b--3-c---d--4---
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to merge together with other streams.
    * @param {Stream} stream2 A stream to merge together with other streams. Two
    * or more streams may be given as arguments.
    * @return {Stream}
    */
  def merge[T1, T2, T3](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3]): Stream[T1 | T2 | T3] = js.native
  /**
    * Blends multiple streams together, emitting events from all of them
    * concurrently.
    *
    * *merge* takes multiple streams as arguments, and creates a stream that
    * behaves like each of the argument streams, in parallel.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b----c---d------
    *            merge
    * --1-a--2--b--3-c---d--4---
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to merge together with other streams.
    * @param {Stream} stream2 A stream to merge together with other streams. Two
    * or more streams may be given as arguments.
    * @return {Stream}
    */
  def merge[T1, T2, T3, T4](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4]): Stream[T1 | T2 | T3 | T4] = js.native
  /**
    * Blends multiple streams together, emitting events from all of them
    * concurrently.
    *
    * *merge* takes multiple streams as arguments, and creates a stream that
    * behaves like each of the argument streams, in parallel.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b----c---d------
    *            merge
    * --1-a--2--b--3-c---d--4---
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to merge together with other streams.
    * @param {Stream} stream2 A stream to merge together with other streams. Two
    * or more streams may be given as arguments.
    * @return {Stream}
    */
  def merge[T1, T2, T3, T4, T5](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4], s5: Stream[T5]): Stream[T1 | T2 | T3 | T4 | T5] = js.native
  /**
    * Blends multiple streams together, emitting events from all of them
    * concurrently.
    *
    * *merge* takes multiple streams as arguments, and creates a stream that
    * behaves like each of the argument streams, in parallel.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b----c---d------
    *            merge
    * --1-a--2--b--3-c---d--4---
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to merge together with other streams.
    * @param {Stream} stream2 A stream to merge together with other streams. Two
    * or more streams may be given as arguments.
    * @return {Stream}
    */
  def merge[T1, T2, T3, T4, T5, T6](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4], s5: Stream[T5], s6: Stream[T6]): Stream[T1 | T2 | T3 | T4 | T5 | T6] = js.native
  /**
    * Blends multiple streams together, emitting events from all of them
    * concurrently.
    *
    * *merge* takes multiple streams as arguments, and creates a stream that
    * behaves like each of the argument streams, in parallel.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b----c---d------
    *            merge
    * --1-a--2--b--3-c---d--4---
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to merge together with other streams.
    * @param {Stream} stream2 A stream to merge together with other streams. Two
    * or more streams may be given as arguments.
    * @return {Stream}
    */
  def merge[T1, T2, T3, T4, T5, T6, T7](
    s1: Stream[T1],
    s2: Stream[T2],
    s3: Stream[T3],
    s4: Stream[T4],
    s5: Stream[T5],
    s6: Stream[T6],
    s7: Stream[T7]
  ): Stream[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
  /**
    * Blends multiple streams together, emitting events from all of them
    * concurrently.
    *
    * *merge* takes multiple streams as arguments, and creates a stream that
    * behaves like each of the argument streams, in parallel.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b----c---d------
    *            merge
    * --1-a--2--b--3-c---d--4---
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to merge together with other streams.
    * @param {Stream} stream2 A stream to merge together with other streams. Two
    * or more streams may be given as arguments.
    * @return {Stream}
    */
  def merge[T1, T2, T3, T4, T5, T6, T7, T8](
    s1: Stream[T1],
    s2: Stream[T2],
    s3: Stream[T3],
    s4: Stream[T4],
    s5: Stream[T5],
    s6: Stream[T6],
    s7: Stream[T7],
    s8: Stream[T8]
  ): Stream[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
  /**
    * Blends multiple streams together, emitting events from all of them
    * concurrently.
    *
    * *merge* takes multiple streams as arguments, and creates a stream that
    * behaves like each of the argument streams, in parallel.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b----c---d------
    *            merge
    * --1-a--2--b--3-c---d--4---
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to merge together with other streams.
    * @param {Stream} stream2 A stream to merge together with other streams. Two
    * or more streams may be given as arguments.
    * @return {Stream}
    */
  def merge[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    s1: Stream[T1],
    s2: Stream[T2],
    s3: Stream[T3],
    s4: Stream[T4],
    s5: Stream[T5],
    s6: Stream[T6],
    s7: Stream[T7],
    s8: Stream[T8],
    s9: Stream[T9]
  ): Stream[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
  /**
    * Blends multiple streams together, emitting events from all of them
    * concurrently.
    *
    * *merge* takes multiple streams as arguments, and creates a stream that
    * behaves like each of the argument streams, in parallel.
    *
    * Marble diagram:
    *
    * ```text
    * --1----2-----3--------4---
    * ----a-----b----c---d------
    *            merge
    * --1-a--2--b--3-c---d--4---
    * ```
    *
    * @factory true
    * @param {Stream} stream1 A stream to merge together with other streams.
    * @param {Stream} stream2 A stream to merge together with other streams. Two
    * or more streams may be given as arguments.
    * @return {Stream}
    */
  def merge[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    s1: Stream[T1],
    s2: Stream[T2],
    s3: Stream[T3],
    s4: Stream[T4],
    s5: Stream[T5],
    s6: Stream[T6],
    s7: Stream[T7],
    s8: Stream[T8],
    s9: Stream[T9],
    s10: Stream[T10]
  ): Stream[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
  /**
    * Creates a Stream that does nothing when started. It never emits any event.
    *
    * Marble diagram:
    *
    * ```text
    *          never
    * -----------------------
    * ```
    *
    * @factory true
    * @return {Stream}
    */
  def never(): Stream[_] = js.native
  /**
    * Creates a Stream that immediately emits the arguments that you give to
    * *of*, then completes.
    *
    * Marble diagram:
    *
    * ```text
    * of(1,2,3)
    * 123|
    * ```
    *
    * @factory true
    * @param a The first value you want to emit as an event on the stream.
    * @param b The second value you want to emit as an event on the stream. One
    * or more of these values may be given as arguments.
    * @return {Stream}
    */
  def of[T](items: T*): Stream[T] = js.native
  /**
    * Creates a stream that periodically emits incremental numbers, every
    * `period` milliseconds.
    *
    * Marble diagram:
    *
    * ```text
    *     periodic(1000)
    * ---0---1---2---3---4---...
    * ```
    *
    * @factory true
    * @param {number} period The interval in milliseconds to use as a rate of
    * emission.
    * @return {Stream}
    */
  def periodic(period: Double): Stream[Double] = js.native
  /**
    * Creates a Stream that immediately emits an "error" notification with the
    * value you passed as the `error` argument when the stream starts, and that's
    * it.
    *
    * Marble diagram:
    *
    * ```text
    * throw(X)
    * -X
    * ```
    *
    * @factory true
    * @param error The error event to emit on the created stream.
    * @return {Stream}
    */
  def `throw`(error: js.Any): Stream[_] = js.native
}

