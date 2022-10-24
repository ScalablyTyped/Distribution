package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsServer extends StObject {
  
  var isServer: Boolean
}
object IsServer {
  
  inline def apply(isServer: Boolean): IsServer = {
    val __obj = js.Dynamic.literal(isServer = isServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsServer]
  }
  
  extension [Self <: IsServer](x: Self) {
    
    inline def setIsServer(value: Boolean): Self = StObject.set(x, "isServer", value.asInstanceOf[js.Any])
  }
}
