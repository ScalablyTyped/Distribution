package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryLoginAdd extends ResponseEntry {
  
  var cldbid: String = js.native
  
  var clientLoginName: String = js.native
  
  var clientLoginPassword: String = js.native
  
  var sid: String = js.native
}
object QueryLoginAdd {
  
  @scala.inline
  def apply(cldbid: String, clientLoginName: String, clientLoginPassword: String, sid: String): QueryLoginAdd = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], clientLoginName = clientLoginName.asInstanceOf[js.Any], clientLoginPassword = clientLoginPassword.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryLoginAdd]
  }
  
  @scala.inline
  implicit class QueryLoginAddMutableBuilder[Self <: QueryLoginAdd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCldbid(value: String): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientLoginName(value: String): Self = StObject.set(x, "clientLoginName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientLoginPassword(value: String): Self = StObject.set(x, "clientLoginPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
  }
}
