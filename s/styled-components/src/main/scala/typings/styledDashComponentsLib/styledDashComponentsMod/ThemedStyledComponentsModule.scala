package typings
package styledDashComponentsLib.styledDashComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemedStyledComponentsModule[T /* <: js.Object */, U /* <: js.Object */] extends js.Object {
  var ServerStyleSheet: org.scalablytyped.runtime.Instantiable0[ServerStyleSheet] = js.native
  var StyleSheetManager: org.scalablytyped.runtime.Instantiable0[StyleSheetManager] = js.native
  @JSName("ThemeConsumer")
  var ThemeConsumer_Original: reactLib.reactMod.Consumer[T] = js.native
  var ThemeContext: reactLib.reactMod.Context[T] = js.native
  var ThemeProvider: ThemeProviderComponent[T, U] = js.native
  @JSName("css")
  var css_Original: ThemedCssFunction[T] = js.native
  @JSName("default")
  var default_Original: ThemedStyledInterface[T] = js.native
  // This could be made to assert `target is StyledComponent<any, T>` instead, but that feels not type safe
  @JSName("isStyledComponent")
  var isStyledComponent_Original: js.Function1[
    /* target */ js.Any, 
    /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ scala.Boolean
  ] = js.native
  @JSName("withTheme")
  var withTheme_Original: WithThemeFnInterface[T] = js.native
  /**
    * **NOTE**: Exotic components are not callable.
    */
  def ThemeConsumer(props: reactLib.reactMod.ConsumerProps[T]): reactLib.reactMod.ReactElement[_] | scala.Null = js.native
  def createGlobalStyle[P /* <: js.Object */](first: stdLib.TemplateStringsArray, interpolations: (Interpolation[ThemedStyledProps[P, T]])*): GlobalStyleComponent[P, T] = js.native
  def createGlobalStyle[P /* <: js.Object */](first: CSSObject, interpolations: (Interpolation[ThemedStyledProps[P, T]])*): GlobalStyleComponent[P, T] = js.native
  def createGlobalStyle[P /* <: js.Object */](
    first: InterpolationFunction[ThemedStyledProps[P, T]],
    interpolations: (Interpolation[ThemedStyledProps[P, T]])*
  ): GlobalStyleComponent[P, T] = js.native
  def css(first: stdLib.TemplateStringsArray, interpolations: SimpleInterpolation*): FlattenSimpleInterpolation = js.native
  def css(first: CSSObject, interpolations: SimpleInterpolation*): FlattenSimpleInterpolation = js.native
  def css(
    first: InterpolationFunction[
      ThemedStyledProps[
        js.Object, 
        styledDashComponentsLib.AnyIfEmpty[styledDashComponentsLib.AnyIfEmpty[T]]
      ]
    ],
    interpolations: (Interpolation[
      ThemedStyledProps[
        js.Object, 
        styledDashComponentsLib.AnyIfEmpty[styledDashComponentsLib.AnyIfEmpty[T]]
      ]
    ])*
  ): FlattenInterpolation[
    ThemedStyledProps[
      js.Object, 
      styledDashComponentsLib.AnyIfEmpty[styledDashComponentsLib.AnyIfEmpty[T]]
    ]
  ] = js.native
  @JSName("css")
  def css_FlattenInterpolation(
    first: stdLib.TemplateStringsArray,
    interpolations: (Interpolation[
      ThemedStyledProps[
        js.Object, 
        styledDashComponentsLib.AnyIfEmpty[styledDashComponentsLib.AnyIfEmpty[T]]
      ]
    ])*
  ): FlattenInterpolation[
    ThemedStyledProps[
      js.Object, 
      styledDashComponentsLib.AnyIfEmpty[styledDashComponentsLib.AnyIfEmpty[T]]
    ]
  ] = js.native
  @JSName("css")
  def css_FlattenInterpolation(
    first: CSSObject,
    interpolations: (Interpolation[
      ThemedStyledProps[
        js.Object, 
        styledDashComponentsLib.AnyIfEmpty[styledDashComponentsLib.AnyIfEmpty[T]]
      ]
    ])*
  ): FlattenInterpolation[
    ThemedStyledProps[
      js.Object, 
      styledDashComponentsLib.AnyIfEmpty[styledDashComponentsLib.AnyIfEmpty[T]]
    ]
  ] = js.native
  @JSName("css")
  def css_PObject[P /* <: js.Object */](
    first: InterpolationFunction[
      ThemedStyledProps[P, styledDashComponentsLib.AnyIfEmpty[styledDashComponentsLib.AnyIfEmpty[T]]]
    ],
    interpolations: (Interpolation[
      ThemedStyledProps[P, styledDashComponentsLib.AnyIfEmpty[styledDashComponentsLib.AnyIfEmpty[T]]]
    ])*
  ): FlattenInterpolation[
    ThemedStyledProps[P, styledDashComponentsLib.AnyIfEmpty[styledDashComponentsLib.AnyIfEmpty[T]]]
  ] = js.native
  @JSName("css")
  def css_PObjectFlattenInterpolation[P /* <: js.Object */](
    first: stdLib.TemplateStringsArray,
    interpolations: (Interpolation[
      ThemedStyledProps[P, styledDashComponentsLib.AnyIfEmpty[styledDashComponentsLib.AnyIfEmpty[T]]]
    ])*
  ): FlattenInterpolation[
    ThemedStyledProps[P, styledDashComponentsLib.AnyIfEmpty[styledDashComponentsLib.AnyIfEmpty[T]]]
  ] = js.native
  @JSName("css")
  def css_PObjectFlattenInterpolation[P /* <: js.Object */](
    first: CSSObject,
    interpolations: (Interpolation[
      ThemedStyledProps[P, styledDashComponentsLib.AnyIfEmpty[styledDashComponentsLib.AnyIfEmpty[T]]]
    ])*
  ): FlattenInterpolation[
    ThemedStyledProps[P, styledDashComponentsLib.AnyIfEmpty[styledDashComponentsLib.AnyIfEmpty[T]]]
  ] = js.native
  def default[C /* <: AnyStyledComponent */](component: C): ThemedStyledFunction[
    StyledComponentInnerComponent[C], 
    styledDashComponentsLib.AnyIfEmpty[styledDashComponentsLib.AnyIfEmpty[T]], 
    StyledComponentInnerOtherProps[C], 
    StyledComponentInnerAttrs[C]
  ] = js.native
  @JSName("default")
  def default_CString[C /* <: java.lang.String */](
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: C
  ): ThemedStyledFunction[
    C, 
    styledDashComponentsLib.AnyIfEmpty[styledDashComponentsLib.AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  // This could be made to assert `target is StyledComponent<any, T>` instead, but that feels not type safe
  def isStyledComponent(target: js.Any): /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ scala.Boolean = js.native
  // unfortunately keyframes can't interpolate props from the theme
  def keyframes(strings: stdLib.TemplateStringsArray, interpolations: SimpleInterpolation*): Keyframes = js.native
  def keyframes(strings: CSSKeyframes, interpolations: SimpleInterpolation*): Keyframes = js.native
  def withTheme[C /* <: reactLib.reactMod.ComponentType[_] */](
    // this check is roundabout because the extends clause above would
  // not allow any component that accepts _more_ than theme as a prop
  component: C
  ): reactLib.reactMod.ForwardRefExoticComponent[
    styledDashComponentsLib.WithOptionalTheme[
      reactLib.reactMod.ComponentPropsWithRef[C], 
      styledDashComponentsLib.AnyIfEmpty[styledDashComponentsLib.AnyIfEmpty[T]]
    ]
  ] = js.native
}

