package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FstatSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** [Stats](https://developers.weixin.qq.com/miniprogram/dev/api/file/Stats.html)
    *
    * Stats 对象，包含了文件的状态信息 */
  var stats: Stats
}
object FstatSuccessCallbackResult {
  
  inline def apply(errMsg: String, stats: Stats): FstatSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[FstatSuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FstatSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
