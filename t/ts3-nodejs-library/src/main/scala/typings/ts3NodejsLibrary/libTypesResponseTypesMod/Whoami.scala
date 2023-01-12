package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Whoami
  extends StObject
     with ResponseEntry {
  
  var clientChannelId: String
  
  var clientDatabaseId: String
  
  var clientId: String
  
  var clientLoginName: String
  
  var clientNickname: String
  
  var clientOriginServerId: String
  
  var clientUniqueIdentifier: String
  
  var virtualserverId: String
  
  var virtualserverPort: Double
  
  var virtualserverStatus: String
  
  var virtualserverUniqueIdentifier: String
}
object Whoami {
  
  inline def apply(
    clientChannelId: String,
    clientDatabaseId: String,
    clientId: String,
    clientLoginName: String,
    clientNickname: String,
    clientOriginServerId: String,
    clientUniqueIdentifier: String,
    virtualserverId: String,
    virtualserverPort: Double,
    virtualserverStatus: String,
    virtualserverUniqueIdentifier: String
  ): Whoami = {
    val __obj = js.Dynamic.literal(clientChannelId = clientChannelId.asInstanceOf[js.Any], clientDatabaseId = clientDatabaseId.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientLoginName = clientLoginName.asInstanceOf[js.Any], clientNickname = clientNickname.asInstanceOf[js.Any], clientOriginServerId = clientOriginServerId.asInstanceOf[js.Any], clientUniqueIdentifier = clientUniqueIdentifier.asInstanceOf[js.Any], virtualserverId = virtualserverId.asInstanceOf[js.Any], virtualserverPort = virtualserverPort.asInstanceOf[js.Any], virtualserverStatus = virtualserverStatus.asInstanceOf[js.Any], virtualserverUniqueIdentifier = virtualserverUniqueIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Whoami]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Whoami] (val x: Self) extends AnyVal {
    
    inline def setClientChannelId(value: String): Self = StObject.set(x, "clientChannelId", value.asInstanceOf[js.Any])
    
    inline def setClientDatabaseId(value: String): Self = StObject.set(x, "clientDatabaseId", value.asInstanceOf[js.Any])
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientLoginName(value: String): Self = StObject.set(x, "clientLoginName", value.asInstanceOf[js.Any])
    
    inline def setClientNickname(value: String): Self = StObject.set(x, "clientNickname", value.asInstanceOf[js.Any])
    
    inline def setClientOriginServerId(value: String): Self = StObject.set(x, "clientOriginServerId", value.asInstanceOf[js.Any])
    
    inline def setClientUniqueIdentifier(value: String): Self = StObject.set(x, "clientUniqueIdentifier", value.asInstanceOf[js.Any])
    
    inline def setVirtualserverId(value: String): Self = StObject.set(x, "virtualserverId", value.asInstanceOf[js.Any])
    
    inline def setVirtualserverPort(value: Double): Self = StObject.set(x, "virtualserverPort", value.asInstanceOf[js.Any])
    
    inline def setVirtualserverStatus(value: String): Self = StObject.set(x, "virtualserverStatus", value.asInstanceOf[js.Any])
    
    inline def setVirtualserverUniqueIdentifier(value: String): Self = StObject.set(x, "virtualserverUniqueIdentifier", value.asInstanceOf[js.Any])
  }
}
