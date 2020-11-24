package typings.wordpressCustomizeBrowser.previewerMod

import typings.std.Window
import typings.wordpressCustomizeBrowser.messengerMod.MessengerParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewerParams extends MessengerParams {
  
  var allowedUrls: js.Array[_] = js.native
  
   // TODO
  var container: String = js.native
  
  var form: String = js.native
  
  var previewUrl: String = js.native
}
object PreviewerParams {
  
  @scala.inline
  def apply(
    allowedUrls: js.Array[_],
    channel: String,
    container: String,
    form: String,
    previewUrl: String,
    targetWindow: Window,
    url: String
  ): PreviewerParams = {
    val __obj = js.Dynamic.literal(allowedUrls = allowedUrls.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], previewUrl = previewUrl.asInstanceOf[js.Any], targetWindow = targetWindow.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewerParams]
  }
  
  @scala.inline
  implicit class PreviewerParamsOps[Self <: PreviewerParams] (val x: Self) extends AnyVal {
    
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
    def setAllowedUrlsVarargs(value: js.Any*): Self = this.set("allowedUrls", js.Array(value :_*))
    
    @scala.inline
    def setAllowedUrls(value: js.Array[_]): Self = this.set("allowedUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForm(value: String): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewUrl(value: String): Self = this.set("previewUrl", value.asInstanceOf[js.Any])
  }
}
