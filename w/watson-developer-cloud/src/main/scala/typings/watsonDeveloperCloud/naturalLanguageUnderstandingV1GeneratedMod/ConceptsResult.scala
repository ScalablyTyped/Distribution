package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The general concepts referenced or alluded to in the analyzed text. */
trait ConceptsResult extends js.Object {
  /** Link to the corresponding DBpedia resource. */
  var dbpedia_resource: js.UndefOr[String] = js.undefined
  /** Relevance score between 0 and 1. Higher scores indicate greater relevance. */
  var relevance: js.UndefOr[Double] = js.undefined
  /** Name of the concept. */
  var text: js.UndefOr[String] = js.undefined
}

object ConceptsResult {
  @scala.inline
  def apply(dbpedia_resource: String = null, relevance: Int | Double = null, text: String = null): ConceptsResult = {
    val __obj = js.Dynamic.literal()
    if (dbpedia_resource != null) __obj.updateDynamic("dbpedia_resource")(dbpedia_resource.asInstanceOf[js.Any])
    if (relevance != null) __obj.updateDynamic("relevance")(relevance.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConceptsResult]
  }
}

