package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientDBEntry extends ResponseEntry {
  
  var cldbid: String = js.native
  
  var clientCreated: Double = js.native
  
  var clientDescription: String = js.native
  
  var clientLastconnected: Double = js.native
  
  var clientLastip: String = js.native
  
  var clientLoginName: String = js.native
  
  var clientNickname: String = js.native
  
  var clientTotalconnections: Double = js.native
  
  var clientUniqueIdentifier: String = js.native
  
  var count: Double = js.native
}
object ClientDBEntry {
  
  @scala.inline
  def apply(
    cldbid: String,
    clientCreated: Double,
    clientDescription: String,
    clientLastconnected: Double,
    clientLastip: String,
    clientLoginName: String,
    clientNickname: String,
    clientTotalconnections: Double,
    clientUniqueIdentifier: String,
    count: Double
  ): ClientDBEntry = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], clientCreated = clientCreated.asInstanceOf[js.Any], clientDescription = clientDescription.asInstanceOf[js.Any], clientLastconnected = clientLastconnected.asInstanceOf[js.Any], clientLastip = clientLastip.asInstanceOf[js.Any], clientLoginName = clientLoginName.asInstanceOf[js.Any], clientNickname = clientNickname.asInstanceOf[js.Any], clientTotalconnections = clientTotalconnections.asInstanceOf[js.Any], clientUniqueIdentifier = clientUniqueIdentifier.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientDBEntry]
  }
  
  @scala.inline
  implicit class ClientDBEntryOps[Self <: ClientDBEntry] (val x: Self) extends AnyVal {
    
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
    def setClientCreated(value: Double): Self = this.set("clientCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientDescription(value: String): Self = this.set("clientDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientLastconnected(value: Double): Self = this.set("clientLastconnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientLastip(value: String): Self = this.set("clientLastip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientLoginName(value: String): Self = this.set("clientLoginName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientNickname(value: String): Self = this.set("clientNickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTotalconnections(value: Double): Self = this.set("clientTotalconnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUniqueIdentifier(value: String): Self = this.set("clientUniqueIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
  }
}
