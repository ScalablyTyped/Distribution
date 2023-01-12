package typings.szmarczakHttpTimer

import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.szmarczakHttpTimer.anon.Dns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@szmarczak/http-timer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(request: ClientRequestWithTimings): Timings = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(request.asInstanceOf[js.Any]).asInstanceOf[Timings]
  
  @js.native
  trait ClientRequestWithTimings extends ClientRequest {
    
    var timings: js.UndefOr[Timings] = js.native
  }
  
  @js.native
  trait IncomingMessageWithTimings extends IncomingMessage {
    
    var timings: js.UndefOr[Timings] = js.native
  }
  
  trait Timings extends StObject {
    
    var abort: js.UndefOr[Double] = js.undefined
    
    var connect: js.UndefOr[Double] = js.undefined
    
    var end: js.UndefOr[Double] = js.undefined
    
    var error: js.UndefOr[Double] = js.undefined
    
    var lookup: js.UndefOr[Double] = js.undefined
    
    var phases: Dns
    
    var response: js.UndefOr[Double] = js.undefined
    
    var secureConnect: js.UndefOr[Double] = js.undefined
    
    var socket: js.UndefOr[Double] = js.undefined
    
    var start: Double
    
    var upload: js.UndefOr[Double] = js.undefined
  }
  object Timings {
    
    inline def apply(phases: Dns, start: Double): Timings = {
      val __obj = js.Dynamic.literal(phases = phases.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Timings] (val x: Self) extends AnyVal {
      
      inline def setAbort(value: Double): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
      
      inline def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
      
      inline def setConnect(value: Double): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
      
      inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setLookup(value: Double): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
      
      inline def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
      
      inline def setPhases(value: Dns): Self = StObject.set(x, "phases", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Double): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      inline def setSecureConnect(value: Double): Self = StObject.set(x, "secureConnect", value.asInstanceOf[js.Any])
      
      inline def setSecureConnectUndefined: Self = StObject.set(x, "secureConnect", js.undefined)
      
      inline def setSocket(value: Double): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setUpload(value: Double): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
      
      inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
    }
  }
}
