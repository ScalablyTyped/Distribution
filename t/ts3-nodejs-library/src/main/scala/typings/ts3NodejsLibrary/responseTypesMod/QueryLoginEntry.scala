package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryLoginEntry
  extends StObject
     with ResponseEntry {
  
  var cldbid: String
  
  var clientLoginName: String
  
  var sid: String
}
object QueryLoginEntry {
  
  inline def apply(cldbid: String, clientLoginName: String, sid: String): QueryLoginEntry = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], clientLoginName = clientLoginName.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryLoginEntry]
  }
  
  extension [Self <: QueryLoginEntry](x: Self) {
    
    inline def setCldbid(value: String): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
    
    inline def setClientLoginName(value: String): Self = StObject.set(x, "clientLoginName", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
  }
}
