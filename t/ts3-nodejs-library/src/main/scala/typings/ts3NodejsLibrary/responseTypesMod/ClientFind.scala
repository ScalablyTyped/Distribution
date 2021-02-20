package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientFind extends ResponseEntry {
  
  var clid: String = js.native
  
  var clientNickname: String = js.native
}
object ClientFind {
  
  @scala.inline
  def apply(clid: String, clientNickname: String): ClientFind = {
    val __obj = js.Dynamic.literal(clid = clid.asInstanceOf[js.Any], clientNickname = clientNickname.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientFind]
  }
  
  @scala.inline
  implicit class ClientFindMutableBuilder[Self <: ClientFind] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClid(value: String): Self = StObject.set(x, "clid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientNickname(value: String): Self = StObject.set(x, "clientNickname", value.asInstanceOf[js.Any])
  }
}
