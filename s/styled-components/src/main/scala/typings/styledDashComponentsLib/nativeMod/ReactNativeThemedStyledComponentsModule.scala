package typings
package styledDashComponentsLib.nativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactNativeThemedStyledComponentsModule[T /* <: js.Object */, U /* <: js.Object */] extends js.Object {
  @JSName("ThemeConsumer")
  var ThemeConsumer_Original: reactLib.reactMod.ReactNs.Consumer[T] = js.native
  var ThemeContext: reactLib.reactMod.ReactNs.Context[T] = js.native
  var ThemeProvider: styledDashComponentsLib.styledDashComponentsMod.ThemeProviderComponent[T, U] = js.native
  @JSName("css")
  var css_Original: styledDashComponentsLib.styledDashComponentsMod.ThemedCssFunction[T] = js.native
  @JSName("default")
  var default_Original: ReactNativeStyledInterface[T] = js.native
  // This could be made to assert `target is StyledComponent<any, T>` instead, but that feels not type safe
  @JSName("isStyledComponent")
  var isStyledComponent_Original: js.Function1[
    /* target */ js.Any, 
    /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ scala.Boolean
  ] = js.native
  @JSName("withTheme")
  var withTheme_Original: styledDashComponentsLib.styledDashComponentsMod.WithThemeFnInterface[T] = js.native
  /**
    * **NOTE**: Exotic components are not callable.
    */
  def ThemeConsumer(props: reactLib.reactMod.ReactNs.ConsumerProps[T]): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  def css(
    first: stdLib.TemplateStringsArray,
    interpolations: styledDashComponentsLib.styledDashComponentsMod.SimpleInterpolation*
  ): styledDashComponentsLib.styledDashComponentsMod.FlattenSimpleInterpolation = js.native
  def css(
    first: styledDashComponentsLib.styledDashComponentsMod.CSSObject,
    interpolations: styledDashComponentsLib.styledDashComponentsMod.SimpleInterpolation*
  ): styledDashComponentsLib.styledDashComponentsMod.FlattenSimpleInterpolation = js.native
  def css(
    first: styledDashComponentsLib.styledDashComponentsMod.InterpolationFunction[
      styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[js.Object, AnyIfEmpty[AnyIfEmpty[T]]]
    ],
    interpolations: (styledDashComponentsLib.styledDashComponentsMod.Interpolation[
      styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[js.Object, AnyIfEmpty[AnyIfEmpty[T]]]
    ])*
  ): styledDashComponentsLib.styledDashComponentsMod.FlattenInterpolation[
    styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[js.Object, AnyIfEmpty[AnyIfEmpty[T]]]
  ] = js.native
  @JSName("css")
  def css_FlattenInterpolation(
    first: stdLib.TemplateStringsArray,
    interpolations: (styledDashComponentsLib.styledDashComponentsMod.Interpolation[
      styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[js.Object, AnyIfEmpty[AnyIfEmpty[T]]]
    ])*
  ): styledDashComponentsLib.styledDashComponentsMod.FlattenInterpolation[
    styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[js.Object, AnyIfEmpty[AnyIfEmpty[T]]]
  ] = js.native
  @JSName("css")
  def css_FlattenInterpolation(
    first: styledDashComponentsLib.styledDashComponentsMod.CSSObject,
    interpolations: (styledDashComponentsLib.styledDashComponentsMod.Interpolation[
      styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[js.Object, AnyIfEmpty[AnyIfEmpty[T]]]
    ])*
  ): styledDashComponentsLib.styledDashComponentsMod.FlattenInterpolation[
    styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[js.Object, AnyIfEmpty[AnyIfEmpty[T]]]
  ] = js.native
  @JSName("css")
  def css_PObject[P /* <: js.Object */](
    first: styledDashComponentsLib.styledDashComponentsMod.InterpolationFunction[
      styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[P, AnyIfEmpty[AnyIfEmpty[T]]]
    ],
    interpolations: (styledDashComponentsLib.styledDashComponentsMod.Interpolation[
      styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[P, AnyIfEmpty[AnyIfEmpty[T]]]
    ])*
  ): styledDashComponentsLib.styledDashComponentsMod.FlattenInterpolation[
    styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[P, AnyIfEmpty[AnyIfEmpty[T]]]
  ] = js.native
  @JSName("css")
  def css_PObjectFlattenInterpolation[P /* <: js.Object */](
    first: stdLib.TemplateStringsArray,
    interpolations: (styledDashComponentsLib.styledDashComponentsMod.Interpolation[
      styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[P, AnyIfEmpty[AnyIfEmpty[T]]]
    ])*
  ): styledDashComponentsLib.styledDashComponentsMod.FlattenInterpolation[
    styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[P, AnyIfEmpty[AnyIfEmpty[T]]]
  ] = js.native
  @JSName("css")
  def css_PObjectFlattenInterpolation[P /* <: js.Object */](
    first: styledDashComponentsLib.styledDashComponentsMod.CSSObject,
    interpolations: (styledDashComponentsLib.styledDashComponentsMod.Interpolation[
      styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[P, AnyIfEmpty[AnyIfEmpty[T]]]
    ])*
  ): styledDashComponentsLib.styledDashComponentsMod.FlattenInterpolation[
    styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[P, AnyIfEmpty[AnyIfEmpty[T]]]
  ] = js.native
  def default[C /* <: styledDashComponentsLib.styledDashComponentsMod.AnyStyledComponent */](component: C): styledDashComponentsLib.styledDashComponentsMod.ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsMod.StyledComponentInnerComponent[C], 
    AnyIfEmpty[AnyIfEmpty[T]], 
    styledDashComponentsLib.styledDashComponentsMod.StyledComponentInnerOtherProps[C], 
    styledDashComponentsLib.styledDashComponentsMod.StyledComponentInnerAttrs[C]
  ] = js.native
  @JSName("default")
  def default_CComponentType[C /* <: reactLib.reactMod.ReactNs.ComponentType[_] */](
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: C
  ): styledDashComponentsLib.styledDashComponentsMod.ThemedStyledFunction[C, AnyIfEmpty[AnyIfEmpty[T]], js.Object, scala.Nothing] = js.native
  // This could be made to assert `target is StyledComponent<any, T>` instead, but that feels not type safe
  def isStyledComponent(target: js.Any): /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ scala.Boolean = js.native
  def withTheme[C /* <: reactLib.reactMod.ReactNs.ComponentType[_] */](
    // this check is roundabout because the extends clause above would
  // not allow any component that accepts _more_ than theme as a prop
  component: C
  ): reactLib.reactMod.ReactNs.ForwardRefExoticComponent[
    styledDashComponentsLib.WithOptionalTheme[reactLib.reactMod.ReactNs.ComponentPropsWithRef[C], AnyIfEmpty[AnyIfEmpty[T]]]
  ] = js.native
}

