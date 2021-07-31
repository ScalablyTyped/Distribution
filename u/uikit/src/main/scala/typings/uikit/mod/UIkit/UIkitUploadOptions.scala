package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitUploadOptions extends StObject {
  
  var abort: js.UndefOr[js.Object] = js.undefined
  
  var allow: js.UndefOr[String | Boolean] = js.undefined
  
  var `before-all`: js.UndefOr[js.Object] = js.undefined
  
  var `before-send`: js.UndefOr[js.Object] = js.undefined
  
  var `cls-dragover`: js.UndefOr[String] = js.undefined
  
  var complete: js.UndefOr[js.Object] = js.undefined
  
  var `complete-all`: js.UndefOr[js.Object] = js.undefined
  
  var concurrent: js.UndefOr[Double] = js.undefined
  
  var error: js.UndefOr[js.Object] = js.undefined
  
  var fail: js.UndefOr[js.Object] = js.undefined
  
  var load: js.UndefOr[js.Object] = js.undefined
  
  var `load-end`: js.UndefOr[js.Object] = js.undefined
  
  var `load-start`: js.UndefOr[js.Object] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var mime: js.UndefOr[String | Boolean] = js.undefined
  
  var `msg-invalid-mime`: js.UndefOr[String] = js.undefined
  
  var `msg-invalid-name`: js.UndefOr[String] = js.undefined
  
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var params: js.UndefOr[js.Object] = js.undefined
  
  var progress: js.UndefOr[js.Object] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object UIkitUploadOptions {
  
  @scala.inline
  def apply(): UIkitUploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitUploadOptions]
  }
  
  @scala.inline
  implicit class UIkitUploadOptionsMutableBuilder[Self <: UIkitUploadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: js.Object): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
    
    @scala.inline
    def setAllow(value: String | Boolean): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
    
    @scala.inline
    def `setBefore-all`(value: js.Object): Self = StObject.set(x, "before-all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBefore-allUndefined`: Self = StObject.set(x, "before-all", js.undefined)
    
    @scala.inline
    def `setBefore-send`(value: js.Object): Self = StObject.set(x, "before-send", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBefore-sendUndefined`: Self = StObject.set(x, "before-send", js.undefined)
    
    @scala.inline
    def `setCls-dragover`(value: String): Self = StObject.set(x, "cls-dragover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCls-dragoverUndefined`: Self = StObject.set(x, "cls-dragover", js.undefined)
    
    @scala.inline
    def setComplete(value: js.Object): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setComplete-all`(value: js.Object): Self = StObject.set(x, "complete-all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setComplete-allUndefined`: Self = StObject.set(x, "complete-all", js.undefined)
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setConcurrent(value: Double): Self = StObject.set(x, "concurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcurrentUndefined: Self = StObject.set(x, "concurrent", js.undefined)
    
    @scala.inline
    def setError(value: js.Object): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setFail(value: js.Object): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setLoad(value: js.Object): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLoad-end`(value: js.Object): Self = StObject.set(x, "load-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLoad-endUndefined`: Self = StObject.set(x, "load-end", js.undefined)
    
    @scala.inline
    def `setLoad-start`(value: js.Object): Self = StObject.set(x, "load-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLoad-startUndefined`: Self = StObject.set(x, "load-start", js.undefined)
    
    @scala.inline
    def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setMime(value: String | Boolean): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
    
    @scala.inline
    def `setMsg-invalid-mime`(value: String): Self = StObject.set(x, "msg-invalid-mime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMsg-invalid-mimeUndefined`: Self = StObject.set(x, "msg-invalid-mime", js.undefined)
    
    @scala.inline
    def `setMsg-invalid-name`(value: String): Self = StObject.set(x, "msg-invalid-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMsg-invalid-nameUndefined`: Self = StObject.set(x, "msg-invalid-name", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setProgress(value: js.Object): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
