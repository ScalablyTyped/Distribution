package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.wechatMiniprogramInts.`1`
import typings.wechatMiniprogram.wechatMiniprogramInts.`2`
import typings.wechatMiniprogram.wechatMiniprogramInts.`3`
import typings.wechatMiniprogram.wechatMiniprogramInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrMsg extends StObject {
  
  /**
    * MediaError.code
    *
    * - 1 获取资源被用户禁止
    * - 2 网络错误
    * - 3 解码错误
    * - 4 不合适资源
    */
  var errMsg: `1` | `2` | `3` | `4`
}
object ErrMsg {
  
  inline def apply(errMsg: `1` | `2` | `3` | `4`): ErrMsg = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrMsg]
  }
  
  extension [Self <: ErrMsg](x: Self) {
    
    inline def setErrMsg(value: `1` | `2` | `3` | `4`): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
