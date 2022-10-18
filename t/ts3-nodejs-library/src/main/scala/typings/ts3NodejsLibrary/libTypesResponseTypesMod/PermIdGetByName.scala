package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermIdGetByName
  extends StObject
     with ResponseEntry {
  
  var permid: Double
  
  var permsid: String
}
object PermIdGetByName {
  
  inline def apply(permid: Double, permsid: String): PermIdGetByName = {
    val __obj = js.Dynamic.literal(permid = permid.asInstanceOf[js.Any], permsid = permsid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermIdGetByName]
  }
  
  extension [Self <: PermIdGetByName](x: Self) {
    
    inline def setPermid(value: Double): Self = StObject.set(x, "permid", value.asInstanceOf[js.Any])
    
    inline def setPermsid(value: String): Self = StObject.set(x, "permsid", value.asInstanceOf[js.Any])
  }
}
