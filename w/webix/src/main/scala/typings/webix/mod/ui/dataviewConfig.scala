package typings.webix.mod.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.webix.mod.EventHash
import typings.webix.mod.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dataviewConfig extends StObject {
  
  var animate: js.UndefOr[js.Any] = js.undefined
  
  var autoheight: js.UndefOr[Boolean] = js.undefined
  
  var borderless: js.UndefOr[Boolean] = js.undefined
  
  var click: js.UndefOr[String | WebixCallback] = js.undefined
  
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  
  var css: js.UndefOr[js.Any] = js.undefined
  
  var data: js.UndefOr[String | js.Array[js.Any]] = js.undefined
  
  var datafetch: js.UndefOr[Double] = js.undefined
  
  var datathrottle: js.UndefOr[Double] = js.undefined
  
  var datatype: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var drag: js.UndefOr[Boolean | String] = js.undefined
  
  var dragscroll: js.UndefOr[Boolean | String] = js.undefined
  
  var externalData: js.UndefOr[WebixCallback] = js.undefined
  
  var gravity: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String | Double] = js.undefined
  
  var item: js.UndefOr[js.Any] = js.undefined
  
  var keyPressTimeout: js.UndefOr[Double] = js.undefined
  
  var loadahead: js.UndefOr[Double] = js.undefined
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var mouseEventDelay: js.UndefOr[Double] = js.undefined
  
  var multiselect: js.UndefOr[String | Boolean] = js.undefined
  
  var navigation: js.UndefOr[Boolean] = js.undefined
  
  var on: js.UndefOr[EventHash] = js.undefined
  
  var onClick: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var onContext: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var onDblClick: js.UndefOr[WebixCallback] = js.undefined
  
  var onMouseMove: js.UndefOr[WebixCallback] = js.undefined
  
  var pager: js.UndefOr[js.Any] = js.undefined
  
  var prerender: js.UndefOr[Boolean] = js.undefined
  
  var ready: js.UndefOr[WebixCallback] = js.undefined
  
  var removeMissed: js.UndefOr[Boolean] = js.undefined
  
  var rules: js.UndefOr[js.Any] = js.undefined
  
  var save: js.UndefOr[js.Any] = js.undefined
  
  var scheme: js.UndefOr[js.Any] = js.undefined
  
  var scroll: js.UndefOr[Boolean | String] = js.undefined
  
  var scrollSpeed: js.UndefOr[String] = js.undefined
  
  var select: js.UndefOr[Boolean | String] = js.undefined
  
  var sizeToContent: js.UndefOr[Boolean] = js.undefined
  
  var template: js.UndefOr[String | WebixCallback] = js.undefined
  
  var tooltip: js.UndefOr[js.Any] = js.undefined
  
  var `type`: js.UndefOr[js.Any] = js.undefined
  
  var url: js.UndefOr[js.Any] = js.undefined
  
  var view: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var xCount: js.UndefOr[Double] = js.undefined
  
  var yCount: js.UndefOr[Double] = js.undefined
}
object dataviewConfig {
  
  @scala.inline
  def apply(): dataviewConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dataviewConfig]
  }
  
  @scala.inline
  implicit class dataviewConfigMutableBuilder[Self <: dataviewConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: js.Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setAutoheight(value: Boolean): Self = StObject.set(x, "autoheight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoheightUndefined: Self = StObject.set(x, "autoheight", js.undefined)
    
    @scala.inline
    def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
    
    @scala.inline
    def setClick(value: String | WebixCallback): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setCss(value: js.Any): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    @scala.inline
    def setData(value: String | js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setDatafetch(value: Double): Self = StObject.set(x, "datafetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatafetchUndefined: Self = StObject.set(x, "datafetch", js.undefined)
    
    @scala.inline
    def setDatathrottle(value: Double): Self = StObject.set(x, "datathrottle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatathrottleUndefined: Self = StObject.set(x, "datathrottle", js.undefined)
    
    @scala.inline
    def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDrag(value: Boolean | String): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    @scala.inline
    def setDragscroll(value: Boolean | String): Self = StObject.set(x, "dragscroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragscrollUndefined: Self = StObject.set(x, "dragscroll", js.undefined)
    
    @scala.inline
    def setExternalData(value: WebixCallback): Self = StObject.set(x, "externalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalDataUndefined: Self = StObject.set(x, "externalData", js.undefined)
    
    @scala.inline
    def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
    
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
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setKeyPressTimeout(value: Double): Self = StObject.set(x, "keyPressTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPressTimeoutUndefined: Self = StObject.set(x, "keyPressTimeout", js.undefined)
    
    @scala.inline
    def setLoadahead(value: Double): Self = StObject.set(x, "loadahead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadaheadUndefined: Self = StObject.set(x, "loadahead", js.undefined)
    
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
    def setMultiselect(value: String | Boolean): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiselectUndefined: Self = StObject.set(x, "multiselect", js.undefined)
    
    @scala.inline
    def setNavigation(value: Boolean): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
    
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
    def setPager(value: js.Any): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
    
    @scala.inline
    def setPrerender(value: Boolean): Self = StObject.set(x, "prerender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrerenderUndefined: Self = StObject.set(x, "prerender", js.undefined)
    
    @scala.inline
    def setReady(value: WebixCallback): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    @scala.inline
    def setRemoveMissed(value: Boolean): Self = StObject.set(x, "removeMissed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveMissedUndefined: Self = StObject.set(x, "removeMissed", js.undefined)
    
    @scala.inline
    def setRules(value: js.Any): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setSave(value: js.Any): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    @scala.inline
    def setScheme(value: js.Any): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    @scala.inline
    def setScroll(value: Boolean | String): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollSpeed(value: String): Self = StObject.set(x, "scrollSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollSpeedUndefined: Self = StObject.set(x, "scrollSpeed", js.undefined)
    
    @scala.inline
    def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    @scala.inline
    def setSelect(value: Boolean | String): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSizeToContent(value: Boolean): Self = StObject.set(x, "sizeToContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeToContentUndefined: Self = StObject.set(x, "sizeToContent", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | WebixCallback): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: js.Any): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setXCount(value: Double): Self = StObject.set(x, "xCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXCountUndefined: Self = StObject.set(x, "xCount", js.undefined)
    
    @scala.inline
    def setYCount(value: Double): Self = StObject.set(x, "yCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYCountUndefined: Self = StObject.set(x, "yCount", js.undefined)
  }
}
