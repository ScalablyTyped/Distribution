package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `updateWorkspace` operation. */
trait UpdateWorkspaceParams extends js.Object {
  /** Whether the new data is to be appended to the existing data in the workspace. If **append**=`false`, elements included in the new data completely replace the corresponding existing elements, including all subelements. For example, if the new data includes **entities** and **append**=`false`, all existing entities in the workspace are discarded and replaced with the new entities. If **append**=`true`, existing elements are preserved, and the new elements are added. If any elements in the new data collide with existing elements, the update request fails. */
  var append: js.UndefOr[Boolean] = js.undefined
  /** An array of objects defining input examples that have been marked as irrelevant input. */
  var counterexamples: js.UndefOr[js.Array[Counterexample]] = js.undefined
  /** The description of the workspace. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var description: js.UndefOr[String] = js.undefined
  /** An array of objects describing the dialog nodes in the workspace. */
  var dialog_nodes: js.UndefOr[js.Array[DialogNode]] = js.undefined
  /** An array of objects describing the entities for the workspace. */
  var entities: js.UndefOr[js.Array[CreateEntity]] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  /** An array of objects defining the intents for the workspace. */
  var intents: js.UndefOr[js.Array[CreateIntent]] = js.undefined
  /** The language of the workspace. */
  var language: js.UndefOr[String] = js.undefined
  /** Whether training data from the workspace (including artifacts such as intents and entities) can be used by IBM for general service improvements. `true` indicates that workspace training data is not to be used. */
  var learning_opt_out: js.UndefOr[Boolean] = js.undefined
  /** Any metadata related to the workspace. */
  var metadata: js.UndefOr[js.Object] = js.undefined
  /** The name of the workspace. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 64 characters. */
  var name: js.UndefOr[String] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** Global settings for the workspace. */
  var system_settings: js.UndefOr[WorkspaceSystemSettings] = js.undefined
  /** Unique identifier of the workspace. */
  var workspace_id: String
}

object UpdateWorkspaceParams {
  @scala.inline
  def apply(
    workspace_id: String,
    append: js.UndefOr[Boolean] = js.undefined,
    counterexamples: js.Array[Counterexample] = null,
    description: String = null,
    dialog_nodes: js.Array[DialogNode] = null,
    entities: js.Array[CreateEntity] = null,
    headers: js.Object = null,
    intents: js.Array[CreateIntent] = null,
    language: String = null,
    learning_opt_out: js.UndefOr[Boolean] = js.undefined,
    metadata: js.Object = null,
    name: String = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    system_settings: WorkspaceSystemSettings = null
  ): UpdateWorkspaceParams = {
    val __obj = js.Dynamic.literal(workspace_id = workspace_id.asInstanceOf[js.Any])
    if (!js.isUndefined(append)) __obj.updateDynamic("append")(append.asInstanceOf[js.Any])
    if (counterexamples != null) __obj.updateDynamic("counterexamples")(counterexamples.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dialog_nodes != null) __obj.updateDynamic("dialog_nodes")(dialog_nodes.asInstanceOf[js.Any])
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (intents != null) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(learning_opt_out)) __obj.updateDynamic("learning_opt_out")(learning_opt_out.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    if (system_settings != null) __obj.updateDynamic("system_settings")(system_settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkspaceParams]
  }
}

