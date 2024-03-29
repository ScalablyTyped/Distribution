package typings.wonka

import org.scalablytyped.runtime.StringDictionary
import typings.std.AsyncIterable
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Record
import typings.wonka.anon.Unsubscribe
import typings.wonka.mod.SignalKind.End
import typings.wonka.wonkaInts.`0`
import typings.wonka.wonkaInts.`1`
import typings.wonka.wonkaInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wonka", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait SignalKind extends StObject
  /**
    * Tag enum that is used to on signals that are sent from a source to a sink.
    *
    * @remarks
    * This signal is issued by a {@link Source} and {@link Sink | Sinks} are called with it. The signals
    * carrying values ({@link Start} and {@link Push}) are sent as a unary `[T]` tuple tagged with
    * {@link Tag}. The {@link End} signal carries no value and is sent as a raw `0` value.
    * @see {@link Start} for the data structure of the start signal.
    * @see {@link Push} for the data structure of the push signal, carrying values.
    */
  @JSImport("wonka", "SignalKind")
  @js.native
  object SignalKind extends StObject {
    
    /**
      * Informs the {@link Sink} that the {@link Source} has ended and that it won't send more values.
      *
      * @remarks
      * This signal signifies that the stream has stopped and that no more values are expected. Some
      * sources don't have a set end or limit on how many values will be sent. This signal is not sent
      * when the {@link Source} is cancelled with a {@link TalkbackKind.Close | Close talkback signal}.
      */
    @js.native
    sealed trait End
      extends StObject
         with SignalKind
    
    /**
      * Informs the {@link Sink} of a new values that's incoming from the {@link Source}.
      *
      * @remarks
      * This informs the {@link Sink} of new values that are sent by the {@link Source}.
      * @see {@link Push} for the data structure of the signal.
      */
    @js.native
    sealed trait Push
      extends StObject
         with SignalKind
    
    /**
      * Informs the {@link Sink} that it's being called by a {@link Source}.
      *
      * @remarks
      * This starts the stream of values and carries a {@link TalkbackFn | talkback function} with it
      * that is used by the {@link Sink} to communicate back to the {@link Source}.
      * @see {@link Start} for the data structure of the signal.
      */
    @js.native
    sealed trait Start
      extends StObject
         with SignalKind
  }
  
  @js.native
  sealed trait TalkbackKind extends StObject
  @JSImport("wonka", "TalkbackKind")
  @js.native
  object TalkbackKind extends StObject {
    
    /** Instructs the {@link Source} to stop sending values and cancels it. */
    @js.native
    sealed trait Close
      extends StObject
         with TalkbackKind
    
    /** Instructs the {@link Source} to send the next value. */
    @js.native
    sealed trait Pull
      extends StObject
         with TalkbackKind
  }
  
  /** Buffers values and emits the array of bufferd values each time a `notifier` Source emits.
    *
    * @param notifier - A {@link Source} that releases the current buffer.
    * @returns An {@link Operator}.
    *
    * @remarks
    * `buffer` will buffer values from the input {@link Source}. When the passed `notifier` Source
    * emits, it will emit an array of all buffered values.
    *
    * This can be used to group values over time. A buffer will only be emitted when it contains any
    * values.
    *
    * @example
    * ```ts
    * pipe(
    *   interval(50),
    *   buffer(interval(100)),
    *   subscribe(x => {
    *     console.log(text); // logs: [0], [1, 2], [3, 4]...
    *   })
    * );
    * ```
    */
  inline def buffer[S, T](notifier: Source[S]): Operator[T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(notifier.asInstanceOf[js.Any]).asInstanceOf[Operator[T, js.Array[T]]]
  
  /** Combines the latest values of all passed sources into a Source issuing tuple values.
    *
    * @see {@link zip | `zip`} which this helper wraps and uses.
    * @param sources - A variadic list of {@link Source} parameters.
    * @returns A {@link Source} issuing a zipped value whenever any input Source updates.
    *
    * @remarks
    * `combine` takes one or more {@link Source | Sources} as arguments. Once all input Sources have at
    * least issued one value it will issue an array of all of the Sources' values. Subsequently, it
    * will issue a new array value whenever any of the Sources update.
    *
    * @example
    *
    * ```ts
    * pipe(
    *   combine(fromValue(1), fromValue(2)),
    *   subscribe(result => {
    *     console.log(result); // logs [1, 2]
    *   })
    * );
    * ```
    */
  inline def combine[Sources /* <: js.Array[Source[Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param sources because its type Sources is not an array type */ sources: Sources
  ): Source[TypeOfSourceArray[Sources]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(sources.asInstanceOf[js.Any]).asInstanceOf[Source[TypeOfSourceArray[Sources]]]
  
  /** Emits values from the passed sources in order.
    *
    * @param sources - An array of {@link Source | Sources}.
    * @returns A {@link Source} emitting values from the input Sources.
    *
    * @remarks
    * `concat` accepts an array of {@link Source | Sources} and will emit values from them, starting
    * with the first one and continuing to the next only when the prior source ended.
    *
    * This can be used to issue combine sources while keeping the order of their values intact.
    *
    * @example
    * ```ts
    * pipe(
    *   concat([
    *     fromArray([1, 2]),
    *     fromArray([3, 4]),
    *   ]),
    *   subscribe(x => {
    *     console.log(text); // logs: 1, 2, 3, 4
    *   })
    * );
    * ```
    */
  inline def concat[T](sources: js.Array[Source[T]]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(sources.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  /** Flattens a Source emitting Sources into a single Source emitting the inner values in order.
    *
    * @see {@link concatMap} which this helper uses and instead accept a mapping function.
    * @param source - An {@link Source} emitting {@link Source | Sources}.
    * @returns A {@link Source} emitting values from the inner Sources.
    *
    * @remarks
    * `concatAll` accepts a {@link Source} emitting {@link Source | Sources}.
    * The output {@link Source} will emit values from each Source, in order, queuing sources that
    * aren't yet active.
    *
    * @example
    * ```ts
    * pipe(
    *   fromArray([
    *     fromArray([1, 2]),
    *     fromArray([3, 4]),
    *   ]),
    *   concatAll,
    *   subscribe(x => {
    *     console.log(text); // logs: 1, 2, 3, 4
    *   })
    * );
    * ```
    */
  inline def concatAll[T](source: Source[Source[T]]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatAll")(source.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  /** Emits in order from the Sources returned by a mapping function per value of the Source.
    *
    * @param map - A function returning a {@link Source} per value.
    * @returns An {@link Operator}.
    *
    * @remarks
    * `concatMap` accepts a mapping function which must return a {@link Source} per value.
    * The output {@link Source} will emit values from each Source the function returned, in order,
    * queuing sources that aren't yet active.
    *
    * This can be used to issue multiple values per emission of an input {@link Source}, while keeping
    * the order of their outputs consistent.
    *
    * @example
    * ```ts
    * pipe(
    *   fromArray([1, 2]),
    *   concatMap(x => fromArray([x, x * 2])),
    *   subscribe(x => {
    *     console.log(text); // logs: 1, 2, 2, 4
    *   })
    * );
    * ```
    */
  inline def concatMap[In, Out](map: js.Function1[/* value */ In, Source[Out]]): Operator[In, Out] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMap")(map.asInstanceOf[js.Any]).asInstanceOf[Operator[In, Out]]
  
  /** Debounces a Source by omitting values until a given timeframe has passed.
    *
    * @param timing - A function returning a debounce time (ms) per emitted value.
    * @returns An {@link Operator}.
    *
    * @remarks
    * `debounce` accepts a mapping function that can be used to return a time (in ms) per emitted
    * value. All emitted values issued by the {@link Source} during the returned time will be omitted
    * until the time has passed.
    *
    * Debouncing means that the returned {@link Source} will wait for a minimum time of silence until a
    * value is let through.
    *
    * This is a back pressure operator that can be used to omit values from a {@link Source} coming in
    * too frequently.
    *
    * @example
    * ```ts
    * pipe(
    *   interval(50),
    *   debounce(() => 100),
    *   subscribe(x => {
    *     console.log(text); // never logs any value
    *   })
    * );
    * ```
    */
  inline def debounce[T](timing: js.Function1[/* value */ T, Double]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(timing.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  /** Delays each signal emitted by a Source by given time (ms).
    *
    * @param wait - A time (in ms) by which each {@link SignalKind | signal} is delayed.
    * @returns An {@link Operator}.
    *
    * @remarks
    * `delay` accepts a time (in ms) by which each {@link SignalKind | signal} will be delayed by.
    * This will create a timeout per received signal and delay the emitted values accordingly.
    *
    * Since the operator only calls `setTimeout` per signal, it relies on the timeout implementation to
    * be ordered. Otherwise, signals will arrive in the wrong order at the sink.
    */
  inline def delay[T](wait: Double): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(wait.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  /** A {@link Source} that immediately ends.
    * @remarks
    * `empty` is a {@link Source} that immediately issues an {@link SignalKind.End | End signal} when
    * it's subscribed to, ending immediately.
    *
    * @see {@link never | `never`} for a source that instead never ends.
    */
  @JSImport("wonka", "empty")
  @js.native
  val empty: Source[Any] = js.native
  
  inline def filter[T](predicate: js.Function1[/* value */ T, Boolean]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  /** Filters out emitted values for which the passed predicate function returns `false`.
    *
    * @param predicate - A function returning a boolean per value.
    * @returns An {@link Operator}.
    *
    * @remarks
    * `filter` will omit values from the {@link Source} for which the passed `predicate` function
    * returns `false`.
    *
    * @example
    * ```ts
    * pipe(
    *   fromArray([1, 2, 3]),
    *   filter(x => x % 2 === 0),
    *   subscribe(x => {
    *     console.log(text); // logs: 2
    *   })
    * );
    * ```
    */
  inline def filter_InOut[In, Out /* <: In */](predicate: js.Function1[/* value */ In, /* is Out */ Boolean]): Operator[In, Out] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[Operator[In, Out]]
  
  /** Flattens a Source emitting Sources into a single Source emitting the inner values.
    *
    * @see {@link mergeMap} which this helper uses and instead accept a mapping function.
    * @param source - An {@link Source} emitting {@link Source | Sources}.
    * @returns A {@link Source} emitting values from the inner Sources.
    *
    * @remarks
    * `mergeAll` accepts a {@link Source} which must emit {@link Source | Sources}. It will subscribe
    * to each incoming source immediately and start passing its emitted values through.
    *
    * @example
    * ```ts
    * pipe(
    *   fromArray([
    *     interval(50),
    *     interval(100),
    *   ]),
    *   mergeAll,
    *   subscribe(x => {
    *     console.log(text); // logs: 0, 0, 1, 2, 1, 3, 4, 2
    *   })
    * );
    * ```
    */
  inline def flatten[T](source: Source[Source[T]]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(source.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  /** Creates a subscription to a given source and invokes a `subscriber` callback for each value.
    * @see {@link subscribe} which this helper aliases without returnin a {@link Subscription}.
    * @param subscriber - A callback function called for each issued value.
    * @returns A function accepting a {@link Source}.
    *
    * @remarks
    * `forEach` accepts a `subscriber` callback and returns a function accepting a {@link Source}.
    * When a source is passed to the returned funtion, the subscription will start and `subscriber`
    * will be called for each new value the Source issues. Unlike `subscribe` it will not return a
    * Subscription object and can't be cancelled early.
    *
    * @example
    * ```ts
    * pipe(
    *   fromValue('test'),
    *   forEach(text => {
    *     console.log(text); // 'test'
    *   })
    * ); // undefined
    * ```
    */
  inline def forEach[T](subscriber: js.Function1[/* value */ T, Unit]): js.Function1[/* source */ Source[T], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(subscriber.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* source */ Source[T], Unit]]
  
  /** Creates a Source that issues a each value of a given array synchronously.
    * @see {@link fromIterable} which `fromArray` aliases.
    * @param array - The array whose values will be issued one by one.
    * @returns A {@link Source} issuing the array's values.
    *
    * @remarks
    * `fromArray` will create a {@link Source} that issues the values of a given JS array one by one. It
    * will issue values as they're pulled and is hence a "cold" source, not eagerly emitting values. It
    * will end and issue the {@link SignalKind.End | End signal} when the array is exhausted of values.
    *
    * @example
    * ```ts
    * fromArray([1, 2, 3]);
    * ```
    */
  inline def fromArray[T](array: js.Array[T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  /** Converts an AsyncIterable to a Source that pulls and issues values from it as requested.
    *
    * @see {@link fromIterable | `fromIterable`} for the non-async Iterable version of this helper,
    * which calls this helper automatically as needed.
    *
    * @param iterable - An {@link AsyncIterable | `AsyncIterable`}.
    * @returns A {@link Source} issuing values sourced from the Iterable.
    *
    * @remarks
    * `fromAsyncIterable` will create a {@link Source} that pulls and issues values from a given
    * {@link AsyncIterable}. This can be used in many interoperability situations, including to consume
    * an async generator function.
    *
    * When the {@link Sink} throws an exception when a new value is pushed, this helper will rethrow it
    * using {@link AsyncIterator.throw}, which allows an async generator to recover from the exception.
    *
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#the_async_iterator_and_async_iterable_protocols}
    * for the JS Iterable protocol.
    */
  inline def fromAsyncIterable[T](iterable: AsyncIterable[T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAsyncIterable")(iterable.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  /** Converts a Callbag to a {@link Source}.
    * @param callbag - The {@link Callbag} object that will be converted.
    * @returns A {@link Source} wrapping the passed Callbag.
    *
    * @remarks
    * This converts a Callbag to a {@link Source}. When this Source receives a {@link Sink} and
    * the subscription starts, internally, it'll subscribe to the passed Callbag, passing through
    * all of its emitted values.
    */
  inline def fromCallbag[T](callbag: Callbag[Any, T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCallbag")(callbag.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  /** Converts DOM Events to a Source given an `HTMLElement` and an event's name.
    * @param element - The {@link HTMLElement} to listen to.
    * @param event - The DOM Event name to listen to.
    * @returns A {@link Source} issuing the {@link Event | DOM Events} as they're issued by the DOM.
    *
    * @remarks
    * `fromDomEvent` will create a {@link Source} that listens to the given element's events and issues
    * them as values on the source. This source will only stop when it's cancelled by a
    * {@link TalkbackKind.Close | Close signal}.
    *
    * @example
    * An example printing `'clicked!'` when the given `#root` element is clicked.
    *
    * ```ts
    * const element = document.getElementById('root');
    * pipe(
    *   fromDomEvent(element, 'click'),
    *   subscribe(() => console.log('clicked!'))
    * );
    * ```
    */
  inline def fromDomEvent(element: HTMLElement, event: String): Source[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDomEvent")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Source[Event]]
  
  /** Converts an Iterable to a Source that pulls and issues values from it as requested.
    * @see {@link fromAsyncIterable | `fromAsyncIterable`} for the AsyncIterable version of this helper.
    * @param iterable - An {@link Iterable | `Iterable`} or an `AsyncIterable`
    * @returns A {@link Source} issuing values sourced from the Iterable.
    *
    * @remarks
    * `fromIterable` will create a {@link Source} that pulls and issues values from a given
    * {@link Iterable | JS Iterable}. As iterables are the common standard for any lazily iterated list
    * of values in JS it can be applied to many different JS data types, including a JS Generator
    * function.
    *
    * This Source will only call {@link Iterator.next} on the iterator when the subscribing {@link Sink}
    * has pulled a new value with the {@link TalkbackKind.Pull | Pull signal}. `fromIterable` can
    * therefore also be applied to "infinite" iterables, without a predefined end.
    *
    * This helper will call {@link fromAsyncIterable | `fromAsyncIterable`} automatically when the
    * passed object also implements the async iterator protocol.
    *
    * When the {@link Sink} throws an exception when a new value is pushed, this helper will rethrow it
    * using {@link Iterator.throw}, which allows a generator to recover from the exception.
    *
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#the_iterable_protocol}
    * for the JS Iterable protocol.
    */
  inline def fromIterable[T](iterable: js.Iterable[T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(iterable.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  inline def fromIterable[T](iterable: AsyncIterable[T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(iterable.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  /** Converts an ES Observable to a {@link Source}.
    * @param input - The {@link ObservableLike} object that will be converted.
    * @returns A {@link Source} wrapping the passed Observable.
    *
    * @remarks
    * This converts an ES Observable to a {@link Source}. When this Source receives a {@link Sink} and
    * the subscription starts, internally, it'll subscribe to the passed Observable, passing through
    * all of the Observable's values. As such, this utility provides intercompatibility converting from
    * standard Observables to Wonka Sources.
    *
    * @throws
    * When the passed ES Observable throws, the error is simply re-thrown as {@link Source} does
    * not support or expect errors to be handled by streams.
    */
  inline def fromObservable[T](input: ObservableLike[T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObservable")(input.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  /** Converts a Promise to a Source that issues the resolving Promise's value and then ends.
    * @param promise - The promise that will be wrapped.
    * @returns A {@link Source} issuing the promise's value when it resolves.
    *
    * @remarks
    * `fromPromise` will create a {@link Source} that issues the {@link Promise}'s resolving value
    * asynchronously and ends immediately after resolving.
    *
    * This helper will not handle the promise's exceptions, and will cause uncaught errors if the
    * promise rejects without a value.
    *
    * @example
    * An example printing `'resolved!'` when the given promise resolves after a tick.
    *
    * ```ts
    * pipe(fromPromise(Promise.resolve('resolved!')), subscribe(console.log));
    * ```
    */
  inline def fromPromise[T](promise: js.Promise[T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  /** Creates a Source that issues a single value and ends immediately after.
    * @param value - The value that will be issued.
    * @returns A {@link Source} issuing the single value.
    *
    * @example
    * ```ts
    * fromValue('test');
    * ```
    */
  inline def fromValue[T](value: T): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  /** Creates a Source that issues an incrementing integer in intervals.
    * @param ms - The interval in milliseconds.
    * @returns A {@link Source} issuing an incrementing count on each interval.
    *
    * @remarks
    * `interval` will create a {@link Source} that issues an incrementing counter each time the `ms`
    * interval expires.
    *
    * It'll only stop when it's cancelled by a {@link TalkbackKind.Close | Close signal}.
    *
    * @example
    * An example printing `0`, then `1`, and so on, in intervals of 50ms.
    *
    * ```ts
    * pipe(interval(50), subscribe(console.log));
    * ```
    */
  inline def interval(ms: Double): Source[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("interval")(ms.asInstanceOf[js.Any]).asInstanceOf[Source[Double]]
  
  /** Helper creating a Source from a factory function when it's subscribed to.
    * @param produce - A factory function returning a {@link Source}.
    * @returns A {@link Source} lazyily subscribing to the Source returned by the given factory
    *   function.
    *
    * @remarks
    * At times it's necessary to create a {@link Source} lazily. The time of a {@link Source} being
    * created could be different from when it's subscribed to, and hence we may want to split the
    * creation and subscription time. This is especially useful when the Source we wrap is "hot" and
    * issues values as soon as it's created, which we may then not receive in a subscriber.
    *
    * @example An example of creating a {@link Source} that issues the timestamp of subscription. Here
    * we effectively use `lazy` with the simple {@link fromValue | `fromValue`} source, to quickly
    * create a Source that issues the time of its subscription, rather than the time of its creation
    * that it would otherwise issue without `lazy`.
    *
    * ```ts
    * lazy(() => fromValue(Date.now()));
    * ```
    */
  inline def `lazy`[T](produce: js.Function0[Source[T]]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(produce.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  /** Creates a new Source from scratch from a passed `subscriber` function.
    * @param subscriber - A callback that is called when the {@link Source} is subscribed to.
    * @returns A {@link Source} created from the `subscriber` parameter.
    *
    * @remarks
    * `make` is used to create a new, arbitrary {@link Source} from scratch. It calls the passed
    * `subscriber` function when it's subscribed to.
    *
    * The `subscriber` function receives an {@link Observer}. You may call {@link Observer.next} to
    * issue values on the Source, and {@link Observer.complete} to end the Source.
    *
    * Your `subscribr` function must return a {@link TeardownFn | teardown function} which is only
    * called when your source is cancelled — not when you invoke `complete` yourself. As this creates a
    * "cold" source, every time this source is subscribed to, it will invoke the `subscriber` function
    * again and create a new source.
    *
    * @example
    *
    * ```ts
    * make(observer => {
    *   const frame = requestAnimationFrame(() => {
    *     observer.next('animate!');
    *   });
    *   return () => {
    *     cancelAnimationFrame(frame);
    *   };
    * });
    * ```
    */
  inline def make[T](subscriber: js.Function1[/* observer */ Observer[T], TeardownFn]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(subscriber.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  /** Creates a new Subject which can be used as an IO event hub.
    * @returns A new {@link Subject}.
    *
    * @remarks
    * `makeSubject` creates a new {@link Subject}. A Subject is a {@link Source} and an {@link Observer}
    * combined in one interface, as the Observer is used to send new signals to the Source. This means
    * that it's "hot" and hence all subscriptions to {@link Subject.source} share the same underlying
    * signals coming from {@link Subject.next} and {@link Subject.complete}.
    *
    * @example
    * ```ts
    * const subject = makeSubject();
    * pipe(subject.source, subscribe(console.log));
    * // This will log the string on the above subscription
    * subject.next('hello subject!');
    * ```
    */
  inline def makeSubject[T](): Subject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSubject")().asInstanceOf[Subject[T]]
  
  /** Maps emitted values using the passed mapping function.
    *
    * @param map - A function returning transforming the {@link Source | Source's} values.
    * @returns An {@link Operator}.
    *
    * @remarks
    * `map` accepts a transform function and calls it on each emitted value. It then emits
    * the values returned by the transform function instead.
    *
    * @example
    * ```ts
    * pipe(
    *   fromArray([1, 2, 3]),
    *   map(x => x * 2),
    *   subscribe(x => {
    *     console.log(text); // logs: 2, 4, 6
    *   })
    * );
    * ```
    */
  inline def map[In, Out](map: js.Function1[/* value */ In, Out]): Operator[In, Out] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(map.asInstanceOf[js.Any]).asInstanceOf[Operator[In, Out]]
  
  /** Emits values from the passed sources simultaneously.
    *
    * @param sources - An array of {@link Source | Sources}.
    * @returns A {@link Source} emitting values from the input Sources.
    *
    * @remarks
    * `merge` accepts an array of {@link Source | Sources} and will subscribe to all of them, passing
    * through all their emitted values simultaneously.
    *
    * This can be used to interleave the values of multiple sources.
    *
    * @example
    * ```ts
    * pipe(
    *   merge([
    *     interval(50),
    *     interval(100),
    *   ]),
    *   subscribe(x => {
    *     console.log(text); // logs: 0, 0, 1, 2, 1, 3, 4, 2
    *   })
    * );
    * ```
    */
  inline def merge[T](sources: js.Array[Source[T]]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(sources.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  /** Flattens a Source emitting Sources into a single Source emitting the inner values.
    *
    * @see {@link mergeMap} which this helper uses and instead accept a mapping function.
    * @param source - An {@link Source} emitting {@link Source | Sources}.
    * @returns A {@link Source} emitting values from the inner Sources.
    *
    * @remarks
    * `mergeAll` accepts a {@link Source} which must emit {@link Source | Sources}. It will subscribe
    * to each incoming source immediately and start passing its emitted values through.
    *
    * @example
    * ```ts
    * pipe(
    *   fromArray([
    *     interval(50),
    *     interval(100),
    *   ]),
    *   mergeAll,
    *   subscribe(x => {
    *     console.log(text); // logs: 0, 0, 1, 2, 1, 3, 4, 2
    *   })
    * );
    * ```
    */
  inline def mergeAll[T](source: Source[Source[T]]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAll")(source.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  /** Emits from the Sources returned by a mapping function per value of the Source.
    *
    * @param map - A function returning a {@link Source} per value.
    * @returns An {@link Operator}.
    *
    * @remarks
    * `mergeMap` accepts a mapping function which must return a {@link Source} per value.
    * The output {@link Source} will emit values from all {@link Source | Sources} the mapping function
    * returned.
    *
    * This can be used to issue multiple values per emission of an input {@link Source}, essentially
    * multiplexing all values to multiple Sources.
    *
    * @example
    * ```ts
    * pipe(
    *   interval(50),
    *   mergeMap(x => pipe(
    *     fromValue(x),
    *     delay(100)
    *   )),
    *   subscribe(x => {
    *     console.log(text); // logs: 0, 1, 2...
    *   })
    * );
    * ```
    */
  inline def mergeMap[In, Out](map: js.Function1[/* value */ In, Source[Out]]): Operator[In, Out] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMap")(map.asInstanceOf[js.Any]).asInstanceOf[Operator[In, Out]]
  
  /** A {@link Source} without values that never ends.
    * @remarks
    * `never` is a {@link Source} that never issues any signals and neither sends values nor ends.
    *
    * @see {@link empty | `empty`} for a source that instead ends immediately.
    */
  @JSImport("wonka", "never")
  @js.native
  val never: Source[Any] = js.native
  
  /** Calls the passed callback function when the Source ends or is closed.
    *
    * @param callback - A function that is called when the {@link Source} ends.
    * @returns An {@link Operator}.
    *
    * @remarks
    * `onEnd` accepts a callback which is called when the {@link Source} either ends
    * or is closed.
    *
    * This operator can be used to add side-effects to a Source.
    *
    * @example
    * ```ts
    * pipe(
    *   fromArray([1, 2, 3]),
    *   take(1),
    *   onEnd(() => {
    *     console.log('end');
    *   }),
    *   publish
    * );
    * ```
    */
  inline def onEnd[T](callback: js.Function0[Unit]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("onEnd")(callback.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  /** Calls the passed callback function when the Source emits a value.
    *
    * @param callback - A function that is called with each value the {@link Source} emits.
    * @returns An {@link Operator}.
    *
    * @remarks
    * `onPush` accepts a callback which is called for every emitted value of
    * the {@link Source}.
    *
    * This operator can be used to add side-effects to a Source.
    *
    * @example
    * ```ts
    * pipe(
    *   fromArray([1, 2, 3]),
    *   onPush(value => {
    *     console.log(value); // logs: 1, 2, 3
    *   }),
    *   publish
    * );
    * ```
    */
  inline def onPush[T](callback: js.Function1[/* value */ T, Unit]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("onPush")(callback.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  /** Calls the passed callback function when the Source starts.
    *
    * @param callback - A function that is called when the {@link Source} is started.
    * @returns An {@link Operator}.
    *
    * @remarks
    * `onPush` accepts a callback which is called for every emitted value of
    * the {@link Source}.
    *
    * This operator can be used to add side-effects to a Source.
    * Specifically, it's useful to add a side-effect for a Source that triggers only once
    * the {@link Source} is used and started.
    *
    * @example
    * ```ts
    * pipe(
    *   fromArray([1, 2, 3]),
    *   onStart(() => {
    *     console.log('start');
    *   }),
    *   publish
    * );
    * ```
    */
  inline def onStart[T](callback: js.Function0[Unit]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("onStart")(callback.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  /** Chain calls operators on a given source and returns the last result.
    * @param args - A source, then a variable number of transform functions
    *
    * @remarks
    * The `pipe` utility can be called with a {@link Source} then one or more unary transform functions.
    * Each transform function will be called in turn with the last function's return value, starting
    * with the source passed as the first argument to `pipe`.
    *
    * It's used to transform a source with a list of {@link Operator | Operators}. The last argument may
    * also be a {@link Sink} that returns something else than a Source.
    *
    * @example
    *
    * ```ts
    * pipe(
    *   fromArray([1, 2, 3]),
    *   map(x => x * 2),
    *   subscribe(console.log)
    * );
    * ```
    *
    * @see {@link https://github.com/tc39/proposal-pipeline-operator} for the JS Pipeline Operator spec, for which this is a replacement utility for.
    */
  @js.native
  trait pipe extends StObject {
    
    def apply[T, R](source: Source[T], consumer: UnaryFn[Source[T], R]): R = js.native
    def apply[T, A, R](source: Source[T], op1: UnaryFn[Source[T], Source[A]], consumer: UnaryFn[Source[A], R]): R = js.native
    def apply[T, A, B, C](
      source: Source[T],
      op1: UnaryFn[Source[T], Source[A]],
      op2: UnaryFn[Source[A], Source[B]],
      op3: UnaryFn[Source[B], Source[C]]
    ): Source[C] = js.native
    def apply[T, A, B, C, R](
      source: Source[T],
      op1: UnaryFn[Source[T], Source[A]],
      op2: UnaryFn[Source[A], Source[B]],
      op3: UnaryFn[Source[B], Source[C]],
      consumer: UnaryFn[Source[C], R]
    ): R = js.native
    def apply[T, A, B, C, D, E](
      source: Source[T],
      op1: UnaryFn[Source[T], Source[A]],
      op2: UnaryFn[Source[A], Source[B]],
      op3: UnaryFn[Source[B], Source[C]],
      op4: UnaryFn[Source[C], Source[D]],
      op5: UnaryFn[Source[D], Source[E]]
    ): Source[E] = js.native
    def apply[T, A, B, C, D, E, R](
      source: Source[T],
      op1: UnaryFn[Source[T], Source[A]],
      op2: UnaryFn[Source[A], Source[B]],
      op3: UnaryFn[Source[B], Source[C]],
      op4: UnaryFn[Source[C], Source[D]],
      op5: UnaryFn[Source[D], Source[E]],
      consumer: UnaryFn[Source[E], R]
    ): R = js.native
    def apply[T, A, B, C, D, E, F, G](
      source: Source[T],
      op1: UnaryFn[Source[T], Source[A]],
      op2: UnaryFn[Source[A], Source[B]],
      op3: UnaryFn[Source[B], Source[C]],
      op4: UnaryFn[Source[C], Source[D]],
      op5: UnaryFn[Source[D], Source[E]],
      op6: UnaryFn[Source[E], Source[F]],
      op7: UnaryFn[Source[F], Source[G]]
    ): Source[G] = js.native
    def apply[T, A, B, C, D, E, F, G, H](
      source: Source[T],
      op1: UnaryFn[Source[T], Source[A]],
      op2: UnaryFn[Source[A], Source[B]],
      op3: UnaryFn[Source[B], Source[C]],
      op4: UnaryFn[Source[C], Source[D]],
      op5: UnaryFn[Source[D], Source[E]],
      op6: UnaryFn[Source[E], Source[F]],
      op7: UnaryFn[Source[F], Source[G]],
      op8: UnaryFn[Source[G], Source[H]]
    ): Source[H] = js.native
    def apply[T, A, B, C, D, E, F, G, H, R](
      source: Source[T],
      op1: UnaryFn[Source[T], Source[A]],
      op2: UnaryFn[Source[A], Source[B]],
      op3: UnaryFn[Source[B], Source[C]],
      op4: UnaryFn[Source[C], Source[D]],
      op5: UnaryFn[Source[D], Source[E]],
      op6: UnaryFn[Source[E], Source[F]],
      op7: UnaryFn[Source[F], Source[G]],
      op8: UnaryFn[Source[G], Source[H]],
      consumer: UnaryFn[Source[H], R]
    ): R = js.native
  }
  @JSImport("wonka", "pipe")
  @js.native
  val pipe: typings.wonka.mod.pipe = js.native
  
  /** Creates a subscription to a given source and invokes a `subscriber` callback for each value.
    * @see {@link subscribe} which this helper aliases without accepting parameters or returning a
    * {@link Subscription | Subscription}.
    *
    * @param source - A {@link Source}.
    *
    * @remarks
    * `publish` accepts a {@link Source} and subscribes to it, starting its values. The resulting
    * values cannot be observed and the subscription can't be cancelled, as this helper is purely
    * intended to start side-effects.
    *
    * @example
    * ```ts
    * pipe(
    *   lazy(() => {
    *     console.log('test'); // this is called
    *     return fromValue(123); // this is never used
    *   }),
    *   publish
    * ); // undefined
    * ```
    */
  inline def publish[T](source: Source[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("publish")(source.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Emits the last value the {@link Source} emitted, whenever the notifier Source emits a value.
    *
    * @param notifier - A {@link Source} that triggers the last value to be emitted.
    * @returns An {@link Operator}.
    *
    * @remarks
    * `sample` will store the latest value the {@link Source} emitted. Every time the `notifier` Source
    * emits, it will emit the latest value.
    *
    * This is a back pressure operator that can be used to omit values from a {@link Source} coming in
    * too frequently.
    *
    * {@link Source | Sources} emitting `undefined` are undefined behaviour and these values will be
    * ignored.
    *
    * @example
    * ```ts
    * pipe(
    *   interval(50),
    *   sample(interval(100)),
    *   subscribe(x => {
    *     console.log(text); // logs: 0, 2, 4...
    *   })
    * );
    * ```
    */
  inline def sample[S, T](notifier: Source[S]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sample")(notifier.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  /** Maps emitted values using the passed reducer function.
    *
    * @param reducer - A function called with the last value by the `reducer` and the emitted value.
    * @param seed - The initial value that is passed to the `reducer`.
    * @returns An {@link Operator}.
    *
    * @remarks
    * `scan` accepts a reducer function and a seed value. The reducer will be called initially with the
    * seed value and the first emitted value. The {@link Source} will then emit the value returned by
    * the reducer function. Subsequently, the `reducer` is called with the last value the `reducer`
    * returned and the emitted value.
    *
    * This operator is similar to `Array.prototype.reduce`, but instead is called over time and emits
    * each value of the reducer.
    *
    * @example
    * ```ts
    * pipe(
    *   fromArray([1, 2, 3]),
    *   scan((acc, x) => acc + x, 0),
    *   subscribe(x => {
    *     console.log(text); // logs: 1, 3, 6
    *   })
    * );
    * ```
    */
  inline def scan[In, Out](reducer: js.Function2[/* acc */ Out, /* value */ In, Out], seed: Out): Operator[In, Out] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(reducer.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Operator[In, Out]]
  
  /** Shares one underlying subscription to the Source between all Sinks.
    *
    * @param source - A {@link Source} that should be shared.
    * @returns A shared {@link Source}.
    *
    * @remarks
    * `share` accepts a {@link Source} and returns one. It will emit all values as normal, however, it
    * will share one subscription to the input source. This allows side-effects on the input
    * {@link Source} to only be triggerd once.
    */
  inline def share[T](source: Source[T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("share")(source.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  /** Omits `wait` amount of values from the Source and then runs as usual.
    *
    * @param wait - The number of values to be omitted.
    * @returns An {@link Operator}.
    *
    * @remarks
    * `skip` will skip `wait` number of emitted values, then issue all values as normal afterwards.
    * This essentially skips a given number of values on the input {@link Source}.
    *
    * @example
    * ```ts
    * pipe(
    *   fromArray([1, 2, 3]),
    *   skip(2),
    *   subscribe(x => {
    *     console.log(text); // logs: 3
    *   })
    * );
    * ```
    */
  inline def skip[T](wait: Double): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")(wait.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  /** Omits values from an input Source until a notifier Source emits a value.
    *
    * @param notifier - A {@link Source} that starts the operator's sent values.
    * @returns An {@link Operator}.
    *
    * @remarks
    * `skipUntil` will omit all values from the input {@link Source} until the `notifier`
    * Source emits a value of its own. It'll then start passing values from the Source through.
    *
    * @example
    * ```ts
    * pipe(
    *   interval(50),
    *   skipUntil(interval(150)),
    *   subscribe(x => {
    *     console.log(text); // logs: 2, 3...
    *   })
    * );
    * ```
    */
  inline def skipUntil[S, T](notifier: Source[S]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipUntil")(notifier.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  /** Omits values from an input Source until a predicate function returns `false`.
    *
    * @param predicate - A function returning a boolean per value.
    * @returns An {@link Operator}.
    *
    * @remarks
    * `skipWhile` will omit all values from the input {@link Source} until the `predicate`
    * function returns `false`. When the `predicate` function returns `false`, the Source's values will
    * be passed through.
    *
    * @example
    * ```ts
    * pipe(
    *   fromArray([1, 2, 3]),
    *   skipWhile(x => x < 2),
    *   subscribe(x => {
    *     console.log(text); // logs: 2, 3
    *   })
    * );
    * ```
    */
  inline def skipWhile[T](predicate: js.Function1[/* value */ T, Boolean]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  /** Creates a subscription to a given source and invokes a `subscriber` callback for each value.
    * @param subscriber - A callback function called for each issued value.
    * @returns A function accepting a {@link Source} and returning a {@link Subscription}.
    *
    * @remarks
    * `subscribe` accepts a `subscriber` callback and returns a function accepting a {@link Source}.
    * When a source is passed to the returned funtion, the subscription will start and `subscriber`
    * will be called for each new value the Source issues. This will also return a {@link Subscription}
    * object that can cancel the ongoing {@link Source} early.
    *
    * @example
    * ```ts
    * const subscription = pipe(
    *   fromValue('test'),
    *   subscribe(text => {
    *     console.log(text); // 'test'
    *   })
    * );
    * ```
    */
  inline def subscribe[T](subscriber: js.Function1[/* value */ T, Unit]): js.Function1[/* source */ Source[T], Subscription] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(subscriber.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* source */ Source[T], Subscription]]
  
  /** Flattens a Source emitting Sources into a single Source emitting the inner values.
    *
    * @see {@link switchMap} which this helper uses and instead accept a mapping function.
    * @param source - An {@link Source} emitting {@link Source | Sources}.
    * @returns A {@link Source} emitting values from the inner Sources.
    *
    * @remarks
    * `switchAll` accepts a {@link Source} which must emit {@link Source | Sources}. Each time it
    * receives a {@link Source} it will close its prior subscription and subscribe to the new Source
    * instead, passing through its values.
    *
    * @example
    * ```ts
    * pipe(
    *   interval(100),
    *   map(() => interval(50)),
    *   switchAll,
    *   subscribe(x => {
    *     console.log(text); // logs: 0, 0, 0...
    *   })
    * );
    * ```
    */
  inline def switchAll[T](source: Source[Source[T]]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchAll")(source.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  /** Emits from the latest Source returned by a mapping function per value of the Source.
    *
    * @param map - A function returning a {@link Source} per value.
    * @returns An {@link Operator}.
    *
    * @remarks
    * `switchMap` accepts a mapping function which must return a {@link Source} per value.
    * The output {@link Source} will emit values from the latest Source the mapping function
    * returned. If a value is emitted while the last returned Source is still active, the prior Source
    * will be closed.
    *
    * This can be used to issue multiple values per emission of an input {@link Source}, while only
    * letting one of these sub-Sources be active at a time.
    *
    * @example
    * ```ts
    * pipe(
    *   interval(100),
    *   switchMap(() => interval(50)),
    *   subscribe(x => {
    *     console.log(text); // logs: 0, 0, 0...
    *   })
    * );
    * ```
    */
  inline def switchMap[In, Out](map: js.Function1[/* value */ In, Source[Out]]): Operator[In, Out] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchMap")(map.asInstanceOf[js.Any]).asInstanceOf[Operator[In, Out]]
  
  /** Emits `max` values from the Source and then ends.
    *
    * @param max - The maximum number of values emitted.
    * @returns An {@link Operator}.
    *
    * @remarks
    * `take` will issue all values as normal until the `max` number of emitted values has been reached.
    * It will then end and close the {@link Source}.
    *
    * @example
    * ```ts
    * pipe(
    *   fromArray([1, 2, 3]),
    *   take(2),
    *   subscribe(x => {
    *     console.log(text); // logs: 1, 2
    *   })
    * );
    * ```
    */
  inline def take[T](max: Double): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(max.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  /** Buffers the `max` last values of the Source and emits them once the Source ends.
    *
    * @param max - The maximum number of values buffered.
    * @returns An {@link Operator}.
    *
    * @remarks
    * `takeLast` will buffer values from the input {@link Source} up until the given `max` number. It
    * will only emit values stored in the buffer once the {@link Source} ends.
    *
    * All values in the buffer are emitted like the {@link fromArray | `fromArray`} source would
    * synchronously.
    *
    * @example
    * ```ts
    * pipe(
    *   fromArray([1, 2, 3]),
    *   takeLast(1),
    *   subscribe(x => {
    *     console.log(text); // logs: 3
    *   })
    * );
    * ```
    */
  inline def takeLast[T](max: Double): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeLast")(max.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  /** Takes values from an input Source until a notifier Source emits a value.
    *
    * @param notifier - A {@link Source} that stops the operator's sent values.
    * @returns An {@link Operator}.
    *
    * @remarks
    * `takeUntil` will issue all values as normal from the input {@link Source} until the `notifier`
    * Source emits a value of its own. It'll then close the {@link Source}.
    *
    * @example
    * ```ts
    * pipe(
    *   interval(50),
    *   takeUntil(interval(150)),
    *   subscribe(x => {
    *     console.log(text); // logs: 0, 1
    *   })
    * );
    * ```
    */
  inline def takeUntil[S, T](notifier: Source[S]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeUntil")(notifier.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  /** Takes values from an input Source until a predicate function returns `false`.
    *
    * @param predicate - A function returning a boolean per value.
    * @param addOne - Lets an additional input value pass on.
    * @returns An {@link Operator}.
    *
    * @remarks
    * `takeWhile` will issue all values as normal from the input {@link Source} until the `predicate`
    * function returns `false`. When the `predicate` function returns `false`, the current value is
    * omitted and the {@link Source} is closed.
    *
    * If `addOne` is set to `true`, the value for which the `predicate` first returned `false` is
    * issued and passed on as well instead of being omitted.
    *
    * @example
    * ```ts
    * pipe(
    *   fromArray([1, 2, 3]),
    *   takeWhile(x => x < 2),
    *   subscribe(x => {
    *     console.log(text); // logs: 1
    *   })
    * );
    * ```
    */
  inline def takeWhile[T](predicate: js.Function1[/* value */ T, Boolean]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  inline def takeWhile[T](predicate: js.Function1[/* value */ T, Boolean], addOne: Boolean): Operator[T, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any], addOne.asInstanceOf[js.Any])).asInstanceOf[Operator[T, T]]
  
  /** Calls the passed callback function when the Source emits a value.
    *
    * @param callback - A function that is called with each value the {@link Source} emits.
    * @returns An {@link Operator}.
    *
    * @remarks
    * `onPush` accepts a callback which is called for every emitted value of
    * the {@link Source}.
    *
    * This operator can be used to add side-effects to a Source.
    *
    * @example
    * ```ts
    * pipe(
    *   fromArray([1, 2, 3]),
    *   onPush(value => {
    *     console.log(value); // logs: 1, 2, 3
    *   }),
    *   publish
    * );
    * ```
    */
  inline def tap[T](callback: js.Function1[/* value */ T, Unit]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")(callback.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  /** Throttles a Source by omitting values that are emitted before a given timeout.
    *
    * @param timing - A function returning a throttle time (ms) per emitted value.
    * @returns An {@link Operator}.
    *
    * @remarks
    * `throttle` accepts a mapping function that can be used to return a time (in ms) per emitted
    * value. During the returned timeframe all values issued by the {@link Source} will be omitted and
    * dropped.
    *
    * This is a back pressure operator that can be used to omit values from a {@link Source} coming in
    * too frequently.
    *
    * @example
    * ```ts
    * pipe(
    *   interval(50),
    *   throttle(() => 100),
    *   subscribe(x => {
    *     // omits every second value: 0, 2, 4...
    *     console.log(text);
    *   })
    * );
    * ```
    */
  inline def throttle[T](timing: js.Function1[/* value */ T, Double]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(timing.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  /** Subscribes to a given source and collects all synchronous values into an array.
    * @param source - A {@link Source}.
    * @returns An array of values collected from the {@link Source}.
    *
    * @remarks
    * `toArray` accepts a {@link Source} and returns an array of all synchronously issued values from
    * this Source. It will issue {@link TalkbackKind.Pull | Pull signals} after every value it receives
    * and expects the Source to recursively issue values.
    *
    * Any asynchronously issued values will not be
    * added to the array and a {@link TalkbackKind.Close | Close signal} is issued by the sink before
    * returning the array.
    *
    * @example
    * ```ts
    * toArray(fromArray([1, 2, 3])); // [1, 2, 3]
    * ```
    */
  inline def toArray[T](source: Source[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(source.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  /** Converts a Source to an AsyncIterable that pulls and issues values from the Source.
    *
    * @param source - A {@link Source}.
    * @returns An {@link AsyncIterable | `AsyncIterable`} issuing values from the Source.
    *
    * @remarks
    * `toAsyncIterable` will create an {@link AsyncIterable} that pulls and issues values from a given
    * {@link Source}. This can be used in many interoperability situations, to provide an iterable when
    * a consumer requires it.
    *
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#the_async_iterator_and_async_iterable_protocols}
    * for the JS Iterable protocol.
    *
    * @example
    * ```ts
    * const iterable = toAsyncIterable(fromArray([1, 2, 3]));
    * for await (const value of iterable) {
    *   console.log(value); // outputs: 1, 2, 3
    * }
    * ```
    */
  inline def toAsyncIterable[T](source: Source[T]): AsyncIterable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toAsyncIterable")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[T]]
  
  /** Converts a {@link Source} to a Callbag.
    * @param source - The {@link Source} that will be converted.
    * @returns A {@link Callbag} wrapping the passed Source.
    *
    * @remarks
    * This converts a {@link Source} to a {@link Callbag}. When this Callbag is subscribed to, it
    * internally subscribes to the Wonka Source and pulls new values.
    */
  inline def toCallbag[T](source: Source[T]): Callbag[Any, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCallbag")(source.asInstanceOf[js.Any]).asInstanceOf[Callbag[Any, T]]
  
  /** Converts a {@link Source} to an ES Observable.
    * @param source - The {@link Source} that will be converted.
    * @returns An {@link Observable} wrapping the passed Source.
    *
    * @remarks
    * This converts a {@link Source} to an {@link Observable}. When this Observable is subscribed to, it
    * internally subscribes to the Wonka Source and pulls new values. As such, this utility provides
    * intercompatibility converting from Wonka Sources to standard ES Observables.
    */
  inline def toObservable[T](source: Source[T]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObservable")(source.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  
  /** Subscribes to a given source and returns a Promise that will resolve with the last value the
    * source issues.
    *
    * @param source - A {@link Source}.
    * @returns A {@link Promise} resolving to the last value of the {@link Source}.
    *
    * @remarks
    * `toPromise` will subscribe to the passed {@link Source} and resolve to the last value of it once
    * it receives the last value, as signaled by the {@link SignalKind.End | End signal}.
    *
    * To keep its implementation simple, padding sources that don't issue any values to `toPromise` is
    * undefined behaviour and `toPromise` will issue `undefined` in that case.
    *
    * The returned {@link Promise} delays its value by a microtick, using `Promise.resolve`.
    *
    * @example
    * ```ts
    * toPromise(fromValue('test')); // resolves: 'test'
    * ```
    */
  inline def toPromise[T](source: Source[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toPromise")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  /** Combines the latest values of several sources into a Source issuing either tuple or dictionary
    * values.
    *
    * @param sources - Either an array or dictionary object of Sources.
    * @returns A {@link Source} issuing a zipped value whenever any input Source updates.
    *
    * @remarks
    * `zip` combines several {@link Source | Sources}. The resulting Source will issue its first value
    * once all input Sources have at least issued one value, and will subsequently issue a new value
    * each time any of the Sources emits a new value.
    *
    * Depending on whether an array or dictionary object of Sources is passed to `zip`, its emitted
    * values will be arrays or dictionary objects of the Sources' values.
    *
    * @example
    * An example of passing a dictionary object to `zip`. If an array is passed, the resulting
    * values will output arrays of the sources' values instead.
    *
    * ```ts
    * pipe(
    *   zip({
    *     x: fromValue(1),
    *     y: fromArray([2, 3]),
    *   }),
    *   subscribe(result => {
    *     // logs { x: 1, y: 2 } then { x: 1, y: 3 }
    *     console.log(result);
    *   })
    * );
    * ```
    */
  @js.native
  trait zip extends StObject {
    
    def apply[Sources /* <: StringDictionary[Source[Any]] */](sources: Sources): Source[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ Property in keyof Sources ]: wonka.wonka.TypeOfSource<Sources[Property]>} */ js.Any
      ] = js.native
    def apply[Sources /* <: Array[Source[Any]] */](
      sources: /* import warning: importer.ImportType#apply c repeated non-array type: Sources */ js.Array[Sources]
    ): Source[TypeOfSourceArray[Sources]] = js.native
  }
  object zip {
    
    @JSImport("wonka", "zip")
    @js.native
    def apply[T](sources: js.Array[Source[T]]): Source[js.Array[T] | (Record[String, T])] = js.native
    @JSImport("wonka", "zip")
    @js.native
    def apply[T](sources: Record[String, Source[T]]): Source[js.Array[T] | (Record[String, T])] = js.native
  }
  
  /** A definition of the Callbag type as per its specification.
    * @see {@link https://github.com/callbag/callbag} for the Callbag specification.
    */
  @js.native
  trait Callbag[I, O] extends StObject {
    
    def apply(t: `0`, d: Callbag[O, I]): Unit = js.native
    def apply(t: `1`, d: I): Unit = js.native
    def apply(t: `2`): Unit = js.native
    def apply(t: `2`, d: Any): Unit = js.native
  }
  
  /** An ES Observable type that is a de-facto standard for push-based data sources across the JS
    * ecosystem.
    *
    * @remarks
    * The Observable is often used by multiple libraries supporting or creating streams to provide
    * interoperability for push-based streams. As Wonka's {@link Source | Sources} are similar in
    * functionality to Observables, it provides utilities to cleanly convert to and from Observables.
    *
    * @see {@link https://github.com/tc39/proposal-observable} for the ES Observable specification.
    */
  @js.native
  trait Observable[T] extends StObject {
    
    /** Subscribes to new signals from an {@link Observable} via callbacks.
      * @param observer - An object containing callbacks for the various events of an Observable.
      * @returns Subscription handle of type {@link ObservableSubscription}.
      *
      * @see {@link ObservableObserver} for the callbacks in an object that are called as Observables
      * issue events.
      */
    def subscribe(observer: ObservableObserver[T]): ObservableSubscription = js.native
    /** Subscribes to new signals from an {@link Observable} via callbacks.
      * @param onNext - Callback for the Observable issuing new values.
      * @param onError - Callback for the Observable encountering an error, terminating it.
      * @param onComplete - Callback for the Observable ending, after all values have been issued.
      * @returns Subscription handle of type {@link ObservableSubscription}.
      */
    def subscribe(onNext: js.Function1[/* value */ T, Any]): ObservableSubscription = js.native
    def subscribe(onNext: js.Function1[/* value */ T, Any], onError: js.Function1[/* error */ Any, Any]): ObservableSubscription = js.native
    def subscribe(
      onNext: js.Function1[/* value */ T, Any],
      onError: js.Function1[/* error */ Any, Any],
      onComplete: js.Function0[Any]
    ): ObservableSubscription = js.native
    def subscribe(onNext: js.Function1[/* value */ T, Any], onError: Unit, onComplete: js.Function0[Any]): ObservableSubscription = js.native
  }
  
  /** A looser definition of ES Observable-like types that is used for interoperability.
    * @remarks
    * The Observable is often used by multiple libraries supporting or creating streams to provide
    * interoperability for push-based streams. When converting from an Observable to a {@link Source},
    * this looser type is accepted as an input.
    *
    * @see {@link https://github.com/tc39/proposal-observable} for the ES Observable specification.
    * @see {@link Observable} for the full ES Observable type.
    */
  @js.native
  trait ObservableLike[T] extends StObject {
    
    /**
      * Subscribes to new signals from an {@link Observable} via callbacks.
      * @param observer - An object containing callbacks for the various events of an Observable.
      * @returns Subscription handle of type {@link ObservableSubscription}.
      *
      * @see {@link ObservableObserver} for the callbacks in an object that are called as Observables
      * issue events.
      */
    def subscribe(observer: ObservableObserver[T]): Unsubscribe = js.native
  }
  
  /** A definition of the ES Observable Observer type that is used to receive data from an
    * {@link Observable}.
    *
    * @remarks
    * The Observer in ES Observables is supplied to {@link Observable.subscribe} to receive events from
    * an {@link Observable} as it issues them.
    *
    * @see {@link https://github.com/tc39/proposal-observable#observer} for the ES Observable
    * specification of an Observer.
    */
  trait ObservableObserver[T] extends StObject {
    
    /** Callback for the Observable ending, after all values have been issued. */
    var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Callback for the Observable encountering an error, terminating it.
      * @param error - The error that the {@link Observable} has encountered.
      */
    var error: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
    
    /** Callback for the Observable issuing new values.
      * @param value - The value that the {@link Observable} is sending.
      */
    def next(value: T): Unit
  }
  object ObservableObserver {
    
    inline def apply[T](next: T => Unit): ObservableObserver[T] = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[ObservableObserver[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObservableObserver[?], T] (val x: Self & ObservableObserver[T]) extends AnyVal {
      
      inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setError(value: /* error */ Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  /** A definition of the ES Observable Subscription type that is returned by
    * {@link Observable.subscribe}
    *
    * @remarks
    * The Subscription in ES Observables is a handle that is held while the Observable is actively
    * streaming values. As such, it's used to indicate with {@link ObservableSubscription.closed}
    * whether it's active, and {@link ObservableSubscription.unsubscribe} may be used to cancel the
    * ongoing subscription and end the {@link Observable} early.
    *
    * @see {@link https://github.com/tc39/proposal-observable} for the ES Observable specification.
    */
  trait ObservableSubscription extends StObject {
    
    /** A boolean flag indicating whether the subscription is closed.
      * @remarks
      * When `true`, the subscription will not issue new values to the {@link ObservableObserver} and
      * has terminated. No new values are expected.
      *
      * @readonly
      */
    var closed: Boolean
    
    /** Cancels the subscription.
      * @remarks
      * This cancels the ongoing subscription and the {@link ObservableObserver}'s callbacks will
      * subsequently not be called at all. The subscription will be terminated and become inactive.
      */
    def unsubscribe(): Unit
  }
  object ObservableSubscription {
    
    inline def apply(closed: Boolean, unsubscribe: () => Unit): ObservableSubscription = {
      val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[ObservableSubscription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObservableSubscription] (val x: Self) extends AnyVal {
      
      inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
  
  /** An Observer represents sending signals manually to a {@link Sink}.
    * @remarks
    * The Observer is used whenever a utility allows for signals to be sent manually as a {@link Source}
    * would send them.
    *
    * @see {@link make | `make` source} for a helper that uses this structure.
    */
  trait Observer[T] extends StObject {
    
    /** Indicates to the receiving Sink that no more values will be sent.
      * @remarks
      * This creates an {@link SignalKind.End | End signal} that is sent to a {@link Sink}. The Observer
      * will accept no more values via {@link Observer.next | `next` calls} once this method has been
      * invoked.
      */
    def complete(): Unit
    
    /** Sends a new value to the receiving Sink.
      * @remarks
      * This creates a {@link Push | Push signal} that is sent to a {@link Sink}.
      */
    def next(value: T): Unit
  }
  object Observer {
    
    inline def apply[T](complete: () => Unit, next: T => Unit): Observer[T] = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[Observer[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Observer[?], T] (val x: Self & Observer[T]) extends AnyVal {
      
      inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      inline def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  /** Transform function that accepts a {@link Source} and returns a new one.
    * @remarks
    * Wonka comes with several helper operators that transform a given {@link Source} into a new one,
    * potentially changing its outputs, or the outputs' timing. An "operator" in Wonka typically
    * accepts arguments and then returns this kind of function, so they can be chained and composed.
    *
    * @see {@link pipe | `pipe`} for the helper used to compose operators.
    */
  type Operator[In, Out] = js.Function1[/* a */ Source[In], Source[Out]]
  
  /**
    * Sends a new value to a {@link Sink}.
    *
    * @remarks
    * This signal is sent from a {@link Source} to a {@link Sink} to send a new value to it. This is
    * essentially the signal that wraps new values coming in, like an event. Values are carried on
    * unary tuples and can be accessed using `signal[0]`.
    */
  type Push[T] = Tag[typings.wonka.mod.SignalKind.Push] & js.Array[T]
  
  /**
    * Signals are sent from {@link Source | Sources} to {@link Sink | Sinks} to inform them of changes.
    *
    * @remarks
    * A {@link Source}, when consumed, sends a sequence of events to {@link Sink | Sinks}. In order, a
    * {@link SignalKind.Start | Start} signal will always be sent first, followed optionally by one or
    * more {@link SignalKind.Push | Push signals}, carrying values and representing the stream. A
    * {@link Source} will send the {@link SignalKind.End | End signal} when it runs out of values. The
    * End signal will be omitted if the Source is cancelled by a
    * {@link TalkbackKind.Close | Close signal}, sent back from the {@link Sink}.
    * @see {@link SignalKind} for the kinds signals sent by {@link Source | Sources}.
    * @see {@link Start} for the data structure of the start signal.
    * @see {@link Push} for the data structure of the push signal.
    */
  type Signal[T] = Start[T] | Push[T] | End
  
  /**
    * Callback function that is called by a {@link Source} with {@link Signal | Signals}.
    *
    * @remarks
    * A Sink is a function that is called repeatedly with signals from a {@link Source}. It represents
    * the receiver of the stream of signals/events coming from a {@link Source}.
    * @see {@link Signal} for the data structure of signals.
    */
  type Sink[T] = js.Function1[/* signal */ Signal[T], Unit]
  
  /** Factory function that calls {@link Sink | Sinks} with {@link Signal | Signals} when invoked.
    * @remarks
    * A Source is a factory function that when invoked with a {@link Sink}, calls it with
    * {@link Signal | Signals} to create a stream of events, informing it of new values and the
    * potential end of the stream of values. The first signal a Source sends is always a
    * {@link Start | Start signal} that sends a talkback function to the {@link Sink}, so it may request
    * new values or cancel the source.
    *
    * @see {@link Signal} for the data structure of signals.
    * @see {@link Sink} for the data structure of sinks.
    */
  type Source[T] = js.Function1[/* sink */ Sink[T], Unit]
  
  /**
    * Indicates the start of a stream to a {@link Sink}.
    *
    * @remarks
    * This signal is sent from a {@link Source} to a {@link Sink} at the start of a stream to inform it
    * that values can be pulled and/or will be sent. This signal carries a
    * {@link TalkbackFn | talkback function} that is used by the {@link Sink} to communicate back to the
    * {@link Source} as a callback. The talkback accepts {@link TalkbackKind.Pull | Pull} and
    * {@link TalkbackKind.Close | Close} signals.
    */
  type Start[_T] = Tag[typings.wonka.mod.SignalKind.Start] & js.Array[TalkbackFn]
  
  /** Subjects combine a {@link Source} with the {@link Observer} that is used to send values on said Source.
    * @remarks
    * A Subject is used whenever an event hub-like structure is needed, as it both provides the
    * {@link Observer}'s methods to send signals, as well as the `source` to receive said signals.
    *
    * @see {@link makeSubject | `makeSubject` source} for a helper that creates this structure.
    */
  trait Subject[T]
    extends StObject
       with Observer[T] {
    
    /** The {@link Source} that issues the signals as the {@link Observer} methods are called. */
    def source(sink: Sink[T]): Unit
    /** The {@link Source} that issues the signals as the {@link Observer} methods are called. */
    @JSName("source")
    var source_Original: Source[T]
  }
  object Subject {
    
    inline def apply[T](complete: () => Unit, next: T => Unit, source: /* sink */ Sink[T] => Unit): Subject[T] = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), next = js.Any.fromFunction1(next), source = js.Any.fromFunction1(source))
      __obj.asInstanceOf[Subject[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Subject[?], T] (val x: Self & Subject[T]) extends AnyVal {
      
      inline def setSource(value: /* sink */ Sink[T] => Unit): Self = StObject.set(x, "source", js.Any.fromFunction1(value))
    }
  }
  
  /** Subscription object that can be used to cancel a {@link Source}.
    * @see {@link subscribe | subscribe sink} for a helper that returns this structure.
    */
  trait Subscription extends StObject {
    
    /**
      * Cancels a {@link Source} to stop the subscription from receiving new values.
      *
      * @see {@link TalkbackKind.Close | Close signal} This uses the {@link TalkbackFn | talkback function} to send a {@link TalkbackKind.Close | Close signal}
      *   to the subscribed-to {@link Source} to stop it from sending new values. This cleans up the subscription
      *   and ends it immediately.
      */
    def unsubscribe(): Unit
  }
  object Subscription {
    
    inline def apply(unsubscribe: () => Unit): Subscription = {
      val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[Subscription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
      
      inline def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * The tag property that's put on unary `[T]` tuple to turn them into signals carrying values.
    *
    * @internal
    */
  trait Tag[T] extends StObject {
    
    var tag: T
  }
  object Tag {
    
    inline def apply[T](tag: T): Tag[T] = {
      val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tag[?], T] (val x: Self & Tag[T]) extends AnyVal {
      
      inline def setTag(value: T): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Talkback callback that sends instructions to a source.
    *
    * @remarks
    * This function sends a {@link TalkbackKind} signal to the source to instruct it to send a new value
    * (pulling) or to be cancelled and stop sending values altogether.
    */
  type TalkbackFn = js.Function1[/* signal */ TalkbackKind, Unit]
  
  /**
    * Callback that is called when a source is cancelled.
    *
    * @remarks
    * This is used, in particular, in the {@link make | make Source} and is a returned function that is
    * called when the {@link TalkbackKind.Close} signal is received by the source.
    */
  type TeardownFn = js.Function0[Unit]
  
  /** Type utility to determine the type of a {@link Source}. */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends wonka.wonka.Source<infer U> ? U : never
    }}}
    */
  @js.native
  trait TypeOfSource[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends [infer Head, ...infer Tail] ? [wonka.wonka.TypeOfSource<Head>, ...wonka.wonka.TypeOfSourceArray<Tail>] : []
    }}}
    */
  type TypeOfSourceArray[T /* <: Array[Any] */] = js.Array[Any]
  
  type UnaryFn[T, R] = js.Function1[/* source */ T, R]
  
  object global {
    
    trait SymbolConstructor extends StObject {
      
      val observable: js.Symbol
    }
    object SymbolConstructor {
      
      inline def apply(observable: js.Symbol): SymbolConstructor = {
        val __obj = js.Dynamic.literal(observable = observable.asInstanceOf[js.Any])
        __obj.asInstanceOf[SymbolConstructor]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SymbolConstructor] (val x: Self) extends AnyVal {
        
        inline def setObservable(value: js.Symbol): Self = StObject.set(x, "observable", value.asInstanceOf[js.Any])
      }
    }
  }
}
