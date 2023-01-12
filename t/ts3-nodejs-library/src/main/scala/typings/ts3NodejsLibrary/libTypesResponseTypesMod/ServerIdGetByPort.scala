package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerIdGetByPort] (val x: Self) extends AnyVal {
    
    inline def setServerId(value: String): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
  }
}
