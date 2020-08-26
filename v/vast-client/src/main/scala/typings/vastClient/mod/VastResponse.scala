package typings.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VastResponse extends js.Object {
  var ads: js.Array[VastAd] = js.native
  var errorURLTemplates: js.Array[String] = js.native
}

object VastResponse {
  @scala.inline
  def apply(ads: js.Array[VastAd], errorURLTemplates: js.Array[String]): VastResponse = {
    val __obj = js.Dynamic.literal(ads = ads.asInstanceOf[js.Any], errorURLTemplates = errorURLTemplates.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastResponse]
  }
  @scala.inline
  implicit class VastResponseOps[Self <: VastResponse] (val x: Self) extends AnyVal {
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
    def setAdsVarargs(value: VastAd*): Self = this.set("ads", js.Array(value :_*))
    @scala.inline
    def setAds(value: js.Array[VastAd]): Self = this.set("ads", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorURLTemplatesVarargs(value: String*): Self = this.set("errorURLTemplates", js.Array(value :_*))
    @scala.inline
    def setErrorURLTemplates(value: js.Array[String]): Self = this.set("errorURLTemplates", value.asInstanceOf[js.Any])
  }
  
}

