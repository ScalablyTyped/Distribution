package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppendFileOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  // 要追加内容的文件路径
  var data: String | js.typedarray.ArrayBuffer
  
  // 要追加的文本或二进制数据
  var encoding: js.UndefOr[String] = js.undefined
  
  var filePath: String
}
object AppendFileOptions {
  
  inline def apply(data: String | js.typedarray.ArrayBuffer, filePath: String): AppendFileOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendFileOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppendFileOptions] (val x: Self) extends AnyVal {
    
    inline def setData(value: String | js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
  }
}
