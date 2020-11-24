package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSavedFileListSuccess extends js.Object {
  
  /**
    * 接口调用结果
    */
  var errMsg: js.UndefOr[Double] = js.native
  
  /**
    * 文件列表
    */
  var fileList: js.UndefOr[String] = js.native
}
object GetSavedFileListSuccess {
  
  @scala.inline
  def apply(): GetSavedFileListSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSavedFileListSuccess]
  }
  
  @scala.inline
  implicit class GetSavedFileListSuccessOps[Self <: GetSavedFileListSuccess] (val x: Self) extends AnyVal {
    
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
    def setErrMsg(value: Double): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrMsg: Self = this.set("errMsg", js.undefined)
    
    @scala.inline
    def setFileList(value: String): Self = this.set("fileList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileList: Self = this.set("fileList", js.undefined)
  }
}
