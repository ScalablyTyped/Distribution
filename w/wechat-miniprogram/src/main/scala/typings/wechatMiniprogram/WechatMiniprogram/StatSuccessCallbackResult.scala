package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** [Stats](https://developers.weixin.qq.com/miniprogram/dev/api/file/Stats.html)|Array.&lt;[Stats](https://developers.weixin.qq.com/miniprogram/dev/api/file/Stats.html)&gt;
    *
    * 当 recursive 为 false 时，res.stats 是一个 Stats 对象。当 recursive 为 true 且 path 是一个目录的路径时，res.stats 是一个 Array，数组的每一项是一个对象，每个对象包含 path 和 stats。 */
  var stats: Stats | js.Array[Stats]
}
object StatSuccessCallbackResult {
  
  inline def apply(errMsg: String, stats: Stats | js.Array[Stats]): StatSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatSuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setStats(value: Stats | js.Array[Stats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsVarargs(value: Stats*): Self = StObject.set(x, "stats", js.Array(value*))
  }
}
