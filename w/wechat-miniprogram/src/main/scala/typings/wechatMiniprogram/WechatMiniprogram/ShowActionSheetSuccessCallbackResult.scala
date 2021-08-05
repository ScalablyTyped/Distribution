package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowActionSheetSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 用户点击的按钮序号，从上到下的顺序，从0开始 */
  var tapIndex: Double
}
object ShowActionSheetSuccessCallbackResult {
  
  inline def apply(errMsg: String, tapIndex: Double): ShowActionSheetSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], tapIndex = tapIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowActionSheetSuccessCallbackResult]
  }
  
  extension [Self <: ShowActionSheetSuccessCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setTapIndex(value: Double): Self = StObject.set(x, "tapIndex", value.asInstanceOf[js.Any])
  }
}
