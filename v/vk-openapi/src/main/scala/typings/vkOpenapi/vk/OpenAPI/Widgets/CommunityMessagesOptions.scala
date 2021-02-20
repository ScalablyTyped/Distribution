package typings.vkOpenapi.vk.OpenAPI.Widgets

import typings.vkOpenapi.vk.OpenAPI.NumericBoolean
import typings.vkOpenapi.vkOpenapiNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommunityMessagesOptions extends StObject {
  
  var buttonType: js.UndefOr[String] = js.native
  
  var disableButtonTooltip: js.UndefOr[`1`] = js.native
  
  var disableExpandChatSound: js.UndefOr[`1`] = js.native
  
  var disableNewMessagesSound: js.UndefOr[`1`] = js.native
  
  var disableTitleChange: js.UndefOr[`1`] = js.native
  
  var expandTimeout: js.UndefOr[Double] = js.native
  
  var expanded: js.UndefOr[`1`] = js.native
  
  var onCanNotWrite: js.UndefOr[js.Function1[/* reason */ OnCanNotWriteReason, Unit]] = js.native
  
  var tooltipButtonText: js.UndefOr[String] = js.native
  
  var welcomeScreen: js.UndefOr[NumericBoolean] = js.native
  
  var widgetPosition: js.UndefOr[String] = js.native
}
object CommunityMessagesOptions {
  
  @scala.inline
  def apply(): CommunityMessagesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommunityMessagesOptions]
  }
  
  @scala.inline
  implicit class CommunityMessagesOptionsMutableBuilder[Self <: CommunityMessagesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonType(value: String): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonTypeUndefined: Self = StObject.set(x, "buttonType", js.undefined)
    
    @scala.inline
    def setDisableButtonTooltip(value: `1`): Self = StObject.set(x, "disableButtonTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableButtonTooltipUndefined: Self = StObject.set(x, "disableButtonTooltip", js.undefined)
    
    @scala.inline
    def setDisableExpandChatSound(value: `1`): Self = StObject.set(x, "disableExpandChatSound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableExpandChatSoundUndefined: Self = StObject.set(x, "disableExpandChatSound", js.undefined)
    
    @scala.inline
    def setDisableNewMessagesSound(value: `1`): Self = StObject.set(x, "disableNewMessagesSound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableNewMessagesSoundUndefined: Self = StObject.set(x, "disableNewMessagesSound", js.undefined)
    
    @scala.inline
    def setDisableTitleChange(value: `1`): Self = StObject.set(x, "disableTitleChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableTitleChangeUndefined: Self = StObject.set(x, "disableTitleChange", js.undefined)
    
    @scala.inline
    def setExpandTimeout(value: Double): Self = StObject.set(x, "expandTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandTimeoutUndefined: Self = StObject.set(x, "expandTimeout", js.undefined)
    
    @scala.inline
    def setExpanded(value: `1`): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    @scala.inline
    def setOnCanNotWrite(value: /* reason */ OnCanNotWriteReason => Unit): Self = StObject.set(x, "onCanNotWrite", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCanNotWriteUndefined: Self = StObject.set(x, "onCanNotWrite", js.undefined)
    
    @scala.inline
    def setTooltipButtonText(value: String): Self = StObject.set(x, "tooltipButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipButtonTextUndefined: Self = StObject.set(x, "tooltipButtonText", js.undefined)
    
    @scala.inline
    def setWelcomeScreen(value: NumericBoolean): Self = StObject.set(x, "welcomeScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWelcomeScreenUndefined: Self = StObject.set(x, "welcomeScreen", js.undefined)
    
    @scala.inline
    def setWidgetPosition(value: String): Self = StObject.set(x, "widgetPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetPositionUndefined: Self = StObject.set(x, "widgetPosition", js.undefined)
  }
}
