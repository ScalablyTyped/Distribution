package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnCheckForUpdateCallbackResult extends StObject {
  
  /** 是否有新版本 */
  var hasUpdate: Boolean
}
object OnCheckForUpdateCallbackResult {
  
  inline def apply(hasUpdate: Boolean): OnCheckForUpdateCallbackResult = {
    val __obj = js.Dynamic.literal(hasUpdate = hasUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCheckForUpdateCallbackResult]
  }
  
  extension [Self <: OnCheckForUpdateCallbackResult](x: Self) {
    
    inline def setHasUpdate(value: Boolean): Self = StObject.set(x, "hasUpdate", value.asInstanceOf[js.Any])
  }
}
