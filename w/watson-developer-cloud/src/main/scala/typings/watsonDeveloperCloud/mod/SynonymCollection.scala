package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SynonymCollection. */
@js.native
trait SynonymCollection extends StObject {
  
  /** The pagination data for the returned objects. */
  var pagination: Pagination = js.native
  
  /** An array of synonyms. */
  var synonyms: js.Array[Synonym] = js.native
}
object SynonymCollection {
  
  @scala.inline
  def apply(pagination: Pagination, synonyms: js.Array[Synonym]): SynonymCollection = {
    val __obj = js.Dynamic.literal(pagination = pagination.asInstanceOf[js.Any], synonyms = synonyms.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynonymCollection]
  }
  
  @scala.inline
  implicit class SynonymCollectionMutableBuilder[Self <: SynonymCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPagination(value: Pagination): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynonyms(value: js.Array[Synonym]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynonymsVarargs(value: Synonym*): Self = StObject.set(x, "synonyms", js.Array(value :_*))
  }
}
