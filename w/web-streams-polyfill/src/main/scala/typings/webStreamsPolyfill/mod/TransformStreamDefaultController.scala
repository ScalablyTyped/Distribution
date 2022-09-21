package typings.webStreamsPolyfill.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web-streams-polyfill", "TransformStreamDefaultController")
@js.native
/* private */ open class TransformStreamDefaultController[O] () extends StObject {
  
  /**
    * Returns the desired size to fill the readable side’s internal queue. It can be negative, if the queue is over-full.
    */
  val desiredSize: Double | Null = js.native
  
  /**
    * Enqueues the given chunk `chunk` in the readable side of the controlled transform stream.
    */
  def enqueue(chunk: O): Unit = js.native
  
  /**
    * Errors both the readable side and the writable side of the controlled transform stream, making all future
    * interactions with it fail with the given error `e`. Any chunks queued for transformation will be discarded.
    */
  def error(): Unit = js.native
  def error(reason: Any): Unit = js.native
  
  /**
    * Closes the readable side and errors the writable side of the controlled transform stream. This is useful when the
    * transformer only needs to consume a portion of the chunks written to the writable side.
    */
  def terminate(): Unit = js.native
}
