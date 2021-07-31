package typings.webix.mod.ui

import typings.std.HTMLElement
import typings.webix.mod.EventHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait vscrollConfig extends StObject {
  
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  
  var id: js.UndefOr[String | Double] = js.undefined
  
  var on: js.UndefOr[EventHash] = js.undefined
  
  var scroll: js.UndefOr[String] = js.undefined
  
  var scrollHeight: js.UndefOr[Double] = js.undefined
  
  var scrollPos: js.UndefOr[Double] = js.undefined
  
  var scrollSize: js.UndefOr[Double] = js.undefined
  
  var scrollStep: js.UndefOr[Double] = js.undefined
  
  var scrollVisible: js.UndefOr[Boolean] = js.undefined
  
  var scrollWidth: js.UndefOr[Double] = js.undefined
  
  var view: js.UndefOr[String] = js.undefined
  
  var zoom: js.UndefOr[Double] = js.undefined
}
object vscrollConfig {
  
  @scala.inline
  def apply(): vscrollConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[vscrollConfig]
  }
  
  @scala.inline
  implicit class vscrollConfigMutableBuilder[Self <: vscrollConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setOn(value: EventHash): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    @scala.inline
    def setScroll(value: String): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollHeightUndefined: Self = StObject.set(x, "scrollHeight", js.undefined)
    
    @scala.inline
    def setScrollPos(value: Double): Self = StObject.set(x, "scrollPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPosUndefined: Self = StObject.set(x, "scrollPos", js.undefined)
    
    @scala.inline
    def setScrollSize(value: Double): Self = StObject.set(x, "scrollSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollSizeUndefined: Self = StObject.set(x, "scrollSize", js.undefined)
    
    @scala.inline
    def setScrollStep(value: Double): Self = StObject.set(x, "scrollStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollStepUndefined: Self = StObject.set(x, "scrollStep", js.undefined)
    
    @scala.inline
    def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    @scala.inline
    def setScrollVisible(value: Boolean): Self = StObject.set(x, "scrollVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollVisibleUndefined: Self = StObject.set(x, "scrollVisible", js.undefined)
    
    @scala.inline
    def setScrollWidth(value: Double): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollWidthUndefined: Self = StObject.set(x, "scrollWidth", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
