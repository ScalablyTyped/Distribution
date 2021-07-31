package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Value. */
trait Value extends StObject {
  
  /** The timestamp for creation of the object. */
  var created: js.UndefOr[String] = js.undefined
  
  /** Any metadata related to the entity value. */
  var metadata: js.UndefOr[js.Object] = js.undefined
  
  /** An array of patterns for the entity value. A value can specify either synonyms or patterns (depending on the value type), but not both. A pattern is a regular expression no longer than 512 characters. For more information about how to specify a pattern, see the [documentation](https://cloud.ibm.com/docs/services/assistant/entities.html#entities-create-dictionary-based). */
  var patterns: js.UndefOr[js.Array[String]] = js.undefined
  
  /** An array of synonyms for the entity value. A value can specify either synonyms or patterns (depending on the value type), but not both. A synonym must conform to the following resrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 64 characters. */
  var synonyms: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The timestamp for the most recent update to the object. */
  var updated: js.UndefOr[String] = js.undefined
  
  /** The text of the entity value. This string must conform to the following restrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 64 characters. */
  var value: String
  
  /** Specifies the type of entity value. */
  var value_type: String
}
object Value {
  
  @scala.inline
  def apply(value: String, value_type: String): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], value_type = value_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setPatterns(value: js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternsUndefined: Self = StObject.set(x, "patterns", js.undefined)
    
    @scala.inline
    def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value :_*))
    
    @scala.inline
    def setSynonyms(value: js.Array[String]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
    
    @scala.inline
    def setSynonymsVarargs(value: String*): Self = StObject.set(x, "synonyms", js.Array(value :_*))
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue_type(value: String): Self = StObject.set(x, "value_type", value.asInstanceOf[js.Any])
  }
}
