package typings.webStreamsPolyfill.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web-streams-polyfill", "ReadableStreamBYOBRequest")
@js.native
/* private */ open class ReadableStreamBYOBRequest () extends StObject {
  
  /**
    * Indicates to the associated readable byte stream that `bytesWritten` bytes were written into
    * {@link ReadableStreamBYOBRequest.view | view}, causing the result be surfaced to the consumer.
    *
    * After this method is called, {@link ReadableStreamBYOBRequest.view | view} will be transferred and no longer
    * modifiable.
    */
  def respond(bytesWritten: Double): Unit = js.native
  
  /**
    * Indicates to the associated readable byte stream that instead of writing into
    * {@link ReadableStreamBYOBRequest.view | view}, the underlying byte source is providing a new `ArrayBufferView`,
    * which will be given to the consumer of the readable byte stream.
    *
    * After this method is called, `view` will be transferred and no longer modifiable.
    */
  def respondWithNewView(view: js.typedarray.ArrayBufferView): Unit = js.native
  
  /**
    * Returns the view for writing in to, or `null` if the BYOB request has already been responded to.
    */
  val view: js.typedarray.ArrayBufferView | Null = js.native
}
