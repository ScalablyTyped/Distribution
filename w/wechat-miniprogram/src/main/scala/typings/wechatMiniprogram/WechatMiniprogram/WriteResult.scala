package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 文件写入结果。 通过 [FileSystemManager.writeSync](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.writeSync.html) 接口返回 */
trait WriteResult extends StObject {
  
  /** 实际被写入到文件中的字节数（注意，被写入的字节数不一定与被写入的字符串字符数相同） */
  var bytesWritten: Double
}
object WriteResult {
  
  inline def apply(bytesWritten: Double): WriteResult = {
    val __obj = js.Dynamic.literal(bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteResult]
  }
  
  extension [Self <: WriteResult](x: Self) {
    
    inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
