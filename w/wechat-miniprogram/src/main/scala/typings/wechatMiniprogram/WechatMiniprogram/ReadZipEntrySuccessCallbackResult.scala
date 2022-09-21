package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadZipEntrySuccessCallbackResult extends StObject {
  
  /** 文件读取结果。res.entries 是一个对象，key是文件路径，value是一个对象 FileItem ，表示该文件的读取结果。每个 FileItem 包含 data （文件内容） 和 errMsg （错误信息） 属性。 */
  var entries: EntriesResult
  
  var errMsg: String
}
object ReadZipEntrySuccessCallbackResult {
  
  inline def apply(entries: EntriesResult, errMsg: String): ReadZipEntrySuccessCallbackResult = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadZipEntrySuccessCallbackResult]
  }
  
  extension [Self <: ReadZipEntrySuccessCallbackResult](x: Self) {
    
    inline def setEntries(value: EntriesResult): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
