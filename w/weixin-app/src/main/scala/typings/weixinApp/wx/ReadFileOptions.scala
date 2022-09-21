package typings.weixinApp.wx

import typings.weixinApp.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadFileOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  // 要读取的文件的路径
  var encoding: js.UndefOr[String] = js.undefined
  
  var filePath: String
  
  // 指定读取文件的字符编码，如果不传 encoding，则以 ArrayBuffer 格式读取文件的二进制内容
  @JSName("success")
  var success_ReadFileOptions: js.UndefOr[js.Function1[/* res */ Data, Unit]] = js.undefined
}
object ReadFileOptions {
  
  inline def apply(filePath: String): ReadFileOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadFileOptions]
  }
  
  extension [Self <: ReadFileOptions](x: Self) {
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ Data => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
