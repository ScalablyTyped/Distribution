package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermGet
  extends StObject
     with ResponseEntry {
  
  var permid: Double
  
  var permsid: String
  
  var permvalue: Double
}
object PermGet {
  
  inline def apply(permid: Double, permsid: String, permvalue: Double): PermGet = {
    val __obj = js.Dynamic.literal(permid = permid.asInstanceOf[js.Any], permsid = permsid.asInstanceOf[js.Any], permvalue = permvalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermGet]
  }
  
  extension [Self <: PermGet](x: Self) {
    
    inline def setPermid(value: Double): Self = StObject.set(x, "permid", value.asInstanceOf[js.Any])
    
    inline def setPermsid(value: String): Self = StObject.set(x, "permsid", value.asInstanceOf[js.Any])
    
    inline def setPermvalue(value: Double): Self = StObject.set(x, "permvalue", value.asInstanceOf[js.Any])
  }
}
