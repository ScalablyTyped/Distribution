package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 文件路径 */
trait ZipFileItem extends StObject {
  
  /** 文件内容 */
  var data: String | js.typedarray.ArrayBuffer
  
  /** 错误信息 */
  var errMsg: String
}
object ZipFileItem {
  
  inline def apply(data: String | js.typedarray.ArrayBuffer, errMsg: String): ZipFileItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipFileItem]
  }
  
  extension [Self <: ZipFileItem](x: Self) {
    
    inline def setData(value: String | js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
