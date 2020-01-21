package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returns high-level concepts in the content. For example, a research paper about deep learning might return the concept, "Artificial Intelligence" although the term is not mentioned. Supported languages: English, French, German, Italian, Japanese, Korean, Portuguese, Spanish. */
trait ConceptsOptions extends js.Object {
  /** Maximum number of concepts to return. */
  var limit: js.UndefOr[Double] = js.undefined
}

object ConceptsOptions {
  @scala.inline
  def apply(limit: Int | Double = null): ConceptsOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConceptsOptions]
  }
}

