package typings.thrift.mod

import org.scalablytyped.runtime.StringDictionary
import typings.thrift.anon.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebServerOptions[TProcessor, THandler] extends StObject {
  
  var services: StringDictionary[Handler[TProcessor, THandler]]
}
object WebServerOptions {
  
  inline def apply[TProcessor, THandler](services: StringDictionary[Handler[TProcessor, THandler]]): WebServerOptions[TProcessor, THandler] = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebServerOptions[TProcessor, THandler]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebServerOptions[?, ?], TProcessor, THandler] (val x: Self & (WebServerOptions[TProcessor, THandler])) extends AnyVal {
    
    inline def setServices(value: StringDictionary[Handler[TProcessor, THandler]]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
  }
}
