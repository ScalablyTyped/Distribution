package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofUI extends js.Object {
  /**
  		 * Use with [Animation.curve](Titanium.UI.Animation.curve) to specify an animation that starts
  		 * slowly and speeds up.
  		 */
  val ANIMATION_CURVE_EASE_IN: scala.Double = js.native
  /**
  		 * Use with [Animation.curve](Titanium.UI.Animation.curve) to specify an animation that starts
  		 * slowly, and speeds up, then slows down at the end of the animation.
  		 */
  val ANIMATION_CURVE_EASE_IN_OUT: scala.Double = js.native
  /**
  		 * Use with [Animation.curve](Titanium.UI.Animation.curve) to specify an animation that starts
  		 * quickly, then slows down at the end of the animation.
  		 */
  val ANIMATION_CURVE_EASE_OUT: scala.Double = js.native
  /**
  		 * Use with [Animation.curve](Titanium.UI.Animation.curve) to specify an animation that proceeds
  		 * at a constant rate.
  		 */
  val ANIMATION_CURVE_LINEAR: scala.Double = js.native
  /**
  		 * Use with <Attribute.type> to specify a background color.
  		 */
  val ATTRIBUTE_BACKGROUND_COLOR: scala.Double = js.native
  /**
  		 * Use with <Attribute.type> to apply a different baseline to the text.
  		 */
  val ATTRIBUTE_BASELINE_OFFSET: scala.Double = js.native
  /**
  		 * Use with <Attribute.type> to stretch the text horizontally.
  		 */
  val ATTRIBUTE_EXPANSION: scala.Double = js.native
  /**
  		 * Use with <Attribute.type> to specify a font.
  		 */
  val ATTRIBUTE_FONT: scala.Double = js.native
  /**
  		 * Use with <Attribute.type> to specify a font color.
  		 */
  val ATTRIBUTE_FOREGROUND_COLOR: scala.Double = js.native
  /**
  		 * Use with <Attribute.type> to specify kerning (space between characters).
  		 */
  val ATTRIBUTE_KERN: scala.Double = js.native
  /**
  		 * Use with <Attribute.value> to use a letterpress text effect.
  		 */
  val ATTRIBUTE_LETTERPRESS_STYLE: scala.Double = js.native
  /**
  		 * Use with <Attribute.type> to enable or disable ligatures.
  		 */
  val ATTRIBUTE_LIGATURE: scala.Double = js.native
  /**
  		 * Use with <Attribute.type> to wrap and truncate the text.
  		 */
  val ATTRIBUTE_LINE_BREAK: scala.Double = js.native
  /**
  		 * Use with <Attribute.value> to wrap words at word boundaries.
  		 */
  val ATTRIBUTE_LINE_BREAK_BY_CHAR_WRAPPING: scala.Double = js.native
  /**
  		 * Use with <Attribute.value> to set lines to not draw past the edge of the text container.
  		 */
  val ATTRIBUTE_LINE_BREAK_BY_CLIPPING: scala.Double = js.native
  /**
  		 * Use with <Attribute.value> to use ellipsis glyph at the beginning of the line for missing text.
  		 */
  val ATTRIBUTE_LINE_BREAK_BY_TRUNCATING_HEAD: scala.Double = js.native
  /**
  		 * Use with <Attribute.value> to use ellipsis glyph at the middle of the line for missing text.
  		 */
  val ATTRIBUTE_LINE_BREAK_BY_TRUNCATING_MIDDLE: scala.Double = js.native
  /**
  		 * Use with <Attribute.value> to use ellipsis glyph at the end of the line for missing text.
  		 */
  val ATTRIBUTE_LINE_BREAK_BY_TRUNCATING_TAIL: scala.Double = js.native
  /**
  		 * Use with <Attribute.value> to wrap words at word boundaries.
  		 */
  val ATTRIBUTE_LINE_BREAK_BY_WORD_WRAPPING: scala.Double = js.native
  /**
  		 * Use with <Attribute.type> to create a link.
  		 */
  val ATTRIBUTE_LINK: scala.Double = js.native
  /**
  		 * Use with <Attribute.type> to skew the text.
  		 */
  val ATTRIBUTE_OBLIQUENESS: scala.Double = js.native
  /**
  		 * Use with <Attribute.type> to manages the behaviour of string set.
  		 */
  val ATTRIBUTE_PARAGRAPH_STYLE: scala.Double = js.native
  /**
  		 * Use with <Attribute.type> to display a shadow behind the text.
  		 */
  val ATTRIBUTE_SHADOW: scala.Double = js.native
  /**
  		 * Use with <Attribute.type> to change the color of the horizontal line.
  		 */
  val ATTRIBUTE_STRIKETHROUGH_COLOR: scala.Double = js.native
  /**
  		 * Use with <Attribute.type> to place a horizontal line through the text.
  		 */
  val ATTRIBUTE_STRIKETHROUGH_STYLE: scala.Double = js.native
  /**
  		 * Use with <Attribute.type> to specify a color for the stroke text.
  		 */
  val ATTRIBUTE_STROKE_COLOR: scala.Double = js.native
  /**
  		 * Use with <Attribute.type> to specify the width of the stroke text.
  		 */
  val ATTRIBUTE_STROKE_WIDTH: scala.Double = js.native
  /**
  		 * Use with <Attribute.type> to place the text in a lower position.
  		 */
  val ATTRIBUTE_SUBSCRIPT_STYLE: scala.Double = js.native
  /**
  		 * Use with <Attribute.type> to place the text in an upper position.
  		 */
  val ATTRIBUTE_SUPERSCRIPT_STYLE: scala.Double = js.native
  /**
  		 * Use with <Attribute.type> to apply a text effect.
  		 */
  val ATTRIBUTE_TEXT_EFFECT: scala.Double = js.native
  /**
  		 * Use with <Attribute.type> to place a horizontal line under the text.
  		 */
  val ATTRIBUTE_UNDERLINES_STYLE: scala.Double = js.native
  /**
  		 * Use with <Attribute.value> to draw a line only underneath or through words.
  		 */
  val ATTRIBUTE_UNDERLINE_BY_WORD: scala.Double = js.native
  /**
  		 * Use with <Attribute.type> to change the color of the horizontal line.
  		 */
  val ATTRIBUTE_UNDERLINE_COLOR: scala.Double = js.native
  /**
  		 * Use with <Attribute.value> to draw a dashed line.
  		 */
  val ATTRIBUTE_UNDERLINE_PATTERN_DASH: scala.Double = js.native
  /**
  		 * Use with <Attribute.value> to draw an alternating line of dashes and dots.
  		 */
  val ATTRIBUTE_UNDERLINE_PATTERN_DASH_DOT: scala.Double = js.native
  /**
  		 * Use with <Attribute.value> to draw an alternating line of dashes and two dots.
  		 */
  val ATTRIBUTE_UNDERLINE_PATTERN_DASH_DOT_DOT: scala.Double = js.native
  /**
  		 * Use with <Attribute.value> to draw a dotted line.
  		 */
  val ATTRIBUTE_UNDERLINE_PATTERN_DOT: scala.Double = js.native
  /**
  		 * Use with <Attribute.value> to draw a solid line.
  		 */
  val ATTRIBUTE_UNDERLINE_PATTERN_SOLID: scala.Double = js.native
  /**
  		 * Use with <Attribute.value> to draw a double line.
  		 */
  val ATTRIBUTE_UNDERLINE_STYLE_DOUBLE: scala.Double = js.native
  /**
  		 * Use with <Attribute.value> to not draw a line.
  		 */
  val ATTRIBUTE_UNDERLINE_STYLE_NONE: scala.Double = js.native
  /**
  		 * Use with <Attribute.value> to draw a single line.
  		 */
  val ATTRIBUTE_UNDERLINE_STYLE_SINGLE: scala.Double = js.native
  /**
  		 * Use with <Attribute.value> to draw a thick line.
  		 */
  val ATTRIBUTE_UNDERLINE_STYLE_THICK: scala.Double = js.native
  /**
  		 * Use with <Attribute.type> to control the direction of the text.
  		 */
  val ATTRIBUTE_WRITING_DIRECTION: scala.Double = js.native
  /**
  		 * Use with <Attribute.value> to use the embedded text direction.
  		 */
  val ATTRIBUTE_WRITING_DIRECTION_EMBEDDING: scala.Double = js.native
  /**
  		 * Use with <Attribute.value> to write text left to right.
  		 */
  val ATTRIBUTE_WRITING_DIRECTION_LEFT_TO_RIGHT: scala.Double = js.native
  /**
  		 * Use with <Attribute.value> to use the
  		 * [Unicode Bidirection Algorithm rules P2 and P3](http://www.unicode.org/reports/tr9/#The_Paragraph_Level)
  		 * to determine which direction to use.
  		 */
  val ATTRIBUTE_WRITING_DIRECTION_NATURAL: scala.Double = js.native
  /**
  		 * Use with <Attribute.value> to override the text direction.
  		 */
  val ATTRIBUTE_WRITING_DIRECTION_OVERRIDE: scala.Double = js.native
  /**
  		 * Use with <Attribute.value> to write text right to left.
  		 */
  val ATTRIBUTE_WRITING_DIRECTION_RIGHT_TO_LEFT: scala.Double = js.native
  /**
  		 * Converts strings formatted as addresses into clickable links.
  		 */
  val AUTODETECT_ADDRESS: scala.Double = js.native
  /**
  		 * Converts all detectable types of data into clickable links.
  		 */
  val AUTODETECT_ALL: scala.Double = js.native
  /**
  		 * Converts strings formatted as calendar events into clickable links.
  		 */
  val AUTODETECT_CALENDAR: scala.Double = js.native
  /**
  		 * Converts strings formatted as URLs into clickable links.
  		 */
  val AUTODETECT_LINK: scala.Double = js.native
  /**
  		 * Disables converting strings into clickable links.
  		 */
  val AUTODETECT_NONE: scala.Double = js.native
  /**
  		 * Converts strings formatted as phone numbers into clickable links.
  		 */
  val AUTODETECT_PHONE: scala.Double = js.native
  /**
  		 * Specifies the expectation of an address.
  		 */
  val AUTOFILL_TYPE_ADDRESS: java.lang.String = js.native
  /**
  		 * Specifies the expectation of a city name.
  		 */
  val AUTOFILL_TYPE_ADDRESS_CITY: java.lang.String = js.native
  /**
  		 * Specifies the expectation of a city name combined with a state name.
  		 */
  val AUTOFILL_TYPE_ADDRESS_CITY_STATE: java.lang.String = js.native
  /**
  		 * Specifies the expectation of the first line of a street address.
  		 */
  val AUTOFILL_TYPE_ADDRESS_LINE1: java.lang.String = js.native
  /**
  		 * Specifies the expectation of the second line of a street address.
  		 */
  val AUTOFILL_TYPE_ADDRESS_LINE2: java.lang.String = js.native
  /**
  		 * Specifies the expectation of a state name.
  		 */
  val AUTOFILL_TYPE_ADDRESS_STATE: java.lang.String = js.native
  /**
  		 * Specifies the expectation of a card expiration date.
  		 */
  val AUTOFILL_TYPE_CARD_EXPIRATION_DATE: java.lang.String = js.native
  /**
  		 * Specifies the expectation of a card expiration day.
  		 */
  val AUTOFILL_TYPE_CARD_EXPIRATION_DAY: java.lang.String = js.native
  /**
  		 * Specifies the expectation of a card expiration month.
  		 */
  val AUTOFILL_TYPE_CARD_EXPIRATION_MONTH: java.lang.String = js.native
  /**
  		 * Specifies the expectation of a card expiration year.
  		 */
  val AUTOFILL_TYPE_CARD_EXPIRATION_YEAR: java.lang.String = js.native
  /**
  		 * Specifies the expectation of a card number.
  		 */
  val AUTOFILL_TYPE_CARD_NUMBER: java.lang.String = js.native
  /**
  		 * Specifies the expectation of a card security code.
  		 */
  val AUTOFILL_TYPE_CARD_SECURITY_CODE: java.lang.String = js.native
  /**
  		 * Specifies the expectation of a country name.
  		 */
  val AUTOFILL_TYPE_COUNTRY_NAME: java.lang.String = js.native
  /**
  		 * Specifies the expectation of an email address.
  		 */
  val AUTOFILL_TYPE_EMAIL: java.lang.String = js.native
  /**
  		 * Specifies the expectation of a family name.
  		 */
  val AUTOFILL_TYPE_FAMILY_NAME: java.lang.String = js.native
  /**
  		 * Specifies the expectation of a given name.
  		 */
  val AUTOFILL_TYPE_GIVEN_NAME: java.lang.String = js.native
  /**
  		 * Specifies the expectation of a job title.
  		 */
  val AUTOFILL_TYPE_JOB_TITLE: java.lang.String = js.native
  /**
  		 * Specifies the expectation of a location, such as a point of interest, an address, or another way to identify a location.
  		 */
  val AUTOFILL_TYPE_LOCATION: java.lang.String = js.native
  /**
  		 * Specifies the expectation of a middle name.
  		 */
  val AUTOFILL_TYPE_MIDDLE_NAME: java.lang.String = js.native
  /**
  		 * Specifies the expectation of a name.
  		 */
  val AUTOFILL_TYPE_NAME: java.lang.String = js.native
  /**
  		 * Specifies the expectation of a prefix or title, such as 'Dr.'
  		 */
  val AUTOFILL_TYPE_NAME_PREFIX: java.lang.String = js.native
  /**
  		 * Specifies the expectation of a suffix, such as 'Jr.'
  		 */
  val AUTOFILL_TYPE_NAME_SUFFIX: java.lang.String = js.native
  /**
  		 * Specifies the expectation of a new password.
  		 */
  val AUTOFILL_TYPE_NEW_PASSWORD: java.lang.String = js.native
  /**
  		 * Specifies the expectation of a nickname.
  		 */
  val AUTOFILL_TYPE_NICKNAME: java.lang.String = js.native
  /**
  		 * Specifies the expectation of a single-factor SMS login code.
  		 */
  val AUTOFILL_TYPE_ONE_TIME_CODE: java.lang.String = js.native
  /**
  		 * Specifies the expectation of an organization name.
  		 */
  val AUTOFILL_TYPE_ORGANIZATION_NAME: java.lang.String = js.native
  /**
  		 * Specifies the expectation of a password.
  		 */
  val AUTOFILL_TYPE_PASSWORD: java.lang.String = js.native
  /**
  		 * Specifies the expectation of a telephone number.
  		 */
  val AUTOFILL_TYPE_PHONE: java.lang.String = js.native
  /**
  		 * Specifies the expectation of a postal code.
  		 */
  val AUTOFILL_TYPE_POSTAL_CODE: java.lang.String = js.native
  /**
  		 * Specifies the expectation of a sublocality.
  		 */
  val AUTOFILL_TYPE_SUBLOCALITY: java.lang.String = js.native
  /**
  		 * Specifies the expectation of a URL.
  		 */
  val AUTOFILL_TYPE_URL: java.lang.String = js.native
  /**
  		 * Specifies the expectation of an account or login name.
  		 */
  val AUTOFILL_TYPE_USERNAME: java.lang.String = js.native
  /**
  		 * Converts all detectable types of data into clickable links.
  		 */
  val AUTOLINK_ALL: scala.Double = js.native
  /**
  		 * Converts strings formatted as calendar events into clickable links.
  		 */
  val AUTOLINK_CALENDAR: scala.Double = js.native
  /**
  		 * Converts strings formatted as email addresses into clickable links.
  		 */
  val AUTOLINK_EMAIL_ADDRESSES: scala.Double = js.native
  /**
  		 * Converts strings formatted as addresses into clickable links.
  		 */
  val AUTOLINK_MAP_ADDRESSES: scala.Double = js.native
  /**
  		 * Disables converting strings into clickable links.
  		 */
  val AUTOLINK_NONE: scala.Double = js.native
  /**
  		 * Converts strings formatted as phone numbers into clickable links.
  		 */
  val AUTOLINK_PHONE_NUMBERS: scala.Double = js.native
  /**
  		 * Converts strings formatted as URLs into clickable links.
  		 */
  val AUTOLINK_URLS: scala.Double = js.native
  /**
  		 * A set of constants for the styles available for <Titanium.UI.ActivityIndicator> objects.
  		 */
  val ActivityIndicatorStyleNs: TypeofActivityIndicatorStyle = js.native
  /**
  		 * The Android-specific UI capabilities. All properties, methods and events in this namespace will
  		 * only work on Android systems.
  		 */
  val AndroidNs: TypeofAndroid = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_CLEAR: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_COLOR: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_COLOR_BURN: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_COLOR_DODGE: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_COPY: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_DARKEN: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_DESTINATION_ATOP: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_DESTINATION_IN: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_DESTINATION_OUT: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_DESTINATION_OVER: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_DIFFERENCE: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_EXCLUSION: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_HARD_LIGHT: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_HUE: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_LIGHTEN: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_LUMINOSITY: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_MULTIPLY: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_NORMAL: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_OVERLAY: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_PLUS_DARKER: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_PLUS_LIGHTER: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_SATURATION: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_SCREEN: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_SOFT_LIGHT: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_SOURCE_ATOP: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_SOURCE_IN: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_SOURCE_OUT: scala.Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_XOR: scala.Double = js.native
  /**
  		 * Specifies the time and date that you want the system to remove the clipboard items from the clipboard.
  		 */
  val CLIPBOARD_OPTION_EXPIRATION_DATE: java.lang.String = js.native
  /**
  		 * Specifies that the clipboard items should not be available to other devices through Handoff.
  		 */
  val CLIPBOARD_OPTION_LOCAL_ONLY: java.lang.String = js.native
  /**
  		 * A module used for accessing clipboard data.
  		 */
  val ClipboardNs: TypeofClipboard = js.native
  /**
  		 * Specifies that all the edges of the window can extend.
  		 */
  val EXTEND_EDGE_ALL: scala.Double = js.native
  /**
  		 * Specifies that the bottom edge of the window can extend.
  		 */
  val EXTEND_EDGE_BOTTOM: scala.Double = js.native
  /**
  		 * Specifies that the left edge of the window can extend.
  		 */
  val EXTEND_EDGE_LEFT: scala.Double = js.native
  /**
  		 * Specifies that none of the edges of the window can extend.
  		 */
  val EXTEND_EDGE_NONE: scala.Double = js.native
  /**
  		 * Specifies that the right edge of the window can extend.
  		 */
  val EXTEND_EDGE_RIGHT: scala.Double = js.native
  /**
  		 * Specifies that the top edge of the window can extend.
  		 */
  val EXTEND_EDGE_TOP: scala.Double = js.native
  /**
  		 * Constant value for face-down orientation.
  		 */
  val FACE_DOWN: scala.Double = js.native
  /**
  		 * Constant value for face-up orientation.
  		 */
  val FACE_UP: scala.Double = js.native
  /**
  		 * FILL behavior for UI layout.
  		 */
  val FILL: java.lang.String = js.native
  /**
  		 * Release free space when hiding an object.
  		 */
  val HIDDEN_BEHAVIOR_GONE: scala.Double = js.native
  /**
  		 * Keeps free space when hiding an object.
  		 */
  val HIDDEN_BEHAVIOR_INVISIBLE: scala.Double = js.native
  /**
  		 * Use when creating a TextField to specify the hintType as animated.
  		 */
  val HINT_TYPE_ANIMATED: scala.Double = js.native
  /**
  		 * Use when creating a TextField to specify the hintType as static.
  		 */
  val HINT_TYPE_STATIC: scala.Double = js.native
  /**
  		 * Use a bezel-style border on the input field.
  		 */
  val INPUT_BORDERSTYLE_BEZEL: scala.Double = js.native
  /**
  		 * Use a simple line border on the input field.
  		 */
  val INPUT_BORDERSTYLE_LINE: scala.Double = js.native
  /**
  		 * Use no border on the input field.
  		 */
  val INPUT_BORDERSTYLE_NONE: scala.Double = js.native
  /**
  		 * Use a rounded-rectangle border on the input field.
  		 */
  val INPUT_BORDERSTYLE_ROUNDED: scala.Double = js.native
  /**
  		 * Always show buttons on the input field.
  		 */
  val INPUT_BUTTONMODE_ALWAYS: scala.Double = js.native
  /**
  		 * Never show buttons on the input field.
  		 */
  val INPUT_BUTTONMODE_NEVER: scala.Double = js.native
  /**
  		 * Show buttons on the input field when it loses focus.
  		 */
  val INPUT_BUTTONMODE_ONBLUR: scala.Double = js.native
  /**
  		 * Show buttons on the input field when it gains focus.
  		 */
  val INPUT_BUTTONMODE_ONFOCUS: scala.Double = js.native
  /**
  		 * Use a keyboard with a number pad only, with the pad keyboard layout. Accepts only numbers.
  		 */
  val INPUT_TYPE_CLASS_NUMBER: scala.Double = js.native
  /**
  		 * Use an ASCII keyboard, with the standard keyboard layout.
  		 */
  val INPUT_TYPE_CLASS_TEXT: scala.Double = js.native
  /**
  		 * Use a keyboard appearance suitable for entering text on an alert.
  		 */
  val KEYBOARD_APPEARANCE_ALERT: scala.Double = js.native
  /**
  		 * Use the platform-specific dark keyboard appearance.
  		 */
  val KEYBOARD_APPEARANCE_DARK: scala.Double = js.native
  /**
  		 * Use the platform-specific default keyboard appearance.
  		 */
  val KEYBOARD_APPEARANCE_DEFAULT: scala.Double = js.native
  /**
  		 * Use the platform-specific light keyboard appearance.
  		 */
  val KEYBOARD_APPEARANCE_LIGHT: scala.Double = js.native
  /**
  		 * Use an ASCII keyboard, with the standard keyboard layout.
  		 */
  val KEYBOARD_ASCII: scala.Double = js.native
  /**
  		 * Use a keyboard with decimal numbers only, with the pad keyboard layout.
  		 */
  val KEYBOARD_DECIMAL_PAD: scala.Double = js.native
  /**
  		 * Use the default keyboard, depending on the platform.
  		 */
  val KEYBOARD_DEFAULT: scala.Double = js.native
  /**
  		 * Use a keyboard suitable for composing email, with the standard keyboard layout.
  		 */
  val KEYBOARD_EMAIL: scala.Double = js.native
  /**
  		 * Use a keyboard suitable for entering names and phone numbers, with the pad keyboard layout.
  		 */
  val KEYBOARD_NAMEPHONE_PAD: scala.Double = js.native
  /**
  		 * Use a keyboard with numbers and punctuation only, with the standard keyboard layout.
  		 */
  val KEYBOARD_NUMBERS_PUNCTUATION: scala.Double = js.native
  /**
  		 * Use a keyboard with a number pad only, with the pad keyboard layout.
  		 */
  val KEYBOARD_NUMBER_PAD: scala.Double = js.native
  /**
  		 * Use a keyboard with a phone-style number pad, with the pad keyboard layout.
  		 */
  val KEYBOARD_PHONE_PAD: scala.Double = js.native
  /**
  		 * Use an ASCII keyboard, with the standard keyboard layout.
  		 */
  val KEYBOARD_TYPE_ASCII: scala.Double = js.native
  /**
  		 * Use a keyboard with decimal numbers only, with the pad keyboard layout.
  		 */
  val KEYBOARD_TYPE_DECIMAL_PAD: scala.Double = js.native
  /**
  		 * Use the default keyboard, depending on the platform.
  		 */
  val KEYBOARD_TYPE_DEFAULT: scala.Double = js.native
  /**
  		 * Use a keyboard suitable for composing email, with the standard keyboard layout.
  		 */
  val KEYBOARD_TYPE_EMAIL: scala.Double = js.native
  /**
  		 * Use a keyboard suitable for entering names and phone numbers, with the pad keyboard layout.
  		 */
  val KEYBOARD_TYPE_NAMEPHONE_PAD: scala.Double = js.native
  /**
  		 * Use a keyboard with numbers and punctuation only, with the standard keyboard layout.
  		 */
  val KEYBOARD_TYPE_NUMBERS_PUNCTUATION: scala.Double = js.native
  /**
  		 * Use a keyboard with a number pad only, with the pad keyboard layout.
  		 */
  val KEYBOARD_TYPE_NUMBER_PAD: scala.Double = js.native
  /**
  		 * Use a keyboard with a phone-style number pad, with the pad keyboard layout.
  		 */
  val KEYBOARD_TYPE_PHONE_PAD: scala.Double = js.native
  /**
  		 * Use a keyboard optimized for twitter text entry, with easy access to the @ and
  		 */
  val KEYBOARD_TYPE_TWITTER: scala.Double = js.native
  /**
  		 * Use a keyboard optimized for entering URLs, with the standard keyboard layout.
  		 */
  val KEYBOARD_TYPE_URL: scala.Double = js.native
  /**
  		 * Use a keyboard optimized for web search terms and URL entry.
  		 */
  val KEYBOARD_TYPE_WEBSEARCH: scala.Double = js.native
  /**
  		 * Use a keyboard optimized for entering URLs, with the standard keyboard layout.
  		 */
  val KEYBOARD_URL: scala.Double = js.native
  /**
  		 * Standard landscape orientation (home button on left).
  		 */
  val LANDSCAPE_LEFT: scala.Double = js.native
  /**
  		 * Reverse landscape orientation (home button on right).
  		 */
  val LANDSCAPE_RIGHT: scala.Double = js.native
  /**
  		 * Displays a checkmark on the right side of an item in a list view.
  		 */
  val LIST_ACCESSORY_TYPE_CHECKMARK: scala.Double = js.native
  /**
  		 * Displays a detail disclosure button on the right side of an item in a list view.
  		 */
  val LIST_ACCESSORY_TYPE_DETAIL: scala.Double = js.native
  /**
  		 * Displays a disclosure indicator on the right side of an item in a list view.
  		 */
  val LIST_ACCESSORY_TYPE_DISCLOSURE: scala.Double = js.native
  /**
  		 * Do not display anything on the right side of an item in a list view.
  		 */
  val LIST_ACCESSORY_TYPE_NONE: scala.Double = js.native
  /**
  		 * A built-in style for an item with a right-aligned title label on the left side of the cell,
  		 * which is next to a left-aligned subtitle label.
  		 */
  val LIST_ITEM_TEMPLATE_CONTACTS: scala.Double = js.native
  /**
  		 * A built-in style for an item with an image view and left-aligned title label.
  		 */
  val LIST_ITEM_TEMPLATE_DEFAULT: scala.Double = js.native
  /**
  		 * A built-in style for a item with an image view; a left-aligned title label; and a
  		 * right-aligned subtitle label.
  		 */
  val LIST_ITEM_TEMPLATE_SETTINGS: scala.Double = js.native
  /**
  		 * A built-in style for an item with an image view; a black, left-aligned title label across the
  		 * top of the cell and a subtitle label below it.
  		 */
  val LIST_ITEM_TEMPLATE_SUBTITLE: scala.Double = js.native
  /**
  		 * Specifies a long duration for an Android Toast notification (<Titanium.UI.Notification>).
  		 */
  val NOTIFICATION_DURATION_LONG: scala.Double = js.native
  /**
  		 * Specifies a short duration for an Android Toast notification (<Titanium.UI.Notification>).
  		 */
  val NOTIFICATION_DURATION_SHORT: scala.Double = js.native
  /**
  		 * Use a picker with a countdown timer appearance, showing hours and minutes.
  		 */
  val PICKER_TYPE_COUNT_DOWN_TIMER: scala.Double = js.native
  /**
  		 * Use a date picker.
  		 */
  val PICKER_TYPE_DATE: scala.Double = js.native
  /**
  		 * Use a date and time picker.
  		 */
  val PICKER_TYPE_DATE_AND_TIME: scala.Double = js.native
  /**
  		 * Use a plain picker (for values other than date or time).
  		 */
  val PICKER_TYPE_PLAIN: scala.Double = js.native
  /**
  		 * Use a time picker.
  		 */
  val PICKER_TYPE_TIME: scala.Double = js.native
  /**
  		 * Orientation constant for portrait mode orientation.
  		 */
  val PORTRAIT: scala.Double = js.native
  /**
  		 * Set the return key text to "Continue".
  		 */
  val RETURNKEY_CONTINUE: scala.Double = js.native
  /**
  		 * Use the default return key on the virtual keyboard.
  		 */
  val RETURNKEY_DEFAULT: scala.Double = js.native
  /**
  		 * Set the return key text to "Done".
  		 */
  val RETURNKEY_DONE: scala.Double = js.native
  /**
  		 * Set the return key text to "Emergency Call".
  		 */
  val RETURNKEY_EMERGENCY_CALL: scala.Double = js.native
  /**
  		 * Set the return key text to "Go".
  		 */
  val RETURNKEY_GO: scala.Double = js.native
  /**
  		 * Set the return key text to "Google".
  		 */
  val RETURNKEY_GOOGLE: scala.Double = js.native
  /**
  		 * Set the return key text to "Join".
  		 */
  val RETURNKEY_JOIN: scala.Double = js.native
  /**
  		 * Set the return key text to "Next".
  		 */
  val RETURNKEY_NEXT: scala.Double = js.native
  /**
  		 * Set the return key text to "Route".
  		 */
  val RETURNKEY_ROUTE: scala.Double = js.native
  /**
  		 * Set the return key text to "Search".
  		 */
  val RETURNKEY_SEARCH: scala.Double = js.native
  /**
  		 * Set the return key text to "Send".
  		 */
  val RETURNKEY_SEND: scala.Double = js.native
  /**
  		 * Set the return key text to "Yahoo".
  		 */
  val RETURNKEY_YAHOO: scala.Double = js.native
  /**
  		 * SIZE behavior for UI layout.
  		 */
  val SIZE: java.lang.String = js.native
  /**
  		 * The row divider is hidden.
  		 */
  val TABLE_VIEW_SEPARATOR_STYLE_NONE: scala.Double = js.native
  /**
  		 * The row divider is shown as a single line.
  		 */
  val TABLE_VIEW_SEPARATOR_STYLE_SINGLE_LINE: scala.Double = js.native
  /**
  		 * Center align text.
  		 */
  val TEXT_ALIGNMENT_CENTER: scala.Double | java.lang.String = js.native
  /**
  		 * Justify align text.
  		 */
  val TEXT_ALIGNMENT_JUSTIFY: scala.Double | java.lang.String = js.native
  /**
  		 * Left align text.
  		 */
  val TEXT_ALIGNMENT_LEFT: scala.Double | java.lang.String = js.native
  /**
  		 * Right align text.
  		 */
  val TEXT_ALIGNMENT_RIGHT: scala.Double | java.lang.String = js.native
  /**
  		 * Auto-capitalize all text in the input field.
  		 */
  val TEXT_AUTOCAPITALIZATION_ALL: scala.Double = js.native
  /**
  		 * Do not auto-capitalize.
  		 */
  val TEXT_AUTOCAPITALIZATION_NONE: scala.Double = js.native
  /**
  		 * Use sentence-style auto-capitalization in the input field.
  		 */
  val TEXT_AUTOCAPITALIZATION_SENTENCES: scala.Double = js.native
  /**
  		 * Auto-capitalize the first letter of each word in the input field.
  		 */
  val TEXT_AUTOCAPITALIZATION_WORDS: scala.Double = js.native
  /**
  		 * Add ellipses before the first character that doesnt fit.
  		 */
  val TEXT_ELLIPSIZE_TRUNCATE_CHAR_WRAP: scala.Double = js.native
  /**
  		 * Lines are simply not drawn past the edge of the text container.
  		 */
  val TEXT_ELLIPSIZE_TRUNCATE_CLIP: scala.Double = js.native
  /**
  		 * Add ellipses at the end of the label if the text is too large to fit.
  		 */
  val TEXT_ELLIPSIZE_TRUNCATE_END: scala.Double = js.native
  /**
  		 * Turns on a marquee effect of the label if the text is too large to fit. (This requires <Titanium.UI.Label.focusable> to be true)
  		 */
  val TEXT_ELLIPSIZE_TRUNCATE_MARQUEE: scala.Double = js.native
  /**
  		 * Add ellipses in the middle of the label if the text is too large to fit.
  		 */
  val TEXT_ELLIPSIZE_TRUNCATE_MIDDLE: scala.Double = js.native
  /**
  		 * Disables ellipsizing of the label. The text will be cut off if it is too long.
  		 */
  val TEXT_ELLIPSIZE_TRUNCATE_NONE: scala.Double = js.native
  /**
  		 * Add ellipses at the beginning of the label if the text is too large to fit.
  		 */
  val TEXT_ELLIPSIZE_TRUNCATE_START: scala.Double = js.native
  /**
  		 * Add ellipses at word boundaries, unless the word itself doesn't fit on a single line.
  		 */
  val TEXT_ELLIPSIZE_TRUNCATE_WORD_WRAP: scala.Double = js.native
  /**
  		 * Specifies the text style for the <Font> Object.
  		 */
  val TEXT_STYLE_BODY: java.lang.String = js.native
  /**
  		 * Specifies the text style for the <Font> Object.
  		 */
  val TEXT_STYLE_CALLOUT: java.lang.String = js.native
  /**
  		 * Specifies the text style for the <Font> Object.
  		 */
  val TEXT_STYLE_CAPTION1: java.lang.String = js.native
  /**
  		 * Specifies the text style for the <Font> Object.
  		 */
  val TEXT_STYLE_CAPTION2: java.lang.String = js.native
  /**
  		 * Specifies the text style for the <Font> Object.
  		 */
  val TEXT_STYLE_FOOTNOTE: java.lang.String = js.native
  /**
  		 * Specifies the text style for the <Font> Object.
  		 */
  val TEXT_STYLE_HEADLINE: java.lang.String = js.native
  /**
  		 * Specifies the text style for the <Font> Object.
  		 */
  val TEXT_STYLE_SUBHEADLINE: java.lang.String = js.native
  /**
  		 * Specifies the text style for the <Font> Object.
  		 */
  val TEXT_STYLE_TITLE1: java.lang.String = js.native
  /**
  		 * Specifies the text style for the <Font> Object.
  		 */
  val TEXT_STYLE_TITLE2: java.lang.String = js.native
  /**
  		 * Specifies the text style for the <Font> Object.
  		 */
  val TEXT_STYLE_TITLE3: java.lang.String = js.native
  /**
  		 * Align text to the bottom of the view.
  		 */
  val TEXT_VERTICAL_ALIGNMENT_BOTTOM: scala.Double | java.lang.String = js.native
  /**
  		 * Vertically align text to the center of the view.
  		 */
  val TEXT_VERTICAL_ALIGNMENT_CENTER: scala.Double | java.lang.String = js.native
  /**
  		 * Align text to the top of the view.
  		 */
  val TEXT_VERTICAL_ALIGNMENT_TOP: scala.Double | java.lang.String = js.native
  /**
  		 * Unit constant representing units in centimeters.
  		 */
  val UNIT_CM: java.lang.String = js.native
  /**
  		 * Unit constant representing units in density-independent pixels.
  		 */
  val UNIT_DIP: java.lang.String = js.native
  /**
  		 * Unit constant representing units in inches.
  		 */
  val UNIT_IN: java.lang.String = js.native
  /**
  		 * Unit constant representing units in millimeters.
  		 */
  val UNIT_MM: java.lang.String = js.native
  /**
  		 * Unit constant representing units in pixels.
  		 */
  val UNIT_PX: java.lang.String = js.native
  /**
  		 * Orientation constant representing an unknown orientation.
  		 */
  val UNKNOWN: scala.Double = js.native
  /**
  		 * Orientation constant for inverted portait orientation.
  		 */
  val UPSIDE_PORTRAIT: scala.Double = js.native
  /**
  		 * Authentication error code reported via <Titanium.UI.WebView.error>.
  		 */
  val URL_ERROR_AUTHENTICATION: scala.Double = js.native
  /**
  		 * Bad url error code reported via <Titanium.UI.WebView.error>.
  		 */
  val URL_ERROR_BAD_URL: scala.Double = js.native
  /**
  		 * Error code reported via <Titanium.UI.WebView.error> for a failure to connect to host.
  		 */
  val URL_ERROR_CONNECT: scala.Double = js.native
  /**
  		 * Error code reported via <Titanium.UI.WebView.error> for a failure to access a file resource on a host, except "file not found", which has its own constant.
  		 */
  val URL_ERROR_FILE: scala.Double = js.native
  /**
  		 * Error code reported via <Titanium.UI.WebView.error> when a requested file does not exist on the host.
  		 */
  val URL_ERROR_FILE_NOT_FOUND: scala.Double = js.native
  /**
  		 * Error code reported via <Titanium.UI.WebView.error> when a host name cannot be resolved, such as via a DNS lookup error.
  		 */
  val URL_ERROR_HOST_LOOKUP: scala.Double = js.native
  /**
  		 * Error code reported via <Titanium.UI.WebView.error> when a redirect loop is detected.
  		 */
  val URL_ERROR_REDIRECT_LOOP: scala.Double = js.native
  /**
  		 * Error code reported via <Titanium.UI.WebView.error> for an SSL failure.
  		 */
  val URL_ERROR_SSL_FAILED: scala.Double = js.native
  /**
  		 * Error code reported via <Titanium.UI.WebView.error> when a timeout occurs.
  		 */
  val URL_ERROR_TIMEOUT: scala.Double = js.native
  /**
  		 * Error code reported via <Titanium.UI.WebView.error> when an unknown error occurs.
  		 */
  val URL_ERROR_UNKNOWN: scala.Double = js.native
  /**
  		 * Error code reported via <Titanium.UI.WebView.error> when a url contains an unsupported scheme.
  		 */
  val URL_ERROR_UNSUPPORTED_SCHEME: scala.Double = js.native
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: java.lang.String = js.native
  /**
  		 * Sets the background color of the master view (when there are no windows or other top-level
  		 * controls displayed).
  		 */
  var backgroundColor: java.lang.String = js.native
  /**
  		 * Local path or URL to an image file for setting a background for the master view (when there
  		 * are no windows or other top-level controls displayed).
  		 */
  var backgroundImage: java.lang.String = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: scala.Boolean = js.native
  /**
  		 * The currently active tab, if a tab group is open.
  		 */
  var currentTab: titaniumLib.TitaniumNs.UINs.Tab = js.native
  /**
  		 * The active window associated with the executing JavaScript context.
  		 */
  val currentWindow: titaniumLib.TitaniumNs.UINs.Window = js.native
  /**
  		 * Apple iOS specific UI capabilities.  All properties, methods and events in this namespace will
  		 * only work on Apple iOS devices.
  		 */
  val iOSNs: TypeofiOS = js.native
  /**
  		 * iPad specific UI capabilities.
  		 */
  val iPadNs: TypeofiPad = js.native
  /**
  		 * The iPhone/iPad-specific UI capabilities.  All properties, methods and events in this namespace
  		 * will only work on Apple iOS systems.
  		 */
  val iPhoneNs: TypeofiPhone = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Updates the orientation of the current window to the specified orientation value.
  		 */
  var orientation: scala.Double = js.native
  /**
  		 * Sets the global tint color of the application. It is inherited by the child views and can be
  		 * overwritten by them using the `tintColor` property.
  		 */
  var tintColor: java.lang.String = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  		 * Converts one type of unit to another using the metrics of the main display.
  		 */
  def convertUnits(convertFromValue: java.lang.String, convertToUnits: scala.Double): scala.Double = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.2DMatrix>.
  		 */
  def create2DMatrix(): titaniumLib.TitaniumNs.UINs.Matrix2D = js.native
  def create2DMatrix(parameters: Matrix2DCreationDict): titaniumLib.TitaniumNs.UINs.Matrix2D = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.3DMatrix>.
  		 */
  def create3DMatrix(): titaniumLib.TitaniumNs.UINs.Matrix3D = js.native
  def create3DMatrix(parameters: js.Any): titaniumLib.TitaniumNs.UINs.Matrix3D = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ActivityIndicator>.
  		 */
  def createActivityIndicator(): titaniumLib.TitaniumNs.UINs.ActivityIndicator = js.native
  def createActivityIndicator(parameters: js.Any): titaniumLib.TitaniumNs.UINs.ActivityIndicator = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.AlertDialog>.
  		 */
  def createAlertDialog(): titaniumLib.TitaniumNs.UINs.AlertDialog = js.native
  def createAlertDialog(parameters: js.Any): titaniumLib.TitaniumNs.UINs.AlertDialog = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Animation>.
  		 */
  def createAnimation(): titaniumLib.TitaniumNs.UINs.Animation = js.native
  def createAnimation(parameters: js.Any): titaniumLib.TitaniumNs.UINs.Animation = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.AttributedString>.
  		 */
  def createAttributedString(): titaniumLib.TitaniumNs.UINs.AttributedString = js.native
  def createAttributedString(parameters: js.Any): titaniumLib.TitaniumNs.UINs.AttributedString = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Button>.
  		 */
  def createButton(): titaniumLib.TitaniumNs.UINs.Button = js.native
  def createButton(parameters: js.Any): titaniumLib.TitaniumNs.UINs.Button = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ButtonBar>.
  		 */
  def createButtonBar(): titaniumLib.TitaniumNs.UINs.ButtonBar = js.native
  def createButtonBar(parameters: js.Any): titaniumLib.TitaniumNs.UINs.ButtonBar = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.CoverFlowView>.
  		 */
  def createCoverFlowView(): titaniumLib.TitaniumNs.UINs.CoverFlowView = js.native
  def createCoverFlowView(parameters: js.Any): titaniumLib.TitaniumNs.UINs.CoverFlowView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.DashboardItem>.
  		 */
  def createDashboardItem(): titaniumLib.TitaniumNs.UINs.DashboardItem = js.native
  def createDashboardItem(parameters: js.Any): titaniumLib.TitaniumNs.UINs.DashboardItem = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.DashboardView>.
  		 */
  def createDashboardView(): titaniumLib.TitaniumNs.UINs.DashboardView = js.native
  def createDashboardView(parameters: js.Any): titaniumLib.TitaniumNs.UINs.DashboardView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.EmailDialog>.
  		 */
  def createEmailDialog(): titaniumLib.TitaniumNs.UINs.EmailDialog = js.native
  def createEmailDialog(parameters: js.Any): titaniumLib.TitaniumNs.UINs.EmailDialog = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ImageView>.
  		 */
  def createImageView(): titaniumLib.TitaniumNs.UINs.ImageView = js.native
  def createImageView(parameters: js.Any): titaniumLib.TitaniumNs.UINs.ImageView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Label>.
  		 */
  def createLabel(): titaniumLib.TitaniumNs.UINs.Label = js.native
  def createLabel(parameters: js.Any): titaniumLib.TitaniumNs.UINs.Label = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ListSection>.
  		 */
  def createListSection(): titaniumLib.TitaniumNs.UINs.ListSection = js.native
  def createListSection(parameters: js.Any): titaniumLib.TitaniumNs.UINs.ListSection = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ListView>.
  		 */
  def createListView(): titaniumLib.TitaniumNs.UINs.ListView = js.native
  def createListView(parameters: js.Any): titaniumLib.TitaniumNs.UINs.ListView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.MaskedImage>.
  		 */
  def createMaskedImage(): titaniumLib.TitaniumNs.UINs.MaskedImage = js.native
  def createMaskedImage(parameters: js.Any): titaniumLib.TitaniumNs.UINs.MaskedImage = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Matrix2D>.
  		 */
  def createMatrix2D(): titaniumLib.TitaniumNs.UINs.Matrix2D = js.native
  def createMatrix2D(parameters: Matrix2DCreationDict): titaniumLib.TitaniumNs.UINs.Matrix2D = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Matrix3D>.
  		 */
  def createMatrix3D(): titaniumLib.TitaniumNs.UINs.Matrix3D = js.native
  def createMatrix3D(parameters: js.Any): titaniumLib.TitaniumNs.UINs.Matrix3D = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.NavigationWindow>.
  		 */
  def createNavigationWindow(): titaniumLib.TitaniumNs.UINs.NavigationWindow = js.native
  def createNavigationWindow(parameters: js.Any): titaniumLib.TitaniumNs.UINs.NavigationWindow = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Notification>.
  		 */
  def createNotification(): titaniumLib.TitaniumNs.UINs.Notification = js.native
  def createNotification(parameters: js.Any): titaniumLib.TitaniumNs.UINs.Notification = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.OptionDialog>.
  		 */
  def createOptionDialog(): titaniumLib.TitaniumNs.UINs.OptionDialog = js.native
  def createOptionDialog(parameters: js.Any): titaniumLib.TitaniumNs.UINs.OptionDialog = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Picker>.
  		 */
  def createPicker(): titaniumLib.TitaniumNs.UINs.Picker = js.native
  def createPicker(parameters: js.Any): titaniumLib.TitaniumNs.UINs.Picker = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.PickerColumn>.
  		 */
  def createPickerColumn(): titaniumLib.TitaniumNs.UINs.PickerColumn = js.native
  def createPickerColumn(parameters: js.Any): titaniumLib.TitaniumNs.UINs.PickerColumn = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.PickerRow>.
  		 */
  def createPickerRow(): titaniumLib.TitaniumNs.UINs.PickerRow = js.native
  def createPickerRow(parameters: js.Any): titaniumLib.TitaniumNs.UINs.PickerRow = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ProgressBar>.
  		 */
  def createProgressBar(): titaniumLib.TitaniumNs.UINs.ProgressBar = js.native
  def createProgressBar(parameters: js.Any): titaniumLib.TitaniumNs.UINs.ProgressBar = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.RefreshControl>.
  		 */
  def createRefreshControl(): titaniumLib.TitaniumNs.UINs.RefreshControl = js.native
  def createRefreshControl(parameters: js.Any): titaniumLib.TitaniumNs.UINs.RefreshControl = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ScrollView>.
  		 */
  def createScrollView(): titaniumLib.TitaniumNs.UINs.ScrollView = js.native
  def createScrollView(parameters: js.Any): titaniumLib.TitaniumNs.UINs.ScrollView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ScrollableView>.
  		 */
  def createScrollableView(): titaniumLib.TitaniumNs.UINs.ScrollableView = js.native
  def createScrollableView(parameters: js.Any): titaniumLib.TitaniumNs.UINs.ScrollableView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.SearchBar>.
  		 */
  def createSearchBar(): titaniumLib.TitaniumNs.UINs.SearchBar = js.native
  def createSearchBar(parameters: js.Any): titaniumLib.TitaniumNs.UINs.SearchBar = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ShortcutItem>.
  		 */
  def createShortcutItem(): titaniumLib.TitaniumNs.UINs.ShortcutItem = js.native
  def createShortcutItem(parameters: js.Any): titaniumLib.TitaniumNs.UINs.ShortcutItem = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Slider>.
  		 */
  def createSlider(): titaniumLib.TitaniumNs.UINs.Slider = js.native
  def createSlider(parameters: js.Any): titaniumLib.TitaniumNs.UINs.Slider = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Switch>.
  		 */
  def createSwitch(): titaniumLib.TitaniumNs.UINs.Switch = js.native
  def createSwitch(parameters: js.Any): titaniumLib.TitaniumNs.UINs.Switch = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Tab>.
  		 */
  def createTab(): titaniumLib.TitaniumNs.UINs.Tab = js.native
  def createTab(parameters: js.Any): titaniumLib.TitaniumNs.UINs.Tab = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TabGroup>.
  		 */
  def createTabGroup(): titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  def createTabGroup(parameters: js.Any): titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TabbedBar>.
  		 */
  def createTabbedBar(): titaniumLib.TitaniumNs.UINs.TabbedBar = js.native
  def createTabbedBar(parameters: js.Any): titaniumLib.TitaniumNs.UINs.TabbedBar = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TableView>.
  		 */
  def createTableView(): titaniumLib.TitaniumNs.UINs.TableView = js.native
  def createTableView(parameters: js.Any): titaniumLib.TitaniumNs.UINs.TableView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TableViewRow>.
  		 */
  def createTableViewRow(): titaniumLib.TitaniumNs.UINs.TableViewRow = js.native
  def createTableViewRow(parameters: js.Any): titaniumLib.TitaniumNs.UINs.TableViewRow = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TableViewSection>.
  		 */
  def createTableViewSection(): titaniumLib.TitaniumNs.UINs.TableViewSection = js.native
  def createTableViewSection(parameters: js.Any): titaniumLib.TitaniumNs.UINs.TableViewSection = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TextArea>.
  		 */
  def createTextArea(): titaniumLib.TitaniumNs.UINs.TextArea = js.native
  def createTextArea(parameters: js.Any): titaniumLib.TitaniumNs.UINs.TextArea = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TextField>.
  		 */
  def createTextField(): titaniumLib.TitaniumNs.UINs.TextField = js.native
  def createTextField(parameters: js.Any): titaniumLib.TitaniumNs.UINs.TextField = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Toolbar>.
  		 */
  def createToolbar(): titaniumLib.TitaniumNs.UINs.Toolbar = js.native
  def createToolbar(parameters: js.Any): titaniumLib.TitaniumNs.UINs.Toolbar = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.View>.
  		 */
  def createView(): titaniumLib.TitaniumNs.UINs.View = js.native
  def createView(parameters: js.Any): titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.WebView>.
  		 */
  def createWebView(): titaniumLib.TitaniumNs.UINs.WebView = js.native
  def createWebView(parameters: js.Any): titaniumLib.TitaniumNs.UINs.WebView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Window>.
  		 */
  def createWindow(): titaniumLib.TitaniumNs.UINs.Window = js.native
  def createWindow(parameters: js.Any): titaniumLib.TitaniumNs.UINs.Window = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  		 * Gets the value of the <Titanium.UI.apiName> property.
  		 */
  def getApiName(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.UI.backgroundColor> property.
  		 */
  def getBackgroundColor(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.UI.backgroundImage> property.
  		 */
  def getBackgroundImage(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.UI.bubbleParent> property.
  		 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.UI.currentTab> property.
  		 */
  def getCurrentTab(): titaniumLib.TitaniumNs.UINs.Tab = js.native
  /**
  		 * Gets the value of the <Titanium.UI.currentWindow> property.
  		 */
  def getCurrentWindow(): titaniumLib.TitaniumNs.UINs.Window = js.native
  /**
  		 * Gets the value of the <Titanium.UI.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Gets the value of the <Titanium.UI.orientation> property.
  		 */
  def getOrientation(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.UI.tintColor> property.
  		 */
  def getTintColor(): java.lang.String = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.UI.backgroundColor> property.
  		 */
  def setBackgroundColor(backgroundColor: java.lang.String): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.UI.backgroundImage> property.
  		 */
  def setBackgroundImage(backgroundImage: java.lang.String): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.UI.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.UI.currentTab> property.
  		 */
  def setCurrentTab(currentTab: titaniumLib.TitaniumNs.UINs.Tab): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.UI.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.UI.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.UI.orientation> property.
  		 */
  def setOrientation(orientation: scala.Double): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.UI.tintColor> property.
  		 */
  def setTintColor(tintColor: java.lang.String): scala.Unit = js.native
}

