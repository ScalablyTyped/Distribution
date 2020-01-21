package typings.watsonDeveloperCloud.mod

import typings.ibmCloudSdkCore.mod.BaseService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The IBM Watson&trade; Assistant service combines machine learning, natural language understanding, and integrated dialog tools to create conversation flows between your apps and your users.
  */
@js.native
trait AssistantV1 extends BaseService {
  /*************************
    * counterexamples
    ************************/
  /**
    * Create counterexample.
    *
    * Add a new counterexample to a workspace. Counterexamples are examples that have been marked as irrelevant input.
    *
    * This operation is limited to 1000 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.text - The text of a user input marked as irrelevant input. This string must conform to the
    * following restrictions:
    * - It cannot contain carriage return, newline, or tab characters
    * - It cannot consist of only whitespace characters
    * - It must be no longer than 1024 characters.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def createCounterexample(params: CreateCounterexampleParams): js.Promise[_] | Unit = js.native
  def createCounterexample(params: CreateCounterexampleParams, callback: Callback[Counterexample]): js.Promise[_] | Unit = js.native
  /*************************
    * dialogNodes
    ************************/
  /**
    * Create dialog node.
    *
    * Create a new dialog node.
    *
    * This operation is limited to 500 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.dialog_node - The dialog node ID. This string must conform to the following restrictions:
    * - It can contain only Unicode alphanumeric, space, underscore, hyphen, and dot characters.
    * - It must be no longer than 1024 characters.
    * @param {string} [params.description] - The description of the dialog node. This string cannot contain carriage
    * return, newline, or tab characters, and it must be no longer than 128 characters.
    * @param {string} [params.conditions] - The condition that will trigger the dialog node. This string cannot contain
    * carriage return, newline, or tab characters, and it must be no longer than 2048 characters.
    * @param {string} [params.parent] - The ID of the parent dialog node. This property is omitted if the dialog node has
    * no parent.
    * @param {string} [params.previous_sibling] - The ID of the previous sibling dialog node. This property is omitted if
    * the dialog node has no previous sibling.
    * @param {DialogNodeOutput} [params.output] - The output of the dialog node. For more information about how to
    * specify dialog node output, see the
    * [documentation](https://cloud.ibm.com/docs/services/assistant/dialog-overview.html#dialog-overview-responses).
    * @param {Object} [params.context] - The context for the dialog node.
    * @param {Object} [params.metadata] - The metadata for the dialog node.
    * @param {DialogNodeNextStep} [params.next_step] - The next step to execute following this dialog node.
    * @param {string} [params.title] - The alias used to identify the dialog node. This string must conform to the
    * following restrictions:
    * - It can contain only Unicode alphanumeric, space, underscore, hyphen, and dot characters.
    * - It must be no longer than 64 characters.
    * @param {string} [params.node_type] - How the dialog node is processed.
    * @param {string} [params.event_name] - How an `event_handler` node is processed.
    * @param {string} [params.variable] - The location in the dialog context where output is stored.
    * @param {DialogNodeAction[]} [params.actions] - An array of objects describing any actions to be invoked by the
    * dialog node.
    * @param {string} [params.digress_in] - Whether this top-level dialog node can be digressed into.
    * @param {string} [params.digress_out] - Whether this dialog node can be returned to after a digression.
    * @param {string} [params.digress_out_slots] - Whether the user can digress to top-level nodes while filling out
    * slots.
    * @param {string} [params.user_label] - A label that can be displayed externally to describe the purpose of the node
    * to users. This string must be no longer than 512 characters.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def createDialogNode(params: CreateDialogNodeParams): js.Promise[_] | Unit = js.native
  def createDialogNode(params: CreateDialogNodeParams, callback: Callback[DialogNode]): js.Promise[_] | Unit = js.native
  /*************************
    * entities
    ************************/
  /**
    * Create entity.
    *
    * Create a new entity, or enable a system entity.
    *
    * This operation is limited to 1000 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.entity - The name of the entity. This string must conform to the following restrictions:
    * - It can contain only Unicode alphanumeric, underscore, and hyphen characters.
    * - It must be no longer than 64 characters.
    *
    * If you specify an entity name beginning with the reserved prefix `sys-`, it must be the name of a system entity
    * that you want to enable. (Any entity content specified with the request is ignored.).
    * @param {string} [params.description] - The description of the entity. This string cannot contain carriage return,
    * newline, or tab characters, and it must be no longer than 128 characters.
    * @param {Object} [params.metadata] - Any metadata related to the entity.
    * @param {boolean} [params.fuzzy_match] - Whether to use fuzzy matching for the entity.
    * @param {CreateValue[]} [params.values] - An array of objects describing the entity values.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def createEntity(params: CreateEntityParams): js.Promise[_] | Unit = js.native
  def createEntity(params: CreateEntityParams, callback: Callback[Entity]): js.Promise[_] | Unit = js.native
  /*************************
    * examples
    ************************/
  /**
    * Create user input example.
    *
    * Add a new user input example to an intent.
    *
    * This operation is limited to 1000 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.intent - The intent name.
    * @param {string} params.text - The text of a user input example. This string must conform to the following
    * restrictions:
    * - It cannot contain carriage return, newline, or tab characters.
    * - It cannot consist of only whitespace characters.
    * - It must be no longer than 1024 characters.
    * @param {Mention[]} [params.mentions] - An array of contextual entity mentions.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def createExample(params: CreateExampleParams): js.Promise[_] | Unit = js.native
  def createExample(params: CreateExampleParams, callback: Callback[Example]): js.Promise[_] | Unit = js.native
  /*************************
    * intents
    ************************/
  /**
    * Create intent.
    *
    * Create a new intent.
    *
    * This operation is limited to 2000 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.intent - The name of the intent. This string must conform to the following restrictions:
    * - It can contain only Unicode alphanumeric, underscore, hyphen, and dot characters.
    * - It cannot begin with the reserved prefix `sys-`.
    * - It must be no longer than 128 characters.
    * @param {string} [params.description] - The description of the intent. This string cannot contain carriage return,
    * newline, or tab characters, and it must be no longer than 128 characters.
    * @param {Example[]} [params.examples] - An array of user input examples for the intent.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def createIntent(params: CreateIntentParams): js.Promise[_] | Unit = js.native
  def createIntent(params: CreateIntentParams, callback: Callback[Intent]): js.Promise[_] | Unit = js.native
  /*************************
    * synonyms
    ************************/
  /**
    * Create entity value synonym.
    *
    * Add a new synonym to an entity value.
    *
    * This operation is limited to 1000 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.entity - The name of the entity.
    * @param {string} params.value - The text of the entity value.
    * @param {string} params.synonym - The text of the synonym. This string must conform to the following restrictions:
    * - It cannot contain carriage return, newline, or tab characters.
    * - It cannot consist of only whitespace characters.
    * - It must be no longer than 64 characters.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def createSynonym(params: CreateSynonymParams): js.Promise[_] | Unit = js.native
  def createSynonym(params: CreateSynonymParams, callback: Callback[Synonym]): js.Promise[_] | Unit = js.native
  /*************************
    * values
    ************************/
  /**
    * Create entity value.
    *
    * Create a new value for an entity.
    *
    * This operation is limited to 1000 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.entity - The name of the entity.
    * @param {string} params.value - The text of the entity value. This string must conform to the following
    * restrictions:
    * - It cannot contain carriage return, newline, or tab characters.
    * - It cannot consist of only whitespace characters.
    * - It must be no longer than 64 characters.
    * @param {Object} [params.metadata] - Any metadata related to the entity value.
    * @param {string} [params.value_type] - Specifies the type of entity value.
    * @param {string[]} [params.synonyms] - An array of synonyms for the entity value. A value can specify either
    * synonyms or patterns (depending on the value type), but not both. A synonym must conform to the following
    * resrictions:
    * - It cannot contain carriage return, newline, or tab characters.
    * - It cannot consist of only whitespace characters.
    * - It must be no longer than 64 characters.
    * @param {string[]} [params.patterns] - An array of patterns for the entity value. A value can specify either
    * synonyms or patterns (depending on the value type), but not both. A pattern is a regular expression no longer than
    * 512 characters. For more information about how to specify a pattern, see the
    * [documentation](https://cloud.ibm.com/docs/services/assistant/entities.html#entities-create-dictionary-based).
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def createValue(params: CreateValueParams): js.Promise[_] | Unit = js.native
  def createValue(params: CreateValueParams, callback: Callback[Value]): js.Promise[_] | Unit = js.native
  /*************************
    * workspaces
    ************************/
  /**
    * Create workspace.
    *
    * Create a workspace based on component objects. You must provide workspace components defining the content of the
    * new workspace.
    *
    * This operation is limited to 30 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} [params] - The parameters to send to the service.
    * @param {string} [params.name] - The name of the workspace. This string cannot contain carriage return, newline, or
    * tab characters, and it must be no longer than 64 characters.
    * @param {string} [params.description] - The description of the workspace. This string cannot contain carriage
    * return, newline, or tab characters, and it must be no longer than 128 characters.
    * @param {string} [params.language] - The language of the workspace.
    * @param {Object} [params.metadata] - Any metadata related to the workspace.
    * @param {boolean} [params.learning_opt_out] - Whether training data from the workspace (including artifacts such as
    * intents and entities) can be used by IBM for general service improvements. `true` indicates that workspace training
    * data is not to be used.
    * @param {WorkspaceSystemSettings} [params.system_settings] - Global settings for the workspace.
    * @param {CreateIntent[]} [params.intents] - An array of objects defining the intents for the workspace.
    * @param {CreateEntity[]} [params.entities] - An array of objects describing the entities for the workspace.
    * @param {DialogNode[]} [params.dialog_nodes] - An array of objects describing the dialog nodes in the workspace.
    * @param {Counterexample[]} [params.counterexamples] - An array of objects defining input examples that have been
    * marked as irrelevant input.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def createWorkspace(): js.Promise[_] | Unit = js.native
  def createWorkspace(params: CreateWorkspaceParams): js.Promise[_] | Unit = js.native
  def createWorkspace(params: CreateWorkspaceParams, callback: Callback[Workspace]): js.Promise[_] | Unit = js.native
  /**
    * Delete counterexample.
    *
    * Delete a counterexample from a workspace. Counterexamples are examples that have been marked as irrelevant input.
    *
    * This operation is limited to 1000 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.text - The text of a user input counterexample (for example, `What are you wearing?`).
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteCounterexample(params: DeleteCounterexampleParams): js.Promise[_] | Unit = js.native
  def deleteCounterexample(params: DeleteCounterexampleParams, callback: Callback[Empty]): js.Promise[_] | Unit = js.native
  /**
    * Delete dialog node.
    *
    * Delete a dialog node from a workspace.
    *
    * This operation is limited to 500 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.dialog_node - The dialog node ID (for example, `get_order`).
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteDialogNode(params: DeleteDialogNodeParams): js.Promise[_] | Unit = js.native
  def deleteDialogNode(params: DeleteDialogNodeParams, callback: Callback[Empty]): js.Promise[_] | Unit = js.native
  /**
    * Delete entity.
    *
    * Delete an entity from a workspace, or disable a system entity.
    *
    * This operation is limited to 1000 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.entity - The name of the entity.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteEntity(params: DeleteEntityParams): js.Promise[_] | Unit = js.native
  def deleteEntity(params: DeleteEntityParams, callback: Callback[Empty]): js.Promise[_] | Unit = js.native
  /**
    * Delete user input example.
    *
    * Delete a user input example from an intent.
    *
    * This operation is limited to 1000 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.intent - The intent name.
    * @param {string} params.text - The text of the user input example.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteExample(params: DeleteExampleParams): js.Promise[_] | Unit = js.native
  def deleteExample(params: DeleteExampleParams, callback: Callback[Empty]): js.Promise[_] | Unit = js.native
  /**
    * Delete intent.
    *
    * Delete an intent from a workspace.
    *
    * This operation is limited to 2000 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.intent - The intent name.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteIntent(params: DeleteIntentParams): js.Promise[_] | Unit = js.native
  def deleteIntent(params: DeleteIntentParams, callback: Callback[Empty]): js.Promise[_] | Unit = js.native
  /**
    * Delete entity value synonym.
    *
    * Delete a synonym from an entity value.
    *
    * This operation is limited to 1000 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.entity - The name of the entity.
    * @param {string} params.value - The text of the entity value.
    * @param {string} params.synonym - The text of the synonym.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteSynonym(params: DeleteSynonymParams): js.Promise[_] | Unit = js.native
  def deleteSynonym(params: DeleteSynonymParams, callback: Callback[Empty]): js.Promise[_] | Unit = js.native
  /*************************
    * userData
    ************************/
  /**
    * Delete labeled data.
    *
    * Deletes all data associated with a specified customer ID. The method has no effect if no data is associated with
    * the customer ID.
    *
    * You associate a customer ID with data by passing the `X-Watson-Metadata` header with a request that passes data.
    * For more information about personal data and customer IDs, see [Information
    * security](https://cloud.ibm.com/docs/services/assistant/information-security.html).
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.customer_id - The customer ID for which all data is to be deleted.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteUserData(params: DeleteUserDataParams): js.Promise[_] | Unit = js.native
  def deleteUserData(params: DeleteUserDataParams, callback: Callback[Empty]): js.Promise[_] | Unit = js.native
  /**
    * Delete entity value.
    *
    * Delete a value from an entity.
    *
    * This operation is limited to 1000 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.entity - The name of the entity.
    * @param {string} params.value - The text of the entity value.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteValue(params: DeleteValueParams): js.Promise[_] | Unit = js.native
  def deleteValue(params: DeleteValueParams, callback: Callback[Empty]): js.Promise[_] | Unit = js.native
  /**
    * Delete workspace.
    *
    * Delete a workspace from the service instance.
    *
    * This operation is limited to 30 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def deleteWorkspace(params: DeleteWorkspaceParams): js.Promise[_] | Unit = js.native
  def deleteWorkspace(params: DeleteWorkspaceParams, callback: Callback[Empty]): js.Promise[_] | Unit = js.native
  /**
    * Get counterexample.
    *
    * Get information about a counterexample. Counterexamples are examples that have been marked as irrelevant input.
    *
    * This operation is limited to 6000 requests per 5 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.text - The text of a user input counterexample (for example, `What are you wearing?`).
    * @param {boolean} [params.include_audit] - Whether to include the audit properties (`created` and `updated`
    * timestamps) in the response.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getCounterexample(params: GetCounterexampleParams): js.Promise[_] | Unit = js.native
  def getCounterexample(params: GetCounterexampleParams, callback: Callback[Counterexample]): js.Promise[_] | Unit = js.native
  /**
    * Get dialog node.
    *
    * Get information about a dialog node.
    *
    * This operation is limited to 6000 requests per 5 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.dialog_node - The dialog node ID (for example, `get_order`).
    * @param {boolean} [params.include_audit] - Whether to include the audit properties (`created` and `updated`
    * timestamps) in the response.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getDialogNode(params: GetDialogNodeParams): js.Promise[_] | Unit = js.native
  def getDialogNode(params: GetDialogNodeParams, callback: Callback[DialogNode]): js.Promise[_] | Unit = js.native
  /**
    * Get entity.
    *
    * Get information about an entity, optionally including all entity content.
    *
    * With **export**=`false`, this operation is limited to 6000 requests per 5 minutes. With **export**=`true`, the
    * limit is 200 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.entity - The name of the entity.
    * @param {boolean} [params._export] - Whether to include all element content in the returned data. If
    * **export**=`false`, the returned data includes only information about the element itself. If **export**=`true`, all
    * content, including subelements, is included.
    * @param {boolean} [params.include_audit] - Whether to include the audit properties (`created` and `updated`
    * timestamps) in the response.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getEntity(params: GetEntityParams): js.Promise[_] | Unit = js.native
  def getEntity(params: GetEntityParams, callback: Callback[Entity]): js.Promise[_] | Unit = js.native
  /**
    * Get user input example.
    *
    * Get information about a user input example.
    *
    * This operation is limited to 6000 requests per 5 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.intent - The intent name.
    * @param {string} params.text - The text of the user input example.
    * @param {boolean} [params.include_audit] - Whether to include the audit properties (`created` and `updated`
    * timestamps) in the response.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getExample(params: GetExampleParams): js.Promise[_] | Unit = js.native
  def getExample(params: GetExampleParams, callback: Callback[Example]): js.Promise[_] | Unit = js.native
  /**
    * Get intent.
    *
    * Get information about an intent, optionally including all intent content.
    *
    * With **export**=`false`, this operation is limited to 6000 requests per 5 minutes. With **export**=`true`, the
    * limit is 400 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.intent - The intent name.
    * @param {boolean} [params._export] - Whether to include all element content in the returned data. If
    * **export**=`false`, the returned data includes only information about the element itself. If **export**=`true`, all
    * content, including subelements, is included.
    * @param {boolean} [params.include_audit] - Whether to include the audit properties (`created` and `updated`
    * timestamps) in the response.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getIntent(params: GetIntentParams): js.Promise[_] | Unit = js.native
  def getIntent(params: GetIntentParams, callback: Callback[Intent]): js.Promise[_] | Unit = js.native
  /**
    * Get entity value synonym.
    *
    * Get information about a synonym of an entity value.
    *
    * This operation is limited to 6000 requests per 5 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.entity - The name of the entity.
    * @param {string} params.value - The text of the entity value.
    * @param {string} params.synonym - The text of the synonym.
    * @param {boolean} [params.include_audit] - Whether to include the audit properties (`created` and `updated`
    * timestamps) in the response.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getSynonym(params: GetSynonymParams): js.Promise[_] | Unit = js.native
  def getSynonym(params: GetSynonymParams, callback: Callback[Synonym]): js.Promise[_] | Unit = js.native
  /**
    * Get entity value.
    *
    * Get information about an entity value.
    *
    * This operation is limited to 6000 requests per 5 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.entity - The name of the entity.
    * @param {string} params.value - The text of the entity value.
    * @param {boolean} [params._export] - Whether to include all element content in the returned data. If
    * **export**=`false`, the returned data includes only information about the element itself. If **export**=`true`, all
    * content, including subelements, is included.
    * @param {boolean} [params.include_audit] - Whether to include the audit properties (`created` and `updated`
    * timestamps) in the response.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getValue(params: GetValueParams): js.Promise[_] | Unit = js.native
  def getValue(params: GetValueParams, callback: Callback[Value]): js.Promise[_] | Unit = js.native
  /**
    * Get information about a workspace.
    *
    * Get information about a workspace, optionally including all workspace content.
    *
    * With **export**=`false`, this operation is limited to 6000 requests per 5 minutes. With **export**=`true`, the
    * limit is 20 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {boolean} [params._export] - Whether to include all element content in the returned data. If
    * **export**=`false`, the returned data includes only information about the element itself. If **export**=`true`, all
    * content, including subelements, is included.
    * @param {boolean} [params.include_audit] - Whether to include the audit properties (`created` and `updated`
    * timestamps) in the response.
    * @param {string} [params.sort] - Indicates how the returned workspace data will be sorted. This parameter is valid
    * only if **export**=`true`. Specify `sort=stable` to sort all workspace objects by unique identifier, in ascending
    * alphabetical order.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def getWorkspace(params: GetWorkspaceParams): js.Promise[_] | Unit = js.native
  def getWorkspace(params: GetWorkspaceParams, callback: Callback[Workspace]): js.Promise[_] | Unit = js.native
  /*************************
    * logs
    ************************/
  /**
    * List log events in all workspaces.
    *
    * List the events from the logs of all workspaces in the service instance.
    *
    * If **cursor** is not specified, this operation is limited to 40 requests per 30 minutes. If **cursor** is
    * specified, the limit is 120 requests per minute. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.filter - A cacheable parameter that limits the results to those matching the specified
    * filter. You must specify a filter query that includes a value for `language`, as well as a value for `workspace_id`
    * or `request.context.metadata.deployment`. For more information, see the
    * [documentation](https://cloud.ibm.com/docs/services/assistant/filter-reference.html#filter-reference-syntax).
    * @param {string} [params.sort] - How to sort the returned log events. You can sort by **request_timestamp**. To
    * reverse the sort order, prefix the parameter value with a minus sign (`-`).
    * @param {number} [params.page_limit] - The number of records to return in each page of results.
    * @param {string} [params.cursor] - A token identifying the page of results to retrieve.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listAllLogs(params: ListAllLogsParams): js.Promise[_] | Unit = js.native
  def listAllLogs(params: ListAllLogsParams, callback: Callback[LogCollection]): js.Promise[_] | Unit = js.native
  /**
    * List counterexamples.
    *
    * List the counterexamples for a workspace. Counterexamples are examples that have been marked as irrelevant input.
    *
    * This operation is limited to 2500 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {number} [params.page_limit] - The number of records to return in each page of results.
    * @param {boolean} [params.include_count] - Whether to include information about the number of records returned.
    * @param {string} [params.sort] - The attribute by which returned counterexamples will be sorted. To reverse the sort
    * order, prefix the value with a minus sign (`-`).
    * @param {string} [params.cursor] - A token identifying the page of results to retrieve.
    * @param {boolean} [params.include_audit] - Whether to include the audit properties (`created` and `updated`
    * timestamps) in the response.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listCounterexamples(params: ListCounterexamplesParams): js.Promise[_] | Unit = js.native
  def listCounterexamples(params: ListCounterexamplesParams, callback: Callback[CounterexampleCollection]): js.Promise[_] | Unit = js.native
  /**
    * List dialog nodes.
    *
    * List the dialog nodes for a workspace.
    *
    * This operation is limited to 2500 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {number} [params.page_limit] - The number of records to return in each page of results.
    * @param {boolean} [params.include_count] - Whether to include information about the number of records returned.
    * @param {string} [params.sort] - The attribute by which returned dialog nodes will be sorted. To reverse the sort
    * order, prefix the value with a minus sign (`-`).
    * @param {string} [params.cursor] - A token identifying the page of results to retrieve.
    * @param {boolean} [params.include_audit] - Whether to include the audit properties (`created` and `updated`
    * timestamps) in the response.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listDialogNodes(params: ListDialogNodesParams): js.Promise[_] | Unit = js.native
  def listDialogNodes(params: ListDialogNodesParams, callback: Callback[DialogNodeCollection]): js.Promise[_] | Unit = js.native
  /**
    * List entities.
    *
    * List the entities for a workspace.
    *
    * With **export**=`false`, this operation is limited to 1000 requests per 30 minutes. With **export**=`true`, the
    * limit is 200 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {boolean} [params._export] - Whether to include all element content in the returned data. If
    * **export**=`false`, the returned data includes only information about the element itself. If **export**=`true`, all
    * content, including subelements, is included.
    * @param {number} [params.page_limit] - The number of records to return in each page of results.
    * @param {boolean} [params.include_count] - Whether to include information about the number of records returned.
    * @param {string} [params.sort] - The attribute by which returned entities will be sorted. To reverse the sort order,
    * prefix the value with a minus sign (`-`).
    * @param {string} [params.cursor] - A token identifying the page of results to retrieve.
    * @param {boolean} [params.include_audit] - Whether to include the audit properties (`created` and `updated`
    * timestamps) in the response.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listEntities(params: ListEntitiesParams): js.Promise[_] | Unit = js.native
  def listEntities(params: ListEntitiesParams, callback: Callback[EntityCollection]): js.Promise[_] | Unit = js.native
  /**
    * List user input examples.
    *
    * List the user input examples for an intent, optionally including contextual entity mentions.
    *
    * This operation is limited to 2500 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.intent - The intent name.
    * @param {number} [params.page_limit] - The number of records to return in each page of results.
    * @param {boolean} [params.include_count] - Whether to include information about the number of records returned.
    * @param {string} [params.sort] - The attribute by which returned examples will be sorted. To reverse the sort order,
    * prefix the value with a minus sign (`-`).
    * @param {string} [params.cursor] - A token identifying the page of results to retrieve.
    * @param {boolean} [params.include_audit] - Whether to include the audit properties (`created` and `updated`
    * timestamps) in the response.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listExamples(params: ListExamplesParams): js.Promise[_] | Unit = js.native
  def listExamples(params: ListExamplesParams, callback: Callback[ExampleCollection]): js.Promise[_] | Unit = js.native
  /**
    * List intents.
    *
    * List the intents for a workspace.
    *
    * With **export**=`false`, this operation is limited to 2000 requests per 30 minutes. With **export**=`true`, the
    * limit is 400 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {boolean} [params._export] - Whether to include all element content in the returned data. If
    * **export**=`false`, the returned data includes only information about the element itself. If **export**=`true`, all
    * content, including subelements, is included.
    * @param {number} [params.page_limit] - The number of records to return in each page of results.
    * @param {boolean} [params.include_count] - Whether to include information about the number of records returned.
    * @param {string} [params.sort] - The attribute by which returned intents will be sorted. To reverse the sort order,
    * prefix the value with a minus sign (`-`).
    * @param {string} [params.cursor] - A token identifying the page of results to retrieve.
    * @param {boolean} [params.include_audit] - Whether to include the audit properties (`created` and `updated`
    * timestamps) in the response.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listIntents(params: ListIntentsParams): js.Promise[_] | Unit = js.native
  def listIntents(params: ListIntentsParams, callback: Callback[IntentCollection]): js.Promise[_] | Unit = js.native
  /**
    * List log events in a workspace.
    *
    * List the events from the log of a specific workspace.
    *
    * If **cursor** is not specified, this operation is limited to 40 requests per 30 minutes. If **cursor** is
    * specified, the limit is 120 requests per minute. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} [params.sort] - How to sort the returned log events. You can sort by **request_timestamp**. To
    * reverse the sort order, prefix the parameter value with a minus sign (`-`).
    * @param {string} [params.filter] - A cacheable parameter that limits the results to those matching the specified
    * filter. For more information, see the
    * [documentation](https://cloud.ibm.com/docs/services/assistant/filter-reference.html#filter-reference-syntax).
    * @param {number} [params.page_limit] - The number of records to return in each page of results.
    * @param {string} [params.cursor] - A token identifying the page of results to retrieve.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listLogs(params: ListLogsParams): js.Promise[_] | Unit = js.native
  def listLogs(params: ListLogsParams, callback: Callback[LogCollection]): js.Promise[_] | Unit = js.native
  /*************************
    * mentions
    ************************/
  /**
    * List entity mentions.
    *
    * List mentions for a contextual entity. An entity mention is an occurrence of a contextual entity in the context of
    * an intent user input example.
    *
    * This operation is limited to 200 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.entity - The name of the entity.
    * @param {boolean} [params._export] - Whether to include all element content in the returned data. If
    * **export**=`false`, the returned data includes only information about the element itself. If **export**=`true`, all
    * content, including subelements, is included.
    * @param {boolean} [params.include_audit] - Whether to include the audit properties (`created` and `updated`
    * timestamps) in the response.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listMentions(params: ListMentionsParams): js.Promise[_] | Unit = js.native
  def listMentions(params: ListMentionsParams, callback: Callback[EntityMentionCollection]): js.Promise[_] | Unit = js.native
  /**
    * List entity value synonyms.
    *
    * List the synonyms for an entity value.
    *
    * This operation is limited to 2500 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.entity - The name of the entity.
    * @param {string} params.value - The text of the entity value.
    * @param {number} [params.page_limit] - The number of records to return in each page of results.
    * @param {boolean} [params.include_count] - Whether to include information about the number of records returned.
    * @param {string} [params.sort] - The attribute by which returned entity value synonyms will be sorted. To reverse
    * the sort order, prefix the value with a minus sign (`-`).
    * @param {string} [params.cursor] - A token identifying the page of results to retrieve.
    * @param {boolean} [params.include_audit] - Whether to include the audit properties (`created` and `updated`
    * timestamps) in the response.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listSynonyms(params: ListSynonymsParams): js.Promise[_] | Unit = js.native
  def listSynonyms(params: ListSynonymsParams, callback: Callback[SynonymCollection]): js.Promise[_] | Unit = js.native
  /**
    * List entity values.
    *
    * List the values for an entity.
    *
    * This operation is limited to 2500 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.entity - The name of the entity.
    * @param {boolean} [params._export] - Whether to include all element content in the returned data. If
    * **export**=`false`, the returned data includes only information about the element itself. If **export**=`true`, all
    * content, including subelements, is included.
    * @param {number} [params.page_limit] - The number of records to return in each page of results.
    * @param {boolean} [params.include_count] - Whether to include information about the number of records returned.
    * @param {string} [params.sort] - The attribute by which returned entity values will be sorted. To reverse the sort
    * order, prefix the value with a minus sign (`-`).
    * @param {string} [params.cursor] - A token identifying the page of results to retrieve.
    * @param {boolean} [params.include_audit] - Whether to include the audit properties (`created` and `updated`
    * timestamps) in the response.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listValues(params: ListValuesParams): js.Promise[_] | Unit = js.native
  def listValues(params: ListValuesParams, callback: Callback[ValueCollection]): js.Promise[_] | Unit = js.native
  /**
    * List workspaces.
    *
    * List the workspaces associated with a Watson Assistant service instance.
    *
    * This operation is limited to 500 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} [params] - The parameters to send to the service.
    * @param {number} [params.page_limit] - The number of records to return in each page of results.
    * @param {boolean} [params.include_count] - Whether to include information about the number of records returned.
    * @param {string} [params.sort] - The attribute by which returned workspaces will be sorted. To reverse the sort
    * order, prefix the value with a minus sign (`-`).
    * @param {string} [params.cursor] - A token identifying the page of results to retrieve.
    * @param {boolean} [params.include_audit] - Whether to include the audit properties (`created` and `updated`
    * timestamps) in the response.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def listWorkspaces(): js.Promise[_] | Unit = js.native
  def listWorkspaces(params: ListWorkspacesParams): js.Promise[_] | Unit = js.native
  def listWorkspaces(params: ListWorkspacesParams, callback: Callback[WorkspaceCollection]): js.Promise[_] | Unit = js.native
  /*************************
    * message
    ************************/
  /**
    * Get response to user input.
    *
    * Send user input to a workspace and receive a response.
    *
    * There is no rate limit for this operation.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {MessageInput} [params.input] - An input object that includes the input text.
    * @param {RuntimeIntent[]} [params.intents] - Intents to use when evaluating the user input. Include intents from the
    * previous response to continue using those intents rather than trying to recognize intents in the new input.
    * @param {RuntimeEntity[]} [params.entities] - Entities to use when evaluating the message. Include entities from the
    * previous response to continue using those entities rather than detecting entities in the new input.
    * @param {boolean} [params.alternate_intents] - Whether to return more than one intent. A value of `true` indicates
    * that all matching intents are returned.
    * @param {Context} [params.context] - State information for the conversation. To maintain state, include the context
    * from the previous response.
    * @param {OutputData} [params.output] - An output object that includes the response to the user, the dialog nodes
    * that were triggered, and messages from the log.
    * @param {boolean} [params.nodes_visited_details] - Whether to include additional diagnostic information about the
    * dialog nodes that were visited during processing of the message.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def message(params: MessageParams): js.Promise[_] | Unit = js.native
  def message(params: MessageParams, callback: Callback[MessageResponse]): js.Promise[_] | Unit = js.native
  /**
    * Update counterexample.
    *
    * Update the text of a counterexample. Counterexamples are examples that have been marked as irrelevant input.
    *
    * This operation is limited to 1000 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.text - The text of a user input counterexample (for example, `What are you wearing?`).
    * @param {string} [params.new_text] - The text of a user input marked as irrelevant input. This string must conform
    * to the following restrictions:
    * - It cannot contain carriage return, newline, or tab characters
    * - It cannot consist of only whitespace characters
    * - It must be no longer than 1024 characters.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def updateCounterexample(params: UpdateCounterexampleParams): js.Promise[_] | Unit = js.native
  def updateCounterexample(params: UpdateCounterexampleParams, callback: Callback[Counterexample]): js.Promise[_] | Unit = js.native
  /**
    * Update dialog node.
    *
    * Update an existing dialog node with new or modified data.
    *
    * This operation is limited to 500 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.dialog_node - The dialog node ID (for example, `get_order`).
    * @param {string} [params.new_dialog_node] - The dialog node ID. This string must conform to the following
    * restrictions:
    * - It can contain only Unicode alphanumeric, space, underscore, hyphen, and dot characters.
    * - It must be no longer than 1024 characters.
    * @param {string} [params.new_description] - The description of the dialog node. This string cannot contain carriage
    * return, newline, or tab characters, and it must be no longer than 128 characters.
    * @param {string} [params.new_conditions] - The condition that will trigger the dialog node. This string cannot
    * contain carriage return, newline, or tab characters, and it must be no longer than 2048 characters.
    * @param {string} [params.new_parent] - The ID of the parent dialog node. This property is omitted if the dialog node
    * has no parent.
    * @param {string} [params.new_previous_sibling] - The ID of the previous sibling dialog node. This property is
    * omitted if the dialog node has no previous sibling.
    * @param {DialogNodeOutput} [params.new_output] - The output of the dialog node. For more information about how to
    * specify dialog node output, see the
    * [documentation](https://cloud.ibm.com/docs/services/assistant/dialog-overview.html#dialog-overview-responses).
    * @param {Object} [params.new_context] - The context for the dialog node.
    * @param {Object} [params.new_metadata] - The metadata for the dialog node.
    * @param {DialogNodeNextStep} [params.new_next_step] - The next step to execute following this dialog node.
    * @param {string} [params.new_title] - The alias used to identify the dialog node. This string must conform to the
    * following restrictions:
    * - It can contain only Unicode alphanumeric, space, underscore, hyphen, and dot characters.
    * - It must be no longer than 64 characters.
    * @param {string} [params.new_node_type] - How the dialog node is processed.
    * @param {string} [params.new_event_name] - How an `event_handler` node is processed.
    * @param {string} [params.new_variable] - The location in the dialog context where output is stored.
    * @param {DialogNodeAction[]} [params.new_actions] - An array of objects describing any actions to be invoked by the
    * dialog node.
    * @param {string} [params.new_digress_in] - Whether this top-level dialog node can be digressed into.
    * @param {string} [params.new_digress_out] - Whether this dialog node can be returned to after a digression.
    * @param {string} [params.new_digress_out_slots] - Whether the user can digress to top-level nodes while filling out
    * slots.
    * @param {string} [params.new_user_label] - A label that can be displayed externally to describe the purpose of the
    * node to users. This string must be no longer than 512 characters.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def updateDialogNode(params: UpdateDialogNodeParams): js.Promise[_] | Unit = js.native
  def updateDialogNode(params: UpdateDialogNodeParams, callback: Callback[DialogNode]): js.Promise[_] | Unit = js.native
  /**
    * Update entity.
    *
    * Update an existing entity with new or modified data. You must provide component objects defining the content of the
    * updated entity.
    *
    * This operation is limited to 1000 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.entity - The name of the entity.
    * @param {string} [params.new_entity] - The name of the entity. This string must conform to the following
    * restrictions:
    * - It can contain only Unicode alphanumeric, underscore, and hyphen characters.
    * - It cannot begin with the reserved prefix `sys-`.
    * - It must be no longer than 64 characters.
    * @param {string} [params.new_description] - The description of the entity. This string cannot contain carriage
    * return, newline, or tab characters, and it must be no longer than 128 characters.
    * @param {Object} [params.new_metadata] - Any metadata related to the entity.
    * @param {boolean} [params.new_fuzzy_match] - Whether to use fuzzy matching for the entity.
    * @param {CreateValue[]} [params.new_values] - An array of objects describing the entity values.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def updateEntity(params: UpdateEntityParams): js.Promise[_] | Unit = js.native
  def updateEntity(params: UpdateEntityParams, callback: Callback[Entity]): js.Promise[_] | Unit = js.native
  /**
    * Update user input example.
    *
    * Update the text of a user input example.
    *
    * This operation is limited to 1000 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.intent - The intent name.
    * @param {string} params.text - The text of the user input example.
    * @param {string} [params.new_text] - The text of the user input example. This string must conform to the following
    * restrictions:
    * - It cannot contain carriage return, newline, or tab characters.
    * - It cannot consist of only whitespace characters.
    * - It must be no longer than 1024 characters.
    * @param {Mention[]} [params.new_mentions] - An array of contextual entity mentions.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def updateExample(params: UpdateExampleParams): js.Promise[_] | Unit = js.native
  def updateExample(params: UpdateExampleParams, callback: Callback[Example]): js.Promise[_] | Unit = js.native
  /**
    * Update intent.
    *
    * Update an existing intent with new or modified data. You must provide component objects defining the content of the
    * updated intent.
    *
    * This operation is limited to 2000 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.intent - The intent name.
    * @param {string} [params.new_intent] - The name of the intent. This string must conform to the following
    * restrictions:
    * - It can contain only Unicode alphanumeric, underscore, hyphen, and dot characters.
    * - It cannot begin with the reserved prefix `sys-`.
    * - It must be no longer than 128 characters.
    * @param {string} [params.new_description] - The description of the intent. This string cannot contain carriage
    * return, newline, or tab characters, and it must be no longer than 128 characters.
    * @param {Example[]} [params.new_examples] - An array of user input examples for the intent.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def updateIntent(params: UpdateIntentParams): js.Promise[_] | Unit = js.native
  def updateIntent(params: UpdateIntentParams, callback: Callback[Intent]): js.Promise[_] | Unit = js.native
  /**
    * Update entity value synonym.
    *
    * Update an existing entity value synonym with new text.
    *
    * This operation is limited to 1000 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.entity - The name of the entity.
    * @param {string} params.value - The text of the entity value.
    * @param {string} params.synonym - The text of the synonym.
    * @param {string} [params.new_synonym] - The text of the synonym. This string must conform to the following
    * restrictions:
    * - It cannot contain carriage return, newline, or tab characters.
    * - It cannot consist of only whitespace characters.
    * - It must be no longer than 64 characters.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def updateSynonym(params: UpdateSynonymParams): js.Promise[_] | Unit = js.native
  def updateSynonym(params: UpdateSynonymParams, callback: Callback[Synonym]): js.Promise[_] | Unit = js.native
  /**
    * Update entity value.
    *
    * Update an existing entity value with new or modified data. You must provide component objects defining the content
    * of the updated entity value.
    *
    * This operation is limited to 1000 requests per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} params.entity - The name of the entity.
    * @param {string} params.value - The text of the entity value.
    * @param {string} [params.new_value] - The text of the entity value. This string must conform to the following
    * restrictions:
    * - It cannot contain carriage return, newline, or tab characters.
    * - It cannot consist of only whitespace characters.
    * - It must be no longer than 64 characters.
    * @param {Object} [params.new_metadata] - Any metadata related to the entity value.
    * @param {string} [params.new_value_type] - Specifies the type of entity value.
    * @param {string[]} [params.new_synonyms] - An array of synonyms for the entity value. A value can specify either
    * synonyms or patterns (depending on the value type), but not both. A synonym must conform to the following
    * resrictions:
    * - It cannot contain carriage return, newline, or tab characters.
    * - It cannot consist of only whitespace characters.
    * - It must be no longer than 64 characters.
    * @param {string[]} [params.new_patterns] - An array of patterns for the entity value. A value can specify either
    * synonyms or patterns (depending on the value type), but not both. A pattern is a regular expression no longer than
    * 512 characters. For more information about how to specify a pattern, see the
    * [documentation](https://cloud.ibm.com/docs/services/assistant/entities.html#entities-create-dictionary-based).
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def updateValue(params: UpdateValueParams): js.Promise[_] | Unit = js.native
  def updateValue(params: UpdateValueParams, callback: Callback[Value]): js.Promise[_] | Unit = js.native
  /**
    * Update workspace.
    *
    * Update an existing workspace with new or modified data. You must provide component objects defining the content of
    * the updated workspace.
    *
    * This operation is limited to 30 request per 30 minutes. For more information, see **Rate limiting**.
    *
    * @param {Object} params - The parameters to send to the service.
    * @param {string} params.workspace_id - Unique identifier of the workspace.
    * @param {string} [params.name] - The name of the workspace. This string cannot contain carriage return, newline, or
    * tab characters, and it must be no longer than 64 characters.
    * @param {string} [params.description] - The description of the workspace. This string cannot contain carriage
    * return, newline, or tab characters, and it must be no longer than 128 characters.
    * @param {string} [params.language] - The language of the workspace.
    * @param {Object} [params.metadata] - Any metadata related to the workspace.
    * @param {boolean} [params.learning_opt_out] - Whether training data from the workspace (including artifacts such as
    * intents and entities) can be used by IBM for general service improvements. `true` indicates that workspace training
    * data is not to be used.
    * @param {WorkspaceSystemSettings} [params.system_settings] - Global settings for the workspace.
    * @param {CreateIntent[]} [params.intents] - An array of objects defining the intents for the workspace.
    * @param {CreateEntity[]} [params.entities] - An array of objects describing the entities for the workspace.
    * @param {DialogNode[]} [params.dialog_nodes] - An array of objects describing the dialog nodes in the workspace.
    * @param {Counterexample[]} [params.counterexamples] - An array of objects defining input examples that have been
    * marked as irrelevant input.
    * @param {boolean} [params.append] - Whether the new data is to be appended to the existing data in the workspace. If
    * **append**=`false`, elements included in the new data completely replace the corresponding existing elements,
    * including all subelements. For example, if the new data includes **entities** and **append**=`false`, all existing
    * entities in the workspace are discarded and replaced with the new entities.
    *
    * If **append**=`true`, existing elements are preserved, and the new elements are added. If any elements in the new
    * data collide with existing elements, the update request fails.
    * @param {Object} [params.headers] - Custom request headers
    * @param {Function} [callback] - The callback that handles the response.
    * @returns {Promise<any>|void}
    */
  def updateWorkspace(params: UpdateWorkspaceParams): js.Promise[_] | Unit = js.native
  def updateWorkspace(params: UpdateWorkspaceParams, callback: Callback[Workspace]): js.Promise[_] | Unit = js.native
}

