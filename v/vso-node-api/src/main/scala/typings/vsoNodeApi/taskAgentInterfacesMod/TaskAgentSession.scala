package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentSession extends js.Object {
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
}

