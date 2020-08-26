package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskAgentSession extends js.Object {
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
  implicit class TaskAgentSessionOps[Self <: TaskAgentSession] (val x: Self) extends AnyVal {
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
    def setAgent(value: TaskAgentReference): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncryptionKey(value: TaskAgentSessionKey): Self = this.set("encryptionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerName(value: String): Self = this.set("ownerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemCapabilities(value: StringDictionary[String]): Self = this.set("systemCapabilities", value.asInstanceOf[js.Any])
  }
  
}

