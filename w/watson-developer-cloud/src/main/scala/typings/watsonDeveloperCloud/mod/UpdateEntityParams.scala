package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `updateEntity` operation. */
@js.native
trait UpdateEntityParams extends StObject {
  
  /** The name of the entity. */
  var entity: String = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  /** The description of the entity. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var new_description: js.UndefOr[String] = js.native
  
  /** The name of the entity. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, underscore, and hyphen characters. - It cannot begin with the reserved prefix `sys-`. - It must be no longer than 64 characters. */
  var new_entity: js.UndefOr[String] = js.native
  
  /** Whether to use fuzzy matching for the entity. */
  var new_fuzzy_match: js.UndefOr[Boolean] = js.native
  
  /** Any metadata related to the entity. */
  var new_metadata: js.UndefOr[js.Object] = js.native
  
  /** An array of objects describing the entity values. */
  var new_values: js.UndefOr[js.Array[CreateValue]] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
  
  /** Unique identifier of the workspace. */
  var workspace_id: String = js.native
}
object UpdateEntityParams {
  
  @scala.inline
  def apply(entity: String, workspace_id: String): UpdateEntityParams = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEntityParams]
  }
  
  @scala.inline
  implicit class UpdateEntityParamsMutableBuilder[Self <: UpdateEntityParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setNew_description(value: String): Self = StObject.set(x, "new_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_descriptionUndefined: Self = StObject.set(x, "new_description", js.undefined)
    
    @scala.inline
    def setNew_entity(value: String): Self = StObject.set(x, "new_entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_entityUndefined: Self = StObject.set(x, "new_entity", js.undefined)
    
    @scala.inline
    def setNew_fuzzy_match(value: Boolean): Self = StObject.set(x, "new_fuzzy_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_fuzzy_matchUndefined: Self = StObject.set(x, "new_fuzzy_match", js.undefined)
    
    @scala.inline
    def setNew_metadata(value: js.Object): Self = StObject.set(x, "new_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_metadataUndefined: Self = StObject.set(x, "new_metadata", js.undefined)
    
    @scala.inline
    def setNew_values(value: js.Array[CreateValue]): Self = StObject.set(x, "new_values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_valuesUndefined: Self = StObject.set(x, "new_values", js.undefined)
    
    @scala.inline
    def setNew_valuesVarargs(value: CreateValue*): Self = StObject.set(x, "new_values", js.Array(value :_*))
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    @scala.inline
    def setWorkspace_id(value: String): Self = StObject.set(x, "workspace_id", value.asInstanceOf[js.Any])
  }
}
