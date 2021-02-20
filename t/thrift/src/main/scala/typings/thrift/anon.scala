package typings.thrift

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.thrift.mod.TClientConstructor
import typings.thrift.mod.TProcessorConstructor
import typings.thrift.mod.TProtocol
import typings.thrift.mod.TTransport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Client[TClient] extends TClientConstructor[TClient] {
    
    var Client: InstantiableTClient[TClient] = js.native
  }
  object Client {
    
    @scala.inline
    def apply[TClient](Client: InstantiableTClient[TClient]): Client[TClient] = {
      val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any])
      __obj.asInstanceOf[Client[TClient]]
    }
    
    @scala.inline
    implicit class ClientMutableBuilder[Self <: Client[_], TClient] (val x: Self with Client[TClient]) extends AnyVal {
      
      @scala.inline
      def setClient(value: InstantiableTClient[TClient]): Self = StObject.set(x, "Client", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Handler[TProcessor, THandler] extends StObject {
    
    var handler: THandler = js.native
    
    var processor: TProcessorConstructor[TProcessor, THandler] = js.native
  }
  object Handler {
    
    @scala.inline
    def apply[TProcessor, THandler](handler: THandler, processor: TProcessorConstructor[TProcessor, THandler]): Handler[TProcessor, THandler] = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], processor = processor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Handler[TProcessor, THandler]]
    }
    
    @scala.inline
    implicit class HandlerMutableBuilder[Self <: Handler[_, _], TProcessor, THandler] (val x: Self with (Handler[TProcessor, THandler])) extends AnyVal {
      
      @scala.inline
      def setHandler(value: THandler): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessor(value: TProcessorConstructor[TProcessor, THandler]): Self = StObject.set(x, "processor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable[THandler, TProcessor]
    extends TProcessorConstructor[TProcessor, THandler]
       with Instantiable1[/* handler */ THandler, TProcessor]
  
  @js.native
  trait InstantiableTClient[TClient]
    extends TClientConstructor[TClient]
       with Instantiable2[/* output */ TTransport, /* pClass */ InstantiableTProtocol, TClient]
  
  @js.native
  trait InstantiableTProtocol extends Instantiable1[/* trans */ TTransport, TProtocol]
  
  @js.native
  trait Processor[THandler, TProcessor] extends TProcessorConstructor[TProcessor, THandler] {
    
    var Processor: Instantiable[THandler, TProcessor] = js.native
  }
  object Processor {
    
    @scala.inline
    def apply[THandler, TProcessor](Processor: Instantiable[THandler, TProcessor]): Processor[THandler, TProcessor] = {
      val __obj = js.Dynamic.literal(Processor = Processor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Processor[THandler, TProcessor]]
    }
    
    @scala.inline
    implicit class ProcessorMutableBuilder[Self <: Processor[_, _], THandler, TProcessor] (val x: Self with (Processor[THandler, TProcessor])) extends AnyVal {
      
      @scala.inline
      def setProcessor(value: Instantiable[THandler, TProcessor]): Self = StObject.set(x, "Processor", value.asInstanceOf[js.Any])
    }
  }
}
