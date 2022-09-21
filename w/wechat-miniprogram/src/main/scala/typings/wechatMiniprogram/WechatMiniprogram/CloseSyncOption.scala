package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseSyncOption extends StObject {
  
  /** 需要被关闭的文件描述符。fd 通过 [FileSystemManager.open](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.open.html) 或 [FileSystemManager.openSync](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.openSync.html) 接口获得 */
  var fd: String
}
object CloseSyncOption {
  
  inline def apply(fd: String): CloseSyncOption = {
    val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseSyncOption]
  }
  
  extension [Self <: CloseSyncOption](x: Self) {
    
    inline def setFd(value: String): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
  }
}
