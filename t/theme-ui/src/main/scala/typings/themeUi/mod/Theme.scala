package typings.themeUi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.StandardProperties
import typings.std.Record
import typings.styledSystemCss.mod.SystemStyleObject
import typings.themeUi.anon.ColorModemodeskstringColo
import typings.themeUi.anon.PinStyledTagsSystemStyleO
import typings.themeUi.themeUiNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent theme-ui.theme-ui.Omit<styled-system.styled-system.Theme<styled-system.styled-system.TLengthStyledSystem>, 'colors' | 'buttons'> */
trait Theme extends StObject {
  
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
    typings.styledSystem.mod.ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<{}> */ js.Any, 
      /* keyof any */ String
    ]
  ] = js.undefined
  
  var borderWidths: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderWidth<TLength> */ js.Any, 
      /* keyof any */ String
    ]
  ] = js.undefined
  
  var borders: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<{}> */ js.Any, 
      /* keyof any */ String
    ]
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
    typings.styledSystem.mod.ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontSize<number> */ js.Any, 
      /* keyof any */ String
    ]
  ] = js.undefined
  
  var fontWeights: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontWeight */ js.Any, 
      /* keyof any */ String
    ]
  ] = js.undefined
  
  var fonts: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontFamily */ js.Any, 
      /* keyof any */ String
    ]
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
    typings.styledSystem.mod.ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LetterSpacing<TLength> */ js.Any, 
      /* keyof any */ String
    ]
  ] = js.undefined
  
  var lineHeights: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LineHeight<TLength> */ js.Any, 
      /* keyof any */ String
    ]
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
    typings.styledSystem.mod.ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRadius<TLength> */ js.Any, 
      /* keyof any */ String
    ]
  ] = js.undefined
  
  var shadows: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BoxShadow */ js.Any, 
      /* keyof any */ String
    ]
  ] = js.undefined
  
  var sizes: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<{}> */ js.Any, 
      /* keyof any */ String
    ]
  ] = js.undefined
  
  var space: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Margin<number | string> */ js.Any, 
      /* keyof any */ String
    ]
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
  
  var zIndices: js.UndefOr[
    typings.styledSystem.mod.ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ js.Any, 
      /* keyof any */ String
    ]
  ] = js.undefined
}
object Theme {
  
  @scala.inline
  def apply(): Theme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Theme]
  }
  
  @scala.inline
  implicit class ThemeMutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlerts(value: Record[String, SystemStyleObject]): Self = StObject.set(x, "alerts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertsUndefined: Self = StObject.set(x, "alerts", js.undefined)
    
    @scala.inline
    def setBadges(value: Record[String, SystemStyleObject]): Self = StObject.set(x, "badges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgesUndefined: Self = StObject.set(x, "badges", js.undefined)
    
    @scala.inline
    def setBorderStyles(
      value: typings.styledSystem.mod.ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<{}> */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "borderStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStylesUndefined: Self = StObject.set(x, "borderStyles", js.undefined)
    
    @scala.inline
    def setBorderStylesVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<{}> */ js.Any)*
    ): Self = StObject.set(x, "borderStyles", js.Array(value :_*))
    
    @scala.inline
    def setBorderWidths(
      value: typings.styledSystem.mod.ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderWidth<TLength> */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "borderWidths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthsUndefined: Self = StObject.set(x, "borderWidths", js.undefined)
    
    @scala.inline
    def setBorderWidthsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderWidth<TLength> */ js.Any)*
    ): Self = StObject.set(x, "borderWidths", js.Array(value :_*))
    
    @scala.inline
    def setBorders(
      value: typings.styledSystem.mod.ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<{}> */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
    
    @scala.inline
    def setBordersVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<{}> */ js.Any)*
    ): Self = StObject.set(x, "borders", js.Array(value :_*))
    
    @scala.inline
    def setBreakpoints(value: typings.styledSystem.mod.ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
    
    @scala.inline
    def setBreakpointsVarargs(value: (Double | String | js.Symbol)*): Self = StObject.set(x, "breakpoints", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: Record[String, SystemStyleObject]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setCards(value: Record[String, SystemStyleObject]): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardsUndefined: Self = StObject.set(x, "cards", js.undefined)
    
    @scala.inline
    def setColorStyles(
      value: typings.styledSystem.mod.ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]
    ): Self = StObject.set(x, "colorStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorStylesUndefined: Self = StObject.set(x, "colorStyles", js.undefined)
    
    @scala.inline
    def setColorStylesVarargs(value: (StandardProperties[String | `0`])*): Self = StObject.set(x, "colorStyles", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: ColorModemodeskstringColo): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setFontSizes(
      value: typings.styledSystem.mod.ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontSize<number> */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "fontSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizesUndefined: Self = StObject.set(x, "fontSizes", js.undefined)
    
    @scala.inline
    def setFontSizesVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontSize<number> */ js.Any)*
    ): Self = StObject.set(x, "fontSizes", js.Array(value :_*))
    
    @scala.inline
    def setFontWeights(
      value: typings.styledSystem.mod.ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontWeight */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "fontWeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightsUndefined: Self = StObject.set(x, "fontWeights", js.undefined)
    
    @scala.inline
    def setFontWeightsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontWeight */ js.Any)*
    ): Self = StObject.set(x, "fontWeights", js.Array(value :_*))
    
    @scala.inline
    def setFonts(
      value: typings.styledSystem.mod.ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontFamily */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
    
    @scala.inline
    def setFontsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontFamily */ js.Any)*
    ): Self = StObject.set(x, "fonts", js.Array(value :_*))
    
    @scala.inline
    def setForms(value: Record[String, SystemStyleObject]): Self = StObject.set(x, "forms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormsUndefined: Self = StObject.set(x, "forms", js.undefined)
    
    @scala.inline
    def setGrids(value: Record[String, SystemStyleObject]): Self = StObject.set(x, "grids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridsUndefined: Self = StObject.set(x, "grids", js.undefined)
    
    @scala.inline
    def setImages(value: Record[String, SystemStyleObject]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    @scala.inline
    def setInitialColorModeName(value: String): Self = StObject.set(x, "initialColorModeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialColorModeNameUndefined: Self = StObject.set(x, "initialColorModeName", js.undefined)
    
    @scala.inline
    def setLayout(value: Record[String, SystemStyleObject]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setLetterSpacings(
      value: typings.styledSystem.mod.ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LetterSpacing<TLength> */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "letterSpacings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacingsUndefined: Self = StObject.set(x, "letterSpacings", js.undefined)
    
    @scala.inline
    def setLetterSpacingsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LetterSpacing<TLength> */ js.Any)*
    ): Self = StObject.set(x, "letterSpacings", js.Array(value :_*))
    
    @scala.inline
    def setLineHeights(
      value: typings.styledSystem.mod.ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LineHeight<TLength> */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "lineHeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightsUndefined: Self = StObject.set(x, "lineHeights", js.undefined)
    
    @scala.inline
    def setLineHeightsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LineHeight<TLength> */ js.Any)*
    ): Self = StObject.set(x, "lineHeights", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: Record[String, SystemStyleObject]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setMediaQueries(value: StringDictionary[String]): Self = StObject.set(x, "mediaQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaQueriesUndefined: Self = StObject.set(x, "mediaQueries", js.undefined)
    
    @scala.inline
    def setMessages(value: Record[String, SystemStyleObject]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setRadii(
      value: typings.styledSystem.mod.ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRadius<TLength> */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "radii", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiiUndefined: Self = StObject.set(x, "radii", js.undefined)
    
    @scala.inline
    def setRadiiVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRadius<TLength> */ js.Any)*
    ): Self = StObject.set(x, "radii", js.Array(value :_*))
    
    @scala.inline
    def setShadows(
      value: typings.styledSystem.mod.ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BoxShadow */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    @scala.inline
    def setShadowsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BoxShadow */ js.Any)*
    ): Self = StObject.set(x, "shadows", js.Array(value :_*))
    
    @scala.inline
    def setSizes(
      value: typings.styledSystem.mod.ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<{}> */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    @scala.inline
    def setSizesVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<{}> */ js.Any)*
    ): Self = StObject.set(x, "sizes", js.Array(value :_*))
    
    @scala.inline
    def setSpace(
      value: typings.styledSystem.mod.ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Margin<number | string> */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    @scala.inline
    def setSpaceVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Margin<number | string> */ js.Any)*
    ): Self = StObject.set(x, "space", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: PinStyledTagsSystemStyleO): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setText(value: Record[String, SystemStyleObject]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyles(
      value: typings.styledSystem.mod.ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]
    ): Self = StObject.set(x, "textStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStylesUndefined: Self = StObject.set(x, "textStyles", js.undefined)
    
    @scala.inline
    def setTextStylesVarargs(value: (StandardProperties[String | `0`])*): Self = StObject.set(x, "textStyles", js.Array(value :_*))
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setUseBodyStyles(value: Boolean): Self = StObject.set(x, "useBodyStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseBodyStylesUndefined: Self = StObject.set(x, "useBodyStyles", js.undefined)
    
    @scala.inline
    def setUseBorderBox(value: Boolean): Self = StObject.set(x, "useBorderBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseBorderBoxUndefined: Self = StObject.set(x, "useBorderBox", js.undefined)
    
    @scala.inline
    def setUseColorSchemeMediaQuery(value: Boolean): Self = StObject.set(x, "useColorSchemeMediaQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseColorSchemeMediaQueryUndefined: Self = StObject.set(x, "useColorSchemeMediaQuery", js.undefined)
    
    @scala.inline
    def setUseCustomProperties(value: Boolean): Self = StObject.set(x, "useCustomProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCustomPropertiesUndefined: Self = StObject.set(x, "useCustomProperties", js.undefined)
    
    @scala.inline
    def setUseLocalStorage(value: Boolean): Self = StObject.set(x, "useLocalStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLocalStorageUndefined: Self = StObject.set(x, "useLocalStorage", js.undefined)
    
    @scala.inline
    def setZIndices(
      value: typings.styledSystem.mod.ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "zIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndicesUndefined: Self = StObject.set(x, "zIndices", js.undefined)
    
    @scala.inline
    def setZIndicesVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ js.Any)*
    ): Self = StObject.set(x, "zIndices", js.Array(value :_*))
  }
}
