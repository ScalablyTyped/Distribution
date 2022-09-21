package typings.webStreamsPolyfill.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web-streams-polyfill", "ReadableStreamDefaultController")
@js.native
/* private */ open class ReadableStreamDefaultController[R] () extends StObject {
  
  /**
    * Closes the controlled readable stream. Consumers will still be able to read any previously-enqueued chunks from
    * the stream, but once those are read, the stream will become closed.
    */
  def close(): Unit = js.native
  
  /**
    * Returns the desired size to fill the controlled stream's internal queue. It can be negative, if the queue is
    * over-full. An underlying source ought to use this information to determine when and how to apply backpressure.
    */
  val desiredSize: Double | Null = js.native
  
  /**
    * Enqueues the given chunk `chunk` in the controlled readable stream.
    */
  def enqueue(chunk: R): Unit = js.native
  
  /**
    * Errors the controlled readable stream, making all future interactions with it fail with the given error `e`.
    */
  def error(): Unit = js.native
  def error(e: Any): Unit = js.native
}
