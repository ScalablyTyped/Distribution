package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Synonym. */
@js.native
trait Synonym extends StObject {
  
  /** The timestamp for creation of the object. */
  var created: js.UndefOr[String] = js.native
  
  /** The text of the synonym. This string must conform to the following restrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 64 characters. */
  var synonym: String = js.native
  
  /** The timestamp for the most recent update to the object. */
  var updated: js.UndefOr[String] = js.native
}
object Synonym {
  
  @scala.inline
  def apply(synonym: String): Synonym = {
    val __obj = js.Dynamic.literal(synonym = synonym.asInstanceOf[js.Any])
    __obj.asInstanceOf[Synonym]
  }
  
  @scala.inline
  implicit class SynonymMutableBuilder[Self <: Synonym] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setSynonym(value: String): Self = StObject.set(x, "synonym", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
