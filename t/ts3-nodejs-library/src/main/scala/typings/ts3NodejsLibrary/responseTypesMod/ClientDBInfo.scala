package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientDBInfo
  extends StObject
     with ResponseEntry {
  
  var clientBase64HashClientUID: String
  
  var clientCreated: Double
  
  var clientDatabaseId: String
  
  var clientDescription: String
  
  var clientFlagAvatar: String
  
  var clientLastconnected: Double
  
  var clientLastip: String
  
  var clientMonthBytesDownloaded: Double
  
  var clientMonthBytesUploaded: Double
  
  var clientNickname: String
  
  var clientTotalBytesDownloaded: Double
  
  var clientTotalBytesUploaded: Double
  
  var clientTotalconnections: Double
  
  var clientUniqueIdentifier: String
}
object ClientDBInfo {
  
  inline def apply(
    clientBase64HashClientUID: String,
    clientCreated: Double,
    clientDatabaseId: String,
    clientDescription: String,
    clientFlagAvatar: String,
    clientLastconnected: Double,
    clientLastip: String,
    clientMonthBytesDownloaded: Double,
    clientMonthBytesUploaded: Double,
    clientNickname: String,
    clientTotalBytesDownloaded: Double,
    clientTotalBytesUploaded: Double,
    clientTotalconnections: Double,
    clientUniqueIdentifier: String
  ): ClientDBInfo = {
    val __obj = js.Dynamic.literal(clientBase64HashClientUID = clientBase64HashClientUID.asInstanceOf[js.Any], clientCreated = clientCreated.asInstanceOf[js.Any], clientDatabaseId = clientDatabaseId.asInstanceOf[js.Any], clientDescription = clientDescription.asInstanceOf[js.Any], clientFlagAvatar = clientFlagAvatar.asInstanceOf[js.Any], clientLastconnected = clientLastconnected.asInstanceOf[js.Any], clientLastip = clientLastip.asInstanceOf[js.Any], clientMonthBytesDownloaded = clientMonthBytesDownloaded.asInstanceOf[js.Any], clientMonthBytesUploaded = clientMonthBytesUploaded.asInstanceOf[js.Any], clientNickname = clientNickname.asInstanceOf[js.Any], clientTotalBytesDownloaded = clientTotalBytesDownloaded.asInstanceOf[js.Any], clientTotalBytesUploaded = clientTotalBytesUploaded.asInstanceOf[js.Any], clientTotalconnections = clientTotalconnections.asInstanceOf[js.Any], clientUniqueIdentifier = clientUniqueIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientDBInfo]
  }
  
  extension [Self <: ClientDBInfo](x: Self) {
    
    inline def setClientBase64HashClientUID(value: String): Self = StObject.set(x, "clientBase64HashClientUID", value.asInstanceOf[js.Any])
    
    inline def setClientCreated(value: Double): Self = StObject.set(x, "clientCreated", value.asInstanceOf[js.Any])
    
    inline def setClientDatabaseId(value: String): Self = StObject.set(x, "clientDatabaseId", value.asInstanceOf[js.Any])
    
    inline def setClientDescription(value: String): Self = StObject.set(x, "clientDescription", value.asInstanceOf[js.Any])
    
    inline def setClientFlagAvatar(value: String): Self = StObject.set(x, "clientFlagAvatar", value.asInstanceOf[js.Any])
    
    inline def setClientLastconnected(value: Double): Self = StObject.set(x, "clientLastconnected", value.asInstanceOf[js.Any])
    
    inline def setClientLastip(value: String): Self = StObject.set(x, "clientLastip", value.asInstanceOf[js.Any])
    
    inline def setClientMonthBytesDownloaded(value: Double): Self = StObject.set(x, "clientMonthBytesDownloaded", value.asInstanceOf[js.Any])
    
    inline def setClientMonthBytesUploaded(value: Double): Self = StObject.set(x, "clientMonthBytesUploaded", value.asInstanceOf[js.Any])
    
    inline def setClientNickname(value: String): Self = StObject.set(x, "clientNickname", value.asInstanceOf[js.Any])
    
    inline def setClientTotalBytesDownloaded(value: Double): Self = StObject.set(x, "clientTotalBytesDownloaded", value.asInstanceOf[js.Any])
    
    inline def setClientTotalBytesUploaded(value: Double): Self = StObject.set(x, "clientTotalBytesUploaded", value.asInstanceOf[js.Any])
    
    inline def setClientTotalconnections(value: Double): Self = StObject.set(x, "clientTotalconnections", value.asInstanceOf[js.Any])
    
    inline def setClientUniqueIdentifier(value: String): Self = StObject.set(x, "clientUniqueIdentifier", value.asInstanceOf[js.Any])
  }
}
