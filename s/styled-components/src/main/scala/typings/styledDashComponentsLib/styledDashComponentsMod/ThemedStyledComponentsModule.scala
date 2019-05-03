package typings
package styledDashComponentsLib.styledDashComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemedStyledComponentsModule[T /* <: js.Object */, U /* <: js.Object */] extends js.Object {
  var ServerStyleSheet: org.scalablytyped.runtime.Instantiable0[ServerStyleSheet] = js.native
  var StyleSheetManager: org.scalablytyped.runtime.Instantiable0[StyleSheetManager] = js.native
  var ThemeConsumer: reactLib.reactMod.Consumer[T] = js.native
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
  def createGlobalStyle[P /* <: js.Object */](first: stdLib.TemplateStringsArray, interpolations: (Interpolation[ThemedStyledProps[P, T]])*): GlobalStyleComponent[P, T] = js.native
  def createGlobalStyle[P /* <: js.Object */](first: CSSObject, interpolations: (Interpolation[ThemedStyledProps[P, T]])*): GlobalStyleComponent[P, T] = js.native
  def createGlobalStyle[P /* <: js.Object */](
    first: InterpolationFunction[ThemedStyledProps[P, T]],
    interpolations: (Interpolation[ThemedStyledProps[P, T]])*
  ): GlobalStyleComponent[P, T] = js.native
  def css(first: stdLib.TemplateStringsArray, interpolations: SimpleInterpolation*): FlattenSimpleInterpolation = js.native
  def css(first: CSSObject, interpolations: SimpleInterpolation*): FlattenSimpleInterpolation = js.native
  def css(
    first: InterpolationFunction[ThemedStyledProps[js.Object, AnyIfEmpty[AnyIfEmpty[T]]]],
    interpolations: (Interpolation[ThemedStyledProps[js.Object, AnyIfEmpty[AnyIfEmpty[T]]]])*
  ): FlattenInterpolation[ThemedStyledProps[js.Object, AnyIfEmpty[AnyIfEmpty[T]]]] = js.native
  @JSName("css")
  def css_FlattenInterpolation(
    first: stdLib.TemplateStringsArray,
    interpolations: (Interpolation[ThemedStyledProps[js.Object, AnyIfEmpty[AnyIfEmpty[T]]]])*
  ): FlattenInterpolation[ThemedStyledProps[js.Object, AnyIfEmpty[AnyIfEmpty[T]]]] = js.native
  @JSName("css")
  def css_FlattenInterpolation(
    first: CSSObject,
    interpolations: (Interpolation[ThemedStyledProps[js.Object, AnyIfEmpty[AnyIfEmpty[T]]]])*
  ): FlattenInterpolation[ThemedStyledProps[js.Object, AnyIfEmpty[AnyIfEmpty[T]]]] = js.native
  @JSName("css")
  def css_PObject[P /* <: js.Object */](
    first: InterpolationFunction[ThemedStyledProps[P, AnyIfEmpty[AnyIfEmpty[T]]]],
    interpolations: (Interpolation[ThemedStyledProps[P, AnyIfEmpty[AnyIfEmpty[T]]]])*
  ): FlattenInterpolation[ThemedStyledProps[P, AnyIfEmpty[AnyIfEmpty[T]]]] = js.native
  @JSName("css")
  def css_PObjectFlattenInterpolation[P /* <: js.Object */](
    first: stdLib.TemplateStringsArray,
    interpolations: (Interpolation[ThemedStyledProps[P, AnyIfEmpty[AnyIfEmpty[T]]]])*
  ): FlattenInterpolation[ThemedStyledProps[P, AnyIfEmpty[AnyIfEmpty[T]]]] = js.native
  @JSName("css")
  def css_PObjectFlattenInterpolation[P /* <: js.Object */](
    first: CSSObject,
    interpolations: (Interpolation[ThemedStyledProps[P, AnyIfEmpty[AnyIfEmpty[T]]]])*
  ): FlattenInterpolation[ThemedStyledProps[P, AnyIfEmpty[AnyIfEmpty[T]]]] = js.native
  def default[C /* <: AnyStyledComponent */](component: C): ThemedStyledFunction[
    StyledComponentInnerComponent[C], 
    AnyIfEmpty[AnyIfEmpty[T]], 
    StyledComponentInnerOtherProps[C], 
    StyledComponentInnerAttrs[C]
  ] = js.native
  @JSName("default")
  def `default_C<union>`[C /* <: (reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState]) | reactLib.reactMod.FunctionComponent[_] */](
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: C
  ): ThemedStyledFunction[C, AnyIfEmpty[AnyIfEmpty[T]], js.Object, scala.Nothing] = js.native
  @JSName("default")
  def default_a(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.a
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.a, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_abbr(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.abbr
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.abbr, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_address(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.address
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.address, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_animate(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.animate
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.animate, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_animateMotion(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.animateMotion
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.animateMotion, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_animateTransform(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.animateTransform
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.animateTransform, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_area(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.area
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.area, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_article(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.article
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.article, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_aside(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.aside
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.aside, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_audio(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.audio
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.audio, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_b(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.b
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.b, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_base(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.base
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.base, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_bdi(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.bdi
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.bdi, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_bdo(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.bdo
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.bdo, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_big(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.big
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.big, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_blockquote(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.blockquote
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.blockquote, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_body(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.body
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.body, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_br(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.br
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.br, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_button(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.button
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.button, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_canvas(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.canvas
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.canvas, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_caption(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.caption
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.caption, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_circle(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.circle
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.circle, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_cite(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.cite
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.cite, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_clipPath(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.clipPath
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.clipPath, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_code(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.code
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.code, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_col(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.col
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.col, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_colgroup(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.colgroup
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.colgroup, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_data(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.data
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.data, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_datalist(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.datalist
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.datalist, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_dd(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.dd
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.dd, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_defs(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.defs
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.defs, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_del(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.del
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.del, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_desc(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.desc
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.desc, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_details(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.details
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.details, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_dfn(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.dfn
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.dfn, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_dialog(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.dialog
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.dialog, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_div(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.div
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.div, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_dl(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.dl
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.dl, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_dt(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.dt
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.dt, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_ellipse(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.ellipse
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.ellipse, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_em(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.em
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.em, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_embed(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.embed
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.embed, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_feBlend(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.feBlend
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.feBlend, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_feColorMatrix(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.feColorMatrix
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.feColorMatrix, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_feComponentTransfer(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.feComponentTransfer
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.feComponentTransfer, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_feComposite(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.feComposite
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.feComposite, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_feConvolveMatrix(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.feConvolveMatrix
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.feConvolveMatrix, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_feDiffuseLighting(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.feDiffuseLighting
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.feDiffuseLighting, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_feDisplacementMap(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.feDisplacementMap
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.feDisplacementMap, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_feDistantLight(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.feDistantLight
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.feDistantLight, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_feDropShadow(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.feDropShadow
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.feDropShadow, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_feFlood(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.feFlood
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.feFlood, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_feFuncA(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.feFuncA
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.feFuncA, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_feFuncB(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.feFuncB
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.feFuncB, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_feFuncG(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.feFuncG
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.feFuncG, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_feFuncR(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.feFuncR
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.feFuncR, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_feGaussianBlur(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.feGaussianBlur
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.feGaussianBlur, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_feImage(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.feImage
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.feImage, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_feMerge(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.feMerge
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.feMerge, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_feMergeNode(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.feMergeNode
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.feMergeNode, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_feMorphology(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.feMorphology
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.feMorphology, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_feOffset(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.feOffset
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.feOffset, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_fePointLight(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.fePointLight
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.fePointLight, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_feSpecularLighting(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.feSpecularLighting
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.feSpecularLighting, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_feSpotLight(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.feSpotLight
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.feSpotLight, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_feTile(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.feTile
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.feTile, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_feTurbulence(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.feTurbulence
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.feTurbulence, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_fieldset(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.fieldset
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.fieldset, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_figcaption(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.figcaption
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.figcaption, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_figure(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.figure
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.figure, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_filter(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.filter
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.filter, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_footer(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.footer
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.footer, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_foreignObject(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.foreignObject
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.foreignObject, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_form(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.form
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.form, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_g(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.g
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.g, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_h1(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.h1
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.h1, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_h2(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.h2
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.h2, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_h3(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.h3
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.h3, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_h4(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.h4
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.h4, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_h5(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.h5
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.h5, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_h6(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.h6
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.h6, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_head(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.head
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.head, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_header(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.header
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.header, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_hgroup(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.hgroup
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.hgroup, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_hr(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.hr
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.hr, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_html(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.html
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.html, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_i(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.i
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.i, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_iframe(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.iframe
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.iframe, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_image(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.image
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.image, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_img(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.img
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.img, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_input(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.input
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.input, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_ins(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.ins
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.ins, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_kbd(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.kbd
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.kbd, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_keygen(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.keygen
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.keygen, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_label(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.label
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.label, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_legend(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.legend
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.legend, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_li(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.li
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.li, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_line(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.line
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.line, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_linearGradient(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.linearGradient
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.linearGradient, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_link(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.link
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.link, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_main(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.main
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.main, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_map(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.map
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.map, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_mark(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.mark
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.mark, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_marker(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.marker
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.marker, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_mask(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.mask
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.mask, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_menu(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.menu
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.menu, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_menuitem(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.menuitem
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.menuitem, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_meta(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.meta
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.meta, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_metadata(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.metadata
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.metadata, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_meter(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.meter
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.meter, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_mpath(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.mpath
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.mpath, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_nav(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.nav
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.nav, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_noindex(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.noindex
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.noindex, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_noscript(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.noscript
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.noscript, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_object(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.`object`
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.`object`, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_ol(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.ol
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.ol, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_optgroup(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.optgroup
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.optgroup, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_option(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.option
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.option, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_output(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.output
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.output, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_p(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.p
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.p, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_param(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.param
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.param, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_path(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.path
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.path, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_pattern(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.pattern
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.pattern, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_picture(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.picture
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.picture, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_polygon(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.polygon
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.polygon, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_polyline(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.polyline
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.polyline, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_pre(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.pre
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.pre, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_progress(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.progress
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.progress, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_q(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.q
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.q, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_radialGradient(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.radialGradient
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.radialGradient, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_rect(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.rect
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.rect, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_rp(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.rp
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.rp, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_rt(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.rt
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.rt, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_ruby(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.ruby
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.ruby, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_s(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.s
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.s, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_samp(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.samp
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.samp, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_script(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.script
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.script, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_section(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.section
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.section, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_select(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.select
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.select, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_small(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.small
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.small, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_source(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.source
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.source, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_span(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.span
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.span, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_stop(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.stop
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.stop, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_strong(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.strong
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.strong, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_style(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.style
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.style, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_sub(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.sub
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.sub, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_summary(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.summary
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.summary, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_sup(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.sup
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.sup, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_svg(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.svg
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.svg, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_switch(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.switch
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.switch, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_symbol(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.symbol
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.symbol, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_table(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.table
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.table, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_tbody(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.tbody
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.tbody, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_td(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.td
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.td, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_text(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.text
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.text, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_textPath(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.textPath
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.textPath, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_textarea(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.textarea
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.textarea, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_tfoot(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.tfoot
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.tfoot, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_th(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.th
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.th, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_thead(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.thead
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.thead, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_time(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.time
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.time, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_title(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.title
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.title, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_tr(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.tr
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.tr, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_track(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.track
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.track, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_tspan(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.tspan
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.tspan, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_u(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.u
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.u, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_ul(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.ul
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.ul, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_use(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.use
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.use, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_var(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.`var`
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.`var`, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_video(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.video
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.video, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_view(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.view
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.view, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_wbr(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.wbr
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.wbr, 
    AnyIfEmpty[AnyIfEmpty[T]], 
    js.Object, 
    scala.Nothing
  ] = js.native
  @JSName("default")
  def default_webview(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: styledDashComponentsLib.styledDashComponentsLibStrings.webview
  ): ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsLibStrings.webview, 
    AnyIfEmpty[AnyIfEmpty[T]], 
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
    WithOptionalTheme[reactLib.reactMod.ComponentPropsWithRef[C], AnyIfEmpty[AnyIfEmpty[T]]]
  ] = js.native
}

