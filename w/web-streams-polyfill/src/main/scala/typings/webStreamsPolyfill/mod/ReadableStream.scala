package typings.webStreamsPolyfill.mod

import typings.webStreamsPolyfill.anon.HighWaterMark
import typings.webStreamsPolyfill.anon.Mode
import typings.webStreamsPolyfill.anon.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web-streams-polyfill", "ReadableStream")
@js.native
open class ReadableStream[R] () extends StObject {
  def this(underlyingSource: UnderlyingByteSource) = this()
  def this(underlyingSource: UnderlyingSource[R]) = this()
  def this(underlyingSource: Unit, strategy: QueuingStrategy[R]) = this()
  def this(underlyingSource: UnderlyingByteSource, strategy: HighWaterMark) = this()
  def this(underlyingSource: UnderlyingSource[R], strategy: QueuingStrategy[R]) = this()
  
  /**
    * Cancels the stream, signaling a loss of interest in the stream by a consumer.
    *
    * The supplied `reason` argument will be given to the underlying source's {@link UnderlyingSource.cancel | cancel()}
    * method, which might or might not use it.
    */
  def cancel(): js.Promise[Unit] = js.native
  def cancel(reason: Any): js.Promise[Unit] = js.native
  
  /**
    * Creates a {@link ReadableStreamDefaultReader} and locks the stream to the new reader.
    * While the stream is locked, no other reader can be acquired until this one is released.
    *
    * This functionality is especially useful for creating abstractions that desire the ability to consume a stream
    * in its entirety. By getting a reader for the stream, you can ensure nobody else can interleave reads with yours
    * or cancel the stream, which would interfere with your abstraction.
    */
  def getReader(): ReadableStreamDefaultReader[R] = js.native
  /**
    * Creates a {@link ReadableStreamBYOBReader} and locks the stream to the new reader.
    *
    * This call behaves the same way as the no-argument variant, except that it only works on readable byte streams,
    * i.e. streams which were constructed specifically with the ability to handle "bring your own buffer" reading.
    * The returned BYOB reader provides the ability to directly read individual chunks from the stream via its
    * {@link ReadableStreamBYOBReader.read | read()} method, into developer-supplied buffers, allowing more precise
    * control over allocation.
    */
  def getReader(hasMode: Mode): ReadableStreamBYOBReader = js.native
  
  /**
    * Whether or not the readable stream is locked to a {@link ReadableStreamDefaultReader | reader}.
    */
  val locked: Boolean = js.native
  
  /**
    * Provides a convenient, chainable way of piping this readable stream through a transform stream
    * (or any other `{ writable, readable }` pair). It simply {@link ReadableStream.pipeTo | pipes} the stream
    * into the writable side of the supplied pair, and returns the readable side for further use.
    *
    * Piping a stream will lock it for the duration of the pipe, preventing any other consumer from acquiring a reader.
    */
  def pipeThrough[RS /* <: ReadableStream[Any] */](transform: Readable[RS, R]): RS = js.native
  def pipeThrough[RS /* <: ReadableStream[Any] */](transform: Readable[RS, R], options: StreamPipeOptions): RS = js.native
  
  /**
    * Pipes this readable stream to a given writable stream. The way in which the piping process behaves under
    * various error conditions can be customized with a number of passed options. It returns a promise that fulfills
    * when the piping process completes successfully, or rejects if any errors were encountered.
    *
    * Piping a stream will lock it for the duration of the pipe, preventing any other consumer from acquiring a reader.
    */
  def pipeTo(destination: WritableStream[R]): js.Promise[Unit] = js.native
  def pipeTo(destination: WritableStream[R], options: StreamPipeOptions): js.Promise[Unit] = js.native
  
  /**
    * Tees this readable stream, returning a two-element array containing the two resulting branches as
    * new {@link ReadableStream} instances.
    *
    * Teeing a stream will lock it, preventing any other consumer from acquiring a reader.
    * To cancel the stream, cancel both of the resulting branches; a composite cancellation reason will then be
    * propagated to the stream's underlying source.
    *
    * Note that the chunks seen in each branch will be the same object. If the chunks are not immutable,
    * this could allow interference between the two branches.
    */
  def tee(): js.Tuple2[ReadableStream[R], ReadableStream[R]] = js.native
  
  /**
    * Asynchronously iterates over the chunks in the stream's internal queue.
    *
    * Asynchronously iterating over the stream will lock it, preventing any other consumer from acquiring a reader.
    * The lock will be released if the async iterator's {@link ReadableStreamAsyncIterator.return | return()} method
    * is called, e.g. by breaking out of the loop.
    *
    * By default, calling the async iterator's {@link ReadableStreamAsyncIterator.return | return()} method will also
    * cancel the stream. To prevent this, use the stream's {@link ReadableStream.values | values()} method, passing
    * `true` for the `preventCancel` option.
    */
  def values(): ReadableStreamAsyncIterator[R] = js.native
  def values(options: ReadableStreamIteratorOptions): ReadableStreamAsyncIterator[R] = js.native
}
