package typings.titanium

import typings.titanium.TitaniumNs.UINs.ActivityIndicator
import typings.titanium.TitaniumNs.UINs.AlertDialog
import typings.titanium.TitaniumNs.UINs.Animation
import typings.titanium.TitaniumNs.UINs.AttributedString
import typings.titanium.TitaniumNs.UINs.Button
import typings.titanium.TitaniumNs.UINs.ButtonBar
import typings.titanium.TitaniumNs.UINs.CoverFlowView
import typings.titanium.TitaniumNs.UINs.DashboardItem
import typings.titanium.TitaniumNs.UINs.DashboardView
import typings.titanium.TitaniumNs.UINs.EmailDialog
import typings.titanium.TitaniumNs.UINs.ImageView
import typings.titanium.TitaniumNs.UINs.Label
import typings.titanium.TitaniumNs.UINs.ListSection
import typings.titanium.TitaniumNs.UINs.ListView
import typings.titanium.TitaniumNs.UINs.MaskedImage
import typings.titanium.TitaniumNs.UINs.Matrix2D
import typings.titanium.TitaniumNs.UINs.Matrix3D
import typings.titanium.TitaniumNs.UINs.NavigationWindow
import typings.titanium.TitaniumNs.UINs.Notification
import typings.titanium.TitaniumNs.UINs.OptionDialog
import typings.titanium.TitaniumNs.UINs.Picker
import typings.titanium.TitaniumNs.UINs.PickerColumn
import typings.titanium.TitaniumNs.UINs.PickerRow
import typings.titanium.TitaniumNs.UINs.ProgressBar
import typings.titanium.TitaniumNs.UINs.RefreshControl
import typings.titanium.TitaniumNs.UINs.ScrollView
import typings.titanium.TitaniumNs.UINs.ScrollableView
import typings.titanium.TitaniumNs.UINs.SearchBar
import typings.titanium.TitaniumNs.UINs.ShortcutItem
import typings.titanium.TitaniumNs.UINs.Slider
import typings.titanium.TitaniumNs.UINs.Switch
import typings.titanium.TitaniumNs.UINs.Tab
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.TabbedBar
import typings.titanium.TitaniumNs.UINs.TableView
import typings.titanium.TitaniumNs.UINs.TableViewRow
import typings.titanium.TitaniumNs.UINs.TableViewSection
import typings.titanium.TitaniumNs.UINs.TextArea
import typings.titanium.TitaniumNs.UINs.TextField
import typings.titanium.TitaniumNs.UINs.Toolbar
import typings.titanium.TitaniumNs.UINs.View
import typings.titanium.TitaniumNs.UINs.WebView
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofUI extends js.Object {
  /**
  		 * Use with [Animation.curve](Titanium.UI.Animation.curve) to specify an animation that starts
  		 * slowly and speeds up.
  		 */
  val ANIMATION_CURVE_EASE_IN: Double = js.native
  /**
  		 * Use with [Animation.curve](Titanium.UI.Animation.curve) to specify an animation that starts
  		 * slowly, and speeds up, then slows down at the end of the animation.
  		 */
  val ANIMATION_CURVE_EASE_IN_OUT: Double = js.native
  /**
  		 * Use with [Animation.curve](Titanium.UI.Animation.curve) to specify an animation that starts
  		 * quickly, then slows down at the end of the animation.
  		 */
  val ANIMATION_CURVE_EASE_OUT: Double = js.native
  /**
  		 * Use with [Animation.curve](Titanium.UI.Animation.curve) to specify an animation that proceeds
  		 * at a constant rate.
  		 */
  val ANIMATION_CURVE_LINEAR: Double = js.native
  /**
  		 * Use with <Attribute.type> to specify a background color.
  		 */
  val ATTRIBUTE_BACKGROUND_COLOR: Double = js.native
  /**
  		 * Use with <Attribute.type> to apply a different baseline to the text.
  		 */
  val ATTRIBUTE_BASELINE_OFFSET: Double = js.native
  /**
  		 * Use with <Attribute.type> to stretch the text horizontally.
  		 */
  val ATTRIBUTE_EXPANSION: Double = js.native
  /**
  		 * Use with <Attribute.type> to specify a font.
  		 */
  val ATTRIBUTE_FONT: Double = js.native
  /**
  		 * Use with <Attribute.type> to specify a font color.
  		 */
  val ATTRIBUTE_FOREGROUND_COLOR: Double = js.native
  /**
  		 * Use with <Attribute.type> to specify kerning (space between characters).
  		 */
  val ATTRIBUTE_KERN: Double = js.native
  /**
  		 * Use with <Attribute.value> to use a letterpress text effect.
  		 */
  val ATTRIBUTE_LETTERPRESS_STYLE: Double = js.native
  /**
  		 * Use with <Attribute.type> to enable or disable ligatures.
  		 */
  val ATTRIBUTE_LIGATURE: Double = js.native
  /**
  		 * Use with <Attribute.type> to wrap and truncate the text.
  		 */
  val ATTRIBUTE_LINE_BREAK: Double = js.native
  /**
  		 * Use with <Attribute.value> to wrap words at word boundaries.
  		 */
  val ATTRIBUTE_LINE_BREAK_BY_CHAR_WRAPPING: Double = js.native
  /**
  		 * Use with <Attribute.value> to set lines to not draw past the edge of the text container.
  		 */
  val ATTRIBUTE_LINE_BREAK_BY_CLIPPING: Double = js.native
  /**
  		 * Use with <Attribute.value> to use ellipsis glyph at the beginning of the line for missing text.
  		 */
  val ATTRIBUTE_LINE_BREAK_BY_TRUNCATING_HEAD: Double = js.native
  /**
  		 * Use with <Attribute.value> to use ellipsis glyph at the middle of the line for missing text.
  		 */
  val ATTRIBUTE_LINE_BREAK_BY_TRUNCATING_MIDDLE: Double = js.native
  /**
  		 * Use with <Attribute.value> to use ellipsis glyph at the end of the line for missing text.
  		 */
  val ATTRIBUTE_LINE_BREAK_BY_TRUNCATING_TAIL: Double = js.native
  /**
  		 * Use with <Attribute.value> to wrap words at word boundaries.
  		 */
  val ATTRIBUTE_LINE_BREAK_BY_WORD_WRAPPING: Double = js.native
  /**
  		 * Use with <Attribute.type> to create a link.
  		 */
  val ATTRIBUTE_LINK: Double = js.native
  /**
  		 * Use with <Attribute.type> to skew the text.
  		 */
  val ATTRIBUTE_OBLIQUENESS: Double = js.native
  /**
  		 * Use with <Attribute.type> to manages the behaviour of string set.
  		 */
  val ATTRIBUTE_PARAGRAPH_STYLE: Double = js.native
  /**
  		 * Use with <Attribute.type> to display a shadow behind the text.
  		 */
  val ATTRIBUTE_SHADOW: Double = js.native
  /**
  		 * Use with <Attribute.type> to change the color of the horizontal line.
  		 */
  val ATTRIBUTE_STRIKETHROUGH_COLOR: Double = js.native
  /**
  		 * Use with <Attribute.type> to place a horizontal line through the text.
  		 */
  val ATTRIBUTE_STRIKETHROUGH_STYLE: Double = js.native
  /**
  		 * Use with <Attribute.type> to specify a color for the stroke text.
  		 */
  val ATTRIBUTE_STROKE_COLOR: Double = js.native
  /**
  		 * Use with <Attribute.type> to specify the width of the stroke text.
  		 */
  val ATTRIBUTE_STROKE_WIDTH: Double = js.native
  /**
  		 * Use with <Attribute.type> to place the text in a lower position.
  		 */
  val ATTRIBUTE_SUBSCRIPT_STYLE: Double = js.native
  /**
  		 * Use with <Attribute.type> to place the text in an upper position.
  		 */
  val ATTRIBUTE_SUPERSCRIPT_STYLE: Double = js.native
  /**
  		 * Use with <Attribute.type> to apply a text effect.
  		 */
  val ATTRIBUTE_TEXT_EFFECT: Double = js.native
  /**
  		 * Use with <Attribute.type> to place a horizontal line under the text.
  		 */
  val ATTRIBUTE_UNDERLINES_STYLE: Double = js.native
  /**
  		 * Use with <Attribute.value> to draw a line only underneath or through words.
  		 */
  val ATTRIBUTE_UNDERLINE_BY_WORD: Double = js.native
  /**
  		 * Use with <Attribute.type> to change the color of the horizontal line.
  		 */
  val ATTRIBUTE_UNDERLINE_COLOR: Double = js.native
  /**
  		 * Use with <Attribute.value> to draw a dashed line.
  		 */
  val ATTRIBUTE_UNDERLINE_PATTERN_DASH: Double = js.native
  /**
  		 * Use with <Attribute.value> to draw an alternating line of dashes and dots.
  		 */
  val ATTRIBUTE_UNDERLINE_PATTERN_DASH_DOT: Double = js.native
  /**
  		 * Use with <Attribute.value> to draw an alternating line of dashes and two dots.
  		 */
  val ATTRIBUTE_UNDERLINE_PATTERN_DASH_DOT_DOT: Double = js.native
  /**
  		 * Use with <Attribute.value> to draw a dotted line.
  		 */
  val ATTRIBUTE_UNDERLINE_PATTERN_DOT: Double = js.native
  /**
  		 * Use with <Attribute.value> to draw a solid line.
  		 */
  val ATTRIBUTE_UNDERLINE_PATTERN_SOLID: Double = js.native
  /**
  		 * Use with <Attribute.value> to draw a double line.
  		 */
  val ATTRIBUTE_UNDERLINE_STYLE_DOUBLE: Double = js.native
  /**
  		 * Use with <Attribute.value> to not draw a line.
  		 */
  val ATTRIBUTE_UNDERLINE_STYLE_NONE: Double = js.native
  /**
  		 * Use with <Attribute.value> to draw a single line.
  		 */
  val ATTRIBUTE_UNDERLINE_STYLE_SINGLE: Double = js.native
  /**
  		 * Use with <Attribute.value> to draw a thick line.
  		 */
  val ATTRIBUTE_UNDERLINE_STYLE_THICK: Double = js.native
  /**
  		 * Use with <Attribute.type> to control the direction of the text.
  		 */
  val ATTRIBUTE_WRITING_DIRECTION: Double = js.native
  /**
  		 * Use with <Attribute.value> to use the embedded text direction.
  		 */
  val ATTRIBUTE_WRITING_DIRECTION_EMBEDDING: Double = js.native
  /**
  		 * Use with <Attribute.value> to write text left to right.
  		 */
  val ATTRIBUTE_WRITING_DIRECTION_LEFT_TO_RIGHT: Double = js.native
  /**
  		 * Use with <Attribute.value> to use the
  		 * [Unicode Bidirection Algorithm rules P2 and P3](http://www.unicode.org/reports/tr9/#The_Paragraph_Level)
  		 * to determine which direction to use.
  		 */
  val ATTRIBUTE_WRITING_DIRECTION_NATURAL: Double = js.native
  /**
  		 * Use with <Attribute.value> to override the text direction.
  		 */
  val ATTRIBUTE_WRITING_DIRECTION_OVERRIDE: Double = js.native
  /**
  		 * Use with <Attribute.value> to write text right to left.
  		 */
  val ATTRIBUTE_WRITING_DIRECTION_RIGHT_TO_LEFT: Double = js.native
  /**
  		 * Converts strings formatted as addresses into clickable links.
  		 */
  val AUTODETECT_ADDRESS: Double = js.native
  /**
  		 * Converts all detectable types of data into clickable links.
  		 */
  val AUTODETECT_ALL: Double = js.native
  /**
  		 * Converts strings formatted as calendar events into clickable links.
  		 */
  val AUTODETECT_CALENDAR: Double = js.native
  /**
  		 * Converts strings formatted as URLs into clickable links.
  		 */
  val AUTODETECT_LINK: Double = js.native
  /**
  		 * Disables converting strings into clickable links.
  		 */
  val AUTODETECT_NONE: Double = js.native
  /**
  		 * Converts strings formatted as phone numbers into clickable links.
  		 */
  val AUTODETECT_PHONE: Double = js.native
  /**
  		 * Specifies the expectation of an address.
  		 */
  val AUTOFILL_TYPE_ADDRESS: String = js.native
  /**
  		 * Specifies the expectation of a city name.
  		 */
  val AUTOFILL_TYPE_ADDRESS_CITY: String = js.native
  /**
  		 * Specifies the expectation of a city name combined with a state name.
  		 */
  val AUTOFILL_TYPE_ADDRESS_CITY_STATE: String = js.native
  /**
  		 * Specifies the expectation of the first line of a street address.
  		 */
  val AUTOFILL_TYPE_ADDRESS_LINE1: String = js.native
  /**
  		 * Specifies the expectation of the second line of a street address.
  		 */
  val AUTOFILL_TYPE_ADDRESS_LINE2: String = js.native
  /**
  		 * Specifies the expectation of a state name.
  		 */
  val AUTOFILL_TYPE_ADDRESS_STATE: String = js.native
  /**
  		 * Specifies the expectation of a card expiration date.
  		 */
  val AUTOFILL_TYPE_CARD_EXPIRATION_DATE: String = js.native
  /**
  		 * Specifies the expectation of a card expiration day.
  		 */
  val AUTOFILL_TYPE_CARD_EXPIRATION_DAY: String = js.native
  /**
  		 * Specifies the expectation of a card expiration month.
  		 */
  val AUTOFILL_TYPE_CARD_EXPIRATION_MONTH: String = js.native
  /**
  		 * Specifies the expectation of a card expiration year.
  		 */
  val AUTOFILL_TYPE_CARD_EXPIRATION_YEAR: String = js.native
  /**
  		 * Specifies the expectation of a card number.
  		 */
  val AUTOFILL_TYPE_CARD_NUMBER: String = js.native
  /**
  		 * Specifies the expectation of a card security code.
  		 */
  val AUTOFILL_TYPE_CARD_SECURITY_CODE: String = js.native
  /**
  		 * Specifies the expectation of a country name.
  		 */
  val AUTOFILL_TYPE_COUNTRY_NAME: String = js.native
  /**
  		 * Specifies the expectation of an email address.
  		 */
  val AUTOFILL_TYPE_EMAIL: String = js.native
  /**
  		 * Specifies the expectation of a family name.
  		 */
  val AUTOFILL_TYPE_FAMILY_NAME: String = js.native
  /**
  		 * Specifies the expectation of a given name.
  		 */
  val AUTOFILL_TYPE_GIVEN_NAME: String = js.native
  /**
  		 * Specifies the expectation of a job title.
  		 */
  val AUTOFILL_TYPE_JOB_TITLE: String = js.native
  /**
  		 * Specifies the expectation of a location, such as a point of interest, an address, or another way to identify a location.
  		 */
  val AUTOFILL_TYPE_LOCATION: String = js.native
  /**
  		 * Specifies the expectation of a middle name.
  		 */
  val AUTOFILL_TYPE_MIDDLE_NAME: String = js.native
  /**
  		 * Specifies the expectation of a name.
  		 */
  val AUTOFILL_TYPE_NAME: String = js.native
  /**
  		 * Specifies the expectation of a prefix or title, such as 'Dr.'
  		 */
  val AUTOFILL_TYPE_NAME_PREFIX: String = js.native
  /**
  		 * Specifies the expectation of a suffix, such as 'Jr.'
  		 */
  val AUTOFILL_TYPE_NAME_SUFFIX: String = js.native
  /**
  		 * Specifies the expectation of a new password.
  		 */
  val AUTOFILL_TYPE_NEW_PASSWORD: String = js.native
  /**
  		 * Specifies the expectation of a nickname.
  		 */
  val AUTOFILL_TYPE_NICKNAME: String = js.native
  /**
  		 * Specifies the expectation of a single-factor SMS login code.
  		 */
  val AUTOFILL_TYPE_ONE_TIME_CODE: String = js.native
  /**
  		 * Specifies the expectation of an organization name.
  		 */
  val AUTOFILL_TYPE_ORGANIZATION_NAME: String = js.native
  /**
  		 * Specifies the expectation of a password.
  		 */
  val AUTOFILL_TYPE_PASSWORD: String = js.native
  /**
  		 * Specifies the expectation of a telephone number.
  		 */
  val AUTOFILL_TYPE_PHONE: String = js.native
  /**
  		 * Specifies the expectation of a postal code.
  		 */
  val AUTOFILL_TYPE_POSTAL_CODE: String = js.native
  /**
  		 * Specifies the expectation of a sublocality.
  		 */
  val AUTOFILL_TYPE_SUBLOCALITY: String = js.native
  /**
  		 * Specifies the expectation of a URL.
  		 */
  val AUTOFILL_TYPE_URL: String = js.native
  /**
  		 * Specifies the expectation of an account or login name.
  		 */
  val AUTOFILL_TYPE_USERNAME: String = js.native
  /**
  		 * Converts all detectable types of data into clickable links.
  		 */
  val AUTOLINK_ALL: Double = js.native
  /**
  		 * Converts strings formatted as calendar events into clickable links.
  		 */
  val AUTOLINK_CALENDAR: Double = js.native
  /**
  		 * Converts strings formatted as email addresses into clickable links.
  		 */
  val AUTOLINK_EMAIL_ADDRESSES: Double = js.native
  /**
  		 * Converts strings formatted as addresses into clickable links.
  		 */
  val AUTOLINK_MAP_ADDRESSES: Double = js.native
  /**
  		 * Disables converting strings into clickable links.
  		 */
  val AUTOLINK_NONE: Double = js.native
  /**
  		 * Converts strings formatted as phone numbers into clickable links.
  		 */
  val AUTOLINK_PHONE_NUMBERS: Double = js.native
  /**
  		 * Converts strings formatted as URLs into clickable links.
  		 */
  val AUTOLINK_URLS: Double = js.native
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
  val BLEND_MODE_CLEAR: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_COLOR: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_COLOR_BURN: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_COLOR_DODGE: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_COPY: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_DARKEN: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_DESTINATION_ATOP: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_DESTINATION_IN: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_DESTINATION_OUT: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_DESTINATION_OVER: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_DIFFERENCE: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_EXCLUSION: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_HARD_LIGHT: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_HUE: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_LIGHTEN: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_LUMINOSITY: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_MULTIPLY: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_NORMAL: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_OVERLAY: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_PLUS_DARKER: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_PLUS_LIGHTER: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_SATURATION: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_SCREEN: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_SOFT_LIGHT: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_SOURCE_ATOP: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_SOURCE_IN: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_SOURCE_OUT: Double = js.native
  /**
  		 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  		 */
  val BLEND_MODE_XOR: Double = js.native
  /**
  		 * Specifies the time and date that you want the system to remove the clipboard items from the clipboard.
  		 */
  val CLIPBOARD_OPTION_EXPIRATION_DATE: String = js.native
  /**
  		 * Specifies that the clipboard items should not be available to other devices through Handoff.
  		 */
  val CLIPBOARD_OPTION_LOCAL_ONLY: String = js.native
  /**
  		 * A module used for accessing clipboard data.
  		 */
  val ClipboardNs: TypeofClipboard = js.native
  /**
  		 * Specifies that all the edges of the window can extend.
  		 */
  val EXTEND_EDGE_ALL: Double = js.native
  /**
  		 * Specifies that the bottom edge of the window can extend.
  		 */
  val EXTEND_EDGE_BOTTOM: Double = js.native
  /**
  		 * Specifies that the left edge of the window can extend.
  		 */
  val EXTEND_EDGE_LEFT: Double = js.native
  /**
  		 * Specifies that none of the edges of the window can extend.
  		 */
  val EXTEND_EDGE_NONE: Double = js.native
  /**
  		 * Specifies that the right edge of the window can extend.
  		 */
  val EXTEND_EDGE_RIGHT: Double = js.native
  /**
  		 * Specifies that the top edge of the window can extend.
  		 */
  val EXTEND_EDGE_TOP: Double = js.native
  /**
  		 * Constant value for face-down orientation.
  		 */
  val FACE_DOWN: Double = js.native
  /**
  		 * Constant value for face-up orientation.
  		 */
  val FACE_UP: Double = js.native
  /**
  		 * FILL behavior for UI layout.
  		 */
  val FILL: String = js.native
  /**
  		 * Release free space when hiding an object.
  		 */
  val HIDDEN_BEHAVIOR_GONE: Double = js.native
  /**
  		 * Keeps free space when hiding an object.
  		 */
  val HIDDEN_BEHAVIOR_INVISIBLE: Double = js.native
  /**
  		 * Use when creating a TextField to specify the hintType as animated.
  		 */
  val HINT_TYPE_ANIMATED: Double = js.native
  /**
  		 * Use when creating a TextField to specify the hintType as static.
  		 */
  val HINT_TYPE_STATIC: Double = js.native
  /**
  		 * Use a bezel-style border on the input field.
  		 */
  val INPUT_BORDERSTYLE_BEZEL: Double = js.native
  /**
  		 * Use a simple line border on the input field.
  		 */
  val INPUT_BORDERSTYLE_LINE: Double = js.native
  /**
  		 * Use no border on the input field.
  		 */
  val INPUT_BORDERSTYLE_NONE: Double = js.native
  /**
  		 * Use a rounded-rectangle border on the input field.
  		 */
  val INPUT_BORDERSTYLE_ROUNDED: Double = js.native
  /**
  		 * Always show buttons on the input field.
  		 */
  val INPUT_BUTTONMODE_ALWAYS: Double = js.native
  /**
  		 * Never show buttons on the input field.
  		 */
  val INPUT_BUTTONMODE_NEVER: Double = js.native
  /**
  		 * Show buttons on the input field when it loses focus.
  		 */
  val INPUT_BUTTONMODE_ONBLUR: Double = js.native
  /**
  		 * Show buttons on the input field when it gains focus.
  		 */
  val INPUT_BUTTONMODE_ONFOCUS: Double = js.native
  /**
  		 * Use a keyboard with a number pad only, with the pad keyboard layout. Accepts only numbers.
  		 */
  val INPUT_TYPE_CLASS_NUMBER: Double = js.native
  /**
  		 * Use an ASCII keyboard, with the standard keyboard layout.
  		 */
  val INPUT_TYPE_CLASS_TEXT: Double = js.native
  /**
  		 * Use a keyboard appearance suitable for entering text on an alert.
  		 */
  val KEYBOARD_APPEARANCE_ALERT: Double = js.native
  /**
  		 * Use the platform-specific dark keyboard appearance.
  		 */
  val KEYBOARD_APPEARANCE_DARK: Double = js.native
  /**
  		 * Use the platform-specific default keyboard appearance.
  		 */
  val KEYBOARD_APPEARANCE_DEFAULT: Double = js.native
  /**
  		 * Use the platform-specific light keyboard appearance.
  		 */
  val KEYBOARD_APPEARANCE_LIGHT: Double = js.native
  /**
  		 * Use an ASCII keyboard, with the standard keyboard layout.
  		 */
  val KEYBOARD_ASCII: Double = js.native
  /**
  		 * Use a keyboard with decimal numbers only, with the pad keyboard layout.
  		 */
  val KEYBOARD_DECIMAL_PAD: Double = js.native
  /**
  		 * Use the default keyboard, depending on the platform.
  		 */
  val KEYBOARD_DEFAULT: Double = js.native
  /**
  		 * Use a keyboard suitable for composing email, with the standard keyboard layout.
  		 */
  val KEYBOARD_EMAIL: Double = js.native
  /**
  		 * Use a keyboard suitable for entering names and phone numbers, with the pad keyboard layout.
  		 */
  val KEYBOARD_NAMEPHONE_PAD: Double = js.native
  /**
  		 * Use a keyboard with numbers and punctuation only, with the standard keyboard layout.
  		 */
  val KEYBOARD_NUMBERS_PUNCTUATION: Double = js.native
  /**
  		 * Use a keyboard with a number pad only, with the pad keyboard layout.
  		 */
  val KEYBOARD_NUMBER_PAD: Double = js.native
  /**
  		 * Use a keyboard with a phone-style number pad, with the pad keyboard layout.
  		 */
  val KEYBOARD_PHONE_PAD: Double = js.native
  /**
  		 * Use an ASCII keyboard, with the standard keyboard layout.
  		 */
  val KEYBOARD_TYPE_ASCII: Double = js.native
  /**
  		 * Use a keyboard with decimal numbers only, with the pad keyboard layout.
  		 */
  val KEYBOARD_TYPE_DECIMAL_PAD: Double = js.native
  /**
  		 * Use the default keyboard, depending on the platform.
  		 */
  val KEYBOARD_TYPE_DEFAULT: Double = js.native
  /**
  		 * Use a keyboard suitable for composing email, with the standard keyboard layout.
  		 */
  val KEYBOARD_TYPE_EMAIL: Double = js.native
  /**
  		 * Use a keyboard suitable for entering names and phone numbers, with the pad keyboard layout.
  		 */
  val KEYBOARD_TYPE_NAMEPHONE_PAD: Double = js.native
  /**
  		 * Use a keyboard with numbers and punctuation only, with the standard keyboard layout.
  		 */
  val KEYBOARD_TYPE_NUMBERS_PUNCTUATION: Double = js.native
  /**
  		 * Use a keyboard with a number pad only, with the pad keyboard layout.
  		 */
  val KEYBOARD_TYPE_NUMBER_PAD: Double = js.native
  /**
  		 * Use a keyboard with a phone-style number pad, with the pad keyboard layout.
  		 */
  val KEYBOARD_TYPE_PHONE_PAD: Double = js.native
  /**
  		 * Use a keyboard optimized for twitter text entry, with easy access to the @ and
  		 */
  val KEYBOARD_TYPE_TWITTER: Double = js.native
  /**
  		 * Use a keyboard optimized for entering URLs, with the standard keyboard layout.
  		 */
  val KEYBOARD_TYPE_URL: Double = js.native
  /**
  		 * Use a keyboard optimized for web search terms and URL entry.
  		 */
  val KEYBOARD_TYPE_WEBSEARCH: Double = js.native
  /**
  		 * Use a keyboard optimized for entering URLs, with the standard keyboard layout.
  		 */
  val KEYBOARD_URL: Double = js.native
  /**
  		 * Standard landscape orientation (home button on left).
  		 */
  val LANDSCAPE_LEFT: Double = js.native
  /**
  		 * Reverse landscape orientation (home button on right).
  		 */
  val LANDSCAPE_RIGHT: Double = js.native
  /**
  		 * Displays a checkmark on the right side of an item in a list view.
  		 */
  val LIST_ACCESSORY_TYPE_CHECKMARK: Double = js.native
  /**
  		 * Displays a detail disclosure button on the right side of an item in a list view.
  		 */
  val LIST_ACCESSORY_TYPE_DETAIL: Double = js.native
  /**
  		 * Displays a disclosure indicator on the right side of an item in a list view.
  		 */
  val LIST_ACCESSORY_TYPE_DISCLOSURE: Double = js.native
  /**
  		 * Do not display anything on the right side of an item in a list view.
  		 */
  val LIST_ACCESSORY_TYPE_NONE: Double = js.native
  /**
  		 * A built-in style for an item with a right-aligned title label on the left side of the cell,
  		 * which is next to a left-aligned subtitle label.
  		 */
  val LIST_ITEM_TEMPLATE_CONTACTS: Double = js.native
  /**
  		 * A built-in style for an item with an image view and left-aligned title label.
  		 */
  val LIST_ITEM_TEMPLATE_DEFAULT: Double = js.native
  /**
  		 * A built-in style for a item with an image view; a left-aligned title label; and a
  		 * right-aligned subtitle label.
  		 */
  val LIST_ITEM_TEMPLATE_SETTINGS: Double = js.native
  /**
  		 * A built-in style for an item with an image view; a black, left-aligned title label across the
  		 * top of the cell and a subtitle label below it.
  		 */
  val LIST_ITEM_TEMPLATE_SUBTITLE: Double = js.native
  /**
  		 * Specifies a long duration for an Android Toast notification (<Titanium.UI.Notification>).
  		 */
  val NOTIFICATION_DURATION_LONG: Double = js.native
  /**
  		 * Specifies a short duration for an Android Toast notification (<Titanium.UI.Notification>).
  		 */
  val NOTIFICATION_DURATION_SHORT: Double = js.native
  /**
  		 * Use a picker with a countdown timer appearance, showing hours and minutes.
  		 */
  val PICKER_TYPE_COUNT_DOWN_TIMER: Double = js.native
  /**
  		 * Use a date picker.
  		 */
  val PICKER_TYPE_DATE: Double = js.native
  /**
  		 * Use a date and time picker.
  		 */
  val PICKER_TYPE_DATE_AND_TIME: Double = js.native
  /**
  		 * Use a plain picker (for values other than date or time).
  		 */
  val PICKER_TYPE_PLAIN: Double = js.native
  /**
  		 * Use a time picker.
  		 */
  val PICKER_TYPE_TIME: Double = js.native
  /**
  		 * Orientation constant for portrait mode orientation.
  		 */
  val PORTRAIT: Double = js.native
  /**
  		 * Set the return key text to "Continue".
  		 */
  val RETURNKEY_CONTINUE: Double = js.native
  /**
  		 * Use the default return key on the virtual keyboard.
  		 */
  val RETURNKEY_DEFAULT: Double = js.native
  /**
  		 * Set the return key text to "Done".
  		 */
  val RETURNKEY_DONE: Double = js.native
  /**
  		 * Set the return key text to "Emergency Call".
  		 */
  val RETURNKEY_EMERGENCY_CALL: Double = js.native
  /**
  		 * Set the return key text to "Go".
  		 */
  val RETURNKEY_GO: Double = js.native
  /**
  		 * Set the return key text to "Google".
  		 */
  val RETURNKEY_GOOGLE: Double = js.native
  /**
  		 * Set the return key text to "Join".
  		 */
  val RETURNKEY_JOIN: Double = js.native
  /**
  		 * Set the return key text to "Next".
  		 */
  val RETURNKEY_NEXT: Double = js.native
  /**
  		 * Set the return key text to "Route".
  		 */
  val RETURNKEY_ROUTE: Double = js.native
  /**
  		 * Set the return key text to "Search".
  		 */
  val RETURNKEY_SEARCH: Double = js.native
  /**
  		 * Set the return key text to "Send".
  		 */
  val RETURNKEY_SEND: Double = js.native
  /**
  		 * Set the return key text to "Yahoo".
  		 */
  val RETURNKEY_YAHOO: Double = js.native
  /**
  		 * SIZE behavior for UI layout.
  		 */
  val SIZE: String = js.native
  /**
  		 * The row divider is hidden.
  		 */
  val TABLE_VIEW_SEPARATOR_STYLE_NONE: Double = js.native
  /**
  		 * The row divider is shown as a single line.
  		 */
  val TABLE_VIEW_SEPARATOR_STYLE_SINGLE_LINE: Double = js.native
  /**
  		 * Center align text.
  		 */
  val TEXT_ALIGNMENT_CENTER: Double | String = js.native
  /**
  		 * Justify align text.
  		 */
  val TEXT_ALIGNMENT_JUSTIFY: Double | String = js.native
  /**
  		 * Left align text.
  		 */
  val TEXT_ALIGNMENT_LEFT: Double | String = js.native
  /**
  		 * Right align text.
  		 */
  val TEXT_ALIGNMENT_RIGHT: Double | String = js.native
  /**
  		 * Auto-capitalize all text in the input field.
  		 */
  val TEXT_AUTOCAPITALIZATION_ALL: Double = js.native
  /**
  		 * Do not auto-capitalize.
  		 */
  val TEXT_AUTOCAPITALIZATION_NONE: Double = js.native
  /**
  		 * Use sentence-style auto-capitalization in the input field.
  		 */
  val TEXT_AUTOCAPITALIZATION_SENTENCES: Double = js.native
  /**
  		 * Auto-capitalize the first letter of each word in the input field.
  		 */
  val TEXT_AUTOCAPITALIZATION_WORDS: Double = js.native
  /**
  		 * Add ellipses before the first character that doesnt fit.
  		 */
  val TEXT_ELLIPSIZE_TRUNCATE_CHAR_WRAP: Double = js.native
  /**
  		 * Lines are simply not drawn past the edge of the text container.
  		 */
  val TEXT_ELLIPSIZE_TRUNCATE_CLIP: Double = js.native
  /**
  		 * Add ellipses at the end of the label if the text is too large to fit.
  		 */
  val TEXT_ELLIPSIZE_TRUNCATE_END: Double = js.native
  /**
  		 * Turns on a marquee effect of the label if the text is too large to fit. (This requires <Titanium.UI.Label.focusable> to be true)
  		 */
  val TEXT_ELLIPSIZE_TRUNCATE_MARQUEE: Double = js.native
  /**
  		 * Add ellipses in the middle of the label if the text is too large to fit.
  		 */
  val TEXT_ELLIPSIZE_TRUNCATE_MIDDLE: Double = js.native
  /**
  		 * Disables ellipsizing of the label. The text will be cut off if it is too long.
  		 */
  val TEXT_ELLIPSIZE_TRUNCATE_NONE: Double = js.native
  /**
  		 * Add ellipses at the beginning of the label if the text is too large to fit.
  		 */
  val TEXT_ELLIPSIZE_TRUNCATE_START: Double = js.native
  /**
  		 * Add ellipses at word boundaries, unless the word itself doesn't fit on a single line.
  		 */
  val TEXT_ELLIPSIZE_TRUNCATE_WORD_WRAP: Double = js.native
  /**
  		 * Specifies the text style for the <Font> Object.
  		 */
  val TEXT_STYLE_BODY: String = js.native
  /**
  		 * Specifies the text style for the <Font> Object.
  		 */
  val TEXT_STYLE_CALLOUT: String = js.native
  /**
  		 * Specifies the text style for the <Font> Object.
  		 */
  val TEXT_STYLE_CAPTION1: String = js.native
  /**
  		 * Specifies the text style for the <Font> Object.
  		 */
  val TEXT_STYLE_CAPTION2: String = js.native
  /**
  		 * Specifies the text style for the <Font> Object.
  		 */
  val TEXT_STYLE_FOOTNOTE: String = js.native
  /**
  		 * Specifies the text style for the <Font> Object.
  		 */
  val TEXT_STYLE_HEADLINE: String = js.native
  /**
  		 * Specifies the text style for the <Font> Object.
  		 */
  val TEXT_STYLE_SUBHEADLINE: String = js.native
  /**
  		 * Specifies the text style for the <Font> Object.
  		 */
  val TEXT_STYLE_TITLE1: String = js.native
  /**
  		 * Specifies the text style for the <Font> Object.
  		 */
  val TEXT_STYLE_TITLE2: String = js.native
  /**
  		 * Specifies the text style for the <Font> Object.
  		 */
  val TEXT_STYLE_TITLE3: String = js.native
  /**
  		 * Align text to the bottom of the view.
  		 */
  val TEXT_VERTICAL_ALIGNMENT_BOTTOM: Double | String = js.native
  /**
  		 * Vertically align text to the center of the view.
  		 */
  val TEXT_VERTICAL_ALIGNMENT_CENTER: Double | String = js.native
  /**
  		 * Align text to the top of the view.
  		 */
  val TEXT_VERTICAL_ALIGNMENT_TOP: Double | String = js.native
  /**
  		 * Unit constant representing units in centimeters.
  		 */
  val UNIT_CM: String = js.native
  /**
  		 * Unit constant representing units in density-independent pixels.
  		 */
  val UNIT_DIP: String = js.native
  /**
  		 * Unit constant representing units in inches.
  		 */
  val UNIT_IN: String = js.native
  /**
  		 * Unit constant representing units in millimeters.
  		 */
  val UNIT_MM: String = js.native
  /**
  		 * Unit constant representing units in pixels.
  		 */
  val UNIT_PX: String = js.native
  /**
  		 * Orientation constant representing an unknown orientation.
  		 */
  val UNKNOWN: Double = js.native
  /**
  		 * Orientation constant for inverted portait orientation.
  		 */
  val UPSIDE_PORTRAIT: Double = js.native
  /**
  		 * Authentication error code reported via <Titanium.UI.WebView.error>.
  		 */
  val URL_ERROR_AUTHENTICATION: Double = js.native
  /**
  		 * Bad url error code reported via <Titanium.UI.WebView.error>.
  		 */
  val URL_ERROR_BAD_URL: Double = js.native
  /**
  		 * Error code reported via <Titanium.UI.WebView.error> for a failure to connect to host.
  		 */
  val URL_ERROR_CONNECT: Double = js.native
  /**
  		 * Error code reported via <Titanium.UI.WebView.error> for a failure to access a file resource on a host, except "file not found", which has its own constant.
  		 */
  val URL_ERROR_FILE: Double = js.native
  /**
  		 * Error code reported via <Titanium.UI.WebView.error> when a requested file does not exist on the host.
  		 */
  val URL_ERROR_FILE_NOT_FOUND: Double = js.native
  /**
  		 * Error code reported via <Titanium.UI.WebView.error> when a host name cannot be resolved, such as via a DNS lookup error.
  		 */
  val URL_ERROR_HOST_LOOKUP: Double = js.native
  /**
  		 * Error code reported via <Titanium.UI.WebView.error> when a redirect loop is detected.
  		 */
  val URL_ERROR_REDIRECT_LOOP: Double = js.native
  /**
  		 * Error code reported via <Titanium.UI.WebView.error> for an SSL failure.
  		 */
  val URL_ERROR_SSL_FAILED: Double = js.native
  /**
  		 * Error code reported via <Titanium.UI.WebView.error> when a timeout occurs.
  		 */
  val URL_ERROR_TIMEOUT: Double = js.native
  /**
  		 * Error code reported via <Titanium.UI.WebView.error> when an unknown error occurs.
  		 */
  val URL_ERROR_UNKNOWN: Double = js.native
  /**
  		 * Error code reported via <Titanium.UI.WebView.error> when a url contains an unsupported scheme.
  		 */
  val URL_ERROR_UNSUPPORTED_SCHEME: Double = js.native
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: String = js.native
  /**
  		 * Sets the background color of the master view (when there are no windows or other top-level
  		 * controls displayed).
  		 */
  var backgroundColor: String = js.native
  /**
  		 * Local path or URL to an image file for setting a background for the master view (when there
  		 * are no windows or other top-level controls displayed).
  		 */
  var backgroundImage: String = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: Boolean = js.native
  /**
  		 * The currently active tab, if a tab group is open.
  		 */
  var currentTab: Tab = js.native
  /**
  		 * The active window associated with the executing JavaScript context.
  		 */
  val currentWindow: Window = js.native
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
  var lifecycleContainer: Window | TabGroup = js.native
  /**
  		 * Updates the orientation of the current window to the specified orientation value.
  		 */
  var orientation: Double = js.native
  /**
  		 * Sets the global tint color of the application. It is inherited by the child views and can be
  		 * overwritten by them using the `tintColor` property.
  		 */
  var tintColor: String = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  		 * Converts one type of unit to another using the metrics of the main display.
  		 */
  def convertUnits(convertFromValue: String, convertToUnits: Double): Double = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.2DMatrix>.
  		 */
  def create2DMatrix(): Matrix2D = js.native
  def create2DMatrix(parameters: Matrix2DCreationDict): Matrix2D = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.3DMatrix>.
  		 */
  def create3DMatrix(): Matrix3D = js.native
  def create3DMatrix(parameters: js.Any): Matrix3D = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ActivityIndicator>.
  		 */
  def createActivityIndicator(): ActivityIndicator = js.native
  def createActivityIndicator(parameters: js.Any): ActivityIndicator = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.AlertDialog>.
  		 */
  def createAlertDialog(): AlertDialog = js.native
  def createAlertDialog(parameters: js.Any): AlertDialog = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Animation>.
  		 */
  def createAnimation(): Animation = js.native
  def createAnimation(parameters: js.Any): Animation = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.AttributedString>.
  		 */
  def createAttributedString(): AttributedString = js.native
  def createAttributedString(parameters: js.Any): AttributedString = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Button>.
  		 */
  def createButton(): Button = js.native
  def createButton(parameters: js.Any): Button = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ButtonBar>.
  		 */
  def createButtonBar(): ButtonBar = js.native
  def createButtonBar(parameters: js.Any): ButtonBar = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.CoverFlowView>.
  		 */
  def createCoverFlowView(): CoverFlowView = js.native
  def createCoverFlowView(parameters: js.Any): CoverFlowView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.DashboardItem>.
  		 */
  def createDashboardItem(): DashboardItem = js.native
  def createDashboardItem(parameters: js.Any): DashboardItem = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.DashboardView>.
  		 */
  def createDashboardView(): DashboardView = js.native
  def createDashboardView(parameters: js.Any): DashboardView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.EmailDialog>.
  		 */
  def createEmailDialog(): EmailDialog = js.native
  def createEmailDialog(parameters: js.Any): EmailDialog = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ImageView>.
  		 */
  def createImageView(): ImageView = js.native
  def createImageView(parameters: js.Any): ImageView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Label>.
  		 */
  def createLabel(): Label = js.native
  def createLabel(parameters: js.Any): Label = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ListSection>.
  		 */
  def createListSection(): ListSection = js.native
  def createListSection(parameters: js.Any): ListSection = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ListView>.
  		 */
  def createListView(): ListView = js.native
  def createListView(parameters: js.Any): ListView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.MaskedImage>.
  		 */
  def createMaskedImage(): MaskedImage = js.native
  def createMaskedImage(parameters: js.Any): MaskedImage = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Matrix2D>.
  		 */
  def createMatrix2D(): Matrix2D = js.native
  def createMatrix2D(parameters: Matrix2DCreationDict): Matrix2D = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Matrix3D>.
  		 */
  def createMatrix3D(): Matrix3D = js.native
  def createMatrix3D(parameters: js.Any): Matrix3D = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.NavigationWindow>.
  		 */
  def createNavigationWindow(): NavigationWindow = js.native
  def createNavigationWindow(parameters: js.Any): NavigationWindow = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Notification>.
  		 */
  def createNotification(): Notification = js.native
  def createNotification(parameters: js.Any): Notification = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.OptionDialog>.
  		 */
  def createOptionDialog(): OptionDialog = js.native
  def createOptionDialog(parameters: js.Any): OptionDialog = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Picker>.
  		 */
  def createPicker(): Picker = js.native
  def createPicker(parameters: js.Any): Picker = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.PickerColumn>.
  		 */
  def createPickerColumn(): PickerColumn = js.native
  def createPickerColumn(parameters: js.Any): PickerColumn = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.PickerRow>.
  		 */
  def createPickerRow(): PickerRow = js.native
  def createPickerRow(parameters: js.Any): PickerRow = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ProgressBar>.
  		 */
  def createProgressBar(): ProgressBar = js.native
  def createProgressBar(parameters: js.Any): ProgressBar = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.RefreshControl>.
  		 */
  def createRefreshControl(): RefreshControl = js.native
  def createRefreshControl(parameters: js.Any): RefreshControl = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ScrollView>.
  		 */
  def createScrollView(): ScrollView = js.native
  def createScrollView(parameters: js.Any): ScrollView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ScrollableView>.
  		 */
  def createScrollableView(): ScrollableView = js.native
  def createScrollableView(parameters: js.Any): ScrollableView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.SearchBar>.
  		 */
  def createSearchBar(): SearchBar = js.native
  def createSearchBar(parameters: js.Any): SearchBar = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ShortcutItem>.
  		 */
  def createShortcutItem(): ShortcutItem = js.native
  def createShortcutItem(parameters: js.Any): ShortcutItem = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Slider>.
  		 */
  def createSlider(): Slider = js.native
  def createSlider(parameters: js.Any): Slider = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Switch>.
  		 */
  def createSwitch(): Switch = js.native
  def createSwitch(parameters: js.Any): Switch = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Tab>.
  		 */
  def createTab(): Tab = js.native
  def createTab(parameters: js.Any): Tab = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TabGroup>.
  		 */
  def createTabGroup(): TabGroup = js.native
  def createTabGroup(parameters: js.Any): TabGroup = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TabbedBar>.
  		 */
  def createTabbedBar(): TabbedBar = js.native
  def createTabbedBar(parameters: js.Any): TabbedBar = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TableView>.
  		 */
  def createTableView(): TableView = js.native
  def createTableView(parameters: js.Any): TableView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TableViewRow>.
  		 */
  def createTableViewRow(): TableViewRow = js.native
  def createTableViewRow(parameters: js.Any): TableViewRow = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TableViewSection>.
  		 */
  def createTableViewSection(): TableViewSection = js.native
  def createTableViewSection(parameters: js.Any): TableViewSection = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TextArea>.
  		 */
  def createTextArea(): TextArea = js.native
  def createTextArea(parameters: js.Any): TextArea = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TextField>.
  		 */
  def createTextField(): TextField = js.native
  def createTextField(parameters: js.Any): TextField = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Toolbar>.
  		 */
  def createToolbar(): Toolbar = js.native
  def createToolbar(parameters: js.Any): Toolbar = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.View>.
  		 */
  def createView(): View = js.native
  def createView(parameters: js.Any): View = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.WebView>.
  		 */
  def createWebView(): WebView = js.native
  def createWebView(parameters: js.Any): WebView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Window>.
  		 */
  def createWindow(): Window = js.native
  def createWindow(parameters: js.Any): Window = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  		 * Gets the value of the <Titanium.UI.apiName> property.
  		 */
  def getApiName(): String = js.native
  /**
  		 * Gets the value of the <Titanium.UI.backgroundColor> property.
  		 */
  def getBackgroundColor(): String = js.native
  /**
  		 * Gets the value of the <Titanium.UI.backgroundImage> property.
  		 */
  def getBackgroundImage(): String = js.native
  /**
  		 * Gets the value of the <Titanium.UI.bubbleParent> property.
  		 */
  def getBubbleParent(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.UI.currentTab> property.
  		 */
  def getCurrentTab(): Tab = js.native
  /**
  		 * Gets the value of the <Titanium.UI.currentWindow> property.
  		 */
  def getCurrentWindow(): Window = js.native
  /**
  		 * Gets the value of the <Titanium.UI.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  		 * Gets the value of the <Titanium.UI.orientation> property.
  		 */
  def getOrientation(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.UI.tintColor> property.
  		 */
  def getTintColor(): String = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.UI.backgroundColor> property.
  		 */
  def setBackgroundColor(backgroundColor: String): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.UI.backgroundImage> property.
  		 */
  def setBackgroundImage(backgroundImage: String): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.UI.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.UI.currentTab> property.
  		 */
  def setCurrentTab(currentTab: Tab): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.UI.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.UI.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.UI.orientation> property.
  		 */
  def setOrientation(orientation: Double): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.UI.tintColor> property.
  		 */
  def setTintColor(tintColor: String): Unit = js.native
}

