package typings.vkOpenapi.vk.OpenAPI.Widgets

import typings.vkOpenapi.vk.OpenAPI.NumericBoolean
import typings.vkOpenapi.vkOpenapiNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommunityMessagesOptions extends js.Object {
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
  @scala.inline
  def apply(
    buttonType: String = null,
    disableButtonTooltip: `1` = null,
    disableExpandChatSound: `1` = null,
    disableNewMessagesSound: `1` = null,
    disableTitleChange: `1` = null,
    expandTimeout: js.UndefOr[Double] = js.undefined,
    expanded: `1` = null,
    onCanNotWrite: /* reason */ OnCanNotWriteReason => Unit = null,
    tooltipButtonText: String = null,
    welcomeScreen: NumericBoolean = null,
    widgetPosition: String = null
  ): CommunityMessagesOptions = {
    val __obj = js.Dynamic.literal()
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType.asInstanceOf[js.Any])
    if (disableButtonTooltip != null) __obj.updateDynamic("disableButtonTooltip")(disableButtonTooltip.asInstanceOf[js.Any])
    if (disableExpandChatSound != null) __obj.updateDynamic("disableExpandChatSound")(disableExpandChatSound.asInstanceOf[js.Any])
    if (disableNewMessagesSound != null) __obj.updateDynamic("disableNewMessagesSound")(disableNewMessagesSound.asInstanceOf[js.Any])
    if (disableTitleChange != null) __obj.updateDynamic("disableTitleChange")(disableTitleChange.asInstanceOf[js.Any])
    if (!js.isUndefined(expandTimeout)) __obj.updateDynamic("expandTimeout")(expandTimeout.get.asInstanceOf[js.Any])
    if (expanded != null) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (onCanNotWrite != null) __obj.updateDynamic("onCanNotWrite")(js.Any.fromFunction1(onCanNotWrite))
    if (tooltipButtonText != null) __obj.updateDynamic("tooltipButtonText")(tooltipButtonText.asInstanceOf[js.Any])
    if (welcomeScreen != null) __obj.updateDynamic("welcomeScreen")(welcomeScreen.asInstanceOf[js.Any])
    if (widgetPosition != null) __obj.updateDynamic("widgetPosition")(widgetPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommunityMessagesOptions]
  }
}

