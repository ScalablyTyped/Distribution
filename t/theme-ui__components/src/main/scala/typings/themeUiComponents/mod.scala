package typings.themeUiComponents

import org.scalablytyped.runtime.TopLevel
import typings.emotionCore.mod.InterpolationWithTheme
import typings.emotionSerialize.mod.Interpolation
import typings.emotionStyledBase.mod.StyledComponent
import typings.react.anon.Html
import typings.react.mod.AnimationEvent
import typings.react.mod.AnimationEventHandler
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.CompositionEvent
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import typings.react.mod.ElementType
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.Key
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.LegacyRef
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.PointerEvent
import typings.react.mod.PointerEventHandler
import typings.react.mod.PropsWithoutRef
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEvent
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEvent
import typings.react.mod.WheelEventHandler
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.Exclude
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLHeadingElement
import typings.std.HTMLIFrameElement
import typings.std.HTMLImageElement
import typings.std.HTMLInputElement
import typings.std.HTMLLabelElement
import typings.std.HTMLProgressElement
import typings.std.HTMLSelectElement
import typings.std.HTMLTextAreaElement
import typings.std.Pick
import typings.std.SVGSVGElement
import typings.styledSystem.mod.ColorProps
import typings.styledSystem.mod.MarginProps
import typings.styledSystem.mod.RequiredTheme
import typings.styledSystem.mod.ResponsiveValue
import typings.styledSystem.mod.SpaceProps
import typings.styledSystem.mod.ThemeValue
import typings.themeUiComponents.anon.As
import typings.themeUiComponents.themeUiComponentsStrings._empty
import typings.themeUiComponents.themeUiComponentsStrings.`additions removals`
import typings.themeUiComponents.themeUiComponentsStrings.`additions text`
import typings.themeUiComponents.themeUiComponentsStrings.`after-edge`
import typings.themeUiComponents.themeUiComponentsStrings.`before-edge`
import typings.themeUiComponents.themeUiComponentsStrings.`inline`
import typings.themeUiComponents.themeUiComponentsStrings.`removals additions`
import typings.themeUiComponents.themeUiComponentsStrings.`removals text`
import typings.themeUiComponents.themeUiComponentsStrings.`text additions`
import typings.themeUiComponents.themeUiComponentsStrings.`text removals`
import typings.themeUiComponents.themeUiComponentsStrings.`text-after-edge`
import typings.themeUiComponents.themeUiComponentsStrings.`text-before-edge`
import typings.themeUiComponents.themeUiComponentsStrings.`use-credentials`
import typings.themeUiComponents.themeUiComponentsStrings.a
import typings.themeUiComponents.themeUiComponentsStrings.additions
import typings.themeUiComponents.themeUiComponentsStrings.all
import typings.themeUiComponents.themeUiComponentsStrings.alphabetic
import typings.themeUiComponents.themeUiComponentsStrings.anonymous
import typings.themeUiComponents.themeUiComponentsStrings.as
import typings.themeUiComponents.themeUiComponentsStrings.ascending
import typings.themeUiComponents.themeUiComponentsStrings.assertive
import typings.themeUiComponents.themeUiComponentsStrings.auto
import typings.themeUiComponents.themeUiComponentsStrings.baseline
import typings.themeUiComponents.themeUiComponentsStrings.bevel
import typings.themeUiComponents.themeUiComponentsStrings.both
import typings.themeUiComponents.themeUiComponentsStrings.butt
import typings.themeUiComponents.themeUiComponentsStrings.button
import typings.themeUiComponents.themeUiComponentsStrings.central
import typings.themeUiComponents.themeUiComponentsStrings.children
import typings.themeUiComponents.themeUiComponentsStrings.colors
import typings.themeUiComponents.themeUiComponentsStrings.copy
import typings.themeUiComponents.themeUiComponentsStrings.date
import typings.themeUiComponents.themeUiComponentsStrings.descending
import typings.themeUiComponents.themeUiComponentsStrings.dialog
import typings.themeUiComponents.themeUiComponentsStrings.div
import typings.themeUiComponents.themeUiComponentsStrings.evenodd
import typings.themeUiComponents.themeUiComponentsStrings.execute
import typings.themeUiComponents.themeUiComponentsStrings.grammar
import typings.themeUiComponents.themeUiComponentsStrings.grid
import typings.themeUiComponents.themeUiComponentsStrings.h2
import typings.themeUiComponents.themeUiComponentsStrings.hanging
import typings.themeUiComponents.themeUiComponentsStrings.horizontal
import typings.themeUiComponents.themeUiComponentsStrings.ideographic
import typings.themeUiComponents.themeUiComponentsStrings.img
import typings.themeUiComponents.themeUiComponentsStrings.inherit
import typings.themeUiComponents.themeUiComponentsStrings.initial
import typings.themeUiComponents.themeUiComponentsStrings.input
import typings.themeUiComponents.themeUiComponentsStrings.isolated
import typings.themeUiComponents.themeUiComponentsStrings.label
import typings.themeUiComponents.themeUiComponentsStrings.linearRGB
import typings.themeUiComponents.themeUiComponentsStrings.link
import typings.themeUiComponents.themeUiComponentsStrings.list
import typings.themeUiComponents.themeUiComponentsStrings.listbox
import typings.themeUiComponents.themeUiComponentsStrings.location
import typings.themeUiComponents.themeUiComponentsStrings.mathematical
import typings.themeUiComponents.themeUiComponentsStrings.medial
import typings.themeUiComponents.themeUiComponentsStrings.menu
import typings.themeUiComponents.themeUiComponentsStrings.middle
import typings.themeUiComponents.themeUiComponentsStrings.miter
import typings.themeUiComponents.themeUiComponentsStrings.mixed
import typings.themeUiComponents.themeUiComponentsStrings.move
import typings.themeUiComponents.themeUiComponentsStrings.name
import typings.themeUiComponents.themeUiComponentsStrings.no
import typings.themeUiComponents.themeUiComponentsStrings.none
import typings.themeUiComponents.themeUiComponentsStrings.nonzero
import typings.themeUiComponents.themeUiComponentsStrings.off
import typings.themeUiComponents.themeUiComponentsStrings.other
import typings.themeUiComponents.themeUiComponentsStrings.page
import typings.themeUiComponents.themeUiComponentsStrings.polite
import typings.themeUiComponents.themeUiComponentsStrings.popup
import typings.themeUiComponents.themeUiComponentsStrings.progress
import typings.themeUiComponents.themeUiComponentsStrings.removals
import typings.themeUiComponents.themeUiComponentsStrings.replace
import typings.themeUiComponents.themeUiComponentsStrings.round
import typings.themeUiComponents.themeUiComponentsStrings.sRGB
import typings.themeUiComponents.themeUiComponentsStrings.select
import typings.themeUiComponents.themeUiComponentsStrings.space
import typings.themeUiComponents.themeUiComponentsStrings.spelling
import typings.themeUiComponents.themeUiComponentsStrings.square
import typings.themeUiComponents.themeUiComponentsStrings.step
import typings.themeUiComponents.themeUiComponentsStrings.sum
import typings.themeUiComponents.themeUiComponentsStrings.terminal
import typings.themeUiComponents.themeUiComponentsStrings.text
import typings.themeUiComponents.themeUiComponentsStrings.textarea
import typings.themeUiComponents.themeUiComponentsStrings.time
import typings.themeUiComponents.themeUiComponentsStrings.tree
import typings.themeUiComponents.themeUiComponentsStrings.vertical
import typings.themeUiComponents.themeUiComponentsStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@theme-ui/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@theme-ui/components", "Alert")
  @js.native
  val Alert: ForwardRef[HTMLDivElement, AlertProps] = js.native
  
  @JSImport("@theme-ui/components", "AspectImage")
  @js.native
  val AspectImage: ForwardRef[HTMLImageElement, AspectImageProps] = js.native
  
  @JSImport("@theme-ui/components", "AspectRatio")
  @js.native
  val AspectRatio: ForwardRef[HTMLDivElement, AspectRatioProps] = js.native
  
  @JSImport("@theme-ui/components", "Avatar")
  @js.native
  val Avatar: ForwardRef[HTMLImageElement, AvatarProps] = js.native
  
  @JSImport("@theme-ui/components", "Badge")
  @js.native
  val Badge: ForwardRef[HTMLDivElement, BadgeProps] = js.native
  
  @JSImport("@theme-ui/components", "Box")
  @js.native
  val Box: StyledComponent[ComponentProps[div], BoxOwnProps, js.Object] = js.native
  
  @JSImport("@theme-ui/components", "Button")
  @js.native
  val Button: ForwardRef[HTMLButtonElement, ButtonProps] = js.native
  
  @JSImport("@theme-ui/components", "Card")
  @js.native
  val Card: ForwardRef[HTMLDivElement, CardProps] = js.native
  
  @JSImport("@theme-ui/components", "Checkbox")
  @js.native
  val Checkbox: ForwardRef[HTMLInputElement, CheckboxProps] = js.native
  
  @JSImport("@theme-ui/components", "Close")
  @js.native
  val Close: ForwardRef[HTMLButtonElement, CloseProps] = js.native
  
  @JSImport("@theme-ui/components", "Container")
  @js.native
  val Container: ForwardRef[HTMLDivElement, ContainerProps] = js.native
  
  @JSImport("@theme-ui/components", "Divider")
  @js.native
  val Divider: ForwardRef[HTMLDivElement, DividerProps] = js.native
  
  @JSImport("@theme-ui/components", "Donut")
  @js.native
  val Donut: ForwardRef[SVGSVGElement, DonutProps] = js.native
  
  @JSImport("@theme-ui/components", "Embed")
  @js.native
  val Embed: ForwardRef[HTMLIFrameElement, EmbedProps] = js.native
  
  inline def Field[T /* <: ElementType[js.Any] */](props: FieldProps[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Field")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@theme-ui/components", "Flex")
  @js.native
  val Flex: StyledComponent[ComponentProps[div], FlexStyleProps, js.Object] = js.native
  
  @JSImport("@theme-ui/components", "Grid")
  @js.native
  val Grid: ForwardRef[HTMLDivElement, GridProps] = js.native
  
  @JSImport("@theme-ui/components", "Heading")
  @js.native
  val Heading: ForwardRef[HTMLHeadingElement, HeadingProps] = js.native
  
  @JSImport("@theme-ui/components", "IconButton")
  @js.native
  val IconButton: ForwardRef[HTMLButtonElement, IconButtonProps] = js.native
  
  @JSImport("@theme-ui/components", "Image")
  @js.native
  val Image: ForwardRef[HTMLImageElement, ImageProps] = js.native
  
  @JSImport("@theme-ui/components", "Input")
  @js.native
  val Input: ForwardRef[HTMLInputElement, InputProps] = js.native
  
  @JSImport("@theme-ui/components", "Label")
  @js.native
  val Label: ForwardRef[HTMLLabelElement, LabelProps] = js.native
  
  @JSImport("@theme-ui/components", "Link")
  @js.native
  val Link: ForwardRef[HTMLAnchorElement, LinkProps] = js.native
  
  @JSImport("@theme-ui/components", "MenuButton")
  @js.native
  val MenuButton: ForwardRef[HTMLButtonElement, MenuButtonProps] = js.native
  
  @JSImport("@theme-ui/components", "Message")
  @js.native
  val Message: ForwardRef[HTMLDivElement, MessageProps] = js.native
  
  @JSImport("@theme-ui/components", "NavLink")
  @js.native
  val NavLink: ForwardRef[HTMLAnchorElement, NavLinkProps] = js.native
  
  @JSImport("@theme-ui/components", "Progress")
  @js.native
  val Progress: ForwardRef[HTMLProgressElement, ProgressProps] = js.native
  
  @JSImport("@theme-ui/components", "Radio")
  @js.native
  val Radio: ForwardRef[HTMLInputElement, RadioProps] = js.native
  
  @JSImport("@theme-ui/components", "Select")
  @js.native
  val Select: ForwardRef[HTMLSelectElement, SelectProps] = js.native
  
  @JSImport("@theme-ui/components", "Slider")
  @js.native
  val Slider: ForwardRef[HTMLInputElement, SliderProps] = js.native
  
  @JSImport("@theme-ui/components", "Spinner")
  @js.native
  val Spinner: ForwardRef[SVGSVGElement, SpinnerProps] = js.native
  
  @JSImport("@theme-ui/components", "Text")
  @js.native
  val Text: ForwardRef[HTMLDivElement, BoxProps] = js.native
  
  @JSImport("@theme-ui/components", "Textarea")
  @js.native
  val Textarea: ForwardRef[HTMLTextAreaElement, TextareaProps] = js.native
  
  type AlertProps = BoxProps
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof react.react.ComponentProps<'img'> & @theme-ui/components.@theme-ui/components.BoxOwnProps ]: P extends keyof react.react.ComponentProps<'img'>? react.react.ComponentProps<'img'>[P] : P extends keyof @theme-ui/components.@theme-ui/components.BoxOwnProps? @theme-ui/components.@theme-ui/components.BoxOwnProps[P] : never} */ trait AspectImageProps extends StObject {
    
    var ratio: js.UndefOr[Double] = js.undefined
  }
  object AspectImageProps {
    
    inline def apply(): AspectImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AspectImageProps]
    }
    
    extension [Self <: AspectImageProps](x: Self) {
      
      inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof react.react.ComponentProps<'div'> & @theme-ui/components.@theme-ui/components.BoxOwnProps ]: P extends keyof react.react.ComponentProps<'div'>? react.react.ComponentProps<'div'>[P] : P extends keyof @theme-ui/components.@theme-ui/components.BoxOwnProps? @theme-ui/components.@theme-ui/components.BoxOwnProps[P] : never} */ trait AspectRatioProps extends StObject {
    
    var ratio: js.UndefOr[Double] = js.undefined
  }
  object AspectRatioProps {
    
    inline def apply(): AspectRatioProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AspectRatioProps]
    }
    
    extension [Self <: AspectRatioProps](x: Self) {
      
      inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    }
  }
  
  type Assign[T, U] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T & U ]: P extends keyof T? T[P] : P extends keyof U? U[P] : never}
    */ typings.themeUiComponents.themeUiComponentsStrings.Assign & TopLevel[js.Any]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof react.react.ComponentProps<'img'> & @theme-ui/components.@theme-ui/components.BoxOwnProps ]: P extends keyof react.react.ComponentProps<'img'>? react.react.ComponentProps<'img'>[P] : P extends keyof @theme-ui/components.@theme-ui/components.BoxOwnProps? @theme-ui/components.@theme-ui/components.BoxOwnProps[P] : never} */ trait AvatarProps extends StObject {
    
    var size: js.UndefOr[Double | String] = js.undefined
  }
  object AvatarProps {
    
    inline def apply(): AvatarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarProps]
    }
    
    extension [Self <: AvatarProps](x: Self) {
      
      inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type BadgeProps = BoxProps
  
  trait BoxOwnProps
    extends StObject
       with SpaceProps[RequiredTheme, ThemeValue[space, RequiredTheme, js.Any]]
       with ColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]] {
    
    var as: js.UndefOr[ElementType[js.Any]] = js.undefined
    
    var css: js.UndefOr[InterpolationWithTheme[js.Any]] = js.undefined
    
    var sx: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SxStyleProp */ js.Any
      ] = js.undefined
    
    var variant: js.UndefOr[String] = js.undefined
  }
  object BoxOwnProps {
    
    inline def apply(): BoxOwnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoxOwnProps]
    }
    
    extension [Self <: BoxOwnProps](x: Self) {
      
      inline def setAs(value: ElementType[js.Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setCss(value: InterpolationWithTheme[js.Any]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssFunction1(value: js.Any => Interpolation[Unit]): Self = StObject.set(x, "css", js.Any.fromFunction1(value))
      
      inline def setCssNull: Self = StObject.set(x, "css", null)
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setSx(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SxStyleProp */ js.Any
      ): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type BoxProps = Assign[ComponentProps[div], BoxOwnProps]
  
  type ButtonProps = Assign[ComponentPropsWithRef[button], BoxOwnProps]
  
  type CardProps = BoxProps
  
  type CheckboxProps = Assign[ComponentProps[input], BoxOwnProps]
  
  type CloseProps = Omit[IconButtonProps, children]
  
  type ContainerProps = BoxProps
  
  type DividerProps = BoxProps
  
  /* Inlined parent @theme-ui/components.@theme-ui/components.Omit<react.react.SVGProps<std.SVGSVGElement>, 'opacity' | 'color' | 'css' | 'sx' | 'max' | 'min'> */
  /* Inlined parent @theme-ui/components.@theme-ui/components.BoxOwnProps */
  trait DonutProps extends StObject {
    
    var accentHeight: js.UndefOr[Double | String] = js.undefined
    
    var accumulate: js.UndefOr[none | sum] = js.undefined
    
    var additive: js.UndefOr[replace | sum] = js.undefined
    
    var alignmentBaseline: js.UndefOr[
        auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
      ] = js.undefined
    
    var allowReorder: js.UndefOr[no | yes] = js.undefined
    
    var alphabetic: js.UndefOr[Double | String] = js.undefined
    
    var amplitude: js.UndefOr[Double | String] = js.undefined
    
    var arabicForm: js.UndefOr[initial | medial | terminal | isolated] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-atomic`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
    
    var `aria-busy`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-colcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-colindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-colspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-details`: js.UndefOr[String] = js.undefined
    
    var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-flowto`: js.UndefOr[String] = js.undefined
    
    var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
    
    var `aria-hidden`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var `aria-level`: js.UndefOr[Double] = js.undefined
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
    
    var `aria-modal`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-multiline`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
    
    var `aria-owns`: js.UndefOr[String] = js.undefined
    
    var `aria-placeholder`: js.UndefOr[String] = js.undefined
    
    var `aria-posinset`: js.UndefOr[Double] = js.undefined
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.undefined
    
    var `aria-required`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-roledescription`: js.UndefOr[String] = js.undefined
    
    var `aria-rowcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-selected`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-setsize`: js.UndefOr[Double] = js.undefined
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
    
    var `aria-valuemax`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuemin`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuenow`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuetext`: js.UndefOr[String] = js.undefined
    
    var as: js.UndefOr[ElementType[js.Any]] = js.undefined
    
    var ascent: js.UndefOr[Double | String] = js.undefined
    
    var attributeName: js.UndefOr[String] = js.undefined
    
    var attributeType: js.UndefOr[String] = js.undefined
    
    var autoReverse: js.UndefOr[Booleanish] = js.undefined
    
    var azimuth: js.UndefOr[Double | String] = js.undefined
    
    var backgroundColor: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var baseFrequency: js.UndefOr[Double | String] = js.undefined
    
    var baseProfile: js.UndefOr[Double | String] = js.undefined
    
    var baselineShift: js.UndefOr[Double | String] = js.undefined
    
    var bbox: js.UndefOr[Double | String] = js.undefined
    
    var begin: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
      * By default the raw value of the prop is returned.
      *
      * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
      * Array values are converted into responsive values.
      *
      * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-color)
      */
    var bg: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var bias: js.UndefOr[Double | String] = js.undefined
    
    var by: js.UndefOr[Double | String] = js.undefined
    
    var calcMode: js.UndefOr[Double | String] = js.undefined
    
    var capHeight: js.UndefOr[Double | String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clip: js.UndefOr[Double | String] = js.undefined
    
    var clipPath: js.UndefOr[String] = js.undefined
    
    var clipPathUnits: js.UndefOr[Double | String] = js.undefined
    
    var clipRule: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
      * By default the raw value of the prop is returned.
      *
      * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
      * Array values are converted into responsive values.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/color)
      */
    var color: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var colorInterpolation: js.UndefOr[Double | String] = js.undefined
    
    var colorInterpolationFilters: js.UndefOr[auto | sRGB | linearRGB | inherit] = js.undefined
    
    var colorProfile: js.UndefOr[Double | String] = js.undefined
    
    var colorRendering: js.UndefOr[Double | String] = js.undefined
    
    var contentScriptType: js.UndefOr[Double | String] = js.undefined
    
    var contentStyleType: js.UndefOr[Double | String] = js.undefined
    
    var crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.undefined
    
    var css: js.UndefOr[InterpolationWithTheme[js.Any]] = js.undefined
    
    var cursor: js.UndefOr[Double | String] = js.undefined
    
    var cx: js.UndefOr[Double | String] = js.undefined
    
    var cy: js.UndefOr[Double | String] = js.undefined
    
    var d: js.UndefOr[String] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    var decelerate: js.UndefOr[Double | String] = js.undefined
    
    var descent: js.UndefOr[Double | String] = js.undefined
    
    var diffuseConstant: js.UndefOr[Double | String] = js.undefined
    
    var direction: js.UndefOr[Double | String] = js.undefined
    
    var display: js.UndefOr[Double | String] = js.undefined
    
    var divisor: js.UndefOr[Double | String] = js.undefined
    
    var dominantBaseline: js.UndefOr[Double | String] = js.undefined
    
    var dur: js.UndefOr[Double | String] = js.undefined
    
    var dx: js.UndefOr[Double | String] = js.undefined
    
    var dy: js.UndefOr[Double | String] = js.undefined
    
    var edgeMode: js.UndefOr[Double | String] = js.undefined
    
    var elevation: js.UndefOr[Double | String] = js.undefined
    
    var enableBackground: js.UndefOr[Double | String] = js.undefined
    
    var end: js.UndefOr[Double | String] = js.undefined
    
    var exponent: js.UndefOr[Double | String] = js.undefined
    
    var externalResourcesRequired: js.UndefOr[Booleanish] = js.undefined
    
    var fill: js.UndefOr[String] = js.undefined
    
    var fillOpacity: js.UndefOr[Double | String] = js.undefined
    
    var fillRule: js.UndefOr[nonzero | evenodd | inherit] = js.undefined
    
    var filter: js.UndefOr[String] = js.undefined
    
    var filterRes: js.UndefOr[Double | String] = js.undefined
    
    var filterUnits: js.UndefOr[Double | String] = js.undefined
    
    var floodColor: js.UndefOr[Double | String] = js.undefined
    
    var floodOpacity: js.UndefOr[Double | String] = js.undefined
    
    var focusable: js.UndefOr[Booleanish | auto] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[Double | String] = js.undefined
    
    var fontSizeAdjust: js.UndefOr[Double | String] = js.undefined
    
    var fontStretch: js.UndefOr[Double | String] = js.undefined
    
    var fontStyle: js.UndefOr[Double | String] = js.undefined
    
    var fontVariant: js.UndefOr[Double | String] = js.undefined
    
    var fontWeight: js.UndefOr[Double | String] = js.undefined
    
    var format: js.UndefOr[Double | String] = js.undefined
    
    var from: js.UndefOr[Double | String] = js.undefined
    
    var fx: js.UndefOr[Double | String] = js.undefined
    
    var fy: js.UndefOr[Double | String] = js.undefined
    
    var g1: js.UndefOr[Double | String] = js.undefined
    
    var g2: js.UndefOr[Double | String] = js.undefined
    
    var glyphName: js.UndefOr[Double | String] = js.undefined
    
    var glyphOrientationHorizontal: js.UndefOr[Double | String] = js.undefined
    
    var glyphOrientationVertical: js.UndefOr[Double | String] = js.undefined
    
    var glyphRef: js.UndefOr[Double | String] = js.undefined
    
    var gradientTransform: js.UndefOr[String] = js.undefined
    
    var gradientUnits: js.UndefOr[String] = js.undefined
    
    var hanging: js.UndefOr[Double | String] = js.undefined
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var horizAdvX: js.UndefOr[Double | String] = js.undefined
    
    var horizOriginX: js.UndefOr[Double | String] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var ideographic: js.UndefOr[Double | String] = js.undefined
    
    var imageRendering: js.UndefOr[Double | String] = js.undefined
    
    var in: js.UndefOr[String] = js.undefined
    
    var in2: js.UndefOr[Double | String] = js.undefined
    
    var intercept: js.UndefOr[Double | String] = js.undefined
    
    var k: js.UndefOr[Double | String] = js.undefined
    
    var k1: js.UndefOr[Double | String] = js.undefined
    
    var k2: js.UndefOr[Double | String] = js.undefined
    
    var k3: js.UndefOr[Double | String] = js.undefined
    
    var k4: js.UndefOr[Double | String] = js.undefined
    
    var kernelMatrix: js.UndefOr[Double | String] = js.undefined
    
    var kernelUnitLength: js.UndefOr[Double | String] = js.undefined
    
    var kerning: js.UndefOr[Double | String] = js.undefined
    
    var key: js.UndefOr[Key | Null] = js.undefined
    
    var keyPoints: js.UndefOr[Double | String] = js.undefined
    
    var keySplines: js.UndefOr[Double | String] = js.undefined
    
    var keyTimes: js.UndefOr[Double | String] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var lengthAdjust: js.UndefOr[Double | String] = js.undefined
    
    var letterSpacing: js.UndefOr[Double | String] = js.undefined
    
    var lightingColor: js.UndefOr[Double | String] = js.undefined
    
    var limitingConeAngle: js.UndefOr[Double | String] = js.undefined
    
    var local: js.UndefOr[Double | String] = js.undefined
    
    /** Margin on top, left, bottom and right */
    var m: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top, left, bottom and right */
    var margin: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on bottom */
    var marginBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on left */
    var marginLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on right */
    var marginRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top */
    var marginTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on left and right */
    var marginX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top and bottom */
    var marginY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var markerEnd: js.UndefOr[String] = js.undefined
    
    var markerHeight: js.UndefOr[Double | String] = js.undefined
    
    var markerMid: js.UndefOr[String] = js.undefined
    
    var markerStart: js.UndefOr[String] = js.undefined
    
    var markerUnits: js.UndefOr[Double | String] = js.undefined
    
    var markerWidth: js.UndefOr[Double | String] = js.undefined
    
    var mask: js.UndefOr[String] = js.undefined
    
    var maskContentUnits: js.UndefOr[Double | String] = js.undefined
    
    var maskUnits: js.UndefOr[Double | String] = js.undefined
    
    var mathematical: js.UndefOr[Double | String] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    /** Margin on bottom */
    var mb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var media: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    /** Margin on left */
    var ml: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var mode: js.UndefOr[Double | String] = js.undefined
    
    /** Margin on right */
    var mr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top */
    var mt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on left and right */
    var mx: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top and bottom */
    var my: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var numOctaves: js.UndefOr[Double | String] = js.undefined
    
    var offset: js.UndefOr[Double | String] = js.undefined
    
    var onAbort: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.undefined
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.undefined
    
    var onAuxClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
    
    var onBeforeInput: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[SVGSVGElement]] = js.undefined
    
    var onCanPlay: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onChange: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.undefined
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
    
    var onCopy: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.undefined
    
    var onCut: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.undefined
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
    
    var onDrag: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
    
    var onDragExit: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
    
    var onDurationChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onEmptied: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onEncrypted: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onEnded: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onError: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[SVGSVGElement]] = js.undefined
    
    var onInput: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
    
    var onInvalid: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.undefined
    
    var onLoad: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onLoadStart: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onLoadedData: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
    
    var onMouseOut: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.undefined
    
    var onPause: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onPlay: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onPlaying: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
    
    var onPointerDown: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
    
    var onPointerMove: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
    
    var onPointerOut: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
    
    var onPointerOver: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
    
    var onPointerUp: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
    
    var onProgress: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onRateChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onReset: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
    
    var onScroll: js.UndefOr[UIEventHandler[SVGSVGElement]] = js.undefined
    
    var onSeeked: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onSeeking: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onSelect: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onStalled: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onSubmit: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
    
    var onSuspend: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[SVGSVGElement]] = js.undefined
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onWaiting: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onWheel: js.UndefOr[WheelEventHandler[SVGSVGElement]] = js.undefined
    
    /**
      * The opacity CSS property sets the transparency of an element or the degree to which content
      * behind an element is visible.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/opacity)
      */
    var opacity: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var operator: js.UndefOr[Double | String] = js.undefined
    
    var order: js.UndefOr[Double | String] = js.undefined
    
    var orient: js.UndefOr[Double | String] = js.undefined
    
    var orientation: js.UndefOr[Double | String] = js.undefined
    
    var origin: js.UndefOr[Double | String] = js.undefined
    
    var overflow: js.UndefOr[Double | String] = js.undefined
    
    var overlinePosition: js.UndefOr[Double | String] = js.undefined
    
    var overlineThickness: js.UndefOr[Double | String] = js.undefined
    
    /** Padding on top, left, bottom and right */
    var p: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top, left, bottom and right */
    var padding: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on bottom */
    var paddingBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left */
    var paddingLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on right */
    var paddingRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top */
    var paddingTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left and right */
    var paddingX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top and bottom */
    var paddingY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var paintOrder: js.UndefOr[Double | String] = js.undefined
    
    var panose1: js.UndefOr[Double | String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var pathLength: js.UndefOr[Double | String] = js.undefined
    
    var patternContentUnits: js.UndefOr[String] = js.undefined
    
    var patternTransform: js.UndefOr[Double | String] = js.undefined
    
    var patternUnits: js.UndefOr[String] = js.undefined
    
    /** Padding on bottom */
    var pb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left */
    var pl: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var pointerEvents: js.UndefOr[Double | String] = js.undefined
    
    var points: js.UndefOr[String] = js.undefined
    
    var pointsAtX: js.UndefOr[Double | String] = js.undefined
    
    var pointsAtY: js.UndefOr[Double | String] = js.undefined
    
    var pointsAtZ: js.UndefOr[Double | String] = js.undefined
    
    /** Padding on right */
    var pr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var preserveAlpha: js.UndefOr[Booleanish] = js.undefined
    
    var preserveAspectRatio: js.UndefOr[String] = js.undefined
    
    var primitiveUnits: js.UndefOr[Double | String] = js.undefined
    
    /** Padding on top */
    var pt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left and right */
    var px: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top and bottom */
    var py: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var r: js.UndefOr[Double | String] = js.undefined
    
    var radius: js.UndefOr[Double | String] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[SVGSVGElement]] = js.undefined
    
    var refX: js.UndefOr[Double | String] = js.undefined
    
    var refY: js.UndefOr[Double | String] = js.undefined
    
    var renderingIntent: js.UndefOr[Double | String] = js.undefined
    
    var repeatCount: js.UndefOr[Double | String] = js.undefined
    
    var repeatDur: js.UndefOr[Double | String] = js.undefined
    
    var requiredExtensions: js.UndefOr[Double | String] = js.undefined
    
    var requiredFeatures: js.UndefOr[Double | String] = js.undefined
    
    var restart: js.UndefOr[Double | String] = js.undefined
    
    var result: js.UndefOr[String] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var rotate: js.UndefOr[Double | String] = js.undefined
    
    var rx: js.UndefOr[Double | String] = js.undefined
    
    var ry: js.UndefOr[Double | String] = js.undefined
    
    var scale: js.UndefOr[Double | String] = js.undefined
    
    var seed: js.UndefOr[Double | String] = js.undefined
    
    var shapeRendering: js.UndefOr[Double | String] = js.undefined
    
    var size: js.UndefOr[String | Double] = js.undefined
    
    var slope: js.UndefOr[Double | String] = js.undefined
    
    var spacing: js.UndefOr[Double | String] = js.undefined
    
    var specularConstant: js.UndefOr[Double | String] = js.undefined
    
    var specularExponent: js.UndefOr[Double | String] = js.undefined
    
    var speed: js.UndefOr[Double | String] = js.undefined
    
    var spreadMethod: js.UndefOr[String] = js.undefined
    
    var startOffset: js.UndefOr[Double | String] = js.undefined
    
    var stdDeviation: js.UndefOr[Double | String] = js.undefined
    
    var stemh: js.UndefOr[Double | String] = js.undefined
    
    var stemv: js.UndefOr[Double | String] = js.undefined
    
    var stitchTiles: js.UndefOr[Double | String] = js.undefined
    
    var stopColor: js.UndefOr[String] = js.undefined
    
    var stopOpacity: js.UndefOr[Double | String] = js.undefined
    
    var strikethroughPosition: js.UndefOr[Double | String] = js.undefined
    
    var strikethroughThickness: js.UndefOr[Double | String] = js.undefined
    
    var string: js.UndefOr[Double | String] = js.undefined
    
    var stroke: js.UndefOr[String] = js.undefined
    
    var strokeDasharray: js.UndefOr[String | Double] = js.undefined
    
    var strokeDashoffset: js.UndefOr[String | Double] = js.undefined
    
    var strokeLinecap: js.UndefOr[butt | round | square | inherit] = js.undefined
    
    var strokeLinejoin: js.UndefOr[miter | round | bevel | inherit] = js.undefined
    
    var strokeMiterlimit: js.UndefOr[Double | String] = js.undefined
    
    var strokeOpacity: js.UndefOr[Double | String] = js.undefined
    
    var strokeWidth: js.UndefOr[Double | String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var surfaceScale: js.UndefOr[Double | String] = js.undefined
    
    var sx: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SxStyleProp */ js.Any
      ] = js.undefined
    
    var systemLanguage: js.UndefOr[Double | String] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var tableValues: js.UndefOr[Double | String] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var targetX: js.UndefOr[Double | String] = js.undefined
    
    var targetY: js.UndefOr[Double | String] = js.undefined
    
    var textAnchor: js.UndefOr[String] = js.undefined
    
    var textDecoration: js.UndefOr[Double | String] = js.undefined
    
    var textLength: js.UndefOr[Double | String] = js.undefined
    
    var textRendering: js.UndefOr[Double | String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var to: js.UndefOr[Double | String] = js.undefined
    
    var transform: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var u1: js.UndefOr[Double | String] = js.undefined
    
    var u2: js.UndefOr[Double | String] = js.undefined
    
    var underlinePosition: js.UndefOr[Double | String] = js.undefined
    
    var underlineThickness: js.UndefOr[Double | String] = js.undefined
    
    var unicode: js.UndefOr[Double | String] = js.undefined
    
    var unicodeBidi: js.UndefOr[Double | String] = js.undefined
    
    var unicodeRange: js.UndefOr[Double | String] = js.undefined
    
    var unitsPerEm: js.UndefOr[Double | String] = js.undefined
    
    var vAlphabetic: js.UndefOr[Double | String] = js.undefined
    
    var vHanging: js.UndefOr[Double | String] = js.undefined
    
    var vIdeographic: js.UndefOr[Double | String] = js.undefined
    
    var vMathematical: js.UndefOr[Double | String] = js.undefined
    
    var value: Double
    
    var values: js.UndefOr[String] = js.undefined
    
    var variant: js.UndefOr[String] = js.undefined
    
    var vectorEffect: js.UndefOr[Double | String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
    
    var vertAdvY: js.UndefOr[Double | String] = js.undefined
    
    var vertOriginX: js.UndefOr[Double | String] = js.undefined
    
    var vertOriginY: js.UndefOr[Double | String] = js.undefined
    
    var viewBox: js.UndefOr[String] = js.undefined
    
    var viewTarget: js.UndefOr[Double | String] = js.undefined
    
    var visibility: js.UndefOr[Double | String] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
    
    var widths: js.UndefOr[Double | String] = js.undefined
    
    var wordSpacing: js.UndefOr[Double | String] = js.undefined
    
    var writingMode: js.UndefOr[Double | String] = js.undefined
    
    var x: js.UndefOr[Double | String] = js.undefined
    
    var x1: js.UndefOr[Double | String] = js.undefined
    
    var x2: js.UndefOr[Double | String] = js.undefined
    
    var xChannelSelector: js.UndefOr[String] = js.undefined
    
    var xHeight: js.UndefOr[Double | String] = js.undefined
    
    var xlinkActuate: js.UndefOr[String] = js.undefined
    
    var xlinkArcrole: js.UndefOr[String] = js.undefined
    
    var xlinkHref: js.UndefOr[String] = js.undefined
    
    var xlinkRole: js.UndefOr[String] = js.undefined
    
    var xlinkShow: js.UndefOr[String] = js.undefined
    
    var xlinkTitle: js.UndefOr[String] = js.undefined
    
    var xlinkType: js.UndefOr[String] = js.undefined
    
    var xmlBase: js.UndefOr[String] = js.undefined
    
    var xmlLang: js.UndefOr[String] = js.undefined
    
    var xmlSpace: js.UndefOr[String] = js.undefined
    
    var xmlns: js.UndefOr[String] = js.undefined
    
    var xmlnsXlink: js.UndefOr[String] = js.undefined
    
    var y: js.UndefOr[Double | String] = js.undefined
    
    var y1: js.UndefOr[Double | String] = js.undefined
    
    var y2: js.UndefOr[Double | String] = js.undefined
    
    var yChannelSelector: js.UndefOr[String] = js.undefined
    
    var z: js.UndefOr[Double | String] = js.undefined
    
    var zoomAndPan: js.UndefOr[String] = js.undefined
  }
  object DonutProps {
    
    inline def apply(value: Double): DonutProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DonutProps]
    }
    
    extension [Self <: DonutProps](x: Self) {
      
      inline def setAccentHeight(value: Double | String): Self = StObject.set(x, "accentHeight", value.asInstanceOf[js.Any])
      
      inline def setAccentHeightUndefined: Self = StObject.set(x, "accentHeight", js.undefined)
      
      inline def setAccumulate(value: none | sum): Self = StObject.set(x, "accumulate", value.asInstanceOf[js.Any])
      
      inline def setAccumulateUndefined: Self = StObject.set(x, "accumulate", js.undefined)
      
      inline def setAdditive(value: replace | sum): Self = StObject.set(x, "additive", value.asInstanceOf[js.Any])
      
      inline def setAdditiveUndefined: Self = StObject.set(x, "additive", js.undefined)
      
      inline def setAlignmentBaseline(
        value: auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
      ): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
      
      inline def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
      
      inline def setAllowReorder(value: no | yes): Self = StObject.set(x, "allowReorder", value.asInstanceOf[js.Any])
      
      inline def setAllowReorderUndefined: Self = StObject.set(x, "allowReorder", js.undefined)
      
      inline def setAlphabetic(value: Double | String): Self = StObject.set(x, "alphabetic", value.asInstanceOf[js.Any])
      
      inline def setAlphabeticUndefined: Self = StObject.set(x, "alphabetic", js.undefined)
      
      inline def setAmplitude(value: Double | String): Self = StObject.set(x, "amplitude", value.asInstanceOf[js.Any])
      
      inline def setAmplitudeUndefined: Self = StObject.set(x, "amplitude", js.undefined)
      
      inline def setArabicForm(value: initial | medial | terminal | isolated): Self = StObject.set(x, "arabicForm", value.asInstanceOf[js.Any])
      
      inline def setArabicFormUndefined: Self = StObject.set(x, "arabicForm", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAs(value: ElementType[js.Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAscent(value: Double | String): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
      
      inline def setAscentUndefined: Self = StObject.set(x, "ascent", js.undefined)
      
      inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
      
      inline def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
      
      inline def setAttributeType(value: String): Self = StObject.set(x, "attributeType", value.asInstanceOf[js.Any])
      
      inline def setAttributeTypeUndefined: Self = StObject.set(x, "attributeType", js.undefined)
      
      inline def setAutoReverse(value: Booleanish): Self = StObject.set(x, "autoReverse", value.asInstanceOf[js.Any])
      
      inline def setAutoReverseUndefined: Self = StObject.set(x, "autoReverse", js.undefined)
      
      inline def setAzimuth(value: Double | String): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
      
      inline def setAzimuthUndefined: Self = StObject.set(x, "azimuth", js.undefined)
      
      inline def setBackgroundColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBackgroundColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
      
      inline def setBaseFrequency(value: Double | String): Self = StObject.set(x, "baseFrequency", value.asInstanceOf[js.Any])
      
      inline def setBaseFrequencyUndefined: Self = StObject.set(x, "baseFrequency", js.undefined)
      
      inline def setBaseProfile(value: Double | String): Self = StObject.set(x, "baseProfile", value.asInstanceOf[js.Any])
      
      inline def setBaseProfileUndefined: Self = StObject.set(x, "baseProfile", js.undefined)
      
      inline def setBaselineShift(value: Double | String): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
      
      inline def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
      
      inline def setBbox(value: Double | String): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      inline def setBegin(value: Double | String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
      
      inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
      
      inline def setBg(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgNull: Self = StObject.set(x, "bg", null)
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setBgVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "bg", js.Array(value :_*))
      
      inline def setBias(value: Double | String): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      inline def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      inline def setBy(value: Double | String): Self = StObject.set(x, "by", value.asInstanceOf[js.Any])
      
      inline def setByUndefined: Self = StObject.set(x, "by", js.undefined)
      
      inline def setCalcMode(value: Double | String): Self = StObject.set(x, "calcMode", value.asInstanceOf[js.Any])
      
      inline def setCalcModeUndefined: Self = StObject.set(x, "calcMode", js.undefined)
      
      inline def setCapHeight(value: Double | String): Self = StObject.set(x, "capHeight", value.asInstanceOf[js.Any])
      
      inline def setCapHeightUndefined: Self = StObject.set(x, "capHeight", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClip(value: Double | String): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      inline def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
      
      inline def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
      
      inline def setClipPathUnits(value: Double | String): Self = StObject.set(x, "clipPathUnits", value.asInstanceOf[js.Any])
      
      inline def setClipPathUnitsUndefined: Self = StObject.set(x, "clipPathUnits", js.undefined)
      
      inline def setClipRule(value: Double | String): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
      
      inline def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
      
      inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      inline def setColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorInterpolation(value: Double | String): Self = StObject.set(x, "colorInterpolation", value.asInstanceOf[js.Any])
      
      inline def setColorInterpolationFilters(value: auto | sRGB | linearRGB | inherit): Self = StObject.set(x, "colorInterpolationFilters", value.asInstanceOf[js.Any])
      
      inline def setColorInterpolationFiltersUndefined: Self = StObject.set(x, "colorInterpolationFilters", js.undefined)
      
      inline def setColorInterpolationUndefined: Self = StObject.set(x, "colorInterpolation", js.undefined)
      
      inline def setColorNull: Self = StObject.set(x, "color", null)
      
      inline def setColorProfile(value: Double | String): Self = StObject.set(x, "colorProfile", value.asInstanceOf[js.Any])
      
      inline def setColorProfileUndefined: Self = StObject.set(x, "colorProfile", js.undefined)
      
      inline def setColorRendering(value: Double | String): Self = StObject.set(x, "colorRendering", value.asInstanceOf[js.Any])
      
      inline def setColorRenderingUndefined: Self = StObject.set(x, "colorRendering", js.undefined)
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      inline def setContentScriptType(value: Double | String): Self = StObject.set(x, "contentScriptType", value.asInstanceOf[js.Any])
      
      inline def setContentScriptTypeUndefined: Self = StObject.set(x, "contentScriptType", js.undefined)
      
      inline def setContentStyleType(value: Double | String): Self = StObject.set(x, "contentStyleType", value.asInstanceOf[js.Any])
      
      inline def setContentStyleTypeUndefined: Self = StObject.set(x, "contentStyleType", js.undefined)
      
      inline def setCrossOrigin(value: anonymous | `use-credentials` | _empty): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setCss(value: InterpolationWithTheme[js.Any]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssFunction1(value: js.Any => Interpolation[Unit]): Self = StObject.set(x, "css", js.Any.fromFunction1(value))
      
      inline def setCssNull: Self = StObject.set(x, "css", null)
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setCursor(value: Double | String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setCx(value: Double | String): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      inline def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
      
      inline def setCy(value: Double | String): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      inline def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
      
      inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setDecelerate(value: Double | String): Self = StObject.set(x, "decelerate", value.asInstanceOf[js.Any])
      
      inline def setDecelerateUndefined: Self = StObject.set(x, "decelerate", js.undefined)
      
      inline def setDescent(value: Double | String): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
      
      inline def setDescentUndefined: Self = StObject.set(x, "descent", js.undefined)
      
      inline def setDiffuseConstant(value: Double | String): Self = StObject.set(x, "diffuseConstant", value.asInstanceOf[js.Any])
      
      inline def setDiffuseConstantUndefined: Self = StObject.set(x, "diffuseConstant", js.undefined)
      
      inline def setDirection(value: Double | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisplay(value: Double | String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setDivisor(value: Double | String): Self = StObject.set(x, "divisor", value.asInstanceOf[js.Any])
      
      inline def setDivisorUndefined: Self = StObject.set(x, "divisor", js.undefined)
      
      inline def setDominantBaseline(value: Double | String): Self = StObject.set(x, "dominantBaseline", value.asInstanceOf[js.Any])
      
      inline def setDominantBaselineUndefined: Self = StObject.set(x, "dominantBaseline", js.undefined)
      
      inline def setDur(value: Double | String): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
      
      inline def setDurUndefined: Self = StObject.set(x, "dur", js.undefined)
      
      inline def setDx(value: Double | String): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      inline def setDy(value: Double | String): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      inline def setEdgeMode(value: Double | String): Self = StObject.set(x, "edgeMode", value.asInstanceOf[js.Any])
      
      inline def setEdgeModeUndefined: Self = StObject.set(x, "edgeMode", js.undefined)
      
      inline def setElevation(value: Double | String): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      inline def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
      
      inline def setEnableBackground(value: Double | String): Self = StObject.set(x, "enableBackground", value.asInstanceOf[js.Any])
      
      inline def setEnableBackgroundUndefined: Self = StObject.set(x, "enableBackground", js.undefined)
      
      inline def setEnd(value: Double | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setExponent(value: Double | String): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
      
      inline def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
      
      inline def setExternalResourcesRequired(value: Booleanish): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
      
      inline def setExternalResourcesRequiredUndefined: Self = StObject.set(x, "externalResourcesRequired", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillOpacity(value: Double | String): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFillRule(value: nonzero | evenodd | inherit): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
      
      inline def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterRes(value: Double | String): Self = StObject.set(x, "filterRes", value.asInstanceOf[js.Any])
      
      inline def setFilterResUndefined: Self = StObject.set(x, "filterRes", js.undefined)
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFilterUnits(value: Double | String): Self = StObject.set(x, "filterUnits", value.asInstanceOf[js.Any])
      
      inline def setFilterUnitsUndefined: Self = StObject.set(x, "filterUnits", js.undefined)
      
      inline def setFloodColor(value: Double | String): Self = StObject.set(x, "floodColor", value.asInstanceOf[js.Any])
      
      inline def setFloodColorUndefined: Self = StObject.set(x, "floodColor", js.undefined)
      
      inline def setFloodOpacity(value: Double | String): Self = StObject.set(x, "floodOpacity", value.asInstanceOf[js.Any])
      
      inline def setFloodOpacityUndefined: Self = StObject.set(x, "floodOpacity", js.undefined)
      
      inline def setFocusable(value: Booleanish | auto): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeAdjust(value: Double | String): Self = StObject.set(x, "fontSizeAdjust", value.asInstanceOf[js.Any])
      
      inline def setFontSizeAdjustUndefined: Self = StObject.set(x, "fontSizeAdjust", js.undefined)
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStretch(value: Double | String): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
      
      inline def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
      
      inline def setFontStyle(value: Double | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontVariant(value: Double | String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      inline def setFontWeight(value: Double | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setFormat(value: Double | String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setFrom(value: Double | String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setFx(value: Double | String): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
      
      inline def setFxUndefined: Self = StObject.set(x, "fx", js.undefined)
      
      inline def setFy(value: Double | String): Self = StObject.set(x, "fy", value.asInstanceOf[js.Any])
      
      inline def setFyUndefined: Self = StObject.set(x, "fy", js.undefined)
      
      inline def setG1(value: Double | String): Self = StObject.set(x, "g1", value.asInstanceOf[js.Any])
      
      inline def setG1Undefined: Self = StObject.set(x, "g1", js.undefined)
      
      inline def setG2(value: Double | String): Self = StObject.set(x, "g2", value.asInstanceOf[js.Any])
      
      inline def setG2Undefined: Self = StObject.set(x, "g2", js.undefined)
      
      inline def setGlyphName(value: Double | String): Self = StObject.set(x, "glyphName", value.asInstanceOf[js.Any])
      
      inline def setGlyphNameUndefined: Self = StObject.set(x, "glyphName", js.undefined)
      
      inline def setGlyphOrientationHorizontal(value: Double | String): Self = StObject.set(x, "glyphOrientationHorizontal", value.asInstanceOf[js.Any])
      
      inline def setGlyphOrientationHorizontalUndefined: Self = StObject.set(x, "glyphOrientationHorizontal", js.undefined)
      
      inline def setGlyphOrientationVertical(value: Double | String): Self = StObject.set(x, "glyphOrientationVertical", value.asInstanceOf[js.Any])
      
      inline def setGlyphOrientationVerticalUndefined: Self = StObject.set(x, "glyphOrientationVertical", js.undefined)
      
      inline def setGlyphRef(value: Double | String): Self = StObject.set(x, "glyphRef", value.asInstanceOf[js.Any])
      
      inline def setGlyphRefUndefined: Self = StObject.set(x, "glyphRef", js.undefined)
      
      inline def setGradientTransform(value: String): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
      
      inline def setGradientTransformUndefined: Self = StObject.set(x, "gradientTransform", js.undefined)
      
      inline def setGradientUnits(value: String): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
      
      inline def setGradientUnitsUndefined: Self = StObject.set(x, "gradientUnits", js.undefined)
      
      inline def setHanging(value: Double | String): Self = StObject.set(x, "hanging", value.asInstanceOf[js.Any])
      
      inline def setHangingUndefined: Self = StObject.set(x, "hanging", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHorizAdvX(value: Double | String): Self = StObject.set(x, "horizAdvX", value.asInstanceOf[js.Any])
      
      inline def setHorizAdvXUndefined: Self = StObject.set(x, "horizAdvX", js.undefined)
      
      inline def setHorizOriginX(value: Double | String): Self = StObject.set(x, "horizOriginX", value.asInstanceOf[js.Any])
      
      inline def setHorizOriginXUndefined: Self = StObject.set(x, "horizOriginX", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIdeographic(value: Double | String): Self = StObject.set(x, "ideographic", value.asInstanceOf[js.Any])
      
      inline def setIdeographicUndefined: Self = StObject.set(x, "ideographic", js.undefined)
      
      inline def setImageRendering(value: Double | String): Self = StObject.set(x, "imageRendering", value.asInstanceOf[js.Any])
      
      inline def setImageRenderingUndefined: Self = StObject.set(x, "imageRendering", js.undefined)
      
      inline def setIn(value: String): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setIn2(value: Double | String): Self = StObject.set(x, "in2", value.asInstanceOf[js.Any])
      
      inline def setIn2Undefined: Self = StObject.set(x, "in2", js.undefined)
      
      inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      inline def setIntercept(value: Double | String): Self = StObject.set(x, "intercept", value.asInstanceOf[js.Any])
      
      inline def setInterceptUndefined: Self = StObject.set(x, "intercept", js.undefined)
      
      inline def setK(value: Double | String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      inline def setK1(value: Double | String): Self = StObject.set(x, "k1", value.asInstanceOf[js.Any])
      
      inline def setK1Undefined: Self = StObject.set(x, "k1", js.undefined)
      
      inline def setK2(value: Double | String): Self = StObject.set(x, "k2", value.asInstanceOf[js.Any])
      
      inline def setK2Undefined: Self = StObject.set(x, "k2", js.undefined)
      
      inline def setK3(value: Double | String): Self = StObject.set(x, "k3", value.asInstanceOf[js.Any])
      
      inline def setK3Undefined: Self = StObject.set(x, "k3", js.undefined)
      
      inline def setK4(value: Double | String): Self = StObject.set(x, "k4", value.asInstanceOf[js.Any])
      
      inline def setK4Undefined: Self = StObject.set(x, "k4", js.undefined)
      
      inline def setKUndefined: Self = StObject.set(x, "k", js.undefined)
      
      inline def setKernelMatrix(value: Double | String): Self = StObject.set(x, "kernelMatrix", value.asInstanceOf[js.Any])
      
      inline def setKernelMatrixUndefined: Self = StObject.set(x, "kernelMatrix", js.undefined)
      
      inline def setKernelUnitLength(value: Double | String): Self = StObject.set(x, "kernelUnitLength", value.asInstanceOf[js.Any])
      
      inline def setKernelUnitLengthUndefined: Self = StObject.set(x, "kernelUnitLength", js.undefined)
      
      inline def setKerning(value: Double | String): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
      
      inline def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyPoints(value: Double | String): Self = StObject.set(x, "keyPoints", value.asInstanceOf[js.Any])
      
      inline def setKeyPointsUndefined: Self = StObject.set(x, "keyPoints", js.undefined)
      
      inline def setKeySplines(value: Double | String): Self = StObject.set(x, "keySplines", value.asInstanceOf[js.Any])
      
      inline def setKeySplinesUndefined: Self = StObject.set(x, "keySplines", js.undefined)
      
      inline def setKeyTimes(value: Double | String): Self = StObject.set(x, "keyTimes", value.asInstanceOf[js.Any])
      
      inline def setKeyTimesUndefined: Self = StObject.set(x, "keyTimes", js.undefined)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setLengthAdjust(value: Double | String): Self = StObject.set(x, "lengthAdjust", value.asInstanceOf[js.Any])
      
      inline def setLengthAdjustUndefined: Self = StObject.set(x, "lengthAdjust", js.undefined)
      
      inline def setLetterSpacing(value: Double | String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      inline def setLightingColor(value: Double | String): Self = StObject.set(x, "lightingColor", value.asInstanceOf[js.Any])
      
      inline def setLightingColorUndefined: Self = StObject.set(x, "lightingColor", js.undefined)
      
      inline def setLimitingConeAngle(value: Double | String): Self = StObject.set(x, "limitingConeAngle", value.asInstanceOf[js.Any])
      
      inline def setLimitingConeAngleUndefined: Self = StObject.set(x, "limitingConeAngle", js.undefined)
      
      inline def setLocal(value: Double | String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
      
      inline def setM(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setMNull: Self = StObject.set(x, "m", null)
      
      inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      inline def setMVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "m", js.Array(value :_*))
      
      inline def setMargin(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomNull: Self = StObject.set(x, "marginBottom", null)
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginBottom", js.Array(value :_*))
      
      inline def setMarginLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftNull: Self = StObject.set(x, "marginLeft", null)
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginLeft", js.Array(value :_*))
      
      inline def setMarginNull: Self = StObject.set(x, "margin", null)
      
      inline def setMarginRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightNull: Self = StObject.set(x, "marginRight", null)
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginRight", js.Array(value :_*))
      
      inline def setMarginTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopNull: Self = StObject.set(x, "marginTop", null)
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginTop", js.Array(value :_*))
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarginVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "margin", js.Array(value :_*))
      
      inline def setMarginX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginX", value.asInstanceOf[js.Any])
      
      inline def setMarginXNull: Self = StObject.set(x, "marginX", null)
      
      inline def setMarginXUndefined: Self = StObject.set(x, "marginX", js.undefined)
      
      inline def setMarginXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginX", js.Array(value :_*))
      
      inline def setMarginY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginY", value.asInstanceOf[js.Any])
      
      inline def setMarginYNull: Self = StObject.set(x, "marginY", null)
      
      inline def setMarginYUndefined: Self = StObject.set(x, "marginY", js.undefined)
      
      inline def setMarginYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginY", js.Array(value :_*))
      
      inline def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      inline def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      inline def setMarkerHeight(value: Double | String): Self = StObject.set(x, "markerHeight", value.asInstanceOf[js.Any])
      
      inline def setMarkerHeightUndefined: Self = StObject.set(x, "markerHeight", js.undefined)
      
      inline def setMarkerMid(value: String): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      inline def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      inline def setMarkerStart(value: String): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      inline def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      inline def setMarkerUnits(value: Double | String): Self = StObject.set(x, "markerUnits", value.asInstanceOf[js.Any])
      
      inline def setMarkerUnitsUndefined: Self = StObject.set(x, "markerUnits", js.undefined)
      
      inline def setMarkerWidth(value: Double | String): Self = StObject.set(x, "markerWidth", value.asInstanceOf[js.Any])
      
      inline def setMarkerWidthUndefined: Self = StObject.set(x, "markerWidth", js.undefined)
      
      inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskContentUnits(value: Double | String): Self = StObject.set(x, "maskContentUnits", value.asInstanceOf[js.Any])
      
      inline def setMaskContentUnitsUndefined: Self = StObject.set(x, "maskContentUnits", js.undefined)
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMaskUnits(value: Double | String): Self = StObject.set(x, "maskUnits", value.asInstanceOf[js.Any])
      
      inline def setMaskUnitsUndefined: Self = StObject.set(x, "maskUnits", js.undefined)
      
      inline def setMathematical(value: Double | String): Self = StObject.set(x, "mathematical", value.asInstanceOf[js.Any])
      
      inline def setMathematicalUndefined: Self = StObject.set(x, "mathematical", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
      
      inline def setMbNull: Self = StObject.set(x, "mb", null)
      
      inline def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
      
      inline def setMbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mb", js.Array(value :_*))
      
      inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
      
      inline def setMlNull: Self = StObject.set(x, "ml", null)
      
      inline def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
      
      inline def setMlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "ml", js.Array(value :_*))
      
      inline def setMode(value: Double | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
      
      inline def setMrNull: Self = StObject.set(x, "mr", null)
      
      inline def setMrUndefined: Self = StObject.set(x, "mr", js.undefined)
      
      inline def setMrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mr", js.Array(value :_*))
      
      inline def setMt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
      
      inline def setMtNull: Self = StObject.set(x, "mt", null)
      
      inline def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
      
      inline def setMtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mt", js.Array(value :_*))
      
      inline def setMx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mx", value.asInstanceOf[js.Any])
      
      inline def setMxNull: Self = StObject.set(x, "mx", null)
      
      inline def setMxUndefined: Self = StObject.set(x, "mx", js.undefined)
      
      inline def setMxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mx", js.Array(value :_*))
      
      inline def setMy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
      
      inline def setMyNull: Self = StObject.set(x, "my", null)
      
      inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
      
      inline def setMyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "my", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNumOctaves(value: Double | String): Self = StObject.set(x, "numOctaves", value.asInstanceOf[js.Any])
      
      inline def setNumOctavesUndefined: Self = StObject.set(x, "numOctaves", js.undefined)
      
      inline def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOnAbort(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(value: AnimationEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: AnimationEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: AnimationEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeInput(value: FormEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThrough(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(value: FormEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(value: CompositionEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: CompositionEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: CompositionEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ClipboardEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ClipboardEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDoubleClick(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      inline def setOnDragEnd(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(value: FormEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: FormEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: KeyboardEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadStart(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMouseDown(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPaste(value: ClipboardEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(value: FormEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnScroll(value: UIEvent[SVGSVGElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSeeked(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSubmit(value: FormEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(value: TouchEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: TouchEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: TransitionEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: WheelEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setOpacity(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityNull: Self = StObject.set(x, "opacity", null)
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOpacityVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any) | Null)*
      ): Self = StObject.set(x, "opacity", js.Array(value :_*))
      
      inline def setOperator(value: Double | String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      inline def setOrder(value: Double | String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrient(value: Double | String): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      inline def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      inline def setOrientation(value: Double | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setOrigin(value: Double | String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setOverflow(value: Double | String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setOverlinePosition(value: Double | String): Self = StObject.set(x, "overlinePosition", value.asInstanceOf[js.Any])
      
      inline def setOverlinePositionUndefined: Self = StObject.set(x, "overlinePosition", js.undefined)
      
      inline def setOverlineThickness(value: Double | String): Self = StObject.set(x, "overlineThickness", value.asInstanceOf[js.Any])
      
      inline def setOverlineThicknessUndefined: Self = StObject.set(x, "overlineThickness", js.undefined)
      
      inline def setP(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPNull: Self = StObject.set(x, "p", null)
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setPVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "p", js.Array(value :_*))
      
      inline def setPadding(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomNull: Self = StObject.set(x, "paddingBottom", null)
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingBottom", js.Array(value :_*))
      
      inline def setPaddingLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftNull: Self = StObject.set(x, "paddingLeft", null)
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingLeft", js.Array(value :_*))
      
      inline def setPaddingNull: Self = StObject.set(x, "padding", null)
      
      inline def setPaddingRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightNull: Self = StObject.set(x, "paddingRight", null)
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setPaddingRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingRight", js.Array(value :_*))
      
      inline def setPaddingTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopNull: Self = StObject.set(x, "paddingTop", null)
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPaddingTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingTop", js.Array(value :_*))
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "padding", js.Array(value :_*))
      
      inline def setPaddingX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
      
      inline def setPaddingXNull: Self = StObject.set(x, "paddingX", null)
      
      inline def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
      
      inline def setPaddingXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingX", js.Array(value :_*))
      
      inline def setPaddingY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
      
      inline def setPaddingYNull: Self = StObject.set(x, "paddingY", null)
      
      inline def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
      
      inline def setPaddingYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingY", js.Array(value :_*))
      
      inline def setPaintOrder(value: Double | String): Self = StObject.set(x, "paintOrder", value.asInstanceOf[js.Any])
      
      inline def setPaintOrderUndefined: Self = StObject.set(x, "paintOrder", js.undefined)
      
      inline def setPanose1(value: Double | String): Self = StObject.set(x, "panose1", value.asInstanceOf[js.Any])
      
      inline def setPanose1Undefined: Self = StObject.set(x, "panose1", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathLength(value: Double | String): Self = StObject.set(x, "pathLength", value.asInstanceOf[js.Any])
      
      inline def setPathLengthUndefined: Self = StObject.set(x, "pathLength", js.undefined)
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPatternContentUnits(value: String): Self = StObject.set(x, "patternContentUnits", value.asInstanceOf[js.Any])
      
      inline def setPatternContentUnitsUndefined: Self = StObject.set(x, "patternContentUnits", js.undefined)
      
      inline def setPatternTransform(value: Double | String): Self = StObject.set(x, "patternTransform", value.asInstanceOf[js.Any])
      
      inline def setPatternTransformUndefined: Self = StObject.set(x, "patternTransform", js.undefined)
      
      inline def setPatternUnits(value: String): Self = StObject.set(x, "patternUnits", value.asInstanceOf[js.Any])
      
      inline def setPatternUnitsUndefined: Self = StObject.set(x, "patternUnits", js.undefined)
      
      inline def setPb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pb", value.asInstanceOf[js.Any])
      
      inline def setPbNull: Self = StObject.set(x, "pb", null)
      
      inline def setPbUndefined: Self = StObject.set(x, "pb", js.undefined)
      
      inline def setPbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pb", js.Array(value :_*))
      
      inline def setPl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
      
      inline def setPlNull: Self = StObject.set(x, "pl", null)
      
      inline def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
      
      inline def setPlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pl", js.Array(value :_*))
      
      inline def setPointerEvents(value: Double | String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsAtX(value: Double | String): Self = StObject.set(x, "pointsAtX", value.asInstanceOf[js.Any])
      
      inline def setPointsAtXUndefined: Self = StObject.set(x, "pointsAtX", js.undefined)
      
      inline def setPointsAtY(value: Double | String): Self = StObject.set(x, "pointsAtY", value.asInstanceOf[js.Any])
      
      inline def setPointsAtYUndefined: Self = StObject.set(x, "pointsAtY", js.undefined)
      
      inline def setPointsAtZ(value: Double | String): Self = StObject.set(x, "pointsAtZ", value.asInstanceOf[js.Any])
      
      inline def setPointsAtZUndefined: Self = StObject.set(x, "pointsAtZ", js.undefined)
      
      inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      inline def setPr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
      
      inline def setPrNull: Self = StObject.set(x, "pr", null)
      
      inline def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
      
      inline def setPrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pr", js.Array(value :_*))
      
      inline def setPreserveAlpha(value: Booleanish): Self = StObject.set(x, "preserveAlpha", value.asInstanceOf[js.Any])
      
      inline def setPreserveAlphaUndefined: Self = StObject.set(x, "preserveAlpha", js.undefined)
      
      inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      inline def setPrimitiveUnits(value: Double | String): Self = StObject.set(x, "primitiveUnits", value.asInstanceOf[js.Any])
      
      inline def setPrimitiveUnitsUndefined: Self = StObject.set(x, "primitiveUnits", js.undefined)
      
      inline def setPt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
      
      inline def setPtNull: Self = StObject.set(x, "pt", null)
      
      inline def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
      inline def setPtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pt", js.Array(value :_*))
      
      inline def setPx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
      
      inline def setPxNull: Self = StObject.set(x, "px", null)
      
      inline def setPxUndefined: Self = StObject.set(x, "px", js.undefined)
      
      inline def setPxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "px", js.Array(value :_*))
      
      inline def setPy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
      
      inline def setPyNull: Self = StObject.set(x, "py", null)
      
      inline def setPyUndefined: Self = StObject.set(x, "py", js.undefined)
      
      inline def setPyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "py", js.Array(value :_*))
      
      inline def setR(value: Double | String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      inline def setRadius(value: Double | String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRef(value: LegacyRef[SVGSVGElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ SVGSVGElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRefX(value: Double | String): Self = StObject.set(x, "refX", value.asInstanceOf[js.Any])
      
      inline def setRefXUndefined: Self = StObject.set(x, "refX", js.undefined)
      
      inline def setRefY(value: Double | String): Self = StObject.set(x, "refY", value.asInstanceOf[js.Any])
      
      inline def setRefYUndefined: Self = StObject.set(x, "refY", js.undefined)
      
      inline def setRenderingIntent(value: Double | String): Self = StObject.set(x, "renderingIntent", value.asInstanceOf[js.Any])
      
      inline def setRenderingIntentUndefined: Self = StObject.set(x, "renderingIntent", js.undefined)
      
      inline def setRepeatCount(value: Double | String): Self = StObject.set(x, "repeatCount", value.asInstanceOf[js.Any])
      
      inline def setRepeatCountUndefined: Self = StObject.set(x, "repeatCount", js.undefined)
      
      inline def setRepeatDur(value: Double | String): Self = StObject.set(x, "repeatDur", value.asInstanceOf[js.Any])
      
      inline def setRepeatDurUndefined: Self = StObject.set(x, "repeatDur", js.undefined)
      
      inline def setRequiredExtensions(value: Double | String): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
      
      inline def setRequiredExtensionsUndefined: Self = StObject.set(x, "requiredExtensions", js.undefined)
      
      inline def setRequiredFeatures(value: Double | String): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
      
      inline def setRequiredFeaturesUndefined: Self = StObject.set(x, "requiredFeatures", js.undefined)
      
      inline def setRestart(value: Double | String): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
      
      inline def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
      
      inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRotate(value: Double | String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setRx(value: Double | String): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      inline def setRy(value: Double | String): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
      
      inline def setScale(value: Double | String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSeed(value: Double | String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      inline def setShapeRendering(value: Double | String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
      
      inline def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSlope(value: Double | String): Self = StObject.set(x, "slope", value.asInstanceOf[js.Any])
      
      inline def setSlopeUndefined: Self = StObject.set(x, "slope", js.undefined)
      
      inline def setSpacing(value: Double | String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setSpecularConstant(value: Double | String): Self = StObject.set(x, "specularConstant", value.asInstanceOf[js.Any])
      
      inline def setSpecularConstantUndefined: Self = StObject.set(x, "specularConstant", js.undefined)
      
      inline def setSpecularExponent(value: Double | String): Self = StObject.set(x, "specularExponent", value.asInstanceOf[js.Any])
      
      inline def setSpecularExponentUndefined: Self = StObject.set(x, "specularExponent", js.undefined)
      
      inline def setSpeed(value: Double | String): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setSpreadMethod(value: String): Self = StObject.set(x, "spreadMethod", value.asInstanceOf[js.Any])
      
      inline def setSpreadMethodUndefined: Self = StObject.set(x, "spreadMethod", js.undefined)
      
      inline def setStartOffset(value: Double | String): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
      
      inline def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
      
      inline def setStdDeviation(value: Double | String): Self = StObject.set(x, "stdDeviation", value.asInstanceOf[js.Any])
      
      inline def setStdDeviationUndefined: Self = StObject.set(x, "stdDeviation", js.undefined)
      
      inline def setStemh(value: Double | String): Self = StObject.set(x, "stemh", value.asInstanceOf[js.Any])
      
      inline def setStemhUndefined: Self = StObject.set(x, "stemh", js.undefined)
      
      inline def setStemv(value: Double | String): Self = StObject.set(x, "stemv", value.asInstanceOf[js.Any])
      
      inline def setStemvUndefined: Self = StObject.set(x, "stemv", js.undefined)
      
      inline def setStitchTiles(value: Double | String): Self = StObject.set(x, "stitchTiles", value.asInstanceOf[js.Any])
      
      inline def setStitchTilesUndefined: Self = StObject.set(x, "stitchTiles", js.undefined)
      
      inline def setStopColor(value: String): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
      
      inline def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
      
      inline def setStopOpacity(value: Double | String): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
      
      inline def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
      
      inline def setStrikethroughPosition(value: Double | String): Self = StObject.set(x, "strikethroughPosition", value.asInstanceOf[js.Any])
      
      inline def setStrikethroughPositionUndefined: Self = StObject.set(x, "strikethroughPosition", js.undefined)
      
      inline def setStrikethroughThickness(value: Double | String): Self = StObject.set(x, "strikethroughThickness", value.asInstanceOf[js.Any])
      
      inline def setStrikethroughThicknessUndefined: Self = StObject.set(x, "strikethroughThickness", js.undefined)
      
      inline def setString(value: Double | String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeDasharray(value: String | Double): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
      
      inline def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
      
      inline def setStrokeDashoffset(value: String | Double): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
      
      inline def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
      
      inline def setStrokeLinecap(value: butt | round | square | inherit): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      inline def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      inline def setStrokeLinejoin(value: miter | round | bevel | inherit): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
      
      inline def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
      
      inline def setStrokeMiterlimit(value: Double | String): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
      
      inline def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
      
      inline def setStrokeOpacity(value: Double | String): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setStrokeWidth(value: Double | String): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSurfaceScale(value: Double | String): Self = StObject.set(x, "surfaceScale", value.asInstanceOf[js.Any])
      
      inline def setSurfaceScaleUndefined: Self = StObject.set(x, "surfaceScale", js.undefined)
      
      inline def setSx(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SxStyleProp */ js.Any
      ): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      inline def setSystemLanguage(value: Double | String): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
      
      inline def setSystemLanguageUndefined: Self = StObject.set(x, "systemLanguage", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTableValues(value: Double | String): Self = StObject.set(x, "tableValues", value.asInstanceOf[js.Any])
      
      inline def setTableValuesUndefined: Self = StObject.set(x, "tableValues", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTargetX(value: Double | String): Self = StObject.set(x, "targetX", value.asInstanceOf[js.Any])
      
      inline def setTargetXUndefined: Self = StObject.set(x, "targetX", js.undefined)
      
      inline def setTargetY(value: Double | String): Self = StObject.set(x, "targetY", value.asInstanceOf[js.Any])
      
      inline def setTargetYUndefined: Self = StObject.set(x, "targetY", js.undefined)
      
      inline def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      inline def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
      
      inline def setTextDecoration(value: Double | String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      inline def setTextLength(value: Double | String): Self = StObject.set(x, "textLength", value.asInstanceOf[js.Any])
      
      inline def setTextLengthUndefined: Self = StObject.set(x, "textLength", js.undefined)
      
      inline def setTextRendering(value: Double | String): Self = StObject.set(x, "textRendering", value.asInstanceOf[js.Any])
      
      inline def setTextRenderingUndefined: Self = StObject.set(x, "textRendering", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTo(value: Double | String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setU1(value: Double | String): Self = StObject.set(x, "u1", value.asInstanceOf[js.Any])
      
      inline def setU1Undefined: Self = StObject.set(x, "u1", js.undefined)
      
      inline def setU2(value: Double | String): Self = StObject.set(x, "u2", value.asInstanceOf[js.Any])
      
      inline def setU2Undefined: Self = StObject.set(x, "u2", js.undefined)
      
      inline def setUnderlinePosition(value: Double | String): Self = StObject.set(x, "underlinePosition", value.asInstanceOf[js.Any])
      
      inline def setUnderlinePositionUndefined: Self = StObject.set(x, "underlinePosition", js.undefined)
      
      inline def setUnderlineThickness(value: Double | String): Self = StObject.set(x, "underlineThickness", value.asInstanceOf[js.Any])
      
      inline def setUnderlineThicknessUndefined: Self = StObject.set(x, "underlineThickness", js.undefined)
      
      inline def setUnicode(value: Double | String): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      inline def setUnicodeBidi(value: Double | String): Self = StObject.set(x, "unicodeBidi", value.asInstanceOf[js.Any])
      
      inline def setUnicodeBidiUndefined: Self = StObject.set(x, "unicodeBidi", js.undefined)
      
      inline def setUnicodeRange(value: Double | String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
      
      inline def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
      
      inline def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
      
      inline def setUnitsPerEm(value: Double | String): Self = StObject.set(x, "unitsPerEm", value.asInstanceOf[js.Any])
      
      inline def setUnitsPerEmUndefined: Self = StObject.set(x, "unitsPerEm", js.undefined)
      
      inline def setVAlphabetic(value: Double | String): Self = StObject.set(x, "vAlphabetic", value.asInstanceOf[js.Any])
      
      inline def setVAlphabeticUndefined: Self = StObject.set(x, "vAlphabetic", js.undefined)
      
      inline def setVHanging(value: Double | String): Self = StObject.set(x, "vHanging", value.asInstanceOf[js.Any])
      
      inline def setVHangingUndefined: Self = StObject.set(x, "vHanging", js.undefined)
      
      inline def setVIdeographic(value: Double | String): Self = StObject.set(x, "vIdeographic", value.asInstanceOf[js.Any])
      
      inline def setVIdeographicUndefined: Self = StObject.set(x, "vIdeographic", js.undefined)
      
      inline def setVMathematical(value: Double | String): Self = StObject.set(x, "vMathematical", value.asInstanceOf[js.Any])
      
      inline def setVMathematicalUndefined: Self = StObject.set(x, "vMathematical", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValues(value: String): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      inline def setVectorEffect(value: Double | String): Self = StObject.set(x, "vectorEffect", value.asInstanceOf[js.Any])
      
      inline def setVectorEffectUndefined: Self = StObject.set(x, "vectorEffect", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setVertAdvY(value: Double | String): Self = StObject.set(x, "vertAdvY", value.asInstanceOf[js.Any])
      
      inline def setVertAdvYUndefined: Self = StObject.set(x, "vertAdvY", js.undefined)
      
      inline def setVertOriginX(value: Double | String): Self = StObject.set(x, "vertOriginX", value.asInstanceOf[js.Any])
      
      inline def setVertOriginXUndefined: Self = StObject.set(x, "vertOriginX", js.undefined)
      
      inline def setVertOriginY(value: Double | String): Self = StObject.set(x, "vertOriginY", value.asInstanceOf[js.Any])
      
      inline def setVertOriginYUndefined: Self = StObject.set(x, "vertOriginY", js.undefined)
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      inline def setViewTarget(value: Double | String): Self = StObject.set(x, "viewTarget", value.asInstanceOf[js.Any])
      
      inline def setViewTargetUndefined: Self = StObject.set(x, "viewTarget", js.undefined)
      
      inline def setVisibility(value: Double | String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWidths(value: Double | String): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      inline def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
      
      inline def setWordSpacing(value: Double | String): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
      
      inline def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
      
      inline def setWritingMode(value: Double | String): Self = StObject.set(x, "writingMode", value.asInstanceOf[js.Any])
      
      inline def setWritingModeUndefined: Self = StObject.set(x, "writingMode", js.undefined)
      
      inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX1(value: Double | String): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
      
      inline def setX2(value: Double | String): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      inline def setXChannelSelector(value: String): Self = StObject.set(x, "xChannelSelector", value.asInstanceOf[js.Any])
      
      inline def setXChannelSelectorUndefined: Self = StObject.set(x, "xChannelSelector", js.undefined)
      
      inline def setXHeight(value: Double | String): Self = StObject.set(x, "xHeight", value.asInstanceOf[js.Any])
      
      inline def setXHeightUndefined: Self = StObject.set(x, "xHeight", js.undefined)
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setXlinkActuate(value: String): Self = StObject.set(x, "xlinkActuate", value.asInstanceOf[js.Any])
      
      inline def setXlinkActuateUndefined: Self = StObject.set(x, "xlinkActuate", js.undefined)
      
      inline def setXlinkArcrole(value: String): Self = StObject.set(x, "xlinkArcrole", value.asInstanceOf[js.Any])
      
      inline def setXlinkArcroleUndefined: Self = StObject.set(x, "xlinkArcrole", js.undefined)
      
      inline def setXlinkHref(value: String): Self = StObject.set(x, "xlinkHref", value.asInstanceOf[js.Any])
      
      inline def setXlinkHrefUndefined: Self = StObject.set(x, "xlinkHref", js.undefined)
      
      inline def setXlinkRole(value: String): Self = StObject.set(x, "xlinkRole", value.asInstanceOf[js.Any])
      
      inline def setXlinkRoleUndefined: Self = StObject.set(x, "xlinkRole", js.undefined)
      
      inline def setXlinkShow(value: String): Self = StObject.set(x, "xlinkShow", value.asInstanceOf[js.Any])
      
      inline def setXlinkShowUndefined: Self = StObject.set(x, "xlinkShow", js.undefined)
      
      inline def setXlinkTitle(value: String): Self = StObject.set(x, "xlinkTitle", value.asInstanceOf[js.Any])
      
      inline def setXlinkTitleUndefined: Self = StObject.set(x, "xlinkTitle", js.undefined)
      
      inline def setXlinkType(value: String): Self = StObject.set(x, "xlinkType", value.asInstanceOf[js.Any])
      
      inline def setXlinkTypeUndefined: Self = StObject.set(x, "xlinkType", js.undefined)
      
      inline def setXmlBase(value: String): Self = StObject.set(x, "xmlBase", value.asInstanceOf[js.Any])
      
      inline def setXmlBaseUndefined: Self = StObject.set(x, "xmlBase", js.undefined)
      
      inline def setXmlLang(value: String): Self = StObject.set(x, "xmlLang", value.asInstanceOf[js.Any])
      
      inline def setXmlLangUndefined: Self = StObject.set(x, "xmlLang", js.undefined)
      
      inline def setXmlSpace(value: String): Self = StObject.set(x, "xmlSpace", value.asInstanceOf[js.Any])
      
      inline def setXmlSpaceUndefined: Self = StObject.set(x, "xmlSpace", js.undefined)
      
      inline def setXmlns(value: String): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
      
      inline def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
      
      inline def setXmlnsXlink(value: String): Self = StObject.set(x, "xmlnsXlink", value.asInstanceOf[js.Any])
      
      inline def setXmlnsXlinkUndefined: Self = StObject.set(x, "xmlnsXlink", js.undefined)
      
      inline def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double | String): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
      
      inline def setY2(value: Double | String): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
      
      inline def setYChannelSelector(value: String): Self = StObject.set(x, "yChannelSelector", value.asInstanceOf[js.Any])
      
      inline def setYChannelSelectorUndefined: Self = StObject.set(x, "yChannelSelector", js.undefined)
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setZ(value: Double | String): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
      
      inline def setZoomAndPan(value: String): Self = StObject.set(x, "zoomAndPan", value.asInstanceOf[js.Any])
      
      inline def setZoomAndPanUndefined: Self = StObject.set(x, "zoomAndPan", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof react.react.ComponentProps<'div'> & @theme-ui/components.@theme-ui/components.BoxOwnProps ]: P extends keyof react.react.ComponentProps<'div'>? react.react.ComponentProps<'div'>[P] : P extends keyof @theme-ui/components.@theme-ui/components.BoxOwnProps? @theme-ui/components.@theme-ui/components.BoxOwnProps[P] : never} */ trait EmbedProps extends StObject {
    
    var allow: js.UndefOr[String] = js.undefined
    
    var allowFullScreen: js.UndefOr[Boolean] = js.undefined
    
    var frameBorder: js.UndefOr[Double | String] = js.undefined
    
    var ratio: js.UndefOr[Double] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
  }
  object EmbedProps {
    
    inline def apply(): EmbedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmbedProps]
    }
    
    extension [Self <: EmbedProps](x: Self) {
      
      inline def setAllow(value: String): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      inline def setAllowFullScreen(value: Boolean): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
      
      inline def setAllowFullScreenUndefined: Self = StObject.set(x, "allowFullScreen", js.undefined)
      
      inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
      
      inline def setFrameBorder(value: Double | String): Self = StObject.set(x, "frameBorder", value.asInstanceOf[js.Any])
      
      inline def setFrameBorderUndefined: Self = StObject.set(x, "frameBorder", js.undefined)
      
      inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
  
  trait FieldOwnProps
    extends StObject
       with MarginProps[RequiredTheme] {
    
    /**
      * Text for Label component
      */
    var label: String
    
    /**
      * Used for the for, id, and name attributes
      */
    var name: String
  }
  object FieldOwnProps {
    
    inline def apply(label: String, name: String): FieldOwnProps = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldOwnProps]
    }
    
    extension [Self <: FieldOwnProps](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type FieldProps[T /* <: ElementType[js.Any] */] = FieldOwnProps & (Omit[ComponentProps[T], as | label | name]) & As[T]
  
  type FlexProps = BoxProps
  
  type FlexStyleProps = BoxOwnProps
  
  type ForwardRef[T, P] = ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[T]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof react.react.ComponentProps<'div'> & @theme-ui/components.@theme-ui/components.BoxOwnProps ]: P extends keyof react.react.ComponentProps<'div'>? react.react.ComponentProps<'div'>[P] : P extends keyof @theme-ui/components.@theme-ui/components.BoxOwnProps? @theme-ui/components.@theme-ui/components.BoxOwnProps[P] : never} */ trait GridProps extends StObject {
    
    /**
      *     Number of columns to use for the layout (cannot be used in conjunction with the width prop)
      */
    var columns: js.UndefOr[ResponsiveValue[String | Double, RequiredTheme]] = js.undefined
    
    /**
      * Space between child elements
      */
    var gap: js.UndefOr[ResponsiveValue[String | Double, RequiredTheme]] = js.undefined
    
    /**
      * Minimum width of child elements
      */
    var width: js.UndefOr[ResponsiveValue[String | Double, RequiredTheme]] = js.undefined
  }
  object GridProps {
    
    inline def apply(): GridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridProps]
    }
    
    extension [Self <: GridProps](x: Self) {
      
      inline def setColumns(value: ResponsiveValue[String | Double, RequiredTheme]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsNull: Self = StObject.set(x, "columns", null)
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: ((String | Double) | Null)*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      inline def setGap(value: ResponsiveValue[String | Double, RequiredTheme]): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapNull: Self = StObject.set(x, "gap", null)
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setGapVarargs(value: ((String | Double) | Null)*): Self = StObject.set(x, "gap", js.Array(value :_*))
      
      inline def setWidth(value: ResponsiveValue[String | Double, RequiredTheme]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthNull: Self = StObject.set(x, "width", null)
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWidthVarargs(value: ((String | Double) | Null)*): Self = StObject.set(x, "width", js.Array(value :_*))
    }
  }
  
  type HeadingProps = Assign[ComponentPropsWithRef[h2], BoxOwnProps]
  
  type IconButtonProps = Assign[ComponentPropsWithRef[button], BoxOwnProps]
  
  type ImageProps = Assign[ComponentProps[img], BoxOwnProps]
  
  type InputProps = Assign[ComponentProps[input], BoxOwnProps]
  
  type LabelProps = Assign[ComponentProps[label], BoxOwnProps]
  
  type LinkProps = Assign[ComponentPropsWithRef[a], BoxOwnProps]
  
  type MenuButtonProps = IconButtonProps
  
  type MessageProps = BoxProps
  
  type NavLinkProps = LinkProps
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type ProgressProps = Assign[ComponentProps[progress], BoxOwnProps]
  
  type RadioProps = Assign[ComponentProps[input], BoxOwnProps]
  
  type SelectProps = Assign[ComponentProps[select], BoxOwnProps]
  
  type SliderProps = Assign[ComponentProps[input], BoxOwnProps]
  
  /* Inlined parent @theme-ui/components.@theme-ui/components.Omit<react.react.SVGProps<std.SVGSVGElement>, 'opacity' | 'color' | 'css' | 'sx'> */
  /* Inlined parent @theme-ui/components.@theme-ui/components.BoxOwnProps */
  trait SpinnerProps extends StObject {
    
    var accentHeight: js.UndefOr[Double | String] = js.undefined
    
    var accumulate: js.UndefOr[none | sum] = js.undefined
    
    var additive: js.UndefOr[replace | sum] = js.undefined
    
    var alignmentBaseline: js.UndefOr[
        auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
      ] = js.undefined
    
    var allowReorder: js.UndefOr[no | yes] = js.undefined
    
    var alphabetic: js.UndefOr[Double | String] = js.undefined
    
    var amplitude: js.UndefOr[Double | String] = js.undefined
    
    var arabicForm: js.UndefOr[initial | medial | terminal | isolated] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-atomic`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
    
    var `aria-busy`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-colcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-colindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-colspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-details`: js.UndefOr[String] = js.undefined
    
    var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-flowto`: js.UndefOr[String] = js.undefined
    
    var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
    
    var `aria-hidden`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var `aria-level`: js.UndefOr[Double] = js.undefined
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
    
    var `aria-modal`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-multiline`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
    
    var `aria-owns`: js.UndefOr[String] = js.undefined
    
    var `aria-placeholder`: js.UndefOr[String] = js.undefined
    
    var `aria-posinset`: js.UndefOr[Double] = js.undefined
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.undefined
    
    var `aria-required`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-roledescription`: js.UndefOr[String] = js.undefined
    
    var `aria-rowcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-selected`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-setsize`: js.UndefOr[Double] = js.undefined
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
    
    var `aria-valuemax`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuemin`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuenow`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuetext`: js.UndefOr[String] = js.undefined
    
    var as: js.UndefOr[ElementType[js.Any]] = js.undefined
    
    var ascent: js.UndefOr[Double | String] = js.undefined
    
    var attributeName: js.UndefOr[String] = js.undefined
    
    var attributeType: js.UndefOr[String] = js.undefined
    
    var autoReverse: js.UndefOr[Booleanish] = js.undefined
    
    var azimuth: js.UndefOr[Double | String] = js.undefined
    
    var backgroundColor: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var baseFrequency: js.UndefOr[Double | String] = js.undefined
    
    var baseProfile: js.UndefOr[Double | String] = js.undefined
    
    var baselineShift: js.UndefOr[Double | String] = js.undefined
    
    var bbox: js.UndefOr[Double | String] = js.undefined
    
    var begin: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
      * By default the raw value of the prop is returned.
      *
      * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
      * Array values are converted into responsive values.
      *
      * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-color)
      */
    var bg: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var bias: js.UndefOr[Double | String] = js.undefined
    
    var by: js.UndefOr[Double | String] = js.undefined
    
    var calcMode: js.UndefOr[Double | String] = js.undefined
    
    var capHeight: js.UndefOr[Double | String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clip: js.UndefOr[Double | String] = js.undefined
    
    var clipPath: js.UndefOr[String] = js.undefined
    
    var clipPathUnits: js.UndefOr[Double | String] = js.undefined
    
    var clipRule: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
      * By default the raw value of the prop is returned.
      *
      * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
      * Array values are converted into responsive values.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/color)
      */
    var color: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var colorInterpolation: js.UndefOr[Double | String] = js.undefined
    
    var colorInterpolationFilters: js.UndefOr[auto | sRGB | linearRGB | inherit] = js.undefined
    
    var colorProfile: js.UndefOr[Double | String] = js.undefined
    
    var colorRendering: js.UndefOr[Double | String] = js.undefined
    
    var contentScriptType: js.UndefOr[Double | String] = js.undefined
    
    var contentStyleType: js.UndefOr[Double | String] = js.undefined
    
    var crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.undefined
    
    var css: js.UndefOr[InterpolationWithTheme[js.Any]] = js.undefined
    
    var cursor: js.UndefOr[Double | String] = js.undefined
    
    var cx: js.UndefOr[Double | String] = js.undefined
    
    var cy: js.UndefOr[Double | String] = js.undefined
    
    var d: js.UndefOr[String] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    var decelerate: js.UndefOr[Double | String] = js.undefined
    
    var descent: js.UndefOr[Double | String] = js.undefined
    
    var diffuseConstant: js.UndefOr[Double | String] = js.undefined
    
    var direction: js.UndefOr[Double | String] = js.undefined
    
    var display: js.UndefOr[Double | String] = js.undefined
    
    var divisor: js.UndefOr[Double | String] = js.undefined
    
    var dominantBaseline: js.UndefOr[Double | String] = js.undefined
    
    var dur: js.UndefOr[Double | String] = js.undefined
    
    var dx: js.UndefOr[Double | String] = js.undefined
    
    var dy: js.UndefOr[Double | String] = js.undefined
    
    var edgeMode: js.UndefOr[Double | String] = js.undefined
    
    var elevation: js.UndefOr[Double | String] = js.undefined
    
    var enableBackground: js.UndefOr[Double | String] = js.undefined
    
    var end: js.UndefOr[Double | String] = js.undefined
    
    var exponent: js.UndefOr[Double | String] = js.undefined
    
    var externalResourcesRequired: js.UndefOr[Booleanish] = js.undefined
    
    var fill: js.UndefOr[String] = js.undefined
    
    var fillOpacity: js.UndefOr[Double | String] = js.undefined
    
    var fillRule: js.UndefOr[nonzero | evenodd | inherit] = js.undefined
    
    var filter: js.UndefOr[String] = js.undefined
    
    var filterRes: js.UndefOr[Double | String] = js.undefined
    
    var filterUnits: js.UndefOr[Double | String] = js.undefined
    
    var floodColor: js.UndefOr[Double | String] = js.undefined
    
    var floodOpacity: js.UndefOr[Double | String] = js.undefined
    
    var focusable: js.UndefOr[Booleanish | auto] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[Double | String] = js.undefined
    
    var fontSizeAdjust: js.UndefOr[Double | String] = js.undefined
    
    var fontStretch: js.UndefOr[Double | String] = js.undefined
    
    var fontStyle: js.UndefOr[Double | String] = js.undefined
    
    var fontVariant: js.UndefOr[Double | String] = js.undefined
    
    var fontWeight: js.UndefOr[Double | String] = js.undefined
    
    var format: js.UndefOr[Double | String] = js.undefined
    
    var from: js.UndefOr[Double | String] = js.undefined
    
    var fx: js.UndefOr[Double | String] = js.undefined
    
    var fy: js.UndefOr[Double | String] = js.undefined
    
    var g1: js.UndefOr[Double | String] = js.undefined
    
    var g2: js.UndefOr[Double | String] = js.undefined
    
    var glyphName: js.UndefOr[Double | String] = js.undefined
    
    var glyphOrientationHorizontal: js.UndefOr[Double | String] = js.undefined
    
    var glyphOrientationVertical: js.UndefOr[Double | String] = js.undefined
    
    var glyphRef: js.UndefOr[Double | String] = js.undefined
    
    var gradientTransform: js.UndefOr[String] = js.undefined
    
    var gradientUnits: js.UndefOr[String] = js.undefined
    
    var hanging: js.UndefOr[Double | String] = js.undefined
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var horizAdvX: js.UndefOr[Double | String] = js.undefined
    
    var horizOriginX: js.UndefOr[Double | String] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var ideographic: js.UndefOr[Double | String] = js.undefined
    
    var imageRendering: js.UndefOr[Double | String] = js.undefined
    
    var in: js.UndefOr[String] = js.undefined
    
    var in2: js.UndefOr[Double | String] = js.undefined
    
    var intercept: js.UndefOr[Double | String] = js.undefined
    
    var k: js.UndefOr[Double | String] = js.undefined
    
    var k1: js.UndefOr[Double | String] = js.undefined
    
    var k2: js.UndefOr[Double | String] = js.undefined
    
    var k3: js.UndefOr[Double | String] = js.undefined
    
    var k4: js.UndefOr[Double | String] = js.undefined
    
    var kernelMatrix: js.UndefOr[Double | String] = js.undefined
    
    var kernelUnitLength: js.UndefOr[Double | String] = js.undefined
    
    var kerning: js.UndefOr[Double | String] = js.undefined
    
    var key: js.UndefOr[Key | Null] = js.undefined
    
    var keyPoints: js.UndefOr[Double | String] = js.undefined
    
    var keySplines: js.UndefOr[Double | String] = js.undefined
    
    var keyTimes: js.UndefOr[Double | String] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var lengthAdjust: js.UndefOr[Double | String] = js.undefined
    
    var letterSpacing: js.UndefOr[Double | String] = js.undefined
    
    var lightingColor: js.UndefOr[Double | String] = js.undefined
    
    var limitingConeAngle: js.UndefOr[Double | String] = js.undefined
    
    var local: js.UndefOr[Double | String] = js.undefined
    
    /** Margin on top, left, bottom and right */
    var m: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top, left, bottom and right */
    var margin: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on bottom */
    var marginBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on left */
    var marginLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on right */
    var marginRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top */
    var marginTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on left and right */
    var marginX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top and bottom */
    var marginY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var markerEnd: js.UndefOr[String] = js.undefined
    
    var markerHeight: js.UndefOr[Double | String] = js.undefined
    
    var markerMid: js.UndefOr[String] = js.undefined
    
    var markerStart: js.UndefOr[String] = js.undefined
    
    var markerUnits: js.UndefOr[Double | String] = js.undefined
    
    var markerWidth: js.UndefOr[Double | String] = js.undefined
    
    var mask: js.UndefOr[String] = js.undefined
    
    var maskContentUnits: js.UndefOr[Double | String] = js.undefined
    
    var maskUnits: js.UndefOr[Double | String] = js.undefined
    
    var mathematical: js.UndefOr[Double | String] = js.undefined
    
    var max: js.UndefOr[Double | String] = js.undefined
    
    /** Margin on bottom */
    var mb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var media: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var min: js.UndefOr[Double | String] = js.undefined
    
    /** Margin on left */
    var ml: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var mode: js.UndefOr[Double | String] = js.undefined
    
    /** Margin on right */
    var mr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top */
    var mt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on left and right */
    var mx: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top and bottom */
    var my: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var numOctaves: js.UndefOr[Double | String] = js.undefined
    
    var offset: js.UndefOr[Double | String] = js.undefined
    
    var onAbort: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.undefined
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.undefined
    
    var onAuxClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
    
    var onBeforeInput: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[SVGSVGElement]] = js.undefined
    
    var onCanPlay: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onChange: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.undefined
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
    
    var onCopy: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.undefined
    
    var onCut: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.undefined
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
    
    var onDrag: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
    
    var onDragExit: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
    
    var onDurationChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onEmptied: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onEncrypted: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onEnded: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onError: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[SVGSVGElement]] = js.undefined
    
    var onInput: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
    
    var onInvalid: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.undefined
    
    var onLoad: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onLoadStart: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onLoadedData: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
    
    var onMouseOut: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.undefined
    
    var onPause: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onPlay: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onPlaying: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
    
    var onPointerDown: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
    
    var onPointerMove: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
    
    var onPointerOut: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
    
    var onPointerOver: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
    
    var onPointerUp: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
    
    var onProgress: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onRateChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onReset: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
    
    var onScroll: js.UndefOr[UIEventHandler[SVGSVGElement]] = js.undefined
    
    var onSeeked: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onSeeking: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onSelect: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onStalled: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onSubmit: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
    
    var onSuspend: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[SVGSVGElement]] = js.undefined
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onWaiting: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
    
    var onWheel: js.UndefOr[WheelEventHandler[SVGSVGElement]] = js.undefined
    
    /**
      * The opacity CSS property sets the transparency of an element or the degree to which content
      * behind an element is visible.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/opacity)
      */
    var opacity: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var operator: js.UndefOr[Double | String] = js.undefined
    
    var order: js.UndefOr[Double | String] = js.undefined
    
    var orient: js.UndefOr[Double | String] = js.undefined
    
    var orientation: js.UndefOr[Double | String] = js.undefined
    
    var origin: js.UndefOr[Double | String] = js.undefined
    
    var overflow: js.UndefOr[Double | String] = js.undefined
    
    var overlinePosition: js.UndefOr[Double | String] = js.undefined
    
    var overlineThickness: js.UndefOr[Double | String] = js.undefined
    
    /** Padding on top, left, bottom and right */
    var p: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top, left, bottom and right */
    var padding: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on bottom */
    var paddingBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left */
    var paddingLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on right */
    var paddingRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top */
    var paddingTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left and right */
    var paddingX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top and bottom */
    var paddingY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var paintOrder: js.UndefOr[Double | String] = js.undefined
    
    var panose1: js.UndefOr[Double | String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var pathLength: js.UndefOr[Double | String] = js.undefined
    
    var patternContentUnits: js.UndefOr[String] = js.undefined
    
    var patternTransform: js.UndefOr[Double | String] = js.undefined
    
    var patternUnits: js.UndefOr[String] = js.undefined
    
    /** Padding on bottom */
    var pb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left */
    var pl: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var pointerEvents: js.UndefOr[Double | String] = js.undefined
    
    var points: js.UndefOr[String] = js.undefined
    
    var pointsAtX: js.UndefOr[Double | String] = js.undefined
    
    var pointsAtY: js.UndefOr[Double | String] = js.undefined
    
    var pointsAtZ: js.UndefOr[Double | String] = js.undefined
    
    /** Padding on right */
    var pr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var preserveAlpha: js.UndefOr[Booleanish] = js.undefined
    
    var preserveAspectRatio: js.UndefOr[String] = js.undefined
    
    var primitiveUnits: js.UndefOr[Double | String] = js.undefined
    
    /** Padding on top */
    var pt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left and right */
    var px: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top and bottom */
    var py: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var r: js.UndefOr[Double | String] = js.undefined
    
    var radius: js.UndefOr[Double | String] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[SVGSVGElement]] = js.undefined
    
    var refX: js.UndefOr[Double | String] = js.undefined
    
    var refY: js.UndefOr[Double | String] = js.undefined
    
    var renderingIntent: js.UndefOr[Double | String] = js.undefined
    
    var repeatCount: js.UndefOr[Double | String] = js.undefined
    
    var repeatDur: js.UndefOr[Double | String] = js.undefined
    
    var requiredExtensions: js.UndefOr[Double | String] = js.undefined
    
    var requiredFeatures: js.UndefOr[Double | String] = js.undefined
    
    var restart: js.UndefOr[Double | String] = js.undefined
    
    var result: js.UndefOr[String] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var rotate: js.UndefOr[Double | String] = js.undefined
    
    var rx: js.UndefOr[Double | String] = js.undefined
    
    var ry: js.UndefOr[Double | String] = js.undefined
    
    var scale: js.UndefOr[Double | String] = js.undefined
    
    var seed: js.UndefOr[Double | String] = js.undefined
    
    var shapeRendering: js.UndefOr[Double | String] = js.undefined
    
    var size: js.UndefOr[Double | String] = js.undefined
    
    var slope: js.UndefOr[Double | String] = js.undefined
    
    var spacing: js.UndefOr[Double | String] = js.undefined
    
    var specularConstant: js.UndefOr[Double | String] = js.undefined
    
    var specularExponent: js.UndefOr[Double | String] = js.undefined
    
    var speed: js.UndefOr[Double | String] = js.undefined
    
    var spreadMethod: js.UndefOr[String] = js.undefined
    
    var startOffset: js.UndefOr[Double | String] = js.undefined
    
    var stdDeviation: js.UndefOr[Double | String] = js.undefined
    
    var stemh: js.UndefOr[Double | String] = js.undefined
    
    var stemv: js.UndefOr[Double | String] = js.undefined
    
    var stitchTiles: js.UndefOr[Double | String] = js.undefined
    
    var stopColor: js.UndefOr[String] = js.undefined
    
    var stopOpacity: js.UndefOr[Double | String] = js.undefined
    
    var strikethroughPosition: js.UndefOr[Double | String] = js.undefined
    
    var strikethroughThickness: js.UndefOr[Double | String] = js.undefined
    
    var string: js.UndefOr[Double | String] = js.undefined
    
    var stroke: js.UndefOr[String] = js.undefined
    
    var strokeDasharray: js.UndefOr[String | Double] = js.undefined
    
    var strokeDashoffset: js.UndefOr[String | Double] = js.undefined
    
    var strokeLinecap: js.UndefOr[butt | round | square | inherit] = js.undefined
    
    var strokeLinejoin: js.UndefOr[miter | round | bevel | inherit] = js.undefined
    
    var strokeMiterlimit: js.UndefOr[Double | String] = js.undefined
    
    var strokeOpacity: js.UndefOr[Double | String] = js.undefined
    
    var strokeWidth: js.UndefOr[Double | String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var surfaceScale: js.UndefOr[Double | String] = js.undefined
    
    var sx: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SxStyleProp */ js.Any
      ] = js.undefined
    
    var systemLanguage: js.UndefOr[Double | String] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var tableValues: js.UndefOr[Double | String] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var targetX: js.UndefOr[Double | String] = js.undefined
    
    var targetY: js.UndefOr[Double | String] = js.undefined
    
    var textAnchor: js.UndefOr[String] = js.undefined
    
    var textDecoration: js.UndefOr[Double | String] = js.undefined
    
    var textLength: js.UndefOr[Double | String] = js.undefined
    
    var textRendering: js.UndefOr[Double | String] = js.undefined
    
    var to: js.UndefOr[Double | String] = js.undefined
    
    var transform: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var u1: js.UndefOr[Double | String] = js.undefined
    
    var u2: js.UndefOr[Double | String] = js.undefined
    
    var underlinePosition: js.UndefOr[Double | String] = js.undefined
    
    var underlineThickness: js.UndefOr[Double | String] = js.undefined
    
    var unicode: js.UndefOr[Double | String] = js.undefined
    
    var unicodeBidi: js.UndefOr[Double | String] = js.undefined
    
    var unicodeRange: js.UndefOr[Double | String] = js.undefined
    
    var unitsPerEm: js.UndefOr[Double | String] = js.undefined
    
    var vAlphabetic: js.UndefOr[Double | String] = js.undefined
    
    var vHanging: js.UndefOr[Double | String] = js.undefined
    
    var vIdeographic: js.UndefOr[Double | String] = js.undefined
    
    var vMathematical: js.UndefOr[Double | String] = js.undefined
    
    var values: js.UndefOr[String] = js.undefined
    
    var variant: js.UndefOr[String] = js.undefined
    
    var vectorEffect: js.UndefOr[Double | String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
    
    var vertAdvY: js.UndefOr[Double | String] = js.undefined
    
    var vertOriginX: js.UndefOr[Double | String] = js.undefined
    
    var vertOriginY: js.UndefOr[Double | String] = js.undefined
    
    var viewBox: js.UndefOr[String] = js.undefined
    
    var viewTarget: js.UndefOr[Double | String] = js.undefined
    
    var visibility: js.UndefOr[Double | String] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
    
    var widths: js.UndefOr[Double | String] = js.undefined
    
    var wordSpacing: js.UndefOr[Double | String] = js.undefined
    
    var writingMode: js.UndefOr[Double | String] = js.undefined
    
    var x: js.UndefOr[Double | String] = js.undefined
    
    var x1: js.UndefOr[Double | String] = js.undefined
    
    var x2: js.UndefOr[Double | String] = js.undefined
    
    var xChannelSelector: js.UndefOr[String] = js.undefined
    
    var xHeight: js.UndefOr[Double | String] = js.undefined
    
    var xlinkActuate: js.UndefOr[String] = js.undefined
    
    var xlinkArcrole: js.UndefOr[String] = js.undefined
    
    var xlinkHref: js.UndefOr[String] = js.undefined
    
    var xlinkRole: js.UndefOr[String] = js.undefined
    
    var xlinkShow: js.UndefOr[String] = js.undefined
    
    var xlinkTitle: js.UndefOr[String] = js.undefined
    
    var xlinkType: js.UndefOr[String] = js.undefined
    
    var xmlBase: js.UndefOr[String] = js.undefined
    
    var xmlLang: js.UndefOr[String] = js.undefined
    
    var xmlSpace: js.UndefOr[String] = js.undefined
    
    var xmlns: js.UndefOr[String] = js.undefined
    
    var xmlnsXlink: js.UndefOr[String] = js.undefined
    
    var y: js.UndefOr[Double | String] = js.undefined
    
    var y1: js.UndefOr[Double | String] = js.undefined
    
    var y2: js.UndefOr[Double | String] = js.undefined
    
    var yChannelSelector: js.UndefOr[String] = js.undefined
    
    var z: js.UndefOr[Double | String] = js.undefined
    
    var zoomAndPan: js.UndefOr[String] = js.undefined
  }
  object SpinnerProps {
    
    inline def apply(): SpinnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpinnerProps]
    }
    
    extension [Self <: SpinnerProps](x: Self) {
      
      inline def setAccentHeight(value: Double | String): Self = StObject.set(x, "accentHeight", value.asInstanceOf[js.Any])
      
      inline def setAccentHeightUndefined: Self = StObject.set(x, "accentHeight", js.undefined)
      
      inline def setAccumulate(value: none | sum): Self = StObject.set(x, "accumulate", value.asInstanceOf[js.Any])
      
      inline def setAccumulateUndefined: Self = StObject.set(x, "accumulate", js.undefined)
      
      inline def setAdditive(value: replace | sum): Self = StObject.set(x, "additive", value.asInstanceOf[js.Any])
      
      inline def setAdditiveUndefined: Self = StObject.set(x, "additive", js.undefined)
      
      inline def setAlignmentBaseline(
        value: auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
      ): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
      
      inline def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
      
      inline def setAllowReorder(value: no | yes): Self = StObject.set(x, "allowReorder", value.asInstanceOf[js.Any])
      
      inline def setAllowReorderUndefined: Self = StObject.set(x, "allowReorder", js.undefined)
      
      inline def setAlphabetic(value: Double | String): Self = StObject.set(x, "alphabetic", value.asInstanceOf[js.Any])
      
      inline def setAlphabeticUndefined: Self = StObject.set(x, "alphabetic", js.undefined)
      
      inline def setAmplitude(value: Double | String): Self = StObject.set(x, "amplitude", value.asInstanceOf[js.Any])
      
      inline def setAmplitudeUndefined: Self = StObject.set(x, "amplitude", js.undefined)
      
      inline def setArabicForm(value: initial | medial | terminal | isolated): Self = StObject.set(x, "arabicForm", value.asInstanceOf[js.Any])
      
      inline def setArabicFormUndefined: Self = StObject.set(x, "arabicForm", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAs(value: ElementType[js.Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAscent(value: Double | String): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
      
      inline def setAscentUndefined: Self = StObject.set(x, "ascent", js.undefined)
      
      inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
      
      inline def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
      
      inline def setAttributeType(value: String): Self = StObject.set(x, "attributeType", value.asInstanceOf[js.Any])
      
      inline def setAttributeTypeUndefined: Self = StObject.set(x, "attributeType", js.undefined)
      
      inline def setAutoReverse(value: Booleanish): Self = StObject.set(x, "autoReverse", value.asInstanceOf[js.Any])
      
      inline def setAutoReverseUndefined: Self = StObject.set(x, "autoReverse", js.undefined)
      
      inline def setAzimuth(value: Double | String): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
      
      inline def setAzimuthUndefined: Self = StObject.set(x, "azimuth", js.undefined)
      
      inline def setBackgroundColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBackgroundColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
      
      inline def setBaseFrequency(value: Double | String): Self = StObject.set(x, "baseFrequency", value.asInstanceOf[js.Any])
      
      inline def setBaseFrequencyUndefined: Self = StObject.set(x, "baseFrequency", js.undefined)
      
      inline def setBaseProfile(value: Double | String): Self = StObject.set(x, "baseProfile", value.asInstanceOf[js.Any])
      
      inline def setBaseProfileUndefined: Self = StObject.set(x, "baseProfile", js.undefined)
      
      inline def setBaselineShift(value: Double | String): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
      
      inline def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
      
      inline def setBbox(value: Double | String): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      inline def setBegin(value: Double | String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
      
      inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
      
      inline def setBg(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgNull: Self = StObject.set(x, "bg", null)
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setBgVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "bg", js.Array(value :_*))
      
      inline def setBias(value: Double | String): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      inline def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      inline def setBy(value: Double | String): Self = StObject.set(x, "by", value.asInstanceOf[js.Any])
      
      inline def setByUndefined: Self = StObject.set(x, "by", js.undefined)
      
      inline def setCalcMode(value: Double | String): Self = StObject.set(x, "calcMode", value.asInstanceOf[js.Any])
      
      inline def setCalcModeUndefined: Self = StObject.set(x, "calcMode", js.undefined)
      
      inline def setCapHeight(value: Double | String): Self = StObject.set(x, "capHeight", value.asInstanceOf[js.Any])
      
      inline def setCapHeightUndefined: Self = StObject.set(x, "capHeight", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClip(value: Double | String): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      inline def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
      
      inline def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
      
      inline def setClipPathUnits(value: Double | String): Self = StObject.set(x, "clipPathUnits", value.asInstanceOf[js.Any])
      
      inline def setClipPathUnitsUndefined: Self = StObject.set(x, "clipPathUnits", js.undefined)
      
      inline def setClipRule(value: Double | String): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
      
      inline def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
      
      inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      inline def setColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorInterpolation(value: Double | String): Self = StObject.set(x, "colorInterpolation", value.asInstanceOf[js.Any])
      
      inline def setColorInterpolationFilters(value: auto | sRGB | linearRGB | inherit): Self = StObject.set(x, "colorInterpolationFilters", value.asInstanceOf[js.Any])
      
      inline def setColorInterpolationFiltersUndefined: Self = StObject.set(x, "colorInterpolationFilters", js.undefined)
      
      inline def setColorInterpolationUndefined: Self = StObject.set(x, "colorInterpolation", js.undefined)
      
      inline def setColorNull: Self = StObject.set(x, "color", null)
      
      inline def setColorProfile(value: Double | String): Self = StObject.set(x, "colorProfile", value.asInstanceOf[js.Any])
      
      inline def setColorProfileUndefined: Self = StObject.set(x, "colorProfile", js.undefined)
      
      inline def setColorRendering(value: Double | String): Self = StObject.set(x, "colorRendering", value.asInstanceOf[js.Any])
      
      inline def setColorRenderingUndefined: Self = StObject.set(x, "colorRendering", js.undefined)
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      inline def setContentScriptType(value: Double | String): Self = StObject.set(x, "contentScriptType", value.asInstanceOf[js.Any])
      
      inline def setContentScriptTypeUndefined: Self = StObject.set(x, "contentScriptType", js.undefined)
      
      inline def setContentStyleType(value: Double | String): Self = StObject.set(x, "contentStyleType", value.asInstanceOf[js.Any])
      
      inline def setContentStyleTypeUndefined: Self = StObject.set(x, "contentStyleType", js.undefined)
      
      inline def setCrossOrigin(value: anonymous | `use-credentials` | _empty): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setCss(value: InterpolationWithTheme[js.Any]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssFunction1(value: js.Any => Interpolation[Unit]): Self = StObject.set(x, "css", js.Any.fromFunction1(value))
      
      inline def setCssNull: Self = StObject.set(x, "css", null)
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setCursor(value: Double | String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setCx(value: Double | String): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      inline def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
      
      inline def setCy(value: Double | String): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      inline def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
      
      inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setDecelerate(value: Double | String): Self = StObject.set(x, "decelerate", value.asInstanceOf[js.Any])
      
      inline def setDecelerateUndefined: Self = StObject.set(x, "decelerate", js.undefined)
      
      inline def setDescent(value: Double | String): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
      
      inline def setDescentUndefined: Self = StObject.set(x, "descent", js.undefined)
      
      inline def setDiffuseConstant(value: Double | String): Self = StObject.set(x, "diffuseConstant", value.asInstanceOf[js.Any])
      
      inline def setDiffuseConstantUndefined: Self = StObject.set(x, "diffuseConstant", js.undefined)
      
      inline def setDirection(value: Double | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisplay(value: Double | String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setDivisor(value: Double | String): Self = StObject.set(x, "divisor", value.asInstanceOf[js.Any])
      
      inline def setDivisorUndefined: Self = StObject.set(x, "divisor", js.undefined)
      
      inline def setDominantBaseline(value: Double | String): Self = StObject.set(x, "dominantBaseline", value.asInstanceOf[js.Any])
      
      inline def setDominantBaselineUndefined: Self = StObject.set(x, "dominantBaseline", js.undefined)
      
      inline def setDur(value: Double | String): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
      
      inline def setDurUndefined: Self = StObject.set(x, "dur", js.undefined)
      
      inline def setDx(value: Double | String): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      inline def setDy(value: Double | String): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      inline def setEdgeMode(value: Double | String): Self = StObject.set(x, "edgeMode", value.asInstanceOf[js.Any])
      
      inline def setEdgeModeUndefined: Self = StObject.set(x, "edgeMode", js.undefined)
      
      inline def setElevation(value: Double | String): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      inline def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
      
      inline def setEnableBackground(value: Double | String): Self = StObject.set(x, "enableBackground", value.asInstanceOf[js.Any])
      
      inline def setEnableBackgroundUndefined: Self = StObject.set(x, "enableBackground", js.undefined)
      
      inline def setEnd(value: Double | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setExponent(value: Double | String): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
      
      inline def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
      
      inline def setExternalResourcesRequired(value: Booleanish): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
      
      inline def setExternalResourcesRequiredUndefined: Self = StObject.set(x, "externalResourcesRequired", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillOpacity(value: Double | String): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFillRule(value: nonzero | evenodd | inherit): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
      
      inline def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterRes(value: Double | String): Self = StObject.set(x, "filterRes", value.asInstanceOf[js.Any])
      
      inline def setFilterResUndefined: Self = StObject.set(x, "filterRes", js.undefined)
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFilterUnits(value: Double | String): Self = StObject.set(x, "filterUnits", value.asInstanceOf[js.Any])
      
      inline def setFilterUnitsUndefined: Self = StObject.set(x, "filterUnits", js.undefined)
      
      inline def setFloodColor(value: Double | String): Self = StObject.set(x, "floodColor", value.asInstanceOf[js.Any])
      
      inline def setFloodColorUndefined: Self = StObject.set(x, "floodColor", js.undefined)
      
      inline def setFloodOpacity(value: Double | String): Self = StObject.set(x, "floodOpacity", value.asInstanceOf[js.Any])
      
      inline def setFloodOpacityUndefined: Self = StObject.set(x, "floodOpacity", js.undefined)
      
      inline def setFocusable(value: Booleanish | auto): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeAdjust(value: Double | String): Self = StObject.set(x, "fontSizeAdjust", value.asInstanceOf[js.Any])
      
      inline def setFontSizeAdjustUndefined: Self = StObject.set(x, "fontSizeAdjust", js.undefined)
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStretch(value: Double | String): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
      
      inline def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
      
      inline def setFontStyle(value: Double | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontVariant(value: Double | String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      inline def setFontWeight(value: Double | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setFormat(value: Double | String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setFrom(value: Double | String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setFx(value: Double | String): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
      
      inline def setFxUndefined: Self = StObject.set(x, "fx", js.undefined)
      
      inline def setFy(value: Double | String): Self = StObject.set(x, "fy", value.asInstanceOf[js.Any])
      
      inline def setFyUndefined: Self = StObject.set(x, "fy", js.undefined)
      
      inline def setG1(value: Double | String): Self = StObject.set(x, "g1", value.asInstanceOf[js.Any])
      
      inline def setG1Undefined: Self = StObject.set(x, "g1", js.undefined)
      
      inline def setG2(value: Double | String): Self = StObject.set(x, "g2", value.asInstanceOf[js.Any])
      
      inline def setG2Undefined: Self = StObject.set(x, "g2", js.undefined)
      
      inline def setGlyphName(value: Double | String): Self = StObject.set(x, "glyphName", value.asInstanceOf[js.Any])
      
      inline def setGlyphNameUndefined: Self = StObject.set(x, "glyphName", js.undefined)
      
      inline def setGlyphOrientationHorizontal(value: Double | String): Self = StObject.set(x, "glyphOrientationHorizontal", value.asInstanceOf[js.Any])
      
      inline def setGlyphOrientationHorizontalUndefined: Self = StObject.set(x, "glyphOrientationHorizontal", js.undefined)
      
      inline def setGlyphOrientationVertical(value: Double | String): Self = StObject.set(x, "glyphOrientationVertical", value.asInstanceOf[js.Any])
      
      inline def setGlyphOrientationVerticalUndefined: Self = StObject.set(x, "glyphOrientationVertical", js.undefined)
      
      inline def setGlyphRef(value: Double | String): Self = StObject.set(x, "glyphRef", value.asInstanceOf[js.Any])
      
      inline def setGlyphRefUndefined: Self = StObject.set(x, "glyphRef", js.undefined)
      
      inline def setGradientTransform(value: String): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
      
      inline def setGradientTransformUndefined: Self = StObject.set(x, "gradientTransform", js.undefined)
      
      inline def setGradientUnits(value: String): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
      
      inline def setGradientUnitsUndefined: Self = StObject.set(x, "gradientUnits", js.undefined)
      
      inline def setHanging(value: Double | String): Self = StObject.set(x, "hanging", value.asInstanceOf[js.Any])
      
      inline def setHangingUndefined: Self = StObject.set(x, "hanging", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHorizAdvX(value: Double | String): Self = StObject.set(x, "horizAdvX", value.asInstanceOf[js.Any])
      
      inline def setHorizAdvXUndefined: Self = StObject.set(x, "horizAdvX", js.undefined)
      
      inline def setHorizOriginX(value: Double | String): Self = StObject.set(x, "horizOriginX", value.asInstanceOf[js.Any])
      
      inline def setHorizOriginXUndefined: Self = StObject.set(x, "horizOriginX", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIdeographic(value: Double | String): Self = StObject.set(x, "ideographic", value.asInstanceOf[js.Any])
      
      inline def setIdeographicUndefined: Self = StObject.set(x, "ideographic", js.undefined)
      
      inline def setImageRendering(value: Double | String): Self = StObject.set(x, "imageRendering", value.asInstanceOf[js.Any])
      
      inline def setImageRenderingUndefined: Self = StObject.set(x, "imageRendering", js.undefined)
      
      inline def setIn(value: String): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setIn2(value: Double | String): Self = StObject.set(x, "in2", value.asInstanceOf[js.Any])
      
      inline def setIn2Undefined: Self = StObject.set(x, "in2", js.undefined)
      
      inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      inline def setIntercept(value: Double | String): Self = StObject.set(x, "intercept", value.asInstanceOf[js.Any])
      
      inline def setInterceptUndefined: Self = StObject.set(x, "intercept", js.undefined)
      
      inline def setK(value: Double | String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      inline def setK1(value: Double | String): Self = StObject.set(x, "k1", value.asInstanceOf[js.Any])
      
      inline def setK1Undefined: Self = StObject.set(x, "k1", js.undefined)
      
      inline def setK2(value: Double | String): Self = StObject.set(x, "k2", value.asInstanceOf[js.Any])
      
      inline def setK2Undefined: Self = StObject.set(x, "k2", js.undefined)
      
      inline def setK3(value: Double | String): Self = StObject.set(x, "k3", value.asInstanceOf[js.Any])
      
      inline def setK3Undefined: Self = StObject.set(x, "k3", js.undefined)
      
      inline def setK4(value: Double | String): Self = StObject.set(x, "k4", value.asInstanceOf[js.Any])
      
      inline def setK4Undefined: Self = StObject.set(x, "k4", js.undefined)
      
      inline def setKUndefined: Self = StObject.set(x, "k", js.undefined)
      
      inline def setKernelMatrix(value: Double | String): Self = StObject.set(x, "kernelMatrix", value.asInstanceOf[js.Any])
      
      inline def setKernelMatrixUndefined: Self = StObject.set(x, "kernelMatrix", js.undefined)
      
      inline def setKernelUnitLength(value: Double | String): Self = StObject.set(x, "kernelUnitLength", value.asInstanceOf[js.Any])
      
      inline def setKernelUnitLengthUndefined: Self = StObject.set(x, "kernelUnitLength", js.undefined)
      
      inline def setKerning(value: Double | String): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
      
      inline def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyPoints(value: Double | String): Self = StObject.set(x, "keyPoints", value.asInstanceOf[js.Any])
      
      inline def setKeyPointsUndefined: Self = StObject.set(x, "keyPoints", js.undefined)
      
      inline def setKeySplines(value: Double | String): Self = StObject.set(x, "keySplines", value.asInstanceOf[js.Any])
      
      inline def setKeySplinesUndefined: Self = StObject.set(x, "keySplines", js.undefined)
      
      inline def setKeyTimes(value: Double | String): Self = StObject.set(x, "keyTimes", value.asInstanceOf[js.Any])
      
      inline def setKeyTimesUndefined: Self = StObject.set(x, "keyTimes", js.undefined)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setLengthAdjust(value: Double | String): Self = StObject.set(x, "lengthAdjust", value.asInstanceOf[js.Any])
      
      inline def setLengthAdjustUndefined: Self = StObject.set(x, "lengthAdjust", js.undefined)
      
      inline def setLetterSpacing(value: Double | String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      inline def setLightingColor(value: Double | String): Self = StObject.set(x, "lightingColor", value.asInstanceOf[js.Any])
      
      inline def setLightingColorUndefined: Self = StObject.set(x, "lightingColor", js.undefined)
      
      inline def setLimitingConeAngle(value: Double | String): Self = StObject.set(x, "limitingConeAngle", value.asInstanceOf[js.Any])
      
      inline def setLimitingConeAngleUndefined: Self = StObject.set(x, "limitingConeAngle", js.undefined)
      
      inline def setLocal(value: Double | String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
      
      inline def setM(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setMNull: Self = StObject.set(x, "m", null)
      
      inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      inline def setMVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "m", js.Array(value :_*))
      
      inline def setMargin(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomNull: Self = StObject.set(x, "marginBottom", null)
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginBottom", js.Array(value :_*))
      
      inline def setMarginLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftNull: Self = StObject.set(x, "marginLeft", null)
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginLeft", js.Array(value :_*))
      
      inline def setMarginNull: Self = StObject.set(x, "margin", null)
      
      inline def setMarginRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightNull: Self = StObject.set(x, "marginRight", null)
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginRight", js.Array(value :_*))
      
      inline def setMarginTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopNull: Self = StObject.set(x, "marginTop", null)
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginTop", js.Array(value :_*))
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarginVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "margin", js.Array(value :_*))
      
      inline def setMarginX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginX", value.asInstanceOf[js.Any])
      
      inline def setMarginXNull: Self = StObject.set(x, "marginX", null)
      
      inline def setMarginXUndefined: Self = StObject.set(x, "marginX", js.undefined)
      
      inline def setMarginXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginX", js.Array(value :_*))
      
      inline def setMarginY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginY", value.asInstanceOf[js.Any])
      
      inline def setMarginYNull: Self = StObject.set(x, "marginY", null)
      
      inline def setMarginYUndefined: Self = StObject.set(x, "marginY", js.undefined)
      
      inline def setMarginYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginY", js.Array(value :_*))
      
      inline def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      inline def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      inline def setMarkerHeight(value: Double | String): Self = StObject.set(x, "markerHeight", value.asInstanceOf[js.Any])
      
      inline def setMarkerHeightUndefined: Self = StObject.set(x, "markerHeight", js.undefined)
      
      inline def setMarkerMid(value: String): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      inline def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      inline def setMarkerStart(value: String): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      inline def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      inline def setMarkerUnits(value: Double | String): Self = StObject.set(x, "markerUnits", value.asInstanceOf[js.Any])
      
      inline def setMarkerUnitsUndefined: Self = StObject.set(x, "markerUnits", js.undefined)
      
      inline def setMarkerWidth(value: Double | String): Self = StObject.set(x, "markerWidth", value.asInstanceOf[js.Any])
      
      inline def setMarkerWidthUndefined: Self = StObject.set(x, "markerWidth", js.undefined)
      
      inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskContentUnits(value: Double | String): Self = StObject.set(x, "maskContentUnits", value.asInstanceOf[js.Any])
      
      inline def setMaskContentUnitsUndefined: Self = StObject.set(x, "maskContentUnits", js.undefined)
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMaskUnits(value: Double | String): Self = StObject.set(x, "maskUnits", value.asInstanceOf[js.Any])
      
      inline def setMaskUnitsUndefined: Self = StObject.set(x, "maskUnits", js.undefined)
      
      inline def setMathematical(value: Double | String): Self = StObject.set(x, "mathematical", value.asInstanceOf[js.Any])
      
      inline def setMathematicalUndefined: Self = StObject.set(x, "mathematical", js.undefined)
      
      inline def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
      
      inline def setMbNull: Self = StObject.set(x, "mb", null)
      
      inline def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
      
      inline def setMbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mb", js.Array(value :_*))
      
      inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
      
      inline def setMlNull: Self = StObject.set(x, "ml", null)
      
      inline def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
      
      inline def setMlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "ml", js.Array(value :_*))
      
      inline def setMode(value: Double | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
      
      inline def setMrNull: Self = StObject.set(x, "mr", null)
      
      inline def setMrUndefined: Self = StObject.set(x, "mr", js.undefined)
      
      inline def setMrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mr", js.Array(value :_*))
      
      inline def setMt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
      
      inline def setMtNull: Self = StObject.set(x, "mt", null)
      
      inline def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
      
      inline def setMtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mt", js.Array(value :_*))
      
      inline def setMx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mx", value.asInstanceOf[js.Any])
      
      inline def setMxNull: Self = StObject.set(x, "mx", null)
      
      inline def setMxUndefined: Self = StObject.set(x, "mx", js.undefined)
      
      inline def setMxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mx", js.Array(value :_*))
      
      inline def setMy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
      
      inline def setMyNull: Self = StObject.set(x, "my", null)
      
      inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
      
      inline def setMyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "my", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNumOctaves(value: Double | String): Self = StObject.set(x, "numOctaves", value.asInstanceOf[js.Any])
      
      inline def setNumOctavesUndefined: Self = StObject.set(x, "numOctaves", js.undefined)
      
      inline def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOnAbort(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(value: AnimationEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: AnimationEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: AnimationEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeInput(value: FormEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThrough(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(value: FormEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(value: CompositionEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: CompositionEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: CompositionEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ClipboardEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ClipboardEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDoubleClick(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      inline def setOnDragEnd(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(value: FormEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: FormEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: KeyboardEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadStart(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMouseDown(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPaste(value: ClipboardEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(value: FormEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnScroll(value: UIEvent[SVGSVGElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSeeked(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSubmit(value: FormEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(value: TouchEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: TouchEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: TransitionEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: WheelEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setOpacity(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityNull: Self = StObject.set(x, "opacity", null)
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOpacityVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any) | Null)*
      ): Self = StObject.set(x, "opacity", js.Array(value :_*))
      
      inline def setOperator(value: Double | String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      inline def setOrder(value: Double | String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrient(value: Double | String): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      inline def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      inline def setOrientation(value: Double | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setOrigin(value: Double | String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setOverflow(value: Double | String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setOverlinePosition(value: Double | String): Self = StObject.set(x, "overlinePosition", value.asInstanceOf[js.Any])
      
      inline def setOverlinePositionUndefined: Self = StObject.set(x, "overlinePosition", js.undefined)
      
      inline def setOverlineThickness(value: Double | String): Self = StObject.set(x, "overlineThickness", value.asInstanceOf[js.Any])
      
      inline def setOverlineThicknessUndefined: Self = StObject.set(x, "overlineThickness", js.undefined)
      
      inline def setP(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPNull: Self = StObject.set(x, "p", null)
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setPVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "p", js.Array(value :_*))
      
      inline def setPadding(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomNull: Self = StObject.set(x, "paddingBottom", null)
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingBottom", js.Array(value :_*))
      
      inline def setPaddingLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftNull: Self = StObject.set(x, "paddingLeft", null)
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingLeft", js.Array(value :_*))
      
      inline def setPaddingNull: Self = StObject.set(x, "padding", null)
      
      inline def setPaddingRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightNull: Self = StObject.set(x, "paddingRight", null)
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setPaddingRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingRight", js.Array(value :_*))
      
      inline def setPaddingTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopNull: Self = StObject.set(x, "paddingTop", null)
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPaddingTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingTop", js.Array(value :_*))
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "padding", js.Array(value :_*))
      
      inline def setPaddingX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
      
      inline def setPaddingXNull: Self = StObject.set(x, "paddingX", null)
      
      inline def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
      
      inline def setPaddingXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingX", js.Array(value :_*))
      
      inline def setPaddingY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
      
      inline def setPaddingYNull: Self = StObject.set(x, "paddingY", null)
      
      inline def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
      
      inline def setPaddingYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingY", js.Array(value :_*))
      
      inline def setPaintOrder(value: Double | String): Self = StObject.set(x, "paintOrder", value.asInstanceOf[js.Any])
      
      inline def setPaintOrderUndefined: Self = StObject.set(x, "paintOrder", js.undefined)
      
      inline def setPanose1(value: Double | String): Self = StObject.set(x, "panose1", value.asInstanceOf[js.Any])
      
      inline def setPanose1Undefined: Self = StObject.set(x, "panose1", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathLength(value: Double | String): Self = StObject.set(x, "pathLength", value.asInstanceOf[js.Any])
      
      inline def setPathLengthUndefined: Self = StObject.set(x, "pathLength", js.undefined)
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPatternContentUnits(value: String): Self = StObject.set(x, "patternContentUnits", value.asInstanceOf[js.Any])
      
      inline def setPatternContentUnitsUndefined: Self = StObject.set(x, "patternContentUnits", js.undefined)
      
      inline def setPatternTransform(value: Double | String): Self = StObject.set(x, "patternTransform", value.asInstanceOf[js.Any])
      
      inline def setPatternTransformUndefined: Self = StObject.set(x, "patternTransform", js.undefined)
      
      inline def setPatternUnits(value: String): Self = StObject.set(x, "patternUnits", value.asInstanceOf[js.Any])
      
      inline def setPatternUnitsUndefined: Self = StObject.set(x, "patternUnits", js.undefined)
      
      inline def setPb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pb", value.asInstanceOf[js.Any])
      
      inline def setPbNull: Self = StObject.set(x, "pb", null)
      
      inline def setPbUndefined: Self = StObject.set(x, "pb", js.undefined)
      
      inline def setPbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pb", js.Array(value :_*))
      
      inline def setPl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
      
      inline def setPlNull: Self = StObject.set(x, "pl", null)
      
      inline def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
      
      inline def setPlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pl", js.Array(value :_*))
      
      inline def setPointerEvents(value: Double | String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsAtX(value: Double | String): Self = StObject.set(x, "pointsAtX", value.asInstanceOf[js.Any])
      
      inline def setPointsAtXUndefined: Self = StObject.set(x, "pointsAtX", js.undefined)
      
      inline def setPointsAtY(value: Double | String): Self = StObject.set(x, "pointsAtY", value.asInstanceOf[js.Any])
      
      inline def setPointsAtYUndefined: Self = StObject.set(x, "pointsAtY", js.undefined)
      
      inline def setPointsAtZ(value: Double | String): Self = StObject.set(x, "pointsAtZ", value.asInstanceOf[js.Any])
      
      inline def setPointsAtZUndefined: Self = StObject.set(x, "pointsAtZ", js.undefined)
      
      inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      inline def setPr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
      
      inline def setPrNull: Self = StObject.set(x, "pr", null)
      
      inline def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
      
      inline def setPrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pr", js.Array(value :_*))
      
      inline def setPreserveAlpha(value: Booleanish): Self = StObject.set(x, "preserveAlpha", value.asInstanceOf[js.Any])
      
      inline def setPreserveAlphaUndefined: Self = StObject.set(x, "preserveAlpha", js.undefined)
      
      inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      inline def setPrimitiveUnits(value: Double | String): Self = StObject.set(x, "primitiveUnits", value.asInstanceOf[js.Any])
      
      inline def setPrimitiveUnitsUndefined: Self = StObject.set(x, "primitiveUnits", js.undefined)
      
      inline def setPt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
      
      inline def setPtNull: Self = StObject.set(x, "pt", null)
      
      inline def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
      inline def setPtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pt", js.Array(value :_*))
      
      inline def setPx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
      
      inline def setPxNull: Self = StObject.set(x, "px", null)
      
      inline def setPxUndefined: Self = StObject.set(x, "px", js.undefined)
      
      inline def setPxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "px", js.Array(value :_*))
      
      inline def setPy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
      
      inline def setPyNull: Self = StObject.set(x, "py", null)
      
      inline def setPyUndefined: Self = StObject.set(x, "py", js.undefined)
      
      inline def setPyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "py", js.Array(value :_*))
      
      inline def setR(value: Double | String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      inline def setRadius(value: Double | String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRef(value: LegacyRef[SVGSVGElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ SVGSVGElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRefX(value: Double | String): Self = StObject.set(x, "refX", value.asInstanceOf[js.Any])
      
      inline def setRefXUndefined: Self = StObject.set(x, "refX", js.undefined)
      
      inline def setRefY(value: Double | String): Self = StObject.set(x, "refY", value.asInstanceOf[js.Any])
      
      inline def setRefYUndefined: Self = StObject.set(x, "refY", js.undefined)
      
      inline def setRenderingIntent(value: Double | String): Self = StObject.set(x, "renderingIntent", value.asInstanceOf[js.Any])
      
      inline def setRenderingIntentUndefined: Self = StObject.set(x, "renderingIntent", js.undefined)
      
      inline def setRepeatCount(value: Double | String): Self = StObject.set(x, "repeatCount", value.asInstanceOf[js.Any])
      
      inline def setRepeatCountUndefined: Self = StObject.set(x, "repeatCount", js.undefined)
      
      inline def setRepeatDur(value: Double | String): Self = StObject.set(x, "repeatDur", value.asInstanceOf[js.Any])
      
      inline def setRepeatDurUndefined: Self = StObject.set(x, "repeatDur", js.undefined)
      
      inline def setRequiredExtensions(value: Double | String): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
      
      inline def setRequiredExtensionsUndefined: Self = StObject.set(x, "requiredExtensions", js.undefined)
      
      inline def setRequiredFeatures(value: Double | String): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
      
      inline def setRequiredFeaturesUndefined: Self = StObject.set(x, "requiredFeatures", js.undefined)
      
      inline def setRestart(value: Double | String): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
      
      inline def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
      
      inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRotate(value: Double | String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setRx(value: Double | String): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      inline def setRy(value: Double | String): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
      
      inline def setScale(value: Double | String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSeed(value: Double | String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      inline def setShapeRendering(value: Double | String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
      
      inline def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
      
      inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSlope(value: Double | String): Self = StObject.set(x, "slope", value.asInstanceOf[js.Any])
      
      inline def setSlopeUndefined: Self = StObject.set(x, "slope", js.undefined)
      
      inline def setSpacing(value: Double | String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setSpecularConstant(value: Double | String): Self = StObject.set(x, "specularConstant", value.asInstanceOf[js.Any])
      
      inline def setSpecularConstantUndefined: Self = StObject.set(x, "specularConstant", js.undefined)
      
      inline def setSpecularExponent(value: Double | String): Self = StObject.set(x, "specularExponent", value.asInstanceOf[js.Any])
      
      inline def setSpecularExponentUndefined: Self = StObject.set(x, "specularExponent", js.undefined)
      
      inline def setSpeed(value: Double | String): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setSpreadMethod(value: String): Self = StObject.set(x, "spreadMethod", value.asInstanceOf[js.Any])
      
      inline def setSpreadMethodUndefined: Self = StObject.set(x, "spreadMethod", js.undefined)
      
      inline def setStartOffset(value: Double | String): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
      
      inline def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
      
      inline def setStdDeviation(value: Double | String): Self = StObject.set(x, "stdDeviation", value.asInstanceOf[js.Any])
      
      inline def setStdDeviationUndefined: Self = StObject.set(x, "stdDeviation", js.undefined)
      
      inline def setStemh(value: Double | String): Self = StObject.set(x, "stemh", value.asInstanceOf[js.Any])
      
      inline def setStemhUndefined: Self = StObject.set(x, "stemh", js.undefined)
      
      inline def setStemv(value: Double | String): Self = StObject.set(x, "stemv", value.asInstanceOf[js.Any])
      
      inline def setStemvUndefined: Self = StObject.set(x, "stemv", js.undefined)
      
      inline def setStitchTiles(value: Double | String): Self = StObject.set(x, "stitchTiles", value.asInstanceOf[js.Any])
      
      inline def setStitchTilesUndefined: Self = StObject.set(x, "stitchTiles", js.undefined)
      
      inline def setStopColor(value: String): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
      
      inline def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
      
      inline def setStopOpacity(value: Double | String): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
      
      inline def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
      
      inline def setStrikethroughPosition(value: Double | String): Self = StObject.set(x, "strikethroughPosition", value.asInstanceOf[js.Any])
      
      inline def setStrikethroughPositionUndefined: Self = StObject.set(x, "strikethroughPosition", js.undefined)
      
      inline def setStrikethroughThickness(value: Double | String): Self = StObject.set(x, "strikethroughThickness", value.asInstanceOf[js.Any])
      
      inline def setStrikethroughThicknessUndefined: Self = StObject.set(x, "strikethroughThickness", js.undefined)
      
      inline def setString(value: Double | String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeDasharray(value: String | Double): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
      
      inline def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
      
      inline def setStrokeDashoffset(value: String | Double): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
      
      inline def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
      
      inline def setStrokeLinecap(value: butt | round | square | inherit): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      inline def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      inline def setStrokeLinejoin(value: miter | round | bevel | inherit): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
      
      inline def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
      
      inline def setStrokeMiterlimit(value: Double | String): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
      
      inline def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
      
      inline def setStrokeOpacity(value: Double | String): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setStrokeWidth(value: Double | String): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSurfaceScale(value: Double | String): Self = StObject.set(x, "surfaceScale", value.asInstanceOf[js.Any])
      
      inline def setSurfaceScaleUndefined: Self = StObject.set(x, "surfaceScale", js.undefined)
      
      inline def setSx(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SxStyleProp */ js.Any
      ): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      inline def setSystemLanguage(value: Double | String): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
      
      inline def setSystemLanguageUndefined: Self = StObject.set(x, "systemLanguage", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTableValues(value: Double | String): Self = StObject.set(x, "tableValues", value.asInstanceOf[js.Any])
      
      inline def setTableValuesUndefined: Self = StObject.set(x, "tableValues", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTargetX(value: Double | String): Self = StObject.set(x, "targetX", value.asInstanceOf[js.Any])
      
      inline def setTargetXUndefined: Self = StObject.set(x, "targetX", js.undefined)
      
      inline def setTargetY(value: Double | String): Self = StObject.set(x, "targetY", value.asInstanceOf[js.Any])
      
      inline def setTargetYUndefined: Self = StObject.set(x, "targetY", js.undefined)
      
      inline def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      inline def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
      
      inline def setTextDecoration(value: Double | String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      inline def setTextLength(value: Double | String): Self = StObject.set(x, "textLength", value.asInstanceOf[js.Any])
      
      inline def setTextLengthUndefined: Self = StObject.set(x, "textLength", js.undefined)
      
      inline def setTextRendering(value: Double | String): Self = StObject.set(x, "textRendering", value.asInstanceOf[js.Any])
      
      inline def setTextRenderingUndefined: Self = StObject.set(x, "textRendering", js.undefined)
      
      inline def setTo(value: Double | String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setU1(value: Double | String): Self = StObject.set(x, "u1", value.asInstanceOf[js.Any])
      
      inline def setU1Undefined: Self = StObject.set(x, "u1", js.undefined)
      
      inline def setU2(value: Double | String): Self = StObject.set(x, "u2", value.asInstanceOf[js.Any])
      
      inline def setU2Undefined: Self = StObject.set(x, "u2", js.undefined)
      
      inline def setUnderlinePosition(value: Double | String): Self = StObject.set(x, "underlinePosition", value.asInstanceOf[js.Any])
      
      inline def setUnderlinePositionUndefined: Self = StObject.set(x, "underlinePosition", js.undefined)
      
      inline def setUnderlineThickness(value: Double | String): Self = StObject.set(x, "underlineThickness", value.asInstanceOf[js.Any])
      
      inline def setUnderlineThicknessUndefined: Self = StObject.set(x, "underlineThickness", js.undefined)
      
      inline def setUnicode(value: Double | String): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      inline def setUnicodeBidi(value: Double | String): Self = StObject.set(x, "unicodeBidi", value.asInstanceOf[js.Any])
      
      inline def setUnicodeBidiUndefined: Self = StObject.set(x, "unicodeBidi", js.undefined)
      
      inline def setUnicodeRange(value: Double | String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
      
      inline def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
      
      inline def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
      
      inline def setUnitsPerEm(value: Double | String): Self = StObject.set(x, "unitsPerEm", value.asInstanceOf[js.Any])
      
      inline def setUnitsPerEmUndefined: Self = StObject.set(x, "unitsPerEm", js.undefined)
      
      inline def setVAlphabetic(value: Double | String): Self = StObject.set(x, "vAlphabetic", value.asInstanceOf[js.Any])
      
      inline def setVAlphabeticUndefined: Self = StObject.set(x, "vAlphabetic", js.undefined)
      
      inline def setVHanging(value: Double | String): Self = StObject.set(x, "vHanging", value.asInstanceOf[js.Any])
      
      inline def setVHangingUndefined: Self = StObject.set(x, "vHanging", js.undefined)
      
      inline def setVIdeographic(value: Double | String): Self = StObject.set(x, "vIdeographic", value.asInstanceOf[js.Any])
      
      inline def setVIdeographicUndefined: Self = StObject.set(x, "vIdeographic", js.undefined)
      
      inline def setVMathematical(value: Double | String): Self = StObject.set(x, "vMathematical", value.asInstanceOf[js.Any])
      
      inline def setVMathematicalUndefined: Self = StObject.set(x, "vMathematical", js.undefined)
      
      inline def setValues(value: String): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      inline def setVectorEffect(value: Double | String): Self = StObject.set(x, "vectorEffect", value.asInstanceOf[js.Any])
      
      inline def setVectorEffectUndefined: Self = StObject.set(x, "vectorEffect", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setVertAdvY(value: Double | String): Self = StObject.set(x, "vertAdvY", value.asInstanceOf[js.Any])
      
      inline def setVertAdvYUndefined: Self = StObject.set(x, "vertAdvY", js.undefined)
      
      inline def setVertOriginX(value: Double | String): Self = StObject.set(x, "vertOriginX", value.asInstanceOf[js.Any])
      
      inline def setVertOriginXUndefined: Self = StObject.set(x, "vertOriginX", js.undefined)
      
      inline def setVertOriginY(value: Double | String): Self = StObject.set(x, "vertOriginY", value.asInstanceOf[js.Any])
      
      inline def setVertOriginYUndefined: Self = StObject.set(x, "vertOriginY", js.undefined)
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      inline def setViewTarget(value: Double | String): Self = StObject.set(x, "viewTarget", value.asInstanceOf[js.Any])
      
      inline def setViewTargetUndefined: Self = StObject.set(x, "viewTarget", js.undefined)
      
      inline def setVisibility(value: Double | String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWidths(value: Double | String): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      inline def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
      
      inline def setWordSpacing(value: Double | String): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
      
      inline def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
      
      inline def setWritingMode(value: Double | String): Self = StObject.set(x, "writingMode", value.asInstanceOf[js.Any])
      
      inline def setWritingModeUndefined: Self = StObject.set(x, "writingMode", js.undefined)
      
      inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX1(value: Double | String): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
      
      inline def setX2(value: Double | String): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      inline def setXChannelSelector(value: String): Self = StObject.set(x, "xChannelSelector", value.asInstanceOf[js.Any])
      
      inline def setXChannelSelectorUndefined: Self = StObject.set(x, "xChannelSelector", js.undefined)
      
      inline def setXHeight(value: Double | String): Self = StObject.set(x, "xHeight", value.asInstanceOf[js.Any])
      
      inline def setXHeightUndefined: Self = StObject.set(x, "xHeight", js.undefined)
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setXlinkActuate(value: String): Self = StObject.set(x, "xlinkActuate", value.asInstanceOf[js.Any])
      
      inline def setXlinkActuateUndefined: Self = StObject.set(x, "xlinkActuate", js.undefined)
      
      inline def setXlinkArcrole(value: String): Self = StObject.set(x, "xlinkArcrole", value.asInstanceOf[js.Any])
      
      inline def setXlinkArcroleUndefined: Self = StObject.set(x, "xlinkArcrole", js.undefined)
      
      inline def setXlinkHref(value: String): Self = StObject.set(x, "xlinkHref", value.asInstanceOf[js.Any])
      
      inline def setXlinkHrefUndefined: Self = StObject.set(x, "xlinkHref", js.undefined)
      
      inline def setXlinkRole(value: String): Self = StObject.set(x, "xlinkRole", value.asInstanceOf[js.Any])
      
      inline def setXlinkRoleUndefined: Self = StObject.set(x, "xlinkRole", js.undefined)
      
      inline def setXlinkShow(value: String): Self = StObject.set(x, "xlinkShow", value.asInstanceOf[js.Any])
      
      inline def setXlinkShowUndefined: Self = StObject.set(x, "xlinkShow", js.undefined)
      
      inline def setXlinkTitle(value: String): Self = StObject.set(x, "xlinkTitle", value.asInstanceOf[js.Any])
      
      inline def setXlinkTitleUndefined: Self = StObject.set(x, "xlinkTitle", js.undefined)
      
      inline def setXlinkType(value: String): Self = StObject.set(x, "xlinkType", value.asInstanceOf[js.Any])
      
      inline def setXlinkTypeUndefined: Self = StObject.set(x, "xlinkType", js.undefined)
      
      inline def setXmlBase(value: String): Self = StObject.set(x, "xmlBase", value.asInstanceOf[js.Any])
      
      inline def setXmlBaseUndefined: Self = StObject.set(x, "xmlBase", js.undefined)
      
      inline def setXmlLang(value: String): Self = StObject.set(x, "xmlLang", value.asInstanceOf[js.Any])
      
      inline def setXmlLangUndefined: Self = StObject.set(x, "xmlLang", js.undefined)
      
      inline def setXmlSpace(value: String): Self = StObject.set(x, "xmlSpace", value.asInstanceOf[js.Any])
      
      inline def setXmlSpaceUndefined: Self = StObject.set(x, "xmlSpace", js.undefined)
      
      inline def setXmlns(value: String): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
      
      inline def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
      
      inline def setXmlnsXlink(value: String): Self = StObject.set(x, "xmlnsXlink", value.asInstanceOf[js.Any])
      
      inline def setXmlnsXlinkUndefined: Self = StObject.set(x, "xmlnsXlink", js.undefined)
      
      inline def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double | String): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
      
      inline def setY2(value: Double | String): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
      
      inline def setYChannelSelector(value: String): Self = StObject.set(x, "yChannelSelector", value.asInstanceOf[js.Any])
      
      inline def setYChannelSelectorUndefined: Self = StObject.set(x, "yChannelSelector", js.undefined)
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setZ(value: Double | String): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
      
      inline def setZoomAndPan(value: String): Self = StObject.set(x, "zoomAndPan", value.asInstanceOf[js.Any])
      
      inline def setZoomAndPanUndefined: Self = StObject.set(x, "zoomAndPan", js.undefined)
    }
  }
  
  type TextProps = BoxProps
  
  type TextareaProps = Assign[ComponentProps[textarea], BoxOwnProps]
}
