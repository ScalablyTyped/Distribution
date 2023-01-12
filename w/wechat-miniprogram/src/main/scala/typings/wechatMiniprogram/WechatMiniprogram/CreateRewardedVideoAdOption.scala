package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRewardedVideoAdOption extends StObject {
  
  /** 广告单元 id */
  var adUnitId: String
  
  /** 是否启用多例模式，默认为false
    *
    * 最低基础库： `2.8.0` */
  var multiton: js.UndefOr[Boolean] = js.undefined
}
object CreateRewardedVideoAdOption {
  
  inline def apply(adUnitId: String): CreateRewardedVideoAdOption = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRewardedVideoAdOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRewardedVideoAdOption] (val x: Self) extends AnyVal {
    
    inline def setAdUnitId(value: String): Self = StObject.set(x, "adUnitId", value.asInstanceOf[js.Any])
    
    inline def setMultiton(value: Boolean): Self = StObject.set(x, "multiton", value.asInstanceOf[js.Any])
    
    inline def setMultitonUndefined: Self = StObject.set(x, "multiton", js.undefined)
  }
}
