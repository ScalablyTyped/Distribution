package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseImageSuccessCallbackResult extends js.Object {
  
  var errMsg: String = js.native
  
  /** 图片的本地临时文件路径列表 (本地路径) */
  var tempFilePaths: js.Array[String] = js.native
  
  /** 图片的本地临时文件列表
    *
    * 最低基础库： `1.2.0` */
  var tempFiles: js.Array[ImageFile] = js.native
}
object ChooseImageSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, tempFilePaths: js.Array[String], tempFiles: js.Array[ImageFile]): ChooseImageSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], tempFilePaths = tempFilePaths.asInstanceOf[js.Any], tempFiles = tempFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseImageSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class ChooseImageSuccessCallbackResultOps[Self <: ChooseImageSuccessCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setTempFilePathsVarargs(value: String*): Self = this.set("tempFilePaths", js.Array(value :_*))
    
    @scala.inline
    def setTempFilePaths(value: js.Array[String]): Self = this.set("tempFilePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFilesVarargs(value: ImageFile*): Self = this.set("tempFiles", js.Array(value :_*))
    
    @scala.inline
    def setTempFiles(value: js.Array[ImageFile]): Self = this.set("tempFiles", value.asInstanceOf[js.Any])
  }
}
