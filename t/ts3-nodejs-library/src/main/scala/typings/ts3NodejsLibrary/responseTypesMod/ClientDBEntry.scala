package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
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
  implicit class ClientDBEntryMutableBuilder[Self <: ClientDBEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCldbid(value: String): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCreated(value: Double): Self = StObject.set(x, "clientCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientDescription(value: String): Self = StObject.set(x, "clientDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientLastconnected(value: Double): Self = StObject.set(x, "clientLastconnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientLastip(value: String): Self = StObject.set(x, "clientLastip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientLoginName(value: String): Self = StObject.set(x, "clientLoginName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientNickname(value: String): Self = StObject.set(x, "clientNickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTotalconnections(value: Double): Self = StObject.set(x, "clientTotalconnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUniqueIdentifier(value: String): Self = StObject.set(x, "clientUniqueIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
