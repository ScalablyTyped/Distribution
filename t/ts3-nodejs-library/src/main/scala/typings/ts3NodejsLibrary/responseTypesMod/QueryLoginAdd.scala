package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
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
  implicit class QueryLoginAddOps[Self <: QueryLoginAdd] (val x: Self) extends AnyVal {
    
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
    def setCldbid(value: String): Self = this.set("cldbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientLoginName(value: String): Self = this.set("clientLoginName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientLoginPassword(value: String): Self = this.set("clientLoginPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSid(value: String): Self = this.set("sid", value.asInstanceOf[js.Any])
  }
}
