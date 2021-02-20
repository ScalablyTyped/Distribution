package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseMediaSuccessCallbackResult extends StObject {
  
  var errMsg: String = js.native
  
  /** 本地临时文件列表 */
  var tempFiles: js.Array[MediaFile] = js.native
  
  /** 文件类型，有效值有 image 、video */
  var `type`: String = js.native
}
object ChooseMediaSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, tempFiles: js.Array[MediaFile], `type`: String): ChooseMediaSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], tempFiles = tempFiles.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseMediaSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class ChooseMediaSuccessCallbackResultMutableBuilder[Self <: ChooseMediaSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFiles(value: js.Array[MediaFile]): Self = StObject.set(x, "tempFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFilesVarargs(value: MediaFile*): Self = StObject.set(x, "tempFiles", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
