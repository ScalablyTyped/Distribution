package typings.webix.webix.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.webix.webix.EventHash
import typings.webix.webix.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait pagerConfig extends StObject {
  
  var animate: js.UndefOr[js.Any] = js.undefined
  
  var apiOnly: js.UndefOr[Boolean] = js.undefined
  
  var borderless: js.UndefOr[Boolean] = js.undefined
  
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  
  var count: js.UndefOr[Double] = js.undefined
  
  var css: js.UndefOr[js.Any] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var gravity: js.UndefOr[Double] = js.undefined
  
  var group: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String | Double] = js.undefined
  
  var keyPressTimeout: js.UndefOr[Double] = js.undefined
  
  var level: js.UndefOr[Double] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var master: js.UndefOr[Boolean] = js.undefined
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var mouseEventDelay: js.UndefOr[Double] = js.undefined
  
  var on: js.UndefOr[EventHash] = js.undefined
  
  var onClick: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var onContext: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var onDblClick: js.UndefOr[WebixCallback] = js.undefined
  
  var onMouseMove: js.UndefOr[WebixCallback] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var template: js.UndefOr[String | WebixCallback] = js.undefined
  
  var view: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object pagerConfig {
  
  @scala.inline
  def apply(): pagerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pagerConfig]
  }
  
  @scala.inline
  implicit class pagerConfigMutableBuilder[Self <: pagerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: js.Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setApiOnly(value: Boolean): Self = StObject.set(x, "apiOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiOnlyUndefined: Self = StObject.set(x, "apiOnly", js.undefined)
    
    @scala.inline
    def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
    
    @scala.inline
    def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setCss(value: js.Any): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
    
    @scala.inline
    def setGroup(value: Double): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKeyPressTimeout(value: Double): Self = StObject.set(x, "keyPressTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPressTimeoutUndefined: Self = StObject.set(x, "keyPressTimeout", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setMaster(value: Boolean): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUndefined: Self = StObject.set(x, "master", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setMouseEventDelay(value: Double): Self = StObject.set(x, "mouseEventDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseEventDelayUndefined: Self = StObject.set(x, "mouseEventDelay", js.undefined)
    
    @scala.inline
    def setOn(value: EventHash): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: StringDictionary[js.Any]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnContext(value: StringDictionary[js.Any]): Self = StObject.set(x, "onContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnContextUndefined: Self = StObject.set(x, "onContext", js.undefined)
    
    @scala.inline
    def setOnDblClick(value: WebixCallback): Self = StObject.set(x, "onDblClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDblClickUndefined: Self = StObject.set(x, "onDblClick", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: WebixCallback): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    @scala.inline
    def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | WebixCallback): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
