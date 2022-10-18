package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import typings.ts3NodejsLibrary.libTypesEnumMod.ApiKeyScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiKeyAdd
  extends StObject
     with ResponseEntry {
  
  var apikey: String
  
  var cldbid: String
  
  var id: String
  
  var scope: ApiKeyScope
  
  var sid: String
  
  var timeLeft: Double
}
object ApiKeyAdd {
  
  inline def apply(apikey: String, cldbid: String, id: String, scope: ApiKeyScope, sid: String, timeLeft: Double): ApiKeyAdd = {
    val __obj = js.Dynamic.literal(apikey = apikey.asInstanceOf[js.Any], cldbid = cldbid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], timeLeft = timeLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyAdd]
  }
  
  extension [Self <: ApiKeyAdd](x: Self) {
    
    inline def setApikey(value: String): Self = StObject.set(x, "apikey", value.asInstanceOf[js.Any])
    
    inline def setCldbid(value: String): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setScope(value: ApiKeyScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setTimeLeft(value: Double): Self = StObject.set(x, "timeLeft", value.asInstanceOf[js.Any])
  }
}
