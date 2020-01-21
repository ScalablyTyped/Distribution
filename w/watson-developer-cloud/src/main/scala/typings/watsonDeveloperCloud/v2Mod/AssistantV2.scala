package typings.watsonDeveloperCloud.v2Mod

import typings.ibmCloudSdkCore.mod.BaseService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The IBM Watson&trade; Assistant service combines machine learning, natural language understanding, and integrated dialog tools to create conversation flows between your apps and your users.
  */
@js.native
trait AssistantV2 extends BaseService {
  /*************************
    * sessions
    ************************/
  /**
    * Create a session.
    *
    * Create a new session. A session is used to send user input to a skill and receive responses. It also maintains the
    * state of the conversation.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.assistant_id - Unique identifier of the assistant. You can find the assistant ID of an
    * assistant on the **Assistants** tab of the Watson Assistant tool. For information about creating assistants, see
    * the [documentation](https://console.bluemix.net/docs/services/assistant/assistant-add.html#assistant-add-task).
    *
    * **Note:** Currently, the v2 API does not support creating assistants.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def createSession(params: CreateSessionParams): js.Promise[_] | Unit = js.native
  def createSession(params: CreateSessionParams, callback: Callback[SessionResponse]): js.Promise[_] | Unit = js.native
  /**
    * Delete session.
    *
    * Deletes a session explicitly before it times out.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.assistant_id - Unique identifier of the assistant. You can find the assistant ID of an
    * assistant on the **Assistants** tab of the Watson Assistant tool. For information about creating assistants, see
    * the [documentation](https://console.bluemix.net/docs/services/assistant/assistant-add.html#assistant-add-task).
    *
    * **Note:** Currently, the v2 API does not support creating assistants.
    * @param {string} params.session_id - Unique identifier of the session.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteSession(params: DeleteSessionParams): js.Promise[_] | Unit = js.native
  def deleteSession(params: DeleteSessionParams, callback: Callback[Empty]): js.Promise[_] | Unit = js.native
  /*************************
    * message
    ************************/
  /**
    * Send user input to assistant.
    *
    * Send user input to an assistant and receive a response.
    *
    * There is no rate limit for this operation.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.assistant_id - Unique identifier of the assistant. You can find the assistant ID of an
    * assistant on the **Assistants** tab of the Watson Assistant tool. For information about creating assistants, see
    * the [documentation](https://console.bluemix.net/docs/services/assistant/assistant-add.html#assistant-add-task).
    *
    * **Note:** Currently, the v2 API does not support creating assistants.
    * @param {string} params.session_id - Unique identifier of the session.
    * @param {MessageInput} [params.input] - An input object that includes the input text.
    * @param {MessageContext} [params.context] - State information for the conversation. The context is stored by the
    * assistant on a per-session basis. You can use this property to set or modify context variables, which can also be
    * accessed by dialog nodes.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def message(params: MessageParams): js.Promise[_] | Unit = js.native
  def message(params: MessageParams, callback: Callback[MessageResponse]): js.Promise[_] | Unit = js.native
}

