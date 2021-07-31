package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Workspace. */
trait Workspace extends StObject {
  
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
  def apply(language: String, learning_opt_out: Boolean, name: String, workspace_id: String): Workspace = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], learning_opt_out = learning_opt_out.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workspace]
  }
  
  @scala.inline
  implicit class WorkspaceMutableBuilder[Self <: Workspace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCounterexamples(value: js.Array[Counterexample]): Self = StObject.set(x, "counterexamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterexamplesUndefined: Self = StObject.set(x, "counterexamples", js.undefined)
    
    @scala.inline
    def setCounterexamplesVarargs(value: Counterexample*): Self = StObject.set(x, "counterexamples", js.Array(value :_*))
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDialog_nodes(value: js.Array[DialogNode]): Self = StObject.set(x, "dialog_nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialog_nodesUndefined: Self = StObject.set(x, "dialog_nodes", js.undefined)
    
    @scala.inline
    def setDialog_nodesVarargs(value: DialogNode*): Self = StObject.set(x, "dialog_nodes", js.Array(value :_*))
    
    @scala.inline
    def setEntities(value: js.Array[Entity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setIntents(value: js.Array[Intent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    @scala.inline
    def setIntentsVarargs(value: Intent*): Self = StObject.set(x, "intents", js.Array(value :_*))
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLearning_opt_out(value: Boolean): Self = StObject.set(x, "learning_opt_out", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSystem_settings(value: WorkspaceSystemSettings): Self = StObject.set(x, "system_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem_settingsUndefined: Self = StObject.set(x, "system_settings", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    @scala.inline
    def setWorkspace_id(value: String): Self = StObject.set(x, "workspace_id", value.asInstanceOf[js.Any])
  }
}
