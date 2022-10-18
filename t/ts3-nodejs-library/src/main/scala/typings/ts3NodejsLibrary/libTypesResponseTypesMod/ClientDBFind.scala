package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientDBFind
  extends StObject
     with ResponseEntry {
  
  var cldbid: String
}
object ClientDBFind {
  
  inline def apply(cldbid: String): ClientDBFind = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientDBFind]
  }
  
  extension [Self <: ClientDBFind](x: Self) {
    
    inline def setCldbid(value: String): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
  }
}
