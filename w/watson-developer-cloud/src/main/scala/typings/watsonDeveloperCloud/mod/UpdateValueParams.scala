package typings.watsonDeveloperCloud.mod

import typings.watsonDeveloperCloud.mod.UpdateValueConstants.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `updateValue` operation. */
trait UpdateValueParams extends StObject {
  
  /** The name of the entity. */
  var entity: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** Any metadata related to the entity value. */
  var new_metadata: js.UndefOr[js.Object] = js.undefined
  
  /** An array of patterns for the entity value. A value can specify either synonyms or patterns (depending on the value type), but not both. A pattern is a regular expression no longer than 512 characters. For more information about how to specify a pattern, see the [documentation](https://cloud.ibm.com/docs/services/assistant/entities.html#entities-create-dictionary-based). */
  var new_patterns: js.UndefOr[js.Array[String]] = js.undefined
  
  /** An array of synonyms for the entity value. A value can specify either synonyms or patterns (depending on the value type), but not both. A synonym must conform to the following resrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 64 characters. */
  var new_synonyms: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The text of the entity value. This string must conform to the following restrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 64 characters. */
  var new_value: js.UndefOr[String] = js.undefined
  
  /** Specifies the type of entity value. */
  var new_value_type: js.UndefOr[ValueType | String] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** The text of the entity value. */
  var value: String
  
  /** Unique identifier of the workspace. */
  var workspace_id: String
}
object UpdateValueParams {
  
  inline def apply(entity: String, value: String, workspace_id: String): UpdateValueParams = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateValueParams]
  }
  
  extension [Self <: UpdateValueParams](x: Self) {
    
    inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setNew_metadata(value: js.Object): Self = StObject.set(x, "new_metadata", value.asInstanceOf[js.Any])
    
    inline def setNew_metadataUndefined: Self = StObject.set(x, "new_metadata", js.undefined)
    
    inline def setNew_patterns(value: js.Array[String]): Self = StObject.set(x, "new_patterns", value.asInstanceOf[js.Any])
    
    inline def setNew_patternsUndefined: Self = StObject.set(x, "new_patterns", js.undefined)
    
    inline def setNew_patternsVarargs(value: String*): Self = StObject.set(x, "new_patterns", js.Array(value :_*))
    
    inline def setNew_synonyms(value: js.Array[String]): Self = StObject.set(x, "new_synonyms", value.asInstanceOf[js.Any])
    
    inline def setNew_synonymsUndefined: Self = StObject.set(x, "new_synonyms", js.undefined)
    
    inline def setNew_synonymsVarargs(value: String*): Self = StObject.set(x, "new_synonyms", js.Array(value :_*))
    
    inline def setNew_value(value: String): Self = StObject.set(x, "new_value", value.asInstanceOf[js.Any])
    
    inline def setNew_valueUndefined: Self = StObject.set(x, "new_value", js.undefined)
    
    inline def setNew_value_type(value: ValueType | String): Self = StObject.set(x, "new_value_type", value.asInstanceOf[js.Any])
    
    inline def setNew_value_typeUndefined: Self = StObject.set(x, "new_value_type", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setWorkspace_id(value: String): Self = StObject.set(x, "workspace_id", value.asInstanceOf[js.Any])
  }
}
