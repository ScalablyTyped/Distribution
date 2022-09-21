package typings.webStreamsPolyfill.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web-streams-polyfill", "ReadableByteStreamController")
@js.native
/* private */ open class ReadableByteStreamController () extends StObject {
  
  /**
    * Returns the current BYOB pull request, or `null` if there isn't one.
    */
  val byobRequest: ReadableStreamBYOBRequest | Null = js.native
  
  /**
    * Closes the controlled readable stream. Consumers will still be able to read any previously-enqueued chunks from
    * the stream, but once those are read, the stream will become closed.
    */
  def close(): Unit = js.native
  
  /**
    * Returns the desired size to fill the controlled stream's internal queue. It can be negative, if the queue is
    * over-full. An underlying byte source ought to use this information to determine when and how to apply backpressure.
    */
  val desiredSize: Double | Null = js.native
  
  /**
    * Enqueues the given chunk chunk in the controlled readable stream.
    * The chunk has to be an `ArrayBufferView` instance, or else a `TypeError` will be thrown.
    */
  def enqueue(chunk: js.typedarray.ArrayBufferView): Unit = js.native
  
  /**
    * Errors the controlled readable stream, making all future interactions with it fail with the given error `e`.
    */
  def error(): Unit = js.native
  def error(e: Any): Unit = js.native
}
