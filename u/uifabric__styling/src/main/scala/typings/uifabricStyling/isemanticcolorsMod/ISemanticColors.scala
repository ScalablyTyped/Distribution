package typings.uifabricStyling.isemanticcolorsMod

import typings.uifabricStyling.isemantictextcolorsMod.ISemanticTextColors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISemanticColors extends ISemanticTextColors {
  /**
    * Background of an accent button (kicker)
    */
  var accentButtonBackground: String = js.native
  /**
    * Background for blocking issues, which is more severe than a warning, but not as bad as an error.
    */
  var blockingBackground: String = js.native
  /**
    * Color for icons on blockingBackground.
    */
  var blockingIcon: String = js.native
  /**
    * The default color for backgrounds.
    */
  var bodyBackground: String = js.native
  /**
    * The default background color of selected interactable elements that don't have their own backgrounds.
    * e.g. indicates in the nav which page you're currently on
    */
  var bodyBackgroundChecked: String = js.native
  /**
    * The default hover color for the backgrounds of interactable elements that don't have their own backgrounds.
    * e.g. if links had hover backgrounds, they'd use this
    */
  var bodyBackgroundHovered: String = js.native
  /**
    * Divider lines; e.g. lines that separate sections in a menu, an <HR> element.
    */
  var bodyDivider: String = js.native
  /**
    * The color for chrome adjacent to an area with bodyBackground.
    * This can be used to provide visual separation of zones when using stronger colors, when using a divider line
    * is not desired.
    * In most themes, this should match the color of bodyBackground.
    * See also: bodyFrameDivider
    */
  var bodyFrameBackground: String = js.native
  /**
    * Used as the border between a zone with bodyFrameBackground and a zone with bodyBackground.
    * If bodyBackground and bodyFrameBackground are different, this should be the same color as bodyFrameBackground
    * in order to visually disappear.
    * See also: bodyFrameBackground
    */
  var bodyFrameDivider: String = js.native
  /**
    * The standout color for highlighted content backgrounds.
    * For highlighted content when there is no emphasis, use the neutral variant instead.
    * This should be a shade darker than bodyBackground in light themes, and a shade lighter in inverted themes.
    */
  var bodyStandoutBackground: String = js.native
  /**
    * Background of a standard button
    */
  var buttonBackground: String = js.native
  /**
    * Background of a checked standard button; e.g. bold/italicize/underline text button in toolbar
    */
  var buttonBackgroundChecked: String = js.native
  /**
    * Background of a checked and hovered standard button; e.g. bold/italicize/underline text button in toolbar
    */
  var buttonBackgroundCheckedHovered: String = js.native
  /**
    * Background of a disabled standard button
    */
  var buttonBackgroundDisabled: String = js.native
  /**
    * Background of a hovered standard button
    */
  var buttonBackgroundHovered: String = js.native
  /**
    * Background of a pressed standard button; i.e. currently being clicked by mouse
    */
  var buttonBackgroundPressed: String = js.native
  /**
    * Border of a standard button
    */
  var buttonBorder: String = js.native
  /**
    * Border of a disabled standard button
    */
  var buttonBorderDisabled: String = js.native
  /**
    * The default box-shadow for a card. In inverted themes, by default, this is set to `none` since shadows do not work
    * well on dark backgrounds. If the card could be the same color as the background, it is recommended that
    * `variantBorder` is used instead, so the card doesn't disappear in inverted themes.
    * For use with `box-shadow`.
    */
  var cardShadow: String = js.native
  /**
    * The default box-shadow when hovering on a card. Generally, this is a deeper shadow than `cardShadow`, to give
    * the effect that the card is lifting off the page.
    * In inverted themes, this should be set to a box-shadow that looks like a solid border, because shadows are not
    * visible on dark themes.
    * For use with `box-shadow`.
    */
  var cardShadowHovered: String = js.native
  /**
    * The background color of a card (or other surface) on a standout background.
    * Cards usually have shadows, but the variantBorder slots can be used for a solid border.
    * e.g. cards on a carousel of highlighted articles
    */
  var cardStandoutBackground: String = js.native
  /**
    * Background color for default/empty state graphical elements; eg default icons, empty section that
    * needs user to fill in content, placeholder graphics, empty seats, etc.
    */
  var defaultStateBackground: String = js.native
  /**
    * The default color for backgrounds of disabled controls; e.g. disabled text field.
    */
  var disabledBackground: String = js.native
  /**
    * The default color for border of disabled controls; e.g. disabled slider, disabled toggle border.
    */
  var disabledBorder: String = js.native
  /**
    * The background for errors, if necessary, or highlighting the section of the page where the error is present.
    */
  var errorBackground: String = js.native
  /**
    * Color for icons on errorBackground.
    */
  var errorIcon: String = js.native
  /**
    * The color of the outline around focused controls that don't already have a border; e.g. menu items
    */
  var focusBorder: String = js.native
  /**
    * Background for informational messages.
    */
  var infoBackground: String = js.native
  /**
    * Color for icons on infoBackground.
    */
  var infoIcon: String = js.native
  /**
    * The background color of an input, e.g. textbox background.
    */
  var inputBackground: String = js.native
  /**
    * The background of a checked control; e.g. checked radio button's dot, checked toggle's background.
    */
  var inputBackgroundChecked: String = js.native
  /**
    * The background of a checked and hovered control; e.g. checked checkbox's background color on hover.
    */
  var inputBackgroundCheckedHovered: String = js.native
  /**
    * The border of a large input control in its resting, state; e.g. the box of dropdown.
    */
  var inputBorder: String = js.native
  /**
    * The border color of a large hovered input control, such as textbox.
    */
  var inputBorderHovered: String = js.native
  /**
    * The alternate focus border color for elements that already have a border; e.g. text field borders on focus.
    */
  var inputFocusBorderAlt: String = js.native
  /**
    * The foreground of a checked control; e.g. checked checkbox's checkmark color, checked toggle's thumb color,
    * radio button's background color around the dot.
    */
  var inputForegroundChecked: String = js.native
  /**
    * The color for icon ; e.g. SearchBox magnifying glass in rest state.
    */
  var inputIcon: String = js.native
  /**
    * The color for disabled icon ; e.g. SearchBox magnifying glass in disabled state.
    */
  var inputIconDisabled: String = js.native
  /**
    * The color for hovered icon ; e.g. SearchBox magnifying glass in hovered state.
    */
  var inputIconHovered: String = js.native
  /**
    * The placeholder background color of a checked control, e.g. slider background, spinner background.
    */
  var inputPlaceholderBackgroundChecked: String = js.native
  /**
    * The background color for the entire list.
    */
  var listBackground: String = js.native
  /**
    * The background color for a hovered list header.
    */
  var listHeaderBackgroundHovered: String = js.native
  /**
    * The background color for a pressed list header.
    */
  var listHeaderBackgroundPressed: String = js.native
  /**
    * The background color of a checked list item.
    */
  var listItemBackgroundChecked: String = js.native
  /**
    * The background color of a checked and hovered list item.
    */
  var listItemBackgroundCheckedHovered: String = js.native
  /**
    * The background color of a hovered list item.
    */
  var listItemBackgroundHovered: String = js.native
  /**
    * The background of a menu.
    */
  var menuBackground: String = js.native
  /**
    * The divider between menu items.
    */
  var menuDivider: String = js.native
  /**
    * The headers in menus that denote title of a section.
    */
  var menuHeader: String = js.native
  /**
    * The default colors of icons in menus.
    */
  var menuIcon: String = js.native
  /**
    * @deprecated
    * (Checked menu items no longer get a background color.)
    * The background of checked menu item; e.g. a menu item whose submenu is open, a selected dropdown item.
    */
  var menuItemBackgroundChecked: String = js.native
  /**
    * The background of a hovered menu item.
    */
  var menuItemBackgroundHovered: String = js.native
  /**
    * The background of a pressed menu item.
    */
  var menuItemBackgroundPressed: String = js.native
  /**
    * The text color of a menu item.
    */
  var menuItemText: String = js.native
  /**
    * The text color of a hovered menu item.
    */
  var menuItemTextHovered: String = js.native
  /**
    * Color of links within a message.
    */
  var messageLink: String = js.native
  /**
    * Color of links within a message when hovered.
    */
  var messageLinkHovered: String = js.native
  /**
    * Background of a primary button
    */
  var primaryButtonBackground: String = js.native
  /**
    * Background of a disabled primary button
    */
  var primaryButtonBackgroundDisabled: String = js.native
  /**
    * Background of a hovered primary button
    */
  var primaryButtonBackgroundHovered: String = js.native
  /**
    * Background of a pressed primary button; i.e. currently being clicked by mouse
    */
  var primaryButtonBackgroundPressed: String = js.native
  /**
    * Border of a primary button
    */
  var primaryButtonBorder: String = js.native
  /**
    * Background for severe warning messages.
    */
  var severeWarningBackground: String = js.native
  /**
    * Color for icons on severeWarningBackground.
    */
  var severeWarningIcon: String = js.native
  /**
    * The border of a small input control in its resting unchecked state; e.g. the box of an unchecked checkbox.
    */
  var smallInputBorder: String = js.native
  /**
    * Background for success
    */
  var successBackground: String = js.native
  /**
    * Color for icons on successBackground.
    */
  var successIcon: String = js.native
  /**
    * The color of the border that provides contrast between an element, such as a card, and a standout background.
    */
  var variantBorder: String = js.native
  /**
    * Hover color of border that provides contrast between an element, such as a card, and a standout background.
    */
  var variantBorderHovered: String = js.native
  /**
    * Background for warning messages.
    */
  var warningBackground: String = js.native
  /**
    * @deprecated
    * (no longer used)
    * Foreground color for warning highlights
    */
  var warningHighlight: String = js.native
  /**
    * Color for icons on warningBackground.
    */
  var warningIcon: String = js.native
}

object ISemanticColors {
  @scala.inline
  def apply(
    accentButtonBackground: String,
    accentButtonText: String,
    actionLink: String,
    actionLinkHovered: String,
    blockingBackground: String,
    blockingIcon: String,
    bodyBackground: String,
    bodyBackgroundChecked: String,
    bodyBackgroundHovered: String,
    bodyDivider: String,
    bodyFrameBackground: String,
    bodyFrameDivider: String,
    bodyStandoutBackground: String,
    bodySubtext: String,
    bodyText: String,
    bodyTextChecked: String,
    buttonBackground: String,
    buttonBackgroundChecked: String,
    buttonBackgroundCheckedHovered: String,
    buttonBackgroundDisabled: String,
    buttonBackgroundHovered: String,
    buttonBackgroundPressed: String,
    buttonBorder: String,
    buttonBorderDisabled: String,
    buttonText: String,
    buttonTextChecked: String,
    buttonTextCheckedHovered: String,
    buttonTextDisabled: String,
    buttonTextHovered: String,
    buttonTextPressed: String,
    cardShadow: String,
    cardShadowHovered: String,
    cardStandoutBackground: String,
    defaultStateBackground: String,
    disabledBackground: String,
    disabledBodySubtext: String,
    disabledBodyText: String,
    disabledBorder: String,
    disabledSubtext: String,
    disabledText: String,
    errorBackground: String,
    errorIcon: String,
    errorText: String,
    focusBorder: String,
    infoBackground: String,
    infoIcon: String,
    inputBackground: String,
    inputBackgroundChecked: String,
    inputBackgroundCheckedHovered: String,
    inputBorder: String,
    inputBorderHovered: String,
    inputFocusBorderAlt: String,
    inputForegroundChecked: String,
    inputIcon: String,
    inputIconDisabled: String,
    inputIconHovered: String,
    inputPlaceholderBackgroundChecked: String,
    inputPlaceholderText: String,
    inputText: String,
    inputTextHovered: String,
    link: String,
    linkHovered: String,
    listBackground: String,
    listHeaderBackgroundHovered: String,
    listHeaderBackgroundPressed: String,
    listItemBackgroundChecked: String,
    listItemBackgroundCheckedHovered: String,
    listItemBackgroundHovered: String,
    listText: String,
    listTextColor: String,
    menuBackground: String,
    menuDivider: String,
    menuHeader: String,
    menuIcon: String,
    menuItemBackgroundChecked: String,
    menuItemBackgroundHovered: String,
    menuItemBackgroundPressed: String,
    menuItemText: String,
    menuItemTextHovered: String,
    messageLink: String,
    messageLinkHovered: String,
    messageText: String,
    primaryButtonBackground: String,
    primaryButtonBackgroundDisabled: String,
    primaryButtonBackgroundHovered: String,
    primaryButtonBackgroundPressed: String,
    primaryButtonBorder: String,
    primaryButtonText: String,
    primaryButtonTextDisabled: String,
    primaryButtonTextHovered: String,
    primaryButtonTextPressed: String,
    severeWarningBackground: String,
    severeWarningIcon: String,
    smallInputBorder: String,
    successBackground: String,
    successIcon: String,
    successText: String,
    variantBorder: String,
    variantBorderHovered: String,
    warningBackground: String,
    warningHighlight: String,
    warningIcon: String,
    warningText: String
  ): ISemanticColors = {
    val __obj = js.Dynamic.literal(accentButtonBackground = accentButtonBackground.asInstanceOf[js.Any], accentButtonText = accentButtonText.asInstanceOf[js.Any], actionLink = actionLink.asInstanceOf[js.Any], actionLinkHovered = actionLinkHovered.asInstanceOf[js.Any], blockingBackground = blockingBackground.asInstanceOf[js.Any], blockingIcon = blockingIcon.asInstanceOf[js.Any], bodyBackground = bodyBackground.asInstanceOf[js.Any], bodyBackgroundChecked = bodyBackgroundChecked.asInstanceOf[js.Any], bodyBackgroundHovered = bodyBackgroundHovered.asInstanceOf[js.Any], bodyDivider = bodyDivider.asInstanceOf[js.Any], bodyFrameBackground = bodyFrameBackground.asInstanceOf[js.Any], bodyFrameDivider = bodyFrameDivider.asInstanceOf[js.Any], bodyStandoutBackground = bodyStandoutBackground.asInstanceOf[js.Any], bodySubtext = bodySubtext.asInstanceOf[js.Any], bodyText = bodyText.asInstanceOf[js.Any], bodyTextChecked = bodyTextChecked.asInstanceOf[js.Any], buttonBackground = buttonBackground.asInstanceOf[js.Any], buttonBackgroundChecked = buttonBackgroundChecked.asInstanceOf[js.Any], buttonBackgroundCheckedHovered = buttonBackgroundCheckedHovered.asInstanceOf[js.Any], buttonBackgroundDisabled = buttonBackgroundDisabled.asInstanceOf[js.Any], buttonBackgroundHovered = buttonBackgroundHovered.asInstanceOf[js.Any], buttonBackgroundPressed = buttonBackgroundPressed.asInstanceOf[js.Any], buttonBorder = buttonBorder.asInstanceOf[js.Any], buttonBorderDisabled = buttonBorderDisabled.asInstanceOf[js.Any], buttonText = buttonText.asInstanceOf[js.Any], buttonTextChecked = buttonTextChecked.asInstanceOf[js.Any], buttonTextCheckedHovered = buttonTextCheckedHovered.asInstanceOf[js.Any], buttonTextDisabled = buttonTextDisabled.asInstanceOf[js.Any], buttonTextHovered = buttonTextHovered.asInstanceOf[js.Any], buttonTextPressed = buttonTextPressed.asInstanceOf[js.Any], cardShadow = cardShadow.asInstanceOf[js.Any], cardShadowHovered = cardShadowHovered.asInstanceOf[js.Any], cardStandoutBackground = cardStandoutBackground.asInstanceOf[js.Any], defaultStateBackground = defaultStateBackground.asInstanceOf[js.Any], disabledBackground = disabledBackground.asInstanceOf[js.Any], disabledBodySubtext = disabledBodySubtext.asInstanceOf[js.Any], disabledBodyText = disabledBodyText.asInstanceOf[js.Any], disabledBorder = disabledBorder.asInstanceOf[js.Any], disabledSubtext = disabledSubtext.asInstanceOf[js.Any], disabledText = disabledText.asInstanceOf[js.Any], errorBackground = errorBackground.asInstanceOf[js.Any], errorIcon = errorIcon.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], focusBorder = focusBorder.asInstanceOf[js.Any], infoBackground = infoBackground.asInstanceOf[js.Any], infoIcon = infoIcon.asInstanceOf[js.Any], inputBackground = inputBackground.asInstanceOf[js.Any], inputBackgroundChecked = inputBackgroundChecked.asInstanceOf[js.Any], inputBackgroundCheckedHovered = inputBackgroundCheckedHovered.asInstanceOf[js.Any], inputBorder = inputBorder.asInstanceOf[js.Any], inputBorderHovered = inputBorderHovered.asInstanceOf[js.Any], inputFocusBorderAlt = inputFocusBorderAlt.asInstanceOf[js.Any], inputForegroundChecked = inputForegroundChecked.asInstanceOf[js.Any], inputIcon = inputIcon.asInstanceOf[js.Any], inputIconDisabled = inputIconDisabled.asInstanceOf[js.Any], inputIconHovered = inputIconHovered.asInstanceOf[js.Any], inputPlaceholderBackgroundChecked = inputPlaceholderBackgroundChecked.asInstanceOf[js.Any], inputPlaceholderText = inputPlaceholderText.asInstanceOf[js.Any], inputText = inputText.asInstanceOf[js.Any], inputTextHovered = inputTextHovered.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], linkHovered = linkHovered.asInstanceOf[js.Any], listBackground = listBackground.asInstanceOf[js.Any], listHeaderBackgroundHovered = listHeaderBackgroundHovered.asInstanceOf[js.Any], listHeaderBackgroundPressed = listHeaderBackgroundPressed.asInstanceOf[js.Any], listItemBackgroundChecked = listItemBackgroundChecked.asInstanceOf[js.Any], listItemBackgroundCheckedHovered = listItemBackgroundCheckedHovered.asInstanceOf[js.Any], listItemBackgroundHovered = listItemBackgroundHovered.asInstanceOf[js.Any], listText = listText.asInstanceOf[js.Any], listTextColor = listTextColor.asInstanceOf[js.Any], menuBackground = menuBackground.asInstanceOf[js.Any], menuDivider = menuDivider.asInstanceOf[js.Any], menuHeader = menuHeader.asInstanceOf[js.Any], menuIcon = menuIcon.asInstanceOf[js.Any], menuItemBackgroundChecked = menuItemBackgroundChecked.asInstanceOf[js.Any], menuItemBackgroundHovered = menuItemBackgroundHovered.asInstanceOf[js.Any], menuItemBackgroundPressed = menuItemBackgroundPressed.asInstanceOf[js.Any], menuItemText = menuItemText.asInstanceOf[js.Any], menuItemTextHovered = menuItemTextHovered.asInstanceOf[js.Any], messageLink = messageLink.asInstanceOf[js.Any], messageLinkHovered = messageLinkHovered.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any], primaryButtonBackground = primaryButtonBackground.asInstanceOf[js.Any], primaryButtonBackgroundDisabled = primaryButtonBackgroundDisabled.asInstanceOf[js.Any], primaryButtonBackgroundHovered = primaryButtonBackgroundHovered.asInstanceOf[js.Any], primaryButtonBackgroundPressed = primaryButtonBackgroundPressed.asInstanceOf[js.Any], primaryButtonBorder = primaryButtonBorder.asInstanceOf[js.Any], primaryButtonText = primaryButtonText.asInstanceOf[js.Any], primaryButtonTextDisabled = primaryButtonTextDisabled.asInstanceOf[js.Any], primaryButtonTextHovered = primaryButtonTextHovered.asInstanceOf[js.Any], primaryButtonTextPressed = primaryButtonTextPressed.asInstanceOf[js.Any], severeWarningBackground = severeWarningBackground.asInstanceOf[js.Any], severeWarningIcon = severeWarningIcon.asInstanceOf[js.Any], smallInputBorder = smallInputBorder.asInstanceOf[js.Any], successBackground = successBackground.asInstanceOf[js.Any], successIcon = successIcon.asInstanceOf[js.Any], successText = successText.asInstanceOf[js.Any], variantBorder = variantBorder.asInstanceOf[js.Any], variantBorderHovered = variantBorderHovered.asInstanceOf[js.Any], warningBackground = warningBackground.asInstanceOf[js.Any], warningHighlight = warningHighlight.asInstanceOf[js.Any], warningIcon = warningIcon.asInstanceOf[js.Any], warningText = warningText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISemanticColors]
  }
  @scala.inline
  implicit class ISemanticColorsOps[Self <: ISemanticColors] (val x: Self) extends AnyVal {
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
    def setAccentButtonBackground(value: String): Self = this.set("accentButtonBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlockingBackground(value: String): Self = this.set("blockingBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlockingIcon(value: String): Self = this.set("blockingIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyBackground(value: String): Self = this.set("bodyBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyBackgroundChecked(value: String): Self = this.set("bodyBackgroundChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyBackgroundHovered(value: String): Self = this.set("bodyBackgroundHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyDivider(value: String): Self = this.set("bodyDivider", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyFrameBackground(value: String): Self = this.set("bodyFrameBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyFrameDivider(value: String): Self = this.set("bodyFrameDivider", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyStandoutBackground(value: String): Self = this.set("bodyStandoutBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonBackground(value: String): Self = this.set("buttonBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonBackgroundChecked(value: String): Self = this.set("buttonBackgroundChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonBackgroundCheckedHovered(value: String): Self = this.set("buttonBackgroundCheckedHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonBackgroundDisabled(value: String): Self = this.set("buttonBackgroundDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonBackgroundHovered(value: String): Self = this.set("buttonBackgroundHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonBackgroundPressed(value: String): Self = this.set("buttonBackgroundPressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonBorder(value: String): Self = this.set("buttonBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonBorderDisabled(value: String): Self = this.set("buttonBorderDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setCardShadow(value: String): Self = this.set("cardShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def setCardShadowHovered(value: String): Self = this.set("cardShadowHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def setCardStandoutBackground(value: String): Self = this.set("cardStandoutBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultStateBackground(value: String): Self = this.set("defaultStateBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabledBackground(value: String): Self = this.set("disabledBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabledBorder(value: String): Self = this.set("disabledBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorBackground(value: String): Self = this.set("errorBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorIcon(value: String): Self = this.set("errorIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusBorder(value: String): Self = this.set("focusBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfoBackground(value: String): Self = this.set("infoBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfoIcon(value: String): Self = this.set("infoIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputBackground(value: String): Self = this.set("inputBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputBackgroundChecked(value: String): Self = this.set("inputBackgroundChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputBackgroundCheckedHovered(value: String): Self = this.set("inputBackgroundCheckedHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputBorder(value: String): Self = this.set("inputBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputBorderHovered(value: String): Self = this.set("inputBorderHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputFocusBorderAlt(value: String): Self = this.set("inputFocusBorderAlt", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputForegroundChecked(value: String): Self = this.set("inputForegroundChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputIcon(value: String): Self = this.set("inputIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputIconDisabled(value: String): Self = this.set("inputIconDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputIconHovered(value: String): Self = this.set("inputIconHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputPlaceholderBackgroundChecked(value: String): Self = this.set("inputPlaceholderBackgroundChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def setListBackground(value: String): Self = this.set("listBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setListHeaderBackgroundHovered(value: String): Self = this.set("listHeaderBackgroundHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def setListHeaderBackgroundPressed(value: String): Self = this.set("listHeaderBackgroundPressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setListItemBackgroundChecked(value: String): Self = this.set("listItemBackgroundChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def setListItemBackgroundCheckedHovered(value: String): Self = this.set("listItemBackgroundCheckedHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def setListItemBackgroundHovered(value: String): Self = this.set("listItemBackgroundHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuBackground(value: String): Self = this.set("menuBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuDivider(value: String): Self = this.set("menuDivider", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuHeader(value: String): Self = this.set("menuHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuIcon(value: String): Self = this.set("menuIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuItemBackgroundChecked(value: String): Self = this.set("menuItemBackgroundChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuItemBackgroundHovered(value: String): Self = this.set("menuItemBackgroundHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuItemBackgroundPressed(value: String): Self = this.set("menuItemBackgroundPressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuItemText(value: String): Self = this.set("menuItemText", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuItemTextHovered(value: String): Self = this.set("menuItemTextHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageLink(value: String): Self = this.set("messageLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageLinkHovered(value: String): Self = this.set("messageLinkHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryButtonBackground(value: String): Self = this.set("primaryButtonBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryButtonBackgroundDisabled(value: String): Self = this.set("primaryButtonBackgroundDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryButtonBackgroundHovered(value: String): Self = this.set("primaryButtonBackgroundHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryButtonBackgroundPressed(value: String): Self = this.set("primaryButtonBackgroundPressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryButtonBorder(value: String): Self = this.set("primaryButtonBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setSevereWarningBackground(value: String): Self = this.set("severeWarningBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setSevereWarningIcon(value: String): Self = this.set("severeWarningIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmallInputBorder(value: String): Self = this.set("smallInputBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccessBackground(value: String): Self = this.set("successBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccessIcon(value: String): Self = this.set("successIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariantBorder(value: String): Self = this.set("variantBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariantBorderHovered(value: String): Self = this.set("variantBorderHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarningBackground(value: String): Self = this.set("warningBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarningHighlight(value: String): Self = this.set("warningHighlight", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarningIcon(value: String): Self = this.set("warningIcon", value.asInstanceOf[js.Any])
  }
  
}

