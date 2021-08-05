package typings.thrift

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.thrift.mod.TClientConstructor
import typings.thrift.mod.TProcessorConstructor
import typings.thrift.mod.TProtocol
import typings.thrift.mod.TTransport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Client[TClient]
    extends StObject
       with TClientConstructor[TClient] {
    
    var Client: InstantiableTClient[TClient]
  }
  object Client {
    
    inline def apply[TClient](Client: InstantiableTClient[TClient]): Client[TClient] = {
      val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any])
      __obj.asInstanceOf[Client[TClient]]
    }
    
    extension [Self <: Client[?], TClient](x: Self & Client[TClient]) {
      
      inline def setClient(value: InstantiableTClient[TClient]): Self = StObject.set(x, "Client", value.asInstanceOf[js.Any])
    }
  }
  
  trait Handler[TProcessor, THandler] extends StObject {
    
    var handler: THandler
    
    var processor: TProcessorConstructor[TProcessor, THandler]
  }
  object Handler {
    
    inline def apply[TProcessor, THandler](handler: THandler, processor: TProcessorConstructor[TProcessor, THandler]): Handler[TProcessor, THandler] = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], processor = processor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Handler[TProcessor, THandler]]
    }
    
    extension [Self <: Handler[?, ?], TProcessor, THandler](x: Self & (Handler[TProcessor, THandler])) {
      
      inline def setHandler(value: THandler): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setProcessor(value: TProcessorConstructor[TProcessor, THandler]): Self = StObject.set(x, "processor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable[THandler, TProcessor]
    extends StObject
       with Instantiable1[/* handler */ THandler, TProcessor]
       with TProcessorConstructor[TProcessor, THandler]
  
  @js.native
  trait InstantiableTClient[TClient]
    extends StObject
       with Instantiable2[/* output */ TTransport, /* pClass */ InstantiableTProtocol, TClient]
       with TClientConstructor[TClient]
  
  @js.native
  trait InstantiableTProtocol
    extends StObject
       with Instantiable1[/* trans */ TTransport, TProtocol]
  
  trait Processor[THandler, TProcessor]
    extends StObject
       with TProcessorConstructor[TProcessor, THandler] {
    
    var Processor: Instantiable[THandler, TProcessor]
  }
  object Processor {
    
    inline def apply[THandler, TProcessor](Processor: Instantiable[THandler, TProcessor]): Processor[THandler, TProcessor] = {
      val __obj = js.Dynamic.literal(Processor = Processor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Processor[THandler, TProcessor]]
    }
    
    extension [Self <: Processor[?, ?], THandler, TProcessor](x: Self & (Processor[THandler, TProcessor])) {
      
      inline def setProcessor(value: Instantiable[THandler, TProcessor]): Self = StObject.set(x, "Processor", value.asInstanceOf[js.Any])
    }
  }
}
