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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  @JSImport("@theme-ui/components", "Field")
  @js.native
  def Field[T /* <: ElementType[_] */](props: FieldProps[T]): Element = js.native
  
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
  - Dropped {[ P in keyof react.react.ComponentProps<'img'> & @theme-ui/components.@theme-ui/components.BoxOwnProps ]: P extends keyof react.react.ComponentProps<'img'>? react.react.ComponentProps<'img'>[P] : P extends keyof @theme-ui/components.@theme-ui/components.BoxOwnProps? @theme-ui/components.@theme-ui/components.BoxOwnProps[P] : never} */ @js.native
  trait AspectImageProps extends StObject {
    
    var ratio: js.UndefOr[Double] = js.native
  }
  object AspectImageProps {
    
    @scala.inline
    def apply(): AspectImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AspectImageProps]
    }
    
    @scala.inline
    implicit class AspectImagePropsMutableBuilder[Self <: AspectImageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof react.react.ComponentProps<'div'> & @theme-ui/components.@theme-ui/components.BoxOwnProps ]: P extends keyof react.react.ComponentProps<'div'>? react.react.ComponentProps<'div'>[P] : P extends keyof @theme-ui/components.@theme-ui/components.BoxOwnProps? @theme-ui/components.@theme-ui/components.BoxOwnProps[P] : never} */ @js.native
  trait AspectRatioProps extends StObject {
    
    var ratio: js.UndefOr[Double] = js.native
  }
  object AspectRatioProps {
    
    @scala.inline
    def apply(): AspectRatioProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AspectRatioProps]
    }
    
    @scala.inline
    implicit class AspectRatioPropsMutableBuilder[Self <: AspectRatioProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    }
  }
  
  type Assign[T, U] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T & U ]: P extends keyof T? T[P] : P extends keyof U? U[P] : never}
    */ typings.themeUiComponents.themeUiComponentsStrings.Assign with TopLevel[js.Any]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof react.react.ComponentProps<'img'> & @theme-ui/components.@theme-ui/components.BoxOwnProps ]: P extends keyof react.react.ComponentProps<'img'>? react.react.ComponentProps<'img'>[P] : P extends keyof @theme-ui/components.@theme-ui/components.BoxOwnProps? @theme-ui/components.@theme-ui/components.BoxOwnProps[P] : never} */ @js.native
  trait AvatarProps extends StObject {
    
    var size: js.UndefOr[Double | String] = js.native
  }
  object AvatarProps {
    
    @scala.inline
    def apply(): AvatarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarProps]
    }
    
    @scala.inline
    implicit class AvatarPropsMutableBuilder[Self <: AvatarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type BadgeProps = BoxProps
  
  @js.native
  trait BoxOwnProps
    extends ColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]]
       with SpaceProps[RequiredTheme, ThemeValue[space, RequiredTheme, js.Any]] {
    
    var as: js.UndefOr[ElementType[_]] = js.native
    
    var css: js.UndefOr[InterpolationWithTheme[_]] = js.native
    
    var sx: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SxStyleProp */ js.Any
      ] = js.native
    
    var variant: js.UndefOr[String] = js.native
  }
  object BoxOwnProps {
    
    @scala.inline
    def apply(): BoxOwnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoxOwnProps]
    }
    
    @scala.inline
    implicit class BoxOwnPropsMutableBuilder[Self <: BoxOwnProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: ElementType[_]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setCss(value: InterpolationWithTheme[_]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssFunction1(value: _ => Interpolation[js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "css", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCssNull: Self = StObject.set(x, "css", null)
      
      @scala.inline
      def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      @scala.inline
      def setSx(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SxStyleProp */ js.Any
      ): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      @scala.inline
      def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
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
  @js.native
  trait DonutProps extends StObject {
    
    var accentHeight: js.UndefOr[Double | String] = js.native
    
    var accumulate: js.UndefOr[none | sum] = js.native
    
    var additive: js.UndefOr[replace | sum] = js.native
    
    var alignmentBaseline: js.UndefOr[
        auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
      ] = js.native
    
    var allowReorder: js.UndefOr[no | yes] = js.native
    
    var alphabetic: js.UndefOr[Double | String] = js.native
    
    var amplitude: js.UndefOr[Double | String] = js.native
    
    var arabicForm: js.UndefOr[initial | medial | terminal | isolated] = js.native
    
    var `aria-activedescendant`: js.UndefOr[String] = js.native
    
    var `aria-atomic`: js.UndefOr[Boolean] = js.native
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
    
    var `aria-busy`: js.UndefOr[Boolean] = js.native
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-colcount`: js.UndefOr[Double] = js.native
    
    var `aria-colindex`: js.UndefOr[Double] = js.native
    
    var `aria-colspan`: js.UndefOr[Double] = js.native
    
    var `aria-controls`: js.UndefOr[String] = js.native
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
    
    var `aria-describedby`: js.UndefOr[String] = js.native
    
    var `aria-details`: js.UndefOr[String] = js.native
    
    var `aria-disabled`: js.UndefOr[Boolean] = js.native
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
    
    var `aria-errormessage`: js.UndefOr[String] = js.native
    
    var `aria-expanded`: js.UndefOr[Boolean] = js.native
    
    var `aria-flowto`: js.UndefOr[String] = js.native
    
    var `aria-grabbed`: js.UndefOr[Boolean] = js.native
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
    
    var `aria-hidden`: js.UndefOr[Boolean] = js.native
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.native
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    var `aria-level`: js.UndefOr[Double] = js.native
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
    
    var `aria-modal`: js.UndefOr[Boolean] = js.native
    
    var `aria-multiline`: js.UndefOr[Boolean] = js.native
    
    var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
    
    var `aria-owns`: js.UndefOr[String] = js.native
    
    var `aria-placeholder`: js.UndefOr[String] = js.native
    
    var `aria-posinset`: js.UndefOr[Double] = js.native
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-readonly`: js.UndefOr[Boolean] = js.native
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.native
    
    var `aria-required`: js.UndefOr[Boolean] = js.native
    
    var `aria-roledescription`: js.UndefOr[String] = js.native
    
    var `aria-rowcount`: js.UndefOr[Double] = js.native
    
    var `aria-rowindex`: js.UndefOr[Double] = js.native
    
    var `aria-rowspan`: js.UndefOr[Double] = js.native
    
    var `aria-selected`: js.UndefOr[Boolean] = js.native
    
    var `aria-setsize`: js.UndefOr[Double] = js.native
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
    
    var `aria-valuemax`: js.UndefOr[Double] = js.native
    
    var `aria-valuemin`: js.UndefOr[Double] = js.native
    
    var `aria-valuenow`: js.UndefOr[Double] = js.native
    
    var `aria-valuetext`: js.UndefOr[String] = js.native
    
    var as: js.UndefOr[ElementType[_]] = js.native
    
    var ascent: js.UndefOr[Double | String] = js.native
    
    var attributeName: js.UndefOr[String] = js.native
    
    var attributeType: js.UndefOr[String] = js.native
    
    var autoReverse: js.UndefOr[Booleanish] = js.native
    
    var azimuth: js.UndefOr[Double | String] = js.native
    
    var backgroundColor: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]] = js.native
    
    var baseFrequency: js.UndefOr[Double | String] = js.native
    
    var baseProfile: js.UndefOr[Double | String] = js.native
    
    var baselineShift: js.UndefOr[Double | String] = js.native
    
    var bbox: js.UndefOr[Double | String] = js.native
    
    var begin: js.UndefOr[Double | String] = js.native
    
    /**
      * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
      * By default the raw value of the prop is returned.
      *
      * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
      * Array values are converted into responsive values.
      *
      * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-color)
      */
    var bg: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]] = js.native
    
    var bias: js.UndefOr[Double | String] = js.native
    
    var by: js.UndefOr[Double | String] = js.native
    
    var calcMode: js.UndefOr[Double | String] = js.native
    
    var capHeight: js.UndefOr[Double | String] = js.native
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var clip: js.UndefOr[Double | String] = js.native
    
    var clipPath: js.UndefOr[String] = js.native
    
    var clipPathUnits: js.UndefOr[Double | String] = js.native
    
    var clipRule: js.UndefOr[Double | String] = js.native
    
    /**
      * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
      * By default the raw value of the prop is returned.
      *
      * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
      * Array values are converted into responsive values.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/color)
      */
    var color: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]] = js.native
    
    var colorInterpolation: js.UndefOr[Double | String] = js.native
    
    var colorInterpolationFilters: js.UndefOr[auto | sRGB | linearRGB | inherit] = js.native
    
    var colorProfile: js.UndefOr[Double | String] = js.native
    
    var colorRendering: js.UndefOr[Double | String] = js.native
    
    var contentScriptType: js.UndefOr[Double | String] = js.native
    
    var contentStyleType: js.UndefOr[Double | String] = js.native
    
    var crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.native
    
    var css: js.UndefOr[InterpolationWithTheme[_]] = js.native
    
    var cursor: js.UndefOr[Double | String] = js.native
    
    var cx: js.UndefOr[Double | String] = js.native
    
    var cy: js.UndefOr[Double | String] = js.native
    
    var d: js.UndefOr[String] = js.native
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
    
    var decelerate: js.UndefOr[Double | String] = js.native
    
    var descent: js.UndefOr[Double | String] = js.native
    
    var diffuseConstant: js.UndefOr[Double | String] = js.native
    
    var direction: js.UndefOr[Double | String] = js.native
    
    var display: js.UndefOr[Double | String] = js.native
    
    var divisor: js.UndefOr[Double | String] = js.native
    
    var dominantBaseline: js.UndefOr[Double | String] = js.native
    
    var dur: js.UndefOr[Double | String] = js.native
    
    var dx: js.UndefOr[Double | String] = js.native
    
    var dy: js.UndefOr[Double | String] = js.native
    
    var edgeMode: js.UndefOr[Double | String] = js.native
    
    var elevation: js.UndefOr[Double | String] = js.native
    
    var enableBackground: js.UndefOr[Double | String] = js.native
    
    var end: js.UndefOr[Double | String] = js.native
    
    var exponent: js.UndefOr[Double | String] = js.native
    
    var externalResourcesRequired: js.UndefOr[Booleanish] = js.native
    
    var fill: js.UndefOr[String] = js.native
    
    var fillOpacity: js.UndefOr[Double | String] = js.native
    
    var fillRule: js.UndefOr[nonzero | evenodd | inherit] = js.native
    
    var filter: js.UndefOr[String] = js.native
    
    var filterRes: js.UndefOr[Double | String] = js.native
    
    var filterUnits: js.UndefOr[Double | String] = js.native
    
    var floodColor: js.UndefOr[Double | String] = js.native
    
    var floodOpacity: js.UndefOr[Double | String] = js.native
    
    var focusable: js.UndefOr[Booleanish | auto] = js.native
    
    var fontFamily: js.UndefOr[String] = js.native
    
    var fontSize: js.UndefOr[Double | String] = js.native
    
    var fontSizeAdjust: js.UndefOr[Double | String] = js.native
    
    var fontStretch: js.UndefOr[Double | String] = js.native
    
    var fontStyle: js.UndefOr[Double | String] = js.native
    
    var fontVariant: js.UndefOr[Double | String] = js.native
    
    var fontWeight: js.UndefOr[Double | String] = js.native
    
    var format: js.UndefOr[Double | String] = js.native
    
    var from: js.UndefOr[Double | String] = js.native
    
    var fx: js.UndefOr[Double | String] = js.native
    
    var fy: js.UndefOr[Double | String] = js.native
    
    var g1: js.UndefOr[Double | String] = js.native
    
    var g2: js.UndefOr[Double | String] = js.native
    
    var glyphName: js.UndefOr[Double | String] = js.native
    
    var glyphOrientationHorizontal: js.UndefOr[Double | String] = js.native
    
    var glyphOrientationVertical: js.UndefOr[Double | String] = js.native
    
    var glyphRef: js.UndefOr[Double | String] = js.native
    
    var gradientTransform: js.UndefOr[String] = js.native
    
    var gradientUnits: js.UndefOr[String] = js.native
    
    var hanging: js.UndefOr[Double | String] = js.native
    
    var height: js.UndefOr[Double | String] = js.native
    
    var horizAdvX: js.UndefOr[Double | String] = js.native
    
    var horizOriginX: js.UndefOr[Double | String] = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var ideographic: js.UndefOr[Double | String] = js.native
    
    var imageRendering: js.UndefOr[Double | String] = js.native
    
    var in: js.UndefOr[String] = js.native
    
    var in2: js.UndefOr[Double | String] = js.native
    
    var intercept: js.UndefOr[Double | String] = js.native
    
    var k: js.UndefOr[Double | String] = js.native
    
    var k1: js.UndefOr[Double | String] = js.native
    
    var k2: js.UndefOr[Double | String] = js.native
    
    var k3: js.UndefOr[Double | String] = js.native
    
    var k4: js.UndefOr[Double | String] = js.native
    
    var kernelMatrix: js.UndefOr[Double | String] = js.native
    
    var kernelUnitLength: js.UndefOr[Double | String] = js.native
    
    var kerning: js.UndefOr[Double | String] = js.native
    
    var key: js.UndefOr[Key | Null] = js.native
    
    var keyPoints: js.UndefOr[Double | String] = js.native
    
    var keySplines: js.UndefOr[Double | String] = js.native
    
    var keyTimes: js.UndefOr[Double | String] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var lengthAdjust: js.UndefOr[Double | String] = js.native
    
    var letterSpacing: js.UndefOr[Double | String] = js.native
    
    var lightingColor: js.UndefOr[Double | String] = js.native
    
    var limitingConeAngle: js.UndefOr[Double | String] = js.native
    
    var local: js.UndefOr[Double | String] = js.native
    
    /** Margin on top, left, bottom and right */
    var m: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Margin on top, left, bottom and right */
    var margin: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Margin on bottom */
    var marginBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Margin on left */
    var marginLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Margin on right */
    var marginRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Margin on top */
    var marginTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Margin on left and right */
    var marginX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Margin on top and bottom */
    var marginY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    var markerEnd: js.UndefOr[String] = js.native
    
    var markerHeight: js.UndefOr[Double | String] = js.native
    
    var markerMid: js.UndefOr[String] = js.native
    
    var markerStart: js.UndefOr[String] = js.native
    
    var markerUnits: js.UndefOr[Double | String] = js.native
    
    var markerWidth: js.UndefOr[Double | String] = js.native
    
    var mask: js.UndefOr[String] = js.native
    
    var maskContentUnits: js.UndefOr[Double | String] = js.native
    
    var maskUnits: js.UndefOr[Double | String] = js.native
    
    var mathematical: js.UndefOr[Double | String] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    /** Margin on bottom */
    var mb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    var media: js.UndefOr[String] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    /** Margin on left */
    var ml: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    var mode: js.UndefOr[Double | String] = js.native
    
    /** Margin on right */
    var mr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Margin on top */
    var mt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Margin on left and right */
    var mx: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Margin on top and bottom */
    var my: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var numOctaves: js.UndefOr[Double | String] = js.native
    
    var offset: js.UndefOr[Double | String] = js.native
    
    var onAbort: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.native
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.native
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.native
    
    var onAuxClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
    
    var onBeforeInput: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[SVGSVGElement]] = js.native
    
    var onCanPlay: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onChange: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.native
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.native
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
    
    var onCopy: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.native
    
    var onCut: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.native
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
    
    var onDrag: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
    
    var onDragEnd: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
    
    var onDragEnter: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
    
    var onDragExit: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
    
    var onDragLeave: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
    
    var onDragOver: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
    
    var onDragStart: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
    
    var onDrop: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
    
    var onDurationChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onEmptied: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onEncrypted: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onEnded: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onError: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[SVGSVGElement]] = js.native
    
    var onInput: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.native
    
    var onInvalid: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.native
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.native
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.native
    
    var onLoad: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onLoadStart: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onLoadedData: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
    
    var onMouseMove: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
    
    var onMouseOut: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
    
    var onMouseOver: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
    
    var onPaste: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.native
    
    var onPause: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onPlay: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onPlaying: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
    
    var onPointerDown: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
    
    var onPointerMove: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
    
    var onPointerOut: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
    
    var onPointerOver: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
    
    var onPointerUp: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
    
    var onProgress: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onRateChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onReset: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.native
    
    var onScroll: js.UndefOr[UIEventHandler[SVGSVGElement]] = js.native
    
    var onSeeked: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onSeeking: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onSelect: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onStalled: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onSubmit: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.native
    
    var onSuspend: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.native
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.native
    
    var onTouchMove: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.native
    
    var onTouchStart: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.native
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[SVGSVGElement]] = js.native
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onWaiting: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onWheel: js.UndefOr[WheelEventHandler[SVGSVGElement]] = js.native
    
    /**
      * The opacity CSS property sets the transparency of an element or the degree to which content
      * behind an element is visible.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/opacity)
      */
    var opacity: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ _, 
          RequiredTheme
        ]
      ] = js.native
    
    var operator: js.UndefOr[Double | String] = js.native
    
    var order: js.UndefOr[Double | String] = js.native
    
    var orient: js.UndefOr[Double | String] = js.native
    
    var orientation: js.UndefOr[Double | String] = js.native
    
    var origin: js.UndefOr[Double | String] = js.native
    
    var overflow: js.UndefOr[Double | String] = js.native
    
    var overlinePosition: js.UndefOr[Double | String] = js.native
    
    var overlineThickness: js.UndefOr[Double | String] = js.native
    
    /** Padding on top, left, bottom and right */
    var p: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Padding on top, left, bottom and right */
    var padding: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Padding on bottom */
    var paddingBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Padding on left */
    var paddingLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Padding on right */
    var paddingRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Padding on top */
    var paddingTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Padding on left and right */
    var paddingX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Padding on top and bottom */
    var paddingY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    var paintOrder: js.UndefOr[Double | String] = js.native
    
    var panose1: js.UndefOr[Double | String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var pathLength: js.UndefOr[Double | String] = js.native
    
    var patternContentUnits: js.UndefOr[String] = js.native
    
    var patternTransform: js.UndefOr[Double | String] = js.native
    
    var patternUnits: js.UndefOr[String] = js.native
    
    /** Padding on bottom */
    var pb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Padding on left */
    var pl: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    var pointerEvents: js.UndefOr[Double | String] = js.native
    
    var points: js.UndefOr[String] = js.native
    
    var pointsAtX: js.UndefOr[Double | String] = js.native
    
    var pointsAtY: js.UndefOr[Double | String] = js.native
    
    var pointsAtZ: js.UndefOr[Double | String] = js.native
    
    /** Padding on right */
    var pr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    var preserveAlpha: js.UndefOr[Booleanish] = js.native
    
    var preserveAspectRatio: js.UndefOr[String] = js.native
    
    var primitiveUnits: js.UndefOr[Double | String] = js.native
    
    /** Padding on top */
    var pt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Padding on left and right */
    var px: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Padding on top and bottom */
    var py: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    var r: js.UndefOr[Double | String] = js.native
    
    var radius: js.UndefOr[Double | String] = js.native
    
    var ref: js.UndefOr[LegacyRef[SVGSVGElement]] = js.native
    
    var refX: js.UndefOr[Double | String] = js.native
    
    var refY: js.UndefOr[Double | String] = js.native
    
    var renderingIntent: js.UndefOr[Double | String] = js.native
    
    var repeatCount: js.UndefOr[Double | String] = js.native
    
    var repeatDur: js.UndefOr[Double | String] = js.native
    
    var requiredExtensions: js.UndefOr[Double | String] = js.native
    
    var requiredFeatures: js.UndefOr[Double | String] = js.native
    
    var restart: js.UndefOr[Double | String] = js.native
    
    var result: js.UndefOr[String] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var rotate: js.UndefOr[Double | String] = js.native
    
    var rx: js.UndefOr[Double | String] = js.native
    
    var ry: js.UndefOr[Double | String] = js.native
    
    var scale: js.UndefOr[Double | String] = js.native
    
    var seed: js.UndefOr[Double | String] = js.native
    
    var shapeRendering: js.UndefOr[Double | String] = js.native
    
    var size: js.UndefOr[String | Double] = js.native
    
    var slope: js.UndefOr[Double | String] = js.native
    
    var spacing: js.UndefOr[Double | String] = js.native
    
    var specularConstant: js.UndefOr[Double | String] = js.native
    
    var specularExponent: js.UndefOr[Double | String] = js.native
    
    var speed: js.UndefOr[Double | String] = js.native
    
    var spreadMethod: js.UndefOr[String] = js.native
    
    var startOffset: js.UndefOr[Double | String] = js.native
    
    var stdDeviation: js.UndefOr[Double | String] = js.native
    
    var stemh: js.UndefOr[Double | String] = js.native
    
    var stemv: js.UndefOr[Double | String] = js.native
    
    var stitchTiles: js.UndefOr[Double | String] = js.native
    
    var stopColor: js.UndefOr[String] = js.native
    
    var stopOpacity: js.UndefOr[Double | String] = js.native
    
    var strikethroughPosition: js.UndefOr[Double | String] = js.native
    
    var strikethroughThickness: js.UndefOr[Double | String] = js.native
    
    var string: js.UndefOr[Double | String] = js.native
    
    var stroke: js.UndefOr[String] = js.native
    
    var strokeDasharray: js.UndefOr[String | Double] = js.native
    
    var strokeDashoffset: js.UndefOr[String | Double] = js.native
    
    var strokeLinecap: js.UndefOr[butt | round | square | inherit] = js.native
    
    var strokeLinejoin: js.UndefOr[miter | round | bevel | inherit] = js.native
    
    var strokeMiterlimit: js.UndefOr[Double | String] = js.native
    
    var strokeOpacity: js.UndefOr[Double | String] = js.native
    
    var strokeWidth: js.UndefOr[Double | String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var surfaceScale: js.UndefOr[Double | String] = js.native
    
    var sx: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SxStyleProp */ js.Any
      ] = js.native
    
    var systemLanguage: js.UndefOr[Double | String] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var tableValues: js.UndefOr[Double | String] = js.native
    
    var target: js.UndefOr[String] = js.native
    
    var targetX: js.UndefOr[Double | String] = js.native
    
    var targetY: js.UndefOr[Double | String] = js.native
    
    var textAnchor: js.UndefOr[String] = js.native
    
    var textDecoration: js.UndefOr[Double | String] = js.native
    
    var textLength: js.UndefOr[Double | String] = js.native
    
    var textRendering: js.UndefOr[Double | String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var to: js.UndefOr[Double | String] = js.native
    
    var transform: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var u1: js.UndefOr[Double | String] = js.native
    
    var u2: js.UndefOr[Double | String] = js.native
    
    var underlinePosition: js.UndefOr[Double | String] = js.native
    
    var underlineThickness: js.UndefOr[Double | String] = js.native
    
    var unicode: js.UndefOr[Double | String] = js.native
    
    var unicodeBidi: js.UndefOr[Double | String] = js.native
    
    var unicodeRange: js.UndefOr[Double | String] = js.native
    
    var unitsPerEm: js.UndefOr[Double | String] = js.native
    
    var vAlphabetic: js.UndefOr[Double | String] = js.native
    
    var vHanging: js.UndefOr[Double | String] = js.native
    
    var vIdeographic: js.UndefOr[Double | String] = js.native
    
    var vMathematical: js.UndefOr[Double | String] = js.native
    
    var value: Double = js.native
    
    var values: js.UndefOr[String] = js.native
    
    var variant: js.UndefOr[String] = js.native
    
    var vectorEffect: js.UndefOr[Double | String] = js.native
    
    var version: js.UndefOr[String] = js.native
    
    var vertAdvY: js.UndefOr[Double | String] = js.native
    
    var vertOriginX: js.UndefOr[Double | String] = js.native
    
    var vertOriginY: js.UndefOr[Double | String] = js.native
    
    var viewBox: js.UndefOr[String] = js.native
    
    var viewTarget: js.UndefOr[Double | String] = js.native
    
    var visibility: js.UndefOr[Double | String] = js.native
    
    var width: js.UndefOr[Double | String] = js.native
    
    var widths: js.UndefOr[Double | String] = js.native
    
    var wordSpacing: js.UndefOr[Double | String] = js.native
    
    var writingMode: js.UndefOr[Double | String] = js.native
    
    var x: js.UndefOr[Double | String] = js.native
    
    var x1: js.UndefOr[Double | String] = js.native
    
    var x2: js.UndefOr[Double | String] = js.native
    
    var xChannelSelector: js.UndefOr[String] = js.native
    
    var xHeight: js.UndefOr[Double | String] = js.native
    
    var xlinkActuate: js.UndefOr[String] = js.native
    
    var xlinkArcrole: js.UndefOr[String] = js.native
    
    var xlinkHref: js.UndefOr[String] = js.native
    
    var xlinkRole: js.UndefOr[String] = js.native
    
    var xlinkShow: js.UndefOr[String] = js.native
    
    var xlinkTitle: js.UndefOr[String] = js.native
    
    var xlinkType: js.UndefOr[String] = js.native
    
    var xmlBase: js.UndefOr[String] = js.native
    
    var xmlLang: js.UndefOr[String] = js.native
    
    var xmlSpace: js.UndefOr[String] = js.native
    
    var xmlns: js.UndefOr[String] = js.native
    
    var xmlnsXlink: js.UndefOr[String] = js.native
    
    var y: js.UndefOr[Double | String] = js.native
    
    var y1: js.UndefOr[Double | String] = js.native
    
    var y2: js.UndefOr[Double | String] = js.native
    
    var yChannelSelector: js.UndefOr[String] = js.native
    
    var z: js.UndefOr[Double | String] = js.native
    
    var zoomAndPan: js.UndefOr[String] = js.native
  }
  object DonutProps {
    
    @scala.inline
    def apply(value: Double): DonutProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DonutProps]
    }
    
    @scala.inline
    implicit class DonutPropsMutableBuilder[Self <: DonutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccentHeight(value: Double | String): Self = StObject.set(x, "accentHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccentHeightUndefined: Self = StObject.set(x, "accentHeight", js.undefined)
      
      @scala.inline
      def setAccumulate(value: none | sum): Self = StObject.set(x, "accumulate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccumulateUndefined: Self = StObject.set(x, "accumulate", js.undefined)
      
      @scala.inline
      def setAdditive(value: replace | sum): Self = StObject.set(x, "additive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditiveUndefined: Self = StObject.set(x, "additive", js.undefined)
      
      @scala.inline
      def setAlignmentBaseline(
        value: auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
      ): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
      
      @scala.inline
      def setAllowReorder(value: no | yes): Self = StObject.set(x, "allowReorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowReorderUndefined: Self = StObject.set(x, "allowReorder", js.undefined)
      
      @scala.inline
      def setAlphabetic(value: Double | String): Self = StObject.set(x, "alphabetic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphabeticUndefined: Self = StObject.set(x, "alphabetic", js.undefined)
      
      @scala.inline
      def setAmplitude(value: Double | String): Self = StObject.set(x, "amplitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmplitudeUndefined: Self = StObject.set(x, "amplitude", js.undefined)
      
      @scala.inline
      def setArabicForm(value: initial | medial | terminal | isolated): Self = StObject.set(x, "arabicForm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArabicFormUndefined: Self = StObject.set(x, "arabicForm", js.undefined)
      
      @scala.inline
      def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      @scala.inline
      def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      @scala.inline
      def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      @scala.inline
      def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      @scala.inline
      def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      @scala.inline
      def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      @scala.inline
      def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      @scala.inline
      def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      @scala.inline
      def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      @scala.inline
      def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      @scala.inline
      def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      @scala.inline
      def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      @scala.inline
      def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      @scala.inline
      def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      @scala.inline
      def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      @scala.inline
      def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      @scala.inline
      def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      @scala.inline
      def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      @scala.inline
      def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      @scala.inline
      def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      @scala.inline
      def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      @scala.inline
      def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      @scala.inline
      def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      @scala.inline
      def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      @scala.inline
      def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      @scala.inline
      def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      @scala.inline
      def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      @scala.inline
      def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      @scala.inline
      def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      @scala.inline
      def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      @scala.inline
      def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      @scala.inline
      def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      @scala.inline
      def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      @scala.inline
      def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      @scala.inline
      def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      @scala.inline
      def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      @scala.inline
      def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      @scala.inline
      def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      @scala.inline
      def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      @scala.inline
      def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      @scala.inline
      def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      @scala.inline
      def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      @scala.inline
      def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      @scala.inline
      def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      @scala.inline
      def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      @scala.inline
      def setAs(value: ElementType[_]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAscent(value: Double | String): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAscentUndefined: Self = StObject.set(x, "ascent", js.undefined)
      
      @scala.inline
      def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
      
      @scala.inline
      def setAttributeType(value: String): Self = StObject.set(x, "attributeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeTypeUndefined: Self = StObject.set(x, "attributeType", js.undefined)
      
      @scala.inline
      def setAutoReverse(value: Booleanish): Self = StObject.set(x, "autoReverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoReverseUndefined: Self = StObject.set(x, "autoReverse", js.undefined)
      
      @scala.inline
      def setAzimuth(value: Double | String): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAzimuthUndefined: Self = StObject.set(x, "azimuth", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBackgroundColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
      
      @scala.inline
      def setBaseFrequency(value: Double | String): Self = StObject.set(x, "baseFrequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseFrequencyUndefined: Self = StObject.set(x, "baseFrequency", js.undefined)
      
      @scala.inline
      def setBaseProfile(value: Double | String): Self = StObject.set(x, "baseProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseProfileUndefined: Self = StObject.set(x, "baseProfile", js.undefined)
      
      @scala.inline
      def setBaselineShift(value: Double | String): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
      
      @scala.inline
      def setBbox(value: Double | String): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      @scala.inline
      def setBegin(value: Double | String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
      
      @scala.inline
      def setBg(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgNull: Self = StObject.set(x, "bg", null)
      
      @scala.inline
      def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      @scala.inline
      def setBgVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "bg", js.Array(value :_*))
      
      @scala.inline
      def setBias(value: Double | String): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      @scala.inline
      def setBy(value: Double | String): Self = StObject.set(x, "by", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByUndefined: Self = StObject.set(x, "by", js.undefined)
      
      @scala.inline
      def setCalcMode(value: Double | String): Self = StObject.set(x, "calcMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalcModeUndefined: Self = StObject.set(x, "calcMode", js.undefined)
      
      @scala.inline
      def setCapHeight(value: Double | String): Self = StObject.set(x, "capHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapHeightUndefined: Self = StObject.set(x, "capHeight", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClip(value: Double | String): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
      
      @scala.inline
      def setClipPathUnits(value: Double | String): Self = StObject.set(x, "clipPathUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipPathUnitsUndefined: Self = StObject.set(x, "clipPathUnits", js.undefined)
      
      @scala.inline
      def setClipRule(value: Double | String): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
      
      @scala.inline
      def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      @scala.inline
      def setColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorInterpolation(value: Double | String): Self = StObject.set(x, "colorInterpolation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorInterpolationFilters(value: auto | sRGB | linearRGB | inherit): Self = StObject.set(x, "colorInterpolationFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorInterpolationFiltersUndefined: Self = StObject.set(x, "colorInterpolationFilters", js.undefined)
      
      @scala.inline
      def setColorInterpolationUndefined: Self = StObject.set(x, "colorInterpolation", js.undefined)
      
      @scala.inline
      def setColorNull: Self = StObject.set(x, "color", null)
      
      @scala.inline
      def setColorProfile(value: Double | String): Self = StObject.set(x, "colorProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorProfileUndefined: Self = StObject.set(x, "colorProfile", js.undefined)
      
      @scala.inline
      def setColorRendering(value: Double | String): Self = StObject.set(x, "colorRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorRenderingUndefined: Self = StObject.set(x, "colorRendering", js.undefined)
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      @scala.inline
      def setContentScriptType(value: Double | String): Self = StObject.set(x, "contentScriptType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentScriptTypeUndefined: Self = StObject.set(x, "contentScriptType", js.undefined)
      
      @scala.inline
      def setContentStyleType(value: Double | String): Self = StObject.set(x, "contentStyleType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentStyleTypeUndefined: Self = StObject.set(x, "contentStyleType", js.undefined)
      
      @scala.inline
      def setCrossOrigin(value: anonymous | `use-credentials` | _empty): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      @scala.inline
      def setCss(value: InterpolationWithTheme[_]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssFunction1(value: _ => Interpolation[js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "css", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCssNull: Self = StObject.set(x, "css", null)
      
      @scala.inline
      def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      @scala.inline
      def setCursor(value: Double | String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      @scala.inline
      def setCx(value: Double | String): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
      
      @scala.inline
      def setCy(value: Double | String): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
      
      @scala.inline
      def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      @scala.inline
      def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      @scala.inline
      def setDecelerate(value: Double | String): Self = StObject.set(x, "decelerate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecelerateUndefined: Self = StObject.set(x, "decelerate", js.undefined)
      
      @scala.inline
      def setDescent(value: Double | String): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescentUndefined: Self = StObject.set(x, "descent", js.undefined)
      
      @scala.inline
      def setDiffuseConstant(value: Double | String): Self = StObject.set(x, "diffuseConstant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiffuseConstantUndefined: Self = StObject.set(x, "diffuseConstant", js.undefined)
      
      @scala.inline
      def setDirection(value: Double | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisplay(value: Double | String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setDivisor(value: Double | String): Self = StObject.set(x, "divisor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivisorUndefined: Self = StObject.set(x, "divisor", js.undefined)
      
      @scala.inline
      def setDominantBaseline(value: Double | String): Self = StObject.set(x, "dominantBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDominantBaselineUndefined: Self = StObject.set(x, "dominantBaseline", js.undefined)
      
      @scala.inline
      def setDur(value: Double | String): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurUndefined: Self = StObject.set(x, "dur", js.undefined)
      
      @scala.inline
      def setDx(value: Double | String): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      @scala.inline
      def setDy(value: Double | String): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      @scala.inline
      def setEdgeMode(value: Double | String): Self = StObject.set(x, "edgeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeModeUndefined: Self = StObject.set(x, "edgeMode", js.undefined)
      
      @scala.inline
      def setElevation(value: Double | String): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
      
      @scala.inline
      def setEnableBackground(value: Double | String): Self = StObject.set(x, "enableBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableBackgroundUndefined: Self = StObject.set(x, "enableBackground", js.undefined)
      
      @scala.inline
      def setEnd(value: Double | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setExponent(value: Double | String): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
      
      @scala.inline
      def setExternalResourcesRequired(value: Booleanish): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalResourcesRequiredUndefined: Self = StObject.set(x, "externalResourcesRequired", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacity(value: Double | String): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFillRule(value: nonzero | evenodd | inherit): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterRes(value: Double | String): Self = StObject.set(x, "filterRes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterResUndefined: Self = StObject.set(x, "filterRes", js.undefined)
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFilterUnits(value: Double | String): Self = StObject.set(x, "filterUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUnitsUndefined: Self = StObject.set(x, "filterUnits", js.undefined)
      
      @scala.inline
      def setFloodColor(value: Double | String): Self = StObject.set(x, "floodColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloodColorUndefined: Self = StObject.set(x, "floodColor", js.undefined)
      
      @scala.inline
      def setFloodOpacity(value: Double | String): Self = StObject.set(x, "floodOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloodOpacityUndefined: Self = StObject.set(x, "floodOpacity", js.undefined)
      
      @scala.inline
      def setFocusable(value: Booleanish | auto): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeAdjust(value: Double | String): Self = StObject.set(x, "fontSizeAdjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeAdjustUndefined: Self = StObject.set(x, "fontSizeAdjust", js.undefined)
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontStretch(value: Double | String): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
      
      @scala.inline
      def setFontStyle(value: Double | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontVariant(value: Double | String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      @scala.inline
      def setFontWeight(value: Double | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setFormat(value: Double | String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setFrom(value: Double | String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setFx(value: Double | String): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFxUndefined: Self = StObject.set(x, "fx", js.undefined)
      
      @scala.inline
      def setFy(value: Double | String): Self = StObject.set(x, "fy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFyUndefined: Self = StObject.set(x, "fy", js.undefined)
      
      @scala.inline
      def setG1(value: Double | String): Self = StObject.set(x, "g1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG1Undefined: Self = StObject.set(x, "g1", js.undefined)
      
      @scala.inline
      def setG2(value: Double | String): Self = StObject.set(x, "g2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG2Undefined: Self = StObject.set(x, "g2", js.undefined)
      
      @scala.inline
      def setGlyphName(value: Double | String): Self = StObject.set(x, "glyphName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphNameUndefined: Self = StObject.set(x, "glyphName", js.undefined)
      
      @scala.inline
      def setGlyphOrientationHorizontal(value: Double | String): Self = StObject.set(x, "glyphOrientationHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphOrientationHorizontalUndefined: Self = StObject.set(x, "glyphOrientationHorizontal", js.undefined)
      
      @scala.inline
      def setGlyphOrientationVertical(value: Double | String): Self = StObject.set(x, "glyphOrientationVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphOrientationVerticalUndefined: Self = StObject.set(x, "glyphOrientationVertical", js.undefined)
      
      @scala.inline
      def setGlyphRef(value: Double | String): Self = StObject.set(x, "glyphRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphRefUndefined: Self = StObject.set(x, "glyphRef", js.undefined)
      
      @scala.inline
      def setGradientTransform(value: String): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientTransformUndefined: Self = StObject.set(x, "gradientTransform", js.undefined)
      
      @scala.inline
      def setGradientUnits(value: String): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientUnitsUndefined: Self = StObject.set(x, "gradientUnits", js.undefined)
      
      @scala.inline
      def setHanging(value: Double | String): Self = StObject.set(x, "hanging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHangingUndefined: Self = StObject.set(x, "hanging", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHorizAdvX(value: Double | String): Self = StObject.set(x, "horizAdvX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizAdvXUndefined: Self = StObject.set(x, "horizAdvX", js.undefined)
      
      @scala.inline
      def setHorizOriginX(value: Double | String): Self = StObject.set(x, "horizOriginX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizOriginXUndefined: Self = StObject.set(x, "horizOriginX", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIdeographic(value: Double | String): Self = StObject.set(x, "ideographic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdeographicUndefined: Self = StObject.set(x, "ideographic", js.undefined)
      
      @scala.inline
      def setImageRendering(value: Double | String): Self = StObject.set(x, "imageRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageRenderingUndefined: Self = StObject.set(x, "imageRendering", js.undefined)
      
      @scala.inline
      def setIn(value: String): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIn2(value: Double | String): Self = StObject.set(x, "in2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIn2Undefined: Self = StObject.set(x, "in2", js.undefined)
      
      @scala.inline
      def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      @scala.inline
      def setIntercept(value: Double | String): Self = StObject.set(x, "intercept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterceptUndefined: Self = StObject.set(x, "intercept", js.undefined)
      
      @scala.inline
      def setK(value: Double | String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK1(value: Double | String): Self = StObject.set(x, "k1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK1Undefined: Self = StObject.set(x, "k1", js.undefined)
      
      @scala.inline
      def setK2(value: Double | String): Self = StObject.set(x, "k2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK2Undefined: Self = StObject.set(x, "k2", js.undefined)
      
      @scala.inline
      def setK3(value: Double | String): Self = StObject.set(x, "k3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK3Undefined: Self = StObject.set(x, "k3", js.undefined)
      
      @scala.inline
      def setK4(value: Double | String): Self = StObject.set(x, "k4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK4Undefined: Self = StObject.set(x, "k4", js.undefined)
      
      @scala.inline
      def setKUndefined: Self = StObject.set(x, "k", js.undefined)
      
      @scala.inline
      def setKernelMatrix(value: Double | String): Self = StObject.set(x, "kernelMatrix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelMatrixUndefined: Self = StObject.set(x, "kernelMatrix", js.undefined)
      
      @scala.inline
      def setKernelUnitLength(value: Double | String): Self = StObject.set(x, "kernelUnitLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelUnitLengthUndefined: Self = StObject.set(x, "kernelUnitLength", js.undefined)
      
      @scala.inline
      def setKerning(value: Double | String): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNull: Self = StObject.set(x, "key", null)
      
      @scala.inline
      def setKeyPoints(value: Double | String): Self = StObject.set(x, "keyPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPointsUndefined: Self = StObject.set(x, "keyPoints", js.undefined)
      
      @scala.inline
      def setKeySplines(value: Double | String): Self = StObject.set(x, "keySplines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySplinesUndefined: Self = StObject.set(x, "keySplines", js.undefined)
      
      @scala.inline
      def setKeyTimes(value: Double | String): Self = StObject.set(x, "keyTimes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyTimesUndefined: Self = StObject.set(x, "keyTimes", js.undefined)
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setLengthAdjust(value: Double | String): Self = StObject.set(x, "lengthAdjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthAdjustUndefined: Self = StObject.set(x, "lengthAdjust", js.undefined)
      
      @scala.inline
      def setLetterSpacing(value: Double | String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      @scala.inline
      def setLightingColor(value: Double | String): Self = StObject.set(x, "lightingColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightingColorUndefined: Self = StObject.set(x, "lightingColor", js.undefined)
      
      @scala.inline
      def setLimitingConeAngle(value: Double | String): Self = StObject.set(x, "limitingConeAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitingConeAngleUndefined: Self = StObject.set(x, "limitingConeAngle", js.undefined)
      
      @scala.inline
      def setLocal(value: Double | String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
      
      @scala.inline
      def setM(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMNull: Self = StObject.set(x, "m", null)
      
      @scala.inline
      def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      @scala.inline
      def setMVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "m", js.Array(value :_*))
      
      @scala.inline
      def setMargin(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottomNull: Self = StObject.set(x, "marginBottom", null)
      
      @scala.inline
      def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      @scala.inline
      def setMarginBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginBottom", js.Array(value :_*))
      
      @scala.inline
      def setMarginLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginLeftNull: Self = StObject.set(x, "marginLeft", null)
      
      @scala.inline
      def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      @scala.inline
      def setMarginLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginLeft", js.Array(value :_*))
      
      @scala.inline
      def setMarginNull: Self = StObject.set(x, "margin", null)
      
      @scala.inline
      def setMarginRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginRightNull: Self = StObject.set(x, "marginRight", null)
      
      @scala.inline
      def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      @scala.inline
      def setMarginRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginRight", js.Array(value :_*))
      
      @scala.inline
      def setMarginTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginTopNull: Self = StObject.set(x, "marginTop", null)
      
      @scala.inline
      def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      @scala.inline
      def setMarginTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginTop", js.Array(value :_*))
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarginVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "margin", js.Array(value :_*))
      
      @scala.inline
      def setMarginX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "marginX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginXNull: Self = StObject.set(x, "marginX", null)
      
      @scala.inline
      def setMarginXUndefined: Self = StObject.set(x, "marginX", js.undefined)
      
      @scala.inline
      def setMarginXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginX", js.Array(value :_*))
      
      @scala.inline
      def setMarginY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "marginY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginYNull: Self = StObject.set(x, "marginY", null)
      
      @scala.inline
      def setMarginYUndefined: Self = StObject.set(x, "marginY", js.undefined)
      
      @scala.inline
      def setMarginYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginY", js.Array(value :_*))
      
      @scala.inline
      def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      @scala.inline
      def setMarkerHeight(value: Double | String): Self = StObject.set(x, "markerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerHeightUndefined: Self = StObject.set(x, "markerHeight", js.undefined)
      
      @scala.inline
      def setMarkerMid(value: String): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      @scala.inline
      def setMarkerStart(value: String): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      @scala.inline
      def setMarkerUnits(value: Double | String): Self = StObject.set(x, "markerUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerUnitsUndefined: Self = StObject.set(x, "markerUnits", js.undefined)
      
      @scala.inline
      def setMarkerWidth(value: Double | String): Self = StObject.set(x, "markerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerWidthUndefined: Self = StObject.set(x, "markerWidth", js.undefined)
      
      @scala.inline
      def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskContentUnits(value: Double | String): Self = StObject.set(x, "maskContentUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskContentUnitsUndefined: Self = StObject.set(x, "maskContentUnits", js.undefined)
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setMaskUnits(value: Double | String): Self = StObject.set(x, "maskUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUnitsUndefined: Self = StObject.set(x, "maskUnits", js.undefined)
      
      @scala.inline
      def setMathematical(value: Double | String): Self = StObject.set(x, "mathematical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMathematicalUndefined: Self = StObject.set(x, "mathematical", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMbNull: Self = StObject.set(x, "mb", null)
      
      @scala.inline
      def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
      
      @scala.inline
      def setMbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mb", js.Array(value :_*))
      
      @scala.inline
      def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setMl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMlNull: Self = StObject.set(x, "ml", null)
      
      @scala.inline
      def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
      
      @scala.inline
      def setMlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "ml", js.Array(value :_*))
      
      @scala.inline
      def setMode(value: Double | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMrNull: Self = StObject.set(x, "mr", null)
      
      @scala.inline
      def setMrUndefined: Self = StObject.set(x, "mr", js.undefined)
      
      @scala.inline
      def setMrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mr", js.Array(value :_*))
      
      @scala.inline
      def setMt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtNull: Self = StObject.set(x, "mt", null)
      
      @scala.inline
      def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
      
      @scala.inline
      def setMtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mt", js.Array(value :_*))
      
      @scala.inline
      def setMx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "mx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMxNull: Self = StObject.set(x, "mx", null)
      
      @scala.inline
      def setMxUndefined: Self = StObject.set(x, "mx", js.undefined)
      
      @scala.inline
      def setMxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mx", js.Array(value :_*))
      
      @scala.inline
      def setMy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMyNull: Self = StObject.set(x, "my", null)
      
      @scala.inline
      def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
      
      @scala.inline
      def setMyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "my", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNumOctaves(value: Double | String): Self = StObject.set(x, "numOctaves", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumOctavesUndefined: Self = StObject.set(x, "numOctaves", js.undefined)
      
      @scala.inline
      def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOnAbort(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: AnimationEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setOnAnimationIteration(value: AnimationEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      @scala.inline
      def setOnAnimationStart(value: AnimationEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      @scala.inline
      def setOnAuxClick(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      @scala.inline
      def setOnBeforeInput(value: FormEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      @scala.inline
      def setOnBlur(value: FocusEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCanPlay(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThrough(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      @scala.inline
      def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      @scala.inline
      def setOnChange(value: FormEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnCompositionEnd(value: CompositionEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      @scala.inline
      def setOnCompositionStart(value: CompositionEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      @scala.inline
      def setOnCompositionUpdate(value: CompositionEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnCopy(value: ClipboardEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setOnCut(value: ClipboardEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnDrag(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnd(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragExit(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnDrop(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnDurationChange(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      @scala.inline
      def setOnEmptied(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      @scala.inline
      def setOnEncrypted(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      @scala.inline
      def setOnEnded(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      @scala.inline
      def setOnError(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnFocus(value: FocusEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInput(value: FormEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setOnInvalid(value: FormEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: KeyboardEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: KeyboardEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnLoad(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStart(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnLoadedData(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      @scala.inline
      def setOnLoadedMetadata(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnMouseOut(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      @scala.inline
      def setOnMouseOver(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnPaste(value: ClipboardEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnPause(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      @scala.inline
      def setOnPlay(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      @scala.inline
      def setOnPlaying(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      @scala.inline
      def setOnPointerCancel(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      @scala.inline
      def setOnPointerDown(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      @scala.inline
      def setOnPointerEnter(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      @scala.inline
      def setOnPointerLeave(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      @scala.inline
      def setOnPointerMove(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      @scala.inline
      def setOnPointerOut(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      @scala.inline
      def setOnPointerOver(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      @scala.inline
      def setOnPointerUp(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      @scala.inline
      def setOnProgress(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnRateChange(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      @scala.inline
      def setOnReset(value: FormEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnScroll(value: UIEvent[SVGSVGElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSeeked(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      @scala.inline
      def setOnSeeking(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      @scala.inline
      def setOnSelect(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnStalled(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: FormEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOnSuspend(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      @scala.inline
      def setOnTimeUpdate(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(value: TouchEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: TouchEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: TouchEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: TouchEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnTransitionEnd(value: TransitionEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setOnVolumeChange(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      @scala.inline
      def setOnWaiting(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      @scala.inline
      def setOnWheel(value: WheelEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      @scala.inline
      def setOpacity(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityNull: Self = StObject.set(x, "opacity", null)
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOpacityVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "opacity", js.Array(value :_*))
      
      @scala.inline
      def setOperator(value: Double | String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      @scala.inline
      def setOrder(value: Double | String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setOrient(value: Double | String): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      @scala.inline
      def setOrientation(value: Double | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setOrigin(value: Double | String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setOverflow(value: Double | String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setOverlinePosition(value: Double | String): Self = StObject.set(x, "overlinePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlinePositionUndefined: Self = StObject.set(x, "overlinePosition", js.undefined)
      
      @scala.inline
      def setOverlineThickness(value: Double | String): Self = StObject.set(x, "overlineThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlineThicknessUndefined: Self = StObject.set(x, "overlineThickness", js.undefined)
      
      @scala.inline
      def setP(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPNull: Self = StObject.set(x, "p", null)
      
      @scala.inline
      def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      @scala.inline
      def setPVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "p", js.Array(value :_*))
      
      @scala.inline
      def setPadding(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBottomNull: Self = StObject.set(x, "paddingBottom", null)
      
      @scala.inline
      def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      @scala.inline
      def setPaddingBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingBottom", js.Array(value :_*))
      
      @scala.inline
      def setPaddingLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingLeftNull: Self = StObject.set(x, "paddingLeft", null)
      
      @scala.inline
      def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      @scala.inline
      def setPaddingLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingLeft", js.Array(value :_*))
      
      @scala.inline
      def setPaddingNull: Self = StObject.set(x, "padding", null)
      
      @scala.inline
      def setPaddingRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingRightNull: Self = StObject.set(x, "paddingRight", null)
      
      @scala.inline
      def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      @scala.inline
      def setPaddingRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingRight", js.Array(value :_*))
      
      @scala.inline
      def setPaddingTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingTopNull: Self = StObject.set(x, "paddingTop", null)
      
      @scala.inline
      def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      @scala.inline
      def setPaddingTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingTop", js.Array(value :_*))
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPaddingVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "padding", js.Array(value :_*))
      
      @scala.inline
      def setPaddingX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingXNull: Self = StObject.set(x, "paddingX", null)
      
      @scala.inline
      def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
      
      @scala.inline
      def setPaddingXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingX", js.Array(value :_*))
      
      @scala.inline
      def setPaddingY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingYNull: Self = StObject.set(x, "paddingY", null)
      
      @scala.inline
      def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
      
      @scala.inline
      def setPaddingYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingY", js.Array(value :_*))
      
      @scala.inline
      def setPaintOrder(value: Double | String): Self = StObject.set(x, "paintOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaintOrderUndefined: Self = StObject.set(x, "paintOrder", js.undefined)
      
      @scala.inline
      def setPanose1(value: Double | String): Self = StObject.set(x, "panose1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanose1Undefined: Self = StObject.set(x, "panose1", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathLength(value: Double | String): Self = StObject.set(x, "pathLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathLengthUndefined: Self = StObject.set(x, "pathLength", js.undefined)
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPatternContentUnits(value: String): Self = StObject.set(x, "patternContentUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternContentUnitsUndefined: Self = StObject.set(x, "patternContentUnits", js.undefined)
      
      @scala.inline
      def setPatternTransform(value: Double | String): Self = StObject.set(x, "patternTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternTransformUndefined: Self = StObject.set(x, "patternTransform", js.undefined)
      
      @scala.inline
      def setPatternUnits(value: String): Self = StObject.set(x, "patternUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUnitsUndefined: Self = StObject.set(x, "patternUnits", js.undefined)
      
      @scala.inline
      def setPb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "pb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPbNull: Self = StObject.set(x, "pb", null)
      
      @scala.inline
      def setPbUndefined: Self = StObject.set(x, "pb", js.undefined)
      
      @scala.inline
      def setPbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pb", js.Array(value :_*))
      
      @scala.inline
      def setPl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlNull: Self = StObject.set(x, "pl", null)
      
      @scala.inline
      def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
      
      @scala.inline
      def setPlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pl", js.Array(value :_*))
      
      @scala.inline
      def setPointerEvents(value: Double | String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      @scala.inline
      def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsAtX(value: Double | String): Self = StObject.set(x, "pointsAtX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsAtXUndefined: Self = StObject.set(x, "pointsAtX", js.undefined)
      
      @scala.inline
      def setPointsAtY(value: Double | String): Self = StObject.set(x, "pointsAtY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsAtYUndefined: Self = StObject.set(x, "pointsAtY", js.undefined)
      
      @scala.inline
      def setPointsAtZ(value: Double | String): Self = StObject.set(x, "pointsAtZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsAtZUndefined: Self = StObject.set(x, "pointsAtZ", js.undefined)
      
      @scala.inline
      def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      @scala.inline
      def setPr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrNull: Self = StObject.set(x, "pr", null)
      
      @scala.inline
      def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
      
      @scala.inline
      def setPrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pr", js.Array(value :_*))
      
      @scala.inline
      def setPreserveAlpha(value: Booleanish): Self = StObject.set(x, "preserveAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveAlphaUndefined: Self = StObject.set(x, "preserveAlpha", js.undefined)
      
      @scala.inline
      def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      @scala.inline
      def setPrimitiveUnits(value: Double | String): Self = StObject.set(x, "primitiveUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimitiveUnitsUndefined: Self = StObject.set(x, "primitiveUnits", js.undefined)
      
      @scala.inline
      def setPt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPtNull: Self = StObject.set(x, "pt", null)
      
      @scala.inline
      def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
      @scala.inline
      def setPtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pt", js.Array(value :_*))
      
      @scala.inline
      def setPx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPxNull: Self = StObject.set(x, "px", null)
      
      @scala.inline
      def setPxUndefined: Self = StObject.set(x, "px", js.undefined)
      
      @scala.inline
      def setPxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "px", js.Array(value :_*))
      
      @scala.inline
      def setPy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPyNull: Self = StObject.set(x, "py", null)
      
      @scala.inline
      def setPyUndefined: Self = StObject.set(x, "py", js.undefined)
      
      @scala.inline
      def setPyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "py", js.Array(value :_*))
      
      @scala.inline
      def setR(value: Double | String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      @scala.inline
      def setRadius(value: Double | String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setRef(value: LegacyRef[SVGSVGElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ SVGSVGElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setRefX(value: Double | String): Self = StObject.set(x, "refX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefXUndefined: Self = StObject.set(x, "refX", js.undefined)
      
      @scala.inline
      def setRefY(value: Double | String): Self = StObject.set(x, "refY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefYUndefined: Self = StObject.set(x, "refY", js.undefined)
      
      @scala.inline
      def setRenderingIntent(value: Double | String): Self = StObject.set(x, "renderingIntent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderingIntentUndefined: Self = StObject.set(x, "renderingIntent", js.undefined)
      
      @scala.inline
      def setRepeatCount(value: Double | String): Self = StObject.set(x, "repeatCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatCountUndefined: Self = StObject.set(x, "repeatCount", js.undefined)
      
      @scala.inline
      def setRepeatDur(value: Double | String): Self = StObject.set(x, "repeatDur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatDurUndefined: Self = StObject.set(x, "repeatDur", js.undefined)
      
      @scala.inline
      def setRequiredExtensions(value: Double | String): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredExtensionsUndefined: Self = StObject.set(x, "requiredExtensions", js.undefined)
      
      @scala.inline
      def setRequiredFeatures(value: Double | String): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredFeaturesUndefined: Self = StObject.set(x, "requiredFeatures", js.undefined)
      
      @scala.inline
      def setRestart(value: Double | String): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
      
      @scala.inline
      def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setRotate(value: Double | String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setRx(value: Double | String): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      @scala.inline
      def setRy(value: Double | String): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
      
      @scala.inline
      def setScale(value: Double | String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setSeed(value: Double | String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      @scala.inline
      def setShapeRendering(value: Double | String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
      
      @scala.inline
      def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSlope(value: Double | String): Self = StObject.set(x, "slope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlopeUndefined: Self = StObject.set(x, "slope", js.undefined)
      
      @scala.inline
      def setSpacing(value: Double | String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      @scala.inline
      def setSpecularConstant(value: Double | String): Self = StObject.set(x, "specularConstant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecularConstantUndefined: Self = StObject.set(x, "specularConstant", js.undefined)
      
      @scala.inline
      def setSpecularExponent(value: Double | String): Self = StObject.set(x, "specularExponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecularExponentUndefined: Self = StObject.set(x, "specularExponent", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double | String): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      @scala.inline
      def setSpreadMethod(value: String): Self = StObject.set(x, "spreadMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpreadMethodUndefined: Self = StObject.set(x, "spreadMethod", js.undefined)
      
      @scala.inline
      def setStartOffset(value: Double | String): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
      
      @scala.inline
      def setStdDeviation(value: Double | String): Self = StObject.set(x, "stdDeviation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdDeviationUndefined: Self = StObject.set(x, "stdDeviation", js.undefined)
      
      @scala.inline
      def setStemh(value: Double | String): Self = StObject.set(x, "stemh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStemhUndefined: Self = StObject.set(x, "stemh", js.undefined)
      
      @scala.inline
      def setStemv(value: Double | String): Self = StObject.set(x, "stemv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStemvUndefined: Self = StObject.set(x, "stemv", js.undefined)
      
      @scala.inline
      def setStitchTiles(value: Double | String): Self = StObject.set(x, "stitchTiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStitchTilesUndefined: Self = StObject.set(x, "stitchTiles", js.undefined)
      
      @scala.inline
      def setStopColor(value: String): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
      
      @scala.inline
      def setStopOpacity(value: Double | String): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
      
      @scala.inline
      def setStrikethroughPosition(value: Double | String): Self = StObject.set(x, "strikethroughPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrikethroughPositionUndefined: Self = StObject.set(x, "strikethroughPosition", js.undefined)
      
      @scala.inline
      def setStrikethroughThickness(value: Double | String): Self = StObject.set(x, "strikethroughThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrikethroughThicknessUndefined: Self = StObject.set(x, "strikethroughThickness", js.undefined)
      
      @scala.inline
      def setString(value: Double | String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      @scala.inline
      def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDasharray(value: String | Double): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
      
      @scala.inline
      def setStrokeDashoffset(value: String | Double): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
      
      @scala.inline
      def setStrokeLinecap(value: butt | round | square | inherit): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      @scala.inline
      def setStrokeLinejoin(value: miter | round | bevel | inherit): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
      
      @scala.inline
      def setStrokeMiterlimit(value: Double | String): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
      
      @scala.inline
      def setStrokeOpacity(value: Double | String): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: Double | String): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSurfaceScale(value: Double | String): Self = StObject.set(x, "surfaceScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSurfaceScaleUndefined: Self = StObject.set(x, "surfaceScale", js.undefined)
      
      @scala.inline
      def setSx(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SxStyleProp */ js.Any
      ): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      @scala.inline
      def setSystemLanguage(value: Double | String): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemLanguageUndefined: Self = StObject.set(x, "systemLanguage", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTableValues(value: Double | String): Self = StObject.set(x, "tableValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableValuesUndefined: Self = StObject.set(x, "tableValues", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTargetX(value: Double | String): Self = StObject.set(x, "targetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetXUndefined: Self = StObject.set(x, "targetX", js.undefined)
      
      @scala.inline
      def setTargetY(value: Double | String): Self = StObject.set(x, "targetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetYUndefined: Self = StObject.set(x, "targetY", js.undefined)
      
      @scala.inline
      def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
      
      @scala.inline
      def setTextDecoration(value: Double | String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      @scala.inline
      def setTextLength(value: Double | String): Self = StObject.set(x, "textLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextLengthUndefined: Self = StObject.set(x, "textLength", js.undefined)
      
      @scala.inline
      def setTextRendering(value: Double | String): Self = StObject.set(x, "textRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextRenderingUndefined: Self = StObject.set(x, "textRendering", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTo(value: Double | String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setU1(value: Double | String): Self = StObject.set(x, "u1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setU1Undefined: Self = StObject.set(x, "u1", js.undefined)
      
      @scala.inline
      def setU2(value: Double | String): Self = StObject.set(x, "u2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setU2Undefined: Self = StObject.set(x, "u2", js.undefined)
      
      @scala.inline
      def setUnderlinePosition(value: Double | String): Self = StObject.set(x, "underlinePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlinePositionUndefined: Self = StObject.set(x, "underlinePosition", js.undefined)
      
      @scala.inline
      def setUnderlineThickness(value: Double | String): Self = StObject.set(x, "underlineThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineThicknessUndefined: Self = StObject.set(x, "underlineThickness", js.undefined)
      
      @scala.inline
      def setUnicode(value: Double | String): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeBidi(value: Double | String): Self = StObject.set(x, "unicodeBidi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeBidiUndefined: Self = StObject.set(x, "unicodeBidi", js.undefined)
      
      @scala.inline
      def setUnicodeRange(value: Double | String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
      
      @scala.inline
      def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
      
      @scala.inline
      def setUnitsPerEm(value: Double | String): Self = StObject.set(x, "unitsPerEm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitsPerEmUndefined: Self = StObject.set(x, "unitsPerEm", js.undefined)
      
      @scala.inline
      def setVAlphabetic(value: Double | String): Self = StObject.set(x, "vAlphabetic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVAlphabeticUndefined: Self = StObject.set(x, "vAlphabetic", js.undefined)
      
      @scala.inline
      def setVHanging(value: Double | String): Self = StObject.set(x, "vHanging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVHangingUndefined: Self = StObject.set(x, "vHanging", js.undefined)
      
      @scala.inline
      def setVIdeographic(value: Double | String): Self = StObject.set(x, "vIdeographic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVIdeographicUndefined: Self = StObject.set(x, "vIdeographic", js.undefined)
      
      @scala.inline
      def setVMathematical(value: Double | String): Self = StObject.set(x, "vMathematical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVMathematicalUndefined: Self = StObject.set(x, "vMathematical", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: String): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      @scala.inline
      def setVectorEffect(value: Double | String): Self = StObject.set(x, "vectorEffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVectorEffectUndefined: Self = StObject.set(x, "vectorEffect", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setVertAdvY(value: Double | String): Self = StObject.set(x, "vertAdvY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertAdvYUndefined: Self = StObject.set(x, "vertAdvY", js.undefined)
      
      @scala.inline
      def setVertOriginX(value: Double | String): Self = StObject.set(x, "vertOriginX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertOriginXUndefined: Self = StObject.set(x, "vertOriginX", js.undefined)
      
      @scala.inline
      def setVertOriginY(value: Double | String): Self = StObject.set(x, "vertOriginY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertOriginYUndefined: Self = StObject.set(x, "vertOriginY", js.undefined)
      
      @scala.inline
      def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      @scala.inline
      def setViewTarget(value: Double | String): Self = StObject.set(x, "viewTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewTargetUndefined: Self = StObject.set(x, "viewTarget", js.undefined)
      
      @scala.inline
      def setVisibility(value: Double | String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWidths(value: Double | String): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
      
      @scala.inline
      def setWordSpacing(value: Double | String): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
      
      @scala.inline
      def setWritingMode(value: Double | String): Self = StObject.set(x, "writingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritingModeUndefined: Self = StObject.set(x, "writingMode", js.undefined)
      
      @scala.inline
      def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX1(value: Double | String): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
      
      @scala.inline
      def setX2(value: Double | String): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      @scala.inline
      def setXChannelSelector(value: String): Self = StObject.set(x, "xChannelSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXChannelSelectorUndefined: Self = StObject.set(x, "xChannelSelector", js.undefined)
      
      @scala.inline
      def setXHeight(value: Double | String): Self = StObject.set(x, "xHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXHeightUndefined: Self = StObject.set(x, "xHeight", js.undefined)
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setXlinkActuate(value: String): Self = StObject.set(x, "xlinkActuate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkActuateUndefined: Self = StObject.set(x, "xlinkActuate", js.undefined)
      
      @scala.inline
      def setXlinkArcrole(value: String): Self = StObject.set(x, "xlinkArcrole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkArcroleUndefined: Self = StObject.set(x, "xlinkArcrole", js.undefined)
      
      @scala.inline
      def setXlinkHref(value: String): Self = StObject.set(x, "xlinkHref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkHrefUndefined: Self = StObject.set(x, "xlinkHref", js.undefined)
      
      @scala.inline
      def setXlinkRole(value: String): Self = StObject.set(x, "xlinkRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkRoleUndefined: Self = StObject.set(x, "xlinkRole", js.undefined)
      
      @scala.inline
      def setXlinkShow(value: String): Self = StObject.set(x, "xlinkShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkShowUndefined: Self = StObject.set(x, "xlinkShow", js.undefined)
      
      @scala.inline
      def setXlinkTitle(value: String): Self = StObject.set(x, "xlinkTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkTitleUndefined: Self = StObject.set(x, "xlinkTitle", js.undefined)
      
      @scala.inline
      def setXlinkType(value: String): Self = StObject.set(x, "xlinkType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkTypeUndefined: Self = StObject.set(x, "xlinkType", js.undefined)
      
      @scala.inline
      def setXmlBase(value: String): Self = StObject.set(x, "xmlBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlBaseUndefined: Self = StObject.set(x, "xmlBase", js.undefined)
      
      @scala.inline
      def setXmlLang(value: String): Self = StObject.set(x, "xmlLang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlLangUndefined: Self = StObject.set(x, "xmlLang", js.undefined)
      
      @scala.inline
      def setXmlSpace(value: String): Self = StObject.set(x, "xmlSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlSpaceUndefined: Self = StObject.set(x, "xmlSpace", js.undefined)
      
      @scala.inline
      def setXmlns(value: String): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
      
      @scala.inline
      def setXmlnsXlink(value: String): Self = StObject.set(x, "xmlnsXlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlnsXlinkUndefined: Self = StObject.set(x, "xmlnsXlink", js.undefined)
      
      @scala.inline
      def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1(value: Double | String): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
      
      @scala.inline
      def setY2(value: Double | String): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
      
      @scala.inline
      def setYChannelSelector(value: String): Self = StObject.set(x, "yChannelSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYChannelSelectorUndefined: Self = StObject.set(x, "yChannelSelector", js.undefined)
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      @scala.inline
      def setZ(value: Double | String): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZUndefined: Self = StObject.set(x, "z", js.undefined)
      
      @scala.inline
      def setZoomAndPan(value: String): Self = StObject.set(x, "zoomAndPan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomAndPanUndefined: Self = StObject.set(x, "zoomAndPan", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof react.react.ComponentProps<'div'> & @theme-ui/components.@theme-ui/components.BoxOwnProps ]: P extends keyof react.react.ComponentProps<'div'>? react.react.ComponentProps<'div'>[P] : P extends keyof @theme-ui/components.@theme-ui/components.BoxOwnProps? @theme-ui/components.@theme-ui/components.BoxOwnProps[P] : never} */ @js.native
  trait EmbedProps extends StObject {
    
    var allow: js.UndefOr[String] = js.native
    
    var allowFullScreen: js.UndefOr[Boolean] = js.native
    
    var frameBorder: js.UndefOr[Double | String] = js.native
    
    var ratio: js.UndefOr[Double] = js.native
    
    var src: js.UndefOr[String] = js.native
  }
  object EmbedProps {
    
    @scala.inline
    def apply(): EmbedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmbedProps]
    }
    
    @scala.inline
    implicit class EmbedPropsMutableBuilder[Self <: EmbedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllow(value: String): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFullScreen(value: Boolean): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFullScreenUndefined: Self = StObject.set(x, "allowFullScreen", js.undefined)
      
      @scala.inline
      def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
      
      @scala.inline
      def setFrameBorder(value: Double | String): Self = StObject.set(x, "frameBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameBorderUndefined: Self = StObject.set(x, "frameBorder", js.undefined)
      
      @scala.inline
      def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
  
  @js.native
  trait FieldOwnProps extends MarginProps[RequiredTheme] {
    
    /**
      * Text for Label component
      */
    var label: String = js.native
    
    /**
      * Used for the for, id, and name attributes
      */
    var name: String = js.native
  }
  object FieldOwnProps {
    
    @scala.inline
    def apply(label: String, name: String): FieldOwnProps = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldOwnProps]
    }
    
    @scala.inline
    implicit class FieldOwnPropsMutableBuilder[Self <: FieldOwnProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type FieldProps[T /* <: ElementType[_] */] = FieldOwnProps with (Omit[ComponentProps[T], as | label | name]) with As[T]
  
  type FlexProps = BoxProps
  
  type FlexStyleProps = BoxOwnProps
  
  type ForwardRef[T, P] = ForwardRefExoticComponent[PropsWithoutRef[P] with RefAttributes[T]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof react.react.ComponentProps<'div'> & @theme-ui/components.@theme-ui/components.BoxOwnProps ]: P extends keyof react.react.ComponentProps<'div'>? react.react.ComponentProps<'div'>[P] : P extends keyof @theme-ui/components.@theme-ui/components.BoxOwnProps? @theme-ui/components.@theme-ui/components.BoxOwnProps[P] : never} */ @js.native
  trait GridProps extends StObject {
    
    /**
      *     Number of columns to use for the layout (cannot be used in conjunction with the width prop)
      */
    var columns: js.UndefOr[ResponsiveValue[String | Double, RequiredTheme]] = js.native
    
    /**
      * Space between child elements
      */
    var gap: js.UndefOr[ResponsiveValue[String | Double, RequiredTheme]] = js.native
    
    /**
      * Minimum width of child elements
      */
    var width: js.UndefOr[ResponsiveValue[String | Double, RequiredTheme]] = js.native
  }
  object GridProps {
    
    @scala.inline
    def apply(): GridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridProps]
    }
    
    @scala.inline
    implicit class GridPropsMutableBuilder[Self <: GridProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: ResponsiveValue[String | Double, RequiredTheme]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsNull: Self = StObject.set(x, "columns", null)
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: ((String | Double) | Null)*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setGap(value: ResponsiveValue[String | Double, RequiredTheme]): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapNull: Self = StObject.set(x, "gap", null)
      
      @scala.inline
      def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      @scala.inline
      def setGapVarargs(value: ((String | Double) | Null)*): Self = StObject.set(x, "gap", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: ResponsiveValue[String | Double, RequiredTheme]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthNull: Self = StObject.set(x, "width", null)
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWidthVarargs(value: ((String | Double) | Null)*): Self = StObject.set(x, "width", js.Array(value :_*))
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
  @js.native
  trait SpinnerProps extends StObject {
    
    var accentHeight: js.UndefOr[Double | String] = js.native
    
    var accumulate: js.UndefOr[none | sum] = js.native
    
    var additive: js.UndefOr[replace | sum] = js.native
    
    var alignmentBaseline: js.UndefOr[
        auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
      ] = js.native
    
    var allowReorder: js.UndefOr[no | yes] = js.native
    
    var alphabetic: js.UndefOr[Double | String] = js.native
    
    var amplitude: js.UndefOr[Double | String] = js.native
    
    var arabicForm: js.UndefOr[initial | medial | terminal | isolated] = js.native
    
    var `aria-activedescendant`: js.UndefOr[String] = js.native
    
    var `aria-atomic`: js.UndefOr[Boolean] = js.native
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
    
    var `aria-busy`: js.UndefOr[Boolean] = js.native
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-colcount`: js.UndefOr[Double] = js.native
    
    var `aria-colindex`: js.UndefOr[Double] = js.native
    
    var `aria-colspan`: js.UndefOr[Double] = js.native
    
    var `aria-controls`: js.UndefOr[String] = js.native
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
    
    var `aria-describedby`: js.UndefOr[String] = js.native
    
    var `aria-details`: js.UndefOr[String] = js.native
    
    var `aria-disabled`: js.UndefOr[Boolean] = js.native
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
    
    var `aria-errormessage`: js.UndefOr[String] = js.native
    
    var `aria-expanded`: js.UndefOr[Boolean] = js.native
    
    var `aria-flowto`: js.UndefOr[String] = js.native
    
    var `aria-grabbed`: js.UndefOr[Boolean] = js.native
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
    
    var `aria-hidden`: js.UndefOr[Boolean] = js.native
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.native
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    var `aria-level`: js.UndefOr[Double] = js.native
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
    
    var `aria-modal`: js.UndefOr[Boolean] = js.native
    
    var `aria-multiline`: js.UndefOr[Boolean] = js.native
    
    var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
    
    var `aria-owns`: js.UndefOr[String] = js.native
    
    var `aria-placeholder`: js.UndefOr[String] = js.native
    
    var `aria-posinset`: js.UndefOr[Double] = js.native
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-readonly`: js.UndefOr[Boolean] = js.native
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.native
    
    var `aria-required`: js.UndefOr[Boolean] = js.native
    
    var `aria-roledescription`: js.UndefOr[String] = js.native
    
    var `aria-rowcount`: js.UndefOr[Double] = js.native
    
    var `aria-rowindex`: js.UndefOr[Double] = js.native
    
    var `aria-rowspan`: js.UndefOr[Double] = js.native
    
    var `aria-selected`: js.UndefOr[Boolean] = js.native
    
    var `aria-setsize`: js.UndefOr[Double] = js.native
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
    
    var `aria-valuemax`: js.UndefOr[Double] = js.native
    
    var `aria-valuemin`: js.UndefOr[Double] = js.native
    
    var `aria-valuenow`: js.UndefOr[Double] = js.native
    
    var `aria-valuetext`: js.UndefOr[String] = js.native
    
    var as: js.UndefOr[ElementType[_]] = js.native
    
    var ascent: js.UndefOr[Double | String] = js.native
    
    var attributeName: js.UndefOr[String] = js.native
    
    var attributeType: js.UndefOr[String] = js.native
    
    var autoReverse: js.UndefOr[Booleanish] = js.native
    
    var azimuth: js.UndefOr[Double | String] = js.native
    
    var backgroundColor: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]] = js.native
    
    var baseFrequency: js.UndefOr[Double | String] = js.native
    
    var baseProfile: js.UndefOr[Double | String] = js.native
    
    var baselineShift: js.UndefOr[Double | String] = js.native
    
    var bbox: js.UndefOr[Double | String] = js.native
    
    var begin: js.UndefOr[Double | String] = js.native
    
    /**
      * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
      * By default the raw value of the prop is returned.
      *
      * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
      * Array values are converted into responsive values.
      *
      * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-color)
      */
    var bg: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]] = js.native
    
    var bias: js.UndefOr[Double | String] = js.native
    
    var by: js.UndefOr[Double | String] = js.native
    
    var calcMode: js.UndefOr[Double | String] = js.native
    
    var capHeight: js.UndefOr[Double | String] = js.native
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var clip: js.UndefOr[Double | String] = js.native
    
    var clipPath: js.UndefOr[String] = js.native
    
    var clipPathUnits: js.UndefOr[Double | String] = js.native
    
    var clipRule: js.UndefOr[Double | String] = js.native
    
    /**
      * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
      * By default the raw value of the prop is returned.
      *
      * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
      * Array values are converted into responsive values.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/color)
      */
    var color: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]] = js.native
    
    var colorInterpolation: js.UndefOr[Double | String] = js.native
    
    var colorInterpolationFilters: js.UndefOr[auto | sRGB | linearRGB | inherit] = js.native
    
    var colorProfile: js.UndefOr[Double | String] = js.native
    
    var colorRendering: js.UndefOr[Double | String] = js.native
    
    var contentScriptType: js.UndefOr[Double | String] = js.native
    
    var contentStyleType: js.UndefOr[Double | String] = js.native
    
    var crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.native
    
    var css: js.UndefOr[InterpolationWithTheme[_]] = js.native
    
    var cursor: js.UndefOr[Double | String] = js.native
    
    var cx: js.UndefOr[Double | String] = js.native
    
    var cy: js.UndefOr[Double | String] = js.native
    
    var d: js.UndefOr[String] = js.native
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
    
    var decelerate: js.UndefOr[Double | String] = js.native
    
    var descent: js.UndefOr[Double | String] = js.native
    
    var diffuseConstant: js.UndefOr[Double | String] = js.native
    
    var direction: js.UndefOr[Double | String] = js.native
    
    var display: js.UndefOr[Double | String] = js.native
    
    var divisor: js.UndefOr[Double | String] = js.native
    
    var dominantBaseline: js.UndefOr[Double | String] = js.native
    
    var dur: js.UndefOr[Double | String] = js.native
    
    var dx: js.UndefOr[Double | String] = js.native
    
    var dy: js.UndefOr[Double | String] = js.native
    
    var edgeMode: js.UndefOr[Double | String] = js.native
    
    var elevation: js.UndefOr[Double | String] = js.native
    
    var enableBackground: js.UndefOr[Double | String] = js.native
    
    var end: js.UndefOr[Double | String] = js.native
    
    var exponent: js.UndefOr[Double | String] = js.native
    
    var externalResourcesRequired: js.UndefOr[Booleanish] = js.native
    
    var fill: js.UndefOr[String] = js.native
    
    var fillOpacity: js.UndefOr[Double | String] = js.native
    
    var fillRule: js.UndefOr[nonzero | evenodd | inherit] = js.native
    
    var filter: js.UndefOr[String] = js.native
    
    var filterRes: js.UndefOr[Double | String] = js.native
    
    var filterUnits: js.UndefOr[Double | String] = js.native
    
    var floodColor: js.UndefOr[Double | String] = js.native
    
    var floodOpacity: js.UndefOr[Double | String] = js.native
    
    var focusable: js.UndefOr[Booleanish | auto] = js.native
    
    var fontFamily: js.UndefOr[String] = js.native
    
    var fontSize: js.UndefOr[Double | String] = js.native
    
    var fontSizeAdjust: js.UndefOr[Double | String] = js.native
    
    var fontStretch: js.UndefOr[Double | String] = js.native
    
    var fontStyle: js.UndefOr[Double | String] = js.native
    
    var fontVariant: js.UndefOr[Double | String] = js.native
    
    var fontWeight: js.UndefOr[Double | String] = js.native
    
    var format: js.UndefOr[Double | String] = js.native
    
    var from: js.UndefOr[Double | String] = js.native
    
    var fx: js.UndefOr[Double | String] = js.native
    
    var fy: js.UndefOr[Double | String] = js.native
    
    var g1: js.UndefOr[Double | String] = js.native
    
    var g2: js.UndefOr[Double | String] = js.native
    
    var glyphName: js.UndefOr[Double | String] = js.native
    
    var glyphOrientationHorizontal: js.UndefOr[Double | String] = js.native
    
    var glyphOrientationVertical: js.UndefOr[Double | String] = js.native
    
    var glyphRef: js.UndefOr[Double | String] = js.native
    
    var gradientTransform: js.UndefOr[String] = js.native
    
    var gradientUnits: js.UndefOr[String] = js.native
    
    var hanging: js.UndefOr[Double | String] = js.native
    
    var height: js.UndefOr[Double | String] = js.native
    
    var horizAdvX: js.UndefOr[Double | String] = js.native
    
    var horizOriginX: js.UndefOr[Double | String] = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var ideographic: js.UndefOr[Double | String] = js.native
    
    var imageRendering: js.UndefOr[Double | String] = js.native
    
    var in: js.UndefOr[String] = js.native
    
    var in2: js.UndefOr[Double | String] = js.native
    
    var intercept: js.UndefOr[Double | String] = js.native
    
    var k: js.UndefOr[Double | String] = js.native
    
    var k1: js.UndefOr[Double | String] = js.native
    
    var k2: js.UndefOr[Double | String] = js.native
    
    var k3: js.UndefOr[Double | String] = js.native
    
    var k4: js.UndefOr[Double | String] = js.native
    
    var kernelMatrix: js.UndefOr[Double | String] = js.native
    
    var kernelUnitLength: js.UndefOr[Double | String] = js.native
    
    var kerning: js.UndefOr[Double | String] = js.native
    
    var key: js.UndefOr[Key | Null] = js.native
    
    var keyPoints: js.UndefOr[Double | String] = js.native
    
    var keySplines: js.UndefOr[Double | String] = js.native
    
    var keyTimes: js.UndefOr[Double | String] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var lengthAdjust: js.UndefOr[Double | String] = js.native
    
    var letterSpacing: js.UndefOr[Double | String] = js.native
    
    var lightingColor: js.UndefOr[Double | String] = js.native
    
    var limitingConeAngle: js.UndefOr[Double | String] = js.native
    
    var local: js.UndefOr[Double | String] = js.native
    
    /** Margin on top, left, bottom and right */
    var m: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Margin on top, left, bottom and right */
    var margin: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Margin on bottom */
    var marginBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Margin on left */
    var marginLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Margin on right */
    var marginRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Margin on top */
    var marginTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Margin on left and right */
    var marginX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Margin on top and bottom */
    var marginY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    var markerEnd: js.UndefOr[String] = js.native
    
    var markerHeight: js.UndefOr[Double | String] = js.native
    
    var markerMid: js.UndefOr[String] = js.native
    
    var markerStart: js.UndefOr[String] = js.native
    
    var markerUnits: js.UndefOr[Double | String] = js.native
    
    var markerWidth: js.UndefOr[Double | String] = js.native
    
    var mask: js.UndefOr[String] = js.native
    
    var maskContentUnits: js.UndefOr[Double | String] = js.native
    
    var maskUnits: js.UndefOr[Double | String] = js.native
    
    var mathematical: js.UndefOr[Double | String] = js.native
    
    var max: js.UndefOr[Double | String] = js.native
    
    /** Margin on bottom */
    var mb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    var media: js.UndefOr[String] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var min: js.UndefOr[Double | String] = js.native
    
    /** Margin on left */
    var ml: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    var mode: js.UndefOr[Double | String] = js.native
    
    /** Margin on right */
    var mr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Margin on top */
    var mt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Margin on left and right */
    var mx: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Margin on top and bottom */
    var my: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var numOctaves: js.UndefOr[Double | String] = js.native
    
    var offset: js.UndefOr[Double | String] = js.native
    
    var onAbort: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.native
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.native
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.native
    
    var onAuxClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
    
    var onBeforeInput: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[SVGSVGElement]] = js.native
    
    var onCanPlay: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onChange: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.native
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.native
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
    
    var onCopy: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.native
    
    var onCut: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.native
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
    
    var onDrag: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
    
    var onDragEnd: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
    
    var onDragEnter: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
    
    var onDragExit: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
    
    var onDragLeave: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
    
    var onDragOver: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
    
    var onDragStart: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
    
    var onDrop: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
    
    var onDurationChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onEmptied: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onEncrypted: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onEnded: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onError: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[SVGSVGElement]] = js.native
    
    var onInput: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.native
    
    var onInvalid: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.native
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.native
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.native
    
    var onLoad: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onLoadStart: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onLoadedData: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
    
    var onMouseMove: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
    
    var onMouseOut: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
    
    var onMouseOver: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
    
    var onPaste: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.native
    
    var onPause: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onPlay: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onPlaying: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
    
    var onPointerDown: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
    
    var onPointerMove: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
    
    var onPointerOut: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
    
    var onPointerOver: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
    
    var onPointerUp: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
    
    var onProgress: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onRateChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onReset: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.native
    
    var onScroll: js.UndefOr[UIEventHandler[SVGSVGElement]] = js.native
    
    var onSeeked: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onSeeking: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onSelect: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onStalled: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onSubmit: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.native
    
    var onSuspend: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.native
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.native
    
    var onTouchMove: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.native
    
    var onTouchStart: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.native
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[SVGSVGElement]] = js.native
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onWaiting: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
    
    var onWheel: js.UndefOr[WheelEventHandler[SVGSVGElement]] = js.native
    
    /**
      * The opacity CSS property sets the transparency of an element or the degree to which content
      * behind an element is visible.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/opacity)
      */
    var opacity: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ _, 
          RequiredTheme
        ]
      ] = js.native
    
    var operator: js.UndefOr[Double | String] = js.native
    
    var order: js.UndefOr[Double | String] = js.native
    
    var orient: js.UndefOr[Double | String] = js.native
    
    var orientation: js.UndefOr[Double | String] = js.native
    
    var origin: js.UndefOr[Double | String] = js.native
    
    var overflow: js.UndefOr[Double | String] = js.native
    
    var overlinePosition: js.UndefOr[Double | String] = js.native
    
    var overlineThickness: js.UndefOr[Double | String] = js.native
    
    /** Padding on top, left, bottom and right */
    var p: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Padding on top, left, bottom and right */
    var padding: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Padding on bottom */
    var paddingBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Padding on left */
    var paddingLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Padding on right */
    var paddingRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Padding on top */
    var paddingTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Padding on left and right */
    var paddingX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Padding on top and bottom */
    var paddingY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    var paintOrder: js.UndefOr[Double | String] = js.native
    
    var panose1: js.UndefOr[Double | String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var pathLength: js.UndefOr[Double | String] = js.native
    
    var patternContentUnits: js.UndefOr[String] = js.native
    
    var patternTransform: js.UndefOr[Double | String] = js.native
    
    var patternUnits: js.UndefOr[String] = js.native
    
    /** Padding on bottom */
    var pb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Padding on left */
    var pl: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    var pointerEvents: js.UndefOr[Double | String] = js.native
    
    var points: js.UndefOr[String] = js.native
    
    var pointsAtX: js.UndefOr[Double | String] = js.native
    
    var pointsAtY: js.UndefOr[Double | String] = js.native
    
    var pointsAtZ: js.UndefOr[Double | String] = js.native
    
    /** Padding on right */
    var pr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    var preserveAlpha: js.UndefOr[Booleanish] = js.native
    
    var preserveAspectRatio: js.UndefOr[String] = js.native
    
    var primitiveUnits: js.UndefOr[Double | String] = js.native
    
    /** Padding on top */
    var pt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Padding on left and right */
    var px: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    /** Padding on top and bottom */
    var py: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
    
    var r: js.UndefOr[Double | String] = js.native
    
    var radius: js.UndefOr[Double | String] = js.native
    
    var ref: js.UndefOr[LegacyRef[SVGSVGElement]] = js.native
    
    var refX: js.UndefOr[Double | String] = js.native
    
    var refY: js.UndefOr[Double | String] = js.native
    
    var renderingIntent: js.UndefOr[Double | String] = js.native
    
    var repeatCount: js.UndefOr[Double | String] = js.native
    
    var repeatDur: js.UndefOr[Double | String] = js.native
    
    var requiredExtensions: js.UndefOr[Double | String] = js.native
    
    var requiredFeatures: js.UndefOr[Double | String] = js.native
    
    var restart: js.UndefOr[Double | String] = js.native
    
    var result: js.UndefOr[String] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var rotate: js.UndefOr[Double | String] = js.native
    
    var rx: js.UndefOr[Double | String] = js.native
    
    var ry: js.UndefOr[Double | String] = js.native
    
    var scale: js.UndefOr[Double | String] = js.native
    
    var seed: js.UndefOr[Double | String] = js.native
    
    var shapeRendering: js.UndefOr[Double | String] = js.native
    
    var size: js.UndefOr[Double | String] = js.native
    
    var slope: js.UndefOr[Double | String] = js.native
    
    var spacing: js.UndefOr[Double | String] = js.native
    
    var specularConstant: js.UndefOr[Double | String] = js.native
    
    var specularExponent: js.UndefOr[Double | String] = js.native
    
    var speed: js.UndefOr[Double | String] = js.native
    
    var spreadMethod: js.UndefOr[String] = js.native
    
    var startOffset: js.UndefOr[Double | String] = js.native
    
    var stdDeviation: js.UndefOr[Double | String] = js.native
    
    var stemh: js.UndefOr[Double | String] = js.native
    
    var stemv: js.UndefOr[Double | String] = js.native
    
    var stitchTiles: js.UndefOr[Double | String] = js.native
    
    var stopColor: js.UndefOr[String] = js.native
    
    var stopOpacity: js.UndefOr[Double | String] = js.native
    
    var strikethroughPosition: js.UndefOr[Double | String] = js.native
    
    var strikethroughThickness: js.UndefOr[Double | String] = js.native
    
    var string: js.UndefOr[Double | String] = js.native
    
    var stroke: js.UndefOr[String] = js.native
    
    var strokeDasharray: js.UndefOr[String | Double] = js.native
    
    var strokeDashoffset: js.UndefOr[String | Double] = js.native
    
    var strokeLinecap: js.UndefOr[butt | round | square | inherit] = js.native
    
    var strokeLinejoin: js.UndefOr[miter | round | bevel | inherit] = js.native
    
    var strokeMiterlimit: js.UndefOr[Double | String] = js.native
    
    var strokeOpacity: js.UndefOr[Double | String] = js.native
    
    var strokeWidth: js.UndefOr[Double | String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var surfaceScale: js.UndefOr[Double | String] = js.native
    
    var sx: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SxStyleProp */ js.Any
      ] = js.native
    
    var systemLanguage: js.UndefOr[Double | String] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var tableValues: js.UndefOr[Double | String] = js.native
    
    var target: js.UndefOr[String] = js.native
    
    var targetX: js.UndefOr[Double | String] = js.native
    
    var targetY: js.UndefOr[Double | String] = js.native
    
    var textAnchor: js.UndefOr[String] = js.native
    
    var textDecoration: js.UndefOr[Double | String] = js.native
    
    var textLength: js.UndefOr[Double | String] = js.native
    
    var textRendering: js.UndefOr[Double | String] = js.native
    
    var to: js.UndefOr[Double | String] = js.native
    
    var transform: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var u1: js.UndefOr[Double | String] = js.native
    
    var u2: js.UndefOr[Double | String] = js.native
    
    var underlinePosition: js.UndefOr[Double | String] = js.native
    
    var underlineThickness: js.UndefOr[Double | String] = js.native
    
    var unicode: js.UndefOr[Double | String] = js.native
    
    var unicodeBidi: js.UndefOr[Double | String] = js.native
    
    var unicodeRange: js.UndefOr[Double | String] = js.native
    
    var unitsPerEm: js.UndefOr[Double | String] = js.native
    
    var vAlphabetic: js.UndefOr[Double | String] = js.native
    
    var vHanging: js.UndefOr[Double | String] = js.native
    
    var vIdeographic: js.UndefOr[Double | String] = js.native
    
    var vMathematical: js.UndefOr[Double | String] = js.native
    
    var values: js.UndefOr[String] = js.native
    
    var variant: js.UndefOr[String] = js.native
    
    var vectorEffect: js.UndefOr[Double | String] = js.native
    
    var version: js.UndefOr[String] = js.native
    
    var vertAdvY: js.UndefOr[Double | String] = js.native
    
    var vertOriginX: js.UndefOr[Double | String] = js.native
    
    var vertOriginY: js.UndefOr[Double | String] = js.native
    
    var viewBox: js.UndefOr[String] = js.native
    
    var viewTarget: js.UndefOr[Double | String] = js.native
    
    var visibility: js.UndefOr[Double | String] = js.native
    
    var width: js.UndefOr[Double | String] = js.native
    
    var widths: js.UndefOr[Double | String] = js.native
    
    var wordSpacing: js.UndefOr[Double | String] = js.native
    
    var writingMode: js.UndefOr[Double | String] = js.native
    
    var x: js.UndefOr[Double | String] = js.native
    
    var x1: js.UndefOr[Double | String] = js.native
    
    var x2: js.UndefOr[Double | String] = js.native
    
    var xChannelSelector: js.UndefOr[String] = js.native
    
    var xHeight: js.UndefOr[Double | String] = js.native
    
    var xlinkActuate: js.UndefOr[String] = js.native
    
    var xlinkArcrole: js.UndefOr[String] = js.native
    
    var xlinkHref: js.UndefOr[String] = js.native
    
    var xlinkRole: js.UndefOr[String] = js.native
    
    var xlinkShow: js.UndefOr[String] = js.native
    
    var xlinkTitle: js.UndefOr[String] = js.native
    
    var xlinkType: js.UndefOr[String] = js.native
    
    var xmlBase: js.UndefOr[String] = js.native
    
    var xmlLang: js.UndefOr[String] = js.native
    
    var xmlSpace: js.UndefOr[String] = js.native
    
    var xmlns: js.UndefOr[String] = js.native
    
    var xmlnsXlink: js.UndefOr[String] = js.native
    
    var y: js.UndefOr[Double | String] = js.native
    
    var y1: js.UndefOr[Double | String] = js.native
    
    var y2: js.UndefOr[Double | String] = js.native
    
    var yChannelSelector: js.UndefOr[String] = js.native
    
    var z: js.UndefOr[Double | String] = js.native
    
    var zoomAndPan: js.UndefOr[String] = js.native
  }
  object SpinnerProps {
    
    @scala.inline
    def apply(): SpinnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpinnerProps]
    }
    
    @scala.inline
    implicit class SpinnerPropsMutableBuilder[Self <: SpinnerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccentHeight(value: Double | String): Self = StObject.set(x, "accentHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccentHeightUndefined: Self = StObject.set(x, "accentHeight", js.undefined)
      
      @scala.inline
      def setAccumulate(value: none | sum): Self = StObject.set(x, "accumulate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccumulateUndefined: Self = StObject.set(x, "accumulate", js.undefined)
      
      @scala.inline
      def setAdditive(value: replace | sum): Self = StObject.set(x, "additive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditiveUndefined: Self = StObject.set(x, "additive", js.undefined)
      
      @scala.inline
      def setAlignmentBaseline(
        value: auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
      ): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
      
      @scala.inline
      def setAllowReorder(value: no | yes): Self = StObject.set(x, "allowReorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowReorderUndefined: Self = StObject.set(x, "allowReorder", js.undefined)
      
      @scala.inline
      def setAlphabetic(value: Double | String): Self = StObject.set(x, "alphabetic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphabeticUndefined: Self = StObject.set(x, "alphabetic", js.undefined)
      
      @scala.inline
      def setAmplitude(value: Double | String): Self = StObject.set(x, "amplitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmplitudeUndefined: Self = StObject.set(x, "amplitude", js.undefined)
      
      @scala.inline
      def setArabicForm(value: initial | medial | terminal | isolated): Self = StObject.set(x, "arabicForm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArabicFormUndefined: Self = StObject.set(x, "arabicForm", js.undefined)
      
      @scala.inline
      def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      @scala.inline
      def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      @scala.inline
      def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      @scala.inline
      def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      @scala.inline
      def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      @scala.inline
      def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      @scala.inline
      def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      @scala.inline
      def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      @scala.inline
      def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      @scala.inline
      def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      @scala.inline
      def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      @scala.inline
      def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      @scala.inline
      def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      @scala.inline
      def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      @scala.inline
      def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      @scala.inline
      def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      @scala.inline
      def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      @scala.inline
      def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      @scala.inline
      def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      @scala.inline
      def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      @scala.inline
      def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      @scala.inline
      def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      @scala.inline
      def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      @scala.inline
      def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      @scala.inline
      def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      @scala.inline
      def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      @scala.inline
      def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      @scala.inline
      def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      @scala.inline
      def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      @scala.inline
      def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      @scala.inline
      def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      @scala.inline
      def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      @scala.inline
      def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      @scala.inline
      def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      @scala.inline
      def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      @scala.inline
      def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      @scala.inline
      def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      @scala.inline
      def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      @scala.inline
      def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      @scala.inline
      def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      @scala.inline
      def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      @scala.inline
      def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      @scala.inline
      def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      @scala.inline
      def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      @scala.inline
      def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      @scala.inline
      def setAs(value: ElementType[_]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAscent(value: Double | String): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAscentUndefined: Self = StObject.set(x, "ascent", js.undefined)
      
      @scala.inline
      def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
      
      @scala.inline
      def setAttributeType(value: String): Self = StObject.set(x, "attributeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeTypeUndefined: Self = StObject.set(x, "attributeType", js.undefined)
      
      @scala.inline
      def setAutoReverse(value: Booleanish): Self = StObject.set(x, "autoReverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoReverseUndefined: Self = StObject.set(x, "autoReverse", js.undefined)
      
      @scala.inline
      def setAzimuth(value: Double | String): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAzimuthUndefined: Self = StObject.set(x, "azimuth", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBackgroundColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
      
      @scala.inline
      def setBaseFrequency(value: Double | String): Self = StObject.set(x, "baseFrequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseFrequencyUndefined: Self = StObject.set(x, "baseFrequency", js.undefined)
      
      @scala.inline
      def setBaseProfile(value: Double | String): Self = StObject.set(x, "baseProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseProfileUndefined: Self = StObject.set(x, "baseProfile", js.undefined)
      
      @scala.inline
      def setBaselineShift(value: Double | String): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
      
      @scala.inline
      def setBbox(value: Double | String): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      @scala.inline
      def setBegin(value: Double | String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
      
      @scala.inline
      def setBg(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgNull: Self = StObject.set(x, "bg", null)
      
      @scala.inline
      def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      @scala.inline
      def setBgVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "bg", js.Array(value :_*))
      
      @scala.inline
      def setBias(value: Double | String): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      @scala.inline
      def setBy(value: Double | String): Self = StObject.set(x, "by", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByUndefined: Self = StObject.set(x, "by", js.undefined)
      
      @scala.inline
      def setCalcMode(value: Double | String): Self = StObject.set(x, "calcMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalcModeUndefined: Self = StObject.set(x, "calcMode", js.undefined)
      
      @scala.inline
      def setCapHeight(value: Double | String): Self = StObject.set(x, "capHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapHeightUndefined: Self = StObject.set(x, "capHeight", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClip(value: Double | String): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
      
      @scala.inline
      def setClipPathUnits(value: Double | String): Self = StObject.set(x, "clipPathUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipPathUnitsUndefined: Self = StObject.set(x, "clipPathUnits", js.undefined)
      
      @scala.inline
      def setClipRule(value: Double | String): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
      
      @scala.inline
      def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      @scala.inline
      def setColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorInterpolation(value: Double | String): Self = StObject.set(x, "colorInterpolation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorInterpolationFilters(value: auto | sRGB | linearRGB | inherit): Self = StObject.set(x, "colorInterpolationFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorInterpolationFiltersUndefined: Self = StObject.set(x, "colorInterpolationFilters", js.undefined)
      
      @scala.inline
      def setColorInterpolationUndefined: Self = StObject.set(x, "colorInterpolation", js.undefined)
      
      @scala.inline
      def setColorNull: Self = StObject.set(x, "color", null)
      
      @scala.inline
      def setColorProfile(value: Double | String): Self = StObject.set(x, "colorProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorProfileUndefined: Self = StObject.set(x, "colorProfile", js.undefined)
      
      @scala.inline
      def setColorRendering(value: Double | String): Self = StObject.set(x, "colorRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorRenderingUndefined: Self = StObject.set(x, "colorRendering", js.undefined)
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      @scala.inline
      def setContentScriptType(value: Double | String): Self = StObject.set(x, "contentScriptType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentScriptTypeUndefined: Self = StObject.set(x, "contentScriptType", js.undefined)
      
      @scala.inline
      def setContentStyleType(value: Double | String): Self = StObject.set(x, "contentStyleType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentStyleTypeUndefined: Self = StObject.set(x, "contentStyleType", js.undefined)
      
      @scala.inline
      def setCrossOrigin(value: anonymous | `use-credentials` | _empty): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      @scala.inline
      def setCss(value: InterpolationWithTheme[_]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssFunction1(value: _ => Interpolation[js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "css", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCssNull: Self = StObject.set(x, "css", null)
      
      @scala.inline
      def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      @scala.inline
      def setCursor(value: Double | String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      @scala.inline
      def setCx(value: Double | String): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
      
      @scala.inline
      def setCy(value: Double | String): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
      
      @scala.inline
      def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      @scala.inline
      def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      @scala.inline
      def setDecelerate(value: Double | String): Self = StObject.set(x, "decelerate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecelerateUndefined: Self = StObject.set(x, "decelerate", js.undefined)
      
      @scala.inline
      def setDescent(value: Double | String): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescentUndefined: Self = StObject.set(x, "descent", js.undefined)
      
      @scala.inline
      def setDiffuseConstant(value: Double | String): Self = StObject.set(x, "diffuseConstant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiffuseConstantUndefined: Self = StObject.set(x, "diffuseConstant", js.undefined)
      
      @scala.inline
      def setDirection(value: Double | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisplay(value: Double | String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setDivisor(value: Double | String): Self = StObject.set(x, "divisor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivisorUndefined: Self = StObject.set(x, "divisor", js.undefined)
      
      @scala.inline
      def setDominantBaseline(value: Double | String): Self = StObject.set(x, "dominantBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDominantBaselineUndefined: Self = StObject.set(x, "dominantBaseline", js.undefined)
      
      @scala.inline
      def setDur(value: Double | String): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurUndefined: Self = StObject.set(x, "dur", js.undefined)
      
      @scala.inline
      def setDx(value: Double | String): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      @scala.inline
      def setDy(value: Double | String): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      @scala.inline
      def setEdgeMode(value: Double | String): Self = StObject.set(x, "edgeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeModeUndefined: Self = StObject.set(x, "edgeMode", js.undefined)
      
      @scala.inline
      def setElevation(value: Double | String): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
      
      @scala.inline
      def setEnableBackground(value: Double | String): Self = StObject.set(x, "enableBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableBackgroundUndefined: Self = StObject.set(x, "enableBackground", js.undefined)
      
      @scala.inline
      def setEnd(value: Double | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setExponent(value: Double | String): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
      
      @scala.inline
      def setExternalResourcesRequired(value: Booleanish): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalResourcesRequiredUndefined: Self = StObject.set(x, "externalResourcesRequired", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacity(value: Double | String): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFillRule(value: nonzero | evenodd | inherit): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterRes(value: Double | String): Self = StObject.set(x, "filterRes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterResUndefined: Self = StObject.set(x, "filterRes", js.undefined)
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFilterUnits(value: Double | String): Self = StObject.set(x, "filterUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUnitsUndefined: Self = StObject.set(x, "filterUnits", js.undefined)
      
      @scala.inline
      def setFloodColor(value: Double | String): Self = StObject.set(x, "floodColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloodColorUndefined: Self = StObject.set(x, "floodColor", js.undefined)
      
      @scala.inline
      def setFloodOpacity(value: Double | String): Self = StObject.set(x, "floodOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloodOpacityUndefined: Self = StObject.set(x, "floodOpacity", js.undefined)
      
      @scala.inline
      def setFocusable(value: Booleanish | auto): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeAdjust(value: Double | String): Self = StObject.set(x, "fontSizeAdjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeAdjustUndefined: Self = StObject.set(x, "fontSizeAdjust", js.undefined)
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontStretch(value: Double | String): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
      
      @scala.inline
      def setFontStyle(value: Double | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontVariant(value: Double | String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      @scala.inline
      def setFontWeight(value: Double | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setFormat(value: Double | String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setFrom(value: Double | String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setFx(value: Double | String): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFxUndefined: Self = StObject.set(x, "fx", js.undefined)
      
      @scala.inline
      def setFy(value: Double | String): Self = StObject.set(x, "fy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFyUndefined: Self = StObject.set(x, "fy", js.undefined)
      
      @scala.inline
      def setG1(value: Double | String): Self = StObject.set(x, "g1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG1Undefined: Self = StObject.set(x, "g1", js.undefined)
      
      @scala.inline
      def setG2(value: Double | String): Self = StObject.set(x, "g2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG2Undefined: Self = StObject.set(x, "g2", js.undefined)
      
      @scala.inline
      def setGlyphName(value: Double | String): Self = StObject.set(x, "glyphName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphNameUndefined: Self = StObject.set(x, "glyphName", js.undefined)
      
      @scala.inline
      def setGlyphOrientationHorizontal(value: Double | String): Self = StObject.set(x, "glyphOrientationHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphOrientationHorizontalUndefined: Self = StObject.set(x, "glyphOrientationHorizontal", js.undefined)
      
      @scala.inline
      def setGlyphOrientationVertical(value: Double | String): Self = StObject.set(x, "glyphOrientationVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphOrientationVerticalUndefined: Self = StObject.set(x, "glyphOrientationVertical", js.undefined)
      
      @scala.inline
      def setGlyphRef(value: Double | String): Self = StObject.set(x, "glyphRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphRefUndefined: Self = StObject.set(x, "glyphRef", js.undefined)
      
      @scala.inline
      def setGradientTransform(value: String): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientTransformUndefined: Self = StObject.set(x, "gradientTransform", js.undefined)
      
      @scala.inline
      def setGradientUnits(value: String): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientUnitsUndefined: Self = StObject.set(x, "gradientUnits", js.undefined)
      
      @scala.inline
      def setHanging(value: Double | String): Self = StObject.set(x, "hanging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHangingUndefined: Self = StObject.set(x, "hanging", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHorizAdvX(value: Double | String): Self = StObject.set(x, "horizAdvX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizAdvXUndefined: Self = StObject.set(x, "horizAdvX", js.undefined)
      
      @scala.inline
      def setHorizOriginX(value: Double | String): Self = StObject.set(x, "horizOriginX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizOriginXUndefined: Self = StObject.set(x, "horizOriginX", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIdeographic(value: Double | String): Self = StObject.set(x, "ideographic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdeographicUndefined: Self = StObject.set(x, "ideographic", js.undefined)
      
      @scala.inline
      def setImageRendering(value: Double | String): Self = StObject.set(x, "imageRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageRenderingUndefined: Self = StObject.set(x, "imageRendering", js.undefined)
      
      @scala.inline
      def setIn(value: String): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIn2(value: Double | String): Self = StObject.set(x, "in2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIn2Undefined: Self = StObject.set(x, "in2", js.undefined)
      
      @scala.inline
      def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      @scala.inline
      def setIntercept(value: Double | String): Self = StObject.set(x, "intercept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterceptUndefined: Self = StObject.set(x, "intercept", js.undefined)
      
      @scala.inline
      def setK(value: Double | String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK1(value: Double | String): Self = StObject.set(x, "k1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK1Undefined: Self = StObject.set(x, "k1", js.undefined)
      
      @scala.inline
      def setK2(value: Double | String): Self = StObject.set(x, "k2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK2Undefined: Self = StObject.set(x, "k2", js.undefined)
      
      @scala.inline
      def setK3(value: Double | String): Self = StObject.set(x, "k3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK3Undefined: Self = StObject.set(x, "k3", js.undefined)
      
      @scala.inline
      def setK4(value: Double | String): Self = StObject.set(x, "k4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK4Undefined: Self = StObject.set(x, "k4", js.undefined)
      
      @scala.inline
      def setKUndefined: Self = StObject.set(x, "k", js.undefined)
      
      @scala.inline
      def setKernelMatrix(value: Double | String): Self = StObject.set(x, "kernelMatrix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelMatrixUndefined: Self = StObject.set(x, "kernelMatrix", js.undefined)
      
      @scala.inline
      def setKernelUnitLength(value: Double | String): Self = StObject.set(x, "kernelUnitLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelUnitLengthUndefined: Self = StObject.set(x, "kernelUnitLength", js.undefined)
      
      @scala.inline
      def setKerning(value: Double | String): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNull: Self = StObject.set(x, "key", null)
      
      @scala.inline
      def setKeyPoints(value: Double | String): Self = StObject.set(x, "keyPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPointsUndefined: Self = StObject.set(x, "keyPoints", js.undefined)
      
      @scala.inline
      def setKeySplines(value: Double | String): Self = StObject.set(x, "keySplines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySplinesUndefined: Self = StObject.set(x, "keySplines", js.undefined)
      
      @scala.inline
      def setKeyTimes(value: Double | String): Self = StObject.set(x, "keyTimes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyTimesUndefined: Self = StObject.set(x, "keyTimes", js.undefined)
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setLengthAdjust(value: Double | String): Self = StObject.set(x, "lengthAdjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthAdjustUndefined: Self = StObject.set(x, "lengthAdjust", js.undefined)
      
      @scala.inline
      def setLetterSpacing(value: Double | String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      @scala.inline
      def setLightingColor(value: Double | String): Self = StObject.set(x, "lightingColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightingColorUndefined: Self = StObject.set(x, "lightingColor", js.undefined)
      
      @scala.inline
      def setLimitingConeAngle(value: Double | String): Self = StObject.set(x, "limitingConeAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitingConeAngleUndefined: Self = StObject.set(x, "limitingConeAngle", js.undefined)
      
      @scala.inline
      def setLocal(value: Double | String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
      
      @scala.inline
      def setM(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMNull: Self = StObject.set(x, "m", null)
      
      @scala.inline
      def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      @scala.inline
      def setMVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "m", js.Array(value :_*))
      
      @scala.inline
      def setMargin(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottomNull: Self = StObject.set(x, "marginBottom", null)
      
      @scala.inline
      def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      @scala.inline
      def setMarginBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginBottom", js.Array(value :_*))
      
      @scala.inline
      def setMarginLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginLeftNull: Self = StObject.set(x, "marginLeft", null)
      
      @scala.inline
      def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      @scala.inline
      def setMarginLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginLeft", js.Array(value :_*))
      
      @scala.inline
      def setMarginNull: Self = StObject.set(x, "margin", null)
      
      @scala.inline
      def setMarginRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginRightNull: Self = StObject.set(x, "marginRight", null)
      
      @scala.inline
      def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      @scala.inline
      def setMarginRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginRight", js.Array(value :_*))
      
      @scala.inline
      def setMarginTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginTopNull: Self = StObject.set(x, "marginTop", null)
      
      @scala.inline
      def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      @scala.inline
      def setMarginTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginTop", js.Array(value :_*))
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarginVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "margin", js.Array(value :_*))
      
      @scala.inline
      def setMarginX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "marginX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginXNull: Self = StObject.set(x, "marginX", null)
      
      @scala.inline
      def setMarginXUndefined: Self = StObject.set(x, "marginX", js.undefined)
      
      @scala.inline
      def setMarginXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginX", js.Array(value :_*))
      
      @scala.inline
      def setMarginY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "marginY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginYNull: Self = StObject.set(x, "marginY", null)
      
      @scala.inline
      def setMarginYUndefined: Self = StObject.set(x, "marginY", js.undefined)
      
      @scala.inline
      def setMarginYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginY", js.Array(value :_*))
      
      @scala.inline
      def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      @scala.inline
      def setMarkerHeight(value: Double | String): Self = StObject.set(x, "markerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerHeightUndefined: Self = StObject.set(x, "markerHeight", js.undefined)
      
      @scala.inline
      def setMarkerMid(value: String): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      @scala.inline
      def setMarkerStart(value: String): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      @scala.inline
      def setMarkerUnits(value: Double | String): Self = StObject.set(x, "markerUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerUnitsUndefined: Self = StObject.set(x, "markerUnits", js.undefined)
      
      @scala.inline
      def setMarkerWidth(value: Double | String): Self = StObject.set(x, "markerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerWidthUndefined: Self = StObject.set(x, "markerWidth", js.undefined)
      
      @scala.inline
      def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskContentUnits(value: Double | String): Self = StObject.set(x, "maskContentUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskContentUnitsUndefined: Self = StObject.set(x, "maskContentUnits", js.undefined)
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setMaskUnits(value: Double | String): Self = StObject.set(x, "maskUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUnitsUndefined: Self = StObject.set(x, "maskUnits", js.undefined)
      
      @scala.inline
      def setMathematical(value: Double | String): Self = StObject.set(x, "mathematical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMathematicalUndefined: Self = StObject.set(x, "mathematical", js.undefined)
      
      @scala.inline
      def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMbNull: Self = StObject.set(x, "mb", null)
      
      @scala.inline
      def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
      
      @scala.inline
      def setMbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mb", js.Array(value :_*))
      
      @scala.inline
      def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setMl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMlNull: Self = StObject.set(x, "ml", null)
      
      @scala.inline
      def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
      
      @scala.inline
      def setMlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "ml", js.Array(value :_*))
      
      @scala.inline
      def setMode(value: Double | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMrNull: Self = StObject.set(x, "mr", null)
      
      @scala.inline
      def setMrUndefined: Self = StObject.set(x, "mr", js.undefined)
      
      @scala.inline
      def setMrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mr", js.Array(value :_*))
      
      @scala.inline
      def setMt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtNull: Self = StObject.set(x, "mt", null)
      
      @scala.inline
      def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
      
      @scala.inline
      def setMtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mt", js.Array(value :_*))
      
      @scala.inline
      def setMx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "mx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMxNull: Self = StObject.set(x, "mx", null)
      
      @scala.inline
      def setMxUndefined: Self = StObject.set(x, "mx", js.undefined)
      
      @scala.inline
      def setMxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mx", js.Array(value :_*))
      
      @scala.inline
      def setMy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMyNull: Self = StObject.set(x, "my", null)
      
      @scala.inline
      def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
      
      @scala.inline
      def setMyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "my", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNumOctaves(value: Double | String): Self = StObject.set(x, "numOctaves", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumOctavesUndefined: Self = StObject.set(x, "numOctaves", js.undefined)
      
      @scala.inline
      def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOnAbort(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: AnimationEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setOnAnimationIteration(value: AnimationEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      @scala.inline
      def setOnAnimationStart(value: AnimationEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      @scala.inline
      def setOnAuxClick(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      @scala.inline
      def setOnBeforeInput(value: FormEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      @scala.inline
      def setOnBlur(value: FocusEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCanPlay(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThrough(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      @scala.inline
      def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      @scala.inline
      def setOnChange(value: FormEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnCompositionEnd(value: CompositionEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      @scala.inline
      def setOnCompositionStart(value: CompositionEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      @scala.inline
      def setOnCompositionUpdate(value: CompositionEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnCopy(value: ClipboardEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setOnCut(value: ClipboardEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnDrag(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnd(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragExit(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnDrop(value: DragEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnDurationChange(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      @scala.inline
      def setOnEmptied(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      @scala.inline
      def setOnEncrypted(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      @scala.inline
      def setOnEnded(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      @scala.inline
      def setOnError(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnFocus(value: FocusEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInput(value: FormEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setOnInvalid(value: FormEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: KeyboardEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: KeyboardEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnLoad(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStart(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnLoadedData(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      @scala.inline
      def setOnLoadedMetadata(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnMouseOut(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      @scala.inline
      def setOnMouseOver(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnPaste(value: ClipboardEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnPause(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      @scala.inline
      def setOnPlay(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      @scala.inline
      def setOnPlaying(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      @scala.inline
      def setOnPointerCancel(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      @scala.inline
      def setOnPointerDown(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      @scala.inline
      def setOnPointerEnter(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      @scala.inline
      def setOnPointerLeave(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      @scala.inline
      def setOnPointerMove(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      @scala.inline
      def setOnPointerOut(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      @scala.inline
      def setOnPointerOver(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      @scala.inline
      def setOnPointerUp(value: PointerEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      @scala.inline
      def setOnProgress(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnRateChange(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      @scala.inline
      def setOnReset(value: FormEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnScroll(value: UIEvent[SVGSVGElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSeeked(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      @scala.inline
      def setOnSeeking(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      @scala.inline
      def setOnSelect(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnStalled(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: FormEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOnSuspend(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      @scala.inline
      def setOnTimeUpdate(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(value: TouchEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: TouchEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: TouchEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: TouchEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnTransitionEnd(value: TransitionEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setOnVolumeChange(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      @scala.inline
      def setOnWaiting(value: SyntheticEvent[SVGSVGElement, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      @scala.inline
      def setOnWheel(value: WheelEvent[SVGSVGElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      @scala.inline
      def setOpacity(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityNull: Self = StObject.set(x, "opacity", null)
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOpacityVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "opacity", js.Array(value :_*))
      
      @scala.inline
      def setOperator(value: Double | String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      @scala.inline
      def setOrder(value: Double | String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setOrient(value: Double | String): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      @scala.inline
      def setOrientation(value: Double | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setOrigin(value: Double | String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setOverflow(value: Double | String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setOverlinePosition(value: Double | String): Self = StObject.set(x, "overlinePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlinePositionUndefined: Self = StObject.set(x, "overlinePosition", js.undefined)
      
      @scala.inline
      def setOverlineThickness(value: Double | String): Self = StObject.set(x, "overlineThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlineThicknessUndefined: Self = StObject.set(x, "overlineThickness", js.undefined)
      
      @scala.inline
      def setP(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPNull: Self = StObject.set(x, "p", null)
      
      @scala.inline
      def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      @scala.inline
      def setPVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "p", js.Array(value :_*))
      
      @scala.inline
      def setPadding(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBottomNull: Self = StObject.set(x, "paddingBottom", null)
      
      @scala.inline
      def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      @scala.inline
      def setPaddingBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingBottom", js.Array(value :_*))
      
      @scala.inline
      def setPaddingLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingLeftNull: Self = StObject.set(x, "paddingLeft", null)
      
      @scala.inline
      def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      @scala.inline
      def setPaddingLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingLeft", js.Array(value :_*))
      
      @scala.inline
      def setPaddingNull: Self = StObject.set(x, "padding", null)
      
      @scala.inline
      def setPaddingRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingRightNull: Self = StObject.set(x, "paddingRight", null)
      
      @scala.inline
      def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      @scala.inline
      def setPaddingRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingRight", js.Array(value :_*))
      
      @scala.inline
      def setPaddingTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingTopNull: Self = StObject.set(x, "paddingTop", null)
      
      @scala.inline
      def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      @scala.inline
      def setPaddingTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingTop", js.Array(value :_*))
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPaddingVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "padding", js.Array(value :_*))
      
      @scala.inline
      def setPaddingX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingXNull: Self = StObject.set(x, "paddingX", null)
      
      @scala.inline
      def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
      
      @scala.inline
      def setPaddingXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingX", js.Array(value :_*))
      
      @scala.inline
      def setPaddingY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingYNull: Self = StObject.set(x, "paddingY", null)
      
      @scala.inline
      def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
      
      @scala.inline
      def setPaddingYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingY", js.Array(value :_*))
      
      @scala.inline
      def setPaintOrder(value: Double | String): Self = StObject.set(x, "paintOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaintOrderUndefined: Self = StObject.set(x, "paintOrder", js.undefined)
      
      @scala.inline
      def setPanose1(value: Double | String): Self = StObject.set(x, "panose1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanose1Undefined: Self = StObject.set(x, "panose1", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathLength(value: Double | String): Self = StObject.set(x, "pathLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathLengthUndefined: Self = StObject.set(x, "pathLength", js.undefined)
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPatternContentUnits(value: String): Self = StObject.set(x, "patternContentUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternContentUnitsUndefined: Self = StObject.set(x, "patternContentUnits", js.undefined)
      
      @scala.inline
      def setPatternTransform(value: Double | String): Self = StObject.set(x, "patternTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternTransformUndefined: Self = StObject.set(x, "patternTransform", js.undefined)
      
      @scala.inline
      def setPatternUnits(value: String): Self = StObject.set(x, "patternUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUnitsUndefined: Self = StObject.set(x, "patternUnits", js.undefined)
      
      @scala.inline
      def setPb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "pb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPbNull: Self = StObject.set(x, "pb", null)
      
      @scala.inline
      def setPbUndefined: Self = StObject.set(x, "pb", js.undefined)
      
      @scala.inline
      def setPbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pb", js.Array(value :_*))
      
      @scala.inline
      def setPl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlNull: Self = StObject.set(x, "pl", null)
      
      @scala.inline
      def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
      
      @scala.inline
      def setPlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pl", js.Array(value :_*))
      
      @scala.inline
      def setPointerEvents(value: Double | String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      @scala.inline
      def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsAtX(value: Double | String): Self = StObject.set(x, "pointsAtX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsAtXUndefined: Self = StObject.set(x, "pointsAtX", js.undefined)
      
      @scala.inline
      def setPointsAtY(value: Double | String): Self = StObject.set(x, "pointsAtY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsAtYUndefined: Self = StObject.set(x, "pointsAtY", js.undefined)
      
      @scala.inline
      def setPointsAtZ(value: Double | String): Self = StObject.set(x, "pointsAtZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsAtZUndefined: Self = StObject.set(x, "pointsAtZ", js.undefined)
      
      @scala.inline
      def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      @scala.inline
      def setPr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrNull: Self = StObject.set(x, "pr", null)
      
      @scala.inline
      def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
      
      @scala.inline
      def setPrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pr", js.Array(value :_*))
      
      @scala.inline
      def setPreserveAlpha(value: Booleanish): Self = StObject.set(x, "preserveAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveAlphaUndefined: Self = StObject.set(x, "preserveAlpha", js.undefined)
      
      @scala.inline
      def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      @scala.inline
      def setPrimitiveUnits(value: Double | String): Self = StObject.set(x, "primitiveUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimitiveUnitsUndefined: Self = StObject.set(x, "primitiveUnits", js.undefined)
      
      @scala.inline
      def setPt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPtNull: Self = StObject.set(x, "pt", null)
      
      @scala.inline
      def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
      @scala.inline
      def setPtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pt", js.Array(value :_*))
      
      @scala.inline
      def setPx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPxNull: Self = StObject.set(x, "px", null)
      
      @scala.inline
      def setPxUndefined: Self = StObject.set(x, "px", js.undefined)
      
      @scala.inline
      def setPxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "px", js.Array(value :_*))
      
      @scala.inline
      def setPy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPyNull: Self = StObject.set(x, "py", null)
      
      @scala.inline
      def setPyUndefined: Self = StObject.set(x, "py", js.undefined)
      
      @scala.inline
      def setPyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "py", js.Array(value :_*))
      
      @scala.inline
      def setR(value: Double | String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      @scala.inline
      def setRadius(value: Double | String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setRef(value: LegacyRef[SVGSVGElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ SVGSVGElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setRefX(value: Double | String): Self = StObject.set(x, "refX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefXUndefined: Self = StObject.set(x, "refX", js.undefined)
      
      @scala.inline
      def setRefY(value: Double | String): Self = StObject.set(x, "refY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefYUndefined: Self = StObject.set(x, "refY", js.undefined)
      
      @scala.inline
      def setRenderingIntent(value: Double | String): Self = StObject.set(x, "renderingIntent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderingIntentUndefined: Self = StObject.set(x, "renderingIntent", js.undefined)
      
      @scala.inline
      def setRepeatCount(value: Double | String): Self = StObject.set(x, "repeatCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatCountUndefined: Self = StObject.set(x, "repeatCount", js.undefined)
      
      @scala.inline
      def setRepeatDur(value: Double | String): Self = StObject.set(x, "repeatDur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatDurUndefined: Self = StObject.set(x, "repeatDur", js.undefined)
      
      @scala.inline
      def setRequiredExtensions(value: Double | String): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredExtensionsUndefined: Self = StObject.set(x, "requiredExtensions", js.undefined)
      
      @scala.inline
      def setRequiredFeatures(value: Double | String): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredFeaturesUndefined: Self = StObject.set(x, "requiredFeatures", js.undefined)
      
      @scala.inline
      def setRestart(value: Double | String): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
      
      @scala.inline
      def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setRotate(value: Double | String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setRx(value: Double | String): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      @scala.inline
      def setRy(value: Double | String): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
      
      @scala.inline
      def setScale(value: Double | String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setSeed(value: Double | String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      @scala.inline
      def setShapeRendering(value: Double | String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
      
      @scala.inline
      def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSlope(value: Double | String): Self = StObject.set(x, "slope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlopeUndefined: Self = StObject.set(x, "slope", js.undefined)
      
      @scala.inline
      def setSpacing(value: Double | String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      @scala.inline
      def setSpecularConstant(value: Double | String): Self = StObject.set(x, "specularConstant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecularConstantUndefined: Self = StObject.set(x, "specularConstant", js.undefined)
      
      @scala.inline
      def setSpecularExponent(value: Double | String): Self = StObject.set(x, "specularExponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecularExponentUndefined: Self = StObject.set(x, "specularExponent", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double | String): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      @scala.inline
      def setSpreadMethod(value: String): Self = StObject.set(x, "spreadMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpreadMethodUndefined: Self = StObject.set(x, "spreadMethod", js.undefined)
      
      @scala.inline
      def setStartOffset(value: Double | String): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
      
      @scala.inline
      def setStdDeviation(value: Double | String): Self = StObject.set(x, "stdDeviation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdDeviationUndefined: Self = StObject.set(x, "stdDeviation", js.undefined)
      
      @scala.inline
      def setStemh(value: Double | String): Self = StObject.set(x, "stemh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStemhUndefined: Self = StObject.set(x, "stemh", js.undefined)
      
      @scala.inline
      def setStemv(value: Double | String): Self = StObject.set(x, "stemv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStemvUndefined: Self = StObject.set(x, "stemv", js.undefined)
      
      @scala.inline
      def setStitchTiles(value: Double | String): Self = StObject.set(x, "stitchTiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStitchTilesUndefined: Self = StObject.set(x, "stitchTiles", js.undefined)
      
      @scala.inline
      def setStopColor(value: String): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
      
      @scala.inline
      def setStopOpacity(value: Double | String): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
      
      @scala.inline
      def setStrikethroughPosition(value: Double | String): Self = StObject.set(x, "strikethroughPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrikethroughPositionUndefined: Self = StObject.set(x, "strikethroughPosition", js.undefined)
      
      @scala.inline
      def setStrikethroughThickness(value: Double | String): Self = StObject.set(x, "strikethroughThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrikethroughThicknessUndefined: Self = StObject.set(x, "strikethroughThickness", js.undefined)
      
      @scala.inline
      def setString(value: Double | String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      @scala.inline
      def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDasharray(value: String | Double): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
      
      @scala.inline
      def setStrokeDashoffset(value: String | Double): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
      
      @scala.inline
      def setStrokeLinecap(value: butt | round | square | inherit): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      @scala.inline
      def setStrokeLinejoin(value: miter | round | bevel | inherit): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
      
      @scala.inline
      def setStrokeMiterlimit(value: Double | String): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
      
      @scala.inline
      def setStrokeOpacity(value: Double | String): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: Double | String): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSurfaceScale(value: Double | String): Self = StObject.set(x, "surfaceScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSurfaceScaleUndefined: Self = StObject.set(x, "surfaceScale", js.undefined)
      
      @scala.inline
      def setSx(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SxStyleProp */ js.Any
      ): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      @scala.inline
      def setSystemLanguage(value: Double | String): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemLanguageUndefined: Self = StObject.set(x, "systemLanguage", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTableValues(value: Double | String): Self = StObject.set(x, "tableValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableValuesUndefined: Self = StObject.set(x, "tableValues", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTargetX(value: Double | String): Self = StObject.set(x, "targetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetXUndefined: Self = StObject.set(x, "targetX", js.undefined)
      
      @scala.inline
      def setTargetY(value: Double | String): Self = StObject.set(x, "targetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetYUndefined: Self = StObject.set(x, "targetY", js.undefined)
      
      @scala.inline
      def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
      
      @scala.inline
      def setTextDecoration(value: Double | String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      @scala.inline
      def setTextLength(value: Double | String): Self = StObject.set(x, "textLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextLengthUndefined: Self = StObject.set(x, "textLength", js.undefined)
      
      @scala.inline
      def setTextRendering(value: Double | String): Self = StObject.set(x, "textRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextRenderingUndefined: Self = StObject.set(x, "textRendering", js.undefined)
      
      @scala.inline
      def setTo(value: Double | String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setU1(value: Double | String): Self = StObject.set(x, "u1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setU1Undefined: Self = StObject.set(x, "u1", js.undefined)
      
      @scala.inline
      def setU2(value: Double | String): Self = StObject.set(x, "u2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setU2Undefined: Self = StObject.set(x, "u2", js.undefined)
      
      @scala.inline
      def setUnderlinePosition(value: Double | String): Self = StObject.set(x, "underlinePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlinePositionUndefined: Self = StObject.set(x, "underlinePosition", js.undefined)
      
      @scala.inline
      def setUnderlineThickness(value: Double | String): Self = StObject.set(x, "underlineThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineThicknessUndefined: Self = StObject.set(x, "underlineThickness", js.undefined)
      
      @scala.inline
      def setUnicode(value: Double | String): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeBidi(value: Double | String): Self = StObject.set(x, "unicodeBidi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeBidiUndefined: Self = StObject.set(x, "unicodeBidi", js.undefined)
      
      @scala.inline
      def setUnicodeRange(value: Double | String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
      
      @scala.inline
      def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
      
      @scala.inline
      def setUnitsPerEm(value: Double | String): Self = StObject.set(x, "unitsPerEm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitsPerEmUndefined: Self = StObject.set(x, "unitsPerEm", js.undefined)
      
      @scala.inline
      def setVAlphabetic(value: Double | String): Self = StObject.set(x, "vAlphabetic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVAlphabeticUndefined: Self = StObject.set(x, "vAlphabetic", js.undefined)
      
      @scala.inline
      def setVHanging(value: Double | String): Self = StObject.set(x, "vHanging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVHangingUndefined: Self = StObject.set(x, "vHanging", js.undefined)
      
      @scala.inline
      def setVIdeographic(value: Double | String): Self = StObject.set(x, "vIdeographic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVIdeographicUndefined: Self = StObject.set(x, "vIdeographic", js.undefined)
      
      @scala.inline
      def setVMathematical(value: Double | String): Self = StObject.set(x, "vMathematical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVMathematicalUndefined: Self = StObject.set(x, "vMathematical", js.undefined)
      
      @scala.inline
      def setValues(value: String): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      @scala.inline
      def setVectorEffect(value: Double | String): Self = StObject.set(x, "vectorEffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVectorEffectUndefined: Self = StObject.set(x, "vectorEffect", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setVertAdvY(value: Double | String): Self = StObject.set(x, "vertAdvY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertAdvYUndefined: Self = StObject.set(x, "vertAdvY", js.undefined)
      
      @scala.inline
      def setVertOriginX(value: Double | String): Self = StObject.set(x, "vertOriginX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertOriginXUndefined: Self = StObject.set(x, "vertOriginX", js.undefined)
      
      @scala.inline
      def setVertOriginY(value: Double | String): Self = StObject.set(x, "vertOriginY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertOriginYUndefined: Self = StObject.set(x, "vertOriginY", js.undefined)
      
      @scala.inline
      def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      @scala.inline
      def setViewTarget(value: Double | String): Self = StObject.set(x, "viewTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewTargetUndefined: Self = StObject.set(x, "viewTarget", js.undefined)
      
      @scala.inline
      def setVisibility(value: Double | String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWidths(value: Double | String): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
      
      @scala.inline
      def setWordSpacing(value: Double | String): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
      
      @scala.inline
      def setWritingMode(value: Double | String): Self = StObject.set(x, "writingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritingModeUndefined: Self = StObject.set(x, "writingMode", js.undefined)
      
      @scala.inline
      def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX1(value: Double | String): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
      
      @scala.inline
      def setX2(value: Double | String): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      @scala.inline
      def setXChannelSelector(value: String): Self = StObject.set(x, "xChannelSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXChannelSelectorUndefined: Self = StObject.set(x, "xChannelSelector", js.undefined)
      
      @scala.inline
      def setXHeight(value: Double | String): Self = StObject.set(x, "xHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXHeightUndefined: Self = StObject.set(x, "xHeight", js.undefined)
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setXlinkActuate(value: String): Self = StObject.set(x, "xlinkActuate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkActuateUndefined: Self = StObject.set(x, "xlinkActuate", js.undefined)
      
      @scala.inline
      def setXlinkArcrole(value: String): Self = StObject.set(x, "xlinkArcrole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkArcroleUndefined: Self = StObject.set(x, "xlinkArcrole", js.undefined)
      
      @scala.inline
      def setXlinkHref(value: String): Self = StObject.set(x, "xlinkHref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkHrefUndefined: Self = StObject.set(x, "xlinkHref", js.undefined)
      
      @scala.inline
      def setXlinkRole(value: String): Self = StObject.set(x, "xlinkRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkRoleUndefined: Self = StObject.set(x, "xlinkRole", js.undefined)
      
      @scala.inline
      def setXlinkShow(value: String): Self = StObject.set(x, "xlinkShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkShowUndefined: Self = StObject.set(x, "xlinkShow", js.undefined)
      
      @scala.inline
      def setXlinkTitle(value: String): Self = StObject.set(x, "xlinkTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkTitleUndefined: Self = StObject.set(x, "xlinkTitle", js.undefined)
      
      @scala.inline
      def setXlinkType(value: String): Self = StObject.set(x, "xlinkType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkTypeUndefined: Self = StObject.set(x, "xlinkType", js.undefined)
      
      @scala.inline
      def setXmlBase(value: String): Self = StObject.set(x, "xmlBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlBaseUndefined: Self = StObject.set(x, "xmlBase", js.undefined)
      
      @scala.inline
      def setXmlLang(value: String): Self = StObject.set(x, "xmlLang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlLangUndefined: Self = StObject.set(x, "xmlLang", js.undefined)
      
      @scala.inline
      def setXmlSpace(value: String): Self = StObject.set(x, "xmlSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlSpaceUndefined: Self = StObject.set(x, "xmlSpace", js.undefined)
      
      @scala.inline
      def setXmlns(value: String): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
      
      @scala.inline
      def setXmlnsXlink(value: String): Self = StObject.set(x, "xmlnsXlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlnsXlinkUndefined: Self = StObject.set(x, "xmlnsXlink", js.undefined)
      
      @scala.inline
      def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1(value: Double | String): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
      
      @scala.inline
      def setY2(value: Double | String): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
      
      @scala.inline
      def setYChannelSelector(value: String): Self = StObject.set(x, "yChannelSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYChannelSelectorUndefined: Self = StObject.set(x, "yChannelSelector", js.undefined)
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      @scala.inline
      def setZ(value: Double | String): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZUndefined: Self = StObject.set(x, "z", js.undefined)
      
      @scala.inline
      def setZoomAndPan(value: String): Self = StObject.set(x, "zoomAndPan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomAndPanUndefined: Self = StObject.set(x, "zoomAndPan", js.undefined)
    }
  }
  
  type TextProps = BoxProps
  
  type TextareaProps = Assign[ComponentProps[textarea], BoxOwnProps]
}
