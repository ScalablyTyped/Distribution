package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Identifies people, cities, organizations, and other entities in the content. See [Entity types and subtypes](https://cloud.ibm.com/docs/services/natural-language-understanding/entity-types.html). Supported languages: English, French, German, Italian, Japanese, Korean, Portuguese, Russian, Spanish, Swedish. Arabic, Chinese, and Dutch are supported only through custom models. */
@js.native
trait EntitiesOptions extends js.Object {
  /** Set this to `true` to analyze emotion for detected keywords. */
  var emotion: js.UndefOr[Boolean] = js.native
  /** Maximum number of entities to return. */
  var limit: js.UndefOr[Double] = js.native
  /** Set this to `true` to return locations of entity mentions. */
  var mentions: js.UndefOr[Boolean] = js.native
  /** Enter a [custom model](https://cloud.ibm.com/docs/services/natural-language-understanding/customizing.html) ID to override the standard entity detection model. */
  var model: js.UndefOr[String] = js.native
  /** Set this to `true` to return sentiment information for detected entities. */
  var sentiment: js.UndefOr[Boolean] = js.native
}

object EntitiesOptions {
  @scala.inline
  def apply(): EntitiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntitiesOptions]
  }
  @scala.inline
  implicit class EntitiesOptionsOps[Self <: EntitiesOptions] (val x: Self) extends AnyVal {
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
    def setEmotion(value: Boolean): Self = this.set("emotion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmotion: Self = this.set("emotion", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setMentions(value: Boolean): Self = this.set("mentions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMentions: Self = this.set("mentions", js.undefined)
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setSentiment(value: Boolean): Self = this.set("sentiment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentiment: Self = this.set("sentiment", js.undefined)
  }
  
}

