package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermEntry
  extends StObject
     with ResponseEntry {
  
  var permid: js.UndefOr[Double] = js.undefined
  
  var permnegated: Boolean
  
  var permsid: js.UndefOr[String] = js.undefined
  
  var permskip: Boolean
  
  var permvalue: Double
}
object PermEntry {
  
  inline def apply(permnegated: Boolean, permskip: Boolean, permvalue: Double): PermEntry = {
    val __obj = js.Dynamic.literal(permnegated = permnegated.asInstanceOf[js.Any], permskip = permskip.asInstanceOf[js.Any], permvalue = permvalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermEntry]
  }
  
  extension [Self <: PermEntry](x: Self) {
    
    inline def setPermid(value: Double): Self = StObject.set(x, "permid", value.asInstanceOf[js.Any])
    
    inline def setPermidUndefined: Self = StObject.set(x, "permid", js.undefined)
    
    inline def setPermnegated(value: Boolean): Self = StObject.set(x, "permnegated", value.asInstanceOf[js.Any])
    
    inline def setPermsid(value: String): Self = StObject.set(x, "permsid", value.asInstanceOf[js.Any])
    
    inline def setPermsidUndefined: Self = StObject.set(x, "permsid", js.undefined)
    
    inline def setPermskip(value: Boolean): Self = StObject.set(x, "permskip", value.asInstanceOf[js.Any])
    
    inline def setPermvalue(value: Double): Self = StObject.set(x, "permvalue", value.asInstanceOf[js.Any])
  }
}
