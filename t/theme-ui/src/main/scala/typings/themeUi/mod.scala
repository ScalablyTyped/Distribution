package typings.themeUi

import typings.react.mod.Attributes
import typings.react.mod.CElement
import typings.react.mod.ClassAttributes
import typings.react.mod.ClassType
import typings.react.mod.ClassicComponent
import typings.react.mod.ClassicComponentClass
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.Context
import typings.react.mod.DOMAttributes
import typings.react.mod.DOMElement
import typings.react.mod.DetailedReactHTMLElement
import typings.react.mod.Dispatch
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.FunctionComponentElement
import typings.react.mod.HTMLAttributes
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactSVGElement
import typings.react.mod.RefAttributes
import typings.react.mod.SVGAttributes
import typings.react.mod.SetStateAction
import typings.react.mod.global.JSX.Element
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLHeadingElement
import typings.std.HTMLIFrameElement
import typings.std.HTMLImageElement
import typings.std.HTMLInputElement
import typings.std.HTMLLabelElement
import typings.std.HTMLParagraphElement
import typings.std.HTMLProgressElement
import typings.std.HTMLSelectElement
import typings.std.HTMLTextAreaElement
import typings.std.Record
import typings.std.SVGElement
import typings.std.SVGSVGElement
import typings.themeUi.anon.CloseProps
import typings.themeUi.anon.Sx
import typings.themeUi.themeUiStrings.input
import typings.themeUiColorModes.anon.DangerouslySetInnerHTML
import typings.themeUiComponents.alertMod.AlertProps
import typings.themeUiComponents.anon.Size
import typings.themeUiComponents.aspectImageMod.AspectImageProps
import typings.themeUiComponents.aspectRatioMod.AspectRatioProps
import typings.themeUiComponents.avatarMod.AvatarProps
import typings.themeUiComponents.badgeMod.BadgeProps
import typings.themeUiComponents.boxMod.BoxProps
import typings.themeUiComponents.buttonMod.ButtonProps
import typings.themeUiComponents.cardMod.CardProps
import typings.themeUiComponents.checkboxMod.CheckboxProps
import typings.themeUiComponents.containerMod.ContainerProps
import typings.themeUiComponents.dividerMod.DividerProps
import typings.themeUiComponents.donutMod.DonutProps
import typings.themeUiComponents.embedMod.EmbedProps
import typings.themeUiComponents.flexMod.FlexProps
import typings.themeUiComponents.gridMod.GridProps
import typings.themeUiComponents.headingMod.HeadingProps
import typings.themeUiComponents.iconButtonMod.IconButtonProps
import typings.themeUiComponents.imageMod.ImageProps
import typings.themeUiComponents.inputMod.InputProps
import typings.themeUiComponents.labelMod.LabelProps
import typings.themeUiComponents.linkMod.LinkProps
import typings.themeUiComponents.menuButtonMod.MenuButtonProps
import typings.themeUiComponents.messageMod.MessageProps
import typings.themeUiComponents.navLinkMod.NavLinkProps
import typings.themeUiComponents.paragraphMod.ParagraphProps
import typings.themeUiComponents.progressMod.ProgressProps
import typings.themeUiComponents.radioMod.RadioProps
import typings.themeUiComponents.selectMod.SelectProps
import typings.themeUiComponents.sliderMod.SliderProps
import typings.themeUiComponents.spinnerMod.SpinnerProps
import typings.themeUiComponents.switchMod.SwitchProps
import typings.themeUiComponents.textMod.TextProps
import typings.themeUiComponents.textareaMod.TextareaProps
import typings.themeUiComponents.typesMod.ForwardRef
import typings.themeUiCore.anon.FnCall
import typings.themeUiCore.srcMod.ThemeUIContextValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("theme-ui", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("theme-ui", "Alert")
  @js.native
  val Alert: ForwardRef[HTMLDivElement, AlertProps] = js.native
  
  @JSImport("theme-ui", "AspectImage")
  @js.native
  val AspectImage: ForwardRef[HTMLImageElement, AspectImageProps] = js.native
  
  @JSImport("theme-ui", "AspectRatio")
  @js.native
  val AspectRatio: ForwardRef[HTMLDivElement, AspectRatioProps] = js.native
  
  @JSImport("theme-ui", "Avatar")
  @js.native
  val Avatar: ForwardRef[HTMLImageElement, AvatarProps] = js.native
  
  @JSImport("theme-ui", "Badge")
  @js.native
  val Badge: ForwardRef[HTMLDivElement, BadgeProps] = js.native
  
  inline def BaseStyles(props: (Record[String, Any]) & Sx): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("BaseStyles")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("theme-ui", "Box")
  @js.native
  val Box: ForwardRefExoticComponent[BoxProps & RefAttributes[Any]] = js.native
  
  @JSImport("theme-ui", "Button")
  @js.native
  val Button: ForwardRef[HTMLButtonElement, ButtonProps] = js.native
  
  @JSImport("theme-ui", "Card")
  @js.native
  val Card: ForwardRef[HTMLDivElement, CardProps] = js.native
  
  @JSImport("theme-ui", "Checkbox")
  @js.native
  val Checkbox: ForwardRef[HTMLInputElement, CheckboxProps] = js.native
  
  @JSImport("theme-ui", "Close")
  @js.native
  val Close: ForwardRef[HTMLButtonElement, CloseProps] = js.native
  
  @JSImport("theme-ui", "CloseIcon")
  @js.native
  val CloseIcon: Element = js.native
  
  @JSImport("theme-ui", "Container")
  @js.native
  val Container: ForwardRef[HTMLDivElement, ContainerProps] = js.native
  
  @JSImport("theme-ui", "Divider")
  @js.native
  val Divider: ForwardRef[HTMLDivElement, DividerProps] = js.native
  
  @JSImport("theme-ui", "Donut")
  @js.native
  val Donut: ForwardRef[SVGSVGElement, DonutProps] = js.native
  
  @JSImport("theme-ui", "Embed")
  @js.native
  val Embed: ForwardRef[HTMLIFrameElement, EmbedProps] = js.native
  
  @JSImport("theme-ui", "Field")
  @js.native
  val Field: typings.themeUiComponents.fieldMod.Field = js.native
  
  @JSImport("theme-ui", "Flex")
  @js.native
  val Flex: ForwardRef[HTMLElement, FlexProps] = js.native
  
  @JSImport("theme-ui", "Grid")
  @js.native
  val Grid: ForwardRef[HTMLDivElement, GridProps] = js.native
  
  @JSImport("theme-ui", "Heading")
  @js.native
  val Heading: ForwardRef[HTMLHeadingElement, HeadingProps] = js.native
  
  @JSImport("theme-ui", "IconButton")
  @js.native
  val IconButton: ForwardRef[HTMLButtonElement, IconButtonProps] = js.native
  
  @JSImport("theme-ui", "Image")
  @js.native
  val Image: ForwardRef[HTMLImageElement, ImageProps] = js.native
  
  inline def InitializeColorMode(): DetailedReactHTMLElement[DangerouslySetInnerHTML, HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("InitializeColorMode")().asInstanceOf[DetailedReactHTMLElement[DangerouslySetInnerHTML, HTMLElement]]
  
  @JSImport("theme-ui", "Input")
  @js.native
  val Input: ForwardRef[HTMLInputElement, InputProps] = js.native
  
  @JSImport("theme-ui", "Label")
  @js.native
  val Label: ForwardRef[HTMLLabelElement, LabelProps] = js.native
  
  @JSImport("theme-ui", "Link")
  @js.native
  val Link: ForwardRef[HTMLAnchorElement, LinkProps] = js.native
  
  @JSImport("theme-ui", "MenuButton")
  @js.native
  val MenuButton: ForwardRef[HTMLButtonElement, MenuButtonProps] = js.native
  
  inline def MenuIcon(hasSize: Size): typings.emotionReact.emotionReactMod.jsx.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuIcon")(hasSize.asInstanceOf[js.Any]).asInstanceOf[typings.emotionReact.emotionReactMod.jsx.JSX.Element]
  
  @JSImport("theme-ui", "Message")
  @js.native
  val Message: ForwardRef[HTMLDivElement, MessageProps] = js.native
  
  @JSImport("theme-ui", "NavLink")
  @js.native
  val NavLink: ForwardRef[HTMLAnchorElement, NavLinkProps] = js.native
  
  @JSImport("theme-ui", "Paragraph")
  @js.native
  val Paragraph: ForwardRef[HTMLParagraphElement, ParagraphProps] = js.native
  
  @JSImport("theme-ui", "Progress")
  @js.native
  val Progress: ForwardRef[HTMLProgressElement, ProgressProps] = js.native
  
  @JSImport("theme-ui", "Radio")
  @js.native
  val Radio: ForwardRef[HTMLInputElement, RadioProps] = js.native
  
  @JSImport("theme-ui", "Select")
  @js.native
  val Select: ForwardRef[HTMLSelectElement, SelectProps] = js.native
  
  @JSImport("theme-ui", "Slider")
  @js.native
  val Slider: ForwardRef[HTMLInputElement, SliderProps] = js.native
  
  @JSImport("theme-ui", "Spinner")
  @js.native
  val Spinner: ForwardRef[SVGSVGElement, SpinnerProps] = js.native
  
  @JSImport("theme-ui", "Switch")
  @js.native
  val Switch: ForwardRef[HTMLInputElement, SwitchProps] = js.native
  
  @JSImport("theme-ui", "Text")
  @js.native
  val Text: ForwardRef[HTMLDivElement, TextProps] = js.native
  
  @JSImport("theme-ui", "Textarea")
  @js.native
  val Textarea: ForwardRef[HTMLTextAreaElement, TextareaProps] = js.native
  
  @JSImport("theme-ui", "__ThemeUIContext")
  @js.native
  val ThemeUIContext: Context[ThemeUIContextValue] = js.native
  
  @JSImport("theme-ui", "createElement")
  @js.native
  val createElement: Any = js.native
  
  inline def isBoxStyledSystemProp(prop: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("__isBoxStyledSystemProp")(prop.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def jsx(
    `type`: input,
    props: InputHTMLAttributes[HTMLInputElement] & ClassAttributes[HTMLInputElement],
    children: ReactNode*
  ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  inline def jsx(`type`: input, props: Null, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  inline def jsx(`type`: input, props: Unit, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  inline def jsx[P /* <: js.Object */](`type`: String, props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
  inline def jsx[P /* <: js.Object */](`type`: String, props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
  inline def jsx[P /* <: js.Object */](`type`: String, props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
  inline def jsx[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: (ClassAttributes[ClassicComponent[P, ComponentState]]) & P,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
  inline def jsx[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: Null,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
  inline def jsx[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: Unit,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
  inline def jsx[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
  inline def jsx[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
  inline def jsx[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
  inline def jsx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
  inline def jsx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
  inline def jsx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
  inline def jsx[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ Any,
    props: ClassAttributes[T] & P,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
  inline def jsx[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ Any,
    props: Null,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
  inline def jsx[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ Any,
    props: Unit,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
  
  inline def jsx_PTC_CElement[P /* <: js.Object */, T /* <: Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] & P, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
  inline def jsx_PTC_CElement[P /* <: js.Object */, T /* <: Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Null, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
  inline def jsx_PTC_CElement[P /* <: js.Object */, T /* <: Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Unit, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
  
  inline def jsx_PT_DOMElement[P /* <: DOMAttributes[T] */, T /* <: typings.std.Element */](`type`: String, props: ClassAttributes[T] & P, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]
  inline def jsx_PT_DOMElement[P /* <: DOMAttributes[T] */, T /* <: typings.std.Element */](`type`: String, props: Null, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]
  inline def jsx_PT_DOMElement[P /* <: DOMAttributes[T] */, T /* <: typings.std.Element */](`type`: String, props: Unit, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]
  
  inline def jsx_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ Any,
    props: ClassAttributes[T] & P,
    children: ReactNode*
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
  inline def jsx_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ Any,
    props: Null,
    children: ReactNode*
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
  inline def jsx_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ Any,
    props: Unit,
    children: ReactNode*
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
  
  inline def jsx_P_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
  inline def jsx_P_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
  inline def jsx_P_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
  
  object merge {
    
    inline def apply(
      a: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any,
      b: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    @JSImport("theme-ui", "merge")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("theme-ui", "merge.all")
    @js.native
    def all: FnCall = js.native
    inline def all_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
  }
  
  inline def useColorMode[T /* <: String */](): js.Tuple2[T, Dispatch[SetStateAction[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useColorMode")().asInstanceOf[js.Tuple2[T, Dispatch[SetStateAction[T]]]]
  
  inline def useThemeUI(): ThemeUIContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useThemeUI")().asInstanceOf[ThemeUIContextValue]
}
