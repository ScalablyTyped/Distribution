package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object containing Entity query response information. */
@js.native
trait QueryEntitiesResponseItem extends StObject {
  
  /** List of different evidentiary items to support the result. */
  var evidence: js.UndefOr[js.Array[QueryEvidence]] = js.native
  
  /** Entity text content. */
  var text: js.UndefOr[String] = js.native
  
  /** The type of the result entity. */
  var `type`: js.UndefOr[String] = js.native
}
object QueryEntitiesResponseItem {
  
  @scala.inline
  def apply(): QueryEntitiesResponseItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryEntitiesResponseItem]
  }
  
  @scala.inline
  implicit class QueryEntitiesResponseItemMutableBuilder[Self <: QueryEntitiesResponseItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvidence(value: js.Array[QueryEvidence]): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvidenceUndefined: Self = StObject.set(x, "evidence", js.undefined)
    
    @scala.inline
    def setEvidenceVarargs(value: QueryEvidence*): Self = StObject.set(x, "evidence", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
