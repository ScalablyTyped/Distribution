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

/** 要读取的压缩包内的文件列表（当传入"all" 时表示读取压缩包内所有文件） */
trait EntryItem extends StObject {
  
  /** 指定读取文件的字符编码，如果不传 encoding，则以 ArrayBuffer 格式读取文件的二进制内容
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
  
  /** 指定文件的长度，如果不指定，则读到文件末尾。有效范围：[1, fileLength]。单位：byte */
  var length: js.UndefOr[Double] = js.undefined
  
  /** 压缩包内文件路径 */
  var path: String
  
  /** 从文件指定位置开始读，如果不指定，则从文件头开始读。读取的范围应该是左闭右开区间 [position, position+length)。有效范围：[0, fileLength - 1]。单位：byte */
  var position: js.UndefOr[Double] = js.undefined
}
object EntryItem {
  
  inline def apply(path: String): EntryItem = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryItem]
  }
  
  extension [Self <: EntryItem](x: Self) {
    
    inline def setEncoding(
      value: ascii | base64 | binary | hex | ucs2 | `ucs-2` | utf16le | `utf-16le` | `utf-8` | utf8 | latin1
    ): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
