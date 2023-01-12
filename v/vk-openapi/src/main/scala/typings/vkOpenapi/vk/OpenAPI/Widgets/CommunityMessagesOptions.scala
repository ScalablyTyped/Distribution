package typings.vkOpenapi.vk.OpenAPI.Widgets

import typings.vkOpenapi.vk.OpenAPI.NumericBoolean
import typings.vkOpenapi.vkOpenapiInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommunityMessagesOptions extends StObject {
  
  var buttonType: js.UndefOr[String] = js.undefined
  
  var disableButtonTooltip: js.UndefOr[`1`] = js.undefined
  
  var disableExpandChatSound: js.UndefOr[`1`] = js.undefined
  
  var disableNewMessagesSound: js.UndefOr[`1`] = js.undefined
  
  var disableTitleChange: js.UndefOr[`1`] = js.undefined
  
  var expandTimeout: js.UndefOr[Double] = js.undefined
  
  var expanded: js.UndefOr[`1`] = js.undefined
  
  var onCanNotWrite: js.UndefOr[js.Function1[/* reason */ OnCanNotWriteReason, Unit]] = js.undefined
  
  var tooltipButtonText: js.UndefOr[String] = js.undefined
  
  var welcomeScreen: js.UndefOr[NumericBoolean] = js.undefined
  
  var widgetPosition: js.UndefOr[String] = js.undefined
}
object CommunityMessagesOptions {
  
  inline def apply(): CommunityMessagesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommunityMessagesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommunityMessagesOptions] (val x: Self) extends AnyVal {
    
    inline def setButtonType(value: String): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
    
    inline def setButtonTypeUndefined: Self = StObject.set(x, "buttonType", js.undefined)
    
    inline def setDisableButtonTooltip(value: `1`): Self = StObject.set(x, "disableButtonTooltip", value.asInstanceOf[js.Any])
    
    inline def setDisableButtonTooltipUndefined: Self = StObject.set(x, "disableButtonTooltip", js.undefined)
    
    inline def setDisableExpandChatSound(value: `1`): Self = StObject.set(x, "disableExpandChatSound", value.asInstanceOf[js.Any])
    
    inline def setDisableExpandChatSoundUndefined: Self = StObject.set(x, "disableExpandChatSound", js.undefined)
    
    inline def setDisableNewMessagesSound(value: `1`): Self = StObject.set(x, "disableNewMessagesSound", value.asInstanceOf[js.Any])
    
    inline def setDisableNewMessagesSoundUndefined: Self = StObject.set(x, "disableNewMessagesSound", js.undefined)
    
    inline def setDisableTitleChange(value: `1`): Self = StObject.set(x, "disableTitleChange", value.asInstanceOf[js.Any])
    
    inline def setDisableTitleChangeUndefined: Self = StObject.set(x, "disableTitleChange", js.undefined)
    
    inline def setExpandTimeout(value: Double): Self = StObject.set(x, "expandTimeout", value.asInstanceOf[js.Any])
    
    inline def setExpandTimeoutUndefined: Self = StObject.set(x, "expandTimeout", js.undefined)
    
    inline def setExpanded(value: `1`): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setOnCanNotWrite(value: /* reason */ OnCanNotWriteReason => Unit): Self = StObject.set(x, "onCanNotWrite", js.Any.fromFunction1(value))
    
    inline def setOnCanNotWriteUndefined: Self = StObject.set(x, "onCanNotWrite", js.undefined)
    
    inline def setTooltipButtonText(value: String): Self = StObject.set(x, "tooltipButtonText", value.asInstanceOf[js.Any])
    
    inline def setTooltipButtonTextUndefined: Self = StObject.set(x, "tooltipButtonText", js.undefined)
    
    inline def setWelcomeScreen(value: NumericBoolean): Self = StObject.set(x, "welcomeScreen", value.asInstanceOf[js.Any])
    
    inline def setWelcomeScreenUndefined: Self = StObject.set(x, "welcomeScreen", js.undefined)
    
    inline def setWidgetPosition(value: String): Self = StObject.set(x, "widgetPosition", value.asInstanceOf[js.Any])
    
    inline def setWidgetPositionUndefined: Self = StObject.set(x, "widgetPosition", js.undefined)
  }
}
