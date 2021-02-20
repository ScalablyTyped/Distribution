package typings.wechatMiniprogram.ICloud

import typings.wechatMiniprogram.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadFileParam extends ICloudAPIParam[UploadFileResult] {
  
  var cloudPath: String = js.native
  
  var filePath: String = js.native
  
  var header: js.UndefOr[AnyObject] = js.native
}
object UploadFileParam {
  
  @scala.inline
  def apply(cloudPath: String, filePath: String): UploadFileParam = {
    val __obj = js.Dynamic.literal(cloudPath = cloudPath.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileParam]
  }
  
  @scala.inline
  implicit class UploadFileParamMutableBuilder[Self <: UploadFileParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudPath(value: String): Self = StObject.set(x, "cloudPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: AnyObject): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
  }
}
