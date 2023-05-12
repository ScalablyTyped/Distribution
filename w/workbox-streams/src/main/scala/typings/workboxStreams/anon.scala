package typings.workboxStreams

import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Done extends StObject {
    
    var done: js.Promise[Unit]
    
    var stream: ReadableStream[Any]
  }
  object Done {
    
    inline def apply(done: js.Promise[Unit], stream: ReadableStream[Any]): Done = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Done] (val x: Self) extends AnyVal {
      
      inline def setDone(value: js.Promise[Unit]): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setStream(value: ReadableStream[Any]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  trait Response extends StObject {
    
    var done: js.Promise[Unit]
    
    var response: typings.std.Response
  }
  object Response {
    
    inline def apply(done: js.Promise[Unit], response: typings.std.Response): Response = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      inline def setDone(value: js.Promise[Unit]): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: typings.std.Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
