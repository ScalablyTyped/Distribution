package typings.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `updateEntity` operation. */
trait UpdateEntityParams extends StObject {
  
  /** The name of the entity. */
  var entity: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** The description of the entity. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var new_description: js.UndefOr[String] = js.undefined
  
  /** The name of the entity. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, underscore, and hyphen characters. - It cannot begin with the reserved prefix `sys-`. - It must be no longer than 64 characters. */
  var new_entity: js.UndefOr[String] = js.undefined
  
  /** Whether to use fuzzy matching for the entity. */
  var new_fuzzy_match: js.UndefOr[Boolean] = js.undefined
  
  /** Any metadata related to the entity. */
  var new_metadata: js.UndefOr[js.Object] = js.undefined
  
  /** An array of objects describing the entity values. */
  var new_values: js.UndefOr[js.Array[CreateValue]] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** Unique identifier of the workspace. */
  var workspace_id: String
}
object UpdateEntityParams {
  
  inline def apply(entity: String, workspace_id: String): UpdateEntityParams = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEntityParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateEntityParams] (val x: Self) extends AnyVal {
    
    inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setNew_description(value: String): Self = StObject.set(x, "new_description", value.asInstanceOf[js.Any])
    
    inline def setNew_descriptionUndefined: Self = StObject.set(x, "new_description", js.undefined)
    
    inline def setNew_entity(value: String): Self = StObject.set(x, "new_entity", value.asInstanceOf[js.Any])
    
    inline def setNew_entityUndefined: Self = StObject.set(x, "new_entity", js.undefined)
    
    inline def setNew_fuzzy_match(value: Boolean): Self = StObject.set(x, "new_fuzzy_match", value.asInstanceOf[js.Any])
    
    inline def setNew_fuzzy_matchUndefined: Self = StObject.set(x, "new_fuzzy_match", js.undefined)
    
    inline def setNew_metadata(value: js.Object): Self = StObject.set(x, "new_metadata", value.asInstanceOf[js.Any])
    
    inline def setNew_metadataUndefined: Self = StObject.set(x, "new_metadata", js.undefined)
    
    inline def setNew_values(value: js.Array[CreateValue]): Self = StObject.set(x, "new_values", value.asInstanceOf[js.Any])
    
    inline def setNew_valuesUndefined: Self = StObject.set(x, "new_values", js.undefined)
    
    inline def setNew_valuesVarargs(value: CreateValue*): Self = StObject.set(x, "new_values", js.Array(value*))
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setWorkspace_id(value: String): Self = StObject.set(x, "workspace_id", value.asInstanceOf[js.Any])
  }
}
