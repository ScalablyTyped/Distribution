package typings.atUifabricStyling.libInterfacesISemanticTextColorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISemanticTextColors extends js.Object {
  /**
    * Color of text for accent button (kicker)
    */
  var accentButtonText: String
  /**
    * Neutral colored links and links for action buttons.
    */
  var actionLink: String
  /**
    * Hover state for neutral colored links and links for action buttons.
    */
  var actionLinkHovered: String
  /**
    * De-emphasized text; e.g. metadata, captions, placeholder text.
    */
  var bodySubtext: String
  /**
    * The default color for text.
    */
  var bodyText: String
  /**
    * Checked text color, e.g. selected menu item text.
    */
  var bodyTextChecked: String
  /**
    * Color of text in a standard button
    */
  var buttonText: String
  /**
    * Color of text in a checked standard button
    */
  var buttonTextChecked: String
  /**
    * Color of text in a checked and hovered standard button
    */
  var buttonTextCheckedHovered: String
  /**
    * Color of text in a disabled standard button
    */
  var buttonTextDisabled: String
  /**
    * Color of text in a hovered standard button
    */
  var buttonTextHovered: String
  /**
    * Color of text in a pressed standard button; i.e. currently being clicked by mouse
    */
  var buttonTextPressed: String
  /**
    * Disabled de-emphasized text, for use on the default background (bodyBackground).
    */
  var disabledBodySubtext: String
  /**
    * The default color for disabled text on the default background (bodyBackground).
    */
  var disabledBodyText: String
  /**
    * Disabled de-emphasized text, for use on disabledBackground.
    */
  var disabledSubtext: String
  /**
    * The default color for disabled text on top of disabledBackground; e.g. text in a disabled text field, disabled button text.
    */
  var disabledText: String
  /**
    * The default color of error text on bodyBackground.
    */
  var errorText: String
  /**
    * The color of placeholder text.
    */
  var inputPlaceholderText: String
  /**
    * The color of input text.
    */
  var inputText: String
  /**
    * The color of input text on hover.
    */
  var inputTextHovered: String
  /**
    * The color of a link.
    */
  var link: String
  /**
    * The color of a hovered link. Also used when the link is active.
    */
  var linkHovered: String
  /**
    * The default text color for list item titles and text in column fields.
    */
  var listText: String
  /** @deprecated
    * This slot was incorrectly named. Use listText instead. */
  var listTextColor: String
  /**
    * Color of text in a primary button
    */
  var primaryButtonText: String
  /**
    * Color of text in a disabled primary button
    */
  var primaryButtonTextDisabled: String
  /**
    * Color of text in a hovered primary button
    */
  var primaryButtonTextHovered: String
  /**
    * Color of text in a pressed primary button; i.e. currently being clicked by mouse
    */
  var primaryButtonTextPressed: String
  /**
    * The default color of success text on successBackground.
    */
  var successText: String
  /**
    * The default color of text on errorBackground, warningBackground, blockingBackground, or successBackground.
    */
  var warningText: String
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
    primaryButtonText: String,
    primaryButtonTextDisabled: String,
    primaryButtonTextHovered: String,
    primaryButtonTextPressed: String,
    successText: String,
    warningText: String
  ): ISemanticTextColors = {
    val __obj = js.Dynamic.literal(accentButtonText = accentButtonText, actionLink = actionLink, actionLinkHovered = actionLinkHovered, bodySubtext = bodySubtext, bodyText = bodyText, bodyTextChecked = bodyTextChecked, buttonText = buttonText, buttonTextChecked = buttonTextChecked, buttonTextCheckedHovered = buttonTextCheckedHovered, buttonTextDisabled = buttonTextDisabled, buttonTextHovered = buttonTextHovered, buttonTextPressed = buttonTextPressed, disabledBodySubtext = disabledBodySubtext, disabledBodyText = disabledBodyText, disabledSubtext = disabledSubtext, disabledText = disabledText, errorText = errorText, inputPlaceholderText = inputPlaceholderText, inputText = inputText, inputTextHovered = inputTextHovered, link = link, linkHovered = linkHovered, listText = listText, listTextColor = listTextColor, primaryButtonText = primaryButtonText, primaryButtonTextDisabled = primaryButtonTextDisabled, primaryButtonTextHovered = primaryButtonTextHovered, primaryButtonTextPressed = primaryButtonTextPressed, successText = successText, warningText = warningText)
  
    __obj.asInstanceOf[ISemanticTextColors]
  }
}

