package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskAgentSession extends StObject {
  
  /**
    * Gets or sets the agent which is the target of the session.
    */
  var agent: TaskAgentReference = js.native
  
  /**
    * Gets the key used to encrypt message traffic for this session.
    */
  var encryptionKey: TaskAgentSessionKey = js.native
  
  /**
    * Gets or sets the owner name of this session. Generally this will be the machine of origination.
    */
  var ownerName: String = js.native
  
  /**
    * Gets the unique identifier for this session.
    */
  var sessionId: String = js.native
  
  var systemCapabilities: StringDictionary[String] = js.native
}
object TaskAgentSession {
  
  @scala.inline
  def apply(
    agent: TaskAgentReference,
    encryptionKey: TaskAgentSessionKey,
    ownerName: String,
    sessionId: String,
    systemCapabilities: StringDictionary[String]
  ): TaskAgentSession = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], encryptionKey = encryptionKey.asInstanceOf[js.Any], ownerName = ownerName.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], systemCapabilities = systemCapabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentSession]
  }
  
  @scala.inline
  implicit class TaskAgentSessionMutableBuilder[Self <: TaskAgentSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgent(value: TaskAgentReference): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionKey(value: TaskAgentSessionKey): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerName(value: String): Self = StObject.set(x, "ownerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemCapabilities(value: StringDictionary[String]): Self = StObject.set(x, "systemCapabilities", value.asInstanceOf[js.Any])
  }
}
