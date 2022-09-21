package typings.twilsock.mod.Messages

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitReply
  extends StObject
     with AbstractMessage {
  
  val confirmedCapabilities: Set[String]
  
  val continuationToken: String
  
  val continuationTokenStatus: js.UndefOr[ContinuationTokenStatus] = js.undefined
  
  val debugInfo: js.UndefOr[String] = js.undefined
  
  val initRegistrations: js.UndefOr[String] = js.undefined
  
  val offlineStorage: js.UndefOr[String] = js.undefined
}
object InitReply {
  
  inline def apply(confirmedCapabilities: Set[String], continuationToken: String, id: String): InitReply = {
    val __obj = js.Dynamic.literal(confirmedCapabilities = confirmedCapabilities.asInstanceOf[js.Any], continuationToken = continuationToken.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitReply]
  }
  
  extension [Self <: InitReply](x: Self) {
    
    inline def setConfirmedCapabilities(value: Set[String]): Self = StObject.set(x, "confirmedCapabilities", value.asInstanceOf[js.Any])
    
    inline def setContinuationToken(value: String): Self = StObject.set(x, "continuationToken", value.asInstanceOf[js.Any])
    
    inline def setContinuationTokenStatus(value: ContinuationTokenStatus): Self = StObject.set(x, "continuationTokenStatus", value.asInstanceOf[js.Any])
    
    inline def setContinuationTokenStatusUndefined: Self = StObject.set(x, "continuationTokenStatus", js.undefined)
    
    inline def setDebugInfo(value: String): Self = StObject.set(x, "debugInfo", value.asInstanceOf[js.Any])
    
    inline def setDebugInfoUndefined: Self = StObject.set(x, "debugInfo", js.undefined)
    
    inline def setInitRegistrations(value: String): Self = StObject.set(x, "initRegistrations", value.asInstanceOf[js.Any])
    
    inline def setInitRegistrationsUndefined: Self = StObject.set(x, "initRegistrations", js.undefined)
    
    inline def setOfflineStorage(value: String): Self = StObject.set(x, "offlineStorage", value.asInstanceOf[js.Any])
    
    inline def setOfflineStorageUndefined: Self = StObject.set(x, "offlineStorage", js.undefined)
  }
}
