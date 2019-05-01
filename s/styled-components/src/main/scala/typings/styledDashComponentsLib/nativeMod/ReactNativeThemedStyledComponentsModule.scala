package typings
package styledDashComponentsLib.nativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactNativeThemedStyledComponentsModule[T /* <: js.Object */, U /* <: js.Object */] extends js.Object {
  var ThemeConsumer: reactLib.reactMod.Consumer[T] = js.native
  var ThemeContext: reactLib.reactMod.Context[T] = js.native
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
      styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[
        js.Object, 
        styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[T]]
      ]
    ],
    interpolations: (styledDashComponentsLib.styledDashComponentsMod.Interpolation[
      styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[
        js.Object, 
        styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[T]]
      ]
    ])*
  ): styledDashComponentsLib.styledDashComponentsMod.FlattenInterpolation[
    styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[
      js.Object, 
      styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[T]]
    ]
  ] = js.native
  @JSName("css")
  def css_FlattenInterpolation(
    first: stdLib.TemplateStringsArray,
    interpolations: (styledDashComponentsLib.styledDashComponentsMod.Interpolation[
      styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[
        js.Object, 
        styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[T]]
      ]
    ])*
  ): styledDashComponentsLib.styledDashComponentsMod.FlattenInterpolation[
    styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[
      js.Object, 
      styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[T]]
    ]
  ] = js.native
  @JSName("css")
  def css_FlattenInterpolation(
    first: styledDashComponentsLib.styledDashComponentsMod.CSSObject,
    interpolations: (styledDashComponentsLib.styledDashComponentsMod.Interpolation[
      styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[
        js.Object, 
        styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[T]]
      ]
    ])*
  ): styledDashComponentsLib.styledDashComponentsMod.FlattenInterpolation[
    styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[
      js.Object, 
      styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[T]]
    ]
  ] = js.native
  @JSName("css")
  def css_PObject[P /* <: js.Object */](
    first: styledDashComponentsLib.styledDashComponentsMod.InterpolationFunction[
      styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[
        P, 
        styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[T]]
      ]
    ],
    interpolations: (styledDashComponentsLib.styledDashComponentsMod.Interpolation[
      styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[
        P, 
        styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[T]]
      ]
    ])*
  ): styledDashComponentsLib.styledDashComponentsMod.FlattenInterpolation[
    styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[
      P, 
      styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[T]]
    ]
  ] = js.native
  @JSName("css")
  def css_PObjectFlattenInterpolation[P /* <: js.Object */](
    first: stdLib.TemplateStringsArray,
    interpolations: (styledDashComponentsLib.styledDashComponentsMod.Interpolation[
      styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[
        P, 
        styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[T]]
      ]
    ])*
  ): styledDashComponentsLib.styledDashComponentsMod.FlattenInterpolation[
    styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[
      P, 
      styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[T]]
    ]
  ] = js.native
  @JSName("css")
  def css_PObjectFlattenInterpolation[P /* <: js.Object */](
    first: styledDashComponentsLib.styledDashComponentsMod.CSSObject,
    interpolations: (styledDashComponentsLib.styledDashComponentsMod.Interpolation[
      styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[
        P, 
        styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[T]]
      ]
    ])*
  ): styledDashComponentsLib.styledDashComponentsMod.FlattenInterpolation[
    styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[
      P, 
      styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[T]]
    ]
  ] = js.native
  def default[C /* <: styledDashComponentsLib.styledDashComponentsMod.AnyStyledComponent */](component: C): styledDashComponentsLib.styledDashComponentsMod.ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsMod.StyledComponentInnerComponent[C], 
    AnyIfEmpty[AnyIfEmpty[T]], 
    styledDashComponentsLib.styledDashComponentsMod.StyledComponentInnerOtherProps[C], 
    styledDashComponentsLib.styledDashComponentsMod.StyledComponentInnerAttrs[C]
  ] = js.native
  @JSName("default")
  def default_CComponentType[C /* <: reactLib.reactMod.ComponentType[_] */](
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: C
  ): styledDashComponentsLib.styledDashComponentsMod.ThemedStyledFunction[C, AnyIfEmpty[AnyIfEmpty[T]], js.Object, scala.Nothing] = js.native
  // This could be made to assert `target is StyledComponent<any, T>` instead, but that feels not type safe
  def isStyledComponent(target: js.Any): /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ scala.Boolean = js.native
  def withTheme[C /* <: reactLib.reactMod.ComponentType[_] */](
    // this check is roundabout because the extends clause above would
  // not allow any component that accepts _more_ than theme as a prop
  component: C
  ): reactLib.reactMod.ForwardRefExoticComponent[
    styledDashComponentsLib.styledDashComponentsMod.WithOptionalTheme[
      reactLib.reactMod.ComponentPropsWithRef[C], 
      styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[T]]
    ]
  ] = js.native
}

