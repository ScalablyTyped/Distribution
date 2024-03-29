package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PermissionEntry] (val x: Self) extends AnyVal {
    
    inline def setPermdesc(value: String): Self = StObject.set(x, "permdesc", value.asInstanceOf[js.Any])
    
    inline def setPermid(value: Double): Self = StObject.set(x, "permid", value.asInstanceOf[js.Any])
    
    inline def setPermname(value: String): Self = StObject.set(x, "permname", value.asInstanceOf[js.Any])
  }
}
