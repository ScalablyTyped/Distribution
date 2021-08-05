package typings.thrift.mod

import typings.thrift.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceOptions[TProcessor, THandler] extends StObject {
  
  var handler: js.UndefOr[THandler] = js.undefined
  
  var processor: js.UndefOr[Instantiable[THandler, TProcessor]] = js.undefined
  
  var protocol: js.UndefOr[TProtocolConstructor] = js.undefined
  
  var transport: js.UndefOr[TTransportConstructor] = js.undefined
}
object ServiceOptions {
  
  inline def apply[TProcessor, THandler](): ServiceOptions[TProcessor, THandler] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceOptions[TProcessor, THandler]]
  }
  
  extension [Self <: ServiceOptions[?, ?], TProcessor, THandler](x: Self & (ServiceOptions[TProcessor, THandler])) {
    
    inline def setHandler(value: THandler): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    inline def setProcessor(value: Instantiable[THandler, TProcessor]): Self = StObject.set(x, "processor", value.asInstanceOf[js.Any])
    
    inline def setProcessorUndefined: Self = StObject.set(x, "processor", js.undefined)
    
    inline def setProtocol(value: TProtocolConstructor): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setTransport(value: TTransportConstructor): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
  }
}
