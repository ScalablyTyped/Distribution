package typings.weixinApp.wx

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppendFileOptions
  extends BaseOptions[js.Any, js.Any] {
  
  // 要追加内容的文件路径
  var data: String | ArrayBuffer = js.native
  
  // 要追加的文本或二进制数据
  var encoding: js.UndefOr[String] = js.native
  
  var filePath: String = js.native
}
object AppendFileOptions {
  
  @scala.inline
  def apply(data: String | ArrayBuffer, filePath: String): AppendFileOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendFileOptions]
  }
  
  @scala.inline
  implicit class AppendFileOptionsMutableBuilder[Self <: AppendFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String | ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
  }
}
