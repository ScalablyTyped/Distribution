package typings.wechatMiniprogram.ICloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadFileParam extends ICloudAPIParam[DownloadFileResult] {
  
  var cloudPath: js.UndefOr[String] = js.native
  
  var fileID: String = js.native
}
object DownloadFileParam {
  
  @scala.inline
  def apply(fileID: String): DownloadFileParam = {
    val __obj = js.Dynamic.literal(fileID = fileID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileParam]
  }
  
  @scala.inline
  implicit class DownloadFileParamMutableBuilder[Self <: DownloadFileParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudPath(value: String): Self = StObject.set(x, "cloudPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudPathUndefined: Self = StObject.set(x, "cloudPath", js.undefined)
    
    @scala.inline
    def setFileID(value: String): Self = StObject.set(x, "fileID", value.asInstanceOf[js.Any])
  }
}
