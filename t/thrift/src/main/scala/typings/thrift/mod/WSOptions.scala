package typings.thrift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WSOptions extends StObject {
  
  var headers: HttpHeaders
  
  var host: String
  
  var path: String
  
  var port: Double
}
object WSOptions {
  
  @scala.inline
  def apply(headers: HttpHeaders, host: String, path: String, port: Double): WSOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[WSOptions]
  }
  
  @scala.inline
  implicit class WSOptionsMutableBuilder[Self <: WSOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: HttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
