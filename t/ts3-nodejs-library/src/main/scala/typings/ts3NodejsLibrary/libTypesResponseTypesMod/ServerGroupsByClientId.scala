package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerGroupsByClientId
  extends StObject
     with ResponseEntry {
  
  var cldbid: String
  
  var name: String
  
  var sgid: String
}
object ServerGroupsByClientId {
  
  inline def apply(cldbid: String, name: String, sgid: String): ServerGroupsByClientId = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sgid = sgid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerGroupsByClientId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerGroupsByClientId] (val x: Self) extends AnyVal {
    
    inline def setCldbid(value: String): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSgid(value: String): Self = StObject.set(x, "sgid", value.asInstanceOf[js.Any])
  }
}
