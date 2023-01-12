package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInterstitialAdOption extends StObject {
  
  /** 广告单元 id */
  var adUnitId: String
}
object CreateInterstitialAdOption {
  
  inline def apply(adUnitId: String): CreateInterstitialAdOption = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInterstitialAdOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateInterstitialAdOption] (val x: Self) extends AnyVal {
    
    inline def setAdUnitId(value: String): Self = StObject.set(x, "adUnitId", value.asInstanceOf[js.Any])
  }
}
