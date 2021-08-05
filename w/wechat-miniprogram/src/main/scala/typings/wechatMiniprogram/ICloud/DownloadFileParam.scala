package typings.wechatMiniprogram.ICloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadFileParam
  extends StObject
     with ICloudAPIParam[DownloadFileResult] {
  
  var cloudPath: js.UndefOr[String] = js.undefined
  
  var fileID: String
}
object DownloadFileParam {
  
  inline def apply(fileID: String): DownloadFileParam = {
    val __obj = js.Dynamic.literal(fileID = fileID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileParam]
  }
  
  extension [Self <: DownloadFileParam](x: Self) {
    
    inline def setCloudPath(value: String): Self = StObject.set(x, "cloudPath", value.asInstanceOf[js.Any])
    
    inline def setCloudPathUndefined: Self = StObject.set(x, "cloudPath", js.undefined)
    
    inline def setFileID(value: String): Self = StObject.set(x, "fileID", value.asInstanceOf[js.Any])
  }
}
