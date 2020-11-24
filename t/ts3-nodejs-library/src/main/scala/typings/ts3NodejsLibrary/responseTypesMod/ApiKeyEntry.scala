package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.enumMod.ApiKeyScope
import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiKeyEntry extends ResponseEntry {
  
  var cldbid: Double = js.native
  
  var count: Double = js.native
  
  var createdAt: Double = js.native
  
  var expiresAt: Double = js.native
  
  var id: String = js.native
  
  var scope: ApiKeyScope = js.native
  
  var sid: Double = js.native
  
  var timeLeft: Double = js.native
}
object ApiKeyEntry {
  
  @scala.inline
  def apply(
    cldbid: Double,
    count: Double,
    createdAt: Double,
    expiresAt: Double,
    id: String,
    scope: ApiKeyScope,
    sid: Double,
    timeLeft: Double
  ): ApiKeyEntry = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], timeLeft = timeLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyEntry]
  }
  
  @scala.inline
  implicit class ApiKeyEntryOps[Self <: ApiKeyEntry] (val x: Self) extends AnyVal {
    
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
    def setCldbid(value: Double): Self = this.set("cldbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAt(value: Double): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresAt(value: Double): Self = this.set("expiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: ApiKeyScope): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSid(value: Double): Self = this.set("sid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeLeft(value: Double): Self = this.set("timeLeft", value.asInstanceOf[js.Any])
  }
}
