package typings.webStreamsPolyfill.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web-streams-polyfill", "ReadableStreamDefaultReader")
@js.native
open class ReadableStreamDefaultReader[R] protected () extends StObject {
  def this(stream: ReadableStream[R]) = this()
  
  /**
    * If the reader is active, behaves the same as {@link ReadableStream.cancel | stream.cancel(reason)}.
    */
  def cancel(): js.Promise[Unit] = js.native
  def cancel(reason: Any): js.Promise[Unit] = js.native
  
  /**
    * Returns a promise that will be fulfilled when the stream becomes closed,
    * or rejected if the stream ever errors or the reader's lock is released before the stream finishes closing.
    */
  val closed: js.Promise[Unit] = js.native
  
  /**
    * Returns a promise that allows access to the next chunk from the stream's internal queue, if available.
    *
    * If reading a chunk causes the queue to become empty, more data will be pulled from the underlying source.
    */
  def read(): js.Promise[ReadableStreamDefaultReadResult[R]] = js.native
  
  /**
    * Releases the reader's lock on the corresponding stream. After the lock is released, the reader is no longer active.
    * If the associated stream is errored when the lock is released, the reader will appear errored in the same way
    * from now on; otherwise, the reader will appear closed.
    *
    * A reader's lock cannot be released while it still has a pending read request, i.e., if a promise returned by
    * the reader's {@link ReadableStreamDefaultReader.read | read()} method has not yet been settled. Attempting to
    * do so will throw a `TypeError` and leave the reader locked to the stream.
    */
  def releaseLock(): Unit = js.native
}
