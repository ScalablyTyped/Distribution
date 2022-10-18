package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientGetNameFromUid
  extends StObject
     with ResponseEntry {
  
  var cldbid: String
  
  var cluid: String
  
  var name: String
}
object ClientGetNameFromUid {
  
  inline def apply(cldbid: String, cluid: String, name: String): ClientGetNameFromUid = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], cluid = cluid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientGetNameFromUid]
  }
  
  extension [Self <: ClientGetNameFromUid](x: Self) {
    
    inline def setCldbid(value: String): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
    
    inline def setCluid(value: String): Self = StObject.set(x, "cluid", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
