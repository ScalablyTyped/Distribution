package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashUnderstandingV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A categorization of the analyzed text. */
trait CategoriesResult extends js.Object {
  /** The path to the category through the 5-level taxonomy hierarchy. For the complete list of categories, see the [Categories hierarchy](https://cloud.ibm.com/docs/services/natural-language-understanding/categories.html#categories-hierarchy) documentation. */
  var label: js.UndefOr[String] = js.undefined
  /** Confidence score for the category classification. Higher values indicate greater confidence. */
  var score: js.UndefOr[Double] = js.undefined
}

object CategoriesResult {
  @scala.inline
  def apply(label: String = null, score: Int | Double = null): CategoriesResult = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoriesResult]
  }
}

