package typings.webStreamsPolyfill.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web-streams-polyfill", "WritableStreamDefaultController")
@js.native
/* private */ open class WritableStreamDefaultController[W] () extends StObject {
  
  /**
    * The reason which was passed to `WritableStream.abort(reason)` when the stream was aborted.
    *
    * @deprecated
    *  This property has been removed from the specification, see https://github.com/whatwg/streams/pull/1177.
    *  Use {@link WritableStreamDefaultController.signal}'s `reason` instead.
    */
  val abortReason: Any = js.native
  
  /**
    * Closes the controlled writable stream, making all future interactions with it fail with the given error `e`.
    *
    * This method is rarely used, since usually it suffices to return a rejected promise from one of the underlying
    * sink's methods. However, it can be useful for suddenly shutting down a stream in response to an event outside the
    * normal lifecycle of interactions with the underlying sink.
    */
  def error(): Unit = js.native
  def error(e: Any): Unit = js.native
  
  /**
    * An `AbortSignal` that can be used to abort the pending write or close operation when the stream is aborted.
    */
  val signal: AbortSignal = js.native
}
