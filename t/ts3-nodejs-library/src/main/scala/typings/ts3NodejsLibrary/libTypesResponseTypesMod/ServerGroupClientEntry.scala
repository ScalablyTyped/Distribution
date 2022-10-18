package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerGroupClientEntry
  extends StObject
     with ResponseEntry {
  
  var cldbid: String
  
  var clientNickname: String
  
  var clientUniqueIdentifier: String
}
object ServerGroupClientEntry {
  
  inline def apply(cldbid: String, clientNickname: String, clientUniqueIdentifier: String): ServerGroupClientEntry = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], clientNickname = clientNickname.asInstanceOf[js.Any], clientUniqueIdentifier = clientUniqueIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerGroupClientEntry]
  }
  
  extension [Self <: ServerGroupClientEntry](x: Self) {
    
    inline def setCldbid(value: String): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
    
    inline def setClientNickname(value: String): Self = StObject.set(x, "clientNickname", value.asInstanceOf[js.Any])
    
    inline def setClientUniqueIdentifier(value: String): Self = StObject.set(x, "clientUniqueIdentifier", value.asInstanceOf[js.Any])
  }
}
