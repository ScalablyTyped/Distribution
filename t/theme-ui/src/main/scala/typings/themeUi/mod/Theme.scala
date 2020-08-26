package typings.themeUi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.StandardProperties
import typings.std.Record
import typings.styledSystemCss.mod.SystemStyleObject
import typings.themeUi.anon.ColorModemodeskstringColo
import typings.themeUi.anon.PinStyledTagsSystemStyleO
import typings.themeUi.themeUiNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent theme-ui.theme-ui.Omit<styled-system.styled-system.Theme<styled-system.styled-system.TLengthStyledSystem>, 'colors' | 'buttons'> */
@js.native
trait Theme extends js.Object {
  /**
    * Alert variants can be defined in `theme.alerts`. The `Alert` component uses
    * `theme.alerts.primary` as its default variant.
    *
    * @see https://theme-ui.com/theme-spec#variants
    * @see https://theme-ui.com/components/variants
    * @see https://theme-ui.com/components/alert#variants
    */
  var alerts: js.UndefOr[Record[String, SystemStyleObject]] = js.native
  /**
    * Badge variants can be defined in `theme.badges`. The `Badge` component uses
    * `theme.badges.primary` as its default variant.
    *
    * @see https://theme-ui.com/theme-spec#variants
    * @see https://theme-ui.com/components/variants
    * @see https://theme-ui.com/components/badge#variants
    */
  var badges: js.UndefOr[Record[String, SystemStyleObject]] = js.native
  var borderStyles: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderProperty<{}> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  var borderWidths: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderWidthProperty<TLength> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  var borders: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderProperty<{}> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  var breakpoints: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String]
  ] = js.native
  /**
    * Button variants can be defined in the `theme.buttons` object. The `Button`
    * component uses `theme.buttons.primary` as its default variant style.
    *
    * @see https://theme-ui.com/theme-spec#variants
    * @see https://theme-ui.com/components/variants
    * @see https://theme-ui.com/components/button#variants
    */
  var buttons: js.UndefOr[Record[String, SystemStyleObject]] = js.native
  /**
    * Card style variants can be defined in `the theme.cards` object. By default
    * the `Card` component uses the `theme.cards.primary` variant.
    *
    * @see https://theme-ui.com/theme-spec#variants
    * @see https://theme-ui.com/components/variants
    * @see https://theme-ui.com/components/card#variants
    */
  var cards: js.UndefOr[Record[String, SystemStyleObject]] = js.native
  var colorStyles: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[
      StandardProperties[(String with js.Object) | `0`, String with js.Object], 
      /* keyof any */ String
    ]
  ] = js.native
  /**
    * Define the colors that are available through this theme
    */
  var colors: js.UndefOr[ColorModemodeskstringColo] = js.native
  var fontSizes: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontSizeProperty<number> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  var fontWeights: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontWeightProperty */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  var fonts: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontFamilyProperty */ _, 
      /* keyof any */ String
    ]
  ] = js.native
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
  var forms: js.UndefOr[Record[String, SystemStyleObject]] = js.native
  /**
    * You can define additional CSS grid layouts by adding variants to the
    * `theme.grids` object. These styles can be used to create a wide variety of
    * different reusable layouts.
    *
    * @see https://theme-ui.com/theme-spec#variants
    * @see https://theme-ui.com/components/variants
    * @see https://theme-ui.com/components/grid#variants
    */
  var grids: js.UndefOr[Record[String, SystemStyleObject]] = js.native
  /**
    * Image style variants can be defined in the `theme.images` object.
    *
    * @see https://theme-ui.com/theme-spec#variants
    * @see https://theme-ui.com/components/variants
    * @see https://theme-ui.com/components/image#variants
    */
  var images: js.UndefOr[Record[String, SystemStyleObject]] = js.native
  /**
    * The key used for the top-level color palette in `theme.colors`.
    *
    * @defaultValue 'default'
    * @see https://theme-ui.com/theming#configuration-flags
    */
  var initialColorModeName: js.UndefOr[String] = js.native
  /**
    * Container variants can be defined in the `theme.layout` object. The
    * `Container` component uses `theme.layout.container` as its default variant
    * style.
    *
    * @see https://theme-ui.com/theme-spec#variants
    * @see https://theme-ui.com/components/variants
    * @see https://theme-ui.com/components/container#variants
    */
  var layout: js.UndefOr[Record[String, SystemStyleObject]] = js.native
  var letterSpacings: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.LetterSpacingProperty<TLength> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  var lineHeights: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.LineHeightProperty<TLength> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  /**
    * Link variants can be defined in the `theme.links` object. By default the
    * `Link` component will use styles defined in `theme.styles.a`.
    *
    * @see https://theme-ui.com/theme-spec#variants
    * @see https://theme-ui.com/components/variants
    * @see https://theme-ui.com/components/link#variants
    */
  var links: js.UndefOr[Record[String, SystemStyleObject]] = js.native
  var mediaQueries: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Message variants can be defined in the `theme.messages` object.
    *
    * @see https://theme-ui.com/theme-spec#variants
    * @see https://theme-ui.com/components/variants
    * @see https://theme-ui.com/components/message#variants
    */
  var messages: js.UndefOr[Record[String, SystemStyleObject]] = js.native
  var radii: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderRadiusProperty<TLength> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  var shadows: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BoxShadowProperty */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  var sizes: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.HeightProperty<{}> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  var space: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MarginProperty<number | string> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  /**
    * Styles for elements rendered in MDX can be added to the theme.styles
    * object. This is the primary, low-level way to control typographic and
    * other styles in markdown content. Styles within this object are processed
    * with @styled-system/css and have access to base theme values like colors,
    * fonts, etc.
    */
  var styles: js.UndefOr[PinStyledTagsSystemStyleO] = js.native
  /**
    * Text style variants can be defined in the `theme.text` object. The `Text`
    * component uses `theme.text.default` as its default variant style.
    *
    * @see https://theme-ui.com/theme-spec#variants
    * @see https://theme-ui.com/components/variants
    * @see https://theme-ui.com/components/text#variants
    */
  var text: js.UndefOr[Record[String, SystemStyleObject]] = js.native
  var textStyles: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[
      StandardProperties[(String with js.Object) | `0`, String with js.Object], 
      /* keyof any */ String
    ]
  ] = js.native
  /**
    * Adds styles defined in `theme.styles.roo`t to the `<body>` element along
    * with `color` and `background-color`.
    *
    * @defaultValue true
    * @see https://theme-ui.com/color-modes#applying-colors
    */
  var useBodyStyles: js.UndefOr[Boolean] = js.native
  /**
    * Adds a global `box-sizing: border-box` style.
    *
    * @defaultValue true
    * @see https://theme-ui.com/theming#configuration-flags
    */
  var useBorderBox: js.UndefOr[Boolean] = js.native
  /**
    * Initializes the color mode based on the `prefers-color-scheme` media
    * query.
    *
    * @defaultValue false
    * @see https://theme-ui.com/color-modes#initialize-mode-with-prefers-color-scheme-media-query
    */
  var useColorSchemeMediaQuery: js.UndefOr[Boolean] = js.native
  /**
    * Enable/disable custom CSS properties/variables if lower browser
    * support is required (for eg. IE 11).
    *
    * @defaultValue true
    * @see https://theme-ui.com/color-modes/#turn-off-custom-properties
    */
  var useCustomProperties: js.UndefOr[Boolean] = js.native
  /**
    * Persists the color mode in `localStorage`.
    *
    * @defaultValue true
    * @see https://theme-ui.com/color-modes#disable-persisting-color-mode-on-localstorage
    */
  var useLocalStorage: js.UndefOr[Boolean] = js.native
  var zIndices: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ZIndexProperty */ _, 
      /* keyof any */ String
    ]
  ] = js.native
}

object Theme {
  @scala.inline
  def apply(): Theme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Theme]
  }
  @scala.inline
  implicit class ThemeOps[Self <: Theme] (val x: Self) extends AnyVal {
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
    def setAlerts(value: Record[String, SystemStyleObject]): Self = this.set("alerts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlerts: Self = this.set("alerts", js.undefined)
    @scala.inline
    def setBadges(value: Record[String, SystemStyleObject]): Self = this.set("badges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadges: Self = this.set("badges", js.undefined)
    @scala.inline
    def setBorderStylesVarargs(value: js.Any*): Self = this.set("borderStyles", js.Array(value :_*))
    @scala.inline
    def setBorderStyles(
      value: typings.styledSystem.mod.ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderProperty<{}> */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("borderStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderStyles: Self = this.set("borderStyles", js.undefined)
    @scala.inline
    def setBorderWidthsVarargs(value: js.Any*): Self = this.set("borderWidths", js.Array(value :_*))
    @scala.inline
    def setBorderWidths(
      value: typings.styledSystem.mod.ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderWidthProperty<TLength> */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("borderWidths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidths: Self = this.set("borderWidths", js.undefined)
    @scala.inline
    def setBordersVarargs(value: js.Any*): Self = this.set("borders", js.Array(value :_*))
    @scala.inline
    def setBorders(
      value: typings.styledSystem.mod.ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderProperty<{}> */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("borders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorders: Self = this.set("borders", js.undefined)
    @scala.inline
    def setBreakpointsVarargs(value: (Double | String | js.Symbol)*): Self = this.set("breakpoints", js.Array(value :_*))
    @scala.inline
    def setBreakpoints(value: typings.styledSystem.mod.ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String]): Self = this.set("breakpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakpoints: Self = this.set("breakpoints", js.undefined)
    @scala.inline
    def setButtons(value: Record[String, SystemStyleObject]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setCards(value: Record[String, SystemStyleObject]): Self = this.set("cards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCards: Self = this.set("cards", js.undefined)
    @scala.inline
    def setColorStylesVarargs(value: (StandardProperties[(String with js.Object) | `0`, String with js.Object])*): Self = this.set("colorStyles", js.Array(value :_*))
    @scala.inline
    def setColorStyles(
      value: typings.styledSystem.mod.ObjectOrArray[
          StandardProperties[(String with js.Object) | `0`, String with js.Object], 
          /* keyof any */ String
        ]
    ): Self = this.set("colorStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorStyles: Self = this.set("colorStyles", js.undefined)
    @scala.inline
    def setColors(value: ColorModemodeskstringColo): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setFontSizesVarargs(value: js.Any*): Self = this.set("fontSizes", js.Array(value :_*))
    @scala.inline
    def setFontSizes(
      value: typings.styledSystem.mod.ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontSizeProperty<number> */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("fontSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSizes: Self = this.set("fontSizes", js.undefined)
    @scala.inline
    def setFontWeightsVarargs(value: js.Any*): Self = this.set("fontWeights", js.Array(value :_*))
    @scala.inline
    def setFontWeights(
      value: typings.styledSystem.mod.ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontWeightProperty */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("fontWeights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeights: Self = this.set("fontWeights", js.undefined)
    @scala.inline
    def setFontsVarargs(value: js.Any*): Self = this.set("fonts", js.Array(value :_*))
    @scala.inline
    def setFonts(
      value: typings.styledSystem.mod.ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontFamilyProperty */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("fonts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFonts: Self = this.set("fonts", js.undefined)
    @scala.inline
    def setForms(value: Record[String, SystemStyleObject]): Self = this.set("forms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForms: Self = this.set("forms", js.undefined)
    @scala.inline
    def setGrids(value: Record[String, SystemStyleObject]): Self = this.set("grids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrids: Self = this.set("grids", js.undefined)
    @scala.inline
    def setImages(value: Record[String, SystemStyleObject]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    @scala.inline
    def setInitialColorModeName(value: String): Self = this.set("initialColorModeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialColorModeName: Self = this.set("initialColorModeName", js.undefined)
    @scala.inline
    def setLayout(value: Record[String, SystemStyleObject]): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setLetterSpacingsVarargs(value: js.Any*): Self = this.set("letterSpacings", js.Array(value :_*))
    @scala.inline
    def setLetterSpacings(
      value: typings.styledSystem.mod.ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.LetterSpacingProperty<TLength> */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("letterSpacings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLetterSpacings: Self = this.set("letterSpacings", js.undefined)
    @scala.inline
    def setLineHeightsVarargs(value: js.Any*): Self = this.set("lineHeights", js.Array(value :_*))
    @scala.inline
    def setLineHeights(
      value: typings.styledSystem.mod.ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.LineHeightProperty<TLength> */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("lineHeights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineHeights: Self = this.set("lineHeights", js.undefined)
    @scala.inline
    def setLinks(value: Record[String, SystemStyleObject]): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    @scala.inline
    def setMediaQueries(value: StringDictionary[String]): Self = this.set("mediaQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaQueries: Self = this.set("mediaQueries", js.undefined)
    @scala.inline
    def setMessages(value: Record[String, SystemStyleObject]): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setRadiiVarargs(value: js.Any*): Self = this.set("radii", js.Array(value :_*))
    @scala.inline
    def setRadii(
      value: typings.styledSystem.mod.ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderRadiusProperty<TLength> */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("radii", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadii: Self = this.set("radii", js.undefined)
    @scala.inline
    def setShadowsVarargs(value: js.Any*): Self = this.set("shadows", js.Array(value :_*))
    @scala.inline
    def setShadows(
      value: typings.styledSystem.mod.ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BoxShadowProperty */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("shadows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadows: Self = this.set("shadows", js.undefined)
    @scala.inline
    def setSizesVarargs(value: js.Any*): Self = this.set("sizes", js.Array(value :_*))
    @scala.inline
    def setSizes(
      value: typings.styledSystem.mod.ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.HeightProperty<{}> */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("sizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
    @scala.inline
    def setSpaceVarargs(value: js.Any*): Self = this.set("space", js.Array(value :_*))
    @scala.inline
    def setSpace(
      value: typings.styledSystem.mod.ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MarginProperty<number | string> */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("space", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
    @scala.inline
    def setStyles(value: PinStyledTagsSystemStyleO): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setText(value: Record[String, SystemStyleObject]): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextStylesVarargs(value: (StandardProperties[(String with js.Object) | `0`, String with js.Object])*): Self = this.set("textStyles", js.Array(value :_*))
    @scala.inline
    def setTextStyles(
      value: typings.styledSystem.mod.ObjectOrArray[
          StandardProperties[(String with js.Object) | `0`, String with js.Object], 
          /* keyof any */ String
        ]
    ): Self = this.set("textStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyles: Self = this.set("textStyles", js.undefined)
    @scala.inline
    def setUseBodyStyles(value: Boolean): Self = this.set("useBodyStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseBodyStyles: Self = this.set("useBodyStyles", js.undefined)
    @scala.inline
    def setUseBorderBox(value: Boolean): Self = this.set("useBorderBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseBorderBox: Self = this.set("useBorderBox", js.undefined)
    @scala.inline
    def setUseColorSchemeMediaQuery(value: Boolean): Self = this.set("useColorSchemeMediaQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseColorSchemeMediaQuery: Self = this.set("useColorSchemeMediaQuery", js.undefined)
    @scala.inline
    def setUseCustomProperties(value: Boolean): Self = this.set("useCustomProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCustomProperties: Self = this.set("useCustomProperties", js.undefined)
    @scala.inline
    def setUseLocalStorage(value: Boolean): Self = this.set("useLocalStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseLocalStorage: Self = this.set("useLocalStorage", js.undefined)
    @scala.inline
    def setZIndicesVarargs(value: js.Any*): Self = this.set("zIndices", js.Array(value :_*))
    @scala.inline
    def setZIndices(
      value: typings.styledSystem.mod.ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ZIndexProperty */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("zIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndices: Self = this.set("zIndices", js.undefined)
  }
  
}

