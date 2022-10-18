package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskAgentSession extends StObject {
  
  /**
    * Gets or sets the agent which is the target of the session.
    */
  var agent: TaskAgentReference
  
  /**
    * Gets the key used to encrypt message traffic for this session.
    */
  var encryptionKey: TaskAgentSessionKey
  
  /**
    * Gets or sets the owner name of this session. Generally this will be the machine of origination.
    */
  var ownerName: String
  
  /**
    * Gets the unique identifier for this session.
    */
  var sessionId: String
  
  var systemCapabilities: StringDictionary[String]
}
object TaskAgentSession {
  
  inline def apply(
    agent: TaskAgentReference,
    encryptionKey: TaskAgentSessionKey,
    ownerName: String,
    sessionId: String,
    systemCapabilities: StringDictionary[String]
  ): TaskAgentSession = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], encryptionKey = encryptionKey.asInstanceOf[js.Any], ownerName = ownerName.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], systemCapabilities = systemCapabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentSession]
  }
  
  extension [Self <: TaskAgentSession](x: Self) {
    
    inline def setAgent(value: TaskAgentReference): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKey(value: TaskAgentSessionKey): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setOwnerName(value: String): Self = StObject.set(x, "ownerName", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSystemCapabilities(value: StringDictionary[String]): Self = StObject.set(x, "systemCapabilities", value.asInstanceOf[js.Any])
  }
}
