package typings.webix.mod.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.webix.mod.EventHash
import typings.webix.mod.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait submenuConfig extends StObject {
  
  var animate: js.UndefOr[js.Any] = js.undefined
  
  var autofit: js.UndefOr[Boolean] = js.undefined
  
  var autofocus: js.UndefOr[Boolean] = js.undefined
  
  var autoheight: js.UndefOr[Boolean] = js.undefined
  
  var autowidth: js.UndefOr[Boolean] = js.undefined
  
  var body: js.UndefOr[String | typings.webix.webix.ui.baseview] = js.undefined
  
  var borderless: js.UndefOr[Boolean] = js.undefined
  
  var click: js.UndefOr[String | WebixCallback] = js.undefined
  
  var clipboard: js.UndefOr[Boolean | String] = js.undefined
  
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  
  var css: js.UndefOr[js.Any] = js.undefined
  
  var data: js.UndefOr[String | js.Array[js.Any]] = js.undefined
  
  var datathrottle: js.UndefOr[Double] = js.undefined
  
  var datatype: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var drag: js.UndefOr[Boolean | String] = js.undefined
  
  var dragscroll: js.UndefOr[Boolean | String] = js.undefined
  
  var externalData: js.UndefOr[WebixCallback] = js.undefined
  
  var gravity: js.UndefOr[Double] = js.undefined
  
  var head: js.UndefOr[js.Any] = js.undefined
  
  var headHeight: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String | Double] = js.undefined
  
  var item: js.UndefOr[js.Any] = js.undefined
  
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
  
  var onClick: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var onContext: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var onDblClick: js.UndefOr[WebixCallback] = js.undefined
  
  var onMouseMove: js.UndefOr[WebixCallback] = js.undefined
  
  var openAction: js.UndefOr[String] = js.undefined
  
  var padding: js.UndefOr[js.Any] = js.undefined
  
  var pager: js.UndefOr[js.Any] = js.undefined
  
  var point: js.UndefOr[Boolean] = js.undefined
  
  var position: js.UndefOr[String | WebixCallback] = js.undefined
  
  var ready: js.UndefOr[WebixCallback] = js.undefined
  
  var relative: js.UndefOr[String] = js.undefined
  
  var removeMissed: js.UndefOr[Boolean] = js.undefined
  
  var resize: js.UndefOr[Boolean] = js.undefined
  
  var rules: js.UndefOr[js.Any] = js.undefined
  
  var save: js.UndefOr[js.Any] = js.undefined
  
  var scheme: js.UndefOr[js.Any] = js.undefined
  
  var scroll: js.UndefOr[Boolean | String] = js.undefined
  
  var scrollSpeed: js.UndefOr[String] = js.undefined
  
  var select: js.UndefOr[Boolean | String] = js.undefined
  
  var subMenuPos: js.UndefOr[String] = js.undefined
  
  var submenuConfig: js.UndefOr[js.Any] = js.undefined
  
  var template: js.UndefOr[String | WebixCallback] = js.undefined
  
  var templateCopy: js.UndefOr[WebixCallback] = js.undefined
  
  var toFront: js.UndefOr[Boolean] = js.undefined
  
  var tooltip: js.UndefOr[js.Any] = js.undefined
  
  var top: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[js.Any] = js.undefined
  
  var url: js.UndefOr[js.Any] = js.undefined
  
  var view: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var xCount: js.UndefOr[Double] = js.undefined
  
  var yCount: js.UndefOr[Double] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object submenuConfig {
  
  @scala.inline
  def apply(): submenuConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[submenuConfig]
  }
  
  @scala.inline
  implicit class submenuConfigMutableBuilder[Self <: submenuConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: js.Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setAutofit(value: Boolean): Self = StObject.set(x, "autofit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutofitUndefined: Self = StObject.set(x, "autofit", js.undefined)
    
    @scala.inline
    def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
    
    @scala.inline
    def setAutoheight(value: Boolean): Self = StObject.set(x, "autoheight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoheightUndefined: Self = StObject.set(x, "autoheight", js.undefined)
    
    @scala.inline
    def setAutowidth(value: Boolean): Self = StObject.set(x, "autowidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutowidthUndefined: Self = StObject.set(x, "autowidth", js.undefined)
    
    @scala.inline
    def setBody(value: String | typings.webix.webix.ui.baseview): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
    
    @scala.inline
    def setClick(value: String | WebixCallback): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setClipboard(value: Boolean | String): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipboardUndefined: Self = StObject.set(x, "clipboard", js.undefined)
    
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
    def setHead(value: js.Any): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadHeight(value: Double): Self = StObject.set(x, "headHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadHeightUndefined: Self = StObject.set(x, "headHeight", js.undefined)
    
    @scala.inline
    def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
    
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
    def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setMaster(value: String): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
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
    def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    @scala.inline
    def setMouseEventDelay(value: Double): Self = StObject.set(x, "mouseEventDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseEventDelayUndefined: Self = StObject.set(x, "mouseEventDelay", js.undefined)
    
    @scala.inline
    def setMove(value: Boolean): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
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
    def setOpenAction(value: String): Self = StObject.set(x, "openAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenActionUndefined: Self = StObject.set(x, "openAction", js.undefined)
    
    @scala.inline
    def setPadding(value: js.Any): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPager(value: js.Any): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
    
    @scala.inline
    def setPoint(value: Boolean): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    @scala.inline
    def setPosition(value: String | WebixCallback): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setReady(value: WebixCallback): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    @scala.inline
    def setRelative(value: String): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
    
    @scala.inline
    def setRemoveMissed(value: Boolean): Self = StObject.set(x, "removeMissed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveMissedUndefined: Self = StObject.set(x, "removeMissed", js.undefined)
    
    @scala.inline
    def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
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
    def setSubMenuPos(value: String): Self = StObject.set(x, "subMenuPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubMenuPosUndefined: Self = StObject.set(x, "subMenuPos", js.undefined)
    
    @scala.inline
    def setSubmenuConfig(value: js.Any): Self = StObject.set(x, "submenuConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmenuConfigUndefined: Self = StObject.set(x, "submenuConfig", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | WebixCallback): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateCopy(value: WebixCallback): Self = StObject.set(x, "templateCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateCopyUndefined: Self = StObject.set(x, "templateCopy", js.undefined)
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setToFront(value: Boolean): Self = StObject.set(x, "toFront", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToFrontUndefined: Self = StObject.set(x, "toFront", js.undefined)
    
    @scala.inline
    def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
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
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
