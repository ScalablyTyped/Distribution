package typings.themeUi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.BorderProperty
import typings.csstype.mod.BorderRadiusProperty
import typings.csstype.mod.BorderWidthProperty
import typings.csstype.mod.BoxShadowProperty
import typings.csstype.mod.FontFamilyProperty
import typings.csstype.mod.FontSizeProperty
import typings.csstype.mod.FontWeightProperty
import typings.csstype.mod.HeightProperty
import typings.csstype.mod.LetterSpacingProperty
import typings.csstype.mod.LineHeightProperty
import typings.csstype.mod.MarginProperty
import typings.csstype.mod.StandardProperties
import typings.csstype.mod.WidthProperty
import typings.csstype.mod.ZIndexProperty
import typings.std.Record
import typings.styledSystem.mod.TLengthStyledSystem
import typings.styledSystemCss.mod.SystemStyleObject
import typings.themeUi.anon.ColorModemodeskstringColo
import typings.themeUi.anon.PinStyledTagsSystemStyleO
import typings.themeUi.themeUiNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent theme-ui.theme-ui.Omit<styled-system.styled-system.Theme<styled-system.styled-system.TLengthStyledSystem>, 'colors' | 'buttons'> */
trait Theme extends js.Object {
  /**
    * Alert variants can be defined in `theme.alerts`. The `Alert` component uses
    * `theme.alerts.primary` as its default variant.
    *
    * @see https://theme-ui.com/theme-spec#variants
    * @see https://theme-ui.com/components/variants
    * @see https://theme-ui.com/components/alert#variants
    */
  var alerts: js.UndefOr[Record[String, SystemStyleObject]] = js.undefined
  /**
    * Badge variants can be defined in `theme.badges`. The `Badge` component uses
    * `theme.badges.primary` as its default variant.
    *
    * @see https://theme-ui.com/theme-spec#variants
    * @see https://theme-ui.com/components/variants
    * @see https://theme-ui.com/components/badge#variants
    */
  var badges: js.UndefOr[Record[String, SystemStyleObject]] = js.undefined
  var borderStyles: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[BorderProperty[js.Object], /* keyof any */ String]
  ] = js.undefined
  var borderWidths: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[BorderWidthProperty[TLengthStyledSystem], /* keyof any */ String]
  ] = js.undefined
  var borders: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[BorderProperty[js.Object], /* keyof any */ String]
  ] = js.undefined
  var breakpoints: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String]
  ] = js.undefined
  /**
    * Button variants can be defined in the `theme.buttons` object. The `Button`
    * component uses `theme.buttons.primary` as its default variant style.
    *
    * @see https://theme-ui.com/theme-spec#variants
    * @see https://theme-ui.com/components/variants
    * @see https://theme-ui.com/components/button#variants
    */
  var buttons: js.UndefOr[Record[String, SystemStyleObject]] = js.undefined
  /**
    * Card style variants can be defined in `the theme.cards` object. By default
    * the `Card` component uses the `theme.cards.primary` variant.
    *
    * @see https://theme-ui.com/theme-spec#variants
    * @see https://theme-ui.com/components/variants
    * @see https://theme-ui.com/components/card#variants
    */
  var cards: js.UndefOr[Record[String, SystemStyleObject]] = js.undefined
  var colorStyles: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]
  ] = js.undefined
  /**
    * Define the colors that are available through this theme
    */
  var colors: js.UndefOr[ColorModemodeskstringColo] = js.undefined
  var fontSizes: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[FontSizeProperty[Double], /* keyof any */ String]
  ] = js.undefined
  var fontWeights: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[FontWeightProperty, /* keyof any */ String]
  ] = js.undefined
  var fonts: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[FontFamilyProperty, /* keyof any */ String]
  ] = js.undefined
  /**
    * Label variants can be defined in `theme.forms` and the component uses the
    * `theme.forms.label` variant by default.
    *
    * Input variants can be defined in `theme.forms` and the component uses the
    * `theme.forms.input` variant by default.
    *
    * Select variants can be defined in `theme.forms` and the component uses the
    * `theme.forms.select` variant by default.
    *
    * Textarea variants can be defined in `theme.forms` and the component uses
    * the `theme.forms.textarea` variant by default.
    *
    * Radio variants can be defined in `theme.forms` and the component uses the
    * `theme.forms.radio` variant by default.
    *
    * Checkbox variants can be defined in `theme.forms` and the component uses
    * the `theme.forms.checkbox` variant by default.
    *
    * Slider variants can be defined in the `theme.forms` object. The `Slider`
    * component uses `theme.forms.slider` as its default variant style.
    *
    * @see https://theme-ui.com/theme-spec#variants
    * @see https://theme-ui.com/components/variants
    * @see https://theme-ui.com/components/label#variants
    * @see https://theme-ui.com/components/input#variants
    * @see https://theme-ui.com/components/select#variants
    * @see https://theme-ui.com/components/textarea#variants
    * @see https://theme-ui.com/components/radio#variants
    * @see https://theme-ui.com/components/checkbox#variants
    * @see https://theme-ui.com/components/slider#variants
    */
  var forms: js.UndefOr[Record[String, SystemStyleObject]] = js.undefined
  /**
    * You can define additional CSS grid layouts by adding variants to the
    * `theme.grids` object. These styles can be used to create a wide variety of
    * different reusable layouts.
    *
    * @see https://theme-ui.com/theme-spec#variants
    * @see https://theme-ui.com/components/variants
    * @see https://theme-ui.com/components/grid#variants
    */
  var grids: js.UndefOr[Record[String, SystemStyleObject]] = js.undefined
  /**
    * Image style variants can be defined in the `theme.images` object.
    *
    * @see https://theme-ui.com/theme-spec#variants
    * @see https://theme-ui.com/components/variants
    * @see https://theme-ui.com/components/image#variants
    */
  var images: js.UndefOr[Record[String, SystemStyleObject]] = js.undefined
  /**
    * The key used for the top-level color palette in `theme.colors`.
    *
    * @defaultValue 'default'
    * @see https://theme-ui.com/theming#configuration-flags
    */
  var initialColorModeName: js.UndefOr[String] = js.undefined
  /**
    * Container variants can be defined in the `theme.layout` object. The
    * `Container` component uses `theme.layout.container` as its default variant
    * style.
    *
    * @see https://theme-ui.com/theme-spec#variants
    * @see https://theme-ui.com/components/variants
    * @see https://theme-ui.com/components/container#variants
    */
  var layout: js.UndefOr[Record[String, SystemStyleObject]] = js.undefined
  var letterSpacings: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[LetterSpacingProperty[TLengthStyledSystem], /* keyof any */ String]
  ] = js.undefined
  var lineHeights: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[LineHeightProperty[TLengthStyledSystem], /* keyof any */ String]
  ] = js.undefined
  /**
    * Link variants can be defined in the `theme.links` object. By default the
    * `Link` component will use styles defined in `theme.styles.a`.
    *
    * @see https://theme-ui.com/theme-spec#variants
    * @see https://theme-ui.com/components/variants
    * @see https://theme-ui.com/components/link#variants
    */
  var links: js.UndefOr[Record[String, SystemStyleObject]] = js.undefined
  var mediaQueries: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Message variants can be defined in the `theme.messages` object.
    *
    * @see https://theme-ui.com/theme-spec#variants
    * @see https://theme-ui.com/components/variants
    * @see https://theme-ui.com/components/message#variants
    */
  var messages: js.UndefOr[Record[String, SystemStyleObject]] = js.undefined
  var radii: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[BorderRadiusProperty[TLengthStyledSystem], /* keyof any */ String]
  ] = js.undefined
  var shadows: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[BoxShadowProperty, /* keyof any */ String]
  ] = js.undefined
  var sizes: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[HeightProperty[js.Object] | WidthProperty[js.Object], /* keyof any */ String]
  ] = js.undefined
  var space: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[MarginProperty[Double | String], /* keyof any */ String]
  ] = js.undefined
  /**
    * Styles for elements rendered in MDX can be added to the theme.styles
    * object. This is the primary, low-level way to control typographic and
    * other styles in markdown content. Styles within this object are processed
    * with @styled-system/css and have access to base theme values like colors,
    * fonts, etc.
    */
  var styles: js.UndefOr[PinStyledTagsSystemStyleO] = js.undefined
  /**
    * Text style variants can be defined in the `theme.text` object. The `Text`
    * component uses `theme.text.default` as its default variant style.
    *
    * @see https://theme-ui.com/theme-spec#variants
    * @see https://theme-ui.com/components/variants
    * @see https://theme-ui.com/components/text#variants
    */
  var text: js.UndefOr[Record[String, SystemStyleObject]] = js.undefined
  var textStyles: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]
  ] = js.undefined
  /**
    * Adds styles defined in `theme.styles.roo`t to the `<body>` element along
    * with `color` and `background-color`.
    *
    * @defaultValue true
    * @see https://theme-ui.com/color-modes#applying-colors
    */
  var useBodyStyles: js.UndefOr[Boolean] = js.undefined
  /**
    * Adds a global `box-sizing: border-box` style.
    *
    * @defaultValue true
    * @see https://theme-ui.com/theming#configuration-flags
    */
  var useBorderBox: js.UndefOr[Boolean] = js.undefined
  /**
    * Initializes the color mode based on the `prefers-color-scheme` media
    * query.
    *
    * @defaultValue false
    * @see https://theme-ui.com/color-modes#initialize-mode-with-prefers-color-scheme-media-query
    */
  var useColorSchemeMediaQuery: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable/disable custom CSS properties/variables if lower browser
    * support is required (for eg. IE 11).
    *
    * @defaultValue true
    * @see https://theme-ui.com/color-modes/#turn-off-custom-properties
    */
  var useCustomProperties: js.UndefOr[Boolean] = js.undefined
  /**
    * Persists the color mode in `localStorage`.
    *
    * @defaultValue true
    * @see https://theme-ui.com/color-modes#disable-persisting-color-mode-on-localstorage
    */
  var useLocalStorage: js.UndefOr[Boolean] = js.undefined
  var zIndices: js.UndefOr[typings.styledSystem.mod.ObjectOrArray[ZIndexProperty, /* keyof any */ String]] = js.undefined
}

object Theme {
  @scala.inline
  def apply(
    alerts: Record[String, SystemStyleObject] = null,
    badges: Record[String, SystemStyleObject] = null,
    borderStyles: typings.styledSystem.mod.ObjectOrArray[BorderProperty[js.Object], /* keyof any */ String] = null,
    borderWidths: typings.styledSystem.mod.ObjectOrArray[BorderWidthProperty[TLengthStyledSystem], /* keyof any */ String] = null,
    borders: typings.styledSystem.mod.ObjectOrArray[BorderProperty[js.Object], /* keyof any */ String] = null,
    breakpoints: typings.styledSystem.mod.ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String] = null,
    buttons: Record[String, SystemStyleObject] = null,
    cards: Record[String, SystemStyleObject] = null,
    colorStyles: typings.styledSystem.mod.ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String] = null,
    colors: ColorModemodeskstringColo = null,
    fontSizes: typings.styledSystem.mod.ObjectOrArray[FontSizeProperty[Double], /* keyof any */ String] = null,
    fontWeights: typings.styledSystem.mod.ObjectOrArray[FontWeightProperty, /* keyof any */ String] = null,
    fonts: typings.styledSystem.mod.ObjectOrArray[FontFamilyProperty, /* keyof any */ String] = null,
    forms: Record[String, SystemStyleObject] = null,
    grids: Record[String, SystemStyleObject] = null,
    images: Record[String, SystemStyleObject] = null,
    initialColorModeName: String = null,
    layout: Record[String, SystemStyleObject] = null,
    letterSpacings: typings.styledSystem.mod.ObjectOrArray[LetterSpacingProperty[TLengthStyledSystem], /* keyof any */ String] = null,
    lineHeights: typings.styledSystem.mod.ObjectOrArray[LineHeightProperty[TLengthStyledSystem], /* keyof any */ String] = null,
    links: Record[String, SystemStyleObject] = null,
    mediaQueries: StringDictionary[String] = null,
    messages: Record[String, SystemStyleObject] = null,
    radii: typings.styledSystem.mod.ObjectOrArray[BorderRadiusProperty[TLengthStyledSystem], /* keyof any */ String] = null,
    shadows: typings.styledSystem.mod.ObjectOrArray[BoxShadowProperty, /* keyof any */ String] = null,
    sizes: typings.styledSystem.mod.ObjectOrArray[HeightProperty[js.Object] | WidthProperty[js.Object], /* keyof any */ String] = null,
    space: typings.styledSystem.mod.ObjectOrArray[MarginProperty[Double | String], /* keyof any */ String] = null,
    styles: PinStyledTagsSystemStyleO = null,
    text: Record[String, SystemStyleObject] = null,
    textStyles: typings.styledSystem.mod.ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String] = null,
    useBodyStyles: js.UndefOr[Boolean] = js.undefined,
    useBorderBox: js.UndefOr[Boolean] = js.undefined,
    useColorSchemeMediaQuery: js.UndefOr[Boolean] = js.undefined,
    useCustomProperties: js.UndefOr[Boolean] = js.undefined,
    useLocalStorage: js.UndefOr[Boolean] = js.undefined,
    zIndices: typings.styledSystem.mod.ObjectOrArray[ZIndexProperty, /* keyof any */ String] = null
  ): Theme = {
    val __obj = js.Dynamic.literal()
    if (alerts != null) __obj.updateDynamic("alerts")(alerts.asInstanceOf[js.Any])
    if (badges != null) __obj.updateDynamic("badges")(badges.asInstanceOf[js.Any])
    if (borderStyles != null) __obj.updateDynamic("borderStyles")(borderStyles.asInstanceOf[js.Any])
    if (borderWidths != null) __obj.updateDynamic("borderWidths")(borderWidths.asInstanceOf[js.Any])
    if (borders != null) __obj.updateDynamic("borders")(borders.asInstanceOf[js.Any])
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (cards != null) __obj.updateDynamic("cards")(cards.asInstanceOf[js.Any])
    if (colorStyles != null) __obj.updateDynamic("colorStyles")(colorStyles.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (fontSizes != null) __obj.updateDynamic("fontSizes")(fontSizes.asInstanceOf[js.Any])
    if (fontWeights != null) __obj.updateDynamic("fontWeights")(fontWeights.asInstanceOf[js.Any])
    if (fonts != null) __obj.updateDynamic("fonts")(fonts.asInstanceOf[js.Any])
    if (forms != null) __obj.updateDynamic("forms")(forms.asInstanceOf[js.Any])
    if (grids != null) __obj.updateDynamic("grids")(grids.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (initialColorModeName != null) __obj.updateDynamic("initialColorModeName")(initialColorModeName.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (letterSpacings != null) __obj.updateDynamic("letterSpacings")(letterSpacings.asInstanceOf[js.Any])
    if (lineHeights != null) __obj.updateDynamic("lineHeights")(lineHeights.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (mediaQueries != null) __obj.updateDynamic("mediaQueries")(mediaQueries.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (radii != null) __obj.updateDynamic("radii")(radii.asInstanceOf[js.Any])
    if (shadows != null) __obj.updateDynamic("shadows")(shadows.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textStyles != null) __obj.updateDynamic("textStyles")(textStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(useBodyStyles)) __obj.updateDynamic("useBodyStyles")(useBodyStyles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useBorderBox)) __obj.updateDynamic("useBorderBox")(useBorderBox.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useColorSchemeMediaQuery)) __obj.updateDynamic("useColorSchemeMediaQuery")(useColorSchemeMediaQuery.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useCustomProperties)) __obj.updateDynamic("useCustomProperties")(useCustomProperties.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useLocalStorage)) __obj.updateDynamic("useLocalStorage")(useLocalStorage.get.asInstanceOf[js.Any])
    if (zIndices != null) __obj.updateDynamic("zIndices")(zIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
}

