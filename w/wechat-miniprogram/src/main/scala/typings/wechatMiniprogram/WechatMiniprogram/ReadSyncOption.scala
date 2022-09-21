package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadSyncOption extends StObject {
  
  /** 数据写入的缓冲区，必须是 ArrayBuffer 实例 */
  var arrayBuffer: js.typedarray.ArrayBuffer
  
  /** 文件描述符。fd 通过 [FileSystemManager.open](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.open.html) 或 [FileSystemManager.openSync](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.openSync.html) 接口获得 */
  var fd: String
  
  /** 要从文件中读取的字节数，默认0 */
  var length: js.UndefOr[Double] = js.undefined
  
  /** 缓冲区中的写入偏移量，默认0 */
  var offset: js.UndefOr[Double] = js.undefined
  
  /** 文件读取的起始位置，如不传或传 null，则会从当前文件指针的位置读取。如果 position 是正整数，则文件指针位置会保持不变并从 position 读取文件。 */
  var position: js.UndefOr[Double] = js.undefined
}
object ReadSyncOption {
  
  inline def apply(arrayBuffer: js.typedarray.ArrayBuffer, fd: String): ReadSyncOption = {
    val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.asInstanceOf[js.Any], fd = fd.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadSyncOption]
  }
  
  extension [Self <: ReadSyncOption](x: Self) {
    
    inline def setArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "arrayBuffer", value.asInstanceOf[js.Any])
    
    inline def setFd(value: String): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
