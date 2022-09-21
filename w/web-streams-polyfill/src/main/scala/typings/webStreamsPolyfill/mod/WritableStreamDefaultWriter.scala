package typings.webStreamsPolyfill.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web-streams-polyfill", "WritableStreamDefaultWriter")
@js.native
open class WritableStreamDefaultWriter[W] protected () extends StObject {
  def this(stream: WritableStream[W]) = this()
  
  /**
    * If the reader is active, behaves the same as {@link WritableStream.abort | stream.abort(reason)}.
    */
  def abort(): js.Promise[Unit] = js.native
  def abort(reason: Any): js.Promise[Unit] = js.native
  
  /**
    * If the reader is active, behaves the same as {@link WritableStream.close | stream.close()}.
    */
  def close(): js.Promise[Unit] = js.native
  
  /**
    * Returns a promise that will be fulfilled when the stream becomes closed, or rejected if the stream ever errors or
    * the writer’s lock is released before the stream finishes closing.
    */
  val closed: js.Promise[Unit] = js.native
  
  /**
    * Returns the desired size to fill the stream’s internal queue. It can be negative, if the queue is over-full.
    * A producer can use this information to determine the right amount of data to write.
    *
    * It will be `null` if the stream cannot be successfully written to (due to either being errored, or having an abort
    * queued up). It will return zero if the stream is closed. And the getter will throw an exception if invoked when
    * the writer’s lock is released.
    */
  val desiredSize: Double | Null = js.native
  
  /**
    * Returns a promise that will be fulfilled when the desired size to fill the stream’s internal queue transitions
    * from non-positive to positive, signaling that it is no longer applying backpressure. Once the desired size dips
    * back to zero or below, the getter will return a new promise that stays pending until the next transition.
    *
    * If the stream becomes errored or aborted, or the writer’s lock is released, the returned promise will become
    * rejected.
    */
  val ready: js.Promise[Unit] = js.native
  
  /**
    * Releases the writer’s lock on the corresponding stream. After the lock is released, the writer is no longer active.
    * If the associated stream is errored when the lock is released, the writer will appear errored in the same way from
    * now on; otherwise, the writer will appear closed.
    *
    * Note that the lock can still be released even if some ongoing writes have not yet finished (i.e. even if the
    * promises returned from previous calls to {@link WritableStreamDefaultWriter.write | write()} have not yet settled).
    * It’s not necessary to hold the lock on the writer for the duration of the write; the lock instead simply prevents
    * other producers from writing in an interleaved manner.
    */
  def releaseLock(): Unit = js.native
  
  /**
    * Writes the given chunk to the writable stream, by waiting until any previous writes have finished successfully,
    * and then sending the chunk to the underlying sink's {@link UnderlyingSink.write | write()} method. It will return
    * a promise that fulfills with undefined upon a successful write, or rejects if the write fails or stream becomes
    * errored before the writing process is initiated.
    *
    * Note that what "success" means is up to the underlying sink; it might indicate simply that the chunk has been
    * accepted, and not necessarily that it is safely saved to its ultimate destination.
    */
  def write(chunk: W): js.Promise[Unit] = js.native
}
