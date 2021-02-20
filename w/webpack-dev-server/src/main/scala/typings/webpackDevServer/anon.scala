package typings.webpackDevServer

import org.scalablytyped.runtime.StringDictionary
import typings.webpackDevServer.webpackDevServerStrings.ws
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Client extends StObject {
    
    var client: js.Object = js.native
    
    var server: ws = js.native
  }
  object Client {
    
    @scala.inline
    def apply(client: js.Object, server: ws): Client = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[Client]
    }
    
    @scala.inline
    implicit class ClientMutableBuilder[Self <: Client] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: js.Object): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServer(value: ws): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ClientServer extends StObject {
    
    var client: js.Object = js.native
    
    var server: js.Object = js.native
  }
  object ClientServer {
    
    @scala.inline
    def apply(client: js.Object, server: js.Object): ClientServer = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientServer]
    }
    
    @scala.inline
    implicit class ClientServerMutableBuilder[Self <: ClientServer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: js.Object): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServer(value: js.Object): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Dictkey
    extends /* key */ StringDictionary[js.Array[String]] {
    
    var force: Boolean = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(force: Boolean): Dictkey = {
      val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Errors extends StObject {
    
    var errors: js.UndefOr[Boolean] = js.native
    
    var warnings: js.UndefOr[Boolean] = js.native
  }
  object Errors {
    
    @scala.inline
    def apply(): Errors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Errors]
    }
    
    @scala.inline
    implicit class ErrorsMutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: Boolean): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      @scala.inline
      def setWarnings(value: Boolean): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    }
  }
  
  @js.native
  trait Port extends StObject {
    
    var port: js.UndefOr[Double] = js.native
  }
  object Port {
    
    @scala.inline
    def apply(): Port = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Port]
    }
    
    @scala.inline
    implicit class PortMutableBuilder[Self <: Port] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  @js.native
  trait Server extends StObject {
    
    var client: ws = js.native
    
    var server: js.Object = js.native
  }
  object Server {
    
    @scala.inline
    def apply(client: ws, server: js.Object): Server = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[Server]
    }
    
    @scala.inline
    implicit class ServerMutableBuilder[Self <: Server] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: ws): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServer(value: js.Object): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeMap extends StObject {
    
    var typeMap: js.UndefOr[Dictkey] = js.native
  }
  object TypeMap {
    
    @scala.inline
    def apply(): TypeMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeMap]
    }
    
    @scala.inline
    implicit class TypeMapMutableBuilder[Self <: TypeMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTypeMap(value: Dictkey): Self = StObject.set(x, "typeMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeMapUndefined: Self = StObject.set(x, "typeMap", js.undefined)
    }
  }
}
