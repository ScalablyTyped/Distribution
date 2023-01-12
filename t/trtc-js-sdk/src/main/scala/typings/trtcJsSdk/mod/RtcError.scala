package typings.trtcJsSdk.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RtcError
  extends StObject
     with Error {
  
  /** 获取错误码, 详细错误码列表参见 [ErrorCode](https://trtc-1252463788.file.myqcloud.com/web/docs/module-ErrorCode.html) */
  def getCode(): String
}
object RtcError {
  
  inline def apply(getCode: () => String, message: String, name: String): RtcError = {
    val __obj = js.Dynamic.literal(getCode = js.Any.fromFunction0(getCode), message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RtcError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RtcError] (val x: Self) extends AnyVal {
    
    inline def setGetCode(value: () => String): Self = StObject.set(x, "getCode", js.Any.fromFunction0(value))
  }
}
