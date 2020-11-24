package typings.wordpressCustomizeBrowser.previewerMod

import typings.jquery.JQuery.Deferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewerDeferred extends js.Object {
  
  var active: Deferred[_, _, _] = js.native
}
object PreviewerDeferred {
  
  @scala.inline
  def apply(active: Deferred[_, _, _]): PreviewerDeferred = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewerDeferred]
  }
  
  @scala.inline
  implicit class PreviewerDeferredOps[Self <: PreviewerDeferred] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Deferred[_, _, _]): Self = this.set("active", value.asInstanceOf[js.Any])
  }
}
