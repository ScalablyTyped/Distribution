package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseMessageFileSuccessCallbackResult extends js.Object {
  
  var errMsg: String = js.native
  
  /** 返回选择的文件的本地临时文件对象数组 */
  var tempFiles: js.Array[ChooseFile] = js.native
}
object ChooseMessageFileSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, tempFiles: js.Array[ChooseFile]): ChooseMessageFileSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], tempFiles = tempFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseMessageFileSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class ChooseMessageFileSuccessCallbackResultOps[Self <: ChooseMessageFileSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFilesVarargs(value: ChooseFile*): Self = this.set("tempFiles", js.Array(value :_*))
    
    @scala.inline
    def setTempFiles(value: js.Array[ChooseFile]): Self = this.set("tempFiles", value.asInstanceOf[js.Any])
  }
}
