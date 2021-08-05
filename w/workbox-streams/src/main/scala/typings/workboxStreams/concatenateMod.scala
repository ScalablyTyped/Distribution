package typings.workboxStreams

import typings.std.ReadableStream
import typings.workboxStreams.streamSourceMod.StreamSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatenateMod {
  
  @JSImport("workbox-streams/concatenate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concatenate(sourcePromises: js.Array[js.Promise[StreamSource]]): ConcatenateReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenate")(sourcePromises.asInstanceOf[js.Any]).asInstanceOf[ConcatenateReturn]
  
  trait ConcatenateReturn extends StObject {
    
    var done: js.Promise[Unit]
    
    var stream: ReadableStream[js.Any]
  }
  object ConcatenateReturn {
    
    inline def apply(done: js.Promise[Unit], stream: ReadableStream[js.Any]): ConcatenateReturn = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConcatenateReturn]
    }
    
    extension [Self <: ConcatenateReturn](x: Self) {
      
      inline def setDone(value: js.Promise[Unit]): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setStream(value: ReadableStream[js.Any]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
}
