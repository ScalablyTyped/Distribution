package typings.workboxStreams

import typings.std.HeadersInit
import typings.std.Response
import typings.workboxStreams.streamSourceMod.StreamSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatenateToResponseMod {
  
  @JSImport("workbox-streams/concatenateToResponse", "concatenateToResponse")
  @js.native
  def concatenateToResponse(sourcePromises: js.Array[js.Promise[StreamSource]]): ConcatenateToResponseReturn = js.native
  @JSImport("workbox-streams/concatenateToResponse", "concatenateToResponse")
  @js.native
  def concatenateToResponse(sourcePromises: js.Array[js.Promise[StreamSource]], headersInit: HeadersInit): ConcatenateToResponseReturn = js.native
  
  @js.native
  trait ConcatenateToResponseReturn extends StObject {
    
    var done: js.Promise[Unit] = js.native
    
    var response: Response = js.native
  }
  object ConcatenateToResponseReturn {
    
    @scala.inline
    def apply(done: js.Promise[Unit], response: Response): ConcatenateToResponseReturn = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConcatenateToResponseReturn]
    }
    
    @scala.inline
    implicit class ConcatenateToResponseReturnMutableBuilder[Self <: ConcatenateToResponseReturn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDone(value: js.Promise[Unit]): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
