package typings.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SynonymCollection. */
trait SynonymCollection extends StObject {
  
  /** The pagination data for the returned objects. */
  var pagination: Pagination
  
  /** An array of synonyms. */
  var synonyms: js.Array[Synonym]
}
object SynonymCollection {
  
  inline def apply(pagination: Pagination, synonyms: js.Array[Synonym]): SynonymCollection = {
    val __obj = js.Dynamic.literal(pagination = pagination.asInstanceOf[js.Any], synonyms = synonyms.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynonymCollection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SynonymCollection] (val x: Self) extends AnyVal {
    
    inline def setPagination(value: Pagination): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    inline def setSynonyms(value: js.Array[Synonym]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    inline def setSynonymsVarargs(value: Synonym*): Self = StObject.set(x, "synonyms", js.Array(value*))
  }
}
