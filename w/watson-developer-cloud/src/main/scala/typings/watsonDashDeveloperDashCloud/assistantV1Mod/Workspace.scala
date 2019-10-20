package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Workspace. */
trait Workspace extends js.Object {
  /** An array of counterexamples. */
  var counterexamples: js.UndefOr[js.Array[Counterexample]] = js.undefined
  /** The timestamp for creation of the object. */
  var created: js.UndefOr[String] = js.undefined
  /** The description of the workspace. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var description: js.UndefOr[String] = js.undefined
  /** An array of objects describing the dialog nodes in the workspace. */
  var dialog_nodes: js.UndefOr[js.Array[DialogNode]] = js.undefined
  /** An array of objects describing the entities for the workspace. */
  var entities: js.UndefOr[js.Array[Entity]] = js.undefined
  /** An array of intents. */
  var intents: js.UndefOr[js.Array[Intent]] = js.undefined
  /** The language of the workspace. */
  var language: String
  /** Whether training data from the workspace (including artifacts such as intents and entities) can be used by IBM for general service improvements. `true` indicates that workspace training data is not to be used. */
  var learning_opt_out: Boolean
  /** Any metadata related to the workspace. */
  var metadata: js.UndefOr[js.Object] = js.undefined
  /** The name of the workspace. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 64 characters. */
  var name: String
  /** The current status of the workspace. */
  var status: js.UndefOr[String] = js.undefined
  /** Global settings for the workspace. */
  var system_settings: js.UndefOr[WorkspaceSystemSettings] = js.undefined
  /** The timestamp for the most recent update to the object. */
  var updated: js.UndefOr[String] = js.undefined
  /** The workspace ID of the workspace. */
  var workspace_id: String
}

object Workspace {
  @scala.inline
  def apply(
    language: String,
    learning_opt_out: Boolean,
    name: String,
    workspace_id: String,
    counterexamples: js.Array[Counterexample] = null,
    created: String = null,
    description: String = null,
    dialog_nodes: js.Array[DialogNode] = null,
    entities: js.Array[Entity] = null,
    intents: js.Array[Intent] = null,
    metadata: js.Object = null,
    status: String = null,
    system_settings: WorkspaceSystemSettings = null,
    updated: String = null
  ): Workspace = {
    val __obj = js.Dynamic.literal(language = language, learning_opt_out = learning_opt_out, name = name, workspace_id = workspace_id)
    if (counterexamples != null) __obj.updateDynamic("counterexamples")(counterexamples)
    if (created != null) __obj.updateDynamic("created")(created)
    if (description != null) __obj.updateDynamic("description")(description)
    if (dialog_nodes != null) __obj.updateDynamic("dialog_nodes")(dialog_nodes)
    if (entities != null) __obj.updateDynamic("entities")(entities)
    if (intents != null) __obj.updateDynamic("intents")(intents)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (status != null) __obj.updateDynamic("status")(status)
    if (system_settings != null) __obj.updateDynamic("system_settings")(system_settings)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    __obj.asInstanceOf[Workspace]
  }
}

