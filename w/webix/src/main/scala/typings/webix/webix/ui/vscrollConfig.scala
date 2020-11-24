package typings.webix.webix.ui

import typings.std.HTMLElement
import typings.webix.webix.EventHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait vscrollConfig extends js.Object {
  
  var container: js.UndefOr[String | HTMLElement] = js.native
  
  var id: js.UndefOr[String | Double] = js.native
  
  var on: js.UndefOr[EventHash] = js.native
  
  var scroll: js.UndefOr[String] = js.native
  
  var scrollHeight: js.UndefOr[Double] = js.native
  
  var scrollPos: js.UndefOr[Double] = js.native
  
  var scrollSize: js.UndefOr[Double] = js.native
  
  var scrollStep: js.UndefOr[Double] = js.native
  
  var scrollVisible: js.UndefOr[Boolean] = js.native
  
  var scrollWidth: js.UndefOr[Double] = js.native
  
  var view: js.UndefOr[String] = js.native
  
  var zoom: js.UndefOr[Double] = js.native
}
object vscrollConfig {
  
  @scala.inline
  def apply(): vscrollConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[vscrollConfig]
  }
  
  @scala.inline
  implicit class vscrollConfigOps[Self <: vscrollConfig] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: String | HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setOn(value: EventHash): Self = this.set("on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    
    @scala.inline
    def setScroll(value: String): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    
    @scala.inline
    def setScrollHeight(value: Double): Self = this.set("scrollHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollHeight: Self = this.set("scrollHeight", js.undefined)
    
    @scala.inline
    def setScrollPos(value: Double): Self = this.set("scrollPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPos: Self = this.set("scrollPos", js.undefined)
    
    @scala.inline
    def setScrollSize(value: Double): Self = this.set("scrollSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSize: Self = this.set("scrollSize", js.undefined)
    
    @scala.inline
    def setScrollStep(value: Double): Self = this.set("scrollStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollStep: Self = this.set("scrollStep", js.undefined)
    
    @scala.inline
    def setScrollVisible(value: Boolean): Self = this.set("scrollVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollVisible: Self = this.set("scrollVisible", js.undefined)
    
    @scala.inline
    def setScrollWidth(value: Double): Self = this.set("scrollWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollWidth: Self = this.set("scrollWidth", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
