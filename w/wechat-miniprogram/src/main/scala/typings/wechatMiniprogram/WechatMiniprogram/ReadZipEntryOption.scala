package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.`ucs-2`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`utf-16le`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`utf-8`
import typings.wechatMiniprogram.wechatMiniprogramStrings.all
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

trait ReadZipEntryOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ReadZipEntryCompleteCallback] = js.undefined
  
  /** 统一指定读取文件的字符编码，只在 entries 值为"all"时有效。如果 entries 值为"all"且不传 encoding，则以 ArrayBuffer 格式读取文件的二进制内容
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
  
  /** 要读取的压缩包内的文件列表（当传入"all" 时表示读取压缩包内所有文件） */
  var entries: js.Array[EntryItem] | all
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ReadZipEntryFailCallback] = js.undefined
  
  /** 要读取的压缩包的路径 (本地路径) */
  var filePath: String
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ReadZipEntrySuccessCallback] = js.undefined
}
object ReadZipEntryOption {
  
  inline def apply(entries: js.Array[EntryItem] | all, filePath: String): ReadZipEntryOption = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadZipEntryOption]
  }
  
  extension [Self <: ReadZipEntryOption](x: Self) {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setEncoding(
      value: ascii | base64 | binary | hex | ucs2 | `ucs-2` | utf16le | `utf-16le` | `utf-8` | utf8 | latin1
    ): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setEntries(value: js.Array[EntryItem] | all): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: EntryItem*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setFail(value: /* result */ ReadFileFailCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* result */ ReadZipEntrySuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
