package typings.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VastResponse extends StObject {
  
  var ads: js.Array[VastAd]
  
  var errorURLTemplates: js.Array[String]
}
object VastResponse {
  
  inline def apply(ads: js.Array[VastAd], errorURLTemplates: js.Array[String]): VastResponse = {
    val __obj = js.Dynamic.literal(ads = ads.asInstanceOf[js.Any], errorURLTemplates = errorURLTemplates.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VastResponse] (val x: Self) extends AnyVal {
    
    inline def setAds(value: js.Array[VastAd]): Self = StObject.set(x, "ads", value.asInstanceOf[js.Any])
    
    inline def setAdsVarargs(value: VastAd*): Self = StObject.set(x, "ads", js.Array(value*))
    
    inline def setErrorURLTemplates(value: js.Array[String]): Self = StObject.set(x, "errorURLTemplates", value.asInstanceOf[js.Any])
    
    inline def setErrorURLTemplatesVarargs(value: String*): Self = StObject.set(x, "errorURLTemplates", js.Array(value*))
  }
}
