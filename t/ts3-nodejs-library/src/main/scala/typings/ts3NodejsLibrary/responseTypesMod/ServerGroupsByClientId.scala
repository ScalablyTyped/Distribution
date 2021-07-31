package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
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
  
  @scala.inline
  def apply(cldbid: String, name: String, sgid: String): ServerGroupsByClientId = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sgid = sgid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerGroupsByClientId]
  }
  
  @scala.inline
  implicit class ServerGroupsByClientIdMutableBuilder[Self <: ServerGroupsByClientId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCldbid(value: String): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSgid(value: String): Self = StObject.set(x, "sgid", value.asInstanceOf[js.Any])
  }
}
