package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returns important keywords in the content. Supported languages: English, French, German, Italian, Japanese, Korean, Portuguese, Russian, Spanish, Swedish. */
@js.native
trait KeywordsOptions extends js.Object {
  /** Set this to `true` to analyze emotion for detected keywords. */
  var emotion: js.UndefOr[Boolean] = js.native
  /** Maximum number of keywords to return. */
  var limit: js.UndefOr[Double] = js.native
  /** Set this to `true` to return sentiment information for detected keywords. */
  var sentiment: js.UndefOr[Boolean] = js.native
}

object KeywordsOptions {
  @scala.inline
  def apply(): KeywordsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeywordsOptions]
  }
  @scala.inline
  implicit class KeywordsOptionsOps[Self <: KeywordsOptions] (val x: Self) extends AnyVal {
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
    def setSentiment(value: Boolean): Self = this.set("sentiment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentiment: Self = this.set("sentiment", js.undefined)
  }
  
}

