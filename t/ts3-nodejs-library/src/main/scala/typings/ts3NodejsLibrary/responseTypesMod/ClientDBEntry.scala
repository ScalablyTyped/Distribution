package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientDBEntry
  extends StObject
     with ResponseEntry {
  
  var cldbid: String
  
  var clientCreated: Double
  
  var clientDescription: String
  
  var clientLastconnected: Double
  
  var clientLastip: String
  
  var clientLoginName: String
  
  var clientNickname: String
  
  var clientTotalconnections: Double
  
  var clientUniqueIdentifier: String
  
  var count: Double
}
object ClientDBEntry {
  
  inline def apply(
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
  
  extension [Self <: ClientDBEntry](x: Self) {
    
    inline def setCldbid(value: String): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
    
    inline def setClientCreated(value: Double): Self = StObject.set(x, "clientCreated", value.asInstanceOf[js.Any])
    
    inline def setClientDescription(value: String): Self = StObject.set(x, "clientDescription", value.asInstanceOf[js.Any])
    
    inline def setClientLastconnected(value: Double): Self = StObject.set(x, "clientLastconnected", value.asInstanceOf[js.Any])
    
    inline def setClientLastip(value: String): Self = StObject.set(x, "clientLastip", value.asInstanceOf[js.Any])
    
    inline def setClientLoginName(value: String): Self = StObject.set(x, "clientLoginName", value.asInstanceOf[js.Any])
    
    inline def setClientNickname(value: String): Self = StObject.set(x, "clientNickname", value.asInstanceOf[js.Any])
    
    inline def setClientTotalconnections(value: Double): Self = StObject.set(x, "clientTotalconnections", value.asInstanceOf[js.Any])
    
    inline def setClientUniqueIdentifier(value: String): Self = StObject.set(x, "clientUniqueIdentifier", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
