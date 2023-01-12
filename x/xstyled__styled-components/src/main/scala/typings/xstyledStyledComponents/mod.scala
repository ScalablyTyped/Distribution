package typings.xstyledStyledComponents

import typings.csstype.mod.Property.AlignContent
import typings.csstype.mod.Property.AlignItems
import typings.csstype.mod.Property.AlignSelf
import typings.csstype.mod.Property.Background
import typings.csstype.mod.Property.BackgroundImage
import typings.csstype.mod.Property.BackgroundPosition
import typings.csstype.mod.Property.BackgroundRepeat
import typings.csstype.mod.Property.BackgroundSize
import typings.csstype.mod.Property.Border
import typings.csstype.mod.Property.BorderBottom
import typings.csstype.mod.Property.BorderColor
import typings.csstype.mod.Property.BorderLeft
import typings.csstype.mod.Property.BorderRadius
import typings.csstype.mod.Property.BorderRight
import typings.csstype.mod.Property.BorderStyle
import typings.csstype.mod.Property.BorderTop
import typings.csstype.mod.Property.BorderWidth
import typings.csstype.mod.Property.Bottom
import typings.csstype.mod.Property.BoxShadow
import typings.csstype.mod.Property.Display
import typings.csstype.mod.Property.Flex
import typings.csstype.mod.Property.FlexBasis
import typings.csstype.mod.Property.FlexDirection
import typings.csstype.mod.Property.FlexGrow
import typings.csstype.mod.Property.FlexShrink
import typings.csstype.mod.Property.FlexWrap
import typings.csstype.mod.Property.FontFamily
import typings.csstype.mod.Property.FontSize
import typings.csstype.mod.Property.FontStyle
import typings.csstype.mod.Property.FontWeight
import typings.csstype.mod.Property.GridAutoColumns
import typings.csstype.mod.Property.GridAutoFlow
import typings.csstype.mod.Property.GridAutoRows
import typings.csstype.mod.Property.GridColumn
import typings.csstype.mod.Property.GridColumnGap
import typings.csstype.mod.Property.GridGap
import typings.csstype.mod.Property.GridRow
import typings.csstype.mod.Property.GridRowGap
import typings.csstype.mod.Property.GridTemplateAreas
import typings.csstype.mod.Property.GridTemplateColumns
import typings.csstype.mod.Property.GridTemplateRows
import typings.csstype.mod.Property.Height
import typings.csstype.mod.Property.JustifyContent
import typings.csstype.mod.Property.JustifyItems
import typings.csstype.mod.Property.JustifySelf
import typings.csstype.mod.Property.Left
import typings.csstype.mod.Property.LetterSpacing
import typings.csstype.mod.Property.LineHeight
import typings.csstype.mod.Property.MarginBottom
import typings.csstype.mod.Property.MarginLeft
import typings.csstype.mod.Property.MarginRight
import typings.csstype.mod.Property.MarginTop
import typings.csstype.mod.Property.MaxHeight
import typings.csstype.mod.Property.MaxWidth
import typings.csstype.mod.Property.MinHeight
import typings.csstype.mod.Property.MinWidth
import typings.csstype.mod.Property.Opacity
import typings.csstype.mod.Property.Order
import typings.csstype.mod.Property.Overflow
import typings.csstype.mod.Property.Padding
import typings.csstype.mod.Property.PaddingBottom
import typings.csstype.mod.Property.PaddingLeft
import typings.csstype.mod.Property.PaddingRight
import typings.csstype.mod.Property.PaddingTop
import typings.csstype.mod.Property.Position
import typings.csstype.mod.Property.Right
import typings.csstype.mod.Property.TextAlign
import typings.csstype.mod.Property.TextShadow
import typings.csstype.mod.Property.TextTransform
import typings.csstype.mod.Property.Top
import typings.csstype.mod.Property.Transition
import typings.csstype.mod.Property.VerticalAlign
import typings.csstype.mod.Property.Width
import typings.csstype.mod.Property.ZIndex
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.TemplateStringsArray
import typings.xstyledStyledComponents.anon.ABox
import typings.xstyledStyledComponents.anon.Target
import typings.xstyledSystem.anon.CssProperty
import typings.xstyledSystem.anon.TypeofReact
import typings.xstyledSystem.mod.AliasKey
import typings.xstyledSystem.mod.RPXTransformers_
import typings.xstyledSystem.mod.ResponsiveValue
import typings.xstyledSystem.mod.StyleFunc
import typings.xstyledSystem.mod.StyledSystemLength
import typings.xstyledSystem.mod.ThemeGetterFunc
import typings.xstyledSystem.mod.ThemeGetterValue
import typings.xstyledSystem.mod.VariantArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@xstyled/styled-components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Support for xxBoxes, i.e. aBox, articleBox
    * List of dom elements from Styled Components:
    * https://github.com/styled-components/styled-components/blob/master/packages/styled-components/src/utils/domElements.js
    *
    * @see {@link https://github.com/smooth-code/xstyled/blob/v1.19.1/packages/styled-components/src/styled.js#L31-L36}
    */
  @JSImport("@xstyled/styled-components", JSImport.Default)
  @js.native
  val default: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _styled */ Any) & ABox = js.native
  
  @JSImport("@xstyled/styled-components", "Box")
  @js.native
  val Box: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StyledComponent<'div', DefaultTheme, BoxProps> */ Any = js.native
  
  @JSImport("@xstyled/styled-components", "ColorModeProvider")
  @js.native
  open class ColorModeProvider protected ()
    extends Component[ColorModeProviderProps, js.Object, Any] {
    def this(props: ColorModeProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ColorModeProviderProps, context: Any) = this()
  }
  
  @JSImport("@xstyled/styled-components", "alignContent")
  @js.native
  val alignContent: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "alignItems")
  @js.native
  val alignItems: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "alignSelf")
  @js.native
  val alignSelf: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "background")
  @js.native
  val background: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "backgroundColor")
  @js.native
  val backgroundColor: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "backgroundImage")
  @js.native
  val backgroundImage: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "backgroundPosition")
  @js.native
  val backgroundPosition: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "backgroundRepeat")
  @js.native
  val backgroundRepeat: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "backgroundSize")
  @js.native
  val backgroundSize: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "backgrounds")
  @js.native
  val backgrounds: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "basics")
  @js.native
  val basics: StyleFunc = js.native
  
  inline def between(lower: String, upper: String, rules: Any): js.Function1[/* props */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(lower.asInstanceOf[js.Any], upper.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ Any, Any]]
  
  @JSImport("@xstyled/styled-components", "border")
  @js.native
  val border: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "borderBottom")
  @js.native
  val borderBottom: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "borderBottomColor")
  @js.native
  val borderBottomColor: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "borderColor")
  @js.native
  val borderColor: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "borderLeft")
  @js.native
  val borderLeft: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "borderLeftColor")
  @js.native
  val borderLeftColor: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "borderRadius")
  @js.native
  val borderRadius: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "borderRight")
  @js.native
  val borderRight: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "borderRightColor")
  @js.native
  val borderRightColor: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "borderStyle")
  @js.native
  val borderStyle: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "borderTop")
  @js.native
  val borderTop: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "borderTopColor")
  @js.native
  val borderTopColor: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "borderWidth")
  @js.native
  val borderWidth: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "borders")
  @js.native
  val borders: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "bottom")
  @js.native
  val bottom: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "boxShadow")
  @js.native
  val boxShadow: StyleFunc = js.native
  
  inline def breakpoints(
    styles: BreakpointObject[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FlattenSimpleInterpolation */ Any) | String
    ]
  ): TemplateStringsArray = ^.asInstanceOf[js.Dynamic].applyDynamic("breakpoints")(styles.asInstanceOf[js.Any]).asInstanceOf[TemplateStringsArray]
  
  @JSImport("@xstyled/styled-components", "col")
  @js.native
  val col: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "color")
  @js.native
  val color: StyleFunc = js.native
  
  inline def compose(parsers: StyleFunc*): StyleFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(parsers.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StyleFunc]
  
  inline def createSystemComponent[T](react: TypeofReact): // tslint:disable-next-line no-unnecessary-generics
  ComponentType[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSystemComponent")(react.asInstanceOf[js.Any]).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  ComponentType[T]]
  inline def createSystemComponent[T](react: TypeofReact, defaultComponent: String): // tslint:disable-next-line no-unnecessary-generics
  ComponentType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSystemComponent")(react.asInstanceOf[js.Any], defaultComponent.asInstanceOf[js.Any])).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  ComponentType[T]]
  inline def createSystemComponent[T](react: TypeofReact, defaultComponent: String, system: StyleFunc): // tslint:disable-next-line no-unnecessary-generics
  ComponentType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSystemComponent")(react.asInstanceOf[js.Any], defaultComponent.asInstanceOf[js.Any], system.asInstanceOf[js.Any])).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  ComponentType[T]]
  inline def createSystemComponent[T](react: TypeofReact, defaultComponent: Unit, system: StyleFunc): // tslint:disable-next-line no-unnecessary-generics
  ComponentType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSystemComponent")(react.asInstanceOf[js.Any], defaultComponent.asInstanceOf[js.Any], system.asInstanceOf[js.Any])).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  ComponentType[T]]
  inline def createSystemComponent[T](react: TypeofReact, defaultComponent: ReactNode): // tslint:disable-next-line no-unnecessary-generics
  ComponentType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSystemComponent")(react.asInstanceOf[js.Any], defaultComponent.asInstanceOf[js.Any])).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  ComponentType[T]]
  inline def createSystemComponent[T](react: TypeofReact, defaultComponent: ReactNode, system: StyleFunc): // tslint:disable-next-line no-unnecessary-generics
  ComponentType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSystemComponent")(react.asInstanceOf[js.Any], defaultComponent.asInstanceOf[js.Any], system.asInstanceOf[js.Any])).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  ComponentType[T]]
  
  @JSImport("@xstyled/styled-components", "display")
  @js.native
  val display: StyleFunc = js.native
  
  inline def down(key: String, rules: Any): js.Function1[/* props */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("down")(key.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ Any, Any]]
  
  @JSImport("@xstyled/styled-components", "flex")
  @js.native
  val flex: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "flexBasis")
  @js.native
  val flexBasis: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "flexDirection")
  @js.native
  val flexDirection: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "flexGrow")
  @js.native
  val flexGrow: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "flexShrink")
  @js.native
  val flexShrink: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "flexWrap")
  @js.native
  val flexWrap: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "flexboxes")
  @js.native
  val flexboxes: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "fontFamily")
  @js.native
  val fontFamily: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "fontSize")
  @js.native
  val fontSize: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "fontStyle")
  @js.native
  val fontStyle: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "fontWeight")
  @js.native
  val fontWeight: StyleFunc = js.native
  
  inline def getBorder(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("getBorder")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
  
  inline def getBorderStyle(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("getBorderStyle")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
  
  inline def getBorderWidth(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("getBorderWidth")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
  
  inline def getColor(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("getColor")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
  
  inline def getColorModeInitScriptElement(): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorModeInitScriptElement")().asInstanceOf[ReactElement]
  inline def getColorModeInitScriptElement(options: Target): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorModeInitScriptElement")(options.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def getColorModeInitScriptTag(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorModeInitScriptTag")().asInstanceOf[String]
  inline def getColorModeInitScriptTag(options: Target): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorModeInitScriptTag")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getFont(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("getFont")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
  
  inline def getFontSize(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontSize")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
  
  inline def getFontWeight(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontWeight")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
  
  inline def getLetterSpacing(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("getLetterSpacing")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
  
  inline def getLineHeight(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("getLineHeight")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
  
  inline def getPercent(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("getPercent")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
  
  inline def getPx(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("getPx")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
  
  inline def getRadius(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("getRadius")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
  
  inline def getShadow(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("getShadow")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
  
  inline def getSize(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
  
  inline def getSpace(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpace")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
  
  inline def getTransition(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransition")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
  
  inline def getZIndex(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("getZIndex")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
  
  @JSImport("@xstyled/styled-components", "gridArea")
  @js.native
  val gridArea: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "gridAutoColumns")
  @js.native
  val gridAutoColumns: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "gridAutoFlow")
  @js.native
  val gridAutoFlow: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "gridAutoRows")
  @js.native
  val gridAutoRows: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "gridColumn")
  @js.native
  val gridColumn: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "gridColumnGap")
  @js.native
  val gridColumnGap: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "gridGap")
  @js.native
  val gridGap: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "gridRow")
  @js.native
  val gridRow: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "gridRowGap")
  @js.native
  val gridRowGap: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "gridTemplateAreas")
  @js.native
  val gridTemplateAreas: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "gridTemplateColumns")
  @js.native
  val gridTemplateColumns: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "gridTemplateRows")
  @js.native
  val gridTemplateRows: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "grids")
  @js.native
  val grids: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "height")
  @js.native
  val height: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "justifyContent")
  @js.native
  val justifyContent: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "justifyItems")
  @js.native
  val justifyItems: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "justifySelf")
  @js.native
  val justifySelf: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "layout")
  @js.native
  val layout: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "left")
  @js.native
  val left: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "letterSpacing")
  @js.native
  val letterSpacing: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "lineHeight")
  @js.native
  val lineHeight: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "margin")
  @js.native
  val margin: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "marginBottom")
  @js.native
  val marginBottom: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "marginLeft")
  @js.native
  val marginLeft: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "marginRight")
  @js.native
  val marginRight: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "marginTop")
  @js.native
  val marginTop: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "maxHeight")
  @js.native
  val maxHeight: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "maxWidth")
  @js.native
  val maxWidth: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "minHeight")
  @js.native
  val minHeight: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "minWidth")
  @js.native
  val minWidth: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "mx")
  @js.native
  val mx: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "my")
  @js.native
  val my: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "opacity")
  @js.native
  val opacity: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "order")
  @js.native
  val order: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "overflow")
  @js.native
  val overflow: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "padding")
  @js.native
  val padding: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "paddingBottom")
  @js.native
  val paddingBottom: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "paddingLeft")
  @js.native
  val paddingLeft: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "paddingRight")
  @js.native
  val paddingRight: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "paddingTop")
  @js.native
  val paddingTop: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "position")
  @js.native
  val position: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "positioning")
  @js.native
  val positioning: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "px")
  @js.native
  val px: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "py")
  @js.native
  val py: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "right")
  @js.native
  val right: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "row")
  @js.native
  val row: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "rpxTransformers")
  @js.native
  val rpxTransformers: RPXTransformers_ = js.native
  
  @JSImport("@xstyled/styled-components", "shadows")
  @js.native
  val shadows: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "size")
  @js.native
  val size: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "space")
  @js.native
  val space: StyleFunc = js.native
  
  inline def style(config: CssProperty): StyleFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("style")(config.asInstanceOf[js.Any]).asInstanceOf[StyleFunc]
  
  @JSImport("@xstyled/styled-components", "system")
  @js.native
  val system: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "textAlign")
  @js.native
  val textAlign: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "textShadow")
  @js.native
  val textShadow: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "textTransform")
  @js.native
  val textTransform: StyleFunc = js.native
  
  object th {
    
    inline def apply(path: String): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
    
    @JSImport("@xstyled/styled-components", "th")
    @js.native
    val ^ : js.Any = js.native
    
    inline def border(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("border")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
    
    inline def borderStyle(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("borderStyle")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
    
    inline def borderWidth(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("borderWidth")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
    
    inline def color(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
    
    inline def font(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("font")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
    
    inline def fontSize(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("fontSize")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
    
    inline def fontWeight(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("fontWeight")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
    
    inline def letterSpacing(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("letterSpacing")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
    
    inline def lineHeight(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("lineHeight")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
    
    inline def percent(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("percent")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
    
    inline def px(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("px")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
    
    inline def radius(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("radius")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
    
    inline def shadow(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("shadow")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
    
    inline def size(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
    
    inline def space(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("space")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
    
    inline def transition(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("transition")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
    
    inline def zIndex(value: ThemeGetterValue): ThemeGetterFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("zIndex")(value.asInstanceOf[js.Any]).asInstanceOf[ThemeGetterFunc]
  }
  
  @JSImport("@xstyled/styled-components", "top")
  @js.native
  val top: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "transition")
  @js.native
  val transition: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "typography")
  @js.native
  val typography: StyleFunc = js.native
  
  inline def up(key: String, rules: Any): js.Function1[/* props */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("up")(key.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ Any, Any]]
  
  inline def useBreakpoint(): BreakpointName = ^.asInstanceOf[js.Dynamic].applyDynamic("useBreakpoint")().asInstanceOf[BreakpointName]
  
  inline def useBreakpoints(): DefaultBreakpoints = ^.asInstanceOf[js.Dynamic].applyDynamic("useBreakpoints")().asInstanceOf[DefaultBreakpoints]
  
  inline def useColorMode(): js.Tuple2[String, js.Function1[/* colorMode */ String, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useColorMode")().asInstanceOf[js.Tuple2[String, js.Function1[/* colorMode */ String, Unit]]]
  
  inline def useDown(_bereakpointName: BreakpointName): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useDown")(_bereakpointName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def useUp(_bereakpointName: BreakpointName): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useUp")(_bereakpointName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def useViewportWidth(): Double | String = ^.asInstanceOf[js.Dynamic].applyDynamic("useViewportWidth")().asInstanceOf[Double | String]
  
  inline def variant(param0: VariantArgs): js.Function1[/* props */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("variant")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ Any, Any]]
  
  @JSImport("@xstyled/styled-components", "verticalAlign")
  @js.native
  val verticalAlign: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "width")
  @js.native
  val width: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "xgrids")
  @js.native
  val xgrids: StyleFunc = js.native
  
  @JSImport("@xstyled/styled-components", "zIndex")
  @js.native
  val zIndex: StyleFunc = js.native
  
  /* Inlined @xstyled/styled-components.@xstyled/styled-components.WithBreakpointArgs<@xstyled/system.@xstyled/system.SystemProps> */
  trait BoxProps extends StObject {
    
    var alignContent: js.UndefOr[
        ResponsiveValue[AlignContent] | BreakpointObject[js.UndefOr[ResponsiveValue[AlignContent]]]
      ] = js.undefined
    
    var alignItems: js.UndefOr[
        ResponsiveValue[AlignItems] | BreakpointObject[js.UndefOr[ResponsiveValue[AlignItems]]]
      ] = js.undefined
    
    var alignSelf: js.UndefOr[
        ResponsiveValue[AlignSelf] | BreakpointObject[js.UndefOr[ResponsiveValue[AlignSelf]]]
      ] = js.undefined
    
    var background: js.UndefOr[
        ResponsiveValue[Background[String]] | BreakpointObject[js.UndefOr[ResponsiveValue[Background[String]]]]
      ] = js.undefined
    
    var backgroundColor: js.UndefOr[
        ResponsiveValue[Background[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Background[StyledSystemLength]]]]
      ] = js.undefined
    
    var backgroundImage: js.UndefOr[
        ResponsiveValue[BackgroundImage] | BreakpointObject[js.UndefOr[ResponsiveValue[BackgroundImage]]]
      ] = js.undefined
    
    var backgroundPosition: js.UndefOr[
        ResponsiveValue[BackgroundPosition[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[BackgroundPosition[StyledSystemLength]]]]
      ] = js.undefined
    
    var backgroundRepeat: js.UndefOr[
        ResponsiveValue[BackgroundRepeat] | BreakpointObject[js.UndefOr[ResponsiveValue[BackgroundRepeat]]]
      ] = js.undefined
    
    var backgroundSize: js.UndefOr[
        ResponsiveValue[BackgroundSize[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[BackgroundSize[StyledSystemLength]]]]
      ] = js.undefined
    
    var bg: js.UndefOr[
        ResponsiveValue[Background[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Background[StyledSystemLength]]]]
      ] = js.undefined
    
    var border: js.UndefOr[
        ResponsiveValue[Border[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Border[StyledSystemLength]]]]
      ] = js.undefined
    
    var borderBottom: js.UndefOr[
        ResponsiveValue[BorderBottom[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[BorderBottom[StyledSystemLength]]]]
      ] = js.undefined
    
    var borderBottomColor: js.UndefOr[
        ResponsiveValue[BorderColor] | BreakpointObject[js.UndefOr[ResponsiveValue[BorderColor]]]
      ] = js.undefined
    
    var borderColor: js.UndefOr[
        ResponsiveValue[BorderColor] | BreakpointObject[js.UndefOr[ResponsiveValue[BorderColor]]]
      ] = js.undefined
    
    var borderLeft: js.UndefOr[
        ResponsiveValue[BorderLeft[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[BorderLeft[StyledSystemLength]]]]
      ] = js.undefined
    
    var borderLeftColor: js.UndefOr[
        ResponsiveValue[BorderColor] | BreakpointObject[js.UndefOr[ResponsiveValue[BorderColor]]]
      ] = js.undefined
    
    var borderRadius: js.UndefOr[
        ResponsiveValue[BorderRadius[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[BorderRadius[StyledSystemLength]]]]
      ] = js.undefined
    
    var borderRight: js.UndefOr[
        ResponsiveValue[BorderRight[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[BorderRight[StyledSystemLength]]]]
      ] = js.undefined
    
    var borderRightColor: js.UndefOr[
        ResponsiveValue[BorderColor] | BreakpointObject[js.UndefOr[ResponsiveValue[BorderColor]]]
      ] = js.undefined
    
    var borderStyle: js.UndefOr[
        (ResponsiveValue[BorderStyle | Double]) | (BreakpointObject[js.UndefOr[ResponsiveValue[BorderStyle | Double]]])
      ] = js.undefined
    
    var borderTop: js.UndefOr[
        ResponsiveValue[BorderTop[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[BorderTop[StyledSystemLength]]]]
      ] = js.undefined
    
    var borderTopColor: js.UndefOr[
        ResponsiveValue[BorderColor] | BreakpointObject[js.UndefOr[ResponsiveValue[BorderColor]]]
      ] = js.undefined
    
    var borderWidth: js.UndefOr[
        ResponsiveValue[BorderWidth[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[BorderWidth[StyledSystemLength]]]]
      ] = js.undefined
    
    var bottom: js.UndefOr[
        ResponsiveValue[Bottom[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Bottom[StyledSystemLength]]]]
      ] = js.undefined
    
    var boxShadow: js.UndefOr[
        (ResponsiveValue[BoxShadow | Double]) | (BreakpointObject[js.UndefOr[ResponsiveValue[BoxShadow | Double]]])
      ] = js.undefined
    
    var col: js.UndefOr[
        (ResponsiveValue[String | Double | Boolean]) | (BreakpointObject[js.UndefOr[ResponsiveValue[String | Double | Boolean]]])
      ] = js.undefined
    
    var color: js.UndefOr[Any | BreakpointObject[js.UndefOr[Any]]] = js.undefined
    
    var display: js.UndefOr[
        ResponsiveValue[Display] | BreakpointObject[js.UndefOr[ResponsiveValue[Display]]]
      ] = js.undefined
    
    var flex: js.UndefOr[
        ResponsiveValue[Flex[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Flex[StyledSystemLength]]]]
      ] = js.undefined
    
    var flexBasis: js.UndefOr[
        ResponsiveValue[FlexBasis[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[FlexBasis[StyledSystemLength]]]]
      ] = js.undefined
    
    var flexDirection: js.UndefOr[
        ResponsiveValue[FlexDirection] | BreakpointObject[js.UndefOr[ResponsiveValue[FlexDirection]]]
      ] = js.undefined
    
    var flexGrow: js.UndefOr[
        ResponsiveValue[FlexGrow] | BreakpointObject[js.UndefOr[ResponsiveValue[FlexGrow]]]
      ] = js.undefined
    
    var flexShrink: js.UndefOr[
        ResponsiveValue[FlexShrink] | BreakpointObject[js.UndefOr[ResponsiveValue[FlexShrink]]]
      ] = js.undefined
    
    var flexWrap: js.UndefOr[
        ResponsiveValue[FlexWrap] | BreakpointObject[js.UndefOr[ResponsiveValue[FlexWrap]]]
      ] = js.undefined
    
    var fontFamily: js.UndefOr[
        (ResponsiveValue[FontFamily | Double]) | (BreakpointObject[js.UndefOr[ResponsiveValue[FontFamily | Double]]])
      ] = js.undefined
    
    var fontSize: js.UndefOr[
        ResponsiveValue[FontSize[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[FontSize[StyledSystemLength]]]]
      ] = js.undefined
    
    var fontStyle: js.UndefOr[
        ResponsiveValue[FontStyle] | BreakpointObject[js.UndefOr[ResponsiveValue[FontStyle]]]
      ] = js.undefined
    
    var fontWeight: js.UndefOr[
        (ResponsiveValue[FontWeight | AliasKey]) | (BreakpointObject[js.UndefOr[ResponsiveValue[FontWeight | AliasKey]]])
      ] = js.undefined
    
    var gridArea: js.UndefOr[ResponsiveValue[String] | BreakpointObject[js.UndefOr[ResponsiveValue[String]]]] = js.undefined
    
    var gridAutoColumns: js.UndefOr[
        ResponsiveValue[GridAutoColumns[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[GridAutoColumns[StyledSystemLength]]]]
      ] = js.undefined
    
    var gridAutoFlow: js.UndefOr[
        ResponsiveValue[GridAutoFlow] | BreakpointObject[js.UndefOr[ResponsiveValue[GridAutoFlow]]]
      ] = js.undefined
    
    var gridAutoRows: js.UndefOr[
        ResponsiveValue[GridAutoRows[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[GridAutoRows[StyledSystemLength]]]]
      ] = js.undefined
    
    var gridColumn: js.UndefOr[
        ResponsiveValue[GridColumn] | BreakpointObject[js.UndefOr[ResponsiveValue[GridColumn]]]
      ] = js.undefined
    
    var gridColumnGap: js.UndefOr[
        ResponsiveValue[GridColumnGap[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[GridColumnGap[StyledSystemLength]]]]
      ] = js.undefined
    
    var gridGap: js.UndefOr[
        ResponsiveValue[GridGap[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[GridGap[StyledSystemLength]]]]
      ] = js.undefined
    
    var gridRow: js.UndefOr[
        ResponsiveValue[GridRow] | BreakpointObject[js.UndefOr[ResponsiveValue[GridRow]]]
      ] = js.undefined
    
    var gridRowGap: js.UndefOr[
        ResponsiveValue[GridRowGap[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[GridRowGap[StyledSystemLength]]]]
      ] = js.undefined
    
    var gridTemplateAreas: js.UndefOr[
        ResponsiveValue[GridTemplateAreas] | BreakpointObject[js.UndefOr[ResponsiveValue[GridTemplateAreas]]]
      ] = js.undefined
    
    var gridTemplateColumns: js.UndefOr[
        ResponsiveValue[GridTemplateColumns[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[GridTemplateColumns[StyledSystemLength]]]]
      ] = js.undefined
    
    var gridTemplateRows: js.UndefOr[
        ResponsiveValue[GridTemplateRows[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[GridTemplateRows[StyledSystemLength]]]]
      ] = js.undefined
    
    var height: js.UndefOr[
        ResponsiveValue[Height[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Height[StyledSystemLength]]]]
      ] = js.undefined
    
    var justifyContent: js.UndefOr[
        ResponsiveValue[JustifyContent] | BreakpointObject[js.UndefOr[ResponsiveValue[JustifyContent]]]
      ] = js.undefined
    
    var justifyItems: js.UndefOr[
        ResponsiveValue[JustifyItems] | BreakpointObject[js.UndefOr[ResponsiveValue[JustifyItems]]]
      ] = js.undefined
    
    var justifySelf: js.UndefOr[
        ResponsiveValue[JustifySelf] | BreakpointObject[js.UndefOr[ResponsiveValue[JustifySelf]]]
      ] = js.undefined
    
    var left: js.UndefOr[
        ResponsiveValue[Left[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Left[StyledSystemLength]]]]
      ] = js.undefined
    
    var letterSpacing: js.UndefOr[
        ResponsiveValue[LetterSpacing[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[LetterSpacing[StyledSystemLength]]]]
      ] = js.undefined
    
    var lineHeight: js.UndefOr[
        ResponsiveValue[LineHeight[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[LineHeight[StyledSystemLength]]]]
      ] = js.undefined
    
    var m: js.UndefOr[
        ResponsiveValue[MarginTop[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MarginTop[StyledSystemLength]]]]
      ] = js.undefined
    
    var margin: js.UndefOr[
        ResponsiveValue[MarginTop[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MarginTop[StyledSystemLength]]]]
      ] = js.undefined
    
    var marginBottom: js.UndefOr[
        ResponsiveValue[MarginBottom[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MarginBottom[StyledSystemLength]]]]
      ] = js.undefined
    
    var marginLeft: js.UndefOr[
        ResponsiveValue[MarginLeft[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MarginLeft[StyledSystemLength]]]]
      ] = js.undefined
    
    var marginRight: js.UndefOr[
        ResponsiveValue[MarginRight[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MarginRight[StyledSystemLength]]]]
      ] = js.undefined
    
    var marginTop: js.UndefOr[
        ResponsiveValue[MarginTop[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MarginTop[StyledSystemLength]]]]
      ] = js.undefined
    
    var maxHeight: js.UndefOr[
        ResponsiveValue[MaxHeight[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MaxHeight[StyledSystemLength]]]]
      ] = js.undefined
    
    var maxWidth: js.UndefOr[
        ResponsiveValue[MaxWidth[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MaxWidth[StyledSystemLength]]]]
      ] = js.undefined
    
    var mb: js.UndefOr[
        ResponsiveValue[MarginBottom[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MarginBottom[StyledSystemLength]]]]
      ] = js.undefined
    
    var minHeight: js.UndefOr[
        ResponsiveValue[MinHeight[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MinHeight[StyledSystemLength]]]]
      ] = js.undefined
    
    var minWidth: js.UndefOr[
        ResponsiveValue[MinWidth[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MinWidth[StyledSystemLength]]]]
      ] = js.undefined
    
    var ml: js.UndefOr[
        ResponsiveValue[MarginLeft[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MarginLeft[StyledSystemLength]]]]
      ] = js.undefined
    
    var mr: js.UndefOr[
        ResponsiveValue[MarginRight[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MarginRight[StyledSystemLength]]]]
      ] = js.undefined
    
    var mt: js.UndefOr[
        ResponsiveValue[MarginTop[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MarginTop[StyledSystemLength]]]]
      ] = js.undefined
    
    var mx: js.UndefOr[
        ResponsiveValue[MarginLeft[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MarginLeft[StyledSystemLength]]]]
      ] = js.undefined
    
    var my: js.UndefOr[
        ResponsiveValue[MarginTop[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MarginTop[StyledSystemLength]]]]
      ] = js.undefined
    
    var opacity: js.UndefOr[
        ResponsiveValue[Opacity] | BreakpointObject[js.UndefOr[ResponsiveValue[Opacity]]]
      ] = js.undefined
    
    var order: js.UndefOr[ResponsiveValue[Order] | BreakpointObject[js.UndefOr[ResponsiveValue[Order]]]] = js.undefined
    
    var overflow: js.UndefOr[
        ResponsiveValue[Overflow] | BreakpointObject[js.UndefOr[ResponsiveValue[Overflow]]]
      ] = js.undefined
    
    var p: js.UndefOr[
        ResponsiveValue[Padding[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Padding[StyledSystemLength]]]]
      ] = js.undefined
    
    var padding: js.UndefOr[
        ResponsiveValue[Padding[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Padding[StyledSystemLength]]]]
      ] = js.undefined
    
    var paddingBottom: js.UndefOr[
        ResponsiveValue[PaddingBottom[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[PaddingBottom[StyledSystemLength]]]]
      ] = js.undefined
    
    var paddingLeft: js.UndefOr[
        ResponsiveValue[PaddingLeft[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[PaddingLeft[StyledSystemLength]]]]
      ] = js.undefined
    
    var paddingRight: js.UndefOr[
        ResponsiveValue[PaddingRight[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[PaddingRight[StyledSystemLength]]]]
      ] = js.undefined
    
    var paddingTop: js.UndefOr[
        ResponsiveValue[PaddingTop[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[PaddingTop[StyledSystemLength]]]]
      ] = js.undefined
    
    var pb: js.UndefOr[
        ResponsiveValue[PaddingBottom[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[PaddingBottom[StyledSystemLength]]]]
      ] = js.undefined
    
    var pl: js.UndefOr[
        ResponsiveValue[PaddingLeft[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[PaddingLeft[StyledSystemLength]]]]
      ] = js.undefined
    
    var position: js.UndefOr[
        ResponsiveValue[Position] | BreakpointObject[js.UndefOr[ResponsiveValue[Position]]]
      ] = js.undefined
    
    var pr: js.UndefOr[
        ResponsiveValue[PaddingRight[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[PaddingRight[StyledSystemLength]]]]
      ] = js.undefined
    
    var pt: js.UndefOr[
        ResponsiveValue[PaddingTop[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[PaddingTop[StyledSystemLength]]]]
      ] = js.undefined
    
    var px: js.UndefOr[
        ResponsiveValue[PaddingLeft[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[PaddingLeft[StyledSystemLength]]]]
      ] = js.undefined
    
    var py: js.UndefOr[
        ResponsiveValue[PaddingTop[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[PaddingTop[StyledSystemLength]]]]
      ] = js.undefined
    
    var right: js.UndefOr[
        ResponsiveValue[Right[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Right[StyledSystemLength]]]]
      ] = js.undefined
    
    var row: js.UndefOr[
        (ResponsiveValue[String | Double | Boolean]) | (BreakpointObject[js.UndefOr[ResponsiveValue[String | Double | Boolean]]])
      ] = js.undefined
    
    var size: js.UndefOr[
        ResponsiveValue[Height[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Height[StyledSystemLength]]]]
      ] = js.undefined
    
    var textAlign: js.UndefOr[
        ResponsiveValue[TextAlign] | BreakpointObject[js.UndefOr[ResponsiveValue[TextAlign]]]
      ] = js.undefined
    
    var textShadow: js.UndefOr[
        (ResponsiveValue[TextShadow | Double]) | (BreakpointObject[js.UndefOr[ResponsiveValue[TextShadow | Double]]])
      ] = js.undefined
    
    var textTransform: js.UndefOr[
        ResponsiveValue[TextTransform] | BreakpointObject[js.UndefOr[ResponsiveValue[TextTransform]]]
      ] = js.undefined
    
    var top: js.UndefOr[
        ResponsiveValue[Top[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Top[StyledSystemLength]]]]
      ] = js.undefined
    
    var transition: js.UndefOr[
        ResponsiveValue[Transition[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Transition[StyledSystemLength]]]]
      ] = js.undefined
    
    var verticalAlign: js.UndefOr[
        ResponsiveValue[VerticalAlign[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[VerticalAlign[StyledSystemLength]]]]
      ] = js.undefined
    
    var width: js.UndefOr[
        ResponsiveValue[Width[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Width[StyledSystemLength]]]]
      ] = js.undefined
    
    var zIndex: js.UndefOr[
        (ResponsiveValue[ZIndex | AliasKey]) | (BreakpointObject[js.UndefOr[ResponsiveValue[ZIndex | AliasKey]]])
      ] = js.undefined
  }
  object BoxProps {
    
    inline def apply(): BoxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoxProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BoxProps] (val x: Self) extends AnyVal {
      
      inline def setAlignContent(value: ResponsiveValue[AlignContent] | BreakpointObject[js.UndefOr[ResponsiveValue[AlignContent]]]): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      inline def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      inline def setAlignContentVarargs(value: AlignContent*): Self = StObject.set(x, "alignContent", js.Array(value*))
      
      inline def setAlignItems(value: ResponsiveValue[AlignItems] | BreakpointObject[js.UndefOr[ResponsiveValue[AlignItems]]]): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      inline def setAlignItemsVarargs(value: AlignItems*): Self = StObject.set(x, "alignItems", js.Array(value*))
      
      inline def setAlignSelf(value: ResponsiveValue[AlignSelf] | BreakpointObject[js.UndefOr[ResponsiveValue[AlignSelf]]]): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setAlignSelfVarargs(value: AlignSelf*): Self = StObject.set(x, "alignSelf", js.Array(value*))
      
      inline def setBackground(
        value: ResponsiveValue[Background[String]] | BreakpointObject[js.UndefOr[ResponsiveValue[Background[String]]]]
      ): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColor(
        value: ResponsiveValue[Background[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Background[StyledSystemLength]]]]
      ): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBackgroundColorVarargs(value: Background[StyledSystemLength]*): Self = StObject.set(x, "backgroundColor", js.Array(value*))
      
      inline def setBackgroundImage(
        value: ResponsiveValue[BackgroundImage] | BreakpointObject[js.UndefOr[ResponsiveValue[BackgroundImage]]]
      ): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
      
      inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
      
      inline def setBackgroundImageVarargs(value: BackgroundImage*): Self = StObject.set(x, "backgroundImage", js.Array(value*))
      
      inline def setBackgroundPosition(
        value: ResponsiveValue[BackgroundPosition[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[BackgroundPosition[StyledSystemLength]]]]
      ): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
      
      inline def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
      
      inline def setBackgroundPositionVarargs(value: BackgroundPosition[StyledSystemLength]*): Self = StObject.set(x, "backgroundPosition", js.Array(value*))
      
      inline def setBackgroundRepeat(
        value: ResponsiveValue[BackgroundRepeat] | BreakpointObject[js.UndefOr[ResponsiveValue[BackgroundRepeat]]]
      ): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
      
      inline def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
      
      inline def setBackgroundRepeatVarargs(value: BackgroundRepeat*): Self = StObject.set(x, "backgroundRepeat", js.Array(value*))
      
      inline def setBackgroundSize(
        value: ResponsiveValue[BackgroundSize[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[BackgroundSize[StyledSystemLength]]]]
      ): Self = StObject.set(x, "backgroundSize", value.asInstanceOf[js.Any])
      
      inline def setBackgroundSizeUndefined: Self = StObject.set(x, "backgroundSize", js.undefined)
      
      inline def setBackgroundSizeVarargs(value: BackgroundSize[StyledSystemLength]*): Self = StObject.set(x, "backgroundSize", js.Array(value*))
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBackgroundVarargs(value: Background[String]*): Self = StObject.set(x, "background", js.Array(value*))
      
      inline def setBg(
        value: ResponsiveValue[Background[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Background[StyledSystemLength]]]]
      ): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setBgVarargs(value: Background[StyledSystemLength]*): Self = StObject.set(x, "bg", js.Array(value*))
      
      inline def setBorder(
        value: ResponsiveValue[Border[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Border[StyledSystemLength]]]]
      ): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderBottom(
        value: ResponsiveValue[BorderBottom[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[BorderBottom[StyledSystemLength]]]]
      ): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomColor(value: ResponsiveValue[BorderColor] | BreakpointObject[js.UndefOr[ResponsiveValue[BorderColor]]]): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomColorUndefined: Self = StObject.set(x, "borderBottomColor", js.undefined)
      
      inline def setBorderBottomColorVarargs(value: BorderColor*): Self = StObject.set(x, "borderBottomColor", js.Array(value*))
      
      inline def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
      
      inline def setBorderBottomVarargs(value: BorderBottom[StyledSystemLength]*): Self = StObject.set(x, "borderBottom", js.Array(value*))
      
      inline def setBorderColor(value: ResponsiveValue[BorderColor] | BreakpointObject[js.UndefOr[ResponsiveValue[BorderColor]]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderColorVarargs(value: BorderColor*): Self = StObject.set(x, "borderColor", js.Array(value*))
      
      inline def setBorderLeft(
        value: ResponsiveValue[BorderLeft[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[BorderLeft[StyledSystemLength]]]]
      ): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
      
      inline def setBorderLeftColor(value: ResponsiveValue[BorderColor] | BreakpointObject[js.UndefOr[ResponsiveValue[BorderColor]]]): Self = StObject.set(x, "borderLeftColor", value.asInstanceOf[js.Any])
      
      inline def setBorderLeftColorUndefined: Self = StObject.set(x, "borderLeftColor", js.undefined)
      
      inline def setBorderLeftColorVarargs(value: BorderColor*): Self = StObject.set(x, "borderLeftColor", js.Array(value*))
      
      inline def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
      
      inline def setBorderLeftVarargs(value: BorderLeft[StyledSystemLength]*): Self = StObject.set(x, "borderLeft", js.Array(value*))
      
      inline def setBorderRadius(
        value: ResponsiveValue[BorderRadius[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[BorderRadius[StyledSystemLength]]]]
      ): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      inline def setBorderRadiusVarargs(value: BorderRadius[StyledSystemLength]*): Self = StObject.set(x, "borderRadius", js.Array(value*))
      
      inline def setBorderRight(
        value: ResponsiveValue[BorderRight[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[BorderRight[StyledSystemLength]]]]
      ): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
      
      inline def setBorderRightColor(value: ResponsiveValue[BorderColor] | BreakpointObject[js.UndefOr[ResponsiveValue[BorderColor]]]): Self = StObject.set(x, "borderRightColor", value.asInstanceOf[js.Any])
      
      inline def setBorderRightColorUndefined: Self = StObject.set(x, "borderRightColor", js.undefined)
      
      inline def setBorderRightColorVarargs(value: BorderColor*): Self = StObject.set(x, "borderRightColor", js.Array(value*))
      
      inline def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
      
      inline def setBorderRightVarargs(value: BorderRight[StyledSystemLength]*): Self = StObject.set(x, "borderRight", js.Array(value*))
      
      inline def setBorderStyle(
        value: (ResponsiveValue[BorderStyle | Double]) | (BreakpointObject[js.UndefOr[ResponsiveValue[BorderStyle | Double]]])
      ): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      inline def setBorderStyleVarargs(value: (BorderStyle | Double)*): Self = StObject.set(x, "borderStyle", js.Array(value*))
      
      inline def setBorderTop(
        value: ResponsiveValue[BorderTop[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[BorderTop[StyledSystemLength]]]]
      ): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
      
      inline def setBorderTopColor(value: ResponsiveValue[BorderColor] | BreakpointObject[js.UndefOr[ResponsiveValue[BorderColor]]]): Self = StObject.set(x, "borderTopColor", value.asInstanceOf[js.Any])
      
      inline def setBorderTopColorUndefined: Self = StObject.set(x, "borderTopColor", js.undefined)
      
      inline def setBorderTopColorVarargs(value: BorderColor*): Self = StObject.set(x, "borderTopColor", js.Array(value*))
      
      inline def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
      
      inline def setBorderTopVarargs(value: BorderTop[StyledSystemLength]*): Self = StObject.set(x, "borderTop", js.Array(value*))
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setBorderVarargs(value: Border[StyledSystemLength]*): Self = StObject.set(x, "border", js.Array(value*))
      
      inline def setBorderWidth(
        value: ResponsiveValue[BorderWidth[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[BorderWidth[StyledSystemLength]]]]
      ): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setBorderWidthVarargs(value: BorderWidth[StyledSystemLength]*): Self = StObject.set(x, "borderWidth", js.Array(value*))
      
      inline def setBottom(
        value: ResponsiveValue[Bottom[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Bottom[StyledSystemLength]]]]
      ): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setBottomVarargs(value: Bottom[StyledSystemLength]*): Self = StObject.set(x, "bottom", js.Array(value*))
      
      inline def setBoxShadow(
        value: (ResponsiveValue[BoxShadow | Double]) | (BreakpointObject[js.UndefOr[ResponsiveValue[BoxShadow | Double]]])
      ): Self = StObject.set(x, "boxShadow", value.asInstanceOf[js.Any])
      
      inline def setBoxShadowUndefined: Self = StObject.set(x, "boxShadow", js.undefined)
      
      inline def setBoxShadowVarargs(value: (BoxShadow | Double)*): Self = StObject.set(x, "boxShadow", js.Array(value*))
      
      inline def setCol(
        value: (ResponsiveValue[String | Double | Boolean]) | (BreakpointObject[js.UndefOr[ResponsiveValue[String | Double | Boolean]]])
      ): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setColUndefined: Self = StObject.set(x, "col", js.undefined)
      
      inline def setColVarargs(value: (String | Double | Boolean)*): Self = StObject.set(x, "col", js.Array(value*))
      
      inline def setColor(value: Any | BreakpointObject[js.UndefOr[Any]]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisplay(value: ResponsiveValue[Display] | BreakpointObject[js.UndefOr[ResponsiveValue[Display]]]): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setDisplayVarargs(value: Display*): Self = StObject.set(x, "display", js.Array(value*))
      
      inline def setFlex(
        value: ResponsiveValue[Flex[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Flex[StyledSystemLength]]]]
      ): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexBasis(
        value: ResponsiveValue[FlexBasis[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[FlexBasis[StyledSystemLength]]]]
      ): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
      
      inline def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
      
      inline def setFlexBasisVarargs(value: FlexBasis[StyledSystemLength]*): Self = StObject.set(x, "flexBasis", js.Array(value*))
      
      inline def setFlexDirection(
        value: ResponsiveValue[FlexDirection] | BreakpointObject[js.UndefOr[ResponsiveValue[FlexDirection]]]
      ): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
      
      inline def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
      
      inline def setFlexDirectionVarargs(value: FlexDirection*): Self = StObject.set(x, "flexDirection", js.Array(value*))
      
      inline def setFlexGrow(value: ResponsiveValue[FlexGrow] | BreakpointObject[js.UndefOr[ResponsiveValue[FlexGrow]]]): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
      
      inline def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
      
      inline def setFlexGrowVarargs(value: FlexGrow*): Self = StObject.set(x, "flexGrow", js.Array(value*))
      
      inline def setFlexShrink(value: ResponsiveValue[FlexShrink] | BreakpointObject[js.UndefOr[ResponsiveValue[FlexShrink]]]): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
      
      inline def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
      
      inline def setFlexShrinkVarargs(value: FlexShrink*): Self = StObject.set(x, "flexShrink", js.Array(value*))
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setFlexVarargs(value: Flex[StyledSystemLength]*): Self = StObject.set(x, "flex", js.Array(value*))
      
      inline def setFlexWrap(value: ResponsiveValue[FlexWrap] | BreakpointObject[js.UndefOr[ResponsiveValue[FlexWrap]]]): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
      
      inline def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
      
      inline def setFlexWrapVarargs(value: FlexWrap*): Self = StObject.set(x, "flexWrap", js.Array(value*))
      
      inline def setFontFamily(
        value: (ResponsiveValue[FontFamily | Double]) | (BreakpointObject[js.UndefOr[ResponsiveValue[FontFamily | Double]]])
      ): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontFamilyVarargs(value: (FontFamily | Double)*): Self = StObject.set(x, "fontFamily", js.Array(value*))
      
      inline def setFontSize(
        value: ResponsiveValue[FontSize[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[FontSize[StyledSystemLength]]]]
      ): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontSizeVarargs(value: FontSize[StyledSystemLength]*): Self = StObject.set(x, "fontSize", js.Array(value*))
      
      inline def setFontStyle(value: ResponsiveValue[FontStyle] | BreakpointObject[js.UndefOr[ResponsiveValue[FontStyle]]]): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontStyleVarargs(value: FontStyle*): Self = StObject.set(x, "fontStyle", js.Array(value*))
      
      inline def setFontWeight(
        value: (ResponsiveValue[FontWeight | AliasKey]) | (BreakpointObject[js.UndefOr[ResponsiveValue[FontWeight | AliasKey]]])
      ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setFontWeightVarargs(value: (FontWeight | AliasKey)*): Self = StObject.set(x, "fontWeight", js.Array(value*))
      
      inline def setGridArea(value: ResponsiveValue[String] | BreakpointObject[js.UndefOr[ResponsiveValue[String]]]): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setGridAreaVarargs(value: String*): Self = StObject.set(x, "gridArea", js.Array(value*))
      
      inline def setGridAutoColumns(
        value: ResponsiveValue[GridAutoColumns[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[GridAutoColumns[StyledSystemLength]]]]
      ): Self = StObject.set(x, "gridAutoColumns", value.asInstanceOf[js.Any])
      
      inline def setGridAutoColumnsUndefined: Self = StObject.set(x, "gridAutoColumns", js.undefined)
      
      inline def setGridAutoColumnsVarargs(value: GridAutoColumns[StyledSystemLength]*): Self = StObject.set(x, "gridAutoColumns", js.Array(value*))
      
      inline def setGridAutoFlow(value: ResponsiveValue[GridAutoFlow] | BreakpointObject[js.UndefOr[ResponsiveValue[GridAutoFlow]]]): Self = StObject.set(x, "gridAutoFlow", value.asInstanceOf[js.Any])
      
      inline def setGridAutoFlowUndefined: Self = StObject.set(x, "gridAutoFlow", js.undefined)
      
      inline def setGridAutoFlowVarargs(value: GridAutoFlow*): Self = StObject.set(x, "gridAutoFlow", js.Array(value*))
      
      inline def setGridAutoRows(
        value: ResponsiveValue[GridAutoRows[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[GridAutoRows[StyledSystemLength]]]]
      ): Self = StObject.set(x, "gridAutoRows", value.asInstanceOf[js.Any])
      
      inline def setGridAutoRowsUndefined: Self = StObject.set(x, "gridAutoRows", js.undefined)
      
      inline def setGridAutoRowsVarargs(value: GridAutoRows[StyledSystemLength]*): Self = StObject.set(x, "gridAutoRows", js.Array(value*))
      
      inline def setGridColumn(value: ResponsiveValue[GridColumn] | BreakpointObject[js.UndefOr[ResponsiveValue[GridColumn]]]): Self = StObject.set(x, "gridColumn", value.asInstanceOf[js.Any])
      
      inline def setGridColumnGap(
        value: ResponsiveValue[GridColumnGap[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[GridColumnGap[StyledSystemLength]]]]
      ): Self = StObject.set(x, "gridColumnGap", value.asInstanceOf[js.Any])
      
      inline def setGridColumnGapUndefined: Self = StObject.set(x, "gridColumnGap", js.undefined)
      
      inline def setGridColumnGapVarargs(value: GridColumnGap[StyledSystemLength]*): Self = StObject.set(x, "gridColumnGap", js.Array(value*))
      
      inline def setGridColumnUndefined: Self = StObject.set(x, "gridColumn", js.undefined)
      
      inline def setGridColumnVarargs(value: GridColumn*): Self = StObject.set(x, "gridColumn", js.Array(value*))
      
      inline def setGridGap(
        value: ResponsiveValue[GridGap[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[GridGap[StyledSystemLength]]]]
      ): Self = StObject.set(x, "gridGap", value.asInstanceOf[js.Any])
      
      inline def setGridGapUndefined: Self = StObject.set(x, "gridGap", js.undefined)
      
      inline def setGridGapVarargs(value: GridGap[StyledSystemLength]*): Self = StObject.set(x, "gridGap", js.Array(value*))
      
      inline def setGridRow(value: ResponsiveValue[GridRow] | BreakpointObject[js.UndefOr[ResponsiveValue[GridRow]]]): Self = StObject.set(x, "gridRow", value.asInstanceOf[js.Any])
      
      inline def setGridRowGap(
        value: ResponsiveValue[GridRowGap[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[GridRowGap[StyledSystemLength]]]]
      ): Self = StObject.set(x, "gridRowGap", value.asInstanceOf[js.Any])
      
      inline def setGridRowGapUndefined: Self = StObject.set(x, "gridRowGap", js.undefined)
      
      inline def setGridRowGapVarargs(value: GridRowGap[StyledSystemLength]*): Self = StObject.set(x, "gridRowGap", js.Array(value*))
      
      inline def setGridRowUndefined: Self = StObject.set(x, "gridRow", js.undefined)
      
      inline def setGridRowVarargs(value: GridRow*): Self = StObject.set(x, "gridRow", js.Array(value*))
      
      inline def setGridTemplateAreas(
        value: ResponsiveValue[GridTemplateAreas] | BreakpointObject[js.UndefOr[ResponsiveValue[GridTemplateAreas]]]
      ): Self = StObject.set(x, "gridTemplateAreas", value.asInstanceOf[js.Any])
      
      inline def setGridTemplateAreasUndefined: Self = StObject.set(x, "gridTemplateAreas", js.undefined)
      
      inline def setGridTemplateAreasVarargs(value: GridTemplateAreas*): Self = StObject.set(x, "gridTemplateAreas", js.Array(value*))
      
      inline def setGridTemplateColumns(
        value: ResponsiveValue[GridTemplateColumns[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[GridTemplateColumns[StyledSystemLength]]]]
      ): Self = StObject.set(x, "gridTemplateColumns", value.asInstanceOf[js.Any])
      
      inline def setGridTemplateColumnsUndefined: Self = StObject.set(x, "gridTemplateColumns", js.undefined)
      
      inline def setGridTemplateColumnsVarargs(value: GridTemplateColumns[StyledSystemLength]*): Self = StObject.set(x, "gridTemplateColumns", js.Array(value*))
      
      inline def setGridTemplateRows(
        value: ResponsiveValue[GridTemplateRows[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[GridTemplateRows[StyledSystemLength]]]]
      ): Self = StObject.set(x, "gridTemplateRows", value.asInstanceOf[js.Any])
      
      inline def setGridTemplateRowsUndefined: Self = StObject.set(x, "gridTemplateRows", js.undefined)
      
      inline def setGridTemplateRowsVarargs(value: GridTemplateRows[StyledSystemLength]*): Self = StObject.set(x, "gridTemplateRows", js.Array(value*))
      
      inline def setHeight(
        value: ResponsiveValue[Height[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Height[StyledSystemLength]]]]
      ): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHeightVarargs(value: Height[StyledSystemLength]*): Self = StObject.set(x, "height", js.Array(value*))
      
      inline def setJustifyContent(
        value: ResponsiveValue[JustifyContent] | BreakpointObject[js.UndefOr[ResponsiveValue[JustifyContent]]]
      ): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
      
      inline def setJustifyContentVarargs(value: JustifyContent*): Self = StObject.set(x, "justifyContent", js.Array(value*))
      
      inline def setJustifyItems(value: ResponsiveValue[JustifyItems] | BreakpointObject[js.UndefOr[ResponsiveValue[JustifyItems]]]): Self = StObject.set(x, "justifyItems", value.asInstanceOf[js.Any])
      
      inline def setJustifyItemsUndefined: Self = StObject.set(x, "justifyItems", js.undefined)
      
      inline def setJustifyItemsVarargs(value: JustifyItems*): Self = StObject.set(x, "justifyItems", js.Array(value*))
      
      inline def setJustifySelf(value: ResponsiveValue[JustifySelf] | BreakpointObject[js.UndefOr[ResponsiveValue[JustifySelf]]]): Self = StObject.set(x, "justifySelf", value.asInstanceOf[js.Any])
      
      inline def setJustifySelfUndefined: Self = StObject.set(x, "justifySelf", js.undefined)
      
      inline def setJustifySelfVarargs(value: JustifySelf*): Self = StObject.set(x, "justifySelf", js.Array(value*))
      
      inline def setLeft(
        value: ResponsiveValue[Left[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Left[StyledSystemLength]]]]
      ): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setLeftVarargs(value: Left[StyledSystemLength]*): Self = StObject.set(x, "left", js.Array(value*))
      
      inline def setLetterSpacing(
        value: ResponsiveValue[LetterSpacing[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[LetterSpacing[StyledSystemLength]]]]
      ): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      inline def setLetterSpacingVarargs(value: LetterSpacing[StyledSystemLength]*): Self = StObject.set(x, "letterSpacing", js.Array(value*))
      
      inline def setLineHeight(
        value: ResponsiveValue[LineHeight[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[LineHeight[StyledSystemLength]]]]
      ): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setLineHeightVarargs(value: LineHeight[StyledSystemLength]*): Self = StObject.set(x, "lineHeight", js.Array(value*))
      
      inline def setM(
        value: ResponsiveValue[MarginTop[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MarginTop[StyledSystemLength]]]]
      ): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      inline def setMVarargs(value: MarginTop[StyledSystemLength]*): Self = StObject.set(x, "m", js.Array(value*))
      
      inline def setMargin(
        value: ResponsiveValue[MarginTop[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MarginTop[StyledSystemLength]]]]
      ): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(
        value: ResponsiveValue[MarginBottom[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MarginBottom[StyledSystemLength]]]]
      ): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginBottomVarargs(value: MarginBottom[StyledSystemLength]*): Self = StObject.set(x, "marginBottom", js.Array(value*))
      
      inline def setMarginLeft(
        value: ResponsiveValue[MarginLeft[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MarginLeft[StyledSystemLength]]]]
      ): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginLeftVarargs(value: MarginLeft[StyledSystemLength]*): Self = StObject.set(x, "marginLeft", js.Array(value*))
      
      inline def setMarginRight(
        value: ResponsiveValue[MarginRight[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MarginRight[StyledSystemLength]]]]
      ): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginRightVarargs(value: MarginRight[StyledSystemLength]*): Self = StObject.set(x, "marginRight", js.Array(value*))
      
      inline def setMarginTop(
        value: ResponsiveValue[MarginTop[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MarginTop[StyledSystemLength]]]]
      ): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginTopVarargs(value: MarginTop[StyledSystemLength]*): Self = StObject.set(x, "marginTop", js.Array(value*))
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarginVarargs(value: MarginTop[StyledSystemLength]*): Self = StObject.set(x, "margin", js.Array(value*))
      
      inline def setMaxHeight(
        value: ResponsiveValue[MaxHeight[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MaxHeight[StyledSystemLength]]]]
      ): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxHeightVarargs(value: MaxHeight[StyledSystemLength]*): Self = StObject.set(x, "maxHeight", js.Array(value*))
      
      inline def setMaxWidth(
        value: ResponsiveValue[MaxWidth[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MaxWidth[StyledSystemLength]]]]
      ): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMaxWidthVarargs(value: MaxWidth[StyledSystemLength]*): Self = StObject.set(x, "maxWidth", js.Array(value*))
      
      inline def setMb(
        value: ResponsiveValue[MarginBottom[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MarginBottom[StyledSystemLength]]]]
      ): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
      
      inline def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
      
      inline def setMbVarargs(value: MarginBottom[StyledSystemLength]*): Self = StObject.set(x, "mb", js.Array(value*))
      
      inline def setMinHeight(
        value: ResponsiveValue[MinHeight[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MinHeight[StyledSystemLength]]]]
      ): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinHeightVarargs(value: MinHeight[StyledSystemLength]*): Self = StObject.set(x, "minHeight", js.Array(value*))
      
      inline def setMinWidth(
        value: ResponsiveValue[MinWidth[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MinWidth[StyledSystemLength]]]]
      ): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMinWidthVarargs(value: MinWidth[StyledSystemLength]*): Self = StObject.set(x, "minWidth", js.Array(value*))
      
      inline def setMl(
        value: ResponsiveValue[MarginLeft[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MarginLeft[StyledSystemLength]]]]
      ): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
      
      inline def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
      
      inline def setMlVarargs(value: MarginLeft[StyledSystemLength]*): Self = StObject.set(x, "ml", js.Array(value*))
      
      inline def setMr(
        value: ResponsiveValue[MarginRight[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MarginRight[StyledSystemLength]]]]
      ): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
      
      inline def setMrUndefined: Self = StObject.set(x, "mr", js.undefined)
      
      inline def setMrVarargs(value: MarginRight[StyledSystemLength]*): Self = StObject.set(x, "mr", js.Array(value*))
      
      inline def setMt(
        value: ResponsiveValue[MarginTop[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MarginTop[StyledSystemLength]]]]
      ): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
      
      inline def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
      
      inline def setMtVarargs(value: MarginTop[StyledSystemLength]*): Self = StObject.set(x, "mt", js.Array(value*))
      
      inline def setMx(
        value: ResponsiveValue[MarginLeft[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MarginLeft[StyledSystemLength]]]]
      ): Self = StObject.set(x, "mx", value.asInstanceOf[js.Any])
      
      inline def setMxUndefined: Self = StObject.set(x, "mx", js.undefined)
      
      inline def setMxVarargs(value: MarginLeft[StyledSystemLength]*): Self = StObject.set(x, "mx", js.Array(value*))
      
      inline def setMy(
        value: ResponsiveValue[MarginTop[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[MarginTop[StyledSystemLength]]]]
      ): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
      
      inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
      
      inline def setMyVarargs(value: MarginTop[StyledSystemLength]*): Self = StObject.set(x, "my", js.Array(value*))
      
      inline def setOpacity(value: ResponsiveValue[Opacity] | BreakpointObject[js.UndefOr[ResponsiveValue[Opacity]]]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOpacityVarargs(value: Opacity*): Self = StObject.set(x, "opacity", js.Array(value*))
      
      inline def setOrder(value: ResponsiveValue[Order] | BreakpointObject[js.UndefOr[ResponsiveValue[Order]]]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrderVarargs(value: Order*): Self = StObject.set(x, "order", js.Array(value*))
      
      inline def setOverflow(value: ResponsiveValue[Overflow] | BreakpointObject[js.UndefOr[ResponsiveValue[Overflow]]]): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setOverflowVarargs(value: Overflow*): Self = StObject.set(x, "overflow", js.Array(value*))
      
      inline def setP(
        value: ResponsiveValue[Padding[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Padding[StyledSystemLength]]]]
      ): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setPVarargs(value: Padding[StyledSystemLength]*): Self = StObject.set(x, "p", js.Array(value*))
      
      inline def setPadding(
        value: ResponsiveValue[Padding[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Padding[StyledSystemLength]]]]
      ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottom(
        value: ResponsiveValue[PaddingBottom[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[PaddingBottom[StyledSystemLength]]]]
      ): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingBottomVarargs(value: PaddingBottom[StyledSystemLength]*): Self = StObject.set(x, "paddingBottom", js.Array(value*))
      
      inline def setPaddingLeft(
        value: ResponsiveValue[PaddingLeft[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[PaddingLeft[StyledSystemLength]]]]
      ): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingLeftVarargs(value: PaddingLeft[StyledSystemLength]*): Self = StObject.set(x, "paddingLeft", js.Array(value*))
      
      inline def setPaddingRight(
        value: ResponsiveValue[PaddingRight[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[PaddingRight[StyledSystemLength]]]]
      ): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setPaddingRightVarargs(value: PaddingRight[StyledSystemLength]*): Self = StObject.set(x, "paddingRight", js.Array(value*))
      
      inline def setPaddingTop(
        value: ResponsiveValue[PaddingTop[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[PaddingTop[StyledSystemLength]]]]
      ): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPaddingTopVarargs(value: PaddingTop[StyledSystemLength]*): Self = StObject.set(x, "paddingTop", js.Array(value*))
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: Padding[StyledSystemLength]*): Self = StObject.set(x, "padding", js.Array(value*))
      
      inline def setPb(
        value: ResponsiveValue[PaddingBottom[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[PaddingBottom[StyledSystemLength]]]]
      ): Self = StObject.set(x, "pb", value.asInstanceOf[js.Any])
      
      inline def setPbUndefined: Self = StObject.set(x, "pb", js.undefined)
      
      inline def setPbVarargs(value: PaddingBottom[StyledSystemLength]*): Self = StObject.set(x, "pb", js.Array(value*))
      
      inline def setPl(
        value: ResponsiveValue[PaddingLeft[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[PaddingLeft[StyledSystemLength]]]]
      ): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
      
      inline def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
      
      inline def setPlVarargs(value: PaddingLeft[StyledSystemLength]*): Self = StObject.set(x, "pl", js.Array(value*))
      
      inline def setPosition(value: ResponsiveValue[Position] | BreakpointObject[js.UndefOr[ResponsiveValue[Position]]]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPositionVarargs(value: Position*): Self = StObject.set(x, "position", js.Array(value*))
      
      inline def setPr(
        value: ResponsiveValue[PaddingRight[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[PaddingRight[StyledSystemLength]]]]
      ): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
      
      inline def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
      
      inline def setPrVarargs(value: PaddingRight[StyledSystemLength]*): Self = StObject.set(x, "pr", js.Array(value*))
      
      inline def setPt(
        value: ResponsiveValue[PaddingTop[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[PaddingTop[StyledSystemLength]]]]
      ): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
      
      inline def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
      inline def setPtVarargs(value: PaddingTop[StyledSystemLength]*): Self = StObject.set(x, "pt", js.Array(value*))
      
      inline def setPx(
        value: ResponsiveValue[PaddingLeft[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[PaddingLeft[StyledSystemLength]]]]
      ): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
      
      inline def setPxUndefined: Self = StObject.set(x, "px", js.undefined)
      
      inline def setPxVarargs(value: PaddingLeft[StyledSystemLength]*): Self = StObject.set(x, "px", js.Array(value*))
      
      inline def setPy(
        value: ResponsiveValue[PaddingTop[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[PaddingTop[StyledSystemLength]]]]
      ): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
      
      inline def setPyUndefined: Self = StObject.set(x, "py", js.undefined)
      
      inline def setPyVarargs(value: PaddingTop[StyledSystemLength]*): Self = StObject.set(x, "py", js.Array(value*))
      
      inline def setRight(
        value: ResponsiveValue[Right[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Right[StyledSystemLength]]]]
      ): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setRightVarargs(value: Right[StyledSystemLength]*): Self = StObject.set(x, "right", js.Array(value*))
      
      inline def setRow(
        value: (ResponsiveValue[String | Double | Boolean]) | (BreakpointObject[js.UndefOr[ResponsiveValue[String | Double | Boolean]]])
      ): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setRowVarargs(value: (String | Double | Boolean)*): Self = StObject.set(x, "row", js.Array(value*))
      
      inline def setSize(
        value: ResponsiveValue[Height[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Height[StyledSystemLength]]]]
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSizeVarargs(value: Height[StyledSystemLength]*): Self = StObject.set(x, "size", js.Array(value*))
      
      inline def setTextAlign(value: ResponsiveValue[TextAlign] | BreakpointObject[js.UndefOr[ResponsiveValue[TextAlign]]]): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextAlignVarargs(value: TextAlign*): Self = StObject.set(x, "textAlign", js.Array(value*))
      
      inline def setTextShadow(
        value: (ResponsiveValue[TextShadow | Double]) | (BreakpointObject[js.UndefOr[ResponsiveValue[TextShadow | Double]]])
      ): Self = StObject.set(x, "textShadow", value.asInstanceOf[js.Any])
      
      inline def setTextShadowUndefined: Self = StObject.set(x, "textShadow", js.undefined)
      
      inline def setTextShadowVarargs(value: (TextShadow | Double)*): Self = StObject.set(x, "textShadow", js.Array(value*))
      
      inline def setTextTransform(
        value: ResponsiveValue[TextTransform] | BreakpointObject[js.UndefOr[ResponsiveValue[TextTransform]]]
      ): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
      
      inline def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
      
      inline def setTextTransformVarargs(value: TextTransform*): Self = StObject.set(x, "textTransform", js.Array(value*))
      
      inline def setTop(
        value: ResponsiveValue[Top[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Top[StyledSystemLength]]]]
      ): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setTopVarargs(value: Top[StyledSystemLength]*): Self = StObject.set(x, "top", js.Array(value*))
      
      inline def setTransition(
        value: ResponsiveValue[Transition[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Transition[StyledSystemLength]]]]
      ): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setTransitionVarargs(value: Transition[StyledSystemLength]*): Self = StObject.set(x, "transition", js.Array(value*))
      
      inline def setVerticalAlign(
        value: ResponsiveValue[VerticalAlign[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[VerticalAlign[StyledSystemLength]]]]
      ): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setVerticalAlignVarargs(value: VerticalAlign[StyledSystemLength]*): Self = StObject.set(x, "verticalAlign", js.Array(value*))
      
      inline def setWidth(
        value: ResponsiveValue[Width[StyledSystemLength]] | BreakpointObject[js.UndefOr[ResponsiveValue[Width[StyledSystemLength]]]]
      ): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWidthVarargs(value: Width[StyledSystemLength]*): Self = StObject.set(x, "width", js.Array(value*))
      
      inline def setZIndex(
        value: (ResponsiveValue[ZIndex | AliasKey]) | (BreakpointObject[js.UndefOr[ResponsiveValue[ZIndex | AliasKey]]])
      ): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
      
      inline def setZIndexVarargs(value: (ZIndex | AliasKey)*): Self = StObject.set(x, "zIndex", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.xstyledStyledComponents.xstyledStyledComponentsStrings.xs
    - typings.xstyledStyledComponents.xstyledStyledComponentsStrings.sm
    - typings.xstyledStyledComponents.xstyledStyledComponentsStrings.md
    - typings.xstyledStyledComponents.xstyledStyledComponentsStrings.lg
    - typings.xstyledStyledComponents.xstyledStyledComponentsStrings.xl
  */
  trait BreakpointName extends StObject
  
  /* Inlined {[ Key in @xstyled/styled-components.@xstyled/styled-components.BreakpointName ]:? ArgType} */
  trait BreakpointObject[ArgType] extends StObject {
    
    var lg: js.UndefOr[ArgType] = js.undefined
    
    var md: js.UndefOr[ArgType] = js.undefined
    
    var sm: js.UndefOr[ArgType] = js.undefined
    
    var xl: js.UndefOr[ArgType] = js.undefined
    
    var xs: js.UndefOr[ArgType] = js.undefined
  }
  object BreakpointObject {
    
    inline def apply[ArgType](): BreakpointObject[ArgType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreakpointObject[ArgType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreakpointObject[?], ArgType] (val x: Self & BreakpointObject[ArgType]) extends AnyVal {
      
      inline def setLg(value: ArgType): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      inline def setMd(value: ArgType): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      inline def setSm(value: ArgType): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      inline def setXl(value: ArgType): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      inline def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      inline def setXs(value: ArgType): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      inline def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
    }
  }
  
  trait ColorModeProviderProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var target: js.UndefOr[HTMLElement] = js.undefined
    
    var targetSelector: js.UndefOr[String] = js.undefined
  }
  object ColorModeProviderProps {
    
    inline def apply(): ColorModeProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorModeProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorModeProviderProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetSelector(value: String): Self = StObject.set(x, "targetSelector", value.asInstanceOf[js.Any])
      
      inline def setTargetSelectorUndefined: Self = StObject.set(x, "targetSelector", js.undefined)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait DefaultBreakpoints extends StObject {
    
    var lg: Any
    
    var md: Any
    
    var sm: Any
    
    var xl: Any
    
    var xs: Any
  }
  object DefaultBreakpoints {
    
    inline def apply(lg: Any, md: Any, sm: Any, xl: Any, xs: Any): DefaultBreakpoints = {
      val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultBreakpoints]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultBreakpoints] (val x: Self) extends AnyVal {
      
      inline def setLg(value: Any): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setMd(value: Any): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setSm(value: Any): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setXl(value: Any): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      inline def setXs(value: Any): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
    }
  }
  
  /* Augments a type to be Type | BreakpointObject<Type>,
    * in other words, allow a property to be `1` or `{ xs: 1, sm: 2 }`
    */
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ Key in keyof Props ]:? Props[Key] | @xstyled/styled-components.@xstyled/styled-components.BreakpointObject<Props[Key]>}
    }}}
    */
  @js.native
  trait WithBreakpointArgs[Props] extends StObject
}
