package typings
package atUifabricStylingLib.libInterfacesISemanticTextColorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISemanticTextColors extends js.Object {
  /**
    * Color of text for accent button (kicker)
    */
  var accentButtonText: java.lang.String
  /**
    * Neutral colored links and links for action buttons.
    */
  var actionLink: java.lang.String
  /**
    * Hover state for neutral colored links and links for action buttons.
    */
  var actionLinkHovered: java.lang.String
  /**
    * De-emphasized text; e.g. metadata, captions, placeholder text.
    */
  var bodySubtext: java.lang.String
  /**
    * The default color for text.
    */
  var bodyText: java.lang.String
  /**
    * Checked text color, e.g. selected menu item text.
    */
  var bodyTextChecked: java.lang.String
  /**
    * Color of text in a standard button
    */
  var buttonText: java.lang.String
  /**
    * Color of text in a checked standard button
    */
  var buttonTextChecked: java.lang.String
  /**
    * Color of text in a checked and hovered standard button
    */
  var buttonTextCheckedHovered: java.lang.String
  /**
    * Color of text in a disabled standard button
    */
  var buttonTextDisabled: java.lang.String
  /**
    * Color of text in a hovered standard button
    */
  var buttonTextHovered: java.lang.String
  /**
    * Color of text in a pressed standard button; i.e. currently being clicked by mouse
    */
  var buttonTextPressed: java.lang.String
  /**
    * Disabled de-emphasized text, for use on the default background (bodyBackground).
    */
  var disabledBodySubtext: java.lang.String
  /**
    * The default color for disabled text on the default background (bodyBackground).
    */
  var disabledBodyText: java.lang.String
  /**
    * Disabled de-emphasized text, for use on disabledBackground.
    */
  var disabledSubtext: java.lang.String
  /**
    * The default color for disabled text on top of disabledBackground; e.g. text in a disabled text field, disabled button text.
    */
  var disabledText: java.lang.String
  /**
    * The default color of error text, used on bodyBackground.
    */
  var errorText: java.lang.String
  /**
    * The color of placeholder text.
    */
  var inputPlaceholderText: java.lang.String
  /**
    * The color of input text.
    */
  var inputText: java.lang.String
  /**
    * The color of input text on hover.
    */
  var inputTextHovered: java.lang.String
  /**
    * The color of a link.
    */
  var link: java.lang.String
  /**
    * The color of a hovered link. Also used when the link is active.
    */
  var linkHovered: java.lang.String
  /**
    * The default text color for list item titles and text in column fields.
    */
  var listText: java.lang.String
  /** @deprecated
    * This slot was incorrectly named. Use listText instead. */
  var listTextColor: java.lang.String
  /**
    * Color of text in a primary button
    */
  var primaryButtonText: java.lang.String
  /**
    * Color of text in a disabled primary button
    */
  var primaryButtonTextDisabled: java.lang.String
  /**
    * Color of text in a hovered primary button
    */
  var primaryButtonTextHovered: java.lang.String
  /**
    * Color of text in a pressed primary button; i.e. currently being clicked by mouse
    */
  var primaryButtonTextPressed: java.lang.String
  /**
    * The color of text on errorBackground, warningBackground, blockingBackground, or successBackground.
    */
  var warningText: java.lang.String
}

object ISemanticTextColors {
  @scala.inline
  def apply(
    accentButtonText: java.lang.String,
    actionLink: java.lang.String,
    actionLinkHovered: java.lang.String,
    bodySubtext: java.lang.String,
    bodyText: java.lang.String,
    bodyTextChecked: java.lang.String,
    buttonText: java.lang.String,
    buttonTextChecked: java.lang.String,
    buttonTextCheckedHovered: java.lang.String,
    buttonTextDisabled: java.lang.String,
    buttonTextHovered: java.lang.String,
    buttonTextPressed: java.lang.String,
    disabledBodySubtext: java.lang.String,
    disabledBodyText: java.lang.String,
    disabledSubtext: java.lang.String,
    disabledText: java.lang.String,
    errorText: java.lang.String,
    inputPlaceholderText: java.lang.String,
    inputText: java.lang.String,
    inputTextHovered: java.lang.String,
    link: java.lang.String,
    linkHovered: java.lang.String,
    listText: java.lang.String,
    listTextColor: java.lang.String,
    primaryButtonText: java.lang.String,
    primaryButtonTextDisabled: java.lang.String,
    primaryButtonTextHovered: java.lang.String,
    primaryButtonTextPressed: java.lang.String,
    warningText: java.lang.String
  ): ISemanticTextColors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accentButtonText")(accentButtonText)
    __obj.updateDynamic("actionLink")(actionLink)
    __obj.updateDynamic("actionLinkHovered")(actionLinkHovered)
    __obj.updateDynamic("bodySubtext")(bodySubtext)
    __obj.updateDynamic("bodyText")(bodyText)
    __obj.updateDynamic("bodyTextChecked")(bodyTextChecked)
    __obj.updateDynamic("buttonText")(buttonText)
    __obj.updateDynamic("buttonTextChecked")(buttonTextChecked)
    __obj.updateDynamic("buttonTextCheckedHovered")(buttonTextCheckedHovered)
    __obj.updateDynamic("buttonTextDisabled")(buttonTextDisabled)
    __obj.updateDynamic("buttonTextHovered")(buttonTextHovered)
    __obj.updateDynamic("buttonTextPressed")(buttonTextPressed)
    __obj.updateDynamic("disabledBodySubtext")(disabledBodySubtext)
    __obj.updateDynamic("disabledBodyText")(disabledBodyText)
    __obj.updateDynamic("disabledSubtext")(disabledSubtext)
    __obj.updateDynamic("disabledText")(disabledText)
    __obj.updateDynamic("errorText")(errorText)
    __obj.updateDynamic("inputPlaceholderText")(inputPlaceholderText)
    __obj.updateDynamic("inputText")(inputText)
    __obj.updateDynamic("inputTextHovered")(inputTextHovered)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("linkHovered")(linkHovered)
    __obj.updateDynamic("listText")(listText)
    __obj.updateDynamic("listTextColor")(listTextColor)
    __obj.updateDynamic("primaryButtonText")(primaryButtonText)
    __obj.updateDynamic("primaryButtonTextDisabled")(primaryButtonTextDisabled)
    __obj.updateDynamic("primaryButtonTextHovered")(primaryButtonTextHovered)
    __obj.updateDynamic("primaryButtonTextPressed")(primaryButtonTextPressed)
    __obj.updateDynamic("warningText")(warningText)
    __obj.asInstanceOf[ISemanticTextColors]
  }
}

