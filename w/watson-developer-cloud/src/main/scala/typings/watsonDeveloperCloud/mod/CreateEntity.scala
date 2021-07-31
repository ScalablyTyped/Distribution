package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** CreateEntity. */
trait CreateEntity extends StObject {
  
  /** The timestamp for creation of the object. */
  var created: js.UndefOr[String] = js.undefined
  
  /** The description of the entity. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The name of the entity. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, underscore, and hyphen characters. - It must be no longer than 64 characters. If you specify an entity name beginning with the reserved prefix `sys-`, it must be the name of a system entity that you want to enable. (Any entity content specified with the request is ignored.). */
  var entity: String
  
  /** Whether to use fuzzy matching for the entity. */
  var fuzzy_match: js.UndefOr[Boolean] = js.undefined
  
  /** Any metadata related to the entity. */
  var metadata: js.UndefOr[js.Object] = js.undefined
  
  /** The timestamp for the most recent update to the object. */
  var updated: js.UndefOr[String] = js.undefined
  
  /** An array of objects describing the entity values. */
  var values: js.UndefOr[js.Array[CreateValue]] = js.undefined
}
object CreateEntity {
  
  @scala.inline
  def apply(entity: String): CreateEntity = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEntity]
  }
  
  @scala.inline
  implicit class CreateEntityMutableBuilder[Self <: CreateEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
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
    def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[CreateValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: CreateValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
