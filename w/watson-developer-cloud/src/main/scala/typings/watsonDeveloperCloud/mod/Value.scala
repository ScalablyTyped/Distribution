package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Value. */
@js.native
trait Value extends js.Object {
  
  /** The timestamp for creation of the object. */
  var created: js.UndefOr[String] = js.native
  
  /** Any metadata related to the entity value. */
  var metadata: js.UndefOr[js.Object] = js.native
  
  /** An array of patterns for the entity value. A value can specify either synonyms or patterns (depending on the value type), but not both. A pattern is a regular expression no longer than 512 characters. For more information about how to specify a pattern, see the [documentation](https://cloud.ibm.com/docs/services/assistant/entities.html#entities-create-dictionary-based). */
  var patterns: js.UndefOr[js.Array[String]] = js.native
  
  /** An array of synonyms for the entity value. A value can specify either synonyms or patterns (depending on the value type), but not both. A synonym must conform to the following resrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 64 characters. */
  var synonyms: js.UndefOr[js.Array[String]] = js.native
  
  /** The timestamp for the most recent update to the object. */
  var updated: js.UndefOr[String] = js.native
  
  /** The text of the entity value. This string must conform to the following restrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 64 characters. */
  var value: String = js.native
  
  /** Specifies the type of entity value. */
  var value_type: String = js.native
}
object Value {
  
  @scala.inline
  def apply(value: String, value_type: String): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], value_type = value_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueOps[Self <: Value] (val x: Self) extends AnyVal {
    
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue_type(value: String): Self = this.set("value_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Object): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setPatternsVarargs(value: String*): Self = this.set("patterns", js.Array(value :_*))
    
    @scala.inline
    def setPatterns(value: js.Array[String]): Self = this.set("patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatterns: Self = this.set("patterns", js.undefined)
    
    @scala.inline
    def setSynonymsVarargs(value: String*): Self = this.set("synonyms", js.Array(value :_*))
    
    @scala.inline
    def setSynonyms(value: js.Array[String]): Self = this.set("synonyms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynonyms: Self = this.set("synonyms", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
}
