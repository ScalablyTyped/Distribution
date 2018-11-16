package typings
package atUifabricStylingLib.libInterfacesISemanticColorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISemanticColors
  extends atUifabricStylingLib.libInterfacesISemanticTextColorsMod.ISemanticTextColors {
  /**
       * Background for blocking issues, which is more severe than a warning, but not as bad as an error.
       */
  var blockingBackground: java.lang.String
  /**
       * The default color for backgrounds.
       */
  var bodyBackground: java.lang.String
  /**
       * Divider lines; e.g. lines that separate sections in a menu, an <HR> element.
       */
  var bodyDivider: java.lang.String
  /**
       * The color for chrome adjacent to an area with bodyBackground.
       * This can be used to provide visual separation of zones when using stronger colors, when using a divider line is not desired.
       * In most themes, this should match the color of bodyBackground.
       * See also: bodyFrameDivider
       */
  var bodyFrameBackground: java.lang.String
  /**
       * Used as the border between a zone with bodyFrameBackground and a zone with bodyBackground.
       * If bodyBackground and bodyFrameBackground are different, this should be the same color as bodyFrameBackground
       * in order to visually disappear.
       * See also: bodyFrameBackground
       */
  var bodyFrameDivider: java.lang.String
  /**
       * The standout color for highlighted content backgrounds.
       * For highlighted content when there is no emphasis, use the neutral variant instead.
       * This should be a shade darker than bodyBackground in light themes,
       * and a shade lighter in inverted themes.
       */
  var bodyStandoutBackground: java.lang.String
  /**
       * Background of a standard button
       */
  var buttonBackground: java.lang.String
  /**
       * Background of a checked standard button; e.g. bold/italicize/underline text button in toolbar
       */
  var buttonBackgroundChecked: java.lang.String
  /**
       * Background of a checked and hovered standard button; e.g. bold/italicize/underline text button in toolbar
       */
  var buttonBackgroundCheckedHovered: java.lang.String
  /**
       * Background of a disabled standard button
       */
  var buttonBackgroundDisabled: java.lang.String
  /**
       * Background of a hovered standard button
       */
  var buttonBackgroundHovered: java.lang.String
  /**
       * Background of a pressed standard button; i.e. currently being clicked by mouse
       */
  var buttonBackgroundPressed: java.lang.String
  /**
       * Border of a standard button
       */
  var buttonBorder: java.lang.String
  /**
       * Border of a disabled standard button
       */
  var buttonBorderDisabled: java.lang.String
  /**
       * Background color for default/empty state graphical elements; eg default icons, empty section that
       * needs user to fill in content, placeholder graphics, empty seats, etc.
       */
  var defaultStateBackground: java.lang.String
  /**
       * The default color for backgrounds of disabled controls; e.g. disabled text field.
       */
  var disabledBackground: java.lang.String
  /**
       * The background for errors, if necessary, or highlighting the section of the page where the error is present.
       */
  var errorBackground: java.lang.String
  /**
       * The color of the outline around focused controls that don't already have a border; e.g. menu items
       */
  var focusBorder: java.lang.String
  /**
       * The background color of an input, e.g. textbox background.
       */
  var inputBackground: java.lang.String
  /**
       * The background of a checked control; e.g. checked radio button's dot, checked toggle's background.
       */
  var inputBackgroundChecked: java.lang.String
  /**
       * The background of a checked and hovered control; e.g. checked checkbox's background color on hover.
       */
  var inputBackgroundCheckedHovered: java.lang.String
  /**
       * The border of a large input control in its resting, state; e.g. the box of dropdown.
       */
  var inputBorder: java.lang.String
  /**
       * The border color of a large hovered input control, such as textbox.
       */
  var inputBorderHovered: java.lang.String
  /**
       * The alternate focus border color for elements that already have a border; e.g. text field borders on focus.
       */
  var inputFocusBorderAlt: java.lang.String
  /**
       * The foreground of a checked control; e.g. checked checkbox's checkmark color, checked toggle's thumb color,
       * radio button's background color around the dot.
       */
  var inputForegroundChecked: java.lang.String
  /**
       * The background color for the entire list.
       */
  var listBackground: java.lang.String
  /**
       * The background color for a hovered list header.
       */
  var listHeaderBackgroundHovered: java.lang.String
  /**
       * The background color for a pressed list header.
       */
  var listHeaderBackgroundPressed: java.lang.String
  /**
       * The background color of a checked list item.
       */
  var listItemBackgroundChecked: java.lang.String
  /**
       * The background color of a checked and hovered list item.
       */
  var listItemBackgroundCheckedHovered: java.lang.String
  /**
       * The background color of a hovered list item.
       */
  var listItemBackgroundHovered: java.lang.String
  /**
       * The background of a menu.
       */
  var menuBackground: java.lang.String
  /**
       * The divider between menu items.
       */
  var menuDivider: java.lang.String
  /**
       * The headers in menus that denote title of a section.
       */
  var menuHeader: java.lang.String
  /**
       * The default colors of icons in menus.
       */
  var menuIcon: java.lang.String
  /**
       * @deprecated
       * (Checked menu items no longer get a background color.)
       * The background of checked menu item; e.g. a menu item whose submenu is open, a selected dropdown item.
       */
  var menuItemBackgroundChecked: java.lang.String
  /**
       * The background of a hovered menu item.
       */
  var menuItemBackgroundHovered: java.lang.String
  /**
       * The background of a pressed menu item.
       */
  var menuItemBackgroundPressed: java.lang.String
  /**
       * The text color of a menu item.
       */
  var menuItemText: java.lang.String
  /**
       * The text color of a hovered menu item.
       */
  var menuItemTextHovered: java.lang.String
  /**
       * Background of a primary button
       */
  var primaryButtonBackground: java.lang.String
  /**
       * Background of a disabled primary button
       */
  var primaryButtonBackgroundDisabled: java.lang.String
  /**
       * Background of a hovered primary button
       */
  var primaryButtonBackgroundHovered: java.lang.String
  /**
       * Background of a pressed primary button; i.e. currently being clicked by mouse
       */
  var primaryButtonBackgroundPressed: java.lang.String
  /**
       * Border of a primary button
       */
  var primaryButtonBorder: java.lang.String
  /**
       * The border of a small input control in its resting unchecked state; e.g. the box of an unchecked checkbox.
       */
  var smallInputBorder: java.lang.String
  /**
       * Background for success
       */
  var successBackground: java.lang.String
  /**
       * The color of the border that provides contrast between an element, such as a card, and an emphasized background.
       */
  var variantBorder: java.lang.String
  /**
       * Hover color of border that provides contrast between an element, such as a card, and an emphasized background.
       */
  var variantBorderHovered: java.lang.String
  /**
       * Background for warning messages.
       */
  var warningBackground: java.lang.String
  /**
       * Foreground color for warning highlights
       */
  var warningHighlight: java.lang.String
}

