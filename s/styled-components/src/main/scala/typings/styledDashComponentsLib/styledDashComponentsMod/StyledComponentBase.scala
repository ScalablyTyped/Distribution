package typings
package styledDashComponentsLib.styledDashComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent styled-components.ForwardRefExoticBase<styled-components.styled-components.StyledComponentProps<C, T, O, A>> */
@js.native
trait StyledComponentBase[C /* <: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any */, T /* <: js.Object */, O /* <: js.Object */, A /* <: java.lang.String */] extends js.Object {
  @JSName("$$typeof")
  var $$typeof: js.Symbol = js.native
  var defaultProps: js.UndefOr[
    stdLib.Partial[
      StyledComponentProps[C, reactLib.reactMod.ForwardRefExoticComponent[StyledComponentProps[C, T, O, A]], O, A]
    ]
  ] = js.native
  var displayName: js.UndefOr[java.lang.String] = js.native
  // add our own fake call signature to implement the polymorphic 'as' prop
  // NOTE: TS <3.2 will refuse to infer the generic and this component becomes impossible to use in JSX
  // just the presence of the overload is enough to break JSX
  //
  // TODO (TypeScript 3.2): actually makes the 'as' prop polymorphic
  // (
  //     props: StyledComponentProps<C, T, O, A> & { as?: never }
  //   ): React.ReactElement<StyledComponentProps<C, T, O, A>>
  // <AsC extends keyof JSX.IntrinsicElements | React.ComponentType<any> = C>(
  //   props: StyledComponentPropsWithAs<AsC, T, O, A>
  // ): React.ReactElement<StyledComponentPropsWithAs<AsC, T, O, A>>
  // TODO (TypeScript 3.2): delete this overload
  def apply(props: (StyledComponentProps[C, T, O, A]) with styledDashComponentsLib.Anon_A): reactLib.reactMod.ReactElement = js.native
  def withComponent[WithC /* <: (reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState]) | reactLib.reactMod.FunctionComponent[_] */](component: WithC): StyledComponent[WithC, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_WithCAnyStyledComponent[WithC /* <: AnyStyledComponent */](component: WithC): StyledComponent[
    StyledComponentInnerComponent[WithC], 
    T, 
    O with StyledComponentInnerOtherProps[WithC], 
    A | StyledComponentInnerAttrs[WithC]
  ] = js.native
  @JSName("withComponent")
  def withComponent_a(component: styledDashComponentsLib.styledDashComponentsLibStrings.a): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.a, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_abbr(component: styledDashComponentsLib.styledDashComponentsLibStrings.abbr): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.abbr, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_address(component: styledDashComponentsLib.styledDashComponentsLibStrings.address): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.address, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_animate(component: styledDashComponentsLib.styledDashComponentsLibStrings.animate): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.animate, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_animateMotion(component: styledDashComponentsLib.styledDashComponentsLibStrings.animateMotion): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.animateMotion, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_animateTransform(component: styledDashComponentsLib.styledDashComponentsLibStrings.animateTransform): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.animateTransform, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_area(component: styledDashComponentsLib.styledDashComponentsLibStrings.area): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.area, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_article(component: styledDashComponentsLib.styledDashComponentsLibStrings.article): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.article, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_aside(component: styledDashComponentsLib.styledDashComponentsLibStrings.aside): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.aside, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_audio(component: styledDashComponentsLib.styledDashComponentsLibStrings.audio): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.audio, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_b(component: styledDashComponentsLib.styledDashComponentsLibStrings.b): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.b, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_base(component: styledDashComponentsLib.styledDashComponentsLibStrings.base): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.base, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_bdi(component: styledDashComponentsLib.styledDashComponentsLibStrings.bdi): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.bdi, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_bdo(component: styledDashComponentsLib.styledDashComponentsLibStrings.bdo): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.bdo, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_big(component: styledDashComponentsLib.styledDashComponentsLibStrings.big): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.big, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_blockquote(component: styledDashComponentsLib.styledDashComponentsLibStrings.blockquote): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.blockquote, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_body(component: styledDashComponentsLib.styledDashComponentsLibStrings.body): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.body, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_br(component: styledDashComponentsLib.styledDashComponentsLibStrings.br): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.br, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_button(component: styledDashComponentsLib.styledDashComponentsLibStrings.button): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.button, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_canvas(component: styledDashComponentsLib.styledDashComponentsLibStrings.canvas): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.canvas, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_caption(component: styledDashComponentsLib.styledDashComponentsLibStrings.caption): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.caption, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_circle(component: styledDashComponentsLib.styledDashComponentsLibStrings.circle): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.circle, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_cite(component: styledDashComponentsLib.styledDashComponentsLibStrings.cite): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.cite, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_clipPath(component: styledDashComponentsLib.styledDashComponentsLibStrings.clipPath): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.clipPath, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_code(component: styledDashComponentsLib.styledDashComponentsLibStrings.code): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.code, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_col(component: styledDashComponentsLib.styledDashComponentsLibStrings.col): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.col, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_colgroup(component: styledDashComponentsLib.styledDashComponentsLibStrings.colgroup): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.colgroup, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_data(component: styledDashComponentsLib.styledDashComponentsLibStrings.data): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.data, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_datalist(component: styledDashComponentsLib.styledDashComponentsLibStrings.datalist): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.datalist, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_dd(component: styledDashComponentsLib.styledDashComponentsLibStrings.dd): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.dd, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_defs(component: styledDashComponentsLib.styledDashComponentsLibStrings.defs): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.defs, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_del(component: styledDashComponentsLib.styledDashComponentsLibStrings.del): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.del, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_desc(component: styledDashComponentsLib.styledDashComponentsLibStrings.desc): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.desc, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_details(component: styledDashComponentsLib.styledDashComponentsLibStrings.details): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.details, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_dfn(component: styledDashComponentsLib.styledDashComponentsLibStrings.dfn): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.dfn, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_dialog(component: styledDashComponentsLib.styledDashComponentsLibStrings.dialog): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.dialog, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_div(component: styledDashComponentsLib.styledDashComponentsLibStrings.div): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.div, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_dl(component: styledDashComponentsLib.styledDashComponentsLibStrings.dl): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.dl, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_dt(component: styledDashComponentsLib.styledDashComponentsLibStrings.dt): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.dt, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_ellipse(component: styledDashComponentsLib.styledDashComponentsLibStrings.ellipse): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.ellipse, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_em(component: styledDashComponentsLib.styledDashComponentsLibStrings.em): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.em, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_embed(component: styledDashComponentsLib.styledDashComponentsLibStrings.embed): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.embed, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feBlend(component: styledDashComponentsLib.styledDashComponentsLibStrings.feBlend): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.feBlend, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feColorMatrix(component: styledDashComponentsLib.styledDashComponentsLibStrings.feColorMatrix): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.feColorMatrix, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feComponentTransfer(component: styledDashComponentsLib.styledDashComponentsLibStrings.feComponentTransfer): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.feComponentTransfer, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feComposite(component: styledDashComponentsLib.styledDashComponentsLibStrings.feComposite): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.feComposite, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feConvolveMatrix(component: styledDashComponentsLib.styledDashComponentsLibStrings.feConvolveMatrix): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.feConvolveMatrix, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feDiffuseLighting(component: styledDashComponentsLib.styledDashComponentsLibStrings.feDiffuseLighting): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.feDiffuseLighting, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feDisplacementMap(component: styledDashComponentsLib.styledDashComponentsLibStrings.feDisplacementMap): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.feDisplacementMap, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feDistantLight(component: styledDashComponentsLib.styledDashComponentsLibStrings.feDistantLight): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.feDistantLight, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feDropShadow(component: styledDashComponentsLib.styledDashComponentsLibStrings.feDropShadow): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.feDropShadow, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feFlood(component: styledDashComponentsLib.styledDashComponentsLibStrings.feFlood): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.feFlood, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feFuncA(component: styledDashComponentsLib.styledDashComponentsLibStrings.feFuncA): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.feFuncA, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feFuncB(component: styledDashComponentsLib.styledDashComponentsLibStrings.feFuncB): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.feFuncB, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feFuncG(component: styledDashComponentsLib.styledDashComponentsLibStrings.feFuncG): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.feFuncG, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feFuncR(component: styledDashComponentsLib.styledDashComponentsLibStrings.feFuncR): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.feFuncR, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feGaussianBlur(component: styledDashComponentsLib.styledDashComponentsLibStrings.feGaussianBlur): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.feGaussianBlur, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feImage(component: styledDashComponentsLib.styledDashComponentsLibStrings.feImage): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.feImage, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feMerge(component: styledDashComponentsLib.styledDashComponentsLibStrings.feMerge): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.feMerge, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feMergeNode(component: styledDashComponentsLib.styledDashComponentsLibStrings.feMergeNode): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.feMergeNode, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feMorphology(component: styledDashComponentsLib.styledDashComponentsLibStrings.feMorphology): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.feMorphology, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feOffset(component: styledDashComponentsLib.styledDashComponentsLibStrings.feOffset): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.feOffset, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_fePointLight(component: styledDashComponentsLib.styledDashComponentsLibStrings.fePointLight): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.fePointLight, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feSpecularLighting(component: styledDashComponentsLib.styledDashComponentsLibStrings.feSpecularLighting): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.feSpecularLighting, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feSpotLight(component: styledDashComponentsLib.styledDashComponentsLibStrings.feSpotLight): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.feSpotLight, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feTile(component: styledDashComponentsLib.styledDashComponentsLibStrings.feTile): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.feTile, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feTurbulence(component: styledDashComponentsLib.styledDashComponentsLibStrings.feTurbulence): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.feTurbulence, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_fieldset(component: styledDashComponentsLib.styledDashComponentsLibStrings.fieldset): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.fieldset, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_figcaption(component: styledDashComponentsLib.styledDashComponentsLibStrings.figcaption): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.figcaption, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_figure(component: styledDashComponentsLib.styledDashComponentsLibStrings.figure): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.figure, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_filter(component: styledDashComponentsLib.styledDashComponentsLibStrings.filter): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.filter, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_footer(component: styledDashComponentsLib.styledDashComponentsLibStrings.footer): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.footer, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_foreignObject(component: styledDashComponentsLib.styledDashComponentsLibStrings.foreignObject): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.foreignObject, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_form(component: styledDashComponentsLib.styledDashComponentsLibStrings.form): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.form, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_g(component: styledDashComponentsLib.styledDashComponentsLibStrings.g): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.g, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_h1(component: styledDashComponentsLib.styledDashComponentsLibStrings.h1): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.h1, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_h2(component: styledDashComponentsLib.styledDashComponentsLibStrings.h2): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.h2, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_h3(component: styledDashComponentsLib.styledDashComponentsLibStrings.h3): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.h3, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_h4(component: styledDashComponentsLib.styledDashComponentsLibStrings.h4): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.h4, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_h5(component: styledDashComponentsLib.styledDashComponentsLibStrings.h5): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.h5, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_h6(component: styledDashComponentsLib.styledDashComponentsLibStrings.h6): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.h6, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_head(component: styledDashComponentsLib.styledDashComponentsLibStrings.head): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.head, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_header(component: styledDashComponentsLib.styledDashComponentsLibStrings.header): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.header, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_hgroup(component: styledDashComponentsLib.styledDashComponentsLibStrings.hgroup): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.hgroup, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_hr(component: styledDashComponentsLib.styledDashComponentsLibStrings.hr): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.hr, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_html(component: styledDashComponentsLib.styledDashComponentsLibStrings.html): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.html, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_i(component: styledDashComponentsLib.styledDashComponentsLibStrings.i): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.i, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_iframe(component: styledDashComponentsLib.styledDashComponentsLibStrings.iframe): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.iframe, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_image(component: styledDashComponentsLib.styledDashComponentsLibStrings.image): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.image, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_img(component: styledDashComponentsLib.styledDashComponentsLibStrings.img): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.img, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_input(component: styledDashComponentsLib.styledDashComponentsLibStrings.input): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.input, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_ins(component: styledDashComponentsLib.styledDashComponentsLibStrings.ins): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.ins, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_kbd(component: styledDashComponentsLib.styledDashComponentsLibStrings.kbd): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.kbd, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_keygen(component: styledDashComponentsLib.styledDashComponentsLibStrings.keygen): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.keygen, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_label(component: styledDashComponentsLib.styledDashComponentsLibStrings.label): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.label, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_legend(component: styledDashComponentsLib.styledDashComponentsLibStrings.legend): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.legend, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_li(component: styledDashComponentsLib.styledDashComponentsLibStrings.li): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.li, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_line(component: styledDashComponentsLib.styledDashComponentsLibStrings.line): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.line, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_linearGradient(component: styledDashComponentsLib.styledDashComponentsLibStrings.linearGradient): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.linearGradient, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_link(component: styledDashComponentsLib.styledDashComponentsLibStrings.link): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.link, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_main(component: styledDashComponentsLib.styledDashComponentsLibStrings.main): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.main, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_map(component: styledDashComponentsLib.styledDashComponentsLibStrings.map): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.map, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_mark(component: styledDashComponentsLib.styledDashComponentsLibStrings.mark): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.mark, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_marker(component: styledDashComponentsLib.styledDashComponentsLibStrings.marker): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.marker, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_mask(component: styledDashComponentsLib.styledDashComponentsLibStrings.mask): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.mask, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_menu(component: styledDashComponentsLib.styledDashComponentsLibStrings.menu): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.menu, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_menuitem(component: styledDashComponentsLib.styledDashComponentsLibStrings.menuitem): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.menuitem, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_meta(component: styledDashComponentsLib.styledDashComponentsLibStrings.meta): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.meta, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_metadata(component: styledDashComponentsLib.styledDashComponentsLibStrings.metadata): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.metadata, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_meter(component: styledDashComponentsLib.styledDashComponentsLibStrings.meter): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.meter, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_mpath(component: styledDashComponentsLib.styledDashComponentsLibStrings.mpath): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.mpath, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_nav(component: styledDashComponentsLib.styledDashComponentsLibStrings.nav): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.nav, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_noindex(component: styledDashComponentsLib.styledDashComponentsLibStrings.noindex): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.noindex, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_noscript(component: styledDashComponentsLib.styledDashComponentsLibStrings.noscript): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.noscript, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_object(component: styledDashComponentsLib.styledDashComponentsLibStrings.`object`): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.`object`, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_ol(component: styledDashComponentsLib.styledDashComponentsLibStrings.ol): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.ol, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_optgroup(component: styledDashComponentsLib.styledDashComponentsLibStrings.optgroup): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.optgroup, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_option(component: styledDashComponentsLib.styledDashComponentsLibStrings.option): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.option, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_output(component: styledDashComponentsLib.styledDashComponentsLibStrings.output): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.output, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_p(component: styledDashComponentsLib.styledDashComponentsLibStrings.p): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.p, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_param(component: styledDashComponentsLib.styledDashComponentsLibStrings.param): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.param, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_path(component: styledDashComponentsLib.styledDashComponentsLibStrings.path): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.path, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_pattern(component: styledDashComponentsLib.styledDashComponentsLibStrings.pattern): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.pattern, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_picture(component: styledDashComponentsLib.styledDashComponentsLibStrings.picture): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.picture, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_polygon(component: styledDashComponentsLib.styledDashComponentsLibStrings.polygon): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.polygon, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_polyline(component: styledDashComponentsLib.styledDashComponentsLibStrings.polyline): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.polyline, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_pre(component: styledDashComponentsLib.styledDashComponentsLibStrings.pre): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.pre, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_progress(component: styledDashComponentsLib.styledDashComponentsLibStrings.progress): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.progress, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_q(component: styledDashComponentsLib.styledDashComponentsLibStrings.q): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.q, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_radialGradient(component: styledDashComponentsLib.styledDashComponentsLibStrings.radialGradient): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.radialGradient, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_rect(component: styledDashComponentsLib.styledDashComponentsLibStrings.rect): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.rect, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_rp(component: styledDashComponentsLib.styledDashComponentsLibStrings.rp): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.rp, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_rt(component: styledDashComponentsLib.styledDashComponentsLibStrings.rt): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.rt, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_ruby(component: styledDashComponentsLib.styledDashComponentsLibStrings.ruby): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.ruby, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_s(component: styledDashComponentsLib.styledDashComponentsLibStrings.s): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.s, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_samp(component: styledDashComponentsLib.styledDashComponentsLibStrings.samp): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.samp, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_script(component: styledDashComponentsLib.styledDashComponentsLibStrings.script): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.script, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_section(component: styledDashComponentsLib.styledDashComponentsLibStrings.section): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.section, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_select(component: styledDashComponentsLib.styledDashComponentsLibStrings.select): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.select, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_small(component: styledDashComponentsLib.styledDashComponentsLibStrings.small): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.small, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_source(component: styledDashComponentsLib.styledDashComponentsLibStrings.source): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.source, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_span(component: styledDashComponentsLib.styledDashComponentsLibStrings.span): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.span, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_stop(component: styledDashComponentsLib.styledDashComponentsLibStrings.stop): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.stop, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_strong(component: styledDashComponentsLib.styledDashComponentsLibStrings.strong): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.strong, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_style(component: styledDashComponentsLib.styledDashComponentsLibStrings.style): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.style, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_sub(component: styledDashComponentsLib.styledDashComponentsLibStrings.sub): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.sub, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_summary(component: styledDashComponentsLib.styledDashComponentsLibStrings.summary): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.summary, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_sup(component: styledDashComponentsLib.styledDashComponentsLibStrings.sup): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.sup, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_svg(component: styledDashComponentsLib.styledDashComponentsLibStrings.svg): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.svg, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_switch(component: styledDashComponentsLib.styledDashComponentsLibStrings.switch): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.switch, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_symbol(component: styledDashComponentsLib.styledDashComponentsLibStrings.symbol): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.symbol, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_table(component: styledDashComponentsLib.styledDashComponentsLibStrings.table): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.table, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_tbody(component: styledDashComponentsLib.styledDashComponentsLibStrings.tbody): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.tbody, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_td(component: styledDashComponentsLib.styledDashComponentsLibStrings.td): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.td, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_template(component: styledDashComponentsLib.styledDashComponentsLibStrings.template): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.template, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_text(component: styledDashComponentsLib.styledDashComponentsLibStrings.text): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.text, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_textPath(component: styledDashComponentsLib.styledDashComponentsLibStrings.textPath): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.textPath, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_textarea(component: styledDashComponentsLib.styledDashComponentsLibStrings.textarea): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.textarea, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_tfoot(component: styledDashComponentsLib.styledDashComponentsLibStrings.tfoot): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.tfoot, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_th(component: styledDashComponentsLib.styledDashComponentsLibStrings.th): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.th, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_thead(component: styledDashComponentsLib.styledDashComponentsLibStrings.thead): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.thead, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_time(component: styledDashComponentsLib.styledDashComponentsLibStrings.time): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.time, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_title(component: styledDashComponentsLib.styledDashComponentsLibStrings.title): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.title, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_tr(component: styledDashComponentsLib.styledDashComponentsLibStrings.tr): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.tr, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_track(component: styledDashComponentsLib.styledDashComponentsLibStrings.track): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.track, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_tspan(component: styledDashComponentsLib.styledDashComponentsLibStrings.tspan): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.tspan, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_u(component: styledDashComponentsLib.styledDashComponentsLibStrings.u): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.u, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_ul(component: styledDashComponentsLib.styledDashComponentsLibStrings.ul): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.ul, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_use(component: styledDashComponentsLib.styledDashComponentsLibStrings.use): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.use, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_var(component: styledDashComponentsLib.styledDashComponentsLibStrings.`var`): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.`var`, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_video(component: styledDashComponentsLib.styledDashComponentsLibStrings.video): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.video, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_view(component: styledDashComponentsLib.styledDashComponentsLibStrings.view): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.view, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_wbr(component: styledDashComponentsLib.styledDashComponentsLibStrings.wbr): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.wbr, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_webview(component: styledDashComponentsLib.styledDashComponentsLibStrings.webview): StyledComponent[styledDashComponentsLib.styledDashComponentsLibStrings.webview, T, O, A] = js.native
}

