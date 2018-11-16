package typings
package styledDashComponentsLib.styledDashComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemedStyledComponentsModule[T /* <: js.Object */] extends js.Object {
  @JSName("ThemeConsumer")
  var ThemeConsumer_Original: reactLib.reactMod.ReactNs.Consumer[T] = js.native
  var ThemeContext: reactLib.reactMod.ReactNs.Context[T] = js.native
  var ThemeProvider: ThemeProviderComponent[T] = js.native
  @JSName("css")
  var css_Original: ThemedCssFunction[T] = js.native
  @JSName("default")
  var default_Original: ThemedStyledInterface[T] = js.native
  @JSName("withTheme")
  var withTheme_Original: WithThemeFnInterface[T] = js.native
  /**
           * **NOTE**: Exotic components are not callable.
           */
  def ThemeConsumer(props: reactLib.reactMod.ReactNs.ConsumerProps[T]): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  def createGlobalStyle(cssObject: CSSObject): GlobalStyleComponent[js.Object, T] = js.native
  def createGlobalStyle[P](func: InterpolationFunction[ThemedStyledProps[P, T]]): GlobalStyleComponent[P, T] = js.native
  def createGlobalStyle[P](strings: stdLib.TemplateStringsArray, interpolations: (Interpolation[ThemedStyledProps[P, T]])*): GlobalStyleComponent[P, T] = js.native
  def css(cssObject: CSSObject): js.Array[InterpolationValue] = js.native
  def css(strings: stdLib.TemplateStringsArray, interpolations: SimpleInterpolation*): js.Array[InterpolationValue] = js.native
  def css[P](func: InterpolationFunction[ThemedStyledProps[P, T]]): js.Array[FlattenInterpolation[ThemedStyledProps[P, T]]] = js.native
  @JSName("css")
  def css_P[P](strings: stdLib.TemplateStringsArray, interpolations: (Interpolation[ThemedStyledProps[P, T]])*): js.Array[FlattenInterpolation[ThemedStyledProps[P, T]]] = js.native
  def default[C /* <: AnyStyledComponent */](component: C): ThemedStyledFunction[
    styledDashComponentsLib.StyledComponentInnerComponent[C], 
    T, 
    styledDashComponentsLib.StyledComponentInnerOtherProps[C], 
    styledDashComponentsLib.StyledComponentInnerAttrs[C]
  ] = js.native
  @JSName("default")
  def default_CComponentType[C /* <: reactLib.reactMod.ReactNs.ComponentType[_] */](
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: C
  ): ThemedStyledFunction[C, T, js.Object, scala.Nothing] = js.native
  @JSName("default")
  def default_TTagString[TTag /* <: /* LimitUnionLength: was union type with length 170 */java.lang.String */](tag: TTag): ThemedStyledFunction[TTag, T, js.Object, scala.Nothing] = js.native
  def keyframes(cssObject: CSSObject): Keyframes = js.native
  def keyframes(strings: stdLib.TemplateStringsArray, interpolations: SimpleInterpolation*): Keyframes = js.native
  def withTheme[C /* <: reactLib.reactMod.ReactNs.ComponentType[_] */](
    // this check is roundabout because the extends clause above would
  // not allow any component that accepts _more_ than theme as a prop
  component: C
  ): reactLib.reactMod.ReactNs.ForwardRefExoticComponent[
    styledDashComponentsLib.WithOptionalTheme[reactLib.reactMod.ReactNs.ComponentPropsWithRef[C], T]
  ] = js.native
}

