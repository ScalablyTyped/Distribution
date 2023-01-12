package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.`ucs-2`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`utf-16le`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`utf-8`
import typings.wechatMiniprogram.wechatMiniprogramStrings.ascii
import typings.wechatMiniprogram.wechatMiniprogramStrings.base64
import typings.wechatMiniprogram.wechatMiniprogramStrings.binary
import typings.wechatMiniprogram.wechatMiniprogramStrings.hex
import typings.wechatMiniprogram.wechatMiniprogramStrings.latin1
import typings.wechatMiniprogram.wechatMiniprogramStrings.ucs2
import typings.wechatMiniprogram.wechatMiniprogramStrings.utf16le
import typings.wechatMiniprogram.wechatMiniprogramStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteSyncOption extends StObject {
  
  /** 写入的内容，类型为 String 或 ArrayBuffer */
  var data: String | js.typedarray.ArrayBuffer
  
  /** 只在 data 类型是 String 时有效，指定写入文件的字符编码，默认为 utf8
    *
    * 可选值：
    * - 'ascii': ;
    * - 'base64': ;
    * - 'binary': ;
    * - 'hex': ;
    * - 'ucs2': 以小端序读取;
    * - 'ucs-2': 以小端序读取;
    * - 'utf16le': 以小端序读取;
    * - 'utf-16le': 以小端序读取;
    * - 'utf-8': ;
    * - 'utf8': ;
    * - 'latin1': ; */
  var encoding: js.UndefOr[
    ascii | base64 | binary | hex | ucs2 | `ucs-2` | utf16le | `utf-16le` | `utf-8` | utf8 | latin1
  ] = js.undefined
  
  /** 文件描述符。fd 通过 [FileSystemManager.open](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.open.html) 或 [FileSystemManager.openSync](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.openSync.html) 接口获得 */
  var fd: String
  
  /** 只在 data 类型是 ArrayBuffer 时有效，指定要写入的字节数，默认为 arrayBuffer 从0开始偏移 offset 个字节后剩余的字节数 */
  var length: js.UndefOr[Double] = js.undefined
  
  /** 只在 data 类型是 ArrayBuffer 时有效，决定 arrayBuffe 中要被写入的部位，即 arrayBuffer 中的索引，默认0 */
  var offset: js.UndefOr[Double] = js.undefined
  
  /** 指定文件开头的偏移量，即数据要被写入的位置。当 position 不传或者传入非 Number 类型的值时，数据会被写入当前指针所在位置。 */
  var position: js.UndefOr[Double] = js.undefined
}
object WriteSyncOption {
  
  inline def apply(data: String | js.typedarray.ArrayBuffer, fd: String): WriteSyncOption = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fd = fd.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteSyncOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WriteSyncOption] (val x: Self) extends AnyVal {
    
    inline def setData(value: String | js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEncoding(
      value: ascii | base64 | binary | hex | ucs2 | `ucs-2` | utf16le | `utf-16le` | `utf-8` | utf8 | latin1
    ): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFd(value: String): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
