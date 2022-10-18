package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientGetIdEntry
  extends StObject
     with ResponseEntry {
  
  var clid: String
  
  var cluid: String
  
  var name: String
}
object ClientGetIdEntry {
  
  inline def apply(clid: String, cluid: String, name: String): ClientGetIdEntry = {
    val __obj = js.Dynamic.literal(clid = clid.asInstanceOf[js.Any], cluid = cluid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientGetIdEntry]
  }
  
  extension [Self <: ClientGetIdEntry](x: Self) {
    
    inline def setClid(value: String): Self = StObject.set(x, "clid", value.asInstanceOf[js.Any])
    
    inline def setCluid(value: String): Self = StObject.set(x, "cluid", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
