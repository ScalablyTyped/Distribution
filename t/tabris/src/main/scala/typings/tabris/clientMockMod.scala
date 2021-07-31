package typings.tabris

import org.scalablytyped.runtime.StringDictionary
import typings.tabris.anon.PartialClientCallCall
import typings.tabris.anon.PartialClientCreateCall
import typings.tabris.anon.PartialClientDestroyCall
import typings.tabris.anon.PartialClientGetCall
import typings.tabris.anon.PartialClientListenCall
import typings.tabris.anon.PartialClientSetCall
import typings.tabris.tabrisStrings.call
import typings.tabris.tabrisStrings.create
import typings.tabris.tabrisStrings.destroy
import typings.tabris.tabrisStrings.get
import typings.tabris.tabrisStrings.listen
import typings.tabris.tabrisStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMockMod {
  
  @JSImport("tabris/ClientMock", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with ClientMock {
    def this(defaults: StringDictionary[StringDictionary[js.Any]]) = this()
  }
  
  trait ClientCall extends StObject {
    
    var event: String
    
    var id: String
    
    var listen: Boolean
    
    var method: String
    
    var op: create | set | get | listen | call | destroy
    
    var parameters: StringDictionary[js.Any]
    
    var properties: StringDictionary[js.Any]
    
    var property: String
    
    var `type`: String
  }
  object ClientCall {
    
    @scala.inline
    def apply(
      event: String,
      id: String,
      listen: Boolean,
      method: String,
      op: create | set | get | listen | call | destroy,
      parameters: StringDictionary[js.Any],
      properties: StringDictionary[js.Any],
      property: String,
      `type`: String
    ): ClientCall = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], listen = listen.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientCall]
    }
    
    @scala.inline
    implicit class ClientCallMutableBuilder[Self <: ClientCall] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListen(value: Boolean): Self = StObject.set(x, "listen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOp(value: create | set | get | listen | call | destroy): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameters(value: StringDictionary[js.Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: StringDictionary[js.Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientCallCall extends StObject {
    
    var id: String
    
    var method: String
    
    var op: call
    
    var parameters: StringDictionary[js.Any]
  }
  object ClientCallCall {
    
    @scala.inline
    def apply(id: String, method: String, parameters: StringDictionary[js.Any]): ClientCallCall = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], op = "call", parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientCallCall]
    }
    
    @scala.inline
    implicit class ClientCallCallMutableBuilder[Self <: ClientCallCall] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOp(value: call): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameters(value: StringDictionary[js.Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientCreateCall extends StObject {
    
    var id: String
    
    var op: create
    
    var properties: StringDictionary[js.Any]
    
    var `type`: String
  }
  object ClientCreateCall {
    
    @scala.inline
    def apply(id: String, properties: StringDictionary[js.Any], `type`: String): ClientCreateCall = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], op = "create", properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientCreateCall]
    }
    
    @scala.inline
    implicit class ClientCreateCallMutableBuilder[Self <: ClientCreateCall] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOp(value: create): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: StringDictionary[js.Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientDestroyCall extends StObject {
    
    var id: String
    
    var op: destroy
  }
  object ClientDestroyCall {
    
    @scala.inline
    def apply(id: String): ClientDestroyCall = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], op = "destroy")
      __obj.asInstanceOf[ClientDestroyCall]
    }
    
    @scala.inline
    implicit class ClientDestroyCallMutableBuilder[Self <: ClientDestroyCall] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOp(value: destroy): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientGetCall extends StObject {
    
    var id: String
    
    var op: get
    
    var property: String
  }
  object ClientGetCall {
    
    @scala.inline
    def apply(id: String, property: String): ClientGetCall = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], op = "get", property = property.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientGetCall]
    }
    
    @scala.inline
    implicit class ClientGetCallMutableBuilder[Self <: ClientGetCall] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOp(value: get): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientListenCall extends StObject {
    
    var event: String
    
    var id: String
    
    var listen: Boolean
    
    var op: listen
  }
  object ClientListenCall {
    
    @scala.inline
    def apply(event: String, id: String, listen: Boolean): ClientListenCall = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], listen = listen.asInstanceOf[js.Any], op = "listen")
      __obj.asInstanceOf[ClientListenCall]
    }
    
    @scala.inline
    implicit class ClientListenCallMutableBuilder[Self <: ClientListenCall] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListen(value: Boolean): Self = StObject.set(x, "listen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOp(value: listen): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ClientMock extends StObject {
    
    def calls(): js.Array[ClientCall] = js.native
    def calls(filter: PartialClientCallCall): js.Array[ClientCallCall] = js.native
    def calls(filter: PartialClientCreateCall): js.Array[ClientCreateCall] = js.native
    def calls(filter: PartialClientDestroyCall): js.Array[ClientDestroyCall] = js.native
    def calls(filter: PartialClientGetCall): js.Array[ClientGetCall] = js.native
    def calls(filter: PartialClientListenCall): js.Array[ClientListenCall] = js.native
    def calls(filter: PartialClientSetCall): js.Array[ClientSetCall] = js.native
    
    def properties(cid: String): StringDictionary[js.Any] = js.native
    
    def resetCalls(): Unit = js.native
  }
  
  trait ClientSetCall extends StObject {
    
    var id: String
    
    var op: set
    
    var properties: StringDictionary[js.Any]
  }
  object ClientSetCall {
    
    @scala.inline
    def apply(id: String, properties: StringDictionary[js.Any]): ClientSetCall = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], op = "set", properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientSetCall]
    }
    
    @scala.inline
    implicit class ClientSetCallMutableBuilder[Self <: ClientSetCall] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOp(value: set): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: StringDictionary[js.Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
}
