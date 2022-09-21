package typings.webStreamsPolyfill.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web-streams-polyfill", "WritableStream")
@js.native
open class WritableStream[W] () extends StObject {
  def this(underlyingSink: UnderlyingSink[W]) = this()
  def this(underlyingSink: Unit, strategy: QueuingStrategy[W]) = this()
  def this(underlyingSink: UnderlyingSink[W], strategy: QueuingStrategy[W]) = this()
  
  /**
    * Aborts the stream, signaling that the producer can no longer successfully write to the stream and it is to be
    * immediately moved to an errored state, with any queued-up writes discarded. This will also execute any abort
    * mechanism of the underlying sink.
    *
    * The returned promise will fulfill if the stream shuts down successfully, or reject if the underlying sink signaled
    * that there was an error doing so. Additionally, it will reject with a `TypeError` (without attempting to cancel
    * the stream) if the stream is currently locked.
    */
  def abort(): js.Promise[Unit] = js.native
  def abort(reason: Any): js.Promise[Unit] = js.native
  
  /**
    * Closes the stream. The underlying sink will finish processing any previously-written chunks, before invoking its
    * close behavior. During this time any further attempts to write will fail (without erroring the stream).
    *
    * The method returns a promise that will fulfill if all remaining chunks are successfully written and the stream
    * successfully closes, or rejects if an error is encountered during this process. Additionally, it will reject with
    * a `TypeError` (without attempting to cancel the stream) if the stream is currently locked.
    */
  def close(): js.Promise[Unit] = js.native
  
  /**
    * Creates a {@link WritableStreamDefaultWriter | writer} and locks the stream to the new writer. While the stream
    * is locked, no other writer can be acquired until this one is released.
    *
    * This functionality is especially useful for creating abstractions that desire the ability to write to a stream
    * without interruption or interleaving. By getting a writer for the stream, you can ensure nobody else can write at
    * the same time, which would cause the resulting written data to be unpredictable and probably useless.
    */
  def getWriter(): WritableStreamDefaultWriter[W] = js.native
  
  /**
    * Returns whether or not the writable stream is locked to a writer.
    */
  val locked: Boolean = js.native
}
