package typings.webpackDevServer

import org.scalablytyped.runtime.StringDictionary
import typings.webpackDevServer.webpackDevServerStrings.ws
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Client extends StObject {
    
    var client: js.Object
    
    var server: ws
  }
  object Client {
    
    inline def apply(client: js.Object): Client = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], server = "ws")
      __obj.asInstanceOf[Client]
    }
    
    extension [Self <: Client](x: Self) {
      
      inline def setClient(value: js.Object): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setServer(value: ws): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientServer extends StObject {
    
    var client: js.Object
    
    var server: js.Object
  }
  object ClientServer {
    
    inline def apply(client: js.Object, server: js.Object): ClientServer = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientServer]
    }
    
    extension [Self <: ClientServer](x: Self) {
      
      inline def setClient(value: js.Object): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setServer(value: js.Object): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[js.Array[String]] {
    
    var force: Boolean
  }
  object Dictkey {
    
    inline def apply(force: Boolean): Dictkey = {
      val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    }
  }
  
  trait Errors extends StObject {
    
    var errors: js.UndefOr[Boolean] = js.undefined
    
    var warnings: js.UndefOr[Boolean] = js.undefined
  }
  object Errors {
    
    inline def apply(): Errors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Errors]
    }
    
    extension [Self <: Errors](x: Self) {
      
      inline def setErrors(value: Boolean): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setWarnings(value: Boolean): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    }
  }
  
  trait Port extends StObject {
    
    var port: js.UndefOr[Double] = js.undefined
  }
  object Port {
    
    inline def apply(): Port = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Port]
    }
    
    extension [Self <: Port](x: Self) {
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  trait Server extends StObject {
    
    var client: ws
    
    var server: js.Object
  }
  object Server {
    
    inline def apply(server: js.Object): Server = {
      val __obj = js.Dynamic.literal(client = "ws", server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[Server]
    }
    
    extension [Self <: Server](x: Self) {
      
      inline def setClient(value: ws): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setServer(value: js.Object): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeMap extends StObject {
    
    var typeMap: js.UndefOr[Dictkey] = js.undefined
  }
  object TypeMap {
    
    inline def apply(): TypeMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeMap]
    }
    
    extension [Self <: TypeMap](x: Self) {
      
      inline def setTypeMap(value: Dictkey): Self = StObject.set(x, "typeMap", value.asInstanceOf[js.Any])
      
      inline def setTypeMapUndefined: Self = StObject.set(x, "typeMap", js.undefined)
    }
  }
}
