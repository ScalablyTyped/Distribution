package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.enumMod.ApiKeyScope
import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiKeyAdd extends ResponseEntry {
  
  var apikey: String = js.native
  
  var cldbid: String = js.native
  
  var id: String = js.native
  
  var scope: ApiKeyScope = js.native
  
  var sid: String = js.native
  
  var timeLeft: Double = js.native
}
object ApiKeyAdd {
  
  @scala.inline
  def apply(apikey: String, cldbid: String, id: String, scope: ApiKeyScope, sid: String, timeLeft: Double): ApiKeyAdd = {
    val __obj = js.Dynamic.literal(apikey = apikey.asInstanceOf[js.Any], cldbid = cldbid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], timeLeft = timeLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyAdd]
  }
  
  @scala.inline
  implicit class ApiKeyAddMutableBuilder[Self <: ApiKeyAdd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApikey(value: String): Self = StObject.set(x, "apikey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCldbid(value: String): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: ApiKeyScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeLeft(value: Double): Self = StObject.set(x, "timeLeft", value.asInstanceOf[js.Any])
  }
}
