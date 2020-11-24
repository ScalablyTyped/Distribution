package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitUploadOptions extends js.Object {
  
  var abort: js.UndefOr[js.Object] = js.native
  
  var allow: js.UndefOr[String | Boolean] = js.native
  
  var `before-all`: js.UndefOr[js.Object] = js.native
  
  var `before-send`: js.UndefOr[js.Object] = js.native
  
  var `cls-dragover`: js.UndefOr[String] = js.native
  
  var complete: js.UndefOr[js.Object] = js.native
  
  var `complete-all`: js.UndefOr[js.Object] = js.native
  
  var concurrent: js.UndefOr[Double] = js.native
  
  var error: js.UndefOr[js.Object] = js.native
  
  var fail: js.UndefOr[js.Object] = js.native
  
  var load: js.UndefOr[js.Object] = js.native
  
  var `load-end`: js.UndefOr[js.Object] = js.native
  
  var `load-start`: js.UndefOr[js.Object] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var mime: js.UndefOr[String | Boolean] = js.native
  
  var `msg-invalid-mime`: js.UndefOr[String] = js.native
  
  var `msg-invalid-name`: js.UndefOr[String] = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var params: js.UndefOr[js.Object] = js.native
  
  var progress: js.UndefOr[js.Object] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object UIkitUploadOptions {
  
  @scala.inline
  def apply(): UIkitUploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitUploadOptions]
  }
  
  @scala.inline
  implicit class UIkitUploadOptionsOps[Self <: UIkitUploadOptions] (val x: Self) extends AnyVal {
    
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
    def setAbort(value: js.Object): Self = this.set("abort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbort: Self = this.set("abort", js.undefined)
    
    @scala.inline
    def setAllow(value: String | Boolean): Self = this.set("allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow: Self = this.set("allow", js.undefined)
    
    @scala.inline
    def `setBefore-all`(value: js.Object): Self = this.set("before-all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBefore-all`: Self = this.set("before-all", js.undefined)
    
    @scala.inline
    def `setBefore-send`(value: js.Object): Self = this.set("before-send", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBefore-send`: Self = this.set("before-send", js.undefined)
    
    @scala.inline
    def `setCls-dragover`(value: String): Self = this.set("cls-dragover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCls-dragover`: Self = this.set("cls-dragover", js.undefined)
    
    @scala.inline
    def setComplete(value: js.Object): Self = this.set("complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def `setComplete-all`(value: js.Object): Self = this.set("complete-all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteComplete-all`: Self = this.set("complete-all", js.undefined)
    
    @scala.inline
    def setConcurrent(value: Double): Self = this.set("concurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcurrent: Self = this.set("concurrent", js.undefined)
    
    @scala.inline
    def setError(value: js.Object): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setFail(value: js.Object): Self = this.set("fail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setLoad(value: js.Object): Self = this.set("load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def `setLoad-end`(value: js.Object): Self = this.set("load-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLoad-end`: Self = this.set("load-end", js.undefined)
    
    @scala.inline
    def `setLoad-start`(value: js.Object): Self = this.set("load-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLoad-start`: Self = this.set("load-start", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setMime(value: String | Boolean): Self = this.set("mime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMime: Self = this.set("mime", js.undefined)
    
    @scala.inline
    def `setMsg-invalid-mime`(value: String): Self = this.set("msg-invalid-mime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMsg-invalid-mime`: Self = this.set("msg-invalid-mime", js.undefined)
    
    @scala.inline
    def `setMsg-invalid-name`(value: String): Self = this.set("msg-invalid-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMsg-invalid-name`: Self = this.set("msg-invalid-name", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParams(value: js.Object): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setProgress(value: js.Object): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
