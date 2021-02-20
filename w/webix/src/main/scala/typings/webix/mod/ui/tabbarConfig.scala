package typings.webix.mod.ui

import typings.std.HTMLElement
import typings.webix.mod.EventHash
import typings.webix.mod.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait tabbarConfig extends StObject {
  
  var align: js.UndefOr[String] = js.native
  
  var animate: js.UndefOr[js.Any] = js.native
  
  var attributes: js.UndefOr[js.Any] = js.native
  
  var borderless: js.UndefOr[Boolean] = js.native
  
  var bottomLabel: js.UndefOr[String] = js.native
  
  var bottomOffset: js.UndefOr[Double] = js.native
  
  var bottomPadding: js.UndefOr[Double] = js.native
  
  var click: js.UndefOr[WebixCallback] = js.native
  
  var container: js.UndefOr[String | HTMLElement] = js.native
  
  var css: js.UndefOr[js.Any] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var format: js.UndefOr[js.Any] = js.native
  
  var gravity: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var hotkey: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String | Double] = js.native
  
  var inputAlign: js.UndefOr[String] = js.native
  
  var inputHeight: js.UndefOr[Double] = js.native
  
  var inputWidth: js.UndefOr[Double] = js.native
  
  var invalid: js.UndefOr[Boolean] = js.native
  
  var invalidMessage: js.UndefOr[String] = js.native
  
  var keyPressTimeout: js.UndefOr[Double] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var labelAlign: js.UndefOr[String] = js.native
  
  var labelPosition: js.UndefOr[String] = js.native
  
  var labelWidth: js.UndefOr[Double] = js.native
  
  var maxHeight: js.UndefOr[Double] = js.native
  
  var maxWidth: js.UndefOr[Double] = js.native
  
  var minHeight: js.UndefOr[Double] = js.native
  
  var minWidth: js.UndefOr[Double] = js.native
  
  var moreTemplate: js.UndefOr[WebixCallback] = js.native
  
  var multiview: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var on: js.UndefOr[EventHash] = js.native
  
  var optionWidth: js.UndefOr[Double] = js.native
  
  var options: js.UndefOr[js.Array[_]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var popup: js.UndefOr[String] = js.native
  
  var popupTemplate: js.UndefOr[WebixCallback] = js.native
  
  var popupWidth: js.UndefOr[Double] = js.native
  
  var readonly: js.UndefOr[Boolean] = js.native
  
  var relatedAction: js.UndefOr[String] = js.native
  
  var relatedView: js.UndefOr[String] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var suggest: js.UndefOr[js.Any] = js.native
  
  var tabMargin: js.UndefOr[Double] = js.native
  
  var tabMinWidth: js.UndefOr[Double] = js.native
  
  var tabMoreWidth: js.UndefOr[Double] = js.native
  
  var tabOffset: js.UndefOr[Double] = js.native
  
  var tabbarPopup: js.UndefOr[typings.webix.webix.ui.baseview] = js.native
  
  var tooltip: js.UndefOr[js.Any] = js.native
  
  var topOffset: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var validate: js.UndefOr[WebixCallback] = js.native
  
  var validateEvent: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String | Double] = js.native
  
  var view: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var yCount: js.UndefOr[Double] = js.native
}
object tabbarConfig {
  
  @scala.inline
  def apply(): tabbarConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[tabbarConfig]
  }
  
  @scala.inline
  implicit class tabbarConfigMutableBuilder[Self <: tabbarConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setAnimate(value: js.Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
    
    @scala.inline
    def setBottomLabel(value: String): Self = StObject.set(x, "bottomLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomLabelUndefined: Self = StObject.set(x, "bottomLabel", js.undefined)
    
    @scala.inline
    def setBottomOffset(value: Double): Self = StObject.set(x, "bottomOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomOffsetUndefined: Self = StObject.set(x, "bottomOffset", js.undefined)
    
    @scala.inline
    def setBottomPadding(value: Double): Self = StObject.set(x, "bottomPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomPaddingUndefined: Self = StObject.set(x, "bottomPadding", js.undefined)
    
    @scala.inline
    def setClick(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
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
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setFormat(value: js.Any): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
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
    def setHotkey(value: String): Self = StObject.set(x, "hotkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHotkeyUndefined: Self = StObject.set(x, "hotkey", js.undefined)
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInputAlign(value: String): Self = StObject.set(x, "inputAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputAlignUndefined: Self = StObject.set(x, "inputAlign", js.undefined)
    
    @scala.inline
    def setInputHeight(value: Double): Self = StObject.set(x, "inputHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputHeightUndefined: Self = StObject.set(x, "inputHeight", js.undefined)
    
    @scala.inline
    def setInputWidth(value: Double): Self = StObject.set(x, "inputWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputWidthUndefined: Self = StObject.set(x, "inputWidth", js.undefined)
    
    @scala.inline
    def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidMessage(value: String): Self = StObject.set(x, "invalidMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidMessageUndefined: Self = StObject.set(x, "invalidMessage", js.undefined)
    
    @scala.inline
    def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
    
    @scala.inline
    def setKeyPressTimeout(value: Double): Self = StObject.set(x, "keyPressTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPressTimeoutUndefined: Self = StObject.set(x, "keyPressTimeout", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelAlign(value: String): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
    
    @scala.inline
    def setLabelPosition(value: String): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLabelWidth(value: Double): Self = StObject.set(x, "labelWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelWidthUndefined: Self = StObject.set(x, "labelWidth", js.undefined)
    
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
    def setMoreTemplate(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "moreTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoreTemplateUndefined: Self = StObject.set(x, "moreTemplate", js.undefined)
    
    @scala.inline
    def setMultiview(value: Boolean): Self = StObject.set(x, "multiview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiviewUndefined: Self = StObject.set(x, "multiview", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOn(value: EventHash): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    @scala.inline
    def setOptionWidth(value: Double): Self = StObject.set(x, "optionWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionWidthUndefined: Self = StObject.set(x, "optionWidth", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Array[_]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: js.Any*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupTemplate(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "popupTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPopupTemplateUndefined: Self = StObject.set(x, "popupTemplate", js.undefined)
    
    @scala.inline
    def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    
    @scala.inline
    def setPopupWidth(value: Double): Self = StObject.set(x, "popupWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupWidthUndefined: Self = StObject.set(x, "popupWidth", js.undefined)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    @scala.inline
    def setRelatedAction(value: String): Self = StObject.set(x, "relatedAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedActionUndefined: Self = StObject.set(x, "relatedAction", js.undefined)
    
    @scala.inline
    def setRelatedView(value: String): Self = StObject.set(x, "relatedView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedViewUndefined: Self = StObject.set(x, "relatedView", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setSuggest(value: js.Any): Self = StObject.set(x, "suggest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestUndefined: Self = StObject.set(x, "suggest", js.undefined)
    
    @scala.inline
    def setTabMargin(value: Double): Self = StObject.set(x, "tabMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabMarginUndefined: Self = StObject.set(x, "tabMargin", js.undefined)
    
    @scala.inline
    def setTabMinWidth(value: Double): Self = StObject.set(x, "tabMinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabMinWidthUndefined: Self = StObject.set(x, "tabMinWidth", js.undefined)
    
    @scala.inline
    def setTabMoreWidth(value: Double): Self = StObject.set(x, "tabMoreWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabMoreWidthUndefined: Self = StObject.set(x, "tabMoreWidth", js.undefined)
    
    @scala.inline
    def setTabOffset(value: Double): Self = StObject.set(x, "tabOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabOffsetUndefined: Self = StObject.set(x, "tabOffset", js.undefined)
    
    @scala.inline
    def setTabbarPopup(value: typings.webix.webix.ui.baseview): Self = StObject.set(x, "tabbarPopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabbarPopupUndefined: Self = StObject.set(x, "tabbarPopup", js.undefined)
    
    @scala.inline
    def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setTopOffset(value: Double): Self = StObject.set(x, "topOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopOffsetUndefined: Self = StObject.set(x, "topOffset", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValidate(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateEvent(value: String): Self = StObject.set(x, "validateEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateEventUndefined: Self = StObject.set(x, "validateEvent", js.undefined)
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setYCount(value: Double): Self = StObject.set(x, "yCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYCountUndefined: Self = StObject.set(x, "yCount", js.undefined)
  }
}
