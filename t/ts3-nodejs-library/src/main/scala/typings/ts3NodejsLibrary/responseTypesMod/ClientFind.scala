package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientFind
  extends StObject
     with ResponseEntry {
  
  var clid: String
  
  var clientNickname: String
}
object ClientFind {
  
  inline def apply(clid: String, clientNickname: String): ClientFind = {
    val __obj = js.Dynamic.literal(clid = clid.asInstanceOf[js.Any], clientNickname = clientNickname.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientFind]
  }
  
  extension [Self <: ClientFind](x: Self) {
    
    inline def setClid(value: String): Self = StObject.set(x, "clid", value.asInstanceOf[js.Any])
    
    inline def setClientNickname(value: String): Self = StObject.set(x, "clientNickname", value.asInstanceOf[js.Any])
  }
}
