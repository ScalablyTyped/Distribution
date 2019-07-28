package typings.xstream.xstreamMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.xstream.Anon_Subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstream", JSImport.Default)
@js.native
object default
  extends Instantiable0[Stream[js.Object]]
     with Instantiable1[
      /* producer */ InternalProducer[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
      Stream[js.Object]
    ] {
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
  def fromObservable[T](obs: Anon_Subscribe): Stream[T] = js.native
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

