package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

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
  var ownerName: java.lang.String
  /**
    * Gets the unique identifier for this session.
    */
  var sessionId: java.lang.String
  var systemCapabilities: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object TaskAgentSession {
  @scala.inline
  def apply(
    agent: TaskAgentReference,
    encryptionKey: TaskAgentSessionKey,
    ownerName: java.lang.String,
    sessionId: java.lang.String,
    systemCapabilities: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): TaskAgentSession = {
    val __obj = js.Dynamic.literal(agent = agent, encryptionKey = encryptionKey, ownerName = ownerName, sessionId = sessionId, systemCapabilities = systemCapabilities)
  
    __obj.asInstanceOf[TaskAgentSession]
  }
}

