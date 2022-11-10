package typings.webix.webix.ui

import typings.std.HTMLElement
import typings.webix.webix.EventHash
import typings.webix.webix.WebixCallback
import typings.webix.webix.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait submenuConfig extends StObject {
  
  var animate: js.UndefOr[Boolean | obj] = js.undefined
  
  var autofit: js.UndefOr[Boolean] = js.undefined
  
  var autofocus: js.UndefOr[Boolean] = js.undefined
  
  var autoheight: js.UndefOr[Boolean] = js.undefined
  
  var autowidth: js.UndefOr[Boolean] = js.undefined
  
  var body: js.UndefOr[String | obj] = js.undefined
  
  var borderless: js.UndefOr[Boolean] = js.undefined
  
  var click: js.UndefOr[String | WebixCallback] = js.undefined
  
  var clipboard: js.UndefOr[Boolean | String] = js.undefined
  
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  
  var css: js.UndefOr[String | obj] = js.undefined
  
  var data: js.UndefOr[String | js.Array[Any] | obj] = js.undefined
  
  var datathrottle: js.UndefOr[Double] = js.undefined
  
  var datatype: js.UndefOr[String] = js.undefined
  
  var delimiter: js.UndefOr[obj] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var drag: js.UndefOr[Boolean | String] = js.undefined
  
  var dragscroll: js.UndefOr[Boolean | String] = js.undefined
  
  var escHide: js.UndefOr[Boolean] = js.undefined
  
  var externalData: js.UndefOr[WebixCallback] = js.undefined
  
  var gravity: js.UndefOr[Double] = js.undefined
  
  var head: js.UndefOr[obj | String] = js.undefined
  
  var headHeight: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String | Double] = js.undefined
  
  var item: js.UndefOr[obj] = js.undefined
  
  var keyPressTimeout: js.UndefOr[Double] = js.undefined
  
  var layout: js.UndefOr[String] = js.undefined
  
  var left: js.UndefOr[Double] = js.undefined
  
  var master: js.UndefOr[String] = js.undefined
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var modal: js.UndefOr[Boolean] = js.undefined
  
  var mouseEventDelay: js.UndefOr[Double] = js.undefined
  
  var move: js.UndefOr[Boolean] = js.undefined
  
  var multiselect: js.UndefOr[String | Boolean] = js.undefined
  
  var navigation: js.UndefOr[Boolean] = js.undefined
  
  var on: js.UndefOr[EventHash] = js.undefined
  
  var onClick: js.UndefOr[obj] = js.undefined
  
  var onContext: js.UndefOr[obj] = js.undefined
  
  var onDblClick: js.UndefOr[WebixCallback] = js.undefined
  
  var onItemSingleClick: js.UndefOr[WebixCallback] = js.undefined
  
  var onMouseMove: js.UndefOr[WebixCallback] = js.undefined
  
  var openAction: js.UndefOr[String] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var pager: js.UndefOr[String | obj] = js.undefined
  
  var point: js.UndefOr[Boolean] = js.undefined
  
  var position: js.UndefOr[String | WebixCallback] = js.undefined
  
  var prerender: js.UndefOr[Boolean] = js.undefined
  
  var ready: js.UndefOr[WebixCallback] = js.undefined
  
  var relative: js.UndefOr[String] = js.undefined
  
  var removeMissed: js.UndefOr[Boolean] = js.undefined
  
  var resize: js.UndefOr[Boolean] = js.undefined
  
  var rules: js.UndefOr[obj] = js.undefined
  
  var save: js.UndefOr[String | obj] = js.undefined
  
  var scheme: js.UndefOr[obj] = js.undefined
  
  var scroll: js.UndefOr[Boolean | String] = js.undefined
  
  var scrollSpeed: js.UndefOr[String] = js.undefined
  
  var select: js.UndefOr[Boolean | String] = js.undefined
  
  var subMenuPos: js.UndefOr[String] = js.undefined
  
  var submenuConfig: js.UndefOr[obj] = js.undefined
  
  var template: js.UndefOr[String | WebixCallback] = js.undefined
  
  var templateCopy: js.UndefOr[WebixCallback] = js.undefined
  
  var toFront: js.UndefOr[Boolean] = js.undefined
  
  var tooltip: js.UndefOr[String | Boolean | WebixCallback | obj] = js.undefined
  
  var top: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[obj | String] = js.undefined
  
  var url: js.UndefOr[String | WebixCallback | obj] = js.undefined
  
  var view: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var xCount: js.UndefOr[Double] = js.undefined
  
  var yCount: js.UndefOr[Double] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object submenuConfig {
  
  inline def apply(): submenuConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[submenuConfig]
  }
  
  extension [Self <: submenuConfig](x: Self) {
    
    inline def setAnimate(value: Boolean | obj): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setAutofit(value: Boolean): Self = StObject.set(x, "autofit", value.asInstanceOf[js.Any])
    
    inline def setAutofitUndefined: Self = StObject.set(x, "autofit", js.undefined)
    
    inline def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
    
    inline def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
    
    inline def setAutoheight(value: Boolean): Self = StObject.set(x, "autoheight", value.asInstanceOf[js.Any])
    
    inline def setAutoheightUndefined: Self = StObject.set(x, "autoheight", js.undefined)
    
    inline def setAutowidth(value: Boolean): Self = StObject.set(x, "autowidth", value.asInstanceOf[js.Any])
    
    inline def setAutowidthUndefined: Self = StObject.set(x, "autowidth", js.undefined)
    
    inline def setBody(value: String | obj): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    inline def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
    
    inline def setClick(value: String | WebixCallback): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setClipboard(value: Boolean | String): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
    
    inline def setClipboardUndefined: Self = StObject.set(x, "clipboard", js.undefined)
    
    inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCss(value: String | obj): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setData(value: String | js.Array[Any] | obj): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDatathrottle(value: Double): Self = StObject.set(x, "datathrottle", value.asInstanceOf[js.Any])
    
    inline def setDatathrottleUndefined: Self = StObject.set(x, "datathrottle", js.undefined)
    
    inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    inline def setDelimiter(value: obj): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDrag(value: Boolean | String): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setDragscroll(value: Boolean | String): Self = StObject.set(x, "dragscroll", value.asInstanceOf[js.Any])
    
    inline def setDragscrollUndefined: Self = StObject.set(x, "dragscroll", js.undefined)
    
    inline def setEscHide(value: Boolean): Self = StObject.set(x, "escHide", value.asInstanceOf[js.Any])
    
    inline def setEscHideUndefined: Self = StObject.set(x, "escHide", js.undefined)
    
    inline def setExternalData(value: WebixCallback): Self = StObject.set(x, "externalData", value.asInstanceOf[js.Any])
    
    inline def setExternalDataUndefined: Self = StObject.set(x, "externalData", js.undefined)
    
    inline def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
    
    inline def setHead(value: obj | String): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    inline def setHeadHeight(value: Double): Self = StObject.set(x, "headHeight", value.asInstanceOf[js.Any])
    
    inline def setHeadHeightUndefined: Self = StObject.set(x, "headHeight", js.undefined)
    
    inline def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setItem(value: obj): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setKeyPressTimeout(value: Double): Self = StObject.set(x, "keyPressTimeout", value.asInstanceOf[js.Any])
    
    inline def setKeyPressTimeoutUndefined: Self = StObject.set(x, "keyPressTimeout", js.undefined)
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setMaster(value: String): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
    inline def setMasterUndefined: Self = StObject.set(x, "master", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    inline def setMouseEventDelay(value: Double): Self = StObject.set(x, "mouseEventDelay", value.asInstanceOf[js.Any])
    
    inline def setMouseEventDelayUndefined: Self = StObject.set(x, "mouseEventDelay", js.undefined)
    
    inline def setMove(value: Boolean): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    inline def setMultiselect(value: String | Boolean): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
    
    inline def setMultiselectUndefined: Self = StObject.set(x, "multiselect", js.undefined)
    
    inline def setNavigation(value: Boolean): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
    
    inline def setOn(value: EventHash): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: obj): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnContext(value: obj): Self = StObject.set(x, "onContext", value.asInstanceOf[js.Any])
    
    inline def setOnContextUndefined: Self = StObject.set(x, "onContext", js.undefined)
    
    inline def setOnDblClick(value: WebixCallback): Self = StObject.set(x, "onDblClick", value.asInstanceOf[js.Any])
    
    inline def setOnDblClickUndefined: Self = StObject.set(x, "onDblClick", js.undefined)
    
    inline def setOnItemSingleClick(value: WebixCallback): Self = StObject.set(x, "onItemSingleClick", value.asInstanceOf[js.Any])
    
    inline def setOnItemSingleClickUndefined: Self = StObject.set(x, "onItemSingleClick", js.undefined)
    
    inline def setOnMouseMove(value: WebixCallback): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    inline def setOpenAction(value: String): Self = StObject.set(x, "openAction", value.asInstanceOf[js.Any])
    
    inline def setOpenActionUndefined: Self = StObject.set(x, "openAction", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPager(value: String | obj): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
    
    inline def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
    
    inline def setPoint(value: Boolean): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    inline def setPosition(value: String | WebixCallback): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setPrerender(value: Boolean): Self = StObject.set(x, "prerender", value.asInstanceOf[js.Any])
    
    inline def setPrerenderUndefined: Self = StObject.set(x, "prerender", js.undefined)
    
    inline def setReady(value: WebixCallback): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    inline def setRelative(value: String): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
    
    inline def setRemoveMissed(value: Boolean): Self = StObject.set(x, "removeMissed", value.asInstanceOf[js.Any])
    
    inline def setRemoveMissedUndefined: Self = StObject.set(x, "removeMissed", js.undefined)
    
    inline def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setRules(value: obj): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setSave(value: String | obj): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    inline def setScheme(value: obj): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    inline def setScroll(value: Boolean | String): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollSpeed(value: String): Self = StObject.set(x, "scrollSpeed", value.asInstanceOf[js.Any])
    
    inline def setScrollSpeedUndefined: Self = StObject.set(x, "scrollSpeed", js.undefined)
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    inline def setSelect(value: Boolean | String): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSubMenuPos(value: String): Self = StObject.set(x, "subMenuPos", value.asInstanceOf[js.Any])
    
    inline def setSubMenuPosUndefined: Self = StObject.set(x, "subMenuPos", js.undefined)
    
    inline def setSubmenuConfig(value: obj): Self = StObject.set(x, "submenuConfig", value.asInstanceOf[js.Any])
    
    inline def setSubmenuConfigUndefined: Self = StObject.set(x, "submenuConfig", js.undefined)
    
    inline def setTemplate(value: String | WebixCallback): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateCopy(value: WebixCallback): Self = StObject.set(x, "templateCopy", value.asInstanceOf[js.Any])
    
    inline def setTemplateCopyUndefined: Self = StObject.set(x, "templateCopy", js.undefined)
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setToFront(value: Boolean): Self = StObject.set(x, "toFront", value.asInstanceOf[js.Any])
    
    inline def setToFrontUndefined: Self = StObject.set(x, "toFront", js.undefined)
    
    inline def setTooltip(value: String | Boolean | WebixCallback | obj): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setType(value: obj | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String | WebixCallback | obj): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setXCount(value: Double): Self = StObject.set(x, "xCount", value.asInstanceOf[js.Any])
    
    inline def setXCountUndefined: Self = StObject.set(x, "xCount", js.undefined)
    
    inline def setYCount(value: Double): Self = StObject.set(x, "yCount", value.asInstanceOf[js.Any])
    
    inline def setYCountUndefined: Self = StObject.set(x, "yCount", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
