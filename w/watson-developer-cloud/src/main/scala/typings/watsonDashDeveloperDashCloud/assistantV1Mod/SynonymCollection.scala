package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SynonymCollection. */
trait SynonymCollection extends js.Object {
  /** The pagination data for the returned objects. */
  var pagination: Pagination
  /** An array of synonyms. */
  var synonyms: js.Array[Synonym]
}

object SynonymCollection {
  @scala.inline
  def apply(pagination: Pagination, synonyms: js.Array[Synonym]): SynonymCollection = {
    val __obj = js.Dynamic.literal(pagination = pagination, synonyms = synonyms)
  
    __obj.asInstanceOf[SynonymCollection]
  }
}

