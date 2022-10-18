package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryLoginAdd
  extends StObject
     with ResponseEntry {
  
  var cldbid: String
  
  var clientLoginName: String
  
  var clientLoginPassword: String
  
  var sid: String
}
object QueryLoginAdd {
  
  inline def apply(cldbid: String, clientLoginName: String, clientLoginPassword: String, sid: String): QueryLoginAdd = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], clientLoginName = clientLoginName.asInstanceOf[js.Any], clientLoginPassword = clientLoginPassword.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryLoginAdd]
  }
  
  extension [Self <: QueryLoginAdd](x: Self) {
    
    inline def setCldbid(value: String): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
    
    inline def setClientLoginName(value: String): Self = StObject.set(x, "clientLoginName", value.asInstanceOf[js.Any])
    
    inline def setClientLoginPassword(value: String): Self = StObject.set(x, "clientLoginPassword", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
  }
}
