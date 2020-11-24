package typings.uniApp

import typings.uniApp.uniAppStrings.audio
import typings.uniApp.uniAppStrings.image
import typings.uniApp.uniAppStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadFileOption extends js.Object {
  
  /**
    * 结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function1[/* result */ GeneralCallbackResult, Unit]] = js.native
  
  /**
    * 失败的回调函数
    */
  var fail: js.UndefOr[js.Function1[/* result */ GeneralCallbackResult, Unit]] = js.native
  
  /**
    * 要上传文件资源的路径
    */
  var filePath: js.UndefOr[String] = js.native
  
  /**
    * 文件类型，image/video/audio，仅支付宝小程序，且必填。
    * - image: 图像
    * - video: 视频
    * - audio: 音频
    */
  var fileType: js.UndefOr[image | video | audio] = js.native
  
  /**
    * 需要上传的文件列表。使用 files 时，filePath 和 name 不生效。仅 5+App 支持
    */
  var files: js.UndefOr[js.Array[UploadFileOptionFiles]] = js.native
  
  /**
    * HTTP 请求中其他额外的 form data
    */
  var formData: js.UndefOr[js.Any] = js.native
  
  /**
    * HTTP 请求 Header, header 中不能设置 Referer
    */
  var header: js.UndefOr[js.Any] = js.native
  
  /**
    * 文件对应的 key , 开发者在服务器端通过这个 key 可以获取到文件二进制内容
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * 成功返回的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ UploadFileSuccessCallbackResult, Unit]] = js.native
  
  /**
    * 开发者服务器 url
    */
  var url: js.UndefOr[String] = js.native
}
object UploadFileOption {
  
  @scala.inline
  def apply(): UploadFileOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadFileOption]
  }
  
  @scala.inline
  implicit class UploadFileOptionOps[Self <: UploadFileOption] (val x: Self) extends AnyVal {
    
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
    def setComplete(value: /* result */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* result */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilePath: Self = this.set("filePath", js.undefined)
    
    @scala.inline
    def setFileType(value: image | video | audio): Self = this.set("fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: UploadFileOptionFiles*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[UploadFileOptionFiles]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setFormData(value: js.Any): Self = this.set("formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormData: Self = this.set("formData", js.undefined)
    
    @scala.inline
    def setHeader(value: js.Any): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ UploadFileSuccessCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
