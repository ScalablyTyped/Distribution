package typings.uifabricStyling.isemantictextcolorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISemanticTextColors extends js.Object {
  /**
    * Color of text for accent button (kicker)
    */
  var accentButtonText: String = js.native
  /**
    * Neutral colored links and links for action buttons.
    */
  var actionLink: String = js.native
  /**
    * Hover state for neutral colored links and links for action buttons.
    */
  var actionLinkHovered: String = js.native
  /**
    * De-emphasized text; e.g. metadata, captions, placeholder text.
    */
  var bodySubtext: String = js.native
  /**
    * The default color for text.
    */
  var bodyText: String = js.native
  /**
    * Checked text color, e.g. selected menu item text.
    */
  var bodyTextChecked: String = js.native
  /**
    * Color of text in a standard button
    */
  var buttonText: String = js.native
  /**
    * Color of text in a checked standard button
    */
  var buttonTextChecked: String = js.native
  /**
    * Color of text in a checked and hovered standard button
    */
  var buttonTextCheckedHovered: String = js.native
  /**
    * Color of text in a disabled standard button
    */
  var buttonTextDisabled: String = js.native
  /**
    * Color of text in a hovered standard button
    */
  var buttonTextHovered: String = js.native
  /**
    * Color of text in a pressed standard button; i.e. currently being clicked by mouse
    */
  var buttonTextPressed: String = js.native
  /**
    * Disabled de-emphasized text, for use on the default background (bodyBackground).
    */
  var disabledBodySubtext: String = js.native
  /**
    * The default color for disabled text on the default background (bodyBackground).
    */
  var disabledBodyText: String = js.native
  /**
    * Disabled de-emphasized text, for use on disabledBackground.
    */
  var disabledSubtext: String = js.native
  /**
    * The default color for disabled text on top of disabledBackground; e.g. text in a disabled text field or
    * disabled button text.
    */
  var disabledText: String = js.native
  /**
    * The default color of error text on bodyBackground.
    */
  var errorText: String = js.native
  /**
    * The color of placeholder text.
    */
  var inputPlaceholderText: String = js.native
  /**
    * The color of input text.
    */
  var inputText: String = js.native
  /**
    * The color of input text on hover.
    */
  var inputTextHovered: String = js.native
  /**
    * The color of a link.
    */
  var link: String = js.native
  /**
    * The color of a hovered link. Also used when the link is active.
    */
  var linkHovered: String = js.native
  /**
    * The default text color for list item titles and text in column fields.
    */
  var listText: String = js.native
  /** @deprecated
    * This slot was incorrectly named. Use listText instead. */
  var listTextColor: String = js.native
  /**
    * The default color of text in a message bar.
    */
  var messageText: String = js.native
  /**
    * Color of text in a primary button
    */
  var primaryButtonText: String = js.native
  /**
    * Color of text in a disabled primary button
    */
  var primaryButtonTextDisabled: String = js.native
  /**
    * Color of text in a hovered primary button
    */
  var primaryButtonTextHovered: String = js.native
  /**
    * Color of text in a pressed primary button; i.e. currently being clicked by mouse
    */
  var primaryButtonTextPressed: String = js.native
  /** @deprecated
    * No longer used. Consider using messageText and/or successIcon instead.
    */
  var successText: String = js.native
  /** @deprecated
    * No longer used. Consider using messageText and/or warningIcon instead.
    */
  var warningText: String = js.native
}

object ISemanticTextColors {
  @scala.inline
  def apply(
    accentButtonText: String,
    actionLink: String,
    actionLinkHovered: String,
    bodySubtext: String,
    bodyText: String,
    bodyTextChecked: String,
    buttonText: String,
    buttonTextChecked: String,
    buttonTextCheckedHovered: String,
    buttonTextDisabled: String,
    buttonTextHovered: String,
    buttonTextPressed: String,
    disabledBodySubtext: String,
    disabledBodyText: String,
    disabledSubtext: String,
    disabledText: String,
    errorText: String,
    inputPlaceholderText: String,
    inputText: String,
    inputTextHovered: String,
    link: String,
    linkHovered: String,
    listText: String,
    listTextColor: String,
    messageText: String,
    primaryButtonText: String,
    primaryButtonTextDisabled: String,
    primaryButtonTextHovered: String,
    primaryButtonTextPressed: String,
    successText: String,
    warningText: String
  ): ISemanticTextColors = {
    val __obj = js.Dynamic.literal(accentButtonText = accentButtonText.asInstanceOf[js.Any], actionLink = actionLink.asInstanceOf[js.Any], actionLinkHovered = actionLinkHovered.asInstanceOf[js.Any], bodySubtext = bodySubtext.asInstanceOf[js.Any], bodyText = bodyText.asInstanceOf[js.Any], bodyTextChecked = bodyTextChecked.asInstanceOf[js.Any], buttonText = buttonText.asInstanceOf[js.Any], buttonTextChecked = buttonTextChecked.asInstanceOf[js.Any], buttonTextCheckedHovered = buttonTextCheckedHovered.asInstanceOf[js.Any], buttonTextDisabled = buttonTextDisabled.asInstanceOf[js.Any], buttonTextHovered = buttonTextHovered.asInstanceOf[js.Any], buttonTextPressed = buttonTextPressed.asInstanceOf[js.Any], disabledBodySubtext = disabledBodySubtext.asInstanceOf[js.Any], disabledBodyText = disabledBodyText.asInstanceOf[js.Any], disabledSubtext = disabledSubtext.asInstanceOf[js.Any], disabledText = disabledText.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], inputPlaceholderText = inputPlaceholderText.asInstanceOf[js.Any], inputText = inputText.asInstanceOf[js.Any], inputTextHovered = inputTextHovered.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], linkHovered = linkHovered.asInstanceOf[js.Any], listText = listText.asInstanceOf[js.Any], listTextColor = listTextColor.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any], primaryButtonText = primaryButtonText.asInstanceOf[js.Any], primaryButtonTextDisabled = primaryButtonTextDisabled.asInstanceOf[js.Any], primaryButtonTextHovered = primaryButtonTextHovered.asInstanceOf[js.Any], primaryButtonTextPressed = primaryButtonTextPressed.asInstanceOf[js.Any], successText = successText.asInstanceOf[js.Any], warningText = warningText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISemanticTextColors]
  }
  @scala.inline
  implicit class ISemanticTextColorsOps[Self <: ISemanticTextColors] (val x: Self) extends AnyVal {
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
    def setAccentButtonText(value: String): Self = this.set("accentButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionLink(value: String): Self = this.set("actionLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionLinkHovered(value: String): Self = this.set("actionLinkHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodySubtext(value: String): Self = this.set("bodySubtext", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyText(value: String): Self = this.set("bodyText", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyTextChecked(value: String): Self = this.set("bodyTextChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonText(value: String): Self = this.set("buttonText", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonTextChecked(value: String): Self = this.set("buttonTextChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonTextCheckedHovered(value: String): Self = this.set("buttonTextCheckedHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonTextDisabled(value: String): Self = this.set("buttonTextDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonTextHovered(value: String): Self = this.set("buttonTextHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonTextPressed(value: String): Self = this.set("buttonTextPressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabledBodySubtext(value: String): Self = this.set("disabledBodySubtext", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabledBodyText(value: String): Self = this.set("disabledBodyText", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabledSubtext(value: String): Self = this.set("disabledSubtext", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabledText(value: String): Self = this.set("disabledText", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorText(value: String): Self = this.set("errorText", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputPlaceholderText(value: String): Self = this.set("inputPlaceholderText", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputText(value: String): Self = this.set("inputText", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputTextHovered(value: String): Self = this.set("inputTextHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkHovered(value: String): Self = this.set("linkHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def setListText(value: String): Self = this.set("listText", value.asInstanceOf[js.Any])
    @scala.inline
    def setListTextColor(value: String): Self = this.set("listTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageText(value: String): Self = this.set("messageText", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryButtonText(value: String): Self = this.set("primaryButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryButtonTextDisabled(value: String): Self = this.set("primaryButtonTextDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryButtonTextHovered(value: String): Self = this.set("primaryButtonTextHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryButtonTextPressed(value: String): Self = this.set("primaryButtonTextPressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccessText(value: String): Self = this.set("successText", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarningText(value: String): Self = this.set("warningText", value.asInstanceOf[js.Any])
  }
  
}

