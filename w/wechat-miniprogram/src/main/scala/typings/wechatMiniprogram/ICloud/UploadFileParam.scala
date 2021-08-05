package typings.wechatMiniprogram.ICloud

import typings.wechatMiniprogram.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadFileParam
  extends StObject
     with ICloudAPIParam[UploadFileResult] {
  
  var cloudPath: String
  
  var filePath: String
  
  var header: js.UndefOr[AnyObject] = js.undefined
}
object UploadFileParam {
  
  inline def apply(cloudPath: String, filePath: String): UploadFileParam = {
    val __obj = js.Dynamic.literal(cloudPath = cloudPath.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileParam]
  }
  
  extension [Self <: UploadFileParam](x: Self) {
    
    inline def setCloudPath(value: String): Self = StObject.set(x, "cloudPath", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: AnyObject): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
  }
}
