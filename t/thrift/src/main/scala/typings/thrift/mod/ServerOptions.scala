package typings.thrift.mod

import typings.node.tlsMod.TlsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerOptions[TProcessor, THandler]
  extends StObject
     with ServiceOptions[TProcessor, THandler] {
  
  var cors: js.UndefOr[js.Array[String]] = js.undefined
  
  var files: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[HttpHeaders] = js.undefined
  
  var services: js.UndefOr[ServiceMap[TProcessor, THandler]] = js.undefined
  
  var tls: js.UndefOr[TlsOptions] = js.undefined
}
object ServerOptions {
  
  inline def apply[TProcessor, THandler](): ServerOptions[TProcessor, THandler] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions[TProcessor, THandler]]
  }
  
  extension [Self <: ServerOptions[?, ?], TProcessor, THandler](x: Self & (ServerOptions[TProcessor, THandler])) {
    
    inline def setCors(value: js.Array[String]): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
    
    inline def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
    
    inline def setCorsVarargs(value: String*): Self = StObject.set(x, "cors", js.Array(value*))
    
    inline def setFiles(value: String): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setHeaders(value: HttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setServices(value: ServiceMap[TProcessor, THandler]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setTls(value: TlsOptions): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
  }
}
