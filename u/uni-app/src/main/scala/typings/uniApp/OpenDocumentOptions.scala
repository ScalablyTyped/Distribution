package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenDocumentOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 文件路径
    */
  var filePath: js.UndefOr[String] = js.native
  /**
    * 文件类型，指定文件类型打开文件，有效值 doc, xls, ppt, pdf, docx, xlsx, pptx
    */
  var fileType: js.UndefOr[String] = js.native
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}

object OpenDocumentOptions {
  @scala.inline
  def apply(): OpenDocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenDocumentOptions]
  }
  @scala.inline
  implicit class OpenDocumentOptionsOps[Self <: OpenDocumentOptions] (val x: Self) extends AnyVal {
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilePath: Self = this.set("filePath", js.undefined)
    @scala.inline
    def setFileType(value: String): Self = this.set("fileType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
    @scala.inline
    def setSuccess(value: () => Unit): Self = this.set("success", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

