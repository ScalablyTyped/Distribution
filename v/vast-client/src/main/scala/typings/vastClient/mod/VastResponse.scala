package typings.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VastResponse extends StObject {
  
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
  implicit class VastResponseMutableBuilder[Self <: VastResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAds(value: js.Array[VastAd]): Self = StObject.set(x, "ads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdsVarargs(value: VastAd*): Self = StObject.set(x, "ads", js.Array(value :_*))
    
    @scala.inline
    def setErrorURLTemplates(value: js.Array[String]): Self = StObject.set(x, "errorURLTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorURLTemplatesVarargs(value: String*): Self = StObject.set(x, "errorURLTemplates", js.Array(value :_*))
  }
}
