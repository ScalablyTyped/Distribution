package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionEntry
  extends StObject
     with ResponseEntry {
  
  var permdesc: String
  
  var permid: Double
  
  var permname: String
}
object PermissionEntry {
  
  inline def apply(permdesc: String, permid: Double, permname: String): PermissionEntry = {
    val __obj = js.Dynamic.literal(permdesc = permdesc.asInstanceOf[js.Any], permid = permid.asInstanceOf[js.Any], permname = permname.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionEntry]
  }
  
  extension [Self <: PermissionEntry](x: Self) {
    
    inline def setPermdesc(value: String): Self = StObject.set(x, "permdesc", value.asInstanceOf[js.Any])
    
    inline def setPermid(value: Double): Self = StObject.set(x, "permid", value.asInstanceOf[js.Any])
    
    inline def setPermname(value: String): Self = StObject.set(x, "permname", value.asInstanceOf[js.Any])
  }
}
