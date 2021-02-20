package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerIdGetByPort extends ResponseEntry {
  
  var serverId: String = js.native
}
object ServerIdGetByPort {
  
  @scala.inline
  def apply(serverId: String): ServerIdGetByPort = {
    val __obj = js.Dynamic.literal(serverId = serverId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerIdGetByPort]
  }
  
  @scala.inline
  implicit class ServerIdGetByPortMutableBuilder[Self <: ServerIdGetByPort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServerId(value: String): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
  }
}
