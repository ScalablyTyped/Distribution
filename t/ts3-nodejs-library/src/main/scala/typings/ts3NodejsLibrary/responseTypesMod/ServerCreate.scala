package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.serverMod.TeamSpeakServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerCreate extends StObject {
  
  var server: TeamSpeakServer
  
  var token: String
}
object ServerCreate {
  
  inline def apply(server: TeamSpeakServer, token: String): ServerCreate = {
    val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerCreate]
  }
  
  extension [Self <: ServerCreate](x: Self) {
    
    inline def setServer(value: TeamSpeakServer): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
