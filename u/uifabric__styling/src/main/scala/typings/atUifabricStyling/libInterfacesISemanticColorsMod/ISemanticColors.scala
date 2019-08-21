package typings.atUifabricStyling.libInterfacesISemanticColorsMod

import typings.atUifabricStyling.libInterfacesISemanticTextColorsMod.ISemanticTextColors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISemanticColors extends ISemanticTextColors {
  /**
    * Background of an accent button (kicker)
    */
  var accentButtonBackground: String
  /**
    * Background for blocking issues, which is more severe than a warning, but not as bad as an error.
    */
  var blockingBackground: String
  /**
    * The default color for backgrounds.
    */
  var bodyBackground: String
  /**
    * The default background color of selected interactable elements that don't have their own backgrounds.
    * e.g. indicates in the nav which page you're currently on
    */
  var bodyBackgroundChecked: String
  /**
    * The default hover color for the backgrounds of interactable elements that don't have their own backgrounds.
    * e.g. if links had hover backgrounds, they'd use this
    */
  var bodyBackgroundHovered: String
  /**
    * Divider lines; e.g. lines that separate sections in a menu, an <HR> element.
    */
  var bodyDivider: String
  /**
    * The color for chrome adjacent to an area with bodyBackground.
    * This can be used to provide visual separation of zones when using stronger colors, when using a divider line is not desired.
    * In most themes, this should match the color of bodyBackground.
    * See also: bodyFrameDivider
    */
  var bodyFrameBackground: String
  /**
    * Used as the border between a zone with bodyFrameBackground and a zone with bodyBackground.
    * If bodyBackground and bodyFrameBackground are different, this should be the same color as bodyFrameBackground
    * in order to visually disappear.
    * See also: bodyFrameBackground
    */
  var bodyFrameDivider: String
  /**
    * The standout color for highlighted content backgrounds.
    * For highlighted content when there is no emphasis, use the neutral variant instead.
    * This should be a shade darker than bodyBackground in light themes,
    * and a shade lighter in inverted themes.
    */
  var bodyStandoutBackground: String
  /**
    * Background of a standard button
    */
  var buttonBackground: String
  /**
    * Background of a checked standard button; e.g. bold/italicize/underline text button in toolbar
    */
  var buttonBackgroundChecked: String
  /**
    * Background of a checked and hovered standard button; e.g. bold/italicize/underline text button in toolbar
    */
  var buttonBackgroundCheckedHovered: String
  /**
    * Background of a disabled standard button
    */
  var buttonBackgroundDisabled: String
  /**
    * Background of a hovered standard button
    */
  var buttonBackgroundHovered: String
  /**
    * Background of a pressed standard button; i.e. currently being clicked by mouse
    */
  var buttonBackgroundPressed: String
  /**
    * Border of a standard button
    */
  var buttonBorder: String
  /**
    * Border of a disabled standard button
    */
  var buttonBorderDisabled: String
  /**
    * Background color for default/empty state graphical elements; eg default icons, empty section that
    * needs user to fill in content, placeholder graphics, empty seats, etc.
    */
  var defaultStateBackground: String
  /**
    * The default color for backgrounds of disabled controls; e.g. disabled text field.
    */
  var disabledBackground: String
  /**
    * The default color for border of disabled controls; e.g. disabled slider, disabled toggle border.
    */
  var disabledBorder: String
  /**
    * The background for errors, if necessary, or highlighting the section of the page where the error is present.
    */
  var errorBackground: String
  /**
    * The color of the outline around focused controls that don't already have a border; e.g. menu items
    */
  var focusBorder: String
  /**
    * The background color of an input, e.g. textbox background.
    */
  var inputBackground: String
  /**
    * The background of a checked control; e.g. checked radio button's dot, checked toggle's background.
    */
  var inputBackgroundChecked: String
  /**
    * The background of a checked and hovered control; e.g. checked checkbox's background color on hover.
    */
  var inputBackgroundCheckedHovered: String
  /**
    * The border of a large input control in its resting, state; e.g. the box of dropdown.
    */
  var inputBorder: String
  /**
    * The border color of a large hovered input control, such as textbox.
    */
  var inputBorderHovered: String
  /**
    * The alternate focus border color for elements that already have a border; e.g. text field borders on focus.
    */
  var inputFocusBorderAlt: String
  /**
    * The foreground of a checked control; e.g. checked checkbox's checkmark color, checked toggle's thumb color,
    * radio button's background color around the dot.
    */
  var inputForegroundChecked: String
  /**
    * The color for icon ; e.g. SearchBox magnifying glass in rest state.
    */
  var inputIcon: String
  /**
    * The color for disabled icon ; e.g. SearchBox magnifying glass in disabled state.
    */
  var inputIconDisabled: String
  /**
    * The color for hovered icon ; e.g. SearchBox magnifying glass in hovered state.
    */
  var inputIconHovered: String
  /**
    * The placeholder background color of a checked control, e.g. slider background, spinner background.
    */
  var inputPlaceholderBackgroundChecked: String
  /**
    * The background color for the entire list.
    */
  var listBackground: String
  /**
    * The background color for a hovered list header.
    */
  var listHeaderBackgroundHovered: String
  /**
    * The background color for a pressed list header.
    */
  var listHeaderBackgroundPressed: String
  /**
    * The background color of a checked list item.
    */
  var listItemBackgroundChecked: String
  /**
    * The background color of a checked and hovered list item.
    */
  var listItemBackgroundCheckedHovered: String
  /**
    * The background color of a hovered list item.
    */
  var listItemBackgroundHovered: String
  /**
    * The background of a menu.
    */
  var menuBackground: String
  /**
    * The divider between menu items.
    */
  var menuDivider: String
  /**
    * The headers in menus that denote title of a section.
    */
  var menuHeader: String
  /**
    * The default colors of icons in menus.
    */
  var menuIcon: String
  /**
    * @deprecated
    * (Checked menu items no longer get a background color.)
    * The background of checked menu item; e.g. a menu item whose submenu is open, a selected dropdown item.
    */
  var menuItemBackgroundChecked: String
  /**
    * The background of a hovered menu item.
    */
  var menuItemBackgroundHovered: String
  /**
    * The background of a pressed menu item.
    */
  var menuItemBackgroundPressed: String
  /**
    * The text color of a menu item.
    */
  var menuItemText: String
  /**
    * The text color of a hovered menu item.
    */
  var menuItemTextHovered: String
  /**
    * Background of a primary button
    */
  var primaryButtonBackground: String
  /**
    * Background of a disabled primary button
    */
  var primaryButtonBackgroundDisabled: String
  /**
    * Background of a hovered primary button
    */
  var primaryButtonBackgroundHovered: String
  /**
    * Background of a pressed primary button; i.e. currently being clicked by mouse
    */
  var primaryButtonBackgroundPressed: String
  /**
    * Border of a primary button
    */
  var primaryButtonBorder: String
  /**
    * The border of a small input control in its resting unchecked state; e.g. the box of an unchecked checkbox.
    */
  var smallInputBorder: String
  /**
    * Background for success
    */
  var successBackground: String
  /**
    * The color of the border that provides contrast between an element, such as a card, and an emphasized background.
    */
  var variantBorder: String
  /**
    * Hover color of border that provides contrast between an element, such as a card, and an emphasized background.
    */
  var variantBorderHovered: String
  /**
    * Background for warning messages.
    */
  var warningBackground: String
  /**
    * Foreground color for warning highlights
    */
  var warningHighlight: String
}

object ISemanticColors {
  @scala.inline
  def apply(
    accentButtonBackground: String,
    accentButtonText: String,
    actionLink: String,
    actionLinkHovered: String,
    blockingBackground: String,
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
    defaultStateBackground: String,
    disabledBackground: String,
    disabledBodySubtext: String,
    disabledBodyText: String,
    disabledBorder: String,
    disabledSubtext: String,
    disabledText: String,
    errorBackground: String,
    errorText: String,
    focusBorder: String,
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
    primaryButtonBackground: String,
    primaryButtonBackgroundDisabled: String,
    primaryButtonBackgroundHovered: String,
    primaryButtonBackgroundPressed: String,
    primaryButtonBorder: String,
    primaryButtonText: String,
    primaryButtonTextDisabled: String,
    primaryButtonTextHovered: String,
    primaryButtonTextPressed: String,
    smallInputBorder: String,
    successBackground: String,
    successText: String,
    variantBorder: String,
    variantBorderHovered: String,
    warningBackground: String,
    warningHighlight: String,
    warningText: String
  ): ISemanticColors = {
    val __obj = js.Dynamic.literal(accentButtonBackground = accentButtonBackground, accentButtonText = accentButtonText, actionLink = actionLink, actionLinkHovered = actionLinkHovered, blockingBackground = blockingBackground, bodyBackground = bodyBackground, bodyBackgroundChecked = bodyBackgroundChecked, bodyBackgroundHovered = bodyBackgroundHovered, bodyDivider = bodyDivider, bodyFrameBackground = bodyFrameBackground, bodyFrameDivider = bodyFrameDivider, bodyStandoutBackground = bodyStandoutBackground, bodySubtext = bodySubtext, bodyText = bodyText, bodyTextChecked = bodyTextChecked, buttonBackground = buttonBackground, buttonBackgroundChecked = buttonBackgroundChecked, buttonBackgroundCheckedHovered = buttonBackgroundCheckedHovered, buttonBackgroundDisabled = buttonBackgroundDisabled, buttonBackgroundHovered = buttonBackgroundHovered, buttonBackgroundPressed = buttonBackgroundPressed, buttonBorder = buttonBorder, buttonBorderDisabled = buttonBorderDisabled, buttonText = buttonText, buttonTextChecked = buttonTextChecked, buttonTextCheckedHovered = buttonTextCheckedHovered, buttonTextDisabled = buttonTextDisabled, buttonTextHovered = buttonTextHovered, buttonTextPressed = buttonTextPressed, defaultStateBackground = defaultStateBackground, disabledBackground = disabledBackground, disabledBodySubtext = disabledBodySubtext, disabledBodyText = disabledBodyText, disabledBorder = disabledBorder, disabledSubtext = disabledSubtext, disabledText = disabledText, errorBackground = errorBackground, errorText = errorText, focusBorder = focusBorder, inputBackground = inputBackground, inputBackgroundChecked = inputBackgroundChecked, inputBackgroundCheckedHovered = inputBackgroundCheckedHovered, inputBorder = inputBorder, inputBorderHovered = inputBorderHovered, inputFocusBorderAlt = inputFocusBorderAlt, inputForegroundChecked = inputForegroundChecked, inputIcon = inputIcon, inputIconDisabled = inputIconDisabled, inputIconHovered = inputIconHovered, inputPlaceholderBackgroundChecked = inputPlaceholderBackgroundChecked, inputPlaceholderText = inputPlaceholderText, inputText = inputText, inputTextHovered = inputTextHovered, link = link, linkHovered = linkHovered, listBackground = listBackground, listHeaderBackgroundHovered = listHeaderBackgroundHovered, listHeaderBackgroundPressed = listHeaderBackgroundPressed, listItemBackgroundChecked = listItemBackgroundChecked, listItemBackgroundCheckedHovered = listItemBackgroundCheckedHovered, listItemBackgroundHovered = listItemBackgroundHovered, listText = listText, listTextColor = listTextColor, menuBackground = menuBackground, menuDivider = menuDivider, menuHeader = menuHeader, menuIcon = menuIcon, menuItemBackgroundChecked = menuItemBackgroundChecked, menuItemBackgroundHovered = menuItemBackgroundHovered, menuItemBackgroundPressed = menuItemBackgroundPressed, menuItemText = menuItemText, menuItemTextHovered = menuItemTextHovered, primaryButtonBackground = primaryButtonBackground, primaryButtonBackgroundDisabled = primaryButtonBackgroundDisabled, primaryButtonBackgroundHovered = primaryButtonBackgroundHovered, primaryButtonBackgroundPressed = primaryButtonBackgroundPressed, primaryButtonBorder = primaryButtonBorder, primaryButtonText = primaryButtonText, primaryButtonTextDisabled = primaryButtonTextDisabled, primaryButtonTextHovered = primaryButtonTextHovered, primaryButtonTextPressed = primaryButtonTextPressed, smallInputBorder = smallInputBorder, successBackground = successBackground, successText = successText, variantBorder = variantBorder, variantBorderHovered = variantBorderHovered, warningBackground = warningBackground, warningHighlight = warningHighlight, warningText = warningText)
  
    __obj.asInstanceOf[ISemanticColors]
  }
}

