package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerGroupClientEntry
  extends StObject
     with ResponseEntry {
  
  var cldbid: String
  
  var clientNickname: String
  
  var clientUniqueIdentifier: String
}
object ServerGroupClientEntry {
  
  @scala.inline
  def apply(cldbid: String, clientNickname: String, clientUniqueIdentifier: String): ServerGroupClientEntry = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], clientNickname = clientNickname.asInstanceOf[js.Any], clientUniqueIdentifier = clientUniqueIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerGroupClientEntry]
  }
  
  @scala.inline
  implicit class ServerGroupClientEntryMutableBuilder[Self <: ServerGroupClientEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCldbid(value: String): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientNickname(value: String): Self = StObject.set(x, "clientNickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUniqueIdentifier(value: String): Self = StObject.set(x, "clientUniqueIdentifier", value.asInstanceOf[js.Any])
  }
}
