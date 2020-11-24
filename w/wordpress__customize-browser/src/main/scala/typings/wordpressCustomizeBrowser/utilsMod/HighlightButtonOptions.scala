package typings.wordpressCustomizeBrowser.utilsMod

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightButtonOptions extends js.Object {
  
  var delay: js.UndefOr[Double] = js.native
  
  var focusTarget: js.UndefOr[JQuery[HTMLElement]] = js.native
}
object HighlightButtonOptions {
  
  @scala.inline
  def apply(): HighlightButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightButtonOptions]
  }
  
  @scala.inline
  implicit class HighlightButtonOptionsOps[Self <: HighlightButtonOptions] (val x: Self) extends AnyVal {
    
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setFocusTarget(value: JQuery[HTMLElement]): Self = this.set("focusTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusTarget: Self = this.set("focusTarget", js.undefined)
  }
}
