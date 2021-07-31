package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `createEntity` operation. */
trait CreateEntityParams extends StObject {
  
  /** The description of the entity. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The name of the entity. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, underscore, and hyphen characters. - It must be no longer than 64 characters. If you specify an entity name beginning with the reserved prefix `sys-`, it must be the name of a system entity that you want to enable. (Any entity content specified with the request is ignored.). */
  var entity: String
  
  /** Whether to use fuzzy matching for the entity. */
  var fuzzy_match: js.UndefOr[Boolean] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** Any metadata related to the entity. */
  var metadata: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** An array of objects describing the entity values. */
  var values: js.UndefOr[js.Array[CreateValue]] = js.undefined
  
  /** Unique identifier of the workspace. */
  var workspace_id: String
}
object CreateEntityParams {
  
  @scala.inline
  def apply(entity: String, workspace_id: String): CreateEntityParams = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEntityParams]
  }
  
  @scala.inline
  implicit class CreateEntityParamsMutableBuilder[Self <: CreateEntityParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFuzzy_match(value: Boolean): Self = StObject.set(x, "fuzzy_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFuzzy_matchUndefined: Self = StObject.set(x, "fuzzy_match", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[CreateValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: CreateValue*): Self = StObject.set(x, "values", js.Array(value :_*))
    
    @scala.inline
    def setWorkspace_id(value: String): Self = StObject.set(x, "workspace_id", value.asInstanceOf[js.Any])
  }
}
