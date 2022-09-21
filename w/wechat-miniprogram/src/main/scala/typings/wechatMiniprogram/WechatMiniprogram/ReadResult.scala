package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 文件读取结果。 通过 [FileSystemManager.readSync](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.readSync.html) 接口返回 */
trait ReadResult extends StObject {
  
  /** 被写入的缓存区的对象，即接口入参的 arrayBuffer */
  var arrayBuffer: js.typedarray.ArrayBuffer
  
  /** 实际读取的字节数 */
  var bytesRead: Double
}
object ReadResult {
  
  inline def apply(arrayBuffer: js.typedarray.ArrayBuffer, bytesRead: Double): ReadResult = {
    val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadResult]
  }
  
  extension [Self <: ReadResult](x: Self) {
    
    inline def setArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "arrayBuffer", value.asInstanceOf[js.Any])
    
    inline def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
  }
}
