package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.enumMod.ApiKeyScope
import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
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
  implicit class ApiKeyAddOps[Self <: ApiKeyAdd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApikey(value: String): Self = this.set("apikey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCldbid(value: String): Self = this.set("cldbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: ApiKeyScope): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSid(value: String): Self = this.set("sid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeLeft(value: Double): Self = this.set("timeLeft", value.asInstanceOf[js.Any])
  }
}
