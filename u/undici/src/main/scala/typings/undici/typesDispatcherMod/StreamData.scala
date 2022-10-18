package typings.undici.typesDispatcherMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamData extends StObject {
  
  var opaque: Any
  
  var trailers: Record[String, String]
}
object StreamData {
  
  inline def apply(opaque: Any, trailers: Record[String, String]): StreamData = {
    val __obj = js.Dynamic.literal(opaque = opaque.asInstanceOf[js.Any], trailers = trailers.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamData]
  }
  
  extension [Self <: StreamData](x: Self) {
    
    inline def setOpaque(value: Any): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
    
    inline def setTrailers(value: Record[String, String]): Self = StObject.set(x, "trailers", value.asInstanceOf[js.Any])
  }
}
