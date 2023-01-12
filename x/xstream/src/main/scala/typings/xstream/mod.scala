package typings.xstream

import typings.std.Partial
import typings.std.PromiseLike
import typings.xstream.anon.Subscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* was `typeof Stream` */
  @JSImport("xstream", JSImport.Default)
  @js.native
  open class default[T] () extends Stream[T] {
    def this(producer: InternalProducer[T]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("xstream", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def combine(): Stream[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")().asInstanceOf[Stream[js.Array[Any]]]
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
    inline def combine(stream: Stream[Any]*): Stream[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(stream.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Stream[js.Array[Any]]]
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
    inline def combine[T1](s1: Stream[T1]): Stream[js.Array[T1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(s1.asInstanceOf[js.Any]).asInstanceOf[Stream[js.Array[T1]]]
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
    inline def combine[T1, T2](s1: Stream[T1], s2: Stream[T2]): Stream[js.Tuple2[T1, T2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any])).asInstanceOf[Stream[js.Tuple2[T1, T2]]]
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
    inline def combine[T1, T2, T3](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3]): Stream[js.Tuple3[T1, T2, T3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any])).asInstanceOf[Stream[js.Tuple3[T1, T2, T3]]]
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
    inline def combine[T1, T2, T3, T4](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4]): Stream[js.Tuple4[T1, T2, T3, T4]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any])).asInstanceOf[Stream[js.Tuple4[T1, T2, T3, T4]]]
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
    inline def combine[T1, T2, T3, T4, T5](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4], s5: Stream[T5]): Stream[js.Tuple5[T1, T2, T3, T4, T5]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any])).asInstanceOf[Stream[js.Tuple5[T1, T2, T3, T4, T5]]]
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
    inline def combine[T1, T2, T3, T4, T5, T6](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4], s5: Stream[T5], s6: Stream[T6]): Stream[js.Tuple6[T1, T2, T3, T4, T5, T6]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any])).asInstanceOf[Stream[js.Tuple6[T1, T2, T3, T4, T5, T6]]]
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
    inline def combine[T1, T2, T3, T4, T5, T6, T7](
      s1: Stream[T1],
      s2: Stream[T2],
      s3: Stream[T3],
      s4: Stream[T4],
      s5: Stream[T5],
      s6: Stream[T6],
      s7: Stream[T7]
    ): Stream[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any])).asInstanceOf[Stream[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]]]
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
    inline def combine[T1, T2, T3, T4, T5, T6, T7, T8](
      s1: Stream[T1],
      s2: Stream[T2],
      s3: Stream[T3],
      s4: Stream[T4],
      s5: Stream[T5],
      s6: Stream[T6],
      s7: Stream[T7],
      s8: Stream[T8]
    ): Stream[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any])).asInstanceOf[Stream[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]]]
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
    inline def combine[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      s1: Stream[T1],
      s2: Stream[T2],
      s3: Stream[T3],
      s4: Stream[T4],
      s5: Stream[T5],
      s6: Stream[T6],
      s7: Stream[T7],
      s8: Stream[T8],
      s9: Stream[T9]
    ): Stream[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any], s9.asInstanceOf[js.Any])).asInstanceOf[Stream[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]]]
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
    inline def combine[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
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
    ): Stream[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any], s9.asInstanceOf[js.Any], s10.asInstanceOf[js.Any])).asInstanceOf[Stream[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]]]
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
    @JSImport("xstream", "default.combine")
    @js.native
    def combine_Fdefault: CombineSignature = js.native
    
    inline def combine_Fdefault_=(x: CombineSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("combine")(x.asInstanceOf[js.Any])
    
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
    inline def combine_T[T](stream: Stream[T]*): Stream[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(stream.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Stream[js.Array[T]]]
    
    /**
      * Creates a new Stream given a Producer.
      *
      * @factory true
      * @param {Producer} producer An optional Producer that dictates how to
      * start, generate events, and stop the Stream.
      * @return {Stream}
      */
    inline def create[T](): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Stream[T]]
    inline def create[T](producer: Producer[T]): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(producer.asInstanceOf[js.Any]).asInstanceOf[Stream[T]]
    
    /**
      * Creates a new MemoryStream given a Producer.
      *
      * @factory true
      * @param {Producer} producer An optional Producer that dictates how to
      * start, generate events, and stop the Stream.
      * @return {MemoryStream}
      */
    inline def createWithMemory[T](): MemoryStream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWithMemory")().asInstanceOf[MemoryStream[T]]
    inline def createWithMemory[T](producer: Producer[T]): MemoryStream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWithMemory")(producer.asInstanceOf[js.Any]).asInstanceOf[MemoryStream[T]]
    
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
    inline def empty[T](): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Stream[T]]
    
    inline def from[T](input: js.Array[T]): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(input.asInstanceOf[js.Any]).asInstanceOf[Stream[T]]
    /**
      * Creates a stream from an Array, Promise, or an Observable.
      *
      * @factory true
      * @param {Array|PromiseLike|Observable} input The input to make a stream from.
      * @return {Stream}
      */
    inline def from[T](input: PromiseLike[T]): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(input.asInstanceOf[js.Any]).asInstanceOf[Stream[T]]
    inline def from[T](input: Observable[T]): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(input.asInstanceOf[js.Any]).asInstanceOf[Stream[T]]
    inline def from[T](input: Stream[T]): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(input.asInstanceOf[js.Any]).asInstanceOf[Stream[T]]
    
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
    inline def fromArray[T](array: js.Array[T]): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Stream[T]]
    
    /**
      * Converts an Observable into a Stream.
      *
      * @factory true
      * @param {any} observable The observable to be converted as a stream.
      * @return {Stream}
      */
    inline def fromObservable[T](obs: Subscribe): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObservable")(obs.asInstanceOf[js.Any]).asInstanceOf[Stream[T]]
    
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
    inline def fromPromise[T](promise: PromiseLike[T]): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[Stream[T]]
    
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
    inline def merge(): Stream[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")().asInstanceOf[Stream[Any]]
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
    inline def merge[T1](s1: Stream[T1]): Stream[T1] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(s1.asInstanceOf[js.Any]).asInstanceOf[Stream[T1]]
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
    inline def merge[T](stream: Stream[T]*): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(stream.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Stream[T]]
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
    inline def merge[T1, T2](s1: Stream[T1], s2: Stream[T2]): Stream[T1 | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any])).asInstanceOf[Stream[T1 | T2]]
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
    inline def merge[T1, T2, T3](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3]): Stream[T1 | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any])).asInstanceOf[Stream[T1 | T2 | T3]]
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
    inline def merge[T1, T2, T3, T4](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4]): Stream[T1 | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any])).asInstanceOf[Stream[T1 | T2 | T3 | T4]]
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
    inline def merge[T1, T2, T3, T4, T5](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4], s5: Stream[T5]): Stream[T1 | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any])).asInstanceOf[Stream[T1 | T2 | T3 | T4 | T5]]
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
    inline def merge[T1, T2, T3, T4, T5, T6](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4], s5: Stream[T5], s6: Stream[T6]): Stream[T1 | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any])).asInstanceOf[Stream[T1 | T2 | T3 | T4 | T5 | T6]]
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
    inline def merge[T1, T2, T3, T4, T5, T6, T7](
      s1: Stream[T1],
      s2: Stream[T2],
      s3: Stream[T3],
      s4: Stream[T4],
      s5: Stream[T5],
      s6: Stream[T6],
      s7: Stream[T7]
    ): Stream[T1 | T2 | T3 | T4 | T5 | T6 | T7] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any])).asInstanceOf[Stream[T1 | T2 | T3 | T4 | T5 | T6 | T7]]
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
    inline def merge[T1, T2, T3, T4, T5, T6, T7, T8](
      s1: Stream[T1],
      s2: Stream[T2],
      s3: Stream[T3],
      s4: Stream[T4],
      s5: Stream[T5],
      s6: Stream[T6],
      s7: Stream[T7],
      s8: Stream[T8]
    ): Stream[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any])).asInstanceOf[Stream[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]]
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
    inline def merge[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      s1: Stream[T1],
      s2: Stream[T2],
      s3: Stream[T3],
      s4: Stream[T4],
      s5: Stream[T5],
      s6: Stream[T6],
      s7: Stream[T7],
      s8: Stream[T8],
      s9: Stream[T9]
    ): Stream[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any], s9.asInstanceOf[js.Any])).asInstanceOf[Stream[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]]
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
    inline def merge[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
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
    ): Stream[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any], s9.asInstanceOf[js.Any], s10.asInstanceOf[js.Any])).asInstanceOf[Stream[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]]
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
    @JSImport("xstream", "default.merge")
    @js.native
    def merge_Fdefault: MergeSignature = js.native
    
    inline def merge_Fdefault_=(x: MergeSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("merge")(x.asInstanceOf[js.Any])
    
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
    inline def never[T](): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("never")().asInstanceOf[Stream[T]]
    
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
    inline def of[T](items: T*): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Stream[T]]
    
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
    inline def periodic(period: Double): Stream[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("periodic")(period.asInstanceOf[js.Any]).asInstanceOf[Stream[Double]]
    
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
    inline def `throw`(error: Any): Stream[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("throw")(error.asInstanceOf[js.Any]).asInstanceOf[Stream[Any]]
  }
  
  @JSImport("xstream", "MemoryStream")
  @js.native
  open class MemoryStream[T] protected () extends Stream[T] {
    def this(producer: InternalProducer[T]) = this()
    
    /* private */ var _has: Any = js.native
    
    /* private */ var _v: Any = js.native
  }
  
  @JSImport("xstream", "NO_IL")
  @js.native
  val NO_IL: InternalListener[Any] = js.native
  
  @JSImport("xstream", "Stream")
  @js.native
  open class Stream[T] ()
    extends StObject
       with InternalListener[T] {
    def this(producer: InternalProducer[T]) = this()
    
    def _add(il: InternalListener[T]): Unit = js.native
    
    /* CompleteClass */
    override def _c(): Unit = js.native
    
    /* protected */ var _d: Boolean = js.native
    
    /* protected */ var _dl: InternalListener[T] = js.native
    
    /* CompleteClass */
    override def _e(err: Any): Unit = js.native
    
    /* protected */ var _err: Any = js.native
    
    def _hasNoSinks(x: InternalListener[Any], trace: js.Array[Any]): Boolean = js.native
    
    /* protected */ var _ils: js.Array[InternalListener[T]] = js.native
    
    /* protected */ def _map[U](project: js.Function1[/* t */ T, U]): Stream[U] | MemoryStream[U] = js.native
    
    /* CompleteClass */
    override def _n(v: T): Unit = js.native
    
    var _prod: InternalProducer[T] = js.native
    
    def _pruneCycles(): Unit = js.native
    
    def _remove(il: InternalListener[T]): Unit = js.native
    
    /* protected */ var _stopID: Any = js.native
    
    def _stopNow(): Unit = js.native
    
    /* protected */ var _target: Stream[T] | Null = js.native
    
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
    
    /* private */ var ctor: Any = js.native
    
    def debug(): Stream[T] = js.native
    def debug(labelOrSpy: String): Stream[T] = js.native
    def debug(labelOrSpy: js.Function1[/* t */ T, Any]): Stream[T] = js.native
    
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
    def endWhen(other: Stream[Any]): Stream[T] = js.native
    
    def filter(passes: js.Function1[/* t */ T, Boolean]): Stream[T] = js.native
    @JSName("filter")
    def filter_S[S /* <: T */](passes: js.Function1[/* t */ T, /* is S */ Boolean]): Stream[S] = js.native
    
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
    def replaceError(replace: js.Function1[/* err */ Any, Stream[T]]): Stream[T] = js.native
    
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
    def shamefullySendError(error: Any): Unit = js.native
    
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
  object Stream {
    
    @JSImport("xstream", "Stream")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def combine(): Stream[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")().asInstanceOf[Stream[js.Array[Any]]]
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
    inline def combine(stream: Stream[Any]*): Stream[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(stream.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Stream[js.Array[Any]]]
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
    inline def combine[T1](s1: Stream[T1]): Stream[js.Array[T1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(s1.asInstanceOf[js.Any]).asInstanceOf[Stream[js.Array[T1]]]
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
    inline def combine[T1, T2](s1: Stream[T1], s2: Stream[T2]): Stream[js.Tuple2[T1, T2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any])).asInstanceOf[Stream[js.Tuple2[T1, T2]]]
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
    inline def combine[T1, T2, T3](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3]): Stream[js.Tuple3[T1, T2, T3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any])).asInstanceOf[Stream[js.Tuple3[T1, T2, T3]]]
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
    inline def combine[T1, T2, T3, T4](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4]): Stream[js.Tuple4[T1, T2, T3, T4]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any])).asInstanceOf[Stream[js.Tuple4[T1, T2, T3, T4]]]
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
    inline def combine[T1, T2, T3, T4, T5](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4], s5: Stream[T5]): Stream[js.Tuple5[T1, T2, T3, T4, T5]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any])).asInstanceOf[Stream[js.Tuple5[T1, T2, T3, T4, T5]]]
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
    inline def combine[T1, T2, T3, T4, T5, T6](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4], s5: Stream[T5], s6: Stream[T6]): Stream[js.Tuple6[T1, T2, T3, T4, T5, T6]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any])).asInstanceOf[Stream[js.Tuple6[T1, T2, T3, T4, T5, T6]]]
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
    inline def combine[T1, T2, T3, T4, T5, T6, T7](
      s1: Stream[T1],
      s2: Stream[T2],
      s3: Stream[T3],
      s4: Stream[T4],
      s5: Stream[T5],
      s6: Stream[T6],
      s7: Stream[T7]
    ): Stream[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any])).asInstanceOf[Stream[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]]]
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
    inline def combine[T1, T2, T3, T4, T5, T6, T7, T8](
      s1: Stream[T1],
      s2: Stream[T2],
      s3: Stream[T3],
      s4: Stream[T4],
      s5: Stream[T5],
      s6: Stream[T6],
      s7: Stream[T7],
      s8: Stream[T8]
    ): Stream[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any])).asInstanceOf[Stream[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]]]
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
    inline def combine[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      s1: Stream[T1],
      s2: Stream[T2],
      s3: Stream[T3],
      s4: Stream[T4],
      s5: Stream[T5],
      s6: Stream[T6],
      s7: Stream[T7],
      s8: Stream[T8],
      s9: Stream[T9]
    ): Stream[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any], s9.asInstanceOf[js.Any])).asInstanceOf[Stream[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]]]
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
    inline def combine[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
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
    ): Stream[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any], s9.asInstanceOf[js.Any], s10.asInstanceOf[js.Any])).asInstanceOf[Stream[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]]]
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
    @JSImport("xstream", "Stream.combine")
    @js.native
    def combine_FStream: CombineSignature = js.native
    
    inline def combine_FStream_=(x: CombineSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("combine")(x.asInstanceOf[js.Any])
    
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
    inline def combine_T[T](stream: Stream[T]*): Stream[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(stream.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Stream[js.Array[T]]]
    
    /**
      * Creates a new Stream given a Producer.
      *
      * @factory true
      * @param {Producer} producer An optional Producer that dictates how to
      * start, generate events, and stop the Stream.
      * @return {Stream}
      */
    inline def create[T](): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Stream[T]]
    inline def create[T](producer: Producer[T]): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(producer.asInstanceOf[js.Any]).asInstanceOf[Stream[T]]
    
    /**
      * Creates a new MemoryStream given a Producer.
      *
      * @factory true
      * @param {Producer} producer An optional Producer that dictates how to
      * start, generate events, and stop the Stream.
      * @return {MemoryStream}
      */
    inline def createWithMemory[T](): MemoryStream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWithMemory")().asInstanceOf[MemoryStream[T]]
    inline def createWithMemory[T](producer: Producer[T]): MemoryStream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWithMemory")(producer.asInstanceOf[js.Any]).asInstanceOf[MemoryStream[T]]
    
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
    inline def empty[T](): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Stream[T]]
    
    inline def from[T](input: js.Array[T]): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(input.asInstanceOf[js.Any]).asInstanceOf[Stream[T]]
    /**
      * Creates a stream from an Array, Promise, or an Observable.
      *
      * @factory true
      * @param {Array|PromiseLike|Observable} input The input to make a stream from.
      * @return {Stream}
      */
    inline def from[T](input: PromiseLike[T]): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(input.asInstanceOf[js.Any]).asInstanceOf[Stream[T]]
    inline def from[T](input: Observable[T]): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(input.asInstanceOf[js.Any]).asInstanceOf[Stream[T]]
    inline def from[T](input: Stream[T]): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(input.asInstanceOf[js.Any]).asInstanceOf[Stream[T]]
    
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
    inline def fromArray[T](array: js.Array[T]): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Stream[T]]
    
    /**
      * Converts an Observable into a Stream.
      *
      * @factory true
      * @param {any} observable The observable to be converted as a stream.
      * @return {Stream}
      */
    inline def fromObservable[T](obs: Subscribe): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObservable")(obs.asInstanceOf[js.Any]).asInstanceOf[Stream[T]]
    
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
    inline def fromPromise[T](promise: PromiseLike[T]): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[Stream[T]]
    
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
    inline def merge(): Stream[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")().asInstanceOf[Stream[Any]]
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
    inline def merge[T1](s1: Stream[T1]): Stream[T1] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(s1.asInstanceOf[js.Any]).asInstanceOf[Stream[T1]]
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
    inline def merge[T](stream: Stream[T]*): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(stream.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Stream[T]]
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
    inline def merge[T1, T2](s1: Stream[T1], s2: Stream[T2]): Stream[T1 | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any])).asInstanceOf[Stream[T1 | T2]]
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
    inline def merge[T1, T2, T3](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3]): Stream[T1 | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any])).asInstanceOf[Stream[T1 | T2 | T3]]
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
    inline def merge[T1, T2, T3, T4](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4]): Stream[T1 | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any])).asInstanceOf[Stream[T1 | T2 | T3 | T4]]
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
    inline def merge[T1, T2, T3, T4, T5](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4], s5: Stream[T5]): Stream[T1 | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any])).asInstanceOf[Stream[T1 | T2 | T3 | T4 | T5]]
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
    inline def merge[T1, T2, T3, T4, T5, T6](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4], s5: Stream[T5], s6: Stream[T6]): Stream[T1 | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any])).asInstanceOf[Stream[T1 | T2 | T3 | T4 | T5 | T6]]
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
    inline def merge[T1, T2, T3, T4, T5, T6, T7](
      s1: Stream[T1],
      s2: Stream[T2],
      s3: Stream[T3],
      s4: Stream[T4],
      s5: Stream[T5],
      s6: Stream[T6],
      s7: Stream[T7]
    ): Stream[T1 | T2 | T3 | T4 | T5 | T6 | T7] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any])).asInstanceOf[Stream[T1 | T2 | T3 | T4 | T5 | T6 | T7]]
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
    inline def merge[T1, T2, T3, T4, T5, T6, T7, T8](
      s1: Stream[T1],
      s2: Stream[T2],
      s3: Stream[T3],
      s4: Stream[T4],
      s5: Stream[T5],
      s6: Stream[T6],
      s7: Stream[T7],
      s8: Stream[T8]
    ): Stream[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any])).asInstanceOf[Stream[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]]
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
    inline def merge[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      s1: Stream[T1],
      s2: Stream[T2],
      s3: Stream[T3],
      s4: Stream[T4],
      s5: Stream[T5],
      s6: Stream[T6],
      s7: Stream[T7],
      s8: Stream[T8],
      s9: Stream[T9]
    ): Stream[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any], s9.asInstanceOf[js.Any])).asInstanceOf[Stream[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]]
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
    inline def merge[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
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
    ): Stream[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any], s9.asInstanceOf[js.Any], s10.asInstanceOf[js.Any])).asInstanceOf[Stream[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]]
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
    @JSImport("xstream", "Stream.merge")
    @js.native
    def merge_FStream: MergeSignature = js.native
    
    inline def merge_FStream_=(x: MergeSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("merge")(x.asInstanceOf[js.Any])
    
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
    inline def never[T](): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("never")().asInstanceOf[Stream[T]]
    
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
    inline def of[T](items: T*): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Stream[T]]
    
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
    inline def periodic(period: Double): Stream[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("periodic")(period.asInstanceOf[js.Any]).asInstanceOf[Stream[Double]]
    
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
    inline def `throw`(error: Any): Stream[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("throw")(error.asInstanceOf[js.Any]).asInstanceOf[Stream[Any]]
  }
  
  trait Aggregator[T, U]
    extends StObject
       with InternalProducer[U]
       with OutSender[U] {
    
    def _start(out: Stream[U]): Unit
    
    var insArr: js.Array[Stream[T]]
    
    var `type`: String
  }
  object Aggregator {
    
    inline def apply[T, U](
      _start: Stream[U] => Unit,
      _stop: () => Unit,
      insArr: js.Array[Stream[T]],
      out: Stream[U],
      `type`: String
    ): Aggregator[T, U] = {
      val __obj = js.Dynamic.literal(_start = js.Any.fromFunction1(_start), _stop = js.Any.fromFunction0(_stop), insArr = insArr.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Aggregator[T, U]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Aggregator[?, ?], T, U] (val x: Self & (Aggregator[T, U])) extends AnyVal {
      
      inline def setInsArr(value: js.Array[Stream[T]]): Self = StObject.set(x, "insArr", value.asInstanceOf[js.Any])
      
      inline def setInsArrVarargs(value: Stream[T]*): Self = StObject.set(x, "insArr", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def set_start(value: Stream[U] => Unit): Self = StObject.set(x, "_start", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait CombineSignature extends StObject {
    
    def apply(): Stream[js.Array[Any]] = js.native
    def apply(stream: Stream[Any]*): Stream[js.Array[Any]] = js.native
    def apply[T1](s1: Stream[T1]): Stream[js.Array[T1]] = js.native
    def apply[T1, T2](s1: Stream[T1], s2: Stream[T2]): Stream[js.Tuple2[T1, T2]] = js.native
    def apply[T1, T2, T3](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3]): Stream[js.Tuple3[T1, T2, T3]] = js.native
    def apply[T1, T2, T3, T4](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4]): Stream[js.Tuple4[T1, T2, T3, T4]] = js.native
    def apply[T1, T2, T3, T4, T5](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4], s5: Stream[T5]): Stream[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
    def apply[T1, T2, T3, T4, T5, T6](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4], s5: Stream[T5], s6: Stream[T6]): Stream[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7](
      s1: Stream[T1],
      s2: Stream[T2],
      s3: Stream[T3],
      s4: Stream[T4],
      s5: Stream[T5],
      s6: Stream[T6],
      s7: Stream[T7]
    ): Stream[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7, T8](
      s1: Stream[T1],
      s2: Stream[T2],
      s3: Stream[T3],
      s4: Stream[T4],
      s5: Stream[T5],
      s6: Stream[T6],
      s7: Stream[T7],
      s8: Stream[T8]
    ): Stream[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9](
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
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
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
  }
  
  trait InternalListener[T] extends StObject {
    
    def _c(): Unit
    
    def _e(err: Any): Unit
    
    def _n(v: T): Unit
  }
  object InternalListener {
    
    inline def apply[T](_c: () => Unit, _e: Any => Unit, _n: T => Unit): InternalListener[T] = {
      val __obj = js.Dynamic.literal(_c = js.Any.fromFunction0(_c), _e = js.Any.fromFunction1(_e), _n = js.Any.fromFunction1(_n))
      __obj.asInstanceOf[InternalListener[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalListener[?], T] (val x: Self & InternalListener[T]) extends AnyVal {
      
      inline def set_c(value: () => Unit): Self = StObject.set(x, "_c", js.Any.fromFunction0(value))
      
      inline def set_e(value: Any => Unit): Self = StObject.set(x, "_e", js.Any.fromFunction1(value))
      
      inline def set_n(value: T => Unit): Self = StObject.set(x, "_n", js.Any.fromFunction1(value))
    }
  }
  
  trait InternalProducer[T] extends StObject {
    
    def _start(listener: InternalListener[T]): Unit
    
    def _stop(): Unit
  }
  object InternalProducer {
    
    inline def apply[T](_start: InternalListener[T] => Unit, _stop: () => Unit): InternalProducer[T] = {
      val __obj = js.Dynamic.literal(_start = js.Any.fromFunction1(_start), _stop = js.Any.fromFunction0(_stop))
      __obj.asInstanceOf[InternalProducer[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalProducer[?], T] (val x: Self & InternalProducer[T]) extends AnyVal {
      
      inline def set_start(value: InternalListener[T] => Unit): Self = StObject.set(x, "_start", js.Any.fromFunction1(value))
      
      inline def set_stop(value: () => Unit): Self = StObject.set(x, "_stop", js.Any.fromFunction0(value))
    }
  }
  
  trait Listener[T] extends StObject {
    
    def complete(): Unit
    
    def error(err: Any): Unit
    
    def next(x: T): Unit
  }
  object Listener {
    
    inline def apply[T](complete: () => Unit, error: Any => Unit, next: T => Unit): Listener[T] = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[Listener[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Listener[?], T] (val x: Self & Listener[T]) extends AnyVal {
      
      inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      inline def setError(value: Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait MergeSignature extends StObject {
    
    def apply(): Stream[Any] = js.native
    def apply[T1](s1: Stream[T1]): Stream[T1] = js.native
    def apply[T](stream: Stream[T]*): Stream[T] = js.native
    def apply[T1, T2](s1: Stream[T1], s2: Stream[T2]): Stream[T1 | T2] = js.native
    def apply[T1, T2, T3](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3]): Stream[T1 | T2 | T3] = js.native
    def apply[T1, T2, T3, T4](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4]): Stream[T1 | T2 | T3 | T4] = js.native
    def apply[T1, T2, T3, T4, T5](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4], s5: Stream[T5]): Stream[T1 | T2 | T3 | T4 | T5] = js.native
    def apply[T1, T2, T3, T4, T5, T6](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4], s5: Stream[T5], s6: Stream[T6]): Stream[T1 | T2 | T3 | T4 | T5 | T6] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7](
      s1: Stream[T1],
      s2: Stream[T2],
      s3: Stream[T3],
      s4: Stream[T4],
      s5: Stream[T5],
      s6: Stream[T6],
      s7: Stream[T7]
    ): Stream[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7, T8](
      s1: Stream[T1],
      s2: Stream[T2],
      s3: Stream[T3],
      s4: Stream[T4],
      s5: Stream[T5],
      s6: Stream[T6],
      s7: Stream[T7],
      s8: Stream[T8]
    ): Stream[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9](
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
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
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
  }
  
  trait Observable[T] extends StObject {
    
    def subscribe(listener: Listener[T]): Subscription
  }
  object Observable {
    
    inline def apply[T](subscribe: Listener[T] => Subscription): Observable[T] = {
      val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[Observable[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Observable[?], T] (val x: Self & Observable[T]) extends AnyVal {
      
      inline def setSubscribe(value: Listener[T] => Subscription): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  trait Operator[T, R]
    extends StObject
       with InternalProducer[R]
       with InternalListener[T]
       with OutSender[R] {
    
    def _start(out: Stream[R]): Unit
    
    var ins: Stream[T]
    
    var `type`: String
  }
  object Operator {
    
    inline def apply[T, R](
      _c: () => Unit,
      _e: Any => Unit,
      _n: T => Unit,
      _start: Stream[R] => Unit,
      _stop: () => Unit,
      ins: Stream[T],
      out: Stream[R],
      `type`: String
    ): Operator[T, R] = {
      val __obj = js.Dynamic.literal(_c = js.Any.fromFunction0(_c), _e = js.Any.fromFunction1(_e), _n = js.Any.fromFunction1(_n), _start = js.Any.fromFunction1(_start), _stop = js.Any.fromFunction0(_stop), ins = ins.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Operator[T, R]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Operator[?, ?], T, R] (val x: Self & (Operator[T, R])) extends AnyVal {
      
      inline def setIns(value: Stream[T]): Self = StObject.set(x, "ins", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def set_start(value: Stream[R] => Unit): Self = StObject.set(x, "_start", js.Any.fromFunction1(value))
    }
  }
  
  trait OutSender[T] extends StObject {
    
    var out: Stream[T]
  }
  object OutSender {
    
    inline def apply[T](out: Stream[T]): OutSender[T] = {
      val __obj = js.Dynamic.literal(out = out.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutSender[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OutSender[?], T] (val x: Self & OutSender[T]) extends AnyVal {
      
      inline def setOut(value: Stream[T]): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
    }
  }
  
  trait Producer[T] extends StObject {
    
    def start(listener: Listener[T]): Unit
    
    def stop(): Unit
  }
  object Producer {
    
    inline def apply[T](start: Listener[T] => Unit, stop: () => Unit): Producer[T] = {
      val __obj = js.Dynamic.literal(start = js.Any.fromFunction1(start), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Producer[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Producer[?], T] (val x: Self & Producer[T]) extends AnyVal {
      
      inline def setStart(value: Listener[T] => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  trait Subscription extends StObject {
    
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
  
  /* was `typeof Stream` */
  type xs[T] = Stream[T]
}
