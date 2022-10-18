package typings.undici.typesDispatcherMod

import typings.node.httpMod.IncomingHttpHeaders
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseData extends StObject {
  
  var body: typings.undici.typesReadableMod.^ & BodyMixin
  
  var context: js.Object
  
  var headers: IncomingHttpHeaders
  
  var opaque: Any
  
  var statusCode: Double
  
  var trailers: Record[String, String]
}
object ResponseData {
  
  inline def apply(
    body: typings.undici.typesReadableMod.^ & BodyMixin,
    context: js.Object,
    headers: IncomingHttpHeaders,
    opaque: Any,
    statusCode: Double,
    trailers: Record[String, String]
  ): ResponseData = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], opaque = opaque.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], trailers = trailers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseData]
  }
  
  extension [Self <: ResponseData](x: Self) {
    
    inline def setBody(value: typings.undici.typesReadableMod.^ & BodyMixin): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setOpaque(value: Any): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setTrailers(value: Record[String, String]): Self = StObject.set(x, "trailers", value.asInstanceOf[js.Any])
  }
}
