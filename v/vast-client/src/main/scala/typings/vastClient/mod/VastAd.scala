package typings.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VastAd extends js.Object {
  var advertiser: String | Null = js.native
  var creatives: js.Array[VastCreative] = js.native
  var description: String | Null = js.native
  var errorURLTemplates: js.Array[String] = js.native
  var extensions: js.Array[VastAdExtension] = js.native
  var id: String | Null = js.native
  var impressionURLTemplates: js.Array[String] = js.native
  var pricing: String | Null = js.native
  var sequence: String | Null = js.native
  var survey: String | Null = js.native
  var system: VastSystem | String | Null = js.native
  var title: String | Null = js.native
}

object VastAd {
  @scala.inline
  def apply(
    creatives: js.Array[VastCreative],
    errorURLTemplates: js.Array[String],
    extensions: js.Array[VastAdExtension],
    impressionURLTemplates: js.Array[String]
  ): VastAd = {
    val __obj = js.Dynamic.literal(creatives = creatives.asInstanceOf[js.Any], errorURLTemplates = errorURLTemplates.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], impressionURLTemplates = impressionURLTemplates.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastAd]
  }
  @scala.inline
  implicit class VastAdOps[Self <: VastAd] (val x: Self) extends AnyVal {
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
    def setCreativesVarargs(value: VastCreative*): Self = this.set("creatives", js.Array(value :_*))
    @scala.inline
    def setCreatives(value: js.Array[VastCreative]): Self = this.set("creatives", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorURLTemplatesVarargs(value: String*): Self = this.set("errorURLTemplates", js.Array(value :_*))
    @scala.inline
    def setErrorURLTemplates(value: js.Array[String]): Self = this.set("errorURLTemplates", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensionsVarargs(value: VastAdExtension*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[VastAdExtension]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setImpressionURLTemplatesVarargs(value: String*): Self = this.set("impressionURLTemplates", js.Array(value :_*))
    @scala.inline
    def setImpressionURLTemplates(value: js.Array[String]): Self = this.set("impressionURLTemplates", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdvertiser(value: String): Self = this.set("advertiser", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdvertiserNull: Self = this.set("advertiser", null)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    @scala.inline
    def setPricing(value: String): Self = this.set("pricing", value.asInstanceOf[js.Any])
    @scala.inline
    def setPricingNull: Self = this.set("pricing", null)
    @scala.inline
    def setSequence(value: String): Self = this.set("sequence", value.asInstanceOf[js.Any])
    @scala.inline
    def setSequenceNull: Self = this.set("sequence", null)
    @scala.inline
    def setSurvey(value: String): Self = this.set("survey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSurveyNull: Self = this.set("survey", null)
    @scala.inline
    def setSystem(value: VastSystem | String): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemNull: Self = this.set("system", null)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleNull: Self = this.set("title", null)
  }
  
}

