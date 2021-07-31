package typings.webgme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientOptions extends StObject {
  
  /**
    * Options passed to the socketIO client when connecting to the sever.
    *   config.socketIO.clientOptions = see config
    */
  var clientOptions: js.Any
  
  /**
    * Options passed to the socketIO server when attaching to the server.
    *   config.socketIO.serverOptions = see config
    */
  var serverOptions: js.Any
}
object ClientOptions {
  
  @scala.inline
  def apply(clientOptions: js.Any, serverOptions: js.Any): ClientOptions = {
    val __obj = js.Dynamic.literal(clientOptions = clientOptions.asInstanceOf[js.Any], serverOptions = serverOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientOptions(value: js.Any): Self = StObject.set(x, "clientOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerOptions(value: js.Any): Self = StObject.set(x, "serverOptions", value.asInstanceOf[js.Any])
  }
}
