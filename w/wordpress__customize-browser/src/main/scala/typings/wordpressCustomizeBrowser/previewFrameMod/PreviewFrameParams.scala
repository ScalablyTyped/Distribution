package typings.wordpressCustomizeBrowser.previewFrameMod

import typings.std.Window
import typings.wordpressCustomizeBrowser.messengerMod.MessengerParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewFrameParams extends MessengerParams {
  
  var container: js.Any = js.native
  
   // TODO
  var previewUrl: js.Any = js.native
  
   // TODO
  var query: js.Any = js.native
}
object PreviewFrameParams {
  
  @scala.inline
  def apply(
    channel: String,
    container: js.Any,
    previewUrl: js.Any,
    query: js.Any,
    targetWindow: Window,
    url: String
  ): PreviewFrameParams = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], previewUrl = previewUrl.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], targetWindow = targetWindow.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewFrameParams]
  }
  
  @scala.inline
  implicit class PreviewFrameParamsOps[Self <: PreviewFrameParams] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: js.Any): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewUrl(value: js.Any): Self = this.set("previewUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: js.Any): Self = this.set("query", value.asInstanceOf[js.Any])
  }
}
