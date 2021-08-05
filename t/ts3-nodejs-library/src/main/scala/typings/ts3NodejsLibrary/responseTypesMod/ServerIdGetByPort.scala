package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerIdGetByPort
  extends StObject
     with ResponseEntry {
  
  var serverId: String
}
object ServerIdGetByPort {
  
  inline def apply(serverId: String): ServerIdGetByPort = {
    val __obj = js.Dynamic.literal(serverId = serverId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerIdGetByPort]
  }
  
  extension [Self <: ServerIdGetByPort](x: Self) {
    
    inline def setServerId(value: String): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
  }
}
