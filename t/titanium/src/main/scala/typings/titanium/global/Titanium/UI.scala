package typings.titanium.global.Titanium

import typings.titanium.ClipboardItemsType
import typings.titanium.Dictionary
import typings.titanium.Matrix2DCreationDict
import typings.titanium.Matrix3DCreationDict
import typings.titanium.Titanium.Event
import typings.titanium.Titanium.UIUserinterfacestyleEvent
import typings.titanium.titaniumStrings.userinterfacestyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The main <Titanium.UI> module.
  */
@JSGlobal("Titanium.UI")
@js.native
class UI ()
  extends typings.titanium.Titanium.Proxy
/**
  * The main <Titanium.UI> module.
  */
object UI {
  
  @JSGlobal("Titanium.UI")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Use with [Animation.curve](Titanium.UI.Animation.curve) to specify an animation that starts
    * slowly and speeds up.
    */
  @JSGlobal("Titanium.UI.ANIMATION_CURVE_EASE_IN")
  @js.native
  val ANIMATION_CURVE_EASE_IN: Double = js.native
  
  /**
    * Use with [Animation.curve](Titanium.UI.Animation.curve) to specify an animation that starts
    * slowly, and speeds up, then slows down at the end of the animation.
    */
  @JSGlobal("Titanium.UI.ANIMATION_CURVE_EASE_IN_OUT")
  @js.native
  val ANIMATION_CURVE_EASE_IN_OUT: Double = js.native
  
  /**
    * Use with [Animation.curve](Titanium.UI.Animation.curve) to specify an animation that starts
    * quickly, then slows down at the end of the animation.
    */
  @JSGlobal("Titanium.UI.ANIMATION_CURVE_EASE_OUT")
  @js.native
  val ANIMATION_CURVE_EASE_OUT: Double = js.native
  
  /**
    * Use with [Animation.curve](Titanium.UI.Animation.curve) to specify an animation that proceeds
    * at a constant rate.
    */
  @JSGlobal("Titanium.UI.ANIMATION_CURVE_LINEAR")
  @js.native
  val ANIMATION_CURVE_LINEAR: Double = js.native
  
  /**
    * Use with <Attribute.type> to specify a background color.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_BACKGROUND_COLOR")
  @js.native
  val ATTRIBUTE_BACKGROUND_COLOR: Double = js.native
  
  /**
    * Use with <Attribute.type> to apply a different baseline to the text.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_BASELINE_OFFSET")
  @js.native
  val ATTRIBUTE_BASELINE_OFFSET: Double = js.native
  
  /**
    * Use with <Attribute.type> to stretch the text horizontally.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_EXPANSION")
  @js.native
  val ATTRIBUTE_EXPANSION: Double = js.native
  
  /**
    * Use with <Attribute.type> to specify a font.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_FONT")
  @js.native
  val ATTRIBUTE_FONT: Double = js.native
  
  /**
    * Use with <Attribute.type> to specify a font color.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_FOREGROUND_COLOR")
  @js.native
  val ATTRIBUTE_FOREGROUND_COLOR: Double = js.native
  
  /**
    * Use with <Attribute.type> to specify kerning (space between characters).
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_KERN")
  @js.native
  val ATTRIBUTE_KERN: Double = js.native
  
  /**
    * Use with <Attribute.value> to use a letterpress text effect.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_LETTERPRESS_STYLE")
  @js.native
  val ATTRIBUTE_LETTERPRESS_STYLE: Double = js.native
  
  /**
    * Use with <Attribute.type> to enable or disable ligatures.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_LIGATURE")
  @js.native
  val ATTRIBUTE_LIGATURE: Double = js.native
  
  /**
    * Use with <Attribute.type> to wrap and truncate the text.
    * @deprecated Use [ParagraphAttribute.lineBreakMode](ParagraphAttribute.lineBreakMode) instead.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_LINE_BREAK")
  @js.native
  val ATTRIBUTE_LINE_BREAK: Double = js.native
  
  /**
    * Use with <Attribute.value> to wrap words at word boundaries.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_LINE_BREAK_BY_CHAR_WRAPPING")
  @js.native
  val ATTRIBUTE_LINE_BREAK_BY_CHAR_WRAPPING: Double = js.native
  
  /**
    * Use with <Attribute.value> to set lines to not draw past the edge of the text container.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_LINE_BREAK_BY_CLIPPING")
  @js.native
  val ATTRIBUTE_LINE_BREAK_BY_CLIPPING: Double = js.native
  
  /**
    * Use with <Attribute.value> to use ellipsis glyph at the beginning of the line for missing text.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_LINE_BREAK_BY_TRUNCATING_HEAD")
  @js.native
  val ATTRIBUTE_LINE_BREAK_BY_TRUNCATING_HEAD: Double = js.native
  
  /**
    * Use with <Attribute.value> to use ellipsis glyph at the middle of the line for missing text.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_LINE_BREAK_BY_TRUNCATING_MIDDLE")
  @js.native
  val ATTRIBUTE_LINE_BREAK_BY_TRUNCATING_MIDDLE: Double = js.native
  
  /**
    * Use with <Attribute.value> to use ellipsis glyph at the end of the line for missing text.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_LINE_BREAK_BY_TRUNCATING_TAIL")
  @js.native
  val ATTRIBUTE_LINE_BREAK_BY_TRUNCATING_TAIL: Double = js.native
  
  /**
    * Use with <Attribute.value> to wrap words at word boundaries.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_LINE_BREAK_BY_WORD_WRAPPING")
  @js.native
  val ATTRIBUTE_LINE_BREAK_BY_WORD_WRAPPING: Double = js.native
  
  /**
    * Use with <Attribute.type> to create a link.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_LINK")
  @js.native
  val ATTRIBUTE_LINK: Double = js.native
  
  /**
    * Use with <Attribute.type> to skew the text.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_OBLIQUENESS")
  @js.native
  val ATTRIBUTE_OBLIQUENESS: Double = js.native
  
  /**
    * Use with <Attribute.type> to manages the behaviour of string set.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_PARAGRAPH_STYLE")
  @js.native
  val ATTRIBUTE_PARAGRAPH_STYLE: Double = js.native
  
  /**
    * Use with <Attribute.type> to display a shadow behind the text.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_SHADOW")
  @js.native
  val ATTRIBUTE_SHADOW: Double = js.native
  
  /**
    * Use with <Attribute.type> to change the color of the horizontal line.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_STRIKETHROUGH_COLOR")
  @js.native
  val ATTRIBUTE_STRIKETHROUGH_COLOR: Double = js.native
  
  /**
    * Use with <Attribute.type> to place a horizontal line through the text.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_STRIKETHROUGH_STYLE")
  @js.native
  val ATTRIBUTE_STRIKETHROUGH_STYLE: Double = js.native
  
  /**
    * Use with <Attribute.type> to specify a color for the stroke text.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_STROKE_COLOR")
  @js.native
  val ATTRIBUTE_STROKE_COLOR: Double = js.native
  
  /**
    * Use with <Attribute.type> to specify the width of the stroke text.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_STROKE_WIDTH")
  @js.native
  val ATTRIBUTE_STROKE_WIDTH: Double = js.native
  
  /**
    * Use with <Attribute.type> to place the text in a lower position.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_SUBSCRIPT_STYLE")
  @js.native
  val ATTRIBUTE_SUBSCRIPT_STYLE: Double = js.native
  
  /**
    * Use with <Attribute.type> to place the text in an upper position.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_SUPERSCRIPT_STYLE")
  @js.native
  val ATTRIBUTE_SUPERSCRIPT_STYLE: Double = js.native
  
  /**
    * Use with <Attribute.type> to apply a text effect.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_TEXT_EFFECT")
  @js.native
  val ATTRIBUTE_TEXT_EFFECT: Double = js.native
  
  /**
    * Use with <Attribute.type> to place a horizontal line under the text.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_UNDERLINES_STYLE")
  @js.native
  val ATTRIBUTE_UNDERLINES_STYLE: Double = js.native
  
  /**
    * Use with <Attribute.value> to draw a line only underneath or through words.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_UNDERLINE_BY_WORD")
  @js.native
  val ATTRIBUTE_UNDERLINE_BY_WORD: Double = js.native
  
  /**
    * Use with <Attribute.type> to change the color of the horizontal line.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_UNDERLINE_COLOR")
  @js.native
  val ATTRIBUTE_UNDERLINE_COLOR: Double = js.native
  
  /**
    * Use with <Attribute.value> to draw a dashed line.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_UNDERLINE_PATTERN_DASH")
  @js.native
  val ATTRIBUTE_UNDERLINE_PATTERN_DASH: Double = js.native
  
  /**
    * Use with <Attribute.value> to draw an alternating line of dashes and dots.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_UNDERLINE_PATTERN_DASH_DOT")
  @js.native
  val ATTRIBUTE_UNDERLINE_PATTERN_DASH_DOT: Double = js.native
  
  /**
    * Use with <Attribute.value> to draw an alternating line of dashes and two dots.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_UNDERLINE_PATTERN_DASH_DOT_DOT")
  @js.native
  val ATTRIBUTE_UNDERLINE_PATTERN_DASH_DOT_DOT: Double = js.native
  
  /**
    * Use with <Attribute.value> to draw a dotted line.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_UNDERLINE_PATTERN_DOT")
  @js.native
  val ATTRIBUTE_UNDERLINE_PATTERN_DOT: Double = js.native
  
  /**
    * Use with <Attribute.value> to draw a solid line.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_UNDERLINE_PATTERN_SOLID")
  @js.native
  val ATTRIBUTE_UNDERLINE_PATTERN_SOLID: Double = js.native
  
  /**
    * Use with <Attribute.value> to draw a double line.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_UNDERLINE_STYLE_DOUBLE")
  @js.native
  val ATTRIBUTE_UNDERLINE_STYLE_DOUBLE: Double = js.native
  
  /**
    * Use with <Attribute.value> to not draw a line.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_UNDERLINE_STYLE_NONE")
  @js.native
  val ATTRIBUTE_UNDERLINE_STYLE_NONE: Double = js.native
  
  /**
    * Use with <Attribute.value> to draw a single line.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_UNDERLINE_STYLE_SINGLE")
  @js.native
  val ATTRIBUTE_UNDERLINE_STYLE_SINGLE: Double = js.native
  
  /**
    * Use with <Attribute.value> to draw a thick line.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_UNDERLINE_STYLE_THICK")
  @js.native
  val ATTRIBUTE_UNDERLINE_STYLE_THICK: Double = js.native
  
  /**
    * Use with <Attribute.type> to control the direction of the text.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_WRITING_DIRECTION")
  @js.native
  val ATTRIBUTE_WRITING_DIRECTION: Double = js.native
  
  /**
    * Use with <Attribute.value> to use the embedded text direction.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_WRITING_DIRECTION_EMBEDDING")
  @js.native
  val ATTRIBUTE_WRITING_DIRECTION_EMBEDDING: Double = js.native
  
  /**
    * Use with <Attribute.value> to write text left to right.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_WRITING_DIRECTION_LEFT_TO_RIGHT")
  @js.native
  val ATTRIBUTE_WRITING_DIRECTION_LEFT_TO_RIGHT: Double = js.native
  
  /**
    * Use with <Attribute.value> to use the
    * [Unicode Bidirection Algorithm rules P2 and P3](http://www.unicode.org/reports/tr9/#The_Paragraph_Level)
    * to determine which direction to use.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_WRITING_DIRECTION_NATURAL")
  @js.native
  val ATTRIBUTE_WRITING_DIRECTION_NATURAL: Double = js.native
  
  /**
    * Use with <Attribute.value> to override the text direction.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_WRITING_DIRECTION_OVERRIDE")
  @js.native
  val ATTRIBUTE_WRITING_DIRECTION_OVERRIDE: Double = js.native
  
  /**
    * Use with <Attribute.value> to write text right to left.
    */
  @JSGlobal("Titanium.UI.ATTRIBUTE_WRITING_DIRECTION_RIGHT_TO_LEFT")
  @js.native
  val ATTRIBUTE_WRITING_DIRECTION_RIGHT_TO_LEFT: Double = js.native
  
  /**
    * Converts strings formatted as addresses into clickable links.
    * @deprecated Use [Titanium.UI.AUTOLINK_MAP_ADDRESSES](Titanium.UI.AUTOLINK_MAP_ADDRESSES) instead.
    */
  @JSGlobal("Titanium.UI.AUTODETECT_ADDRESS")
  @js.native
  val AUTODETECT_ADDRESS: scala.Nothing = js.native
  
  /**
    * Converts all detectable types of data into clickable links.
    * @deprecated Use [Titanium.UI.AUTOLINK_ALL](Titanium.UI.AUTOLINK_ALL) instead.
    */
  @JSGlobal("Titanium.UI.AUTODETECT_ALL")
  @js.native
  val AUTODETECT_ALL: scala.Nothing = js.native
  
  /**
    * Converts strings formatted as calendar events into clickable links.
    * @deprecated Use [Titanium.UI.AUTOLINK_CALENDAR](Titanium.UI.AUTOLINK_CALENDAR) instead.
    */
  @JSGlobal("Titanium.UI.AUTODETECT_CALENDAR")
  @js.native
  val AUTODETECT_CALENDAR: scala.Nothing = js.native
  
  /**
    * Converts strings formatted as URLs into clickable links.
    * @deprecated Use [Titanium.UI.AUTOLINK_URLS](Titanium.UI.AUTOLINK_URLS) instead.
    */
  @JSGlobal("Titanium.UI.AUTODETECT_LINK")
  @js.native
  val AUTODETECT_LINK: scala.Nothing = js.native
  
  /**
    * Disables converting strings into clickable links.
    * @deprecated Use [Titanium.UI.AUTOLINK_NONE](Titanium.UI.AUTOLINK_NONE) instead.
    */
  @JSGlobal("Titanium.UI.AUTODETECT_NONE")
  @js.native
  val AUTODETECT_NONE: scala.Nothing = js.native
  
  /**
    * Converts strings formatted as phone numbers into clickable links.
    * @deprecated Use [Titanium.UI.AUTOLINK_PHONE_NUMBERS](Titanium.UI.AUTOLINK_PHONE_NUMBERS) instead.
    */
  @JSGlobal("Titanium.UI.AUTODETECT_PHONE")
  @js.native
  val AUTODETECT_PHONE: scala.Nothing = js.native
  
  /**
    * Specifies the expectation of an address.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_ADDRESS")
  @js.native
  val AUTOFILL_TYPE_ADDRESS: String = js.native
  
  /**
    * Specifies the expectation of a city name.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_ADDRESS_CITY")
  @js.native
  val AUTOFILL_TYPE_ADDRESS_CITY: String = js.native
  
  /**
    * Specifies the expectation of a city name combined with a state name.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_ADDRESS_CITY_STATE")
  @js.native
  val AUTOFILL_TYPE_ADDRESS_CITY_STATE: String = js.native
  
  /**
    * Specifies the expectation of the first line of a street address.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_ADDRESS_LINE1")
  @js.native
  val AUTOFILL_TYPE_ADDRESS_LINE1: String = js.native
  
  /**
    * Specifies the expectation of the second line of a street address.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_ADDRESS_LINE2")
  @js.native
  val AUTOFILL_TYPE_ADDRESS_LINE2: String = js.native
  
  /**
    * Specifies the expectation of a state name.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_ADDRESS_STATE")
  @js.native
  val AUTOFILL_TYPE_ADDRESS_STATE: String = js.native
  
  /**
    * Specifies the expectation of a card expiration date.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_CARD_EXPIRATION_DATE")
  @js.native
  val AUTOFILL_TYPE_CARD_EXPIRATION_DATE: String = js.native
  
  /**
    * Specifies the expectation of a card expiration day.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_CARD_EXPIRATION_DAY")
  @js.native
  val AUTOFILL_TYPE_CARD_EXPIRATION_DAY: String = js.native
  
  /**
    * Specifies the expectation of a card expiration month.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_CARD_EXPIRATION_MONTH")
  @js.native
  val AUTOFILL_TYPE_CARD_EXPIRATION_MONTH: String = js.native
  
  /**
    * Specifies the expectation of a card expiration year.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_CARD_EXPIRATION_YEAR")
  @js.native
  val AUTOFILL_TYPE_CARD_EXPIRATION_YEAR: String = js.native
  
  /**
    * Specifies the expectation of a card number.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_CARD_NUMBER")
  @js.native
  val AUTOFILL_TYPE_CARD_NUMBER: String = js.native
  
  /**
    * Specifies the expectation of a card security code.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_CARD_SECURITY_CODE")
  @js.native
  val AUTOFILL_TYPE_CARD_SECURITY_CODE: String = js.native
  
  /**
    * Specifies the expectation of a country name.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_COUNTRY_NAME")
  @js.native
  val AUTOFILL_TYPE_COUNTRY_NAME: String = js.native
  
  /**
    * Specifies the expectation of an email address.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_EMAIL")
  @js.native
  val AUTOFILL_TYPE_EMAIL: String = js.native
  
  /**
    * Specifies the expectation of a family name.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_FAMILY_NAME")
  @js.native
  val AUTOFILL_TYPE_FAMILY_NAME: String = js.native
  
  /**
    * Specifies the expectation of a given name.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_GIVEN_NAME")
  @js.native
  val AUTOFILL_TYPE_GIVEN_NAME: String = js.native
  
  /**
    * Specifies the expectation of a job title.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_JOB_TITLE")
  @js.native
  val AUTOFILL_TYPE_JOB_TITLE: String = js.native
  
  /**
    * Specifies the expectation of a location, such as a point of interest, an address, or another way to identify a location.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_LOCATION")
  @js.native
  val AUTOFILL_TYPE_LOCATION: String = js.native
  
  /**
    * Specifies the expectation of a middle name.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_MIDDLE_NAME")
  @js.native
  val AUTOFILL_TYPE_MIDDLE_NAME: String = js.native
  
  /**
    * Specifies the expectation of a name.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_NAME")
  @js.native
  val AUTOFILL_TYPE_NAME: String = js.native
  
  /**
    * Specifies the expectation of a prefix or title, such as 'Dr.'
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_NAME_PREFIX")
  @js.native
  val AUTOFILL_TYPE_NAME_PREFIX: String = js.native
  
  /**
    * Specifies the expectation of a suffix, such as 'Jr.'
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_NAME_SUFFIX")
  @js.native
  val AUTOFILL_TYPE_NAME_SUFFIX: String = js.native
  
  /**
    * Specifies the expectation of a new password.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_NEW_PASSWORD")
  @js.native
  val AUTOFILL_TYPE_NEW_PASSWORD: String = js.native
  
  /**
    * Specifies the expectation of a nickname.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_NICKNAME")
  @js.native
  val AUTOFILL_TYPE_NICKNAME: String = js.native
  
  /**
    * Specifies the expectation of a single-factor SMS login code.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_ONE_TIME_CODE")
  @js.native
  val AUTOFILL_TYPE_ONE_TIME_CODE: String = js.native
  
  /**
    * Specifies the expectation of an organization name.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_ORGANIZATION_NAME")
  @js.native
  val AUTOFILL_TYPE_ORGANIZATION_NAME: String = js.native
  
  /**
    * Specifies the expectation of a password.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_PASSWORD")
  @js.native
  val AUTOFILL_TYPE_PASSWORD: String = js.native
  
  /**
    * Specifies the expectation of a telephone number.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_PHONE")
  @js.native
  val AUTOFILL_TYPE_PHONE: String = js.native
  
  /**
    * Specifies the expectation of a postal code.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_POSTAL_CODE")
  @js.native
  val AUTOFILL_TYPE_POSTAL_CODE: String = js.native
  
  /**
    * Specifies the expectation of a sublocality.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_SUBLOCALITY")
  @js.native
  val AUTOFILL_TYPE_SUBLOCALITY: String = js.native
  
  /**
    * Specifies the expectation of a URL.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_URL")
  @js.native
  val AUTOFILL_TYPE_URL: String = js.native
  
  /**
    * Specifies the expectation of an account or login name.
    */
  @JSGlobal("Titanium.UI.AUTOFILL_TYPE_USERNAME")
  @js.native
  val AUTOFILL_TYPE_USERNAME: String = js.native
  
  /**
    * Converts all detectable types of data into clickable links.
    */
  @JSGlobal("Titanium.UI.AUTOLINK_ALL")
  @js.native
  val AUTOLINK_ALL: Double = js.native
  
  /**
    * Converts strings formatted as calendar events into clickable links.
    */
  @JSGlobal("Titanium.UI.AUTOLINK_CALENDAR")
  @js.native
  val AUTOLINK_CALENDAR: Double = js.native
  
  /**
    * Converts strings formatted as email addresses into clickable links.
    */
  @JSGlobal("Titanium.UI.AUTOLINK_EMAIL_ADDRESSES")
  @js.native
  val AUTOLINK_EMAIL_ADDRESSES: Double = js.native
  
  /**
    * Converts strings formatted as addresses into clickable links.
    */
  @JSGlobal("Titanium.UI.AUTOLINK_MAP_ADDRESSES")
  @js.native
  val AUTOLINK_MAP_ADDRESSES: Double = js.native
  
  /**
    * Disables converting strings into clickable links.
    */
  @JSGlobal("Titanium.UI.AUTOLINK_NONE")
  @js.native
  val AUTOLINK_NONE: Double = js.native
  
  /**
    * Converts strings formatted as phone numbers into clickable links.
    */
  @JSGlobal("Titanium.UI.AUTOLINK_PHONE_NUMBERS")
  @js.native
  val AUTOLINK_PHONE_NUMBERS: Double = js.native
  
  /**
    * Converts strings formatted as URLs into clickable links.
    */
  @JSGlobal("Titanium.UI.AUTOLINK_URLS")
  @js.native
  val AUTOLINK_URLS: Double = js.native
  
  /**
    * An activity indicator that lets the user know an action is taking place.
    */
  @JSGlobal("Titanium.UI.ActivityIndicator")
  @js.native
  class ActivityIndicator ()
    extends typings.titanium.Titanium.UI.ActivityIndicator
  
  /**
    * A set of constants for the styles available for <Titanium.UI.ActivityIndicator> objects.
    */
  @JSGlobal("Titanium.UI.ActivityIndicatorStyle")
  @js.native
  class ActivityIndicatorStyle ()
    extends typings.titanium.Titanium.Proxy
  object ActivityIndicatorStyle {
    
    @JSGlobal("Titanium.UI.ActivityIndicatorStyle")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Large white spinning indicator.
      */
    /* static member */
    @JSGlobal("Titanium.UI.ActivityIndicatorStyle.BIG")
    @js.native
    val BIG: Double = js.native
    
    /**
      * Large gray spinning indicator.
      */
    /* static member */
    @JSGlobal("Titanium.UI.ActivityIndicatorStyle.BIG_DARK")
    @js.native
    val BIG_DARK: Double = js.native
    
    /**
      * Small gray spinning indicator.
      */
    /* static member */
    @JSGlobal("Titanium.UI.ActivityIndicatorStyle.DARK")
    @js.native
    val DARK: Double = js.native
    
    /**
      * Small white spinning indicator (default).
      */
    /* static member */
    @JSGlobal("Titanium.UI.ActivityIndicatorStyle.PLAIN")
    @js.native
    val PLAIN: Double = js.native
    
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.UI.ActivityIndicatorStyle.addEventListener")
    @js.native
    def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    
    /**
      * The name of the API that this proxy corresponds to.
      */
    /* static member */
    @JSGlobal("Titanium.UI.ActivityIndicatorStyle.apiName")
    @js.native
    val apiName: String = js.native
    
    /**
      * Applies the properties to the proxy.
      */
    /* static member */
    @JSGlobal("Titanium.UI.ActivityIndicatorStyle.applyProperties")
    @js.native
    def applyProperties(props: js.Any): Unit = js.native
    
    /**
      * Indicates if the proxy will bubble an event to its parent.
      */
    /* static member */
    @JSGlobal("Titanium.UI.ActivityIndicatorStyle.bubbleParent")
    @js.native
    def bubbleParent: Boolean = js.native
    @scala.inline
    def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
    
    /**
      * Fires a synthesized event to any registered listeners.
      */
    /* static member */
    @JSGlobal("Titanium.UI.ActivityIndicatorStyle.fireEvent")
    @js.native
    def fireEvent(name: String): Unit = js.native
    @JSGlobal("Titanium.UI.ActivityIndicatorStyle.fireEvent")
    @js.native
    def fireEvent(name: String, event: js.Any): Unit = js.native
    
    /**
      * Gets the value of the <Titanium.UI.ActivityIndicatorStyle.apiName> property.
      * @deprecated Access <Titanium.UI.ActivityIndicatorStyle.apiName> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.ActivityIndicatorStyle.getApiName")
    @js.native
    def getApiName(): String = js.native
    
    /**
      * Gets the value of the <Titanium.UI.ActivityIndicatorStyle.bubbleParent> property.
      * @deprecated Access <Titanium.UI.ActivityIndicatorStyle.bubbleParent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.ActivityIndicatorStyle.getBubbleParent")
    @js.native
    def getBubbleParent(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.UI.ActivityIndicatorStyle.lifecycleContainer> property.
      * @deprecated Access <Titanium.UI.ActivityIndicatorStyle.lifecycleContainer> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.ActivityIndicatorStyle.getLifecycleContainer")
    @js.native
    def getLifecycleContainer(): typings.titanium.Titanium.UI.Window | typings.titanium.Titanium.UI.TabGroup = js.native
    
    /**
      * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
      */
    /* static member */
    @JSGlobal("Titanium.UI.ActivityIndicatorStyle.lifecycleContainer")
    @js.native
    def lifecycleContainer: typings.titanium.Titanium.UI.Window | typings.titanium.Titanium.UI.TabGroup = js.native
    @scala.inline
    def lifecycleContainer_=(x: typings.titanium.Titanium.UI.Window | typings.titanium.Titanium.UI.TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
    
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.UI.ActivityIndicatorStyle.removeEventListener")
    @js.native
    def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.UI.ActivityIndicatorStyle.bubbleParent> property.
      * @deprecated Set the value using <Titanium.UI.ActivityIndicatorStyle.bubbleParent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.ActivityIndicatorStyle.setBubbleParent")
    @js.native
    def setBubbleParent(bubbleParent: Boolean): Unit = js.native
    
    @JSGlobal("Titanium.UI.ActivityIndicatorStyle.setLifecycleContainer")
    @js.native
    def setLifecycleContainer(lifecycleContainer: typings.titanium.Titanium.UI.TabGroup): Unit = js.native
    /**
      * Sets the value of the <Titanium.UI.ActivityIndicatorStyle.lifecycleContainer> property.
      * @deprecated Set the value using <Titanium.UI.ActivityIndicatorStyle.lifecycleContainer> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.ActivityIndicatorStyle.setLifecycleContainer")
    @js.native
    def setLifecycleContainer(lifecycleContainer: typings.titanium.Titanium.UI.Window): Unit = js.native
  }
  
  /**
    * An alert dialog is a modal view that includes an optional title, a message and buttons,
    * positioned in the middle of the display.
    */
  @JSGlobal("Titanium.UI.AlertDialog")
  @js.native
  class AlertDialog ()
    extends typings.titanium.Titanium.UI.AlertDialog
  
  /**
    * The Android-specific UI capabilities. All properties, methods and events in this namespace will
    * only work on Android systems.
    */
  @JSGlobal("Titanium.UI.Android")
  @js.native
  class Android ()
    extends typings.titanium.Titanium.Proxy
  /**
    * The Android-specific UI capabilities. All properties, methods and events in this namespace will
    * only work on Android systems.
    */
  object Android {
    
    @JSGlobal("Titanium.UI.Android")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * CardView provides a layout container with rounded corners and a shadow indicating the view is elevated.
      */
    @JSGlobal("Titanium.UI.Android.CardView")
    @js.native
    class CardView ()
      extends typings.titanium.Titanium.UI.Android.CardView
    
    /**
      * A panel that displays the app's main navigation options on the left edge of the screen.
      */
    @JSGlobal("Titanium.UI.Android.DrawerLayout")
    @js.native
    class DrawerLayout ()
      extends typings.titanium.Titanium.UI.Android.DrawerLayout
    
    /**
      * Window flag which makes the Android system's navigation bar semi-transparent.
      */
    @JSGlobal("Titanium.UI.Android.FLAG_TRANSLUCENT_NAVIGATION")
    @js.native
    val FLAG_TRANSLUCENT_NAVIGATION: Double = js.native
    
    /**
      * Window flag which makes the Android system's top status bar semi-transparent.
      */
    @JSGlobal("Titanium.UI.Android.FLAG_TRANSLUCENT_STATUS")
    @js.native
    val FLAG_TRANSLUCENT_STATUS: Double = js.native
    
    /**
      * Raw bit controlling whether the right/bottom edge is clipped to its container, based on the gravity direction being applied.
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_AXIS_CLIP")
    @js.native
    val GRAVITY_AXIS_CLIP: Double = js.native
    
    /**
      * Raw bit controlling how the right/bottom edge is placed.
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_AXIS_PULL_AFTER")
    @js.native
    val GRAVITY_AXIS_PULL_AFTER: Double = js.native
    
    /**
      * Raw bit controlling how the left/top edge is placed.
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_AXIS_PULL_BEFORE")
    @js.native
    val GRAVITY_AXIS_PULL_BEFORE: Double = js.native
    
    /**
      * Raw bit indicating the gravity for an axis has been specified.
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_AXIS_SPECIFIED")
    @js.native
    val GRAVITY_AXIS_SPECIFIED: Double = js.native
    
    /**
      * Bits defining the horizontal axis.
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_AXIS_X_SHIFT")
    @js.native
    val GRAVITY_AXIS_X_SHIFT: Double = js.native
    
    /**
      * Bits defining the vertical axis.
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_AXIS_Y_SHIFT")
    @js.native
    val GRAVITY_AXIS_Y_SHIFT: Double = js.native
    
    /**
      * Push object to the bottom of its container, not changing its size.
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_BOTTOM")
    @js.native
    val GRAVITY_BOTTOM: Double = js.native
    
    /**
      * Place the object in the center of its container in both the vertical and horizontal axis, not changing its size.
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_CENTER")
    @js.native
    val GRAVITY_CENTER: Double = js.native
    
    /**
      * Place object in the horizontal center of its container, not changing its size.
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_CENTER_HORIZONTAL")
    @js.native
    val GRAVITY_CENTER_HORIZONTAL: Double = js.native
    
    /**
      * Place object in the vertical center of its container, not changing its size.
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_CENTER_VERTICAL")
    @js.native
    val GRAVITY_CENTER_VERTICAL: Double = js.native
    
    /**
      * Flag to clip the edges of the object to its container along the horizontal axis.
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_CLIP_HORIZONTAL")
    @js.native
    val GRAVITY_CLIP_HORIZONTAL: Double = js.native
    
    /**
      * Flag to clip the edges of the object to its container along the vertical axis.
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_CLIP_VERTICAL")
    @js.native
    val GRAVITY_CLIP_VERTICAL: Double = js.native
    
    /**
      * Special constant to enable clipping to an overall display along the horizontal dimension.
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_DISPLAY_CLIP_HORIZONTAL")
    @js.native
    val GRAVITY_DISPLAY_CLIP_HORIZONTAL: Double = js.native
    
    /**
      * Special constant to enable clipping to an overall display along the vertical dimension.
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_DISPLAY_CLIP_VERTICAL")
    @js.native
    val GRAVITY_DISPLAY_CLIP_VERTICAL: Double = js.native
    
    /**
      * Push object to x-axis position at the end of its container, not changing its size.
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_END")
    @js.native
    val GRAVITY_END: Double = js.native
    
    /**
      * Grow the horizontal and vertical size of the object if needed so it completely fills its container.
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_FILL")
    @js.native
    val GRAVITY_FILL: Double = js.native
    
    /**
      * Grow the horizontal size of the object if needed so it completely fills its container.
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_FILL_HORIZONTAL")
    @js.native
    val GRAVITY_FILL_HORIZONTAL: Double = js.native
    
    /**
      * Grow the vertical size of the object if needed so it completely fills its container.
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_FILL_VERTICAL")
    @js.native
    val GRAVITY_FILL_VERTICAL: Double = js.native
    
    /**
      * Binary mask to get the absolute horizontal gravity of a gravity.
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_HORIZONTAL_GRAVITY_MASK")
    @js.native
    val GRAVITY_HORIZONTAL_GRAVITY_MASK: Double = js.native
    
    /**
      * Push object to the left of its container, not changing its size.
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_LEFT")
    @js.native
    val GRAVITY_LEFT: Double = js.native
    
    /**
      * Constant indicating that no gravity has been set
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_NO_GRAVITY")
    @js.native
    val GRAVITY_NO_GRAVITY: Double = js.native
    
    /**
      * Binary mask for the horizontal gravity and script specific direction bit.
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_RELATIVE_HORIZONTAL_GRAVITY_MASK")
    @js.native
    val GRAVITY_RELATIVE_HORIZONTAL_GRAVITY_MASK: Double = js.native
    
    /**
      * Raw bit controlling whether the layout direction is relative or not (GRAVITY_START/GRAVITY_END instead of absolute GRAVITY_LEFT/GRAVITY_RIGHT).
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_RELATIVE_LAYOUT_DIRECTION")
    @js.native
    val GRAVITY_RELATIVE_LAYOUT_DIRECTION: Double = js.native
    
    /**
      * Push object to the right of its container, not changing its size.
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_RIGHT")
    @js.native
    val GRAVITY_RIGHT: Double = js.native
    
    /**
      * Push object to x-axis position at the start of its container, not changing its size.
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_START")
    @js.native
    val GRAVITY_START: Double = js.native
    
    /**
      * Push object to the top of its container, not changing its size.
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_TOP")
    @js.native
    val GRAVITY_TOP: Double = js.native
    
    /**
      * Binary mask to get the vertical gravity of a gravity.
      */
    @JSGlobal("Titanium.UI.Android.GRAVITY_VERTICAL_GRAVITY_MASK")
    @js.native
    val GRAVITY_VERTICAL_GRAVITY_MASK: Double = js.native
    
    /**
      * Converts all detectable types of data into clickable links.
      * @deprecated Use [Titanium.UI.AUTOLINK_ALL](Titanium.UI.AUTOLINK_ALL) instead.
      */
    @JSGlobal("Titanium.UI.Android.LINKIFY_ALL")
    @js.native
    val LINKIFY_ALL: scala.Nothing = js.native
    
    /**
      * Converts strings formatted as email addresses into clickable links.
      * @deprecated Use [Titanium.UI.AUTOLINK_EMAIL_ADDRESSES](Titanium.UI.AUTOLINK_EMAIL_ADDRESSES) instead.
      */
    @JSGlobal("Titanium.UI.Android.LINKIFY_EMAIL_ADDRESSES")
    @js.native
    val LINKIFY_EMAIL_ADDRESSES: scala.Nothing = js.native
    
    /**
      * Converts strings formatted as addresses into clickable links.
      * @deprecated Use [Titanium.UI.AUTOLINK_MAP_ADDRESSES](Titanium.UI.AUTOLINK_MAP_ADDRESSES) instead.
      */
    @JSGlobal("Titanium.UI.Android.LINKIFY_MAP_ADDRESSES")
    @js.native
    val LINKIFY_MAP_ADDRESSES: scala.Nothing = js.native
    
    /**
      * Converts strings formatted as phone numbers into clickable links.
      * @deprecated Use [Titanium.UI.AUTOLINK_PHONE_NUMBERS](Titanium.UI.AUTOLINK_PHONE_NUMBERS) instead.
      */
    @JSGlobal("Titanium.UI.Android.LINKIFY_PHONE_NUMBERS")
    @js.native
    val LINKIFY_PHONE_NUMBERS: scala.Nothing = js.native
    
    /**
      * Converts strings formatted as URLs into clickable links.
      * @deprecated Use [Titanium.UI.AUTOLINK_URLS](Titanium.UI.AUTOLINK_URLS) instead.
      */
    @JSGlobal("Titanium.UI.Android.LINKIFY_WEB_URLS")
    @js.native
    val LINKIFY_WEB_URLS: scala.Nothing = js.native
    
    /**
      * Always allow a user to over-scroll this view, provided it is a view that can scroll.
      */
    @JSGlobal("Titanium.UI.Android.OVER_SCROLL_ALWAYS")
    @js.native
    val OVER_SCROLL_ALWAYS: Double = js.native
    
    /**
      * Allow a user to over-scroll this view only if the content is large enough to meaningfully scroll, provided it is a view that can scroll.
      */
    @JSGlobal("Titanium.UI.Android.OVER_SCROLL_IF_CONTENT_SCROLLS")
    @js.native
    val OVER_SCROLL_IF_CONTENT_SCROLLS: Double = js.native
    
    /**
      * Never allow a user to over-scroll this view.
      */
    @JSGlobal("Titanium.UI.Android.OVER_SCROLL_NEVER")
    @js.native
    val OVER_SCROLL_NEVER: Double = js.native
    
    /**
      * Android A_8 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
      * can improve image clarity and performance.
      */
    @JSGlobal("Titanium.UI.Android.PIXEL_FORMAT_A_8")
    @js.native
    val PIXEL_FORMAT_A_8: Double = js.native
    
    /**
      * Android LA_88 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
      * can improve image clarity and performance.
      */
    @JSGlobal("Titanium.UI.Android.PIXEL_FORMAT_LA_88")
    @js.native
    val PIXEL_FORMAT_LA_88: Double = js.native
    
    /**
      * Android L_8 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
      * can improve image clarity and performance.
      */
    @JSGlobal("Titanium.UI.Android.PIXEL_FORMAT_L_8")
    @js.native
    val PIXEL_FORMAT_L_8: Double = js.native
    
    /**
      * Android OPAQUE pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
      * can improve image clarity and performance.
      */
    @JSGlobal("Titanium.UI.Android.PIXEL_FORMAT_OPAQUE")
    @js.native
    val PIXEL_FORMAT_OPAQUE: Double = js.native
    
    /**
      * Android RGBA_4444 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
      * can improve image clarity and performance.
      */
    @JSGlobal("Titanium.UI.Android.PIXEL_FORMAT_RGBA_4444")
    @js.native
    val PIXEL_FORMAT_RGBA_4444: Double = js.native
    
    /**
      * Android RGBA_5551 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
      * can improve image clarity and performance.
      */
    @JSGlobal("Titanium.UI.Android.PIXEL_FORMAT_RGBA_5551")
    @js.native
    val PIXEL_FORMAT_RGBA_5551: Double = js.native
    
    /**
      * Android RGBA_8888 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
      * can improve image clarity and performance.
      */
    @JSGlobal("Titanium.UI.Android.PIXEL_FORMAT_RGBA_8888")
    @js.native
    val PIXEL_FORMAT_RGBA_8888: Double = js.native
    
    /**
      * Android RGBX_8888 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
      * can improve image clarity and performance.
      */
    @JSGlobal("Titanium.UI.Android.PIXEL_FORMAT_RGBX_8888")
    @js.native
    val PIXEL_FORMAT_RGBX_8888: Double = js.native
    
    /**
      * Android RGB_332 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
      * can improve image clarity and performance.
      */
    @JSGlobal("Titanium.UI.Android.PIXEL_FORMAT_RGB_332")
    @js.native
    val PIXEL_FORMAT_RGB_332: Double = js.native
    
    /**
      * Android RGB_565 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
      * can improve image clarity and performance.
      */
    @JSGlobal("Titanium.UI.Android.PIXEL_FORMAT_RGB_565")
    @js.native
    val PIXEL_FORMAT_RGB_565: Double = js.native
    
    /**
      * Android RGB_888 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
      * can improve image clarity and performance.
      */
    @JSGlobal("Titanium.UI.Android.PIXEL_FORMAT_RGB_888")
    @js.native
    val PIXEL_FORMAT_RGB_888: Double = js.native
    
    /**
      * Android TRANSLUCENT pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
      * can improve image clarity and performance.
      */
    @JSGlobal("Titanium.UI.Android.PIXEL_FORMAT_TRANSLUCENT")
    @js.native
    val PIXEL_FORMAT_TRANSLUCENT: Double = js.native
    
    /**
      * Android A_8 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format can
      * improve image clarity and performance.
      */
    @JSGlobal("Titanium.UI.Android.PIXEL_FORMAT_TRANSPARENT")
    @js.native
    val PIXEL_FORMAT_TRANSPARENT: Double = js.native
    
    /**
      * Android UNKNOWN pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
      * can improve image clarity and performance.
      */
    @JSGlobal("Titanium.UI.Android.PIXEL_FORMAT_UNKNOWN")
    @js.native
    val PIXEL_FORMAT_UNKNOWN: Double = js.native
    
    /**
      * Used with the <Titanium.UI.Android.ProgressIndicator.type> property to indicate an ongoing
      * activity of determinate length.
      */
    @JSGlobal("Titanium.UI.Android.PROGRESS_INDICATOR_DETERMINANT")
    @js.native
    val PROGRESS_INDICATOR_DETERMINANT: Double = js.native
    
    /**
      * Display <Titanium.UI.Android.ProgressIndicator> as a modal dialog. (default)
      */
    @JSGlobal("Titanium.UI.Android.PROGRESS_INDICATOR_DIALOG")
    @js.native
    val PROGRESS_INDICATOR_DIALOG: Double = js.native
    
    /**
      * Used with the <Titanium.UI.Android.ProgressIndicator.type> property to indicate an ongoing
      * activity of indeterminate length. (default)
      */
    @JSGlobal("Titanium.UI.Android.PROGRESS_INDICATOR_INDETERMINANT")
    @js.native
    val PROGRESS_INDICATOR_INDETERMINANT: Double = js.native
    
    /**
      * Display <Titanium.UI.Android.ProgressIndicator> as a horizontal progress bar in the title of
      * the window.
      */
    @JSGlobal("Titanium.UI.Android.PROGRESS_INDICATOR_STATUS_BAR")
    @js.native
    val PROGRESS_INDICATOR_STATUS_BAR: Double = js.native
    
    /**
      * A progress dialog or a horizontal progress bar in the title of the window.
      */
    @JSGlobal("Titanium.UI.Android.ProgressIndicator")
    @js.native
    class ProgressIndicator ()
      extends typings.titanium.Titanium.UI.Android.ProgressIndicator
    
    /**
      * Pan the current heavyweight window when the input method (ie software keyboard) is shown, to
      * ensure that its contents are not obscured.
      */
    @JSGlobal("Titanium.UI.Android.SOFT_INPUT_ADJUST_PAN")
    @js.native
    val SOFT_INPUT_ADJUST_PAN: Double = js.native
    
    /**
      * Resize the current heavyweight window when the input method (ie software keyboard) is shown,
      * to ensure that its contents are not obscured.
      */
    @JSGlobal("Titanium.UI.Android.SOFT_INPUT_ADJUST_RESIZE")
    @js.native
    val SOFT_INPUT_ADJUST_RESIZE: Double = js.native
    
    /**
      * Use the system-default behavior to determine how the soft input area (ie software keyboard)
      * is accomodated by the current heavyweight window when it receives focus (default.)
      */
    @JSGlobal("Titanium.UI.Android.SOFT_INPUT_ADJUST_UNSPECIFIED")
    @js.native
    val SOFT_INPUT_ADJUST_UNSPECIFIED: Double = js.native
    
    /**
      * Always hide the soft input area (ie software keyboard) when the current heavyweight window
      * receives focus.
      */
    @JSGlobal("Titanium.UI.Android.SOFT_INPUT_STATE_ALWAYS_HIDDEN")
    @js.native
    val SOFT_INPUT_STATE_ALWAYS_HIDDEN: Double = js.native
    
    /**
      * Always show the soft input area (ie software keyboard) when the current heavyweight window
      * receives focus.
      */
    @JSGlobal("Titanium.UI.Android.SOFT_INPUT_STATE_ALWAYS_VISIBLE")
    @js.native
    val SOFT_INPUT_STATE_ALWAYS_VISIBLE: Double = js.native
    
    /**
      * Attempt to hide the soft input area (ie software keyboard) when the current heavyweight
      * window receives focus.
      */
    @JSGlobal("Titanium.UI.Android.SOFT_INPUT_STATE_HIDDEN")
    @js.native
    val SOFT_INPUT_STATE_HIDDEN: Double = js.native
    
    /**
      * Use the system-default behavior to determine whether to show the soft input area
      * (ie software keyboard) when the current heavyweight window receives focus.
      */
    @JSGlobal("Titanium.UI.Android.SOFT_INPUT_STATE_UNSPECIFIED")
    @js.native
    val SOFT_INPUT_STATE_UNSPECIFIED: Double = js.native
    
    /**
      * Attempt to show the soft input area (ie software keyboard) when the current heavyweight
      * window receives focus.
      */
    @JSGlobal("Titanium.UI.Android.SOFT_INPUT_STATE_VISIBLE")
    @js.native
    val SOFT_INPUT_STATE_VISIBLE: Double = js.native
    
    /**
      * Use Android default behavior to handle keyboard visibility when a view receives focus.
      * (default)
      */
    @JSGlobal("Titanium.UI.Android.SOFT_KEYBOARD_DEFAULT_ON_FOCUS")
    @js.native
    val SOFT_KEYBOARD_DEFAULT_ON_FOCUS: Double = js.native
    
    /**
      * Attempt to hide the soft keyboard when a view receives focus. Note: system can override
      * request.
      */
    @JSGlobal("Titanium.UI.Android.SOFT_KEYBOARD_HIDE_ON_FOCUS")
    @js.native
    val SOFT_KEYBOARD_HIDE_ON_FOCUS: Double = js.native
    
    /**
      * Attempt to show the soft keyboard when a view receives focus. Note: system can override
      * request.
      */
    @JSGlobal("Titanium.UI.Android.SOFT_KEYBOARD_SHOW_ON_FOCUS")
    @js.native
    val SOFT_KEYBOARD_SHOW_ON_FOCUS: Double = js.native
    
    /**
      * Display a checkbox.
      */
    @JSGlobal("Titanium.UI.Android.SWITCH_STYLE_CHECKBOX")
    @js.native
    val SWITCH_STYLE_CHECKBOX: Double = js.native
    
    /**
      * Display a switch.
      */
    @JSGlobal("Titanium.UI.Android.SWITCH_STYLE_SWITCH")
    @js.native
    val SWITCH_STYLE_SWITCH: Double = js.native
    
    /**
      * Display a toggle button.
      */
    @JSGlobal("Titanium.UI.Android.SWITCH_STYLE_TOGGLEBUTTON")
    @js.native
    val SWITCH_STYLE_TOGGLEBUTTON: Double = js.native
    
    /**
      * A specialized text field for entering search text.
      */
    @JSGlobal("Titanium.UI.Android.SearchView")
    @js.native
    class SearchView ()
      extends typings.titanium.Titanium.UI.Android.SearchView
    
    /**
      * TabGroup style taking advantage of a bottom navigation controller for switching between tabs.
      */
    @JSGlobal("Titanium.UI.Android.TABS_STYLE_BOTTOM_NAVIGATION")
    @js.native
    val TABS_STYLE_BOTTOM_NAVIGATION: Double = js.native
    
    /**
      * The default TabGroup style that places the Tabs bellow the ActionBar and above the Window content.
      */
    @JSGlobal("Titanium.UI.Android.TABS_STYLE_DEFAULT")
    @js.native
    val TABS_STYLE_DEFAULT: Double = js.native
    
    /**
      * Captures layout bounds of target views before and after the scene change and animates those changes during the transition.
      */
    @JSGlobal("Titanium.UI.Android.TRANSITION_CHANGE_BOUNDS")
    @js.native
    val TRANSITION_CHANGE_BOUNDS: Double = js.native
    
    /**
      * Captures the clip bounds before and after the scene change and animates those changes during the transition.
      */
    @JSGlobal("Titanium.UI.Android.TRANSITION_CHANGE_CLIP_BOUNDS")
    @js.native
    val TRANSITION_CHANGE_CLIP_BOUNDS: Double = js.native
    
    /**
      * Captures an ImageView's matrix before and after the scene change and animates it during the transition.
      */
    @JSGlobal("Titanium.UI.Android.TRANSITION_CHANGE_IMAGE_TRANSFORM")
    @js.native
    val TRANSITION_CHANGE_IMAGE_TRANSFORM: Double = js.native
    
    /**
      * Captures scale and rotation for Views before and after the scene change and animates those changes during the transition.
      */
    @JSGlobal("Titanium.UI.Android.TRANSITION_CHANGE_TRANSFORM")
    @js.native
    val TRANSITION_CHANGE_TRANSFORM: Double = js.native
    
    /**
      * Moves views in or out from the edges of the scene.
      */
    @JSGlobal("Titanium.UI.Android.TRANSITION_EXPLODE")
    @js.native
    val TRANSITION_EXPLODE: Double = js.native
    
    /**
      * Fades in the views.
      */
    @JSGlobal("Titanium.UI.Android.TRANSITION_FADE_IN")
    @js.native
    val TRANSITION_FADE_IN: Double = js.native
    
    /**
      * Fades out the views.
      */
    @JSGlobal("Titanium.UI.Android.TRANSITION_FADE_OUT")
    @js.native
    val TRANSITION_FADE_OUT: Double = js.native
    
    /**
      * Resets transition to platform default.
      */
    @JSGlobal("Titanium.UI.Android.TRANSITION_NONE")
    @js.native
    val TRANSITION_NONE: Double = js.native
    
    /**
      * Moves views to bottom.
      */
    @JSGlobal("Titanium.UI.Android.TRANSITION_SLIDE_BOTTOM")
    @js.native
    val TRANSITION_SLIDE_BOTTOM: Double = js.native
    
    /**
      * Moves views to left.
      */
    @JSGlobal("Titanium.UI.Android.TRANSITION_SLIDE_LEFT")
    @js.native
    val TRANSITION_SLIDE_LEFT: Double = js.native
    
    /**
      * Moves views to right.
      */
    @JSGlobal("Titanium.UI.Android.TRANSITION_SLIDE_RIGHT")
    @js.native
    val TRANSITION_SLIDE_RIGHT: Double = js.native
    
    /**
      * Moves views to top.
      */
    @JSGlobal("Titanium.UI.Android.TRANSITION_SLIDE_TOP")
    @js.native
    val TRANSITION_SLIDE_TOP: Double = js.native
    
    /**
      * Use with [WebView.cacheMode](Titanium.UI.WebView.cacheMode) to override how the cache is used in a web view.
      */
    @JSGlobal("Titanium.UI.Android.WEBVIEW_LOAD_CACHE_ELSE_NETWORK")
    @js.native
    val WEBVIEW_LOAD_CACHE_ELSE_NETWORK: Double = js.native
    
    /**
      * Use with [WebView.cacheMode](Titanium.UI.WebView.cacheMode) to override how the cache is used in a web view.
      */
    @JSGlobal("Titanium.UI.Android.WEBVIEW_LOAD_CACHE_ONLY")
    @js.native
    val WEBVIEW_LOAD_CACHE_ONLY: Double = js.native
    
    /**
      * Use with [WebView.cacheMode](Titanium.UI.WebView.cacheMode) to override how the cache is used in a web view.
      */
    @JSGlobal("Titanium.UI.Android.WEBVIEW_LOAD_DEFAULT")
    @js.native
    val WEBVIEW_LOAD_DEFAULT: Double = js.native
    
    /**
      * Use with [WebView.cacheMode](Titanium.UI.WebView.cacheMode) to override how the cache is used in a web view.
      */
    @JSGlobal("Titanium.UI.Android.WEBVIEW_LOAD_NO_CACHE")
    @js.native
    val WEBVIEW_LOAD_NO_CACHE: Double = js.native
    
    /**
      * Use with [WebView.pluginState](Titanium.UI.WebView.pluginState) to disable plugins in a web view.
      */
    @JSGlobal("Titanium.UI.Android.WEBVIEW_PLUGINS_OFF")
    @js.native
    val WEBVIEW_PLUGINS_OFF: Double = js.native
    
    /**
      * Use with [WebView.pluginState](Titanium.UI.WebView.pluginState) to enable plugins in a web view.
      */
    @JSGlobal("Titanium.UI.Android.WEBVIEW_PLUGINS_ON")
    @js.native
    val WEBVIEW_PLUGINS_ON: Double = js.native
    
    /**
      * Display a placeholder and only load plugins when user selects it.
      */
    @JSGlobal("Titanium.UI.Android.WEBVIEW_PLUGINS_ON_DEMAND")
    @js.native
    val WEBVIEW_PLUGINS_ON_DEMAND: Double = js.native
    
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Android.addEventListener")
    @js.native
    def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    
    /**
      * The name of the API that this proxy corresponds to.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Android.apiName")
    @js.native
    val apiName: String = js.native
    
    /**
      * Applies the properties to the proxy.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Android.applyProperties")
    @js.native
    def applyProperties(props: js.Any): Unit = js.native
    
    /**
      * Indicates if the proxy will bubble an event to its parent.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Android.bubbleParent")
    @js.native
    def bubbleParent: Boolean = js.native
    @scala.inline
    def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
    
    /**
      * Creates and returns an instance of <Titanium.UI.Android.CardView>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Android.createCardView")
    @js.native
    def createCardView(): typings.titanium.Titanium.UI.Android.CardView = js.native
    @JSGlobal("Titanium.UI.Android.createCardView")
    @js.native
    def createCardView(parameters: Dictionary[typings.titanium.Titanium.UI.Android.CardView]): typings.titanium.Titanium.UI.Android.CardView = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.Android.DrawerLayout>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Android.createDrawerLayout")
    @js.native
    def createDrawerLayout(): typings.titanium.Titanium.UI.Android.DrawerLayout = js.native
    @JSGlobal("Titanium.UI.Android.createDrawerLayout")
    @js.native
    def createDrawerLayout(parameters: Dictionary[typings.titanium.Titanium.UI.Android.DrawerLayout]): typings.titanium.Titanium.UI.Android.DrawerLayout = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.Android.ProgressIndicator>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Android.createProgressIndicator")
    @js.native
    def createProgressIndicator(): typings.titanium.Titanium.UI.Android.ProgressIndicator = js.native
    @JSGlobal("Titanium.UI.Android.createProgressIndicator")
    @js.native
    def createProgressIndicator(parameters: Dictionary[typings.titanium.Titanium.UI.Android.ProgressIndicator]): typings.titanium.Titanium.UI.Android.ProgressIndicator = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.Android.SearchView>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Android.createSearchView")
    @js.native
    def createSearchView(): typings.titanium.Titanium.UI.Android.SearchView = js.native
    @JSGlobal("Titanium.UI.Android.createSearchView")
    @js.native
    def createSearchView(parameters: Dictionary[typings.titanium.Titanium.UI.Android.SearchView]): typings.titanium.Titanium.UI.Android.SearchView = js.native
    
    /**
      * Fires a synthesized event to any registered listeners.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Android.fireEvent")
    @js.native
    def fireEvent(name: String): Unit = js.native
    @JSGlobal("Titanium.UI.Android.fireEvent")
    @js.native
    def fireEvent(name: String, event: js.Any): Unit = js.native
    
    /**
      * Gets the value of the <Titanium.UI.Android.apiName> property.
      * @deprecated Access <Titanium.UI.Android.apiName> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Android.getApiName")
    @js.native
    def getApiName(): String = js.native
    
    /**
      * Gets the value of the <Titanium.UI.Android.bubbleParent> property.
      * @deprecated Access <Titanium.UI.Android.bubbleParent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Android.getBubbleParent")
    @js.native
    def getBubbleParent(): Boolean = js.native
    
    @JSGlobal("Titanium.UI.Android.getColorResource")
    @js.native
    def getColorResource(resourceIdOrColorName: String): typings.titanium.Titanium.UI.Color = js.native
    /**
      * Returns a <Ti.Color> instance for a color defined by the system or user resources (colors.xml)
      */
    /* static member */
    @JSGlobal("Titanium.UI.Android.getColorResource")
    @js.native
    def getColorResource(resourceIdOrColorName: Double): typings.titanium.Titanium.UI.Color = js.native
    
    /**
      * Gets the value of the <Titanium.UI.Android.lifecycleContainer> property.
      * @deprecated Access <Titanium.UI.Android.lifecycleContainer> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Android.getLifecycleContainer")
    @js.native
    def getLifecycleContainer(): typings.titanium.Titanium.UI.Window | typings.titanium.Titanium.UI.TabGroup = js.native
    
    /**
      * Hides the soft keyboard.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Android.hideSoftKeyboard")
    @js.native
    def hideSoftKeyboard(): Unit = js.native
    
    /**
      * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Android.lifecycleContainer")
    @js.native
    def lifecycleContainer: typings.titanium.Titanium.UI.Window | typings.titanium.Titanium.UI.TabGroup = js.native
    @scala.inline
    def lifecycleContainer_=(x: typings.titanium.Titanium.UI.Window | typings.titanium.Titanium.UI.TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
    
    /**
      * Opens an application preferences dialog, using the native Android system settings interface,
      * defined by the platform-specific `preferences.xml` and `array.xml` files.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Android.openPreferences")
    @js.native
    def openPreferences(): Unit = js.native
    
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Android.removeEventListener")
    @js.native
    def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.UI.Android.bubbleParent> property.
      * @deprecated Set the value using <Titanium.UI.Android.bubbleParent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Android.setBubbleParent")
    @js.native
    def setBubbleParent(bubbleParent: Boolean): Unit = js.native
    
    @JSGlobal("Titanium.UI.Android.setLifecycleContainer")
    @js.native
    def setLifecycleContainer(lifecycleContainer: typings.titanium.Titanium.UI.TabGroup): Unit = js.native
    /**
      * Sets the value of the <Titanium.UI.Android.lifecycleContainer> property.
      * @deprecated Set the value using <Titanium.UI.Android.lifecycleContainer> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Android.setLifecycleContainer")
    @js.native
    def setLifecycleContainer(lifecycleContainer: typings.titanium.Titanium.UI.Window): Unit = js.native
  }
  
  /**
    * The `Animation` object defines an animation that can be applied to a view.
    */
  @JSGlobal("Titanium.UI.Animation")
  @js.native
  class Animation ()
    extends typings.titanium.Titanium.UI.Animation
  
  /**
    * An attributed string proxy manages character strings and associated sets of attributes (for example,
    * font and foregroundcolor) that apply to individual characters or ranges of characters in the string.
    */
  @JSGlobal("Titanium.UI.AttributedString")
  @js.native
  class AttributedString ()
    extends typings.titanium.Titanium.UI.AttributedString
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_CLEAR")
  @js.native
  val BLEND_MODE_CLEAR: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_COLOR")
  @js.native
  val BLEND_MODE_COLOR: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_COLOR_BURN")
  @js.native
  val BLEND_MODE_COLOR_BURN: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_COLOR_DODGE")
  @js.native
  val BLEND_MODE_COLOR_DODGE: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_COPY")
  @js.native
  val BLEND_MODE_COPY: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_DARKEN")
  @js.native
  val BLEND_MODE_DARKEN: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_DESTINATION_ATOP")
  @js.native
  val BLEND_MODE_DESTINATION_ATOP: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_DESTINATION_IN")
  @js.native
  val BLEND_MODE_DESTINATION_IN: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_DESTINATION_OUT")
  @js.native
  val BLEND_MODE_DESTINATION_OUT: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_DESTINATION_OVER")
  @js.native
  val BLEND_MODE_DESTINATION_OVER: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_DIFFERENCE")
  @js.native
  val BLEND_MODE_DIFFERENCE: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_EXCLUSION")
  @js.native
  val BLEND_MODE_EXCLUSION: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_HARD_LIGHT")
  @js.native
  val BLEND_MODE_HARD_LIGHT: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_HUE")
  @js.native
  val BLEND_MODE_HUE: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_LIGHTEN")
  @js.native
  val BLEND_MODE_LIGHTEN: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_LUMINOSITY")
  @js.native
  val BLEND_MODE_LUMINOSITY: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_MULTIPLY")
  @js.native
  val BLEND_MODE_MULTIPLY: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_NORMAL")
  @js.native
  val BLEND_MODE_NORMAL: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_OVERLAY")
  @js.native
  val BLEND_MODE_OVERLAY: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_PLUS_DARKER")
  @js.native
  val BLEND_MODE_PLUS_DARKER: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_PLUS_LIGHTER")
  @js.native
  val BLEND_MODE_PLUS_LIGHTER: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_SATURATION")
  @js.native
  val BLEND_MODE_SATURATION: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_SCREEN")
  @js.native
  val BLEND_MODE_SCREEN: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_SOFT_LIGHT")
  @js.native
  val BLEND_MODE_SOFT_LIGHT: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_SOURCE_ATOP")
  @js.native
  val BLEND_MODE_SOURCE_ATOP: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_SOURCE_IN")
  @js.native
  val BLEND_MODE_SOURCE_IN: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_SOURCE_OUT")
  @js.native
  val BLEND_MODE_SOURCE_OUT: Double = js.native
  
  /**
    * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
    */
  @JSGlobal("Titanium.UI.BLEND_MODE_XOR")
  @js.native
  val BLEND_MODE_XOR: Double = js.native
  
  /**
    * A button widget that has four states: normal, disabled, focused and selected.
    */
  @JSGlobal("Titanium.UI.Button")
  @js.native
  class Button ()
    extends typings.titanium.Titanium.UI.Button
  
  /**
    * An iOS button bar component.
    */
  @JSGlobal("Titanium.UI.ButtonBar")
  @js.native
  class ButtonBar ()
    extends typings.titanium.Titanium.UI.ButtonBar
  
  /**
    * Specifies the time and date that you want the system to remove the clipboard items from the clipboard.
    */
  @JSGlobal("Titanium.UI.CLIPBOARD_OPTION_EXPIRATION_DATE")
  @js.native
  val CLIPBOARD_OPTION_EXPIRATION_DATE: String = js.native
  
  /**
    * Specifies that the clipboard items should not be available to other devices through Handoff.
    */
  @JSGlobal("Titanium.UI.CLIPBOARD_OPTION_LOCAL_ONLY")
  @js.native
  val CLIPBOARD_OPTION_LOCAL_ONLY: String = js.native
  
  /**
    * A module used for accessing clipboard data.
    */
  @JSGlobal("Titanium.UI.Clipboard")
  @js.native
  class Clipboard ()
    extends typings.titanium.Titanium.Proxy
  object Clipboard {
    
    @JSGlobal("Titanium.UI.Clipboard")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.addEventListener")
    @js.native
    def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    
    /**
      * Create a clipboard identified by name if it doesn't exist.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.allowCreation")
    @js.native
    def allowCreation: Boolean = js.native
    @scala.inline
    def allowCreation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowCreation")(x.asInstanceOf[js.Any])
    
    /**
      * The name of the API that this proxy corresponds to.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.apiName")
    @js.native
    val apiName: String = js.native
    
    /**
      * Applies the properties to the proxy.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.applyProperties")
    @js.native
    def applyProperties(props: js.Any): Unit = js.native
    
    /**
      * Indicates if the proxy will bubble an event to its parent.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.bubbleParent")
    @js.native
    def bubbleParent: Boolean = js.native
    @scala.inline
    def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
    
    /**
      * Deletes data of the specified MIME type stored in the clipboard. If MIME type omitted, all
      * data is deleted.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.clearData")
    @js.native
    def clearData(): Unit = js.native
    @JSGlobal("Titanium.UI.Clipboard.clearData")
    @js.native
    def clearData(`type`: String): Unit = js.native
    
    /**
      * Deletes all text data stored in the clipboard.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.clearText")
    @js.native
    def clearText(): Unit = js.native
    
    /**
      * Fires a synthesized event to any registered listeners.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.fireEvent")
    @js.native
    def fireEvent(name: String): Unit = js.native
    @JSGlobal("Titanium.UI.Clipboard.fireEvent")
    @js.native
    def fireEvent(name: String, event: js.Any): Unit = js.native
    
    /**
      * Gets the value of the <Titanium.UI.Clipboard.allowCreation> property.
      * @deprecated Access <Titanium.UI.Clipboard.allowCreation> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.getAllowCreation")
    @js.native
    def getAllowCreation(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.UI.Clipboard.apiName> property.
      * @deprecated Access <Titanium.UI.Clipboard.apiName> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.getApiName")
    @js.native
    def getApiName(): String = js.native
    
    /**
      * Gets the value of the <Titanium.UI.Clipboard.bubbleParent> property.
      * @deprecated Access <Titanium.UI.Clipboard.bubbleParent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.getBubbleParent")
    @js.native
    def getBubbleParent(): Boolean = js.native
    
    /**
      * Gets data of the specified MIME type stored in the clipboard. Returns null if non-text mimetype on Android.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.getData")
    @js.native
    def getData(`type`: String): String | typings.titanium.Titanium.Blob = js.native
    
    /**
      * Gets the items that have been specified earlier using <Titanium.UI.Clipboard.setItems>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.getItems")
    @js.native
    def getItems(): js.Array[_] = js.native
    
    /**
      * Gets the value of the <Titanium.UI.Clipboard.name> property.
      * @deprecated Access <Titanium.UI.Clipboard.name> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.getName")
    @js.native
    def getName(): String = js.native
    
    /**
      * Gets text data stored in the clipboard.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.getText")
    @js.native
    def getText(): String = js.native
    
    /**
      * Gets the value of the <Titanium.UI.Clipboard.unique> property.
      * @deprecated Access <Titanium.UI.Clipboard.unique> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.getUnique")
    @js.native
    def getUnique(): Boolean = js.native
    
    /**
      * Indicates whether any colors are stored in the clipboard.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.hasColors")
    @js.native
    def hasColors(): Boolean = js.native
    
    /**
      * Indicates whether any data of the specified MIME type is stored in the clipboard.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.hasData")
    @js.native
    def hasData(): Boolean = js.native
    @JSGlobal("Titanium.UI.Clipboard.hasData")
    @js.native
    def hasData(`type`: String): Boolean = js.native
    
    /**
      * Indicates whether any images are stored in the clipboard.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.hasImages")
    @js.native
    def hasImages(): Boolean = js.native
    
    /**
      * Indicates whether any text data is stored in the clipboard.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.hasText")
    @js.native
    def hasText(): Boolean = js.native
    
    /**
      * Indicates whether any URLs are stored in the clipboard.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.hasURLs")
    @js.native
    def hasURLs(): Boolean = js.native
    
    /**
      * Create a new named clipboard.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.name")
    @js.native
    def name: String = js.native
    @scala.inline
    def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    /**
      * Removes the clipboard.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.remove")
    @js.native
    def remove(): Unit = js.native
    
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.removeEventListener")
    @js.native
    def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.UI.Clipboard.allowCreation> property.
      * @deprecated Set the value using <Titanium.UI.Clipboard.allowCreation> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.setAllowCreation")
    @js.native
    def setAllowCreation(allowCreation: Boolean): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.UI.Clipboard.bubbleParent> property.
      * @deprecated Set the value using <Titanium.UI.Clipboard.bubbleParent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.setBubbleParent")
    @js.native
    def setBubbleParent(bubbleParent: Boolean): Unit = js.native
    
    /**
      * Stores data of the specified MIME type in the clipboard.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.setData")
    @js.native
    def setData(`type`: String, data: js.Any): Unit = js.native
    
    /**
      * Adds an array of items to a clipboard, and sets privacy options for all included items.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.setItems")
    @js.native
    def setItems(items: ClipboardItemsType): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.UI.Clipboard.name> property.
      * @deprecated Set the value using <Titanium.UI.Clipboard.name> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.setName")
    @js.native
    def setName(name: String): Unit = js.native
    
    /**
      * Stores text data in the clipboard.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.setText")
    @js.native
    def setText(text: String): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.UI.Clipboard.unique> property.
      * @deprecated Set the value using <Titanium.UI.Clipboard.unique> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.setUnique")
    @js.native
    def setUnique(unique: Boolean): Unit = js.native
    
    /**
      * Create a new clipboard identified by a unique system-generated name.
      */
    /* static member */
    @JSGlobal("Titanium.UI.Clipboard.unique")
    @js.native
    def unique: Boolean = js.native
    @scala.inline
    def unique_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unique")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Represents a color used for UI components.
    */
  @JSGlobal("Titanium.UI.Color")
  @js.native
  class Color ()
    extends typings.titanium.Titanium.UI.Color
  
  /**
    * The cover flow view is a container showing animated three-dimensional images in a style
    * consistent with the cover flow presentation used for iPod, iTunes, and file browsing.
    * @deprecated Use [Titanium.UI.iOS.CoverFlowView](Titanium.UI.iOS.CoverFlowView) instead.
    */
  @JSGlobal("Titanium.UI.CoverFlowView")
  @js.native
  val CoverFlowView: scala.Nothing = js.native
  
  /**
    * A dashboard item is a view that is displayed as an icon in a <Titanium.UI.DashboardView>.
    */
  @JSGlobal("Titanium.UI.DashboardItem")
  @js.native
  class DashboardItem ()
    extends typings.titanium.Titanium.UI.DashboardItem
  
  /**
    * A dashboard view is an iOS Springboard-like view of <Titanium.UI.DashboardItem> items that may
    * be deleted and reordered by the user using its built-in edit mode.
    */
  @JSGlobal("Titanium.UI.DashboardView")
  @js.native
  class DashboardView ()
    extends typings.titanium.Titanium.UI.DashboardView
  
  /**
    * Specifies that all the edges of the window can extend.
    */
  @JSGlobal("Titanium.UI.EXTEND_EDGE_ALL")
  @js.native
  val EXTEND_EDGE_ALL: Double = js.native
  
  /**
    * Specifies that the bottom edge of the window can extend.
    */
  @JSGlobal("Titanium.UI.EXTEND_EDGE_BOTTOM")
  @js.native
  val EXTEND_EDGE_BOTTOM: Double = js.native
  
  /**
    * Specifies that the left edge of the window can extend.
    */
  @JSGlobal("Titanium.UI.EXTEND_EDGE_LEFT")
  @js.native
  val EXTEND_EDGE_LEFT: Double = js.native
  
  /**
    * Specifies that none of the edges of the window can extend.
    */
  @JSGlobal("Titanium.UI.EXTEND_EDGE_NONE")
  @js.native
  val EXTEND_EDGE_NONE: Double = js.native
  
  /**
    * Specifies that the right edge of the window can extend.
    */
  @JSGlobal("Titanium.UI.EXTEND_EDGE_RIGHT")
  @js.native
  val EXTEND_EDGE_RIGHT: Double = js.native
  
  /**
    * Specifies that the top edge of the window can extend.
    */
  @JSGlobal("Titanium.UI.EXTEND_EDGE_TOP")
  @js.native
  val EXTEND_EDGE_TOP: Double = js.native
  
  /**
    * An email dialog is a modal window that allows users to compose and send an email.
    */
  @JSGlobal("Titanium.UI.EmailDialog")
  @js.native
  class EmailDialog ()
    extends typings.titanium.Titanium.UI.EmailDialog
  
  /**
    * Constant value for face-down orientation.
    */
  @JSGlobal("Titanium.UI.FACE_DOWN")
  @js.native
  val FACE_DOWN: Double = js.native
  
  /**
    * Constant value for face-up orientation.
    */
  @JSGlobal("Titanium.UI.FACE_UP")
  @js.native
  val FACE_UP: Double = js.native
  
  /**
    * FILL behavior for UI layout.
    */
  @JSGlobal("Titanium.UI.FILL")
  @js.native
  val FILL: String = js.native
  
  /**
    * Release free space when hiding an object.
    */
  @JSGlobal("Titanium.UI.HIDDEN_BEHAVIOR_GONE")
  @js.native
  val HIDDEN_BEHAVIOR_GONE: Double = js.native
  
  /**
    * Keeps free space when hiding an object.
    */
  @JSGlobal("Titanium.UI.HIDDEN_BEHAVIOR_INVISIBLE")
  @js.native
  val HIDDEN_BEHAVIOR_INVISIBLE: Double = js.native
  
  /**
    * Use when creating a TextField to specify the hintType as animated.
    */
  @JSGlobal("Titanium.UI.HINT_TYPE_ANIMATED")
  @js.native
  val HINT_TYPE_ANIMATED: Double = js.native
  
  /**
    * Use when creating a TextField to specify the hintType as static.
    */
  @JSGlobal("Titanium.UI.HINT_TYPE_STATIC")
  @js.native
  val HINT_TYPE_STATIC: Double = js.native
  
  /**
    * Use a bezel-style border on the input field.
    */
  @JSGlobal("Titanium.UI.INPUT_BORDERSTYLE_BEZEL")
  @js.native
  val INPUT_BORDERSTYLE_BEZEL: Double = js.native
  
  /**
    * Use a simple line border on the input field.
    */
  @JSGlobal("Titanium.UI.INPUT_BORDERSTYLE_LINE")
  @js.native
  val INPUT_BORDERSTYLE_LINE: Double = js.native
  
  /**
    * Use no border on the input field.
    */
  @JSGlobal("Titanium.UI.INPUT_BORDERSTYLE_NONE")
  @js.native
  val INPUT_BORDERSTYLE_NONE: Double = js.native
  
  /**
    * Use a rounded-rectangle border on the input field.
    */
  @JSGlobal("Titanium.UI.INPUT_BORDERSTYLE_ROUNDED")
  @js.native
  val INPUT_BORDERSTYLE_ROUNDED: Double = js.native
  
  /**
    * Always show buttons on the input field.
    */
  @JSGlobal("Titanium.UI.INPUT_BUTTONMODE_ALWAYS")
  @js.native
  val INPUT_BUTTONMODE_ALWAYS: Double = js.native
  
  /**
    * Never show buttons on the input field.
    */
  @JSGlobal("Titanium.UI.INPUT_BUTTONMODE_NEVER")
  @js.native
  val INPUT_BUTTONMODE_NEVER: Double = js.native
  
  /**
    * Show buttons on the input field when it loses focus.
    */
  @JSGlobal("Titanium.UI.INPUT_BUTTONMODE_ONBLUR")
  @js.native
  val INPUT_BUTTONMODE_ONBLUR: Double = js.native
  
  /**
    * Show buttons on the input field when it gains focus.
    */
  @JSGlobal("Titanium.UI.INPUT_BUTTONMODE_ONFOCUS")
  @js.native
  val INPUT_BUTTONMODE_ONFOCUS: Double = js.native
  
  /**
    * Use a keyboard with a number pad only, with the pad keyboard layout. Accepts only numbers.
    */
  @JSGlobal("Titanium.UI.INPUT_TYPE_CLASS_NUMBER")
  @js.native
  val INPUT_TYPE_CLASS_NUMBER: Double = js.native
  
  /**
    * Use an ASCII keyboard, with the standard keyboard layout.
    */
  @JSGlobal("Titanium.UI.INPUT_TYPE_CLASS_TEXT")
  @js.native
  val INPUT_TYPE_CLASS_TEXT: Double = js.native
  
  /**
    * A view to display a single image or series of animated images.
    */
  @JSGlobal("Titanium.UI.ImageView")
  @js.native
  class ImageView ()
    extends typings.titanium.Titanium.UI.ImageView
  
  /**
    * Use a keyboard appearance suitable for entering text on an alert.
    * @deprecated
    */
  @JSGlobal("Titanium.UI.KEYBOARD_APPEARANCE_ALERT")
  @js.native
  val KEYBOARD_APPEARANCE_ALERT: scala.Nothing = js.native
  
  /**
    * Use the platform-specific dark keyboard appearance.
    */
  @JSGlobal("Titanium.UI.KEYBOARD_APPEARANCE_DARK")
  @js.native
  val KEYBOARD_APPEARANCE_DARK: Double = js.native
  
  /**
    * Use the platform-specific default keyboard appearance.
    */
  @JSGlobal("Titanium.UI.KEYBOARD_APPEARANCE_DEFAULT")
  @js.native
  val KEYBOARD_APPEARANCE_DEFAULT: Double = js.native
  
  /**
    * Use the platform-specific light keyboard appearance.
    */
  @JSGlobal("Titanium.UI.KEYBOARD_APPEARANCE_LIGHT")
  @js.native
  val KEYBOARD_APPEARANCE_LIGHT: Double = js.native
  
  /**
    * Use a keyboard supporting all characters except emoji. Defaults to English letters layout on iOS.
    * @deprecated Use [Titanium.UI.KEYBOARD_TYPE_ASCII](Titanium.UI.KEYBOARD_TYPE_ASCII) instead.
    */
  @JSGlobal("Titanium.UI.KEYBOARD_ASCII")
  @js.native
  val KEYBOARD_ASCII: scala.Nothing = js.native
  
  /**
    * Use a number pad keyboard layout showing only numbers, decimal separator, and sign character.
    * @deprecated Use [Titanium.UI.KEYBOARD_TYPE_DECIMAL_PAD](Titanium.UI.KEYBOARD_TYPE_DECIMAL_PAD) instead.
    */
  @JSGlobal("Titanium.UI.KEYBOARD_DECIMAL_PAD")
  @js.native
  val KEYBOARD_DECIMAL_PAD: scala.Nothing = js.native
  
  /**
    * Use the default keyboard, depending on the platform.
    * @deprecated Use [Titanium.UI.KEYBOARD_TYPE_DEFAULT](Titanium.UI.KEYBOARD_TYPE_DEFAULT) instead.
    */
  @JSGlobal("Titanium.UI.KEYBOARD_DEFAULT")
  @js.native
  val KEYBOARD_DEFAULT: scala.Nothing = js.native
  
  /**
    * Use a keyboard suitable for composing email, with the standard keyboard layout.
    * @deprecated Use [Titanium.UI.KEYBOARD_TYPE_EMAIL](Titanium.UI.KEYBOARD_TYPE_EMAIL) instead.
    */
  @JSGlobal("Titanium.UI.KEYBOARD_EMAIL")
  @js.native
  val KEYBOARD_EMAIL: scala.Nothing = js.native
  
  /**
    * Use a keyboard suitable for entering names and phone numbers, with the pad keyboard layout.
    * @deprecated Use [Titanium.UI.KEYBOARD_TYPE_NAMEPHONE_PAD](Titanium.UI.KEYBOARD_TYPE_NAMEPHONE_PAD) instead.
    */
  @JSGlobal("Titanium.UI.KEYBOARD_NAMEPHONE_PAD")
  @js.native
  val KEYBOARD_NAMEPHONE_PAD: scala.Nothing = js.native
  
  /**
    * Use a keyboard supporting all characters except emoji, defaulting to numbers layout on iOS.
    * @deprecated Use [Titanium.UI.KEYBOARD_TYPE_NUMBERS_PUNCTUATION](Titanium.UI.KEYBOARD_TYPE_NUMBERS_PUNCTUATION) instead.
    */
  @JSGlobal("Titanium.UI.KEYBOARD_NUMBERS_PUNCTUATION")
  @js.native
  val KEYBOARD_NUMBERS_PUNCTUATION: scala.Nothing = js.native
  
  /**
    * Use a number pad keyboard layout only showing numbers for entering positive integers.
    * @deprecated Use [Titanium.UI.KEYBOARD_TYPE_NUMBER_PAD](Titanium.UI.KEYBOARD_TYPE_NUMBER_PAD) instead.
    */
  @JSGlobal("Titanium.UI.KEYBOARD_NUMBER_PAD")
  @js.native
  val KEYBOARD_NUMBER_PAD: scala.Nothing = js.native
  
  /**
    * Use a keyboard with a phone-style number pad, with the pad keyboard layout.
    * @deprecated Use [Titanium.UI.KEYBOARD_TYPE_PHONE_PAD](Titanium.UI.KEYBOARD_TYPE_PHONE_PAD) instead.
    */
  @JSGlobal("Titanium.UI.KEYBOARD_PHONE_PAD")
  @js.native
  val KEYBOARD_PHONE_PAD: scala.Nothing = js.native
  
  /**
    * Use a keyboard supporting all characters except emoji. Defaults to English letters layout on iOS.
    */
  @JSGlobal("Titanium.UI.KEYBOARD_TYPE_ASCII")
  @js.native
  val KEYBOARD_TYPE_ASCII: Double = js.native
  
  /**
    * Use a number pad keyboard layout showing only numbers, decimal separator, and sign character.
    */
  @JSGlobal("Titanium.UI.KEYBOARD_TYPE_DECIMAL_PAD")
  @js.native
  val KEYBOARD_TYPE_DECIMAL_PAD: Double = js.native
  
  /**
    * Use the default keyboard, depending on the platform.
    */
  @JSGlobal("Titanium.UI.KEYBOARD_TYPE_DEFAULT")
  @js.native
  val KEYBOARD_TYPE_DEFAULT: Double = js.native
  
  /**
    * Use a keyboard suitable for composing email, with the standard keyboard layout.
    */
  @JSGlobal("Titanium.UI.KEYBOARD_TYPE_EMAIL")
  @js.native
  val KEYBOARD_TYPE_EMAIL: Double = js.native
  
  /**
    * Use a keyboard suitable for entering names and phone numbers, with the pad keyboard layout.
    */
  @JSGlobal("Titanium.UI.KEYBOARD_TYPE_NAMEPHONE_PAD")
  @js.native
  val KEYBOARD_TYPE_NAMEPHONE_PAD: Double = js.native
  
  /**
    * Use a keyboard supporting all characters except emoji, defaulting to numbers layout on iOS.
    */
  @JSGlobal("Titanium.UI.KEYBOARD_TYPE_NUMBERS_PUNCTUATION")
  @js.native
  val KEYBOARD_TYPE_NUMBERS_PUNCTUATION: Double = js.native
  
  /**
    * Use a number pad keyboard layout only showing numbers for entering positive integers.
    */
  @JSGlobal("Titanium.UI.KEYBOARD_TYPE_NUMBER_PAD")
  @js.native
  val KEYBOARD_TYPE_NUMBER_PAD: Double = js.native
  
  /**
    * Use a keyboard with a phone-style number pad, with the pad keyboard layout.
    */
  @JSGlobal("Titanium.UI.KEYBOARD_TYPE_PHONE_PAD")
  @js.native
  val KEYBOARD_TYPE_PHONE_PAD: Double = js.native
  
  /**
    * Use a keyboard optimized for twitter text entry, with easy access to the @ and
    */
  @JSGlobal("Titanium.UI.KEYBOARD_TYPE_TWITTER")
  @js.native
  val KEYBOARD_TYPE_TWITTER: Double = js.native
  
  /**
    * Use a keyboard optimized for entering URLs, with the standard keyboard layout.
    */
  @JSGlobal("Titanium.UI.KEYBOARD_TYPE_URL")
  @js.native
  val KEYBOARD_TYPE_URL: Double = js.native
  
  /**
    * Use a keyboard optimized for web search terms and URL entry.
    */
  @JSGlobal("Titanium.UI.KEYBOARD_TYPE_WEBSEARCH")
  @js.native
  val KEYBOARD_TYPE_WEBSEARCH: Double = js.native
  
  /**
    * Use a keyboard optimized for entering URLs, with the standard keyboard layout.
    * @deprecated Use [Titanium.UI.KEYBOARD_TYPE_URL](Titanium.UI.KEYBOARD_TYPE_URL) instead.
    */
  @JSGlobal("Titanium.UI.KEYBOARD_URL")
  @js.native
  val KEYBOARD_URL: scala.Nothing = js.native
  
  /**
    * Standard landscape orientation (home button on left).
    */
  @JSGlobal("Titanium.UI.LANDSCAPE_LEFT")
  @js.native
  val LANDSCAPE_LEFT: Double = js.native
  
  /**
    * Reverse landscape orientation (home button on right).
    */
  @JSGlobal("Titanium.UI.LANDSCAPE_RIGHT")
  @js.native
  val LANDSCAPE_RIGHT: Double = js.native
  
  /**
    * Displays a checkmark on the right side of an item in a list view.
    */
  @JSGlobal("Titanium.UI.LIST_ACCESSORY_TYPE_CHECKMARK")
  @js.native
  val LIST_ACCESSORY_TYPE_CHECKMARK: Double = js.native
  
  /**
    * Displays a detail disclosure button on the right side of an item in a list view.
    */
  @JSGlobal("Titanium.UI.LIST_ACCESSORY_TYPE_DETAIL")
  @js.native
  val LIST_ACCESSORY_TYPE_DETAIL: Double = js.native
  
  /**
    * Displays a disclosure indicator on the right side of an item in a list view.
    */
  @JSGlobal("Titanium.UI.LIST_ACCESSORY_TYPE_DISCLOSURE")
  @js.native
  val LIST_ACCESSORY_TYPE_DISCLOSURE: Double = js.native
  
  /**
    * Do not display anything on the right side of an item in a list view.
    */
  @JSGlobal("Titanium.UI.LIST_ACCESSORY_TYPE_NONE")
  @js.native
  val LIST_ACCESSORY_TYPE_NONE: Double = js.native
  
  /**
    * A built-in style for an item with a right-aligned title label on the left side of the cell,
    * which is next to a left-aligned subtitle label.
    */
  @JSGlobal("Titanium.UI.LIST_ITEM_TEMPLATE_CONTACTS")
  @js.native
  val LIST_ITEM_TEMPLATE_CONTACTS: Double = js.native
  
  /**
    * A built-in style for an item with an image view and left-aligned title label.
    */
  @JSGlobal("Titanium.UI.LIST_ITEM_TEMPLATE_DEFAULT")
  @js.native
  val LIST_ITEM_TEMPLATE_DEFAULT: Double = js.native
  
  /**
    * A built-in style for a item with an image view; a left-aligned title label; and a
    * right-aligned subtitle label.
    */
  @JSGlobal("Titanium.UI.LIST_ITEM_TEMPLATE_SETTINGS")
  @js.native
  val LIST_ITEM_TEMPLATE_SETTINGS: Double = js.native
  
  /**
    * A built-in style for an item with an image view; a black, left-aligned title label across the
    * top of the cell and a subtitle label below it.
    */
  @JSGlobal("Titanium.UI.LIST_ITEM_TEMPLATE_SUBTITLE")
  @js.native
  val LIST_ITEM_TEMPLATE_SUBTITLE: Double = js.native
  
  /**
    * A text label, with an optional background image.
    */
  @JSGlobal("Titanium.UI.Label")
  @js.native
  class Label ()
    extends typings.titanium.Titanium.UI.Label
  
  /**
    * A list item is an individual item in a list section.
    */
  @JSGlobal("Titanium.UI.ListItem")
  @js.native
  class ListItem ()
    extends typings.titanium.Titanium.UI.ListItem
  
  /**
    * A list section is a container within a list view used to organize list items.
    */
  @JSGlobal("Titanium.UI.ListSection")
  @js.native
  class ListSection ()
    extends typings.titanium.Titanium.UI.ListSection
  
  /**
    * A list view is used to present information, organized in to sections and items,
    * in a vertically-scrolling view.
    */
  @JSGlobal("Titanium.UI.ListView")
  @js.native
  class ListView ()
    extends typings.titanium.Titanium.UI.ListView
  
  /**
    * A control that displays an image composited with a background image or color.
    */
  @JSGlobal("Titanium.UI.MaskedImage")
  @js.native
  class MaskedImage ()
    extends typings.titanium.Titanium.UI.MaskedImage
  
  /**
    * The 2D Matrix is an object for holding values for an affine transformation matrix.
    */
  @JSGlobal("Titanium.UI.Matrix2D")
  @js.native
  class Matrix2D ()
    extends typings.titanium.Titanium.UI.Matrix2D
  
  /**
    * The 3D Matrix is an object for holding values for a 3D affine transform.
    */
  @JSGlobal("Titanium.UI.Matrix3D")
  @js.native
  class Matrix3D ()
    extends typings.titanium.Titanium.UI.Matrix3D
  
  /**
    * Specifies a long duration for an Android Toast notification (<Titanium.UI.Notification>).
    */
  @JSGlobal("Titanium.UI.NOTIFICATION_DURATION_LONG")
  @js.native
  val NOTIFICATION_DURATION_LONG: Double = js.native
  
  /**
    * Specifies a short duration for an Android Toast notification (<Titanium.UI.Notification>).
    */
  @JSGlobal("Titanium.UI.NOTIFICATION_DURATION_SHORT")
  @js.native
  val NOTIFICATION_DURATION_SHORT: Double = js.native
  
  /**
    * A `NavigationWindow` implements a specialized view that manages the navigation of hierarchical
    * content.
    */
  @JSGlobal("Titanium.UI.NavigationWindow")
  @js.native
  class NavigationWindow ()
    extends typings.titanium.Titanium.UI.NavigationWindow
  
  /**
    * A toast notification.
    */
  @JSGlobal("Titanium.UI.Notification")
  @js.native
  class Notification ()
    extends typings.titanium.Titanium.UI.Notification
  
  /**
    * An option dialog is a modal view that includes a message and one or more option items positioned
    * in the middle of the display on Android and at the bottom edge on iOS. On Android, buttons may
    * be added below the options.
    */
  @JSGlobal("Titanium.UI.OptionDialog")
  @js.native
  class OptionDialog ()
    extends typings.titanium.Titanium.UI.OptionDialog
  
  /**
    * Use a picker with a countdown timer appearance, showing hours and minutes.
    */
  @JSGlobal("Titanium.UI.PICKER_TYPE_COUNT_DOWN_TIMER")
  @js.native
  val PICKER_TYPE_COUNT_DOWN_TIMER: Double = js.native
  
  /**
    * Use a date picker.
    */
  @JSGlobal("Titanium.UI.PICKER_TYPE_DATE")
  @js.native
  val PICKER_TYPE_DATE: Double = js.native
  
  /**
    * Use a date and time picker.
    */
  @JSGlobal("Titanium.UI.PICKER_TYPE_DATE_AND_TIME")
  @js.native
  val PICKER_TYPE_DATE_AND_TIME: Double = js.native
  
  /**
    * Use a plain picker (for values other than date or time).
    */
  @JSGlobal("Titanium.UI.PICKER_TYPE_PLAIN")
  @js.native
  val PICKER_TYPE_PLAIN: Double = js.native
  
  /**
    * Use a time picker.
    */
  @JSGlobal("Titanium.UI.PICKER_TYPE_TIME")
  @js.native
  val PICKER_TYPE_TIME: Double = js.native
  
  /**
    * Orientation constant for portrait mode orientation.
    */
  @JSGlobal("Titanium.UI.PORTRAIT")
  @js.native
  val PORTRAIT: Double = js.native
  
  /**
    * A control used to select one or more fixed values.
    */
  @JSGlobal("Titanium.UI.Picker")
  @js.native
  class Picker ()
    extends typings.titanium.Titanium.UI.Picker
  
  /**
    * A picker column, representing a selectable group of items in a <Titanium.UI.Picker>.
    */
  @JSGlobal("Titanium.UI.PickerColumn")
  @js.native
  class PickerColumn ()
    extends typings.titanium.Titanium.UI.PickerColumn
  
  /**
    * A picker row, representing a selectable item in a <Titanium.UI.Picker>.
    */
  @JSGlobal("Titanium.UI.PickerRow")
  @js.native
  class PickerRow ()
    extends typings.titanium.Titanium.UI.PickerRow
  
  /**
    * A progress bar.
    */
  @JSGlobal("Titanium.UI.ProgressBar")
  @js.native
  class ProgressBar ()
    extends typings.titanium.Titanium.UI.ProgressBar
  
  /**
    * Set the return key text to "Continue".
    */
  @JSGlobal("Titanium.UI.RETURNKEY_CONTINUE")
  @js.native
  val RETURNKEY_CONTINUE: Double = js.native
  
  /**
    * Use the default return key on the virtual keyboard.
    */
  @JSGlobal("Titanium.UI.RETURNKEY_DEFAULT")
  @js.native
  val RETURNKEY_DEFAULT: Double = js.native
  
  /**
    * Set the return key text to "Done".
    */
  @JSGlobal("Titanium.UI.RETURNKEY_DONE")
  @js.native
  val RETURNKEY_DONE: Double = js.native
  
  /**
    * Set the return key text to "Emergency Call".
    */
  @JSGlobal("Titanium.UI.RETURNKEY_EMERGENCY_CALL")
  @js.native
  val RETURNKEY_EMERGENCY_CALL: Double = js.native
  
  /**
    * Set the return key text to "Go".
    */
  @JSGlobal("Titanium.UI.RETURNKEY_GO")
  @js.native
  val RETURNKEY_GO: Double = js.native
  
  /**
    * Set the return key text to "Google".
    */
  @JSGlobal("Titanium.UI.RETURNKEY_GOOGLE")
  @js.native
  val RETURNKEY_GOOGLE: Double = js.native
  
  /**
    * Set the return key text to "Join".
    */
  @JSGlobal("Titanium.UI.RETURNKEY_JOIN")
  @js.native
  val RETURNKEY_JOIN: Double = js.native
  
  /**
    * Set the return key text to "Next".
    */
  @JSGlobal("Titanium.UI.RETURNKEY_NEXT")
  @js.native
  val RETURNKEY_NEXT: Double = js.native
  
  /**
    * Set the return key text to "Route".
    */
  @JSGlobal("Titanium.UI.RETURNKEY_ROUTE")
  @js.native
  val RETURNKEY_ROUTE: Double = js.native
  
  /**
    * Set the return key text to "Search".
    */
  @JSGlobal("Titanium.UI.RETURNKEY_SEARCH")
  @js.native
  val RETURNKEY_SEARCH: Double = js.native
  
  /**
    * Set the return key text to "Send".
    */
  @JSGlobal("Titanium.UI.RETURNKEY_SEND")
  @js.native
  val RETURNKEY_SEND: Double = js.native
  
  /**
    * Set the return key text to "Yahoo".
    */
  @JSGlobal("Titanium.UI.RETURNKEY_YAHOO")
  @js.native
  val RETURNKEY_YAHOO: Double = js.native
  
  /**
    * The RefreshControl is a representation of the native iOS
    * [UIRefreshControl](https://developer.apple.com/documentation/uikit/uirefreshcontrol)
    * and Android [SwipeRefreshLayout](https://developer.android.com/reference/android/support/v4/widget/SwipeRefreshLayout.html).
    */
  @JSGlobal("Titanium.UI.RefreshControl")
  @js.native
  class RefreshControl ()
    extends typings.titanium.Titanium.UI.RefreshControl
  
  /**
    * The value returned by <Titanium.UI.semanticColorType> when the device is in dark/night mode.
    * @deprecated Use [USER_INTERFACE_STYLE_DARK](Titanium.UI.USER_INTERFACE_STYLE_DARK) instead.
    */
  @JSGlobal("Titanium.UI.SEMANTIC_COLOR_TYPE_DARK")
  @js.native
  val SEMANTIC_COLOR_TYPE_DARK: String = js.native
  
  /**
    * The value returned by <Titanium.UI.semanticColorType> when the device is in light/normal mode.
    * @deprecated Use [USER_INTERFACE_STYLE_LIGHT](Titanium.UI.USER_INTERFACE_STYLE_LIGHT) instead.
    */
  @JSGlobal("Titanium.UI.SEMANTIC_COLOR_TYPE_LIGHT")
  @js.native
  val SEMANTIC_COLOR_TYPE_LIGHT: String = js.native
  
  /**
    * SIZE behavior for UI layout.
    */
  @JSGlobal("Titanium.UI.SIZE")
  @js.native
  val SIZE: String = js.native
  
  /**
    * A view that contains a horizontally and/or vertically-scrollable region of content.
    */
  @JSGlobal("Titanium.UI.ScrollView")
  @js.native
  class ScrollView ()
    extends typings.titanium.Titanium.UI.ScrollView
  
  /**
    * A view that encapsulates a horizontally-scrolling set of child views, known as pages, navigable
    * using its built-in horizontal swipe gestures.
    */
  @JSGlobal("Titanium.UI.ScrollableView")
  @js.native
  class ScrollableView ()
    extends typings.titanium.Titanium.UI.ScrollableView
  
  /**
    * A specialized text field for entering search text.
    */
  @JSGlobal("Titanium.UI.SearchBar")
  @js.native
  class SearchBar ()
    extends typings.titanium.Titanium.UI.SearchBar
  
  /**
    * Manage application shortcuts.
    */
  @JSGlobal("Titanium.UI.Shortcut")
  @js.native
  class Shortcut ()
    extends typings.titanium.Titanium.UI.Shortcut
  
  /**
    * An application shortcut item.
    */
  @JSGlobal("Titanium.UI.ShortcutItem")
  @js.native
  class ShortcutItem ()
    extends typings.titanium.Titanium.UI.ShortcutItem
  
  /**
    * A slider component with a draggable thumb.
    */
  @JSGlobal("Titanium.UI.Slider")
  @js.native
  class Slider ()
    extends typings.titanium.Titanium.UI.Slider
  
  /**
    * An on/off switch control.
    */
  @JSGlobal("Titanium.UI.Switch")
  @js.native
  class Switch ()
    extends typings.titanium.Titanium.UI.Switch
  
  /**
    * The row divider is hidden.
    */
  @JSGlobal("Titanium.UI.TABLE_VIEW_SEPARATOR_STYLE_NONE")
  @js.native
  val TABLE_VIEW_SEPARATOR_STYLE_NONE: Double = js.native
  
  /**
    * The row divider is shown as a single line.
    */
  @JSGlobal("Titanium.UI.TABLE_VIEW_SEPARATOR_STYLE_SINGLE_LINE")
  @js.native
  val TABLE_VIEW_SEPARATOR_STYLE_SINGLE_LINE: Double = js.native
  
  /**
    * Center align text.
    */
  @JSGlobal("Titanium.UI.TEXT_ALIGNMENT_CENTER")
  @js.native
  val TEXT_ALIGNMENT_CENTER: Double | String = js.native
  
  /**
    * Justify align text.
    */
  @JSGlobal("Titanium.UI.TEXT_ALIGNMENT_JUSTIFY")
  @js.native
  val TEXT_ALIGNMENT_JUSTIFY: Double | String = js.native
  
  /**
    * Left align text.
    */
  @JSGlobal("Titanium.UI.TEXT_ALIGNMENT_LEFT")
  @js.native
  val TEXT_ALIGNMENT_LEFT: Double | String = js.native
  
  /**
    * Right align text.
    */
  @JSGlobal("Titanium.UI.TEXT_ALIGNMENT_RIGHT")
  @js.native
  val TEXT_ALIGNMENT_RIGHT: Double | String = js.native
  
  /**
    * Auto-capitalize all text in the input field.
    */
  @JSGlobal("Titanium.UI.TEXT_AUTOCAPITALIZATION_ALL")
  @js.native
  val TEXT_AUTOCAPITALIZATION_ALL: Double = js.native
  
  /**
    * Do not auto-capitalize.
    */
  @JSGlobal("Titanium.UI.TEXT_AUTOCAPITALIZATION_NONE")
  @js.native
  val TEXT_AUTOCAPITALIZATION_NONE: Double = js.native
  
  /**
    * Use sentence-style auto-capitalization in the input field.
    */
  @JSGlobal("Titanium.UI.TEXT_AUTOCAPITALIZATION_SENTENCES")
  @js.native
  val TEXT_AUTOCAPITALIZATION_SENTENCES: Double = js.native
  
  /**
    * Auto-capitalize the first letter of each word in the input field.
    */
  @JSGlobal("Titanium.UI.TEXT_AUTOCAPITALIZATION_WORDS")
  @js.native
  val TEXT_AUTOCAPITALIZATION_WORDS: Double = js.native
  
  /**
    * Add ellipses before the first character that doesnt fit.
    */
  @JSGlobal("Titanium.UI.TEXT_ELLIPSIZE_TRUNCATE_CHAR_WRAP")
  @js.native
  val TEXT_ELLIPSIZE_TRUNCATE_CHAR_WRAP: Double = js.native
  
  /**
    * Lines are simply not drawn past the edge of the text container.
    */
  @JSGlobal("Titanium.UI.TEXT_ELLIPSIZE_TRUNCATE_CLIP")
  @js.native
  val TEXT_ELLIPSIZE_TRUNCATE_CLIP: Double = js.native
  
  /**
    * Add ellipses at the end of the label if the text is too large to fit.
    */
  @JSGlobal("Titanium.UI.TEXT_ELLIPSIZE_TRUNCATE_END")
  @js.native
  val TEXT_ELLIPSIZE_TRUNCATE_END: Double = js.native
  
  /**
    * Turns on a marquee effect of the label if the text is too large to fit. (This requires <Titanium.UI.Label.focusable> to be true)
    */
  @JSGlobal("Titanium.UI.TEXT_ELLIPSIZE_TRUNCATE_MARQUEE")
  @js.native
  val TEXT_ELLIPSIZE_TRUNCATE_MARQUEE: Double = js.native
  
  /**
    * Add ellipses in the middle of the label if the text is too large to fit.
    */
  @JSGlobal("Titanium.UI.TEXT_ELLIPSIZE_TRUNCATE_MIDDLE")
  @js.native
  val TEXT_ELLIPSIZE_TRUNCATE_MIDDLE: Double = js.native
  
  /**
    * Disables ellipsizing of the label. The text will be cut off if it is too long.
    */
  @JSGlobal("Titanium.UI.TEXT_ELLIPSIZE_TRUNCATE_NONE")
  @js.native
  val TEXT_ELLIPSIZE_TRUNCATE_NONE: Double = js.native
  
  /**
    * Add ellipses at the beginning of the label if the text is too large to fit.
    */
  @JSGlobal("Titanium.UI.TEXT_ELLIPSIZE_TRUNCATE_START")
  @js.native
  val TEXT_ELLIPSIZE_TRUNCATE_START: Double = js.native
  
  /**
    * Add ellipses at word boundaries, unless the word itself doesn't fit on a single line.
    */
  @JSGlobal("Titanium.UI.TEXT_ELLIPSIZE_TRUNCATE_WORD_WRAP")
  @js.native
  val TEXT_ELLIPSIZE_TRUNCATE_WORD_WRAP: Double = js.native
  
  /**
    * The font used for body texts.
    */
  @JSGlobal("Titanium.UI.TEXT_STYLE_BODY")
  @js.native
  val TEXT_STYLE_BODY: String = js.native
  
  /**
    * The font used for callouts.
    */
  @JSGlobal("Titanium.UI.TEXT_STYLE_CALLOUT")
  @js.native
  val TEXT_STYLE_CALLOUT: String = js.native
  
  /**
    * The font used for standard captions.
    */
  @JSGlobal("Titanium.UI.TEXT_STYLE_CAPTION1")
  @js.native
  val TEXT_STYLE_CAPTION1: String = js.native
  
  /**
    * The font used for alternate captions.
    */
  @JSGlobal("Titanium.UI.TEXT_STYLE_CAPTION2")
  @js.native
  val TEXT_STYLE_CAPTION2: String = js.native
  
  /**
    * The font used in footnotes.
    */
  @JSGlobal("Titanium.UI.TEXT_STYLE_FOOTNOTE")
  @js.native
  val TEXT_STYLE_FOOTNOTE: String = js.native
  
  /**
    * The font used for headings.
    */
  @JSGlobal("Titanium.UI.TEXT_STYLE_HEADLINE")
  @js.native
  val TEXT_STYLE_HEADLINE: String = js.native
  
  /**
    * Specifies the text style for the <Font> Object.
    */
  @JSGlobal("Titanium.UI.TEXT_STYLE_LARGE_TITLE")
  @js.native
  val TEXT_STYLE_LARGE_TITLE: String = js.native
  
  /**
    * The font used for subheadings.
    */
  @JSGlobal("Titanium.UI.TEXT_STYLE_SUBHEADLINE")
  @js.native
  val TEXT_STYLE_SUBHEADLINE: String = js.native
  
  /**
    * The font used for first level hierarchical headings.
    */
  @JSGlobal("Titanium.UI.TEXT_STYLE_TITLE1")
  @js.native
  val TEXT_STYLE_TITLE1: String = js.native
  
  /**
    * The font used for second level hierarchical headings.
    */
  @JSGlobal("Titanium.UI.TEXT_STYLE_TITLE2")
  @js.native
  val TEXT_STYLE_TITLE2: String = js.native
  
  /**
    * The font used for third level hierarchical headings.
    */
  @JSGlobal("Titanium.UI.TEXT_STYLE_TITLE3")
  @js.native
  val TEXT_STYLE_TITLE3: String = js.native
  
  /**
    * Align text to the bottom of the view.
    */
  @JSGlobal("Titanium.UI.TEXT_VERTICAL_ALIGNMENT_BOTTOM")
  @js.native
  val TEXT_VERTICAL_ALIGNMENT_BOTTOM: Double | String = js.native
  
  /**
    * Vertically align text to the center of the view.
    */
  @JSGlobal("Titanium.UI.TEXT_VERTICAL_ALIGNMENT_CENTER")
  @js.native
  val TEXT_VERTICAL_ALIGNMENT_CENTER: Double | String = js.native
  
  /**
    * Align text to the top of the view.
    */
  @JSGlobal("Titanium.UI.TEXT_VERTICAL_ALIGNMENT_TOP")
  @js.native
  val TEXT_VERTICAL_ALIGNMENT_TOP: Double | String = js.native
  
  /**
    * A tab instance for a [TabGroup](Titanium.UI.TabGroup).
    */
  @JSGlobal("Titanium.UI.Tab")
  @js.native
  class Tab ()
    extends typings.titanium.Titanium.UI.Tab
  
  /**
    * A tabbed group of windows.
    */
  @JSGlobal("Titanium.UI.TabGroup")
  @js.native
  class TabGroup ()
    extends typings.titanium.Titanium.UI.TabGroup
  
  /**
    * A button bar that maintains a selected state.
    */
  @JSGlobal("Titanium.UI.TabbedBar")
  @js.native
  class TabbedBar ()
    extends typings.titanium.Titanium.UI.TabbedBar
  
  /**
    * A table view is used to present information, organized in sections and rows, in a
    * vertically-scrolling view.
    */
  @JSGlobal("Titanium.UI.TableView")
  @js.native
  class TableView ()
    extends typings.titanium.Titanium.UI.TableView
  
  /**
    * A table view row is an individual item in a table, organized into table view sections.
    */
  @JSGlobal("Titanium.UI.TableViewRow")
  @js.native
  class TableViewRow ()
    extends typings.titanium.Titanium.UI.TableViewRow
  
  /**
    * A table view section is a container within a table used to organize table view rows.
    */
  @JSGlobal("Titanium.UI.TableViewSection")
  @js.native
  class TableViewSection ()
    extends typings.titanium.Titanium.UI.TableViewSection
  
  /**
    * A multiline text field that supports editing and scrolling.
    */
  @JSGlobal("Titanium.UI.TextArea")
  @js.native
  class TextArea ()
    extends typings.titanium.Titanium.UI.TextArea
  
  /**
    * A single line text field.
    */
  @JSGlobal("Titanium.UI.TextField")
  @js.native
  class TextField ()
    extends typings.titanium.Titanium.UI.TextField
  
  /**
    * A Toolbar can contain buttons, as well as certain other widgets, including text fields and labels.
    */
  @JSGlobal("Titanium.UI.Toolbar")
  @js.native
  class Toolbar ()
    extends typings.titanium.Titanium.UI.Toolbar
  
  /**
    * Unit constant representing units in centimeters.
    */
  @JSGlobal("Titanium.UI.UNIT_CM")
  @js.native
  val UNIT_CM: String = js.native
  
  /**
    * Unit constant representing units in density-independent pixels.
    */
  @JSGlobal("Titanium.UI.UNIT_DIP")
  @js.native
  val UNIT_DIP: String = js.native
  
  /**
    * Unit constant representing units in inches.
    */
  @JSGlobal("Titanium.UI.UNIT_IN")
  @js.native
  val UNIT_IN: String = js.native
  
  /**
    * Unit constant representing units in millimeters.
    */
  @JSGlobal("Titanium.UI.UNIT_MM")
  @js.native
  val UNIT_MM: String = js.native
  
  /**
    * Unit constant representing units in pixels.
    */
  @JSGlobal("Titanium.UI.UNIT_PX")
  @js.native
  val UNIT_PX: String = js.native
  
  /**
    * Orientation constant representing an unknown orientation.
    */
  @JSGlobal("Titanium.UI.UNKNOWN")
  @js.native
  val UNKNOWN: Double = js.native
  
  /**
    * Orientation constant for inverted portait orientation.
    */
  @JSGlobal("Titanium.UI.UPSIDE_PORTRAIT")
  @js.native
  val UPSIDE_PORTRAIT: Double = js.native
  
  /**
    * Authentication error code reported via <Titanium.UI.WebView.error>.
    */
  @JSGlobal("Titanium.UI.URL_ERROR_AUTHENTICATION")
  @js.native
  val URL_ERROR_AUTHENTICATION: Double = js.native
  
  /**
    * Bad url error code reported via <Titanium.UI.WebView.error>.
    */
  @JSGlobal("Titanium.UI.URL_ERROR_BAD_URL")
  @js.native
  val URL_ERROR_BAD_URL: Double = js.native
  
  /**
    * Error code reported via <Titanium.UI.WebView.error> for a failure to connect to host.
    */
  @JSGlobal("Titanium.UI.URL_ERROR_CONNECT")
  @js.native
  val URL_ERROR_CONNECT: Double = js.native
  
  /**
    * Error code reported via <Titanium.UI.WebView.error> for a failure to access a file resource on a host, except "file not found", which has its own constant.
    */
  @JSGlobal("Titanium.UI.URL_ERROR_FILE")
  @js.native
  val URL_ERROR_FILE: Double = js.native
  
  /**
    * Error code reported via <Titanium.UI.WebView.error> when a requested file does not exist on the host.
    */
  @JSGlobal("Titanium.UI.URL_ERROR_FILE_NOT_FOUND")
  @js.native
  val URL_ERROR_FILE_NOT_FOUND: Double = js.native
  
  /**
    * Error code reported via <Titanium.UI.WebView.error> when a host name cannot be resolved, such as via a DNS lookup error.
    */
  @JSGlobal("Titanium.UI.URL_ERROR_HOST_LOOKUP")
  @js.native
  val URL_ERROR_HOST_LOOKUP: Double = js.native
  
  /**
    * Error code reported via <Titanium.UI.WebView.error> when a redirect loop is detected.
    */
  @JSGlobal("Titanium.UI.URL_ERROR_REDIRECT_LOOP")
  @js.native
  val URL_ERROR_REDIRECT_LOOP: Double = js.native
  
  /**
    * Error code reported via <Titanium.UI.WebView.error> for an SSL failure.
    */
  @JSGlobal("Titanium.UI.URL_ERROR_SSL_FAILED")
  @js.native
  val URL_ERROR_SSL_FAILED: Double = js.native
  
  /**
    * Error code reported via <Titanium.UI.WebView.error> when a timeout occurs.
    */
  @JSGlobal("Titanium.UI.URL_ERROR_TIMEOUT")
  @js.native
  val URL_ERROR_TIMEOUT: Double = js.native
  
  /**
    * Error code reported via <Titanium.UI.WebView.error> when an unknown error occurs.
    */
  @JSGlobal("Titanium.UI.URL_ERROR_UNKNOWN")
  @js.native
  val URL_ERROR_UNKNOWN: Double = js.native
  
  /**
    * Error code reported via <Titanium.UI.WebView.error> when a url contains an unsupported scheme.
    */
  @JSGlobal("Titanium.UI.URL_ERROR_UNSUPPORTED_SCHEME")
  @js.native
  val URL_ERROR_UNSUPPORTED_SCHEME: Double = js.native
  
  /**
    * A dark interface style.
    */
  @JSGlobal("Titanium.UI.USER_INTERFACE_STYLE_DARK")
  @js.native
  val USER_INTERFACE_STYLE_DARK: Double = js.native
  
  /**
    * A light interface style.
    */
  @JSGlobal("Titanium.UI.USER_INTERFACE_STYLE_LIGHT")
  @js.native
  val USER_INTERFACE_STYLE_LIGHT: Double = js.native
  
  /**
    * An unspecified interface style.
    */
  @JSGlobal("Titanium.UI.USER_INTERFACE_STYLE_UNSPECIFIED")
  @js.native
  val USER_INTERFACE_STYLE_UNSPECIFIED: Double = js.native
  
  /**
    * An empty drawing surface or container
    */
  @JSGlobal("Titanium.UI.View")
  @js.native
  class View ()
    extends typings.titanium.Titanium.UI.View
  
  /**
    * The web view allows you to open an HTML5 based view which can load either local or remote content.
    */
  @JSGlobal("Titanium.UI.WebView")
  @js.native
  class WebView ()
    extends typings.titanium.Titanium.UI.WebView
  
  /**
    * The Window is an empty drawing surface or container.
    */
  @JSGlobal("Titanium.UI.Window")
  @js.native
  class Window ()
    extends typings.titanium.Titanium.UI.Window
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.UI.addEventListener")
  @js.native
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.UI.addEventListener")
  @js.native
  def addEventListener_userinterfacestyle(
    name: userinterfacestyle,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.UI, /* event */ UIUserinterfacestyleEvent, Unit]
  ): Unit = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  /* static member */
  @JSGlobal("Titanium.UI.apiName")
  @js.native
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.UI.applyProperties")
  @js.native
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Sets the background color of the master view (when there are no windows or other top-level
    * controls displayed).
    */
  /* static member */
  @JSGlobal("Titanium.UI.backgroundColor")
  @js.native
  def backgroundColor: String | typings.titanium.Titanium.UI.Color = js.native
  @scala.inline
  def backgroundColor_=(x: String | typings.titanium.Titanium.UI.Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(x.asInstanceOf[js.Any])
  
  /**
    * Local path or URL to an image file for setting a background for the master view (when there
    * are no windows or other top-level controls displayed).
    */
  /* static member */
  @JSGlobal("Titanium.UI.backgroundImage")
  @js.native
  def backgroundImage: String = js.native
  @scala.inline
  def backgroundImage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backgroundImage")(x.asInstanceOf[js.Any])
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  /* static member */
  @JSGlobal("Titanium.UI.bubbleParent")
  @js.native
  def bubbleParent: Boolean = js.native
  @scala.inline
  def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
  
  /**
    * Converts one type of unit to another using the metrics of the main display.
    */
  /* static member */
  @JSGlobal("Titanium.UI.convertUnits")
  @js.native
  def convertUnits(convertFromValue: String, convertToUnits: Double): Double = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.2DMatrix>.
    * @deprecated Use [Titanium.UI.createMatrix2D](Titanium.UI.createMatrix2D) instead.
    */
  /* static member */
  @JSGlobal("Titanium.UI.create2DMatrix")
  @js.native
  def create2DMatrix(): typings.titanium.Titanium.UI.Matrix2D = js.native
  @JSGlobal("Titanium.UI.create2DMatrix")
  @js.native
  def create2DMatrix(parameters: Matrix2DCreationDict): typings.titanium.Titanium.UI.Matrix2D = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.3DMatrix>.
    * @deprecated Use [Titanium.UI.createMatrix3D](Titanium.UI.createMatrix3D) instead.
    */
  /* static member */
  @JSGlobal("Titanium.UI.create3DMatrix")
  @js.native
  def create3DMatrix(): typings.titanium.Titanium.UI.Matrix3D = js.native
  @JSGlobal("Titanium.UI.create3DMatrix")
  @js.native
  def create3DMatrix(parameters: Matrix3DCreationDict): typings.titanium.Titanium.UI.Matrix3D = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.ActivityIndicator>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createActivityIndicator")
  @js.native
  def createActivityIndicator(): typings.titanium.Titanium.UI.ActivityIndicator = js.native
  @JSGlobal("Titanium.UI.createActivityIndicator")
  @js.native
  def createActivityIndicator(parameters: Dictionary[typings.titanium.Titanium.UI.ActivityIndicator]): typings.titanium.Titanium.UI.ActivityIndicator = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.AlertDialog>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createAlertDialog")
  @js.native
  def createAlertDialog(): typings.titanium.Titanium.UI.AlertDialog = js.native
  @JSGlobal("Titanium.UI.createAlertDialog")
  @js.native
  def createAlertDialog(parameters: Dictionary[typings.titanium.Titanium.UI.AlertDialog]): typings.titanium.Titanium.UI.AlertDialog = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.Animation>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createAnimation")
  @js.native
  def createAnimation(): typings.titanium.Titanium.UI.Animation = js.native
  @JSGlobal("Titanium.UI.createAnimation")
  @js.native
  def createAnimation(parameters: Dictionary[typings.titanium.Titanium.UI.Animation]): typings.titanium.Titanium.UI.Animation = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.AttributedString>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createAttributedString")
  @js.native
  def createAttributedString(): typings.titanium.Titanium.UI.AttributedString = js.native
  @JSGlobal("Titanium.UI.createAttributedString")
  @js.native
  def createAttributedString(parameters: Dictionary[typings.titanium.Titanium.UI.AttributedString]): typings.titanium.Titanium.UI.AttributedString = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.Button>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createButton")
  @js.native
  def createButton(): typings.titanium.Titanium.UI.Button = js.native
  @JSGlobal("Titanium.UI.createButton")
  @js.native
  def createButton(parameters: Dictionary[typings.titanium.Titanium.UI.Button]): typings.titanium.Titanium.UI.Button = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.ButtonBar>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createButtonBar")
  @js.native
  def createButtonBar(): typings.titanium.Titanium.UI.ButtonBar = js.native
  @JSGlobal("Titanium.UI.createButtonBar")
  @js.native
  def createButtonBar(parameters: Dictionary[typings.titanium.Titanium.UI.ButtonBar]): typings.titanium.Titanium.UI.ButtonBar = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.Color>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createColor")
  @js.native
  def createColor(): typings.titanium.Titanium.UI.Color = js.native
  @JSGlobal("Titanium.UI.createColor")
  @js.native
  def createColor(parameters: Dictionary[typings.titanium.Titanium.UI.Color]): typings.titanium.Titanium.UI.Color = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.CoverFlowView>.
    * @deprecated Use [Titanium.UI.iOS.CoverFlowView](Titanium.UI.iOS.CoverFlowView) instead.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createCoverFlowView")
  @js.native
  def createCoverFlowView: scala.Nothing = js.native
  @scala.inline
  def createCoverFlowView_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createCoverFlowView")(x.asInstanceOf[js.Any])
  
  /**
    * Creates and returns an instance of <Titanium.UI.DashboardItem>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createDashboardItem")
  @js.native
  def createDashboardItem(): typings.titanium.Titanium.UI.DashboardItem = js.native
  @JSGlobal("Titanium.UI.createDashboardItem")
  @js.native
  def createDashboardItem(parameters: Dictionary[typings.titanium.Titanium.UI.DashboardItem]): typings.titanium.Titanium.UI.DashboardItem = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.DashboardView>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createDashboardView")
  @js.native
  def createDashboardView(): typings.titanium.Titanium.UI.DashboardView = js.native
  @JSGlobal("Titanium.UI.createDashboardView")
  @js.native
  def createDashboardView(parameters: Dictionary[typings.titanium.Titanium.UI.DashboardView]): typings.titanium.Titanium.UI.DashboardView = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.EmailDialog>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createEmailDialog")
  @js.native
  def createEmailDialog(): typings.titanium.Titanium.UI.EmailDialog = js.native
  @JSGlobal("Titanium.UI.createEmailDialog")
  @js.native
  def createEmailDialog(parameters: Dictionary[typings.titanium.Titanium.UI.EmailDialog]): typings.titanium.Titanium.UI.EmailDialog = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.ImageView>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createImageView")
  @js.native
  def createImageView(): typings.titanium.Titanium.UI.ImageView = js.native
  @JSGlobal("Titanium.UI.createImageView")
  @js.native
  def createImageView(parameters: Dictionary[typings.titanium.Titanium.UI.ImageView]): typings.titanium.Titanium.UI.ImageView = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.Label>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createLabel")
  @js.native
  def createLabel(): typings.titanium.Titanium.UI.Label = js.native
  @JSGlobal("Titanium.UI.createLabel")
  @js.native
  def createLabel(parameters: Dictionary[typings.titanium.Titanium.UI.Label]): typings.titanium.Titanium.UI.Label = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.ListSection>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createListSection")
  @js.native
  def createListSection(): typings.titanium.Titanium.UI.ListSection = js.native
  @JSGlobal("Titanium.UI.createListSection")
  @js.native
  def createListSection(parameters: Dictionary[typings.titanium.Titanium.UI.ListSection]): typings.titanium.Titanium.UI.ListSection = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.ListView>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createListView")
  @js.native
  def createListView(): typings.titanium.Titanium.UI.ListView = js.native
  @JSGlobal("Titanium.UI.createListView")
  @js.native
  def createListView(parameters: Dictionary[typings.titanium.Titanium.UI.ListView]): typings.titanium.Titanium.UI.ListView = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.MaskedImage>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createMaskedImage")
  @js.native
  def createMaskedImage(): typings.titanium.Titanium.UI.MaskedImage = js.native
  @JSGlobal("Titanium.UI.createMaskedImage")
  @js.native
  def createMaskedImage(parameters: Dictionary[typings.titanium.Titanium.UI.MaskedImage]): typings.titanium.Titanium.UI.MaskedImage = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.Matrix2D>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createMatrix2D")
  @js.native
  def createMatrix2D(): typings.titanium.Titanium.UI.Matrix2D = js.native
  @JSGlobal("Titanium.UI.createMatrix2D")
  @js.native
  def createMatrix2D(parameters: Matrix2DCreationDict): typings.titanium.Titanium.UI.Matrix2D = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.Matrix3D>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createMatrix3D")
  @js.native
  def createMatrix3D(): typings.titanium.Titanium.UI.Matrix3D = js.native
  @JSGlobal("Titanium.UI.createMatrix3D")
  @js.native
  def createMatrix3D(parameters: Matrix3DCreationDict): typings.titanium.Titanium.UI.Matrix3D = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.NavigationWindow>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createNavigationWindow")
  @js.native
  def createNavigationWindow(): typings.titanium.Titanium.UI.NavigationWindow = js.native
  @JSGlobal("Titanium.UI.createNavigationWindow")
  @js.native
  def createNavigationWindow(parameters: Dictionary[typings.titanium.Titanium.UI.NavigationWindow]): typings.titanium.Titanium.UI.NavigationWindow = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.Notification>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createNotification")
  @js.native
  def createNotification(): typings.titanium.Titanium.UI.Notification = js.native
  @JSGlobal("Titanium.UI.createNotification")
  @js.native
  def createNotification(parameters: Dictionary[typings.titanium.Titanium.UI.Notification]): typings.titanium.Titanium.UI.Notification = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.OptionDialog>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createOptionDialog")
  @js.native
  def createOptionDialog(): typings.titanium.Titanium.UI.OptionDialog = js.native
  @JSGlobal("Titanium.UI.createOptionDialog")
  @js.native
  def createOptionDialog(parameters: Dictionary[typings.titanium.Titanium.UI.OptionDialog]): typings.titanium.Titanium.UI.OptionDialog = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.Picker>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createPicker")
  @js.native
  def createPicker(): typings.titanium.Titanium.UI.Picker = js.native
  @JSGlobal("Titanium.UI.createPicker")
  @js.native
  def createPicker(parameters: Dictionary[typings.titanium.Titanium.UI.Picker]): typings.titanium.Titanium.UI.Picker = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.PickerColumn>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createPickerColumn")
  @js.native
  def createPickerColumn(): typings.titanium.Titanium.UI.PickerColumn = js.native
  @JSGlobal("Titanium.UI.createPickerColumn")
  @js.native
  def createPickerColumn(parameters: Dictionary[typings.titanium.Titanium.UI.PickerColumn]): typings.titanium.Titanium.UI.PickerColumn = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.PickerRow>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createPickerRow")
  @js.native
  def createPickerRow(): typings.titanium.Titanium.UI.PickerRow = js.native
  @JSGlobal("Titanium.UI.createPickerRow")
  @js.native
  def createPickerRow(parameters: Dictionary[typings.titanium.Titanium.UI.PickerRow]): typings.titanium.Titanium.UI.PickerRow = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.ProgressBar>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createProgressBar")
  @js.native
  def createProgressBar(): typings.titanium.Titanium.UI.ProgressBar = js.native
  @JSGlobal("Titanium.UI.createProgressBar")
  @js.native
  def createProgressBar(parameters: Dictionary[typings.titanium.Titanium.UI.ProgressBar]): typings.titanium.Titanium.UI.ProgressBar = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.RefreshControl>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createRefreshControl")
  @js.native
  def createRefreshControl(): typings.titanium.Titanium.UI.RefreshControl = js.native
  @JSGlobal("Titanium.UI.createRefreshControl")
  @js.native
  def createRefreshControl(parameters: Dictionary[typings.titanium.Titanium.UI.RefreshControl]): typings.titanium.Titanium.UI.RefreshControl = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.ScrollView>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createScrollView")
  @js.native
  def createScrollView(): typings.titanium.Titanium.UI.ScrollView = js.native
  @JSGlobal("Titanium.UI.createScrollView")
  @js.native
  def createScrollView(parameters: Dictionary[typings.titanium.Titanium.UI.ScrollView]): typings.titanium.Titanium.UI.ScrollView = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.ScrollableView>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createScrollableView")
  @js.native
  def createScrollableView(): typings.titanium.Titanium.UI.ScrollableView = js.native
  @JSGlobal("Titanium.UI.createScrollableView")
  @js.native
  def createScrollableView(parameters: Dictionary[typings.titanium.Titanium.UI.ScrollableView]): typings.titanium.Titanium.UI.ScrollableView = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.SearchBar>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createSearchBar")
  @js.native
  def createSearchBar(): typings.titanium.Titanium.UI.SearchBar = js.native
  @JSGlobal("Titanium.UI.createSearchBar")
  @js.native
  def createSearchBar(parameters: Dictionary[typings.titanium.Titanium.UI.SearchBar]): typings.titanium.Titanium.UI.SearchBar = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.Shortcut>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createShortcut")
  @js.native
  def createShortcut(): typings.titanium.Titanium.UI.Shortcut = js.native
  @JSGlobal("Titanium.UI.createShortcut")
  @js.native
  def createShortcut(parameters: Dictionary[typings.titanium.Titanium.UI.Shortcut]): typings.titanium.Titanium.UI.Shortcut = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.ShortcutItem>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createShortcutItem")
  @js.native
  def createShortcutItem(): typings.titanium.Titanium.UI.ShortcutItem = js.native
  @JSGlobal("Titanium.UI.createShortcutItem")
  @js.native
  def createShortcutItem(parameters: Dictionary[typings.titanium.Titanium.UI.ShortcutItem]): typings.titanium.Titanium.UI.ShortcutItem = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.Slider>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createSlider")
  @js.native
  def createSlider(): typings.titanium.Titanium.UI.Slider = js.native
  @JSGlobal("Titanium.UI.createSlider")
  @js.native
  def createSlider(parameters: Dictionary[typings.titanium.Titanium.UI.Slider]): typings.titanium.Titanium.UI.Slider = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.Switch>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createSwitch")
  @js.native
  def createSwitch(): typings.titanium.Titanium.UI.Switch = js.native
  @JSGlobal("Titanium.UI.createSwitch")
  @js.native
  def createSwitch(parameters: Dictionary[typings.titanium.Titanium.UI.Switch]): typings.titanium.Titanium.UI.Switch = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.Tab>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createTab")
  @js.native
  def createTab(): typings.titanium.Titanium.UI.Tab = js.native
  @JSGlobal("Titanium.UI.createTab")
  @js.native
  def createTab(parameters: Dictionary[typings.titanium.Titanium.UI.Tab]): typings.titanium.Titanium.UI.Tab = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.TabGroup>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createTabGroup")
  @js.native
  def createTabGroup(): typings.titanium.Titanium.UI.TabGroup = js.native
  @JSGlobal("Titanium.UI.createTabGroup")
  @js.native
  def createTabGroup(parameters: Dictionary[typings.titanium.Titanium.UI.TabGroup]): typings.titanium.Titanium.UI.TabGroup = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.TabbedBar>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createTabbedBar")
  @js.native
  def createTabbedBar(): typings.titanium.Titanium.UI.TabbedBar = js.native
  @JSGlobal("Titanium.UI.createTabbedBar")
  @js.native
  def createTabbedBar(parameters: Dictionary[typings.titanium.Titanium.UI.TabbedBar]): typings.titanium.Titanium.UI.TabbedBar = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.TableView>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createTableView")
  @js.native
  def createTableView(): typings.titanium.Titanium.UI.TableView = js.native
  @JSGlobal("Titanium.UI.createTableView")
  @js.native
  def createTableView(parameters: Dictionary[typings.titanium.Titanium.UI.TableView]): typings.titanium.Titanium.UI.TableView = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.TableViewRow>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createTableViewRow")
  @js.native
  def createTableViewRow(): typings.titanium.Titanium.UI.TableViewRow = js.native
  @JSGlobal("Titanium.UI.createTableViewRow")
  @js.native
  def createTableViewRow(parameters: Dictionary[typings.titanium.Titanium.UI.TableViewRow]): typings.titanium.Titanium.UI.TableViewRow = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.TableViewSection>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createTableViewSection")
  @js.native
  def createTableViewSection(): typings.titanium.Titanium.UI.TableViewSection = js.native
  @JSGlobal("Titanium.UI.createTableViewSection")
  @js.native
  def createTableViewSection(parameters: Dictionary[typings.titanium.Titanium.UI.TableViewSection]): typings.titanium.Titanium.UI.TableViewSection = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.TextArea>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createTextArea")
  @js.native
  def createTextArea(): typings.titanium.Titanium.UI.TextArea = js.native
  @JSGlobal("Titanium.UI.createTextArea")
  @js.native
  def createTextArea(parameters: Dictionary[typings.titanium.Titanium.UI.TextArea]): typings.titanium.Titanium.UI.TextArea = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.TextField>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createTextField")
  @js.native
  def createTextField(): typings.titanium.Titanium.UI.TextField = js.native
  @JSGlobal("Titanium.UI.createTextField")
  @js.native
  def createTextField(parameters: Dictionary[typings.titanium.Titanium.UI.TextField]): typings.titanium.Titanium.UI.TextField = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.Toolbar>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createToolbar")
  @js.native
  def createToolbar(): typings.titanium.Titanium.UI.Toolbar = js.native
  @JSGlobal("Titanium.UI.createToolbar")
  @js.native
  def createToolbar(parameters: Dictionary[typings.titanium.Titanium.UI.Toolbar]): typings.titanium.Titanium.UI.Toolbar = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.View>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createView")
  @js.native
  def createView(): typings.titanium.Titanium.UI.View = js.native
  @JSGlobal("Titanium.UI.createView")
  @js.native
  def createView(parameters: Dictionary[typings.titanium.Titanium.UI.View]): typings.titanium.Titanium.UI.View = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.WebView>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createWebView")
  @js.native
  def createWebView(): typings.titanium.Titanium.UI.WebView = js.native
  @JSGlobal("Titanium.UI.createWebView")
  @js.native
  def createWebView(parameters: Dictionary[typings.titanium.Titanium.UI.WebView]): typings.titanium.Titanium.UI.WebView = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.Window>.
    */
  /* static member */
  @JSGlobal("Titanium.UI.createWindow")
  @js.native
  def createWindow(): typings.titanium.Titanium.UI.Window = js.native
  @JSGlobal("Titanium.UI.createWindow")
  @js.native
  def createWindow(parameters: Dictionary[typings.titanium.Titanium.UI.Window]): typings.titanium.Titanium.UI.Window = js.native
  
  /**
    * The currently active tab, if a tab group is open.
    * @deprecated
    */
  /* static member */
  @JSGlobal("Titanium.UI.currentTab")
  @js.native
  def currentTab: scala.Nothing = js.native
  @scala.inline
  def currentTab_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentTab")(x.asInstanceOf[js.Any])
  
  /**
    * The active window associated with the executing JavaScript context.
    * @deprecated
    */
  /* static member */
  @JSGlobal("Titanium.UI.currentWindow")
  @js.native
  val currentWindow: scala.Nothing = js.native
  
  /**
    * Fetches the correct color to be used with a UI element dependent on the users current dark mode setting on iOS 13 and above, or the [Titanium.UI.semanticColorType](Titanium.UI.semanticColorType) setting in other instances.
    * Will return a valid string value to be used for color properties on Android. This may be a hex string or an `rgba()` function.
    */
  /* static member */
  @JSGlobal("Titanium.UI.fetchSemanticColor")
  @js.native
  def fetchSemanticColor(colorName: String): typings.titanium.Titanium.UI.Color | String = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.UI.fireEvent")
  @js.native
  def fireEvent(name: String): Unit = js.native
  @JSGlobal("Titanium.UI.fireEvent")
  @js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.UI.fireEvent")
  @js.native
  def fireEvent_userinterfacestyle(name: userinterfacestyle): Unit = js.native
  @JSGlobal("Titanium.UI.fireEvent")
  @js.native
  def fireEvent_userinterfacestyle(name: userinterfacestyle, event: UIUserinterfacestyleEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.UI.apiName> property.
    * @deprecated Access <Titanium.UI.apiName> instead.
    */
  /* static member */
  @JSGlobal("Titanium.UI.getApiName")
  @js.native
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.backgroundColor> property.
    * @deprecated Access <Titanium.UI.backgroundColor> instead.
    */
  /* static member */
  @JSGlobal("Titanium.UI.getBackgroundColor")
  @js.native
  def getBackgroundColor(): String | typings.titanium.Titanium.UI.Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.backgroundImage> property.
    * @deprecated Access <Titanium.UI.backgroundImage> instead.
    */
  /* static member */
  @JSGlobal("Titanium.UI.getBackgroundImage")
  @js.native
  def getBackgroundImage(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.bubbleParent> property.
    * @deprecated Access <Titanium.UI.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.UI.getBubbleParent")
  @js.native
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.currentTab> property.
    * @deprecated
    */
  /* static member */
  @JSGlobal("Titanium.UI.getCurrentTab")
  @js.native
  def getCurrentTab: scala.Nothing = js.native
  @scala.inline
  def getCurrentTab_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getCurrentTab")(x.asInstanceOf[js.Any])
  
  /**
    * Gets the value of the <Titanium.UI.currentWindow> property.
    * @deprecated
    */
  /* static member */
  @JSGlobal("Titanium.UI.getCurrentWindow")
  @js.native
  def getCurrentWindow: scala.Nothing = js.native
  @scala.inline
  def getCurrentWindow_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getCurrentWindow")(x.asInstanceOf[js.Any])
  
  /**
    * Gets the value of the <Titanium.UI.lifecycleContainer> property.
    * @deprecated Access <Titanium.UI.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.UI.getLifecycleContainer")
  @js.native
  def getLifecycleContainer(): typings.titanium.Titanium.UI.Window | typings.titanium.Titanium.UI.TabGroup = js.native
  
  /**
    * Gets the value of the <Titanium.UI.orientation> property.
    * @deprecated Use [Titanium.UI.Window.orientationModes](Titanium.UI.Window.orientationModes) instead.
    */
  /* static member */
  @JSGlobal("Titanium.UI.getOrientation")
  @js.native
  def getOrientation: scala.Nothing = js.native
  @scala.inline
  def getOrientation_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrientation")(x.asInstanceOf[js.Any])
  
  /**
    * Gets the value of the <Titanium.UI.semanticColorType> property.
    * @deprecated Use [userInterfaceStyle](Titanium.UI.userInterfaceStyle) instead.
    */
  /* static member */
  @JSGlobal("Titanium.UI.getSemanticColorType")
  @js.native
  def getSemanticColorType(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.tintColor> property.
    * @deprecated Access <Titanium.UI.tintColor> instead.
    */
  /* static member */
  @JSGlobal("Titanium.UI.getTintColor")
  @js.native
  def getTintColor(): String | typings.titanium.Titanium.UI.Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.userInterfaceStyle> property.
    * @deprecated Access <Titanium.UI.userInterfaceStyle> instead.
    */
  /* static member */
  @JSGlobal("Titanium.UI.getUserInterfaceStyle")
  @js.native
  def getUserInterfaceStyle(): Double = js.native
  
  /**
    * Apple iOS specific UI capabilities.  All properties, methods and events in this namespace will
    * only work on Apple iOS devices.
    */
  @JSGlobal("Titanium.UI.iOS")
  @js.native
  class iOS ()
    extends typings.titanium.Titanium.Proxy
  /**
    * Apple iOS specific UI capabilities.  All properties, methods and events in this namespace will
    * only work on Apple iOS devices.
    */
  object iOS {
    
    @JSGlobal("Titanium.UI.iOS")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Allow the navigation to continue.
      */
    @JSGlobal("Titanium.UI.iOS.ACTION_POLICY_ALLOW")
    @js.native
    val ACTION_POLICY_ALLOW: Double = js.native
    
    /**
      * Cancel the navigation.
      */
    @JSGlobal("Titanium.UI.iOS.ACTION_POLICY_CANCEL")
    @js.native
    val ACTION_POLICY_CANCEL: Double = js.native
    
    /**
      * Use with [AdView.adSize](Titanium.UI.iOS.AdView.adSize) to specify a banner ad size
      * appropriate for landscape orientations.
      */
    @JSGlobal("Titanium.UI.iOS.AD_SIZE_LANDSCAPE")
    @js.native
    val AD_SIZE_LANDSCAPE: String = js.native
    
    /**
      * Use with [AdView.adSize](Titanium.UI.iOS.AdView.adSize) to specify a banner ad size
      * appropriate for portrait orientations.
      */
    @JSGlobal("Titanium.UI.iOS.AD_SIZE_PORTRAIT")
    @js.native
    val AD_SIZE_PORTRAIT: String = js.native
    
    /**
      * Use with [Animation.curve](Titanium.UI.Animation.curve) to specify an animation that starts
      * slowly and speeds up.
      * @deprecated Use [Titanium.UI.ANIMATION_CURVE_EASE_IN](Titanium.UI.ANIMATION_CURVE_EASE_IN) instead.
      */
    @JSGlobal("Titanium.UI.iOS.ANIMATION_CURVE_EASE_IN")
    @js.native
    val ANIMATION_CURVE_EASE_IN: scala.Nothing = js.native
    
    /**
      * Use with [Animation.curve](Titanium.UI.Animation.curve) to specify an animation that starts
      * slowly, and speeds up, then slows down at the end of the animation.
      * @deprecated Use [Titanium.UI.ANIMATION_CURVE_EASE_IN_OUT](Titanium.UI.ANIMATION_CURVE_EASE_IN_OUT) instead.
      */
    @JSGlobal("Titanium.UI.iOS.ANIMATION_CURVE_EASE_IN_OUT")
    @js.native
    val ANIMATION_CURVE_EASE_IN_OUT: scala.Nothing = js.native
    
    /**
      * Use with [Animation.curve](Titanium.UI.Animation.curve) to specify an animation that starts
      * quickly, then slows down at the end of the animation.
      * @deprecated Use [Titanium.UI.ANIMATION_CURVE_EASE_OUT](Titanium.UI.ANIMATION_CURVE_EASE_OUT) instead.
      */
    @JSGlobal("Titanium.UI.iOS.ANIMATION_CURVE_EASE_OUT")
    @js.native
    val ANIMATION_CURVE_EASE_OUT: scala.Nothing = js.native
    
    /**
      * Use with [Animation.curve](Titanium.UI.Animation.curve) to specify an animation that proceeds
      * at a constant rate.
      * @deprecated Use [Titanium.UI.ANIMATION_CURVE_LINEAR](Titanium.UI.ANIMATION_CURVE_LINEAR) instead.
      */
    @JSGlobal("Titanium.UI.iOS.ANIMATION_CURVE_LINEAR")
    @js.native
    val ANIMATION_CURVE_LINEAR: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.type> to specify a background color.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_BACKGROUND_COLOR](Titanium.UI.ATTRIBUTE_BACKGROUND_COLOR) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_BACKGROUND_COLOR")
    @js.native
    val ATTRIBUTE_BACKGROUND_COLOR: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.type> to apply a different baseline to the text.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_BASELINE_OFFSET](Titanium.UI.ATTRIBUTE_BASELINE_OFFSET) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_BASELINE_OFFSET")
    @js.native
    val ATTRIBUTE_BASELINE_OFFSET: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.type> to stretch the text horizontally.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_EXPANSION](Titanium.UI.ATTRIBUTE_EXPANSION) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_EXPANSION")
    @js.native
    val ATTRIBUTE_EXPANSION: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.type> to specify a font.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_FONT](Titanium.UI.ATTRIBUTE_FONT) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_FONT")
    @js.native
    val ATTRIBUTE_FONT: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.type> to specify a font color.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_FOREGROUND_COLOR](Titanium.UI.ATTRIBUTE_FOREGROUND_COLOR) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_FOREGROUND_COLOR")
    @js.native
    val ATTRIBUTE_FOREGROUND_COLOR: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.type> to specify kerning (space between characters).
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_KERN](Titanium.UI.ATTRIBUTE_KERN) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_KERN")
    @js.native
    val ATTRIBUTE_KERN: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.value> to use a letterpress text effect.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_LETTERPRESS_STYLE](Titanium.UI.ATTRIBUTE_LETTERPRESS_STYLE) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_LETTERPRESS_STYLE")
    @js.native
    val ATTRIBUTE_LETTERPRESS_STYLE: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.type> to enable or disable ligatures.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_LIGATURE](Titanium.UI.ATTRIBUTE_LIGATURE) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_LIGATURE")
    @js.native
    val ATTRIBUTE_LIGATURE: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.type> to create a link.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_LINK](Titanium.UI.ATTRIBUTE_LINK) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_LINK")
    @js.native
    val ATTRIBUTE_LINK: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.type> to skew the text.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_OBLIQUENESS](Titanium.UI.ATTRIBUTE_OBLIQUENESS) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_OBLIQUENESS")
    @js.native
    val ATTRIBUTE_OBLIQUENESS: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.type> to display a shadow behind the text.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_SHADOW](Titanium.UI.ATTRIBUTE_SHADOW) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_SHADOW")
    @js.native
    val ATTRIBUTE_SHADOW: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.type> to change the color of the horizontal line.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_STRIKETHROUGH_COLOR](Titanium.UI.ATTRIBUTE_STRIKETHROUGH_COLOR) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_STRIKETHROUGH_COLOR")
    @js.native
    val ATTRIBUTE_STRIKETHROUGH_COLOR: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.type> to place a horizontal line through the text.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_STRIKETHROUGH_STYLE](Titanium.UI.ATTRIBUTE_STRIKETHROUGH_STYLE) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_STRIKETHROUGH_STYLE")
    @js.native
    val ATTRIBUTE_STRIKETHROUGH_STYLE: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.type> to specify a color for the stroke text.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_STROKE_COLOR](Titanium.UI.ATTRIBUTE_STROKE_COLOR) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_STROKE_COLOR")
    @js.native
    val ATTRIBUTE_STROKE_COLOR: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.type> to specify the width of the stroke text.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_STROKE_WIDTH](Titanium.UI.ATTRIBUTE_STROKE_WIDTH) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_STROKE_WIDTH")
    @js.native
    val ATTRIBUTE_STROKE_WIDTH: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.type> to apply a text effect.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_TEXT_EFFECT](Titanium.UI.ATTRIBUTE_TEXT_EFFECT) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_TEXT_EFFECT")
    @js.native
    val ATTRIBUTE_TEXT_EFFECT: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.type> to place a horizontal line under the text.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_UNDERLINES_STYLE](Titanium.UI.ATTRIBUTE_UNDERLINES_STYLE) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_UNDERLINES_STYLE")
    @js.native
    val ATTRIBUTE_UNDERLINES_STYLE: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.value> to draw a line only underneath or through words.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_UNDERLINE_BY_WORD](Titanium.UI.ATTRIBUTE_UNDERLINE_BY_WORD) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_UNDERLINE_BY_WORD")
    @js.native
    val ATTRIBUTE_UNDERLINE_BY_WORD: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.type> to change the color of the horizontal line.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_UNDERLINE_COLOR](Titanium.UI.ATTRIBUTE_UNDERLINE_COLOR) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_UNDERLINE_COLOR")
    @js.native
    val ATTRIBUTE_UNDERLINE_COLOR: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.value> to draw a dashed line.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_UNDERLINE_PATTERN_DASH](Titanium.UI.ATTRIBUTE_UNDERLINE_PATTERN_DASH) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_UNDERLINE_PATTERN_DASH")
    @js.native
    val ATTRIBUTE_UNDERLINE_PATTERN_DASH: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.value> to draw an alternating line of dashes and dots.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_UNDERLINE_PATTERN_DASH_DOT](Titanium.UI.ATTRIBUTE_UNDERLINE_PATTERN_DASH_DOT) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_UNDERLINE_PATTERN_DASH_DOT")
    @js.native
    val ATTRIBUTE_UNDERLINE_PATTERN_DASH_DOT: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.value> to draw an alternating line of dashes and two dots.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_UNDERLINE_PATTERN_DASH_DOT_DOT](Titanium.UI.ATTRIBUTE_UNDERLINE_PATTERN_DASH_DOT_DOT) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_UNDERLINE_PATTERN_DASH_DOT_DOT")
    @js.native
    val ATTRIBUTE_UNDERLINE_PATTERN_DASH_DOT_DOT: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.value> to draw a dotted line.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_UNDERLINE_PATTERN_DOT](Titanium.UI.ATTRIBUTE_UNDERLINE_PATTERN_DOT) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_UNDERLINE_PATTERN_DOT")
    @js.native
    val ATTRIBUTE_UNDERLINE_PATTERN_DOT: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.value> to draw a solid line.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_UNDERLINE_PATTERN_SOLID](Titanium.UI.ATTRIBUTE_UNDERLINE_PATTERN_SOLID) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_UNDERLINE_PATTERN_SOLID")
    @js.native
    val ATTRIBUTE_UNDERLINE_PATTERN_SOLID: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.value> to draw a double line.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_UNDERLINE_STYLE_DOUBLE](Titanium.UI.ATTRIBUTE_UNDERLINE_STYLE_DOUBLE) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_UNDERLINE_STYLE_DOUBLE")
    @js.native
    val ATTRIBUTE_UNDERLINE_STYLE_DOUBLE: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.value> to not draw a line.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_UNDERLINE_STYLE_NONE](Titanium.UI.ATTRIBUTE_UNDERLINE_STYLE_NONE) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_UNDERLINE_STYLE_NONE")
    @js.native
    val ATTRIBUTE_UNDERLINE_STYLE_NONE: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.value> to draw a single line.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_UNDERLINE_STYLE_SINGLE](Titanium.UI.ATTRIBUTE_UNDERLINE_STYLE_SINGLE) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_UNDERLINE_STYLE_SINGLE")
    @js.native
    val ATTRIBUTE_UNDERLINE_STYLE_SINGLE: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.value> to draw a thick line.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_UNDERLINE_STYLE_THICK](Titanium.UI.ATTRIBUTE_UNDERLINE_STYLE_THICK) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_UNDERLINE_STYLE_THICK")
    @js.native
    val ATTRIBUTE_UNDERLINE_STYLE_THICK: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.type> to control the direction of the text.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_WRITING_DIRECTION](Titanium.UI.ATTRIBUTE_WRITING_DIRECTION) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_WRITING_DIRECTION")
    @js.native
    val ATTRIBUTE_WRITING_DIRECTION: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.value> to use the embedded text direction.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_WRITING_DIRECTION_EMBEDDING](Titanium.UI.ATTRIBUTE_WRITING_DIRECTION_EMBEDDING) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_WRITING_DIRECTION_EMBEDDING")
    @js.native
    val ATTRIBUTE_WRITING_DIRECTION_EMBEDDING: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.value> to write text left to right.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_WRITING_DIRECTION_LEFT_TO_RIGHT](Titanium.UI.ATTRIBUTE_WRITING_DIRECTION_LEFT_TO_RIGHT) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_WRITING_DIRECTION_LEFT_TO_RIGHT")
    @js.native
    val ATTRIBUTE_WRITING_DIRECTION_LEFT_TO_RIGHT: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.value> to use the
      * [Unicode Bidirection Algorithm rules P2 and P3](http://www.unicode.org/reports/tr9/#The_Paragraph_Level)
      * to determine which direction to use.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_WRITING_DIRECTION_NATURAL](Titanium.UI.ATTRIBUTE_WRITING_DIRECTION_NATURAL) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_WRITING_DIRECTION_NATURAL")
    @js.native
    val ATTRIBUTE_WRITING_DIRECTION_NATURAL: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.value> to override the text direction.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_WRITING_DIRECTION_OVERRIDE](Titanium.UI.ATTRIBUTE_WRITING_DIRECTION_OVERRIDE) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_WRITING_DIRECTION_OVERRIDE")
    @js.native
    val ATTRIBUTE_WRITING_DIRECTION_OVERRIDE: scala.Nothing = js.native
    
    /**
      * Use with <Attribute.value> to write text right to left.
      * @deprecated Use the [Titanium.UI.ATTRIBUTE_WRITING_DIRECTION_RIGHT_TO_LEFT](Titanium.UI.ATTRIBUTE_WRITING_DIRECTION_RIGHT_TO_LEFT) constant instead (without the iOS namespace).
      */
    @JSGlobal("Titanium.UI.iOS.ATTRIBUTE_WRITING_DIRECTION_RIGHT_TO_LEFT")
    @js.native
    val ATTRIBUTE_WRITING_DIRECTION_RIGHT_TO_LEFT: scala.Nothing = js.native
    
    /**
      * All media types require a user gesture to begin playing.
      */
    @JSGlobal("Titanium.UI.iOS.AUDIOVISUAL_MEDIA_TYPE_ALL")
    @js.native
    val AUDIOVISUAL_MEDIA_TYPE_ALL: Double = js.native
    
    /**
      * Media types containing audio require a user gesture to begin playing.
      */
    @JSGlobal("Titanium.UI.iOS.AUDIOVISUAL_MEDIA_TYPE_AUDIO")
    @js.native
    val AUDIOVISUAL_MEDIA_TYPE_AUDIO: Double = js.native
    
    /**
      * No media types require a user gesture to begin playing.
      */
    @JSGlobal("Titanium.UI.iOS.AUDIOVISUAL_MEDIA_TYPE_NONE")
    @js.native
    val AUDIOVISUAL_MEDIA_TYPE_NONE: Double = js.native
    
    /**
      * Media types containing video require a user gesture to begin playing.
      */
    @JSGlobal("Titanium.UI.iOS.AUDIOVISUAL_MEDIA_TYPE_VIDEO")
    @js.native
    val AUDIOVISUAL_MEDIA_TYPE_VIDEO: Double = js.native
    
    /**
      * Converts strings formatted as addresses into clickable links.
      * @deprecated Use [Titanium.UI.AUTOLINK_MAP_ADDRESSES](Titanium.UI.AUTOLINK_MAP_ADDRESSES) instead.
      */
    @JSGlobal("Titanium.UI.iOS.AUTODETECT_ADDRESS")
    @js.native
    val AUTODETECT_ADDRESS: scala.Nothing = js.native
    
    /**
      * Converts all detectable types of data into clickable links.
      * @deprecated Use [Titanium.UI.AUTOLINK_ALL](Titanium.UI.AUTOLINK_ALL) instead.
      */
    @JSGlobal("Titanium.UI.iOS.AUTODETECT_ALL")
    @js.native
    val AUTODETECT_ALL: scala.Nothing = js.native
    
    /**
      * Converts strings formatted as calendar events into clickable links.
      * @deprecated Use [Titanium.UI.AUTOLINK_CALENDAR](Titanium.UI.AUTOLINK_CALENDAR) instead.
      */
    @JSGlobal("Titanium.UI.iOS.AUTODETECT_CALENDAR")
    @js.native
    val AUTODETECT_CALENDAR: scala.Nothing = js.native
    
    /**
      * Converts strings formatted as URLs into clickable links.
      * @deprecated Use [Titanium.UI.AUTOLINK_URLS](Titanium.UI.AUTOLINK_URLS) instead.
      */
    @JSGlobal("Titanium.UI.iOS.AUTODETECT_LINK")
    @js.native
    val AUTODETECT_LINK: scala.Nothing = js.native
    
    /**
      * Disables converting strings into clickable links.
      * @deprecated Use [Titanium.UI.AUTOLINK_NONE](Titanium.UI.AUTOLINK_NONE) instead.
      */
    @JSGlobal("Titanium.UI.iOS.AUTODETECT_NONE")
    @js.native
    val AUTODETECT_NONE: scala.Nothing = js.native
    
    /**
      * Converts strings formatted as phone numbers into clickable links.
      * @deprecated Use [Titanium.UI.AUTOLINK_PHONE_NUMBERS](Titanium.UI.AUTOLINK_PHONE_NUMBERS) instead.
      */
    @JSGlobal("Titanium.UI.iOS.AUTODETECT_PHONE")
    @js.native
    val AUTODETECT_PHONE: scala.Nothing = js.native
    
    /**
      * The AdView is a view for display Apple iAds.
      * @deprecated iAd has been deprecated in iOS 10 and SDK 5.5.0. It was removed as part of the SDK 7.0.0.
      */
    @JSGlobal("Titanium.UI.iOS.AdView")
    @js.native
    val AdView: scala.Nothing = js.native
    
    /**
      * A set of constants for the style that can be used for the `style` property of
      * <Titanium.UI.AlertDialog>.
      */
    object AlertDialogStyle {
      
      /**
        * A standard alert dialog. This is the default value.
        */
      @JSGlobal("Titanium.UI.iOS.AlertDialogStyle.DEFAULT")
      @js.native
      val DEFAULT: Double = js.native
      
      /**
        * An alert dialog that allows the user to enter login identifier and password.
        */
      @JSGlobal("Titanium.UI.iOS.AlertDialogStyle.LOGIN_AND_PASSWORD_INPUT")
      @js.native
      val LOGIN_AND_PASSWORD_INPUT: Double = js.native
      
      /**
        * An alert dialog that allows the user to enter text.
        */
      @JSGlobal("Titanium.UI.iOS.AlertDialogStyle.PLAIN_TEXT_INPUT")
      @js.native
      val PLAIN_TEXT_INPUT: Double = js.native
      
      /**
        * An alert dialog that allows the user to enter text. The text field is obscured.
        */
      @JSGlobal("Titanium.UI.iOS.AlertDialogStyle.SECURE_TEXT_INPUT")
      @js.native
      val SECURE_TEXT_INPUT: Double = js.native
      
      /**
        * Adds the specified callback as an event listener for the named event.
        */
      @JSGlobal("Titanium.UI.iOS.AlertDialogStyle.addEventListener")
      @js.native
      def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
      
      /**
        * Fires a synthesized event to any registered listeners.
        */
      @JSGlobal("Titanium.UI.iOS.AlertDialogStyle.fireEvent")
      @js.native
      def fireEvent(name: String): Unit = js.native
      @JSGlobal("Titanium.UI.iOS.AlertDialogStyle.fireEvent")
      @js.native
      def fireEvent(name: String, event: js.Any): Unit = js.native
      
      /**
        * Removes the specified callback as an event listener for the named event.
        */
      @JSGlobal("Titanium.UI.iOS.AlertDialogStyle.removeEventListener")
      @js.native
      def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    }
    
    /**
      * Dynamic behavior to support connections between an anchor point and an item.
      */
    @JSGlobal("Titanium.UI.iOS.AnchorAttachmentBehavior")
    @js.native
    class AnchorAttachmentBehavior ()
      extends typings.titanium.Titanium.UI.iOS.AnchorAttachmentBehavior
    
    /**
      * A set of constants for the animation styles used for view transitions.
      * One of the group of animation style constants
      *   * [CURL_DOWN](Titanium.UI.iOS.AnimationStyle.CURL_DOWN)
      *   * [CURL_UP](Titanium.UI.iOS.AnimationStyle.CURL_UP)
      *   * [FLIP_FROM_LEFT](Titanium.UI.iOS.AnimationStyle.FLIP_FROM_LEFT)
      *   * [FLIP_FROM_RIGHT](Titanium.UI.iOS.AnimationStyle.FLIP_FROM_RIGHT)
      *   * [FLIP_FROM_TOP](Titanium.UI.iOS.AnimationStyle.FLIP_FROM_TOP)
      *   * [FLIP_FROM_BOTTOM](Titanium.UI.iOS.AnimationStyle.FLIP_FROM_BOTTOM)
      *   * [CROSS_DISSOLVE](Titanium.UI.iOS.AnimationStyle.CROSS_DISSOLVE)
      *   * [NONE](Titanium.UI.iOS.AnimationStyle.NONE)
      */
    object AnimationStyle {
      
      /**
        * A transition that dissolves from one view to the next.
        */
      @JSGlobal("Titanium.UI.iOS.AnimationStyle.CROSS_DISSOLVE")
      @js.native
      val CROSS_DISSOLVE: Double = js.native
      
      /**
        * Curl downwards during a transition animation.
        */
      @JSGlobal("Titanium.UI.iOS.AnimationStyle.CURL_DOWN")
      @js.native
      val CURL_DOWN: Double = js.native
      
      /**
        * Curl upwards during a transition animation.
        */
      @JSGlobal("Titanium.UI.iOS.AnimationStyle.CURL_UP")
      @js.native
      val CURL_UP: Double = js.native
      
      /**
        * Flip from bottom to top during a transition animation.
        */
      @JSGlobal("Titanium.UI.iOS.AnimationStyle.FLIP_FROM_BOTTOM")
      @js.native
      val FLIP_FROM_BOTTOM: Double = js.native
      
      /**
        * Flip from left to right during a transition animation.
        */
      @JSGlobal("Titanium.UI.iOS.AnimationStyle.FLIP_FROM_LEFT")
      @js.native
      val FLIP_FROM_LEFT: Double = js.native
      
      /**
        * Flip from right to left during a transition animation.
        */
      @JSGlobal("Titanium.UI.iOS.AnimationStyle.FLIP_FROM_RIGHT")
      @js.native
      val FLIP_FROM_RIGHT: Double = js.native
      
      /**
        * Flip from top to bottom during a transition animation.
        */
      @JSGlobal("Titanium.UI.iOS.AnimationStyle.FLIP_FROM_TOP")
      @js.native
      val FLIP_FROM_TOP: Double = js.native
      
      /**
        * No animation.
        */
      @JSGlobal("Titanium.UI.iOS.AnimationStyle.NONE")
      @js.native
      val NONE: Double = js.native
      
      /**
        * Adds the specified callback as an event listener for the named event.
        */
      @JSGlobal("Titanium.UI.iOS.AnimationStyle.addEventListener")
      @js.native
      def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
      
      /**
        * Fires a synthesized event to any registered listeners.
        */
      @JSGlobal("Titanium.UI.iOS.AnimationStyle.fireEvent")
      @js.native
      def fireEvent(name: String): Unit = js.native
      @JSGlobal("Titanium.UI.iOS.AnimationStyle.fireEvent")
      @js.native
      def fireEvent(name: String, event: js.Any): Unit = js.native
      
      /**
        * Removes the specified callback as an event listener for the named event.
        */
      @JSGlobal("Titanium.UI.iOS.AnimationStyle.removeEventListener")
      @js.native
      def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    }
    
    /**
      * Provides support for the built-in iOS dynamic animations
      */
    @JSGlobal("Titanium.UI.iOS.Animator")
    @js.native
    class Animator ()
      extends typings.titanium.Titanium.UI.iOS.Animator
    
    /**
      * The Home screen quick actions API is for adding shortcuts to your app icon that anticipate and accelerate a
      * user's interaction with your app.
      * @deprecated Use [Titanium.UI.Shortcut](Titanium.UI.Shortcut) instead.
      */
    @JSGlobal("Titanium.UI.iOS.ApplicationShortcuts")
    @js.native
    class ApplicationShortcuts ()
      extends typings.titanium.Titanium.UI.iOS.ApplicationShortcuts
    
    /**
      * An abstract datatype for specifying an attributed string attribute.
      * @deprecated Use [Attribute](Attribute) instead.
      */
    @JSGlobal("Titanium.UI.iOS.Attribute")
    @js.native
    val Attribute: scala.Nothing = js.native
    
    /**
      * An attributed string proxy manages character strings and associated sets of attributes (for example,
      * font and kerning) that apply to individual characters or ranges of characters in the string.
      * @deprecated Use [Titanium.UI.AttributedString](Titanium.UI.AttributedString) instead.
      */
    @JSGlobal("Titanium.UI.iOS.AttributedString")
    @js.native
    val AttributedString: scala.Nothing = js.native
    
    /**
      * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_CLEAR](Titanium.UI.BLEND_MODE_CLEAR) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_CLEAR")
    @js.native
    val BLEND_MODE_CLEAR: scala.Nothing = js.native
    
    /**
      * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_COLOR](Titanium.UI.BLEND_MODE_COLOR) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_COLOR")
    @js.native
    val BLEND_MODE_COLOR: scala.Nothing = js.native
    
    /**
      * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_COLOR_BURN](Titanium.UI.BLEND_MODE_COLOR_BURN) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_COLOR_BURN")
    @js.native
    val BLEND_MODE_COLOR_BURN: scala.Nothing = js.native
    
    /**
      * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_COLOR_DODGE](Titanium.UI.BLEND_MODE_COLOR_DODGE) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_COLOR_DODGE")
    @js.native
    val BLEND_MODE_COLOR_DODGE: scala.Nothing = js.native
    
    /**
      * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_COPY](Titanium.UI.BLEND_MODE_COPY) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_COPY")
    @js.native
    val BLEND_MODE_COPY: scala.Nothing = js.native
    
    /**
      * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_DARKEN](Titanium.UI.BLEND_MODE_DARKEN) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_DARKEN")
    @js.native
    val BLEND_MODE_DARKEN: scala.Nothing = js.native
    
    /**
      * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_DESTINATION_ATOP](Titanium.UI.BLEND_MODE_DESTINATION_ATOP) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_DESTINATION_ATOP")
    @js.native
    val BLEND_MODE_DESTINATION_ATOP: scala.Nothing = js.native
    
    /**
      * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_DESTINATION_IN](Titanium.UI.BLEND_MODE_DESTINATION_IN) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_DESTINATION_IN")
    @js.native
    val BLEND_MODE_DESTINATION_IN: scala.Nothing = js.native
    
    /**
      * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_DESTINATION_OUT](Titanium.UI.BLEND_MODE_DESTINATION_OUT) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_DESTINATION_OUT")
    @js.native
    val BLEND_MODE_DESTINATION_OUT: scala.Nothing = js.native
    
    /**
      * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_DESTINATION_OVER](Titanium.UI.BLEND_MODE_DESTINATION_OVER) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_DESTINATION_OVER")
    @js.native
    val BLEND_MODE_DESTINATION_OVER: scala.Nothing = js.native
    
    /**
      * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_DIFFERENCE](Titanium.UI.BLEND_MODE_DIFFERENCE) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_DIFFERENCE")
    @js.native
    val BLEND_MODE_DIFFERENCE: scala.Nothing = js.native
    
    /**
      * Image mode constant. Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_EXCLUSION](Titanium.UI.BLEND_MODE_EXCLUSION) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_EXCLUSION")
    @js.native
    val BLEND_MODE_EXCLUSION: scala.Nothing = js.native
    
    /**
      * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_HARD_LIGHT](Titanium.UI.BLEND_MODE_HARD_LIGHT) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_HARD_LIGHT")
    @js.native
    val BLEND_MODE_HARD_LIGHT: scala.Nothing = js.native
    
    /**
      * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_HUE](Titanium.UI.BLEND_MODE_HUE) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_HUE")
    @js.native
    val BLEND_MODE_HUE: scala.Nothing = js.native
    
    /**
      * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_LIGHTEN](Titanium.UI.BLEND_MODE_LIGHTEN) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_LIGHTEN")
    @js.native
    val BLEND_MODE_LIGHTEN: scala.Nothing = js.native
    
    /**
      * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_LUMINOSITY](Titanium.UI.BLEND_MODE_LUMINOSITY) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_LUMINOSITY")
    @js.native
    val BLEND_MODE_LUMINOSITY: scala.Nothing = js.native
    
    /**
      * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_MULTIPLY](Titanium.UI.BLEND_MODE_MULTIPLY) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_MULTIPLY")
    @js.native
    val BLEND_MODE_MULTIPLY: scala.Nothing = js.native
    
    /**
      * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_NORMAL](Titanium.UI.BLEND_MODE_NORMAL) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_NORMAL")
    @js.native
    val BLEND_MODE_NORMAL: scala.Nothing = js.native
    
    /**
      * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_OVERLAY](Titanium.UI.BLEND_MODE_OVERLAY) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_OVERLAY")
    @js.native
    val BLEND_MODE_OVERLAY: scala.Nothing = js.native
    
    /**
      * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_PLUS_DARKER](Titanium.UI.BLEND_MODE_PLUS_DARKER) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_PLUS_DARKER")
    @js.native
    val BLEND_MODE_PLUS_DARKER: scala.Nothing = js.native
    
    /**
      * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_PLUS_LIGHTER](Titanium.UI.BLEND_MODE_PLUS_LIGHTER) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_PLUS_LIGHTER")
    @js.native
    val BLEND_MODE_PLUS_LIGHTER: scala.Nothing = js.native
    
    /**
      * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_SATURATION](Titanium.UI.BLEND_MODE_SATURATION) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_SATURATION")
    @js.native
    val BLEND_MODE_SATURATION: scala.Nothing = js.native
    
    /**
      * Image mode constant. Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_SCREEN](Titanium.UI.BLEND_MODE_SCREEN) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_SCREEN")
    @js.native
    val BLEND_MODE_SCREEN: scala.Nothing = js.native
    
    /**
      * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_SOFT_LIGHT](Titanium.UI.BLEND_MODE_SOFT_LIGHT) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_SOFT_LIGHT")
    @js.native
    val BLEND_MODE_SOFT_LIGHT: scala.Nothing = js.native
    
    /**
      * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_SOURCE_ATOP](Titanium.UI.BLEND_MODE_SOURCE_ATOP) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_SOURCE_ATOP")
    @js.native
    val BLEND_MODE_SOURCE_ATOP: scala.Nothing = js.native
    
    /**
      * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_SOURCE_IN](Titanium.UI.BLEND_MODE_SOURCE_IN) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_SOURCE_IN")
    @js.native
    val BLEND_MODE_SOURCE_IN: scala.Nothing = js.native
    
    /**
      * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_SOURCE_OUT](Titanium.UI.BLEND_MODE_SOURCE_OUT) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_SOURCE_OUT")
    @js.native
    val BLEND_MODE_SOURCE_OUT: scala.Nothing = js.native
    
    /**
      * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
      * @deprecated Use [Titanium.UI.BLEND_MODE_XOR](Titanium.UI.BLEND_MODE_XOR) instead.
      */
    @JSGlobal("Titanium.UI.iOS.BLEND_MODE_XOR")
    @js.native
    val BLEND_MODE_XOR: scala.Nothing = js.native
    
    /**
      * Use with [BlurView.effect](Titanium.UI.iOS.BlurView.effect) to specify a blur effect.
      */
    @JSGlobal("Titanium.UI.iOS.BLUR_EFFECT_STYLE_DARK")
    @js.native
    val BLUR_EFFECT_STYLE_DARK: Double = js.native
    
    /**
      * Use with [BlurView.effect](Titanium.UI.iOS.BlurView.effect) to specify a blur effect.
      */
    @JSGlobal("Titanium.UI.iOS.BLUR_EFFECT_STYLE_EXTRA_LIGHT")
    @js.native
    val BLUR_EFFECT_STYLE_EXTRA_LIGHT: Double = js.native
    
    /**
      * Use with [BlurView.effect](Titanium.UI.iOS.BlurView.effect) to specify a blur effect.
      */
    @JSGlobal("Titanium.UI.iOS.BLUR_EFFECT_STYLE_LIGHT")
    @js.native
    val BLUR_EFFECT_STYLE_LIGHT: Double = js.native
    
    /**
      * Use with [BlurView.effect](Titanium.UI.iOS.BlurView.effect) to specify a blur effect.
      */
    @JSGlobal("Titanium.UI.iOS.BLUR_EFFECT_STYLE_PROMINENT")
    @js.native
    val BLUR_EFFECT_STYLE_PROMINENT: Double = js.native
    
    /**
      * Use with [BlurView.effect](Titanium.UI.iOS.BlurView.effect) to specify a blur effect.
      */
    @JSGlobal("Titanium.UI.iOS.BLUR_EFFECT_STYLE_REGULAR")
    @js.native
    val BLUR_EFFECT_STYLE_REGULAR: Double = js.native
    
    /**
      * Use with [BlurView.effect](Titanium.UI.iOS.BlurView.effect) to specify a blur effect.
      */
    @JSGlobal("Titanium.UI.iOS.BLUR_EFFECT_STYLE_SYSTEM_CHROME_MATERIAL")
    @js.native
    val BLUR_EFFECT_STYLE_SYSTEM_CHROME_MATERIAL: Double = js.native
    
    /**
      * Use with [BlurView.effect](Titanium.UI.iOS.BlurView.effect) to specify a blur effect.
      */
    @JSGlobal("Titanium.UI.iOS.BLUR_EFFECT_STYLE_SYSTEM_CHROME_MATERIAL_DARK")
    @js.native
    val BLUR_EFFECT_STYLE_SYSTEM_CHROME_MATERIAL_DARK: Double = js.native
    
    /**
      * Use with [BlurView.effect](Titanium.UI.iOS.BlurView.effect) to specify a blur effect.
      */
    @JSGlobal("Titanium.UI.iOS.BLUR_EFFECT_STYLE_SYSTEM_CHROME_MATERIAL_LIGHT")
    @js.native
    val BLUR_EFFECT_STYLE_SYSTEM_CHROME_MATERIAL_LIGHT: Double = js.native
    
    /**
      * Use with [BlurView.effect](Titanium.UI.iOS.BlurView.effect) to specify a blur effect.
      */
    @JSGlobal("Titanium.UI.iOS.BLUR_EFFECT_STYLE_SYSTEM_MATERIAL")
    @js.native
    val BLUR_EFFECT_STYLE_SYSTEM_MATERIAL: Double = js.native
    
    /**
      * Use with [BlurView.effect](Titanium.UI.iOS.BlurView.effect) to specify a blur effect.
      */
    @JSGlobal("Titanium.UI.iOS.BLUR_EFFECT_STYLE_SYSTEM_MATERIAL_DARK")
    @js.native
    val BLUR_EFFECT_STYLE_SYSTEM_MATERIAL_DARK: Double = js.native
    
    /**
      * Use with [BlurView.effect](Titanium.UI.iOS.BlurView.effect) to specify a blur effect.
      */
    @JSGlobal("Titanium.UI.iOS.BLUR_EFFECT_STYLE_SYSTEM_MATERIAL_LIGHT")
    @js.native
    val BLUR_EFFECT_STYLE_SYSTEM_MATERIAL_LIGHT: Double = js.native
    
    /**
      * Use with [BlurView.effect](Titanium.UI.iOS.BlurView.effect) to specify a blur effect.
      */
    @JSGlobal("Titanium.UI.iOS.BLUR_EFFECT_STYLE_SYSTEM_THICK_MATERIAL")
    @js.native
    val BLUR_EFFECT_STYLE_SYSTEM_THICK_MATERIAL: Double = js.native
    
    /**
      * Use with [BlurView.effect](Titanium.UI.iOS.BlurView.effect) to specify a blur effect.
      */
    @JSGlobal("Titanium.UI.iOS.BLUR_EFFECT_STYLE_SYSTEM_THICK_MATERIAL_DARK")
    @js.native
    val BLUR_EFFECT_STYLE_SYSTEM_THICK_MATERIAL_DARK: Double = js.native
    
    /**
      * Use with [BlurView.effect](Titanium.UI.iOS.BlurView.effect) to specify a blur effect.
      */
    @JSGlobal("Titanium.UI.iOS.BLUR_EFFECT_STYLE_SYSTEM_THICK_MATERIAL_LIGHT")
    @js.native
    val BLUR_EFFECT_STYLE_SYSTEM_THICK_MATERIAL_LIGHT: Double = js.native
    
    /**
      * Use with [BlurView.effect](Titanium.UI.iOS.BlurView.effect) to specify a blur effect.
      */
    @JSGlobal("Titanium.UI.iOS.BLUR_EFFECT_STYLE_SYSTEM_THIN_MATERIAL")
    @js.native
    val BLUR_EFFECT_STYLE_SYSTEM_THIN_MATERIAL: Double = js.native
    
    /**
      * Use with [BlurView.effect](Titanium.UI.iOS.BlurView.effect) to specify a blur effect.
      */
    @JSGlobal("Titanium.UI.iOS.BLUR_EFFECT_STYLE_SYSTEM_THIN_MATERIAL_DARK")
    @js.native
    val BLUR_EFFECT_STYLE_SYSTEM_THIN_MATERIAL_DARK: Double = js.native
    
    /**
      * Use with [BlurView.effect](Titanium.UI.iOS.BlurView.effect) to specify a blur effect.
      */
    @JSGlobal("Titanium.UI.iOS.BLUR_EFFECT_STYLE_SYSTEM_THIN_MATERIAL_LIGHT")
    @js.native
    val BLUR_EFFECT_STYLE_SYSTEM_THIN_MATERIAL_LIGHT: Double = js.native
    
    /**
      * Use with [BlurView.effect](Titanium.UI.iOS.BlurView.effect) to specify a blur effect.
      */
    @JSGlobal("Titanium.UI.iOS.BLUR_EFFECT_STYLE_SYSTEM_ULTRA_THIN_MATERIAL")
    @js.native
    val BLUR_EFFECT_STYLE_SYSTEM_ULTRA_THIN_MATERIAL: Double = js.native
    
    /**
      * Use with [BlurView.effect](Titanium.UI.iOS.BlurView.effect) to specify a blur effect.
      */
    @JSGlobal("Titanium.UI.iOS.BLUR_EFFECT_STYLE_SYSTEM_ULTRA_THIN_MATERIAL_DARK")
    @js.native
    val BLUR_EFFECT_STYLE_SYSTEM_ULTRA_THIN_MATERIAL_DARK: Double = js.native
    
    /**
      * Use with [BlurView.effect](Titanium.UI.iOS.BlurView.effect) to specify a blur effect.
      */
    @JSGlobal("Titanium.UI.iOS.BLUR_EFFECT_STYLE_SYSTEM_ULTRA_THIN_MATERIAL_LIGHT")
    @js.native
    val BLUR_EFFECT_STYLE_SYSTEM_ULTRA_THIN_MATERIAL_LIGHT: Double = js.native
    
    /**
      * A <Titanium.UI.iOS.BlurView> object gives you an easy way implement some complex visual effects.
      * The blur effect is applied to every view the blur view is added to by default. You can also place the
      * blur view above other views and all visible views layered under the blur view are blurred as well.
      * For more information on BlurView, please refer to the official [Apple documentation](https://developer.apple.com/documentation/uikit/uivisualeffectview).
      * Note: Apple introduced two new constants <Titanium.UI.iOS.BLUR_EFFECT_STYLE_REGULAR> and <Titanium.UI.iOS.BLUR_EFFECT_STYLE_PROMINENT> in
      * iOS 10. These are internally mapped to <Titanium.UI.iOS.BLUR_EFFECT_STYLE_LIGHT> and <Titanium.UI.iOS.BLUR_EFFECT_STYLE_EXTRA_LIGHT>.
      */
    @JSGlobal("Titanium.UI.iOS.BlurView")
    @js.native
    class BlurView ()
      extends typings.titanium.Titanium.UI.iOS.BlurView
    
    /**
      * Specifies that the data for the URL load should be loaded from the originating source.
      * No existing cache data should be used to satisfy a URL load request.
      */
    @JSGlobal("Titanium.UI.iOS.CACHE_POLICY_RELOAD_IGNORING_LOCAL_CACHE_DATA")
    @js.native
    val CACHE_POLICY_RELOAD_IGNORING_LOCAL_CACHE_DATA: Double = js.native
    
    /**
      * Specifies that the existing cache data should be used to satisfy a request,
      * regardless of its age or expiration date.
      */
    @JSGlobal("Titanium.UI.iOS.CACHE_POLICY_RETURN_CACHE_DATA_DONT_LOAD")
    @js.native
    val CACHE_POLICY_RETURN_CACHE_DATA_DONT_LOAD: Double = js.native
    
    /**
      * Specifies that the existing cached data should be used to satisfy the request,
      * regardless of its age or expiration date.
      */
    @JSGlobal("Titanium.UI.iOS.CACHE_POLICY_RETURN_CACHE_DATA_ELSE_LOAD")
    @js.native
    val CACHE_POLICY_RETURN_CACHE_DATA_ELSE_LOAD: Double = js.native
    
    /**
      * Specifies that the caching logic defined in the protocol implementation, if any,
      * is used for a particular URL load request.
      */
    @JSGlobal("Titanium.UI.iOS.CACHE_POLICY_USE_PROTOCOL_CACHE_POLICY")
    @js.native
    val CACHE_POLICY_USE_PROTOCOL_CACHE_POLICY: Double = js.native
    
    /**
      * Use with <Titanium.UI.View.clipMode> to specify clipping behavior.
      */
    @JSGlobal("Titanium.UI.iOS.CLIP_MODE_DEFAULT")
    @js.native
    val CLIP_MODE_DEFAULT: Double = js.native
    
    /**
      * Use with <Titanium.UI.View.clipMode> to specify clipping behavior.
      */
    @JSGlobal("Titanium.UI.iOS.CLIP_MODE_DISABLED")
    @js.native
    val CLIP_MODE_DISABLED: Double = js.native
    
    /**
      * Use with <Titanium.UI.View.clipMode> to specify clipping behavior.
      */
    @JSGlobal("Titanium.UI.iOS.CLIP_MODE_ENABLED")
    @js.native
    val CLIP_MODE_ENABLED: Double = js.native
    
    /**
      * Use with <Titanium.UI.iOS.CollisionBehavior.collisionMode> to specify collisions with both items and
      * boundaries.
      */
    @JSGlobal("Titanium.UI.iOS.COLLISION_MODE_ALL")
    @js.native
    val COLLISION_MODE_ALL: Double = js.native
    
    /**
      * Use with <Titanium.UI.iOS.CollisionBehavior.collisionMode> to specify collisions with
      * boundaries only.
      */
    @JSGlobal("Titanium.UI.iOS.COLLISION_MODE_BOUNDARY")
    @js.native
    val COLLISION_MODE_BOUNDARY: Double = js.native
    
    /**
      * Use with <Titanium.UI.iOS.CollisionBehavior.collisionMode> to specify collisions with items only.
      */
    @JSGlobal("Titanium.UI.iOS.COLLISION_MODE_ITEM")
    @js.native
    val COLLISION_MODE_ITEM: Double = js.native
    
    /**
      * Credential should be stored only for this session.
      */
    @JSGlobal("Titanium.UI.iOS.CREDENTIAL_PERSISTENCE_FOR_SESSION")
    @js.native
    val CREDENTIAL_PERSISTENCE_FOR_SESSION: Double = js.native
    
    /**
      * Credential should not be stored.
      */
    @JSGlobal("Titanium.UI.iOS.CREDENTIAL_PERSISTENCE_NONE")
    @js.native
    val CREDENTIAL_PERSISTENCE_NONE: Double = js.native
    
    /**
      * Credential should be stored in the keychain.
      */
    @JSGlobal("Titanium.UI.iOS.CREDENTIAL_PERSISTENCE_PERMANENT")
    @js.native
    val CREDENTIAL_PERSISTENCE_PERMANENT: Double = js.native
    
    /**
      * Credential should be stored permanently in the keychain, and in addition should be
      * distributed to other devices based on the owning AppleID.
      */
    @JSGlobal("Titanium.UI.iOS.CREDENTIAL_PERSISTENCE_SYNCHRONIZABLE")
    @js.native
    val CREDENTIAL_PERSISTENCE_SYNCHRONIZABLE: Double = js.native
    
    /**
      * Dynamic behavior to support collisions between items and boundaries.
      */
    @JSGlobal("Titanium.UI.iOS.CollisionBehavior")
    @js.native
    class CollisionBehavior ()
      extends typings.titanium.Titanium.UI.iOS.CollisionBehavior
    
    /**
      * The cover flow view is a container showing animated three-dimensional images in a style
      * consistent with the cover flow presentation style used for iPod, iTunes, and file browsing.
      */
    @JSGlobal("Titanium.UI.iOS.CoverFlowView")
    @js.native
    class CoverFlowView ()
      extends typings.titanium.Titanium.UI.iOS.CoverFlowView
    
    /**
      * Use with <Titanium.UI.Picker.datePickerStyle> to automatically pick the best style
      * available for the current platform & mode.
      */
    @JSGlobal("Titanium.UI.iOS.DATE_PICKER_STYLE_AUTOMATIC")
    @js.native
    val DATE_PICKER_STYLE_AUTOMATIC: Double = js.native
    
    /**
      * Use with <Titanium.UI.Picker.datePickerStyle> to show the picker with a compact style. Editing occurs in an overlay.
      */
    @JSGlobal("Titanium.UI.iOS.DATE_PICKER_STYLE_COMPACT")
    @js.native
    val DATE_PICKER_STYLE_COMPACT: Double = js.native
    
    /**
      * Use with <Titanium.UI.Picker.datePickerStyle> to allow editing in place (as a calendar).
      */
    @JSGlobal("Titanium.UI.iOS.DATE_PICKER_STYLE_INLINE")
    @js.native
    val DATE_PICKER_STYLE_INLINE: Double = js.native
    
    /**
      * Use with <Titanium.UI.Picker.datePickerStyle> to show the picker the wheels. Editing occurs inline.
      */
    @JSGlobal("Titanium.UI.iOS.DATE_PICKER_STYLE_WHEELS")
    @js.native
    val DATE_PICKER_STYLE_WHEELS: Double = js.native
    
    /**
      * A DocumentViewer provides in-app support for managing user interactions with files on the
      * local system.
      */
    @JSGlobal("Titanium.UI.iOS.DocumentViewer")
    @js.native
    class DocumentViewer ()
      extends typings.titanium.Titanium.UI.iOS.DocumentViewer
    
    /**
      * Base dynamic configuration for an item.
      */
    @JSGlobal("Titanium.UI.iOS.DynamicItemBehavior")
    @js.native
    class DynamicItemBehavior ()
      extends typings.titanium.Titanium.UI.iOS.DynamicItemBehavior
    
    /**
      * The heavy impact style used as the `style` argument when creating a <Titanium.UI.iOS.FeedbackGenerator> with the
      * type <Titanium.UI.iOS.FEEDBACK_GENERATOR_TYPE_IMPACT>.
      */
    @JSGlobal("Titanium.UI.iOS.FEEDBACK_GENERATOR_IMPACT_STYLE_HEAVY")
    @js.native
    val FEEDBACK_GENERATOR_IMPACT_STYLE_HEAVY: Double = js.native
    
    /**
      * The light impact style used as the `style` argument when creating a <Titanium.UI.iOS.FeedbackGenerator> with the
      * type <Titanium.UI.iOS.FEEDBACK_GENERATOR_TYPE_IMPACT>.
      */
    @JSGlobal("Titanium.UI.iOS.FEEDBACK_GENERATOR_IMPACT_STYLE_LIGHT")
    @js.native
    val FEEDBACK_GENERATOR_IMPACT_STYLE_LIGHT: Double = js.native
    
    /**
      * The medium impact style used as the `style` argument when creating a <Titanium.UI.iOS.FeedbackGenerator> with the
      * type <Titanium.UI.iOS.FEEDBACK_GENERATOR_TYPE_IMPACT>.
      */
    @JSGlobal("Titanium.UI.iOS.FEEDBACK_GENERATOR_IMPACT_STYLE_MEDIUM")
    @js.native
    val FEEDBACK_GENERATOR_IMPACT_STYLE_MEDIUM: Double = js.native
    
    /**
      * The error notification type used as the argument in <Titanium.UI.iOS.FeedbackGenerator.notificationOccurred>.
      */
    @JSGlobal("Titanium.UI.iOS.FEEDBACK_GENERATOR_NOTIFICATION_TYPE_ERROR")
    @js.native
    val FEEDBACK_GENERATOR_NOTIFICATION_TYPE_ERROR: Double = js.native
    
    /**
      * The success notification type used as the argument in <Titanium.UI.iOS.FeedbackGenerator.notificationOccurred>.
      */
    @JSGlobal("Titanium.UI.iOS.FEEDBACK_GENERATOR_NOTIFICATION_TYPE_SUCCESS")
    @js.native
    val FEEDBACK_GENERATOR_NOTIFICATION_TYPE_SUCCESS: Double = js.native
    
    /**
      * The warning notification type used as the argument in <Titanium.UI.iOS.FeedbackGenerator.notificationOccurred>.
      */
    @JSGlobal("Titanium.UI.iOS.FEEDBACK_GENERATOR_NOTIFICATION_TYPE_WARNING")
    @js.native
    val FEEDBACK_GENERATOR_NOTIFICATION_TYPE_WARNING: Double = js.native
    
    /**
      * The feedback type to be used when specifying an impact in <Titanium.UI.iOS.FeedbackGenerator>.
      */
    @JSGlobal("Titanium.UI.iOS.FEEDBACK_GENERATOR_TYPE_IMPACT")
    @js.native
    val FEEDBACK_GENERATOR_TYPE_IMPACT: Double = js.native
    
    /**
      * The feedback type to be used when specifying a received notification in <Titanium.UI.iOS.FeedbackGenerator>.
      */
    @JSGlobal("Titanium.UI.iOS.FEEDBACK_GENERATOR_TYPE_NOTIFICATION")
    @js.native
    val FEEDBACK_GENERATOR_TYPE_NOTIFICATION: Double = js.native
    
    /**
      * The feedback type to be used when specifying a selection in <Titanium.UI.iOS.FeedbackGenerator>.
      */
    @JSGlobal("Titanium.UI.iOS.FEEDBACK_GENERATOR_TYPE_SELECTION")
    @js.native
    val FEEDBACK_GENERATOR_TYPE_SELECTION: Double = js.native
    
    /**
      * The feedback generator API is introduced in iOS 10 to handle the haptic feedback when using an iPhone 7 or
      * later devices.
      */
    @JSGlobal("Titanium.UI.iOS.FeedbackGenerator")
    @js.native
    class FeedbackGenerator ()
      extends typings.titanium.Titanium.UI.iOS.FeedbackGenerator
    
    /**
      * Gravitational force to apply to an item.
      */
    @JSGlobal("Titanium.UI.iOS.GravityBehavior")
    @js.native
    class GravityBehavior ()
      extends typings.titanium.Titanium.UI.iOS.GravityBehavior
    
    /**
      * Inject the script after the document finishes loading, but before other subresources finish loading.
      */
    @JSGlobal("Titanium.UI.iOS.INJECTION_TIME_DOCUMENT_END")
    @js.native
    val INJECTION_TIME_DOCUMENT_END: Double = js.native
    
    /**
      * Inject the script after the document element is created, but before any other content is loaded.
      */
    @JSGlobal("Titanium.UI.iOS.INJECTION_TIME_DOCUMENT_START")
    @js.native
    val INJECTION_TIME_DOCUMENT_START: Double = js.native
    
    /**
      * Use with <Titanium.UI.ScrollView.keyboardDismissMode> to control keyboard dismiss mode.
      */
    @JSGlobal("Titanium.UI.iOS.KEYBOARD_DISMISS_MODE_INTERACTIVE")
    @js.native
    val KEYBOARD_DISMISS_MODE_INTERACTIVE: Double = js.native
    
    /**
      * Use with <Titanium.UI.ScrollView.keyboardDismissMode> to control keyboard dismiss mode.
      */
    @JSGlobal("Titanium.UI.iOS.KEYBOARD_DISMISS_MODE_NONE")
    @js.native
    val KEYBOARD_DISMISS_MODE_NONE: Double = js.native
    
    /**
      * Use with <Titanium.UI.ScrollView.keyboardDismissMode> to control keyboard dismiss mode.
      */
    @JSGlobal("Titanium.UI.iOS.KEYBOARD_DISMISS_MODE_ON_DRAG")
    @js.native
    val KEYBOARD_DISMISS_MODE_ON_DRAG: Double = js.native
    
    /**
      * Always use a larger title when this item is top most.
      */
    @JSGlobal("Titanium.UI.iOS.LARGE_TITLE_DISPLAY_MODE_ALWAYS")
    @js.native
    val LARGE_TITLE_DISPLAY_MODE_ALWAYS: Double = js.native
    
    /**
      * Automatically use the large out-of-line title based on the state of the p
      * revious item in the navigation bar.
      */
    @JSGlobal("Titanium.UI.iOS.LARGE_TITLE_DISPLAY_MODE_AUTOMATIC")
    @js.native
    val LARGE_TITLE_DISPLAY_MODE_AUTOMATIC: Double = js.native
    
    /**
      * Never use a larger title when this item is top most.
      */
    @JSGlobal("Titanium.UI.iOS.LARGE_TITLE_DISPLAY_MODE_NEVER")
    @js.native
    val LARGE_TITLE_DISPLAY_MODE_NEVER: Double = js.native
    
    /**
      * To indicate that the Live Photo aspect is turned off and it will
      * be treated as a still (e.g. for sharing).
      */
    @JSGlobal("Titanium.UI.iOS.LIVEPHOTO_BADGE_OPTIONS_LIVE_OFF")
    @js.native
    val LIVEPHOTO_BADGE_OPTIONS_LIVE_OFF: Double = js.native
    
    /**
      * Include treatments so this image can be shown directly over the content
      * of the Live Photo.
      */
    @JSGlobal("Titanium.UI.iOS.LIVEPHOTO_BADGE_OPTIONS_OVER_CONTENT")
    @js.native
    val LIVEPHOTO_BADGE_OPTIONS_OVER_CONTENT: Double = js.native
    
    /**
      * Plays back the entire motion and sound content of the Live Photo, including transition
      * effects at the start and end.
      */
    @JSGlobal("Titanium.UI.iOS.LIVEPHOTO_PLAYBACK_STYLE_FULL")
    @js.native
    val LIVEPHOTO_PLAYBACK_STYLE_FULL: Double = js.native
    
    /**
      * Plays back only a brief section of the motion content of the Live Photo, without sound.
      */
    @JSGlobal("Titanium.UI.iOS.LIVEPHOTO_PLAYBACK_STYLE_HINT")
    @js.native
    val LIVEPHOTO_PLAYBACK_STYLE_HINT: Double = js.native
    
    /**
      * A set of constants for the style that can be used for the `selectionStyle` property of a
      * ListItem, which is set in the `properties` dictionary of either the <ListDataItem> or
      * <ItemTemplate>.
      */
    object ListViewCellSelectionStyle {
      
      /**
        * The cell when selected has a blue background. This is the default value.
        */
      @JSGlobal("Titanium.UI.iOS.ListViewCellSelectionStyle.BLUE")
      @js.native
      val BLUE: Double = js.native
      
      /**
        * The cell when selected has a gray background.
        */
      @JSGlobal("Titanium.UI.iOS.ListViewCellSelectionStyle.GRAY")
      @js.native
      val GRAY: Double = js.native
      
      /**
        * The cell has no distinct style for when it is selected.
        */
      @JSGlobal("Titanium.UI.iOS.ListViewCellSelectionStyle.NONE")
      @js.native
      val NONE: Double = js.native
    }
    
    /**
      * A set of constants for the position value that can be used for the `position` property of
      * <ListViewAnimationProperties> when invoking the ListView's `scrollToItem`, `appendSection`,
      * `deleteSectionAt`, `insertSectionAt` and `replaceSectionAt` methods.
      */
    object ListViewScrollPosition {
      
      /**
        * The list view scrolls the row of interest to the bottom of the visible list view.
        */
      @JSGlobal("Titanium.UI.iOS.ListViewScrollPosition.BOTTOM")
      @js.native
      val BOTTOM: Double = js.native
      
      /**
        * The list view scrolls the row of interest to the middle of the list table view.
        */
      @JSGlobal("Titanium.UI.iOS.ListViewScrollPosition.MIDDLE")
      @js.native
      val MIDDLE: Double = js.native
      
      /**
        * The table view scrolls the row of interest to be fully visible with a minimal movement.
        * If the row is already fully visible, no scrolling occurs. For example, if the row is above the
        * visible area, the behavior is identical to that specified by `TOP`. This is the default.
        */
      @JSGlobal("Titanium.UI.iOS.ListViewScrollPosition.NONE")
      @js.native
      val NONE: Double = js.native
      
      /**
        * The list view scrolls the row of interest to the top of the visible list view.
        */
      @JSGlobal("Titanium.UI.iOS.ListViewScrollPosition.TOP")
      @js.native
      val TOP: Double = js.native
    }
    
    /**
      * A set of constants for the style that can be used for the `style` property of
      * <Titanium.UI.ListView>.
      */
    object ListViewStyle {
      
      /**
        * A list view whose sections present distinct groups of rows. The section headers and footers
        * do not float.
        */
      @JSGlobal("Titanium.UI.iOS.ListViewStyle.GROUPED")
      @js.native
      val GROUPED: Double = js.native
      
      /**
        * A plain list view. Any section headers or footers are displayed as inline separators and
        * float when the list view is scrolled.
        */
      @JSGlobal("Titanium.UI.iOS.ListViewStyle.PLAIN")
      @js.native
      val PLAIN: Double = js.native
    }
    
    /**
      * Abstract object representing a live photo used in <Titanium.UI.iOS.LivePhotoView>.
      */
    @JSGlobal("Titanium.UI.iOS.LivePhoto")
    @js.native
    class LivePhoto ()
      extends typings.titanium.Titanium.UI.iOS.LivePhoto
    
    /**
      * A view to display a <Titanium.UI.iOS.LivePhoto> object introduced in iOS 9.1.
      */
    @JSGlobal("Titanium.UI.iOS.LivePhotoView")
    @js.native
    class LivePhotoView ()
      extends typings.titanium.Titanium.UI.iOS.LivePhotoView
    
    /**
      * An arrow that is automatically aligned.
      */
    @JSGlobal("Titanium.UI.iOS.MENU_POPUP_ARROW_DIRECTION_DEFAULT")
    @js.native
    val MENU_POPUP_ARROW_DIRECTION_DEFAULT: Double = js.native
    
    /**
      * An arrow that points downward.
      */
    @JSGlobal("Titanium.UI.iOS.MENU_POPUP_ARROW_DIRECTION_DOWN")
    @js.native
    val MENU_POPUP_ARROW_DIRECTION_DOWN: Double = js.native
    
    /**
      * An arrow that points toward the left.
      */
    @JSGlobal("Titanium.UI.iOS.MENU_POPUP_ARROW_DIRECTION_LEFT")
    @js.native
    val MENU_POPUP_ARROW_DIRECTION_LEFT: Double = js.native
    
    /**
      * An arrow that points toward the right.
      */
    @JSGlobal("Titanium.UI.iOS.MENU_POPUP_ARROW_DIRECTION_RIGHT")
    @js.native
    val MENU_POPUP_ARROW_DIRECTION_RIGHT: Double = js.native
    
    /**
      * An arrow that points upward.
      */
    @JSGlobal("Titanium.UI.iOS.MENU_POPUP_ARROW_DIRECTION_UP")
    @js.native
    val MENU_POPUP_ARROW_DIRECTION_UP: Double = js.native
    
    /**
      * View presented with the same style as its parent window.
      */
    @JSGlobal("Titanium.UI.iOS.MODAL_PRESENTATION_CURRENT_CONTEXT")
    @js.native
    def MODAL_PRESENTATION_CURRENT_CONTEXT: Double = js.native
    @scala.inline
    def MODAL_PRESENTATION_CURRENT_CONTEXT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODAL_PRESENTATION_CURRENT_CONTEXT")(x.asInstanceOf[js.Any])
    
    /**
      * Window width and height are smaller than those of the screen and the view is centered on
      * the screen.
      */
    @JSGlobal("Titanium.UI.iOS.MODAL_PRESENTATION_FORMSHEET")
    @js.native
    val MODAL_PRESENTATION_FORMSHEET: Double = js.native
    
    /**
      * Window covers the screen.
      */
    @JSGlobal("Titanium.UI.iOS.MODAL_PRESENTATION_FULLSCREEN")
    @js.native
    val MODAL_PRESENTATION_FULLSCREEN: Double = js.native
    
    /**
      * View presented over its parent window.
      */
    @JSGlobal("Titanium.UI.iOS.MODAL_PRESENTATION_OVER_CURRENT_CONTEXT")
    @js.native
    def MODAL_PRESENTATION_OVER_CURRENT_CONTEXT: Double = js.native
    @scala.inline
    def MODAL_PRESENTATION_OVER_CURRENT_CONTEXT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODAL_PRESENTATION_OVER_CURRENT_CONTEXT")(x.asInstanceOf[js.Any])
    
    /**
      * Presented view covers the screen.
      */
    @JSGlobal("Titanium.UI.iOS.MODAL_PRESENTATION_OVER_CURRENT_FULL_SCREEN")
    @js.native
    def MODAL_PRESENTATION_OVER_CURRENT_FULL_SCREEN: Double = js.native
    @scala.inline
    def MODAL_PRESENTATION_OVER_CURRENT_FULL_SCREEN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODAL_PRESENTATION_OVER_CURRENT_FULL_SCREEN")(x.asInstanceOf[js.Any])
    
    /**
      * Window height is the height of the screen and width is equal to screen width in a portrait
      * orientation.
      */
    @JSGlobal("Titanium.UI.iOS.MODAL_PRESENTATION_PAGESHEET")
    @js.native
    val MODAL_PRESENTATION_PAGESHEET: Double = js.native
    
    /**
      * When the window is presented, its view slides up from the bottom of the screen. On dismissal,
      * the view slides back down (default.)
      */
    @JSGlobal("Titanium.UI.iOS.MODAL_TRANSITION_STYLE_COVER_VERTICAL")
    @js.native
    val MODAL_TRANSITION_STYLE_COVER_VERTICAL: Double = js.native
    
    /**
      * When the window is presented, the current view fades out while the new view fades in at the
      * same time. On dismissal, a similar type of cross-fade is used to return to the original view.
      */
    @JSGlobal("Titanium.UI.iOS.MODAL_TRANSITION_STYLE_CROSS_DISSOLVE")
    @js.native
    val MODAL_TRANSITION_STYLE_CROSS_DISSOLVE: Double = js.native
    
    /**
      * When the window is presented, the current view initiates a horizontal 3D flip from
      * right-to-left, resulting in the revealing of the new view as if it were on the back of the
      * previous view. On dismissal, the flip occurs from left-to-right, returning to the original
      * view.
      */
    @JSGlobal("Titanium.UI.iOS.MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL")
    @js.native
    val MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL: Double = js.native
    
    /**
      * When the window is presented, one corner of the current view curls up to reveal the modal
      * view underneath. On dismissal, the curled up page unfurls itself back on top of the modal
      * view.
      */
    @JSGlobal("Titanium.UI.iOS.MODAL_TRANSITION_STYLE_PARTIAL_CURL")
    @js.native
    val MODAL_TRANSITION_STYLE_PARTIAL_CURL: Double = js.native
    
    /**
      * A menu popup provides the ability to create custom tooltip options using the `items` property
      * covering the native `UIMenuController` class.
      * See also:
      * * [iOS Developer Library: UIMenuController](https://developer.apple.com/documentation/uikit/uimenucontroller)
      */
    @JSGlobal("Titanium.UI.iOS.MenuPopup")
    @js.native
    class MenuPopup ()
      extends typings.titanium.Titanium.UI.iOS.MenuPopup
    
    /**
      * A `NavigationWindow` implements a specialized view that manages the navigation of hierarchical
      * content.
      * @deprecated Use [Titanium.UI.NavigationWindow](Titanium.UI.NavigationWindow) instead.
      */
    @JSGlobal("Titanium.UI.iOS.NavigationWindow")
    @js.native
    class NavigationWindow ()
      extends typings.titanium.Titanium.UI.iOS.NavigationWindow
    
    /**
      * The normal style for preview actions.
      */
    @JSGlobal("Titanium.UI.iOS.PREVIEW_ACTION_STYLE_DEFAULT")
    @js.native
    val PREVIEW_ACTION_STYLE_DEFAULT: Double = js.native
    
    /**
      * The destructive style for preview actions.
      */
    @JSGlobal("Titanium.UI.iOS.PREVIEW_ACTION_STYLE_DESTRUCTIVE")
    @js.native
    val PREVIEW_ACTION_STYLE_DESTRUCTIVE: Double = js.native
    
    /**
      * The selected style for preview actions.
      */
    @JSGlobal("Titanium.UI.iOS.PREVIEW_ACTION_STYLE_SELECTED")
    @js.native
    val PREVIEW_ACTION_STYLE_SELECTED: Double = js.native
    
    /**
      * Use with <Titanium.UI.iOS.PushBehavior.pushMode> to specifiy a continuous force.
      */
    @JSGlobal("Titanium.UI.iOS.PUSH_MODE_CONTINUOUS")
    @js.native
    val PUSH_MODE_CONTINUOUS: Double = js.native
    
    /**
      * Use with <Titanium.UI.iOS.PushBehavior.pushMode> to specifiy an instantaneous force.
      */
    @JSGlobal("Titanium.UI.iOS.PUSH_MODE_INSTANTANEOUS")
    @js.native
    val PUSH_MODE_INSTANTANEOUS: Double = js.native
    
    /**
      * A PreviewAction provides options to configure actions used by the iOS 9 3D-Touch "Peek and Pop"
      * feature.
      */
    @JSGlobal("Titanium.UI.iOS.PreviewAction")
    @js.native
    class PreviewAction ()
      extends typings.titanium.Titanium.UI.iOS.PreviewAction
    
    /**
      * A PreviewActionGroup provides options to configure a group of actions used by the iOS9 3D-Touch
      * feature "Peek and Pop".
      */
    @JSGlobal("Titanium.UI.iOS.PreviewActionGroup")
    @js.native
    class PreviewActionGroup ()
      extends typings.titanium.Titanium.UI.iOS.PreviewActionGroup
    
    /**
      * A PreviewContext provides options to configure the iOS 9 3D-Touch "Peek and Pop" feature.
      */
    @JSGlobal("Titanium.UI.iOS.PreviewContext")
    @js.native
    class PreviewContext ()
      extends typings.titanium.Titanium.UI.iOS.PreviewContext
    
    /**
      * A set of constants for the bar styles used on the `style` property of <Titanium.UI.ProgressBar>.
      */
    object ProgressBarStyle {
      
      /**
        * The style of progress view that is used in a toolbar.
        */
      @JSGlobal("Titanium.UI.iOS.ProgressBarStyle.BAR")
      @js.native
      val BAR: Double = js.native
      
      /**
        * he standard progress-view style. This is the default.
        */
      @JSGlobal("Titanium.UI.iOS.ProgressBarStyle.DEFAULT")
      @js.native
      val DEFAULT: Double = js.native
      
      /**
        * The standard progress-view style. Same as `DEFAULT`.
        */
      @JSGlobal("Titanium.UI.iOS.ProgressBarStyle.PLAIN")
      @js.native
      val PLAIN: Double = js.native
      
      /**
        * Adds the specified callback as an event listener for the named event.
        */
      @JSGlobal("Titanium.UI.iOS.ProgressBarStyle.addEventListener")
      @js.native
      def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
      
      /**
        * Fires a synthesized event to any registered listeners.
        */
      @JSGlobal("Titanium.UI.iOS.ProgressBarStyle.fireEvent")
      @js.native
      def fireEvent(name: String): Unit = js.native
      @JSGlobal("Titanium.UI.iOS.ProgressBarStyle.fireEvent")
      @js.native
      def fireEvent(name: String, event: js.Any): Unit = js.native
      
      /**
        * Removes the specified callback as an event listener for the named event.
        */
      @JSGlobal("Titanium.UI.iOS.ProgressBarStyle.removeEventListener")
      @js.native
      def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    }
    
    /**
      * Continuous or instantaneous force to apply to an item.
      */
    @JSGlobal("Titanium.UI.iOS.PushBehavior")
    @js.native
    class PushBehavior ()
      extends typings.titanium.Titanium.UI.iOS.PushBehavior
    
    /**
      * The default style for <RowActionType>.
      */
    @JSGlobal("Titanium.UI.iOS.ROW_ACTION_STYLE_DEFAULT")
    @js.native
    val ROW_ACTION_STYLE_DEFAULT: Double = js.native
    
    /**
      * The destructive style for <RowActionType>.
      */
    @JSGlobal("Titanium.UI.iOS.ROW_ACTION_STYLE_DESTRUCTIVE")
    @js.native
    val ROW_ACTION_STYLE_DESTRUCTIVE: Double = js.native
    
    /**
      * The normal style for <RowActionType>.
      */
    @JSGlobal("Titanium.UI.iOS.ROW_ACTION_STYLE_NORMAL")
    @js.native
    val ROW_ACTION_STYLE_NORMAL: Double = js.native
    
    /**
      * A set of constants for the Animation Styles used for transition on table view rows.
      */
    object RowAnimationStyle {
      
      /**
        * The inserted row or rows slides in from the bottom; the deleted row or rows slides out
        * toward the bottom.
        */
      @JSGlobal("Titanium.UI.iOS.RowAnimationStyle.BOTTOM")
      @js.native
      val BOTTOM: Double = js.native
      
      /**
        * The inserted or deleted row or rows fades into or out of the table view.
        */
      @JSGlobal("Titanium.UI.iOS.RowAnimationStyle.FADE")
      @js.native
      val FADE: Double = js.native
      
      /**
        * The inserted row or rows slides in from the left; the deleted row or rows slides out to the
        * left.
        */
      @JSGlobal("Titanium.UI.iOS.RowAnimationStyle.LEFT")
      @js.native
      val LEFT: Double = js.native
      
      /**
        * No animation is performed. The new cell value appears as if the cell had just been reloaded.
        */
      @JSGlobal("Titanium.UI.iOS.RowAnimationStyle.NONE")
      @js.native
      val NONE: Double = js.native
      
      /**
        * The inserted row or rows slides in from the right; the deleted row or rows slides out to
        * the right.
        */
      @JSGlobal("Titanium.UI.iOS.RowAnimationStyle.RIGHT")
      @js.native
      val RIGHT: Double = js.native
      
      /**
        * The inserted row or rows slides in from the top; the deleted row or rows slides out toward
        * the top.
        */
      @JSGlobal("Titanium.UI.iOS.RowAnimationStyle.TOP")
      @js.native
      val TOP: Double = js.native
      
      /**
        * Adds the specified callback as an event listener for the named event.
        */
      @JSGlobal("Titanium.UI.iOS.RowAnimationStyle.addEventListener")
      @js.native
      def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
      
      /**
        * Fires a synthesized event to any registered listeners.
        */
      @JSGlobal("Titanium.UI.iOS.RowAnimationStyle.fireEvent")
      @js.native
      def fireEvent(name: String): Unit = js.native
      @JSGlobal("Titanium.UI.iOS.RowAnimationStyle.fireEvent")
      @js.native
      def fireEvent(name: String, event: js.Any): Unit = js.native
      
      /**
        * Removes the specified callback as an event listener for the named event.
        */
      @JSGlobal("Titanium.UI.iOS.RowAnimationStyle.removeEventListener")
      @js.native
      def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    }
    
    /**
      * Use with <Titanium.UI.ScrollView.decelerationRate> to control deceleration rate.
      */
    @JSGlobal("Titanium.UI.iOS.SCROLL_DECELERATION_RATE_FAST")
    @js.native
    val SCROLL_DECELERATION_RATE_FAST: Double = js.native
    
    /**
      * Use with <Titanium.UI.ScrollView.decelerationRate> to control deceleration rate.
      */
    @JSGlobal("Titanium.UI.iOS.SCROLL_DECELERATION_RATE_NORMAL")
    @js.native
    val SCROLL_DECELERATION_RATE_NORMAL: Double = js.native
    
    /**
      * Use with <Titanium.UI.SearchBar.style> to change the search bar style.
      */
    @JSGlobal("Titanium.UI.iOS.SEARCH_BAR_STYLE_MINIMAL")
    @js.native
    val SEARCH_BAR_STYLE_MINIMAL: Double = js.native
    
    /**
      * Use with <Titanium.UI.SearchBar.style> to change the search bar style.
      */
    @JSGlobal("Titanium.UI.iOS.SEARCH_BAR_STYLE_PROMINENT")
    @js.native
    val SEARCH_BAR_STYLE_PROMINENT: Double = js.native
    
    /**
      * Selection endpoints can be placed at any character boundary.
      */
    @JSGlobal("Titanium.UI.iOS.SELECTION_GRANULARITY_CHARACTER")
    @js.native
    val SELECTION_GRANULARITY_CHARACTER: Double = js.native
    
    /**
      * Selection granularity varies automatically depending on the selection.
      */
    @JSGlobal("Titanium.UI.iOS.SELECTION_GRANULARITY_DYNAMIC")
    @js.native
    val SELECTION_GRANULARITY_DYNAMIC: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_ADD")
    @js.native
    val SHORTCUT_ICON_TYPE_ADD: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_ALARM")
    @js.native
    val SHORTCUT_ICON_TYPE_ALARM: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_AUDIO")
    @js.native
    val SHORTCUT_ICON_TYPE_AUDIO: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_BOOKMARK")
    @js.native
    val SHORTCUT_ICON_TYPE_BOOKMARK: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_CAPTURE_PHOTO")
    @js.native
    val SHORTCUT_ICON_TYPE_CAPTURE_PHOTO: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_CAPTURE_VIDEO")
    @js.native
    val SHORTCUT_ICON_TYPE_CAPTURE_VIDEO: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_CLOUD")
    @js.native
    val SHORTCUT_ICON_TYPE_CLOUD: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_COMPOSE")
    @js.native
    val SHORTCUT_ICON_TYPE_COMPOSE: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_CONFIRMATION")
    @js.native
    val SHORTCUT_ICON_TYPE_CONFIRMATION: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_CONTACT")
    @js.native
    val SHORTCUT_ICON_TYPE_CONTACT: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_DATE")
    @js.native
    val SHORTCUT_ICON_TYPE_DATE: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_FAVORITE")
    @js.native
    val SHORTCUT_ICON_TYPE_FAVORITE: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_HOME")
    @js.native
    val SHORTCUT_ICON_TYPE_HOME: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_INVITATION")
    @js.native
    val SHORTCUT_ICON_TYPE_INVITATION: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_LOCATION")
    @js.native
    val SHORTCUT_ICON_TYPE_LOCATION: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_LOVE")
    @js.native
    val SHORTCUT_ICON_TYPE_LOVE: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_MAIL")
    @js.native
    val SHORTCUT_ICON_TYPE_MAIL: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_MARK_LOCATION")
    @js.native
    val SHORTCUT_ICON_TYPE_MARK_LOCATION: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_MESSAGE")
    @js.native
    val SHORTCUT_ICON_TYPE_MESSAGE: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_PAUSE")
    @js.native
    val SHORTCUT_ICON_TYPE_PAUSE: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_PLAY")
    @js.native
    val SHORTCUT_ICON_TYPE_PLAY: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_PROHIBIT")
    @js.native
    val SHORTCUT_ICON_TYPE_PROHIBIT: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_SEARCH")
    @js.native
    val SHORTCUT_ICON_TYPE_SEARCH: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_SHARE")
    @js.native
    val SHORTCUT_ICON_TYPE_SHARE: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_SHUFFLE")
    @js.native
    val SHORTCUT_ICON_TYPE_SHUFFLE: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_TASK")
    @js.native
    val SHORTCUT_ICON_TYPE_TASK: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_TASK_COMPLETED")
    @js.native
    val SHORTCUT_ICON_TYPE_TASK_COMPLETED: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_TIME")
    @js.native
    val SHORTCUT_ICON_TYPE_TIME: Double = js.native
    
    /**
      * Number that represents the icon used for the application shortcut
      */
    @JSGlobal("Titanium.UI.iOS.SHORTCUT_ICON_TYPE_UPDATE")
    @js.native
    val SHORTCUT_ICON_TYPE_UPDATE: Double = js.native
    
    /**
      * A set of constants for the styles available for scrollbars used with <Titanium.UI.ScrollView.scrollIndicatorStyle> and <Titanium.UI.TableView.scrollIndicatorStyle> properties.
      */
    object ScrollIndicatorStyle {
      
      /**
        * A style of indicator which is black smaller than the default style. This style is good
        * against a white content background.
        */
      @JSGlobal("Titanium.UI.iOS.ScrollIndicatorStyle.BLACK")
      @js.native
      val BLACK: Double = js.native
      
      /**
        * The default style of scroll indicator, which is black with a white border. This style is
        * good against any content background.
        */
      @JSGlobal("Titanium.UI.iOS.ScrollIndicatorStyle.DEFAULT")
      @js.native
      val DEFAULT: Double = js.native
      
      /**
        * A style of indicator is white and smaller than the default style. This style is good against
        * a black content background.
        */
      @JSGlobal("Titanium.UI.iOS.ScrollIndicatorStyle.WHITE")
      @js.native
      val WHITE: Double = js.native
      
      /**
        * Adds the specified callback as an event listener for the named event.
        */
      @JSGlobal("Titanium.UI.iOS.ScrollIndicatorStyle.addEventListener")
      @js.native
      def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
      
      /**
        * Fires a synthesized event to any registered listeners.
        */
      @JSGlobal("Titanium.UI.iOS.ScrollIndicatorStyle.fireEvent")
      @js.native
      def fireEvent(name: String): Unit = js.native
      @JSGlobal("Titanium.UI.iOS.ScrollIndicatorStyle.fireEvent")
      @js.native
      def fireEvent(name: String, event: js.Any): Unit = js.native
      
      /**
        * Removes the specified callback as an event listener for the named event.
        */
      @JSGlobal("Titanium.UI.iOS.ScrollIndicatorStyle.removeEventListener")
      @js.native
      def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    }
    
    /**
      * Dynamic behavior defining an item's movement to a specific point.
      */
    @JSGlobal("Titanium.UI.iOS.SnapBehavior")
    @js.native
    class SnapBehavior ()
      extends typings.titanium.Titanium.UI.iOS.SnapBehavior
    
    /**
      * A SplitWindow is a window that manages the presentation of two side-by-side view
      * controllers.
      */
    @JSGlobal("Titanium.UI.iOS.SplitWindow")
    @js.native
    class SplitWindow ()
      extends typings.titanium.Titanium.UI.iOS.SplitWindow
    
    /**
      * A set of constants for the status bar style.
      */
    object StatusBar {
      
      /**
        * Fade animation style, when the status bar is hidden or shown.
        */
      @JSGlobal("Titanium.UI.iOS.StatusBar.ANIMATION_STYLE_FADE")
      @js.native
      val ANIMATION_STYLE_FADE: Double = js.native
      
      /**
        * No animation style, when the status bar is hidden or shown.
        */
      @JSGlobal("Titanium.UI.iOS.StatusBar.ANIMATION_STYLE_NONE")
      @js.native
      val ANIMATION_STYLE_NONE: Double = js.native
      
      /**
        * Slide animation style, when the status bar is hidden or shown.
        */
      @JSGlobal("Titanium.UI.iOS.StatusBar.ANIMATION_STYLE_SLIDE")
      @js.native
      val ANIMATION_STYLE_SLIDE: Double = js.native
      
      /**
        * Status bar style to use with light backgrounds.
        */
      @JSGlobal("Titanium.UI.iOS.StatusBar.DARK_CONTENT")
      @js.native
      val DARK_CONTENT: Double = js.native
      
      /**
        * Default status bar style.
        */
      @JSGlobal("Titanium.UI.iOS.StatusBar.DEFAULT")
      @js.native
      val DEFAULT: Double = js.native
      
      /**
        * Gray-colored status bar style.
        * @deprecated Use [Titanium.UI.iOS.StatusBar.DEFAULT](Titanium.UI.iOS.StatusBar.DEFAULT) instead.
        */
      @JSGlobal("Titanium.UI.iOS.StatusBar.GRAY")
      @js.native
      val GRAY: Double = js.native
      
      /**
        * Gray-colored status bar style.
        * @deprecated Use [Titanium.UI.iOS.StatusBar.DEFAULT](Titanium.UI.iOS.StatusBar.DEFAULT) instead.
        */
      @JSGlobal("Titanium.UI.iOS.StatusBar.GREY")
      @js.native
      val GREY: Double = js.native
      
      /**
        * Status bar style to use with dark backgrounds.
        */
      @JSGlobal("Titanium.UI.iOS.StatusBar.LIGHT_CONTENT")
      @js.native
      val LIGHT_CONTENT: Double = js.native
      
      /**
        * Adds the specified callback as an event listener for the named event.
        */
      @JSGlobal("Titanium.UI.iOS.StatusBar.addEventListener")
      @js.native
      def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
      
      /**
        * Fires a synthesized event to any registered listeners.
        */
      @JSGlobal("Titanium.UI.iOS.StatusBar.fireEvent")
      @js.native
      def fireEvent(name: String): Unit = js.native
      @JSGlobal("Titanium.UI.iOS.StatusBar.fireEvent")
      @js.native
      def fireEvent(name: String, event: js.Any): Unit = js.native
      
      /**
        * Removes the specified callback as an event listener for the named event.
        */
      @JSGlobal("Titanium.UI.iOS.StatusBar.removeEventListener")
      @js.native
      def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    }
    
    /**
      * A widget used to increment and decrement a value.
      */
    @JSGlobal("Titanium.UI.iOS.Stepper")
    @js.native
    class Stepper ()
      extends typings.titanium.Titanium.UI.iOS.Stepper
    
    /**
      * A set of constants for creating standard iOS system buttons.
      */
    @JSGlobal("Titanium.UI.iOS.SystemButton")
    @js.native
    class SystemButton ()
      extends typings.titanium.Titanium.UI.iOS.SystemButton
    /**
      * A set of constants for creating standard iOS system buttons.
      */
    object SystemButton {
      
      /**
        * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify an **Action** button.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButton.ACTION")
      @js.native
      val ACTION: Double = js.native
      
      /**
        * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to create an activity indicator that
        * can be used in navigation bars and toolbars.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButton.ACTIVITY")
      @js.native
      val ACTIVITY: Double = js.native
      
      /**
        * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify an **Add** button.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButton.ADD")
      @js.native
      val ADD: Double = js.native
      
      /**
        * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Bookmarks** button.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButton.BOOKMARKS")
      @js.native
      val BOOKMARKS: Double = js.native
      
      /**
        * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Camera** button.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButton.CAMERA")
      @js.native
      val CAMERA: Double = js.native
      
      /**
        * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Cancel** button.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButton.CANCEL")
      @js.native
      val CANCEL: Double = js.native
      
      /**
        * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Compose** button.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButton.COMPOSE")
      @js.native
      val COMPOSE: Double = js.native
      
      /**
        * Use with [Button.style](Titanium.UI.Button.style) to specify a **ContactAdd** button.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButton.CONTACT_ADD")
      @js.native
      val CONTACT_ADD: Double = js.native
      
      /**
        * Use with [Button.style](Titanium.UI.Button.style) to specify a **Disclosure** button.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButton.DISCLOSURE")
      @js.native
      val DISCLOSURE: Double = js.native
      
      /**
        * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Done** button.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButton.DONE")
      @js.native
      val DONE: Double = js.native
      
      /**
        * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify an **Edit** button.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButton.EDIT")
      @js.native
      val EDIT: Double = js.native
      
      /**
        * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Fast Forward** button.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButton.FAST_FORWARD")
      @js.native
      val FAST_FORWARD: Double = js.native
      
      /**
        * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to create a fixed-width blank space
        * for spacing items in toolbars.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButton.FIXED_SPACE")
      @js.native
      val FIXED_SPACE: Double = js.native
      
      /**
        * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to create a flexible blank space
        * for spacing items in toolbars.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButton.FLEXIBLE_SPACE")
      @js.native
      val FLEXIBLE_SPACE: Double = js.native
      
      /**
        * Use with [Button.style](Titanium.UI.Button.style) to specify a dark-colored **Info** button.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButton.INFO_DARK")
      @js.native
      val INFO_DARK: Double = js.native
      
      /**
        * Use with [Button.style](Titanium.UI.Button.style) to specify a light-colored **Info** button.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButton.INFO_LIGHT")
      @js.native
      val INFO_LIGHT: Double = js.native
      
      /**
        * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify an **Organize** button.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButton.ORGANIZE")
      @js.native
      val ORGANIZE: Double = js.native
      
      /**
        * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Pause** button.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButton.PAUSE")
      @js.native
      val PAUSE: Double = js.native
      
      /**
        * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Play** button.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButton.PLAY")
      @js.native
      val PLAY: Double = js.native
      
      /**
        * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Refresh** button.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButton.REFRESH")
      @js.native
      val REFRESH: Double = js.native
      
      /**
        * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Reply** button.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButton.REPLY")
      @js.native
      val REPLY: Double = js.native
      
      /**
        * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Rewind** button.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButton.REWIND")
      @js.native
      val REWIND: Double = js.native
      
      /**
        * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Save** button.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButton.SAVE")
      @js.native
      val SAVE: Double = js.native
      
      /**
        * Identical to [ACTIVITY](Titanium.UI.iOS.SystemButton.ACTIVITY).
        */
      @JSGlobal("Titanium.UI.iOS.SystemButton.SPINNER")
      @js.native
      val SPINNER: Double = js.native
      
      /**
        * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Stop** button.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButton.STOP")
      @js.native
      val STOP: Double = js.native
      
      /**
        * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Trash** button.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButton.TRASH")
      @js.native
      val TRASH: Double = js.native
    }
    
    /**
      * A set of constants for the system button styles that can be used for the button `style` property.
      */
    object SystemButtonStyle {
      
      /**
        * A simple button style with a border.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButtonStyle.BORDERED")
      @js.native
      val BORDERED: Double = js.native
      
      /**
        * The style for a **Done** button--for example, a button that completes some task and returns
        * to the previous view.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButtonStyle.DONE")
      @js.native
      val DONE: Double = js.native
      
      /**
        * Specifies a borderless button, the default style for toolbars, button bars, and tabbed bars.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButtonStyle.PLAIN")
      @js.native
      val PLAIN: Double = js.native
      
      /**
        * Adds the specified callback as an event listener for the named event.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButtonStyle.addEventListener")
      @js.native
      def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
      
      /**
        * Fires a synthesized event to any registered listeners.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButtonStyle.fireEvent")
      @js.native
      def fireEvent(name: String): Unit = js.native
      @JSGlobal("Titanium.UI.iOS.SystemButtonStyle.fireEvent")
      @js.native
      def fireEvent(name: String, event: js.Any): Unit = js.native
      
      /**
        * Removes the specified callback as an event listener for the named event.
        */
      @JSGlobal("Titanium.UI.iOS.SystemButtonStyle.removeEventListener")
      @js.native
      def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    }
    
    /**
      * A set of constants for the system icon styles that can be used on a tab group tab.
      */
    object SystemIcon {
      
      /**
        * Bookmark style icon
        */
      @JSGlobal("Titanium.UI.iOS.SystemIcon.BOOKMARKS")
      @js.native
      val BOOKMARKS: Double = js.native
      
      /**
        * Contacts style icon
        */
      @JSGlobal("Titanium.UI.iOS.SystemIcon.CONTACTS")
      @js.native
      val CONTACTS: Double = js.native
      
      /**
        * Downloads style icon
        */
      @JSGlobal("Titanium.UI.iOS.SystemIcon.DOWNLOADS")
      @js.native
      val DOWNLOADS: Double = js.native
      
      /**
        * Favorites style icon
        */
      @JSGlobal("Titanium.UI.iOS.SystemIcon.FAVORITES")
      @js.native
      val FAVORITES: Double = js.native
      
      /**
        * Featured style icon
        */
      @JSGlobal("Titanium.UI.iOS.SystemIcon.FEATURED")
      @js.native
      val FEATURED: Double = js.native
      
      /**
        * History style icon
        */
      @JSGlobal("Titanium.UI.iOS.SystemIcon.HISTORY")
      @js.native
      val HISTORY: Double = js.native
      
      /**
        * More style icon
        */
      @JSGlobal("Titanium.UI.iOS.SystemIcon.MORE")
      @js.native
      val MORE: Double = js.native
      
      /**
        * Most recent style icon
        */
      @JSGlobal("Titanium.UI.iOS.SystemIcon.MOST_RECENT")
      @js.native
      val MOST_RECENT: Double = js.native
      
      /**
        * Most viewed style icon
        */
      @JSGlobal("Titanium.UI.iOS.SystemIcon.MOST_VIEWED")
      @js.native
      val MOST_VIEWED: Double = js.native
      
      /**
        * Recents style icon
        */
      @JSGlobal("Titanium.UI.iOS.SystemIcon.RECENTS")
      @js.native
      val RECENTS: Double = js.native
      
      /**
        * Search style icon
        */
      @JSGlobal("Titanium.UI.iOS.SystemIcon.SEARCH")
      @js.native
      val SEARCH: Double = js.native
      
      /**
        * Top rated style icon
        */
      @JSGlobal("Titanium.UI.iOS.SystemIcon.TOP_RATED")
      @js.native
      val TOP_RATED: Double = js.native
      
      /**
        * Adds the specified callback as an event listener for the named event.
        */
      @JSGlobal("Titanium.UI.iOS.SystemIcon.addEventListener")
      @js.native
      def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
      
      /**
        * Fires a synthesized event to any registered listeners.
        */
      @JSGlobal("Titanium.UI.iOS.SystemIcon.fireEvent")
      @js.native
      def fireEvent(name: String): Unit = js.native
      @JSGlobal("Titanium.UI.iOS.SystemIcon.fireEvent")
      @js.native
      def fireEvent(name: String, event: js.Any): Unit = js.native
      
      /**
        * Removes the specified callback as an event listener for the named event.
        */
      @JSGlobal("Titanium.UI.iOS.SystemIcon.removeEventListener")
      @js.native
      def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    }
    
    /**
      * String that represents the magnifying glass on the table view index bar
      */
    @JSGlobal("Titanium.UI.iOS.TABLEVIEW_INDEX_SEARCH")
    @js.native
    val TABLEVIEW_INDEX_SEARCH: String = js.native
    
    /**
      * A button bar that maintains a selected state.
      * @deprecated Use [Titanium.UI.TabbedBar](Titanium.UI.TabbedBar) instead.
      */
    @JSGlobal("Titanium.UI.iOS.TabbedBar")
    @js.native
    class TabbedBar ()
      extends typings.titanium.Titanium.UI.iOS.TabbedBar
    
    /**
      * A set of constants for the style that can be used for the `selectionStyle` property of
      * <Titanium.UI.TableViewRow>.
      */
    object TableViewCellSelectionStyle {
      
      /**
        * The cell when selected has a blue background. This is the default value.
        */
      @JSGlobal("Titanium.UI.iOS.TableViewCellSelectionStyle.BLUE")
      @js.native
      val BLUE: Double = js.native
      
      /**
        * Then cell when selected has a gray background.
        */
      @JSGlobal("Titanium.UI.iOS.TableViewCellSelectionStyle.GRAY")
      @js.native
      val GRAY: Double = js.native
      
      /**
        * The cell has no distinct style for when it is selected.
        */
      @JSGlobal("Titanium.UI.iOS.TableViewCellSelectionStyle.NONE")
      @js.native
      val NONE: Double = js.native
      
      /**
        * Adds the specified callback as an event listener for the named event.
        */
      @JSGlobal("Titanium.UI.iOS.TableViewCellSelectionStyle.addEventListener")
      @js.native
      def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
      
      /**
        * Fires a synthesized event to any registered listeners.
        */
      @JSGlobal("Titanium.UI.iOS.TableViewCellSelectionStyle.fireEvent")
      @js.native
      def fireEvent(name: String): Unit = js.native
      @JSGlobal("Titanium.UI.iOS.TableViewCellSelectionStyle.fireEvent")
      @js.native
      def fireEvent(name: String, event: js.Any): Unit = js.native
      
      /**
        * Removes the specified callback as an event listener for the named event.
        */
      @JSGlobal("Titanium.UI.iOS.TableViewCellSelectionStyle.removeEventListener")
      @js.native
      def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    }
    
    /**
      * A set of constants for the position value that can be used for the `position` property of
      * <Titanium.UI.TableView> when invoking `scrollToIndex`.
      */
    object TableViewScrollPosition {
      
      /**
        * The table view scrolls the row of interest to the bottom of the visible table view.
        */
      @JSGlobal("Titanium.UI.iOS.TableViewScrollPosition.BOTTOM")
      @js.native
      val BOTTOM: Double = js.native
      
      /**
        * The table view scrolls the row of interest to the middle of the visible table view.
        */
      @JSGlobal("Titanium.UI.iOS.TableViewScrollPosition.MIDDLE")
      @js.native
      val MIDDLE: Double = js.native
      
      /**
        * The table view scrolls the row of interest to be fully visible with a minimum of movement. If the row is already fully visible, no scrolling occurs. For example, if the row is above the visible area, the behavior is identical to that specified by `TOP`. This is the default.
        */
      @JSGlobal("Titanium.UI.iOS.TableViewScrollPosition.NONE")
      @js.native
      val NONE: Double = js.native
      
      /**
        * The table view scrolls the row of interest to the top of the visible table view.
        */
      @JSGlobal("Titanium.UI.iOS.TableViewScrollPosition.TOP")
      @js.native
      val TOP: Double = js.native
      
      /**
        * Adds the specified callback as an event listener for the named event.
        */
      @JSGlobal("Titanium.UI.iOS.TableViewScrollPosition.addEventListener")
      @js.native
      def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
      
      /**
        * Fires a synthesized event to any registered listeners.
        */
      @JSGlobal("Titanium.UI.iOS.TableViewScrollPosition.fireEvent")
      @js.native
      def fireEvent(name: String): Unit = js.native
      @JSGlobal("Titanium.UI.iOS.TableViewScrollPosition.fireEvent")
      @js.native
      def fireEvent(name: String, event: js.Any): Unit = js.native
      
      /**
        * Removes the specified callback as an event listener for the named event.
        */
      @JSGlobal("Titanium.UI.iOS.TableViewScrollPosition.removeEventListener")
      @js.native
      def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    }
    
    /**
      * A set of constants for the style that can be used for the `style` property of
      * <Titanium.UI.TableView> and <Titanium.UI.ListView>.
      */
    object TableViewStyle {
      
      /**
        * A table view whose sections present distinct groups of rows. The section headers and footers
        * do not float.
        */
      @JSGlobal("Titanium.UI.iOS.TableViewStyle.GROUPED")
      @js.native
      val GROUPED: Double = js.native
      
      /**
        * A table view whose sections present distinct groups of rows  and grouped sections are inset with rounded corners.
        * The section headers and footers do not float.
        */
      @JSGlobal("Titanium.UI.iOS.TableViewStyle.INSET_GROUPED")
      @js.native
      val INSET_GROUPED: Double = js.native
      
      /**
        * A plain table view. Any section headers or footers are displayed as inline separators and
        * float when the table view is scrolled.
        */
      @JSGlobal("Titanium.UI.iOS.TableViewStyle.PLAIN")
      @js.native
      val PLAIN: Double = js.native
      
      /**
        * Adds the specified callback as an event listener for the named event.
        */
      @JSGlobal("Titanium.UI.iOS.TableViewStyle.addEventListener")
      @js.native
      def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
      
      /**
        * Fires a synthesized event to any registered listeners.
        */
      @JSGlobal("Titanium.UI.iOS.TableViewStyle.fireEvent")
      @js.native
      def fireEvent(name: String): Unit = js.native
      @JSGlobal("Titanium.UI.iOS.TableViewStyle.fireEvent")
      @js.native
      def fireEvent(name: String, event: js.Any): Unit = js.native
      
      /**
        * Removes the specified callback as an event listener for the named event.
        */
      @JSGlobal("Titanium.UI.iOS.TableViewStyle.removeEventListener")
      @js.native
      def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    }
    
    /**
      * An iOS toolbar, which can contain buttons and certain other controls.
      * @deprecated Use the cross-platform [Titanium.UI.Toolbar](Titanium.UI.Toolbar) instead.
      */
    @JSGlobal("Titanium.UI.iOS.Toolbar")
    @js.native
    class Toolbar ()
      extends typings.titanium.Titanium.UI.iOS.Toolbar
    
    /**
      * A transition animation when opening or closing windows in a
      * <Titanium.UI.NavigationWindow> or <Titanium.UI.Tab>.
      * Use this proxy with the Window's
      * [transitionAnimation](Titanium.UI.Window.transitionAnimation) property.
      */
    @JSGlobal("Titanium.UI.iOS.TransitionAnimation")
    @js.native
    class TransitionAnimation ()
      extends typings.titanium.Titanium.UI.iOS.TransitionAnimation
    
    /**
      * Dynamic behavior to support connections between two items.
      */
    @JSGlobal("Titanium.UI.iOS.ViewAttachmentBehavior")
    @js.native
    class ViewAttachmentBehavior ()
      extends typings.titanium.Titanium.UI.iOS.ViewAttachmentBehavior
    
    /**
      * User tapped the back or forward button.
      * @deprecated Not used with Titanium SDK 8.0.0 and later by replacing UIWebView with WKWebView.
      */
    @JSGlobal("Titanium.UI.iOS.WEBVIEW_NAVIGATIONTYPE_BACK_FORWARD")
    @js.native
    val WEBVIEW_NAVIGATIONTYPE_BACK_FORWARD: scala.Nothing = js.native
    
    /**
      * User resubmitted a form.
      * @deprecated Not used with Titanium SDK 8.0.0 and later by replacing UIWebView with WKWebView.
      */
    @JSGlobal("Titanium.UI.iOS.WEBVIEW_NAVIGATIONTYPE_FORM_RESUBMITTED")
    @js.native
    val WEBVIEW_NAVIGATIONTYPE_FORM_RESUBMITTED: scala.Nothing = js.native
    
    /**
      * User submitted a form.
      * @deprecated Not used with Titanium SDK 8.0.0 and later by replacing UIWebView with WKWebView.
      */
    @JSGlobal("Titanium.UI.iOS.WEBVIEW_NAVIGATIONTYPE_FORM_SUBMITTED")
    @js.native
    val WEBVIEW_NAVIGATIONTYPE_FORM_SUBMITTED: scala.Nothing = js.native
    
    /**
      * User tapped a link.
      * @deprecated Not used with Titanium SDK 8.0.0 and later by replacing UIWebView with WKWebView.
      */
    @JSGlobal("Titanium.UI.iOS.WEBVIEW_NAVIGATIONTYPE_LINK_CLICKED")
    @js.native
    val WEBVIEW_NAVIGATIONTYPE_LINK_CLICKED: scala.Nothing = js.native
    
    /**
      * Some other action occurred.
      * @deprecated Not used with Titanium SDK 8.0.0 and later by replacing UIWebView with WKWebView.
      */
    @JSGlobal("Titanium.UI.iOS.WEBVIEW_NAVIGATIONTYPE_OTHER")
    @js.native
    val WEBVIEW_NAVIGATIONTYPE_OTHER: scala.Nothing = js.native
    
    /**
      * User tapped the reload button.
      * @deprecated Not used with Titanium SDK 8.0.0 and later by replacing UIWebView with WKWebView.
      */
    @JSGlobal("Titanium.UI.iOS.WEBVIEW_NAVIGATIONTYPE_RELOAD")
    @js.native
    val WEBVIEW_NAVIGATIONTYPE_RELOAD: scala.Nothing = js.native
    
    /**
      * A collection of properties used to initialize a web view.
      */
    @JSGlobal("Titanium.UI.iOS.WebViewConfiguration")
    @js.native
    class WebViewConfiguration ()
      extends typings.titanium.Titanium.UI.iOS.WebViewConfiguration
    
    /**
      * It represents the decision handler to tell to webview, whether allow or cancel the navigation.
      */
    @JSGlobal("Titanium.UI.iOS.WebViewDecisionHandler")
    @js.native
    class WebViewDecisionHandler ()
      extends typings.titanium.Titanium.UI.iOS.WebViewDecisionHandler
    
    /**
      * It represents a pool of Web Content processes.
      */
    @JSGlobal("Titanium.UI.iOS.WebViewProcessPool")
    @js.native
    class WebViewProcessPool ()
      extends typings.titanium.Titanium.UI.iOS.WebViewProcessPool
    
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.addEventListener")
    @js.native
    def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    
    /**
      * The name of the API that this proxy corresponds to.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.apiName")
    @js.native
    val apiName: String = js.native
    
    /**
      * Value of the badge for the application's springboard icon.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.appBadge")
    @js.native
    def appBadge: Double = js.native
    @scala.inline
    def appBadge_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appBadge")(x.asInstanceOf[js.Any])
    
    /**
      * Determines whether the shake to edit system-wide capability is enabled.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.appSupportsShakeToEdit")
    @js.native
    def appSupportsShakeToEdit: Boolean = js.native
    @scala.inline
    def appSupportsShakeToEdit_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appSupportsShakeToEdit")(x.asInstanceOf[js.Any])
    
    /**
      * Applies the properties to the proxy.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.applyProperties")
    @js.native
    def applyProperties(props: js.Any): Unit = js.native
    
    /**
      * Indicates if the proxy will bubble an event to its parent.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.bubbleParent")
    @js.native
    def bubbleParent: Boolean = js.native
    @scala.inline
    def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.AdView>.
      * @deprecated iAd has been deprecated in iOS 10 and SDK 5.5.0. It was removed as part of the SDK 7.0.0.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createAdView")
    @js.native
    def createAdView: scala.Nothing = js.native
    @scala.inline
    def createAdView_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createAdView")(x.asInstanceOf[js.Any])
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.AnchorAttachmentBehavior>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createAnchorAttachmentBehavior")
    @js.native
    def createAnchorAttachmentBehavior(): typings.titanium.Titanium.UI.iOS.AnchorAttachmentBehavior = js.native
    @JSGlobal("Titanium.UI.iOS.createAnchorAttachmentBehavior")
    @js.native
    def createAnchorAttachmentBehavior(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.AnchorAttachmentBehavior]): typings.titanium.Titanium.UI.iOS.AnchorAttachmentBehavior = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.Animator>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createAnimator")
    @js.native
    def createAnimator(): typings.titanium.Titanium.UI.iOS.Animator = js.native
    @JSGlobal("Titanium.UI.iOS.createAnimator")
    @js.native
    def createAnimator(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.Animator]): typings.titanium.Titanium.UI.iOS.Animator = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.ApplicationShortcuts>.
      * @deprecated Use [Titanium.UI.Shortcut](Titanium.UI.Shortcut) instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createApplicationShortcuts")
    @js.native
    def createApplicationShortcuts(): typings.titanium.Titanium.UI.iOS.ApplicationShortcuts = js.native
    @JSGlobal("Titanium.UI.iOS.createApplicationShortcuts")
    @js.native
    def createApplicationShortcuts(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.ApplicationShortcuts]): typings.titanium.Titanium.UI.iOS.ApplicationShortcuts = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.Attribute>.
      * @deprecated Use [Attribute](Attribute) instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createAttribute")
    @js.native
    def createAttribute: scala.Nothing = js.native
    @scala.inline
    def createAttribute_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createAttribute")(x.asInstanceOf[js.Any])
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.AttributedString>.
      * @deprecated Use [Titanium.UI.AttributedString](Titanium.UI.AttributedString) instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createAttributedString")
    @js.native
    def createAttributedString: scala.Nothing = js.native
    @scala.inline
    def createAttributedString_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createAttributedString")(x.asInstanceOf[js.Any])
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.BlurView>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createBlurView")
    @js.native
    def createBlurView(): typings.titanium.Titanium.UI.iOS.BlurView = js.native
    @JSGlobal("Titanium.UI.iOS.createBlurView")
    @js.native
    def createBlurView(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.BlurView]): typings.titanium.Titanium.UI.iOS.BlurView = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.CollisionBehavior>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createCollisionBehavior")
    @js.native
    def createCollisionBehavior(): typings.titanium.Titanium.UI.iOS.CollisionBehavior = js.native
    @JSGlobal("Titanium.UI.iOS.createCollisionBehavior")
    @js.native
    def createCollisionBehavior(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.CollisionBehavior]): typings.titanium.Titanium.UI.iOS.CollisionBehavior = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.CoverFlowView>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createCoverFlowView")
    @js.native
    def createCoverFlowView(): typings.titanium.Titanium.UI.iOS.CoverFlowView = js.native
    @JSGlobal("Titanium.UI.iOS.createCoverFlowView")
    @js.native
    def createCoverFlowView(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.CoverFlowView]): typings.titanium.Titanium.UI.iOS.CoverFlowView = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.DocumentViewer>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createDocumentViewer")
    @js.native
    def createDocumentViewer(): typings.titanium.Titanium.UI.iOS.DocumentViewer = js.native
    @JSGlobal("Titanium.UI.iOS.createDocumentViewer")
    @js.native
    def createDocumentViewer(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.DocumentViewer]): typings.titanium.Titanium.UI.iOS.DocumentViewer = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.DynamicItemBehavior>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createDynamicItemBehavior")
    @js.native
    def createDynamicItemBehavior(): typings.titanium.Titanium.UI.iOS.DynamicItemBehavior = js.native
    @JSGlobal("Titanium.UI.iOS.createDynamicItemBehavior")
    @js.native
    def createDynamicItemBehavior(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.DynamicItemBehavior]): typings.titanium.Titanium.UI.iOS.DynamicItemBehavior = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.FeedbackGenerator>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createFeedbackGenerator")
    @js.native
    def createFeedbackGenerator(): typings.titanium.Titanium.UI.iOS.FeedbackGenerator = js.native
    @JSGlobal("Titanium.UI.iOS.createFeedbackGenerator")
    @js.native
    def createFeedbackGenerator(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.FeedbackGenerator]): typings.titanium.Titanium.UI.iOS.FeedbackGenerator = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.GravityBehavior>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createGravityBehavior")
    @js.native
    def createGravityBehavior(): typings.titanium.Titanium.UI.iOS.GravityBehavior = js.native
    @JSGlobal("Titanium.UI.iOS.createGravityBehavior")
    @js.native
    def createGravityBehavior(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.GravityBehavior]): typings.titanium.Titanium.UI.iOS.GravityBehavior = js.native
    
    /**
      * Creates a live photo badge to be used together with the
      * <Titanium.UI.iOS.LivePhotoView> API.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createLivePhotoBadge")
    @js.native
    def createLivePhotoBadge(`type`: Double): typings.titanium.Titanium.Blob = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.LivePhotoView>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createLivePhotoView")
    @js.native
    def createLivePhotoView(): typings.titanium.Titanium.UI.iOS.LivePhotoView = js.native
    @JSGlobal("Titanium.UI.iOS.createLivePhotoView")
    @js.native
    def createLivePhotoView(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.LivePhotoView]): typings.titanium.Titanium.UI.iOS.LivePhotoView = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.MenuPopup>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createMenuPopup")
    @js.native
    def createMenuPopup(): typings.titanium.Titanium.UI.iOS.MenuPopup = js.native
    @JSGlobal("Titanium.UI.iOS.createMenuPopup")
    @js.native
    def createMenuPopup(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.MenuPopup]): typings.titanium.Titanium.UI.iOS.MenuPopup = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.NavigationWindow>.
      * @deprecated Use [Titanium.UI.NavigationWindow](Titanium.UI.NavigationWindow) instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createNavigationWindow")
    @js.native
    def createNavigationWindow(): typings.titanium.Titanium.UI.iOS.NavigationWindow = js.native
    @JSGlobal("Titanium.UI.iOS.createNavigationWindow")
    @js.native
    def createNavigationWindow(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.NavigationWindow]): typings.titanium.Titanium.UI.iOS.NavigationWindow = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.PreviewAction>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createPreviewAction")
    @js.native
    def createPreviewAction(): typings.titanium.Titanium.UI.iOS.PreviewAction = js.native
    @JSGlobal("Titanium.UI.iOS.createPreviewAction")
    @js.native
    def createPreviewAction(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.PreviewAction]): typings.titanium.Titanium.UI.iOS.PreviewAction = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.PreviewActionGroup>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createPreviewActionGroup")
    @js.native
    def createPreviewActionGroup(): typings.titanium.Titanium.UI.iOS.PreviewActionGroup = js.native
    @JSGlobal("Titanium.UI.iOS.createPreviewActionGroup")
    @js.native
    def createPreviewActionGroup(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.PreviewActionGroup]): typings.titanium.Titanium.UI.iOS.PreviewActionGroup = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.PreviewContext>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createPreviewContext")
    @js.native
    def createPreviewContext(): typings.titanium.Titanium.UI.iOS.PreviewContext = js.native
    @JSGlobal("Titanium.UI.iOS.createPreviewContext")
    @js.native
    def createPreviewContext(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.PreviewContext]): typings.titanium.Titanium.UI.iOS.PreviewContext = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.PushBehavior>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createPushBehavior")
    @js.native
    def createPushBehavior(): typings.titanium.Titanium.UI.iOS.PushBehavior = js.native
    @JSGlobal("Titanium.UI.iOS.createPushBehavior")
    @js.native
    def createPushBehavior(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.PushBehavior]): typings.titanium.Titanium.UI.iOS.PushBehavior = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.SnapBehavior>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createSnapBehavior")
    @js.native
    def createSnapBehavior(): typings.titanium.Titanium.UI.iOS.SnapBehavior = js.native
    @JSGlobal("Titanium.UI.iOS.createSnapBehavior")
    @js.native
    def createSnapBehavior(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.SnapBehavior]): typings.titanium.Titanium.UI.iOS.SnapBehavior = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.SplitWindow>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createSplitWindow")
    @js.native
    def createSplitWindow(): typings.titanium.Titanium.UI.iOS.SplitWindow = js.native
    @JSGlobal("Titanium.UI.iOS.createSplitWindow")
    @js.native
    def createSplitWindow(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.SplitWindow]): typings.titanium.Titanium.UI.iOS.SplitWindow = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.Stepper>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createStepper")
    @js.native
    def createStepper(): typings.titanium.Titanium.UI.iOS.Stepper = js.native
    @JSGlobal("Titanium.UI.iOS.createStepper")
    @js.native
    def createStepper(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.Stepper]): typings.titanium.Titanium.UI.iOS.Stepper = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.SystemButton>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createSystemButton")
    @js.native
    def createSystemButton(): typings.titanium.Titanium.UI.iOS.SystemButton = js.native
    @JSGlobal("Titanium.UI.iOS.createSystemButton")
    @js.native
    def createSystemButton(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.SystemButton]): typings.titanium.Titanium.UI.iOS.SystemButton = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.TabbedBar>.
      * @deprecated Use [Titanium.UI.TabbedBar](Titanium.UI.TabbedBar) instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createTabbedBar")
    @js.native
    def createTabbedBar(): typings.titanium.Titanium.UI.iOS.TabbedBar = js.native
    @JSGlobal("Titanium.UI.iOS.createTabbedBar")
    @js.native
    def createTabbedBar(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.TabbedBar]): typings.titanium.Titanium.UI.iOS.TabbedBar = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.Toolbar>.
      * @deprecated Use the cross-platform [Titanium.UI.Toolbar](Titanium.UI.Toolbar) instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createToolbar")
    @js.native
    def createToolbar(): typings.titanium.Titanium.UI.iOS.Toolbar = js.native
    @JSGlobal("Titanium.UI.iOS.createToolbar")
    @js.native
    def createToolbar(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.Toolbar]): typings.titanium.Titanium.UI.iOS.Toolbar = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.TransitionAnimation>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createTransitionAnimation")
    @js.native
    def createTransitionAnimation(): typings.titanium.Titanium.UI.iOS.TransitionAnimation = js.native
    @JSGlobal("Titanium.UI.iOS.createTransitionAnimation")
    @js.native
    def createTransitionAnimation(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.TransitionAnimation]): typings.titanium.Titanium.UI.iOS.TransitionAnimation = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.ViewAttachmentBehavior>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createViewAttachmentBehavior")
    @js.native
    def createViewAttachmentBehavior(): typings.titanium.Titanium.UI.iOS.ViewAttachmentBehavior = js.native
    @JSGlobal("Titanium.UI.iOS.createViewAttachmentBehavior")
    @js.native
    def createViewAttachmentBehavior(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.ViewAttachmentBehavior]): typings.titanium.Titanium.UI.iOS.ViewAttachmentBehavior = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.WebViewConfiguration>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createWebViewConfiguration")
    @js.native
    def createWebViewConfiguration(): typings.titanium.Titanium.UI.iOS.WebViewConfiguration = js.native
    @JSGlobal("Titanium.UI.iOS.createWebViewConfiguration")
    @js.native
    def createWebViewConfiguration(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.WebViewConfiguration]): typings.titanium.Titanium.UI.iOS.WebViewConfiguration = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.WebViewDecisionHandler>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createWebViewDecisionHandler")
    @js.native
    def createWebViewDecisionHandler(): typings.titanium.Titanium.UI.iOS.WebViewDecisionHandler = js.native
    @JSGlobal("Titanium.UI.iOS.createWebViewDecisionHandler")
    @js.native
    def createWebViewDecisionHandler(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.WebViewDecisionHandler]): typings.titanium.Titanium.UI.iOS.WebViewDecisionHandler = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iOS.WebViewProcessPool>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.createWebViewProcessPool")
    @js.native
    def createWebViewProcessPool(): typings.titanium.Titanium.UI.iOS.WebViewProcessPool = js.native
    @JSGlobal("Titanium.UI.iOS.createWebViewProcessPool")
    @js.native
    def createWebViewProcessPool(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.WebViewProcessPool]): typings.titanium.Titanium.UI.iOS.WebViewProcessPool = js.native
    
    /**
      * Fires a synthesized event to any registered listeners.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.fireEvent")
    @js.native
    def fireEvent(name: String): Unit = js.native
    @JSGlobal("Titanium.UI.iOS.fireEvent")
    @js.native
    def fireEvent(name: String, event: js.Any): Unit = js.native
    
    /**
      * Determines if the 3D-Touch capability "Force Touch" is supported (`true`) or not (`false`) by the device.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.forceTouchSupported")
    @js.native
    val forceTouchSupported: Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.UI.iOS.apiName> property.
      * @deprecated Access <Titanium.UI.iOS.apiName> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.getApiName")
    @js.native
    def getApiName(): String = js.native
    
    /**
      * Gets the value of the <Titanium.UI.iOS.appBadge> property.
      * @deprecated Access <Titanium.UI.iOS.appBadge> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.getAppBadge")
    @js.native
    def getAppBadge(): Double = js.native
    
    /**
      * Gets the value of the <Titanium.UI.iOS.appSupportsShakeToEdit> property.
      * @deprecated Access <Titanium.UI.iOS.appSupportsShakeToEdit> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.getAppSupportsShakeToEdit")
    @js.native
    def getAppSupportsShakeToEdit(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.UI.iOS.bubbleParent> property.
      * @deprecated Access <Titanium.UI.iOS.bubbleParent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.getBubbleParent")
    @js.native
    def getBubbleParent(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.UI.iOS.forceTouchSupported> property.
      * @deprecated Access <Titanium.UI.iOS.forceTouchSupported> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.getForceTouchSupported")
    @js.native
    def getForceTouchSupported(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.UI.iOS.statusBarBackgroundColor> property.
      * @deprecated Access <Titanium.UI.iOS.statusBarBackgroundColor> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.getStatusBarBackgroundColor")
    @js.native
    def getStatusBarBackgroundColor(): String | typings.titanium.Titanium.UI.Color = js.native
    
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.removeEventListener")
    @js.native
    def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.UI.iOS.appBadge> property.
      * @deprecated Set the value using <Titanium.UI.iOS.appBadge> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.setAppBadge")
    @js.native
    def setAppBadge(appBadge: Double): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.UI.iOS.appSupportsShakeToEdit> property.
      * @deprecated Set the value using <Titanium.UI.iOS.appSupportsShakeToEdit> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.setAppSupportsShakeToEdit")
    @js.native
    def setAppSupportsShakeToEdit(appSupportsShakeToEdit: Boolean): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.UI.iOS.bubbleParent> property.
      * @deprecated Set the value using <Titanium.UI.iOS.bubbleParent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.setBubbleParent")
    @js.native
    def setBubbleParent(bubbleParent: Boolean): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.UI.iOS.MODAL_PRESENTATION_CURRENT_CONTEXT> property.
      * @deprecated Set the value using <Titanium.UI.iOS.MODAL_PRESENTATION_CURRENT_CONTEXT> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.setMODAL_PRESENTATION_CURRENT_CONTEXT")
    @js.native
    def setMODALPRESENTATIONCURRENTCONTEXT(MODAL_PRESENTATION_CURRENT_CONTEXT: Double): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.UI.iOS.MODAL_PRESENTATION_OVER_CURRENT_CONTEXT> property.
      * @deprecated Set the value using <Titanium.UI.iOS.MODAL_PRESENTATION_OVER_CURRENT_CONTEXT> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.setMODAL_PRESENTATION_OVER_CURRENT_CONTEXT")
    @js.native
    def setMODALPRESENTATIONOVERCURRENTCONTEXT(MODAL_PRESENTATION_OVER_CURRENT_CONTEXT: Double): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.UI.iOS.MODAL_PRESENTATION_OVER_CURRENT_FULL_SCREEN> property.
      * @deprecated Set the value using <Titanium.UI.iOS.MODAL_PRESENTATION_OVER_CURRENT_FULL_SCREEN> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.setMODAL_PRESENTATION_OVER_CURRENT_FULL_SCREEN")
    @js.native
    def setMODALPRESENTATIONOVERCURRENTFULLSCREEN(MODAL_PRESENTATION_OVER_CURRENT_FULL_SCREEN: Double): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.UI.iOS.statusBarBackgroundColor> property.
      * @deprecated Set the value using <Titanium.UI.iOS.statusBarBackgroundColor> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.setStatusBarBackgroundColor")
    @js.native
    def setStatusBarBackgroundColor(statusBarBackgroundColor: String): Unit = js.native
    @JSGlobal("Titanium.UI.iOS.setStatusBarBackgroundColor")
    @js.native
    def setStatusBarBackgroundColor(statusBarBackgroundColor: typings.titanium.Titanium.UI.Color): Unit = js.native
    
    /**
      * Sets the global status bar background color for the application. Android does not support setting instances of <Titanium.UI.Color>
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.statusBarBackgroundColor")
    @js.native
    def statusBarBackgroundColor: String | typings.titanium.Titanium.UI.Color = js.native
    @scala.inline
    def statusBarBackgroundColor_=(x: String | typings.titanium.Titanium.UI.Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statusBarBackgroundColor")(x.asInstanceOf[js.Any])
    
    /**
      * Get image from SF Symbols provided by Apple.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iOS.systemImage")
    @js.native
    def systemImage(name: String): typings.titanium.Titanium.Blob = js.native
  }
  
  /**
    * iPad specific UI capabilities.
    */
  @JSGlobal("Titanium.UI.iPad")
  @js.native
  class iPad ()
    extends typings.titanium.Titanium.Proxy
  /**
    * iPad specific UI capabilities.
    */
  object iPad {
    
    @JSGlobal("Titanium.UI.iPad")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A DocumentViewer provides in-app support for managing user interactions with files on the
      * local system.
      * @deprecated Use [Titanium.UI.iOS.DocumentViewer](Titanium.UI.iOS.DocumentViewer) instead.
      */
    @JSGlobal("Titanium.UI.iPad.DocumentViewer")
    @js.native
    val DocumentViewer: scala.Nothing = js.native
    
    /**
      * An arrow that points in any direction.
      */
    @JSGlobal("Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_ANY")
    @js.native
    val POPOVER_ARROW_DIRECTION_ANY: Double = js.native
    
    /**
      * An arrow that points downward.
      */
    @JSGlobal("Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_DOWN")
    @js.native
    val POPOVER_ARROW_DIRECTION_DOWN: Double = js.native
    
    /**
      * An arrow that points toward the left.
      */
    @JSGlobal("Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_LEFT")
    @js.native
    val POPOVER_ARROW_DIRECTION_LEFT: Double = js.native
    
    /**
      * An arrow that points toward the right.
      */
    @JSGlobal("Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_RIGHT")
    @js.native
    val POPOVER_ARROW_DIRECTION_RIGHT: Double = js.native
    
    /**
      * The status of the arrow is currently unknown.
      */
    @JSGlobal("Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_UNKNOWN")
    @js.native
    val POPOVER_ARROW_DIRECTION_UNKNOWN: Double = js.native
    
    /**
      * An arrow that points upward.
      */
    @JSGlobal("Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_UP")
    @js.native
    val POPOVER_ARROW_DIRECTION_UP: Double = js.native
    
    /**
      * A Popover is used to manage the presentation of content in a popover.
      */
    @JSGlobal("Titanium.UI.iPad.Popover")
    @js.native
    class Popover ()
      extends typings.titanium.Titanium.UI.iPad.Popover
    
    /**
      * A SplitWindow is a window that manages the presentation of two side-by-side view
      * controllers.
      * @deprecated Use [Titanium.UI.iOS.SplitWindow](Titanium.UI.iOS.SplitWindow) instead.
      */
    @JSGlobal("Titanium.UI.iPad.SplitWindow")
    @js.native
    val SplitWindow: scala.Nothing = js.native
    
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iPad.addEventListener")
    @js.native
    def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    
    /**
      * The name of the API that this proxy corresponds to.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iPad.apiName")
    @js.native
    val apiName: String = js.native
    
    /**
      * Applies the properties to the proxy.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iPad.applyProperties")
    @js.native
    def applyProperties(props: js.Any): Unit = js.native
    
    /**
      * Indicates if the proxy will bubble an event to its parent.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iPad.bubbleParent")
    @js.native
    def bubbleParent: Boolean = js.native
    @scala.inline
    def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
    
    /**
      * Creates and returns an instance of <Titanium.UI.iPad.DocumentViewer>.
      * @deprecated Use [Titanium.UI.iOS.DocumentViewer](Titanium.UI.iOS.DocumentViewer) instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iPad.createDocumentViewer")
    @js.native
    def createDocumentViewer: scala.Nothing = js.native
    @scala.inline
    def createDocumentViewer_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createDocumentViewer")(x.asInstanceOf[js.Any])
    
    /**
      * Creates and returns an instance of <Titanium.UI.iPad.Popover>.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iPad.createPopover")
    @js.native
    def createPopover(): typings.titanium.Titanium.UI.iPad.Popover = js.native
    @JSGlobal("Titanium.UI.iPad.createPopover")
    @js.native
    def createPopover(parameters: Dictionary[typings.titanium.Titanium.UI.iPad.Popover]): typings.titanium.Titanium.UI.iPad.Popover = js.native
    
    /**
      * Creates and returns an instance of <Titanium.UI.iPad.SplitWindow>.
      * @deprecated Use [Titanium.UI.iOS.SplitWindow](Titanium.UI.iOS.SplitWindow) instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iPad.createSplitWindow")
    @js.native
    def createSplitWindow: scala.Nothing = js.native
    @scala.inline
    def createSplitWindow_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createSplitWindow")(x.asInstanceOf[js.Any])
    
    /**
      * Fires a synthesized event to any registered listeners.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iPad.fireEvent")
    @js.native
    def fireEvent(name: String): Unit = js.native
    @JSGlobal("Titanium.UI.iPad.fireEvent")
    @js.native
    def fireEvent(name: String, event: js.Any): Unit = js.native
    
    /**
      * Gets the value of the <Titanium.UI.iPad.apiName> property.
      * @deprecated Access <Titanium.UI.iPad.apiName> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iPad.getApiName")
    @js.native
    def getApiName(): String = js.native
    
    /**
      * Gets the value of the <Titanium.UI.iPad.bubbleParent> property.
      * @deprecated Access <Titanium.UI.iPad.bubbleParent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iPad.getBubbleParent")
    @js.native
    def getBubbleParent(): Boolean = js.native
    
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iPad.removeEventListener")
    @js.native
    def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.UI.iPad.bubbleParent> property.
      * @deprecated Set the value using <Titanium.UI.iPad.bubbleParent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.UI.iPad.setBubbleParent")
    @js.native
    def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  }
  
  /**
    * The iPhone/iPad-specific UI capabilities.  All properties, methods and events in this namespace
    * will only work on Apple iOS systems.
    * @deprecated Use the unified [Titanium.UI.iOS](Titanium.UI.iOS) namespace instead.
    */
  @JSGlobal("Titanium.UI.iPhone")
  @js.native
  val iPhone: scala.Nothing = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.UI.lifecycleContainer")
  @js.native
  def lifecycleContainer: typings.titanium.Titanium.UI.Window | typings.titanium.Titanium.UI.TabGroup = js.native
  @scala.inline
  def lifecycleContainer_=(x: typings.titanium.Titanium.UI.Window | typings.titanium.Titanium.UI.TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
  
  /**
    * Updates the orientation of the current window to the specified orientation value.
    * @deprecated Use [Titanium.UI.Window.orientationModes](Titanium.UI.Window.orientationModes) instead.
    */
  /* static member */
  @JSGlobal("Titanium.UI.orientation")
  @js.native
  def orientation: scala.Nothing = js.native
  @scala.inline
  def orientation_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orientation")(x.asInstanceOf[js.Any])
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.UI.removeEventListener")
  @js.native
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.UI.removeEventListener")
  @js.native
  def removeEventListener_userinterfacestyle(
    name: userinterfacestyle,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.UI, /* event */ UIUserinterfacestyleEvent, Unit]
  ): Unit = js.native
  
  /**
    * The current mode for the device (corresponding to night/dark or light/normal)
    * @deprecated Use [userInterfaceStyle](Titanium.UI.userInterfaceStyle) instead.
    */
  /* static member */
  @JSGlobal("Titanium.UI.semanticColorType")
  @js.native
  def semanticColorType: String = js.native
  @scala.inline
  def semanticColorType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("semanticColorType")(x.asInstanceOf[js.Any])
  
  /**
    * Sets the value of the <Titanium.UI.backgroundColor> property.
    * @deprecated Set the value using <Titanium.UI.backgroundColor> instead.
    */
  /* static member */
  @JSGlobal("Titanium.UI.setBackgroundColor")
  @js.native
  def setBackgroundColor(backgroundColor: String): Unit = js.native
  @JSGlobal("Titanium.UI.setBackgroundColor")
  @js.native
  def setBackgroundColor(backgroundColor: typings.titanium.Titanium.UI.Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.backgroundImage> property.
    * @deprecated Set the value using <Titanium.UI.backgroundImage> instead.
    */
  /* static member */
  @JSGlobal("Titanium.UI.setBackgroundImage")
  @js.native
  def setBackgroundImage(backgroundImage: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.bubbleParent> property.
    * @deprecated Set the value using <Titanium.UI.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.UI.setBubbleParent")
  @js.native
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.currentTab> property.
    * @deprecated
    */
  /* static member */
  @JSGlobal("Titanium.UI.setCurrentTab")
  @js.native
  def setCurrentTab: scala.Nothing = js.native
  @scala.inline
  def setCurrentTab_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setCurrentTab")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Titanium.UI.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: typings.titanium.Titanium.UI.TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.UI.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.UI.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: typings.titanium.Titanium.UI.Window): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.orientation> property.
    * @deprecated Use [Titanium.UI.Window.orientationModes](Titanium.UI.Window.orientationModes) instead.
    */
  /* static member */
  @JSGlobal("Titanium.UI.setOrientation")
  @js.native
  def setOrientation: scala.Nothing = js.native
  @scala.inline
  def setOrientation_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setOrientation")(x.asInstanceOf[js.Any])
  
  /**
    * Sets the value of the <Titanium.UI.semanticColorType> property.
    * @deprecated Use [userInterfaceStyle](Titanium.UI.userInterfaceStyle) instead.
    */
  /* static member */
  @JSGlobal("Titanium.UI.setSemanticColorType")
  @js.native
  def setSemanticColorType(semanticColorType: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.tintColor> property.
    * @deprecated Set the value using <Titanium.UI.tintColor> instead.
    */
  /* static member */
  @JSGlobal("Titanium.UI.setTintColor")
  @js.native
  def setTintColor(tintColor: String): Unit = js.native
  @JSGlobal("Titanium.UI.setTintColor")
  @js.native
  def setTintColor(tintColor: typings.titanium.Titanium.UI.Color): Unit = js.native
  
  /**
    * Sets the global tint color of the application. It is inherited by the child views and can be
    * overwritten by them using the `tintColor` property.
    */
  /* static member */
  @JSGlobal("Titanium.UI.tintColor")
  @js.native
  def tintColor: String | typings.titanium.Titanium.UI.Color = js.native
  @scala.inline
  def tintColor_=(x: String | typings.titanium.Titanium.UI.Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(x.asInstanceOf[js.Any])
  
  /**
    * The style associated with the user interface.
    */
  /* static member */
  @JSGlobal("Titanium.UI.userInterfaceStyle")
  @js.native
  val userInterfaceStyle: Double = js.native
}
