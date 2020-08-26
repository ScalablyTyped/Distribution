package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `updateWorkspace` operation. */
@js.native
trait UpdateWorkspaceParams extends js.Object {
  /** Whether the new data is to be appended to the existing data in the workspace. If **append**=`false`, elements included in the new data completely replace the corresponding existing elements, including all subelements. For example, if the new data includes **entities** and **append**=`false`, all existing entities in the workspace are discarded and replaced with the new entities. If **append**=`true`, existing elements are preserved, and the new elements are added. If any elements in the new data collide with existing elements, the update request fails. */
  var append: js.UndefOr[Boolean] = js.native
  /** An array of objects defining input examples that have been marked as irrelevant input. */
  var counterexamples: js.UndefOr[js.Array[Counterexample]] = js.native
  /** The description of the workspace. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var description: js.UndefOr[String] = js.native
  /** An array of objects describing the dialog nodes in the workspace. */
  var dialog_nodes: js.UndefOr[js.Array[DialogNode]] = js.native
  /** An array of objects describing the entities for the workspace. */
  var entities: js.UndefOr[js.Array[CreateEntity]] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** An array of objects defining the intents for the workspace. */
  var intents: js.UndefOr[js.Array[CreateIntent]] = js.native
  /** The language of the workspace. */
  var language: js.UndefOr[String] = js.native
  /** Whether training data from the workspace (including artifacts such as intents and entities) can be used by IBM for general service improvements. `true` indicates that workspace training data is not to be used. */
  var learning_opt_out: js.UndefOr[Boolean] = js.native
  /** Any metadata related to the workspace. */
  var metadata: js.UndefOr[js.Object] = js.native
  /** The name of the workspace. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 64 characters. */
  var name: js.UndefOr[String] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** Global settings for the workspace. */
  var system_settings: js.UndefOr[WorkspaceSystemSettings] = js.native
  /** Unique identifier of the workspace. */
  var workspace_id: String = js.native
}

object UpdateWorkspaceParams {
  @scala.inline
  def apply(workspace_id: String): UpdateWorkspaceParams = {
    val __obj = js.Dynamic.literal(workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkspaceParams]
  }
  @scala.inline
  implicit class UpdateWorkspaceParamsOps[Self <: UpdateWorkspaceParams] (val x: Self) extends AnyVal {
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
    def setWorkspace_id(value: String): Self = this.set("workspace_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppend(value: Boolean): Self = this.set("append", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppend: Self = this.set("append", js.undefined)
    @scala.inline
    def setCounterexamplesVarargs(value: Counterexample*): Self = this.set("counterexamples", js.Array(value :_*))
    @scala.inline
    def setCounterexamples(value: js.Array[Counterexample]): Self = this.set("counterexamples", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCounterexamples: Self = this.set("counterexamples", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDialog_nodesVarargs(value: DialogNode*): Self = this.set("dialog_nodes", js.Array(value :_*))
    @scala.inline
    def setDialog_nodes(value: js.Array[DialogNode]): Self = this.set("dialog_nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialog_nodes: Self = this.set("dialog_nodes", js.undefined)
    @scala.inline
    def setEntitiesVarargs(value: CreateEntity*): Self = this.set("entities", js.Array(value :_*))
    @scala.inline
    def setEntities(value: js.Array[CreateEntity]): Self = this.set("entities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setIntentsVarargs(value: CreateIntent*): Self = this.set("intents", js.Array(value :_*))
    @scala.inline
    def setIntents(value: js.Array[CreateIntent]): Self = this.set("intents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntents: Self = this.set("intents", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLearning_opt_out(value: Boolean): Self = this.set("learning_opt_out", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLearning_opt_out: Self = this.set("learning_opt_out", js.undefined)
    @scala.inline
    def setMetadata(value: js.Object): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
    @scala.inline
    def setSystem_settings(value: WorkspaceSystemSettings): Self = this.set("system_settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystem_settings: Self = this.set("system_settings", js.undefined)
  }
  
}

