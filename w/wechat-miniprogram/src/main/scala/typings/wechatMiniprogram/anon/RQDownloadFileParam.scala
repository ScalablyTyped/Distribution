package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.ICloudConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wechat-miniprogram.RQ<wechat-miniprogram.ICloud.DownloadFileParam> */
trait RQDownloadFileParam extends StObject {
  
  var cloudPath: js.UndefOr[String] = js.undefined
  
  var config: js.UndefOr[ICloudConfig] = js.undefined
  
  var fileID: String
}
object RQDownloadFileParam {
  
  @scala.inline
  def apply(fileID: String): RQDownloadFileParam = {
    val __obj = js.Dynamic.literal(fileID = fileID.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQDownloadFileParam]
  }
  
  @scala.inline
  implicit class RQDownloadFileParamMutableBuilder[Self <: RQDownloadFileParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudPath(value: String): Self = StObject.set(x, "cloudPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudPathUndefined: Self = StObject.set(x, "cloudPath", js.undefined)
    
    @scala.inline
    def setConfig(value: ICloudConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setFileID(value: String): Self = StObject.set(x, "fileID", value.asInstanceOf[js.Any])
  }
}
