package typings.vkOpenapi.vk.OpenAPI.Widgets

import typings.vkOpenapi.vk.OpenAPI.NumericBoolean
import typings.vkOpenapi.vkOpenapiNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommunityMessagesOptions extends js.Object {
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
  implicit class CommunityMessagesOptionsOps[Self <: CommunityMessagesOptions] (val x: Self) extends AnyVal {
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
    def setButtonType(value: String): Self = this.set("buttonType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonType: Self = this.set("buttonType", js.undefined)
    @scala.inline
    def setDisableButtonTooltip(value: `1`): Self = this.set("disableButtonTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableButtonTooltip: Self = this.set("disableButtonTooltip", js.undefined)
    @scala.inline
    def setDisableExpandChatSound(value: `1`): Self = this.set("disableExpandChatSound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableExpandChatSound: Self = this.set("disableExpandChatSound", js.undefined)
    @scala.inline
    def setDisableNewMessagesSound(value: `1`): Self = this.set("disableNewMessagesSound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableNewMessagesSound: Self = this.set("disableNewMessagesSound", js.undefined)
    @scala.inline
    def setDisableTitleChange(value: `1`): Self = this.set("disableTitleChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableTitleChange: Self = this.set("disableTitleChange", js.undefined)
    @scala.inline
    def setExpandTimeout(value: Double): Self = this.set("expandTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandTimeout: Self = this.set("expandTimeout", js.undefined)
    @scala.inline
    def setExpanded(value: `1`): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    @scala.inline
    def setOnCanNotWrite(value: /* reason */ OnCanNotWriteReason => Unit): Self = this.set("onCanNotWrite", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCanNotWrite: Self = this.set("onCanNotWrite", js.undefined)
    @scala.inline
    def setTooltipButtonText(value: String): Self = this.set("tooltipButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipButtonText: Self = this.set("tooltipButtonText", js.undefined)
    @scala.inline
    def setWelcomeScreen(value: NumericBoolean): Self = this.set("welcomeScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWelcomeScreen: Self = this.set("welcomeScreen", js.undefined)
    @scala.inline
    def setWidgetPosition(value: String): Self = this.set("widgetPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidgetPosition: Self = this.set("widgetPosition", js.undefined)
  }
  
}

