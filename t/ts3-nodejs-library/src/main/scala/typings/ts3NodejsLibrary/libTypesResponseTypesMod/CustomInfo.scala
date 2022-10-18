package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomInfo
  extends StObject
     with ResponseEntry {
  
  var cldbid: String
  
  var ident: String
  
  var value: String
}
object CustomInfo {
  
  inline def apply(cldbid: String, ident: String, value: String): CustomInfo = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], ident = ident.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomInfo]
  }
  
  extension [Self <: CustomInfo](x: Self) {
    
    inline def setCldbid(value: String): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
    
    inline def setIdent(value: String): Self = StObject.set(x, "ident", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
