package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadFileOptionFiles extends StObject {
  
  /**
    * multipart 提交时，表单的项目名，默认为 file，如果 name 不填或填的值相同，可能导致服务端读取文件时只能读取到一个文件。
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * 要上传文件资源的路径
    */
  var uri: js.UndefOr[String] = js.undefined
}
object UploadFileOptionFiles {
  
  inline def apply(): UploadFileOptionFiles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadFileOptionFiles]
  }
  
  extension [Self <: UploadFileOptionFiles](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
