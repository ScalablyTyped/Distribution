package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returns a five-level taxonomy of the content. The top three categories are returned. Supported languages: Arabic, English, French, German, Italian, Japanese, Korean, Portuguese, Spanish. */
trait CategoriesOptions extends js.Object {
  /** Maximum number of categories to return. */
  var limit: js.UndefOr[Double] = js.undefined
  /** Enter a [custom model](https://cloud.ibm.com/docs/services/natural-language-understanding/customizing.html) ID to override the standard categories model. */
  var model: js.UndefOr[String] = js.undefined
}

object CategoriesOptions {
  @scala.inline
  def apply(limit: Int | Double = null, model: String = null): CategoriesOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoriesOptions]
  }
}

