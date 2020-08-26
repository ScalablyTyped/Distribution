package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returns a five-level taxonomy of the content. The top three categories are returned. Supported languages: Arabic, English, French, German, Italian, Japanese, Korean, Portuguese, Spanish. */
@js.native
trait CategoriesOptions extends js.Object {
  /** Maximum number of categories to return. */
  var limit: js.UndefOr[Double] = js.native
  /** Enter a [custom model](https://cloud.ibm.com/docs/services/natural-language-understanding/customizing.html) ID to override the standard categories model. */
  var model: js.UndefOr[String] = js.native
}

object CategoriesOptions {
  @scala.inline
  def apply(): CategoriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoriesOptions]
  }
  @scala.inline
  implicit class CategoriesOptionsOps[Self <: CategoriesOptions] (val x: Self) extends AnyVal {
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
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
  }
  
}

