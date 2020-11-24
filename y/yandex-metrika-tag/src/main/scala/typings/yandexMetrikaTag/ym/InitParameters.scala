package typings.yandexMetrikaTag.ym

import typings.yandexMetrikaTag.yandexMetrikaTagStrings.noindex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitParameters extends js.Object {
  
  var accurateTrackBounce: js.UndefOr[Boolean | Double] = js.native
  
  var childIframe: js.UndefOr[Boolean] = js.native
  
  var clickmap: js.UndefOr[Boolean] = js.native
  
  var defer: js.UndefOr[Boolean] = js.native
  
  var ecommerce: js.UndefOr[Boolean | String | js.Array[_]] = js.native
  
  var params: js.UndefOr[VisitParameters | js.Array[VisitParameters]] = js.native
  
  var trackHash: js.UndefOr[Boolean] = js.native
  
  var trackLinks: js.UndefOr[Boolean] = js.native
  
  var triggerEvent: js.UndefOr[Boolean] = js.native
  
  var trustedDomains: js.UndefOr[js.Array[String]] = js.native
  
  var `type`: js.UndefOr[Double] = js.native
  
  var userParams: js.UndefOr[UserParameters] = js.native
  
  var ut: js.UndefOr[noindex] = js.native
  
  var webvisor: js.UndefOr[Boolean] = js.native
}
object InitParameters {
  
  @scala.inline
  def apply(): InitParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitParameters]
  }
  
  @scala.inline
  implicit class InitParametersOps[Self <: InitParameters] (val x: Self) extends AnyVal {
    
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
    def setAccurateTrackBounce(value: Boolean | Double): Self = this.set("accurateTrackBounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccurateTrackBounce: Self = this.set("accurateTrackBounce", js.undefined)
    
    @scala.inline
    def setChildIframe(value: Boolean): Self = this.set("childIframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildIframe: Self = this.set("childIframe", js.undefined)
    
    @scala.inline
    def setClickmap(value: Boolean): Self = this.set("clickmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickmap: Self = this.set("clickmap", js.undefined)
    
    @scala.inline
    def setDefer(value: Boolean): Self = this.set("defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefer: Self = this.set("defer", js.undefined)
    
    @scala.inline
    def setEcommerceVarargs(value: js.Any*): Self = this.set("ecommerce", js.Array(value :_*))
    
    @scala.inline
    def setEcommerce(value: Boolean | String | js.Array[_]): Self = this.set("ecommerce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcommerce: Self = this.set("ecommerce", js.undefined)
    
    @scala.inline
    def setParamsVarargs(value: VisitParameters*): Self = this.set("params", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: VisitParameters | js.Array[VisitParameters]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setTrackHash(value: Boolean): Self = this.set("trackHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackHash: Self = this.set("trackHash", js.undefined)
    
    @scala.inline
    def setTrackLinks(value: Boolean): Self = this.set("trackLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackLinks: Self = this.set("trackLinks", js.undefined)
    
    @scala.inline
    def setTriggerEvent(value: Boolean): Self = this.set("triggerEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerEvent: Self = this.set("triggerEvent", js.undefined)
    
    @scala.inline
    def setTrustedDomainsVarargs(value: String*): Self = this.set("trustedDomains", js.Array(value :_*))
    
    @scala.inline
    def setTrustedDomains(value: js.Array[String]): Self = this.set("trustedDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrustedDomains: Self = this.set("trustedDomains", js.undefined)
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUserParams(value: UserParameters): Self = this.set("userParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserParams: Self = this.set("userParams", js.undefined)
    
    @scala.inline
    def setUt(value: noindex): Self = this.set("ut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUt: Self = this.set("ut", js.undefined)
    
    @scala.inline
    def setWebvisor(value: Boolean): Self = this.set("webvisor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebvisor: Self = this.set("webvisor", js.undefined)
  }
}
