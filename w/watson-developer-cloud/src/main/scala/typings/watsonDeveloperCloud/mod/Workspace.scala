package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Workspace. */
@js.native
trait Workspace extends js.Object {
  
  /** An array of counterexamples. */
  var counterexamples: js.UndefOr[js.Array[Counterexample]] = js.native
  
  /** The timestamp for creation of the object. */
  var created: js.UndefOr[String] = js.native
  
  /** The description of the workspace. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var description: js.UndefOr[String] = js.native
  
  /** An array of objects describing the dialog nodes in the workspace. */
  var dialog_nodes: js.UndefOr[js.Array[DialogNode]] = js.native
  
  /** An array of objects describing the entities for the workspace. */
  var entities: js.UndefOr[js.Array[Entity]] = js.native
  
  /** An array of intents. */
  var intents: js.UndefOr[js.Array[Intent]] = js.native
  
  /** The language of the workspace. */
  var language: String = js.native
  
  /** Whether training data from the workspace (including artifacts such as intents and entities) can be used by IBM for general service improvements. `true` indicates that workspace training data is not to be used. */
  var learning_opt_out: Boolean = js.native
  
  /** Any metadata related to the workspace. */
  var metadata: js.UndefOr[js.Object] = js.native
  
  /** The name of the workspace. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 64 characters. */
  var name: String = js.native
  
  /** The current status of the workspace. */
  var status: js.UndefOr[String] = js.native
  
  /** Global settings for the workspace. */
  var system_settings: js.UndefOr[WorkspaceSystemSettings] = js.native
  
  /** The timestamp for the most recent update to the object. */
  var updated: js.UndefOr[String] = js.native
  
  /** The workspace ID of the workspace. */
  var workspace_id: String = js.native
}
object Workspace {
  
  @scala.inline
  def apply(language: String, learning_opt_out: Boolean, name: String, workspace_id: String): Workspace = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], learning_opt_out = learning_opt_out.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workspace]
  }
  
  @scala.inline
  implicit class WorkspaceOps[Self <: Workspace] (val x: Self) extends AnyVal {
    
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
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLearning_opt_out(value: Boolean): Self = this.set("learning_opt_out", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspace_id(value: String): Self = this.set("workspace_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterexamplesVarargs(value: Counterexample*): Self = this.set("counterexamples", js.Array(value :_*))
    
    @scala.inline
    def setCounterexamples(value: js.Array[Counterexample]): Self = this.set("counterexamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounterexamples: Self = this.set("counterexamples", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
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
    def setEntitiesVarargs(value: Entity*): Self = this.set("entities", js.Array(value :_*))
    
    @scala.inline
    def setEntities(value: js.Array[Entity]): Self = this.set("entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    
    @scala.inline
    def setIntentsVarargs(value: Intent*): Self = this.set("intents", js.Array(value :_*))
    
    @scala.inline
    def setIntents(value: js.Array[Intent]): Self = this.set("intents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntents: Self = this.set("intents", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Object): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSystem_settings(value: WorkspaceSystemSettings): Self = this.set("system_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystem_settings: Self = this.set("system_settings", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
}
