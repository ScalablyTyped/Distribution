package typings.wegameApi.wx.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoAdParams extends StObject {
  
  /**
    * 广告单元 id
    */
  var adUnitId: String
  
  /**
    * 是否启用多例模式，默认为false
    */
  var multiton: js.UndefOr[Boolean] = js.undefined
}
object VideoAdParams {
  
  inline def apply(adUnitId: String): VideoAdParams = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoAdParams]
  }
  
  extension [Self <: VideoAdParams](x: Self) {
    
    inline def setAdUnitId(value: String): Self = StObject.set(x, "adUnitId", value.asInstanceOf[js.Any])
    
    inline def setMultiton(value: Boolean): Self = StObject.set(x, "multiton", value.asInstanceOf[js.Any])
    
    inline def setMultitonUndefined: Self = StObject.set(x, "multiton", js.undefined)
  }
}
