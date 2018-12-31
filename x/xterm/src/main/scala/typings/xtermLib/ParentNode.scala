package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParentNode extends js.Object {
  val childElementCount: scala.Double = js.native
  /**
    * Returns the child elements.
    */
  val children: HTMLCollection = js.native
  /**
    * Returns the first child that is an element, and null otherwise.
    */
  val firstElementChild: Element | scala.Null = js.native
  /**
    * Returns the last child that is an element, and null otherwise.
    */
  val lastElementChild: Element | scala.Null = js.native
  /**
    * Inserts nodes after the last child of node, while replacing
    * strings in nodes with equivalent Text nodes.
    * Throws a "HierarchyRequestError" DOMException if the constraints of
    * the node tree are violated.
    */
  def append(nodes: (Node | java.lang.String)*): scala.Unit = js.native
  /**
    * Inserts nodes before the first child of node, while
    * replacing strings in nodes with equivalent Text nodes.
    * Throws a "HierarchyRequestError" DOMException if the constraints of
    * the node tree are violated.
    */
  def prepend(nodes: (Node | java.lang.String)*): scala.Unit = js.native
  def querySelector[E /* <: Element */](selectors: java.lang.String): E | scala.Null = js.native
  def querySelectorAll[E /* <: Element */](selectors: java.lang.String): NodeListOf[E] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_a(selectors: xtermLib.xtermLibStrings.a): NodeListOf[HTMLAnchorElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_abbr(selectors: xtermLib.xtermLibStrings.abbr): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_address(selectors: xtermLib.xtermLibStrings.address): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_applet(selectors: xtermLib.xtermLibStrings.applet): NodeListOf[HTMLAppletElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_area(selectors: xtermLib.xtermLibStrings.area): NodeListOf[HTMLAreaElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_article(selectors: xtermLib.xtermLibStrings.article): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_aside(selectors: xtermLib.xtermLibStrings.aside): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_audio(selectors: xtermLib.xtermLibStrings.audio): NodeListOf[HTMLAudioElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_b(selectors: xtermLib.xtermLibStrings.b): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_base(selectors: xtermLib.xtermLibStrings.base): NodeListOf[HTMLBaseElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_basefont(selectors: xtermLib.xtermLibStrings.basefont): NodeListOf[HTMLBaseFontElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_bdo(selectors: xtermLib.xtermLibStrings.bdo): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_blockquote(selectors: xtermLib.xtermLibStrings.blockquote): NodeListOf[HTMLQuoteElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_body(selectors: xtermLib.xtermLibStrings.body): NodeListOf[HTMLBodyElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_br(selectors: xtermLib.xtermLibStrings.br): NodeListOf[HTMLBRElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_button(selectors: xtermLib.xtermLibStrings.button): NodeListOf[HTMLButtonElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_canvas(selectors: xtermLib.xtermLibStrings.canvas): NodeListOf[HTMLCanvasElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_caption(selectors: xtermLib.xtermLibStrings.caption): NodeListOf[HTMLTableCaptionElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_circle(selectors: xtermLib.xtermLibStrings.circle): NodeListOf[SVGCircleElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_cite(selectors: xtermLib.xtermLibStrings.cite): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_clipPath(selectors: xtermLib.xtermLibStrings.clipPath): NodeListOf[SVGClipPathElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_code(selectors: xtermLib.xtermLibStrings.code): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_col(selectors: xtermLib.xtermLibStrings.col): NodeListOf[HTMLTableColElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_colgroup(selectors: xtermLib.xtermLibStrings.colgroup): NodeListOf[HTMLTableColElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_data(selectors: xtermLib.xtermLibStrings.data): NodeListOf[HTMLDataElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_datalist(selectors: xtermLib.xtermLibStrings.datalist): NodeListOf[HTMLDataListElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_dd(selectors: xtermLib.xtermLibStrings.dd): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_defs(selectors: xtermLib.xtermLibStrings.defs): NodeListOf[SVGDefsElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_del(selectors: xtermLib.xtermLibStrings.del): NodeListOf[HTMLModElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_desc(selectors: xtermLib.xtermLibStrings.desc): NodeListOf[SVGDescElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_details(selectors: xtermLib.xtermLibStrings.details): NodeListOf[HTMLDetailsElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_dfn(selectors: xtermLib.xtermLibStrings.dfn): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_dialog(selectors: xtermLib.xtermLibStrings.dialog): NodeListOf[HTMLDialogElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_dir(selectors: xtermLib.xtermLibStrings.dir): NodeListOf[HTMLDirectoryElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_div(selectors: xtermLib.xtermLibStrings.div): NodeListOf[HTMLDivElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_dl(selectors: xtermLib.xtermLibStrings.dl): NodeListOf[HTMLDListElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_dt(selectors: xtermLib.xtermLibStrings.dt): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_ellipse(selectors: xtermLib.xtermLibStrings.ellipse): NodeListOf[SVGEllipseElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_em(selectors: xtermLib.xtermLibStrings.em): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_embed(selectors: xtermLib.xtermLibStrings.embed): NodeListOf[HTMLEmbedElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feBlend(selectors: xtermLib.xtermLibStrings.feBlend): NodeListOf[SVGFEBlendElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feColorMatrix(selectors: xtermLib.xtermLibStrings.feColorMatrix): NodeListOf[SVGFEColorMatrixElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feComponentTransfer(selectors: xtermLib.xtermLibStrings.feComponentTransfer): NodeListOf[SVGFEComponentTransferElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feComposite(selectors: xtermLib.xtermLibStrings.feComposite): NodeListOf[SVGFECompositeElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feConvolveMatrix(selectors: xtermLib.xtermLibStrings.feConvolveMatrix): NodeListOf[SVGFEConvolveMatrixElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feDiffuseLighting(selectors: xtermLib.xtermLibStrings.feDiffuseLighting): NodeListOf[SVGFEDiffuseLightingElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feDisplacementMap(selectors: xtermLib.xtermLibStrings.feDisplacementMap): NodeListOf[SVGFEDisplacementMapElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feDistantLight(selectors: xtermLib.xtermLibStrings.feDistantLight): NodeListOf[SVGFEDistantLightElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feFlood(selectors: xtermLib.xtermLibStrings.feFlood): NodeListOf[SVGFEFloodElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feFuncA(selectors: xtermLib.xtermLibStrings.feFuncA): NodeListOf[SVGFEFuncAElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feFuncB(selectors: xtermLib.xtermLibStrings.feFuncB): NodeListOf[SVGFEFuncBElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feFuncG(selectors: xtermLib.xtermLibStrings.feFuncG): NodeListOf[SVGFEFuncGElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feFuncR(selectors: xtermLib.xtermLibStrings.feFuncR): NodeListOf[SVGFEFuncRElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feGaussianBlur(selectors: xtermLib.xtermLibStrings.feGaussianBlur): NodeListOf[SVGFEGaussianBlurElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feImage(selectors: xtermLib.xtermLibStrings.feImage): NodeListOf[SVGFEImageElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feMerge(selectors: xtermLib.xtermLibStrings.feMerge): NodeListOf[SVGFEMergeElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feMergeNode(selectors: xtermLib.xtermLibStrings.feMergeNode): NodeListOf[SVGFEMergeNodeElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feMorphology(selectors: xtermLib.xtermLibStrings.feMorphology): NodeListOf[SVGFEMorphologyElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feOffset(selectors: xtermLib.xtermLibStrings.feOffset): NodeListOf[SVGFEOffsetElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_fePointLight(selectors: xtermLib.xtermLibStrings.fePointLight): NodeListOf[SVGFEPointLightElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feSpecularLighting(selectors: xtermLib.xtermLibStrings.feSpecularLighting): NodeListOf[SVGFESpecularLightingElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feSpotLight(selectors: xtermLib.xtermLibStrings.feSpotLight): NodeListOf[SVGFESpotLightElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feTile(selectors: xtermLib.xtermLibStrings.feTile): NodeListOf[SVGFETileElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feTurbulence(selectors: xtermLib.xtermLibStrings.feTurbulence): NodeListOf[SVGFETurbulenceElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_fieldset(selectors: xtermLib.xtermLibStrings.fieldset): NodeListOf[HTMLFieldSetElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_figcaption(selectors: xtermLib.xtermLibStrings.figcaption): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_figure(selectors: xtermLib.xtermLibStrings.figure): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_filter(selectors: xtermLib.xtermLibStrings.filter): NodeListOf[SVGFilterElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_font(selectors: xtermLib.xtermLibStrings.font): NodeListOf[HTMLFontElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_footer(selectors: xtermLib.xtermLibStrings.footer): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_foreignObject(selectors: xtermLib.xtermLibStrings.foreignObject): NodeListOf[SVGForeignObjectElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_form(selectors: xtermLib.xtermLibStrings.form): NodeListOf[HTMLFormElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_frame(selectors: xtermLib.xtermLibStrings.frame): NodeListOf[HTMLFrameElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_frameset(selectors: xtermLib.xtermLibStrings.frameset): NodeListOf[HTMLFrameSetElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_g(selectors: xtermLib.xtermLibStrings.g): NodeListOf[SVGGElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_h1(selectors: xtermLib.xtermLibStrings.h1): NodeListOf[HTMLHeadingElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_h2(selectors: xtermLib.xtermLibStrings.h2): NodeListOf[HTMLHeadingElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_h3(selectors: xtermLib.xtermLibStrings.h3): NodeListOf[HTMLHeadingElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_h4(selectors: xtermLib.xtermLibStrings.h4): NodeListOf[HTMLHeadingElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_h5(selectors: xtermLib.xtermLibStrings.h5): NodeListOf[HTMLHeadingElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_h6(selectors: xtermLib.xtermLibStrings.h6): NodeListOf[HTMLHeadingElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_head(selectors: xtermLib.xtermLibStrings.head): NodeListOf[HTMLHeadElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_header(selectors: xtermLib.xtermLibStrings.header): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_hgroup(selectors: xtermLib.xtermLibStrings.hgroup): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_hr(selectors: xtermLib.xtermLibStrings.hr): NodeListOf[HTMLHRElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_html(selectors: xtermLib.xtermLibStrings.html): NodeListOf[HTMLHtmlElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_i(selectors: xtermLib.xtermLibStrings.i): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_iframe(selectors: xtermLib.xtermLibStrings.iframe): NodeListOf[HTMLIFrameElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_image(selectors: xtermLib.xtermLibStrings.image): NodeListOf[SVGImageElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_img(selectors: xtermLib.xtermLibStrings.img): NodeListOf[HTMLImageElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_input(selectors: xtermLib.xtermLibStrings.input): NodeListOf[HTMLInputElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_ins(selectors: xtermLib.xtermLibStrings.ins): NodeListOf[HTMLModElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_kbd(selectors: xtermLib.xtermLibStrings.kbd): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_label(selectors: xtermLib.xtermLibStrings.label): NodeListOf[HTMLLabelElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_legend(selectors: xtermLib.xtermLibStrings.legend): NodeListOf[HTMLLegendElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_li(selectors: xtermLib.xtermLibStrings.li): NodeListOf[HTMLLIElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_line(selectors: xtermLib.xtermLibStrings.line): NodeListOf[SVGLineElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_linearGradient(selectors: xtermLib.xtermLibStrings.linearGradient): NodeListOf[SVGLinearGradientElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_link(selectors: xtermLib.xtermLibStrings.link): NodeListOf[HTMLLinkElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_map(selectors: xtermLib.xtermLibStrings.map): NodeListOf[HTMLMapElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_mark(selectors: xtermLib.xtermLibStrings.mark): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_marker(selectors: xtermLib.xtermLibStrings.marker): NodeListOf[SVGMarkerElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_marquee(selectors: xtermLib.xtermLibStrings.marquee): NodeListOf[HTMLMarqueeElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_mask(selectors: xtermLib.xtermLibStrings.mask): NodeListOf[SVGMaskElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_menu(selectors: xtermLib.xtermLibStrings.menu): NodeListOf[HTMLMenuElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_meta(selectors: xtermLib.xtermLibStrings.meta): NodeListOf[HTMLMetaElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_metadata(selectors: xtermLib.xtermLibStrings.metadata): NodeListOf[SVGMetadataElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_meter(selectors: xtermLib.xtermLibStrings.meter): NodeListOf[HTMLMeterElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_nav(selectors: xtermLib.xtermLibStrings.nav): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_noscript(selectors: xtermLib.xtermLibStrings.noscript): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_object(selectors: xtermLib.xtermLibStrings.`object`): NodeListOf[HTMLObjectElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_ol(selectors: xtermLib.xtermLibStrings.ol): NodeListOf[HTMLOListElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_optgroup(selectors: xtermLib.xtermLibStrings.optgroup): NodeListOf[HTMLOptGroupElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_option(selectors: xtermLib.xtermLibStrings.option): NodeListOf[HTMLOptionElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_output(selectors: xtermLib.xtermLibStrings.output): NodeListOf[HTMLOutputElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_p(selectors: xtermLib.xtermLibStrings.p): NodeListOf[HTMLParagraphElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_param(selectors: xtermLib.xtermLibStrings.param): NodeListOf[HTMLParamElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_path(selectors: xtermLib.xtermLibStrings.path): NodeListOf[SVGPathElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_pattern(selectors: xtermLib.xtermLibStrings.pattern): NodeListOf[SVGPatternElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_picture(selectors: xtermLib.xtermLibStrings.picture): NodeListOf[HTMLPictureElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_polygon(selectors: xtermLib.xtermLibStrings.polygon): NodeListOf[SVGPolygonElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_polyline(selectors: xtermLib.xtermLibStrings.polyline): NodeListOf[SVGPolylineElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_pre(selectors: xtermLib.xtermLibStrings.pre): NodeListOf[HTMLPreElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_progress(selectors: xtermLib.xtermLibStrings.progress): NodeListOf[HTMLProgressElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_q(selectors: xtermLib.xtermLibStrings.q): NodeListOf[HTMLQuoteElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_radialGradient(selectors: xtermLib.xtermLibStrings.radialGradient): NodeListOf[SVGRadialGradientElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_rect(selectors: xtermLib.xtermLibStrings.rect): NodeListOf[SVGRectElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_rt(selectors: xtermLib.xtermLibStrings.rt): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_ruby(selectors: xtermLib.xtermLibStrings.ruby): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_s(selectors: xtermLib.xtermLibStrings.s): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_samp(selectors: xtermLib.xtermLibStrings.samp): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_script(selectors: xtermLib.xtermLibStrings.script): NodeListOf[HTMLScriptElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_section(selectors: xtermLib.xtermLibStrings.section): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_select(selectors: xtermLib.xtermLibStrings.select): NodeListOf[HTMLSelectElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_slot(selectors: xtermLib.xtermLibStrings.slot): NodeListOf[HTMLSlotElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_small(selectors: xtermLib.xtermLibStrings.small): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_source(selectors: xtermLib.xtermLibStrings.source): NodeListOf[HTMLSourceElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_span(selectors: xtermLib.xtermLibStrings.span): NodeListOf[HTMLSpanElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_stop(selectors: xtermLib.xtermLibStrings.stop): NodeListOf[SVGStopElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_strong(selectors: xtermLib.xtermLibStrings.strong): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_style(selectors: xtermLib.xtermLibStrings.style): NodeListOf[HTMLStyleElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_sub(selectors: xtermLib.xtermLibStrings.sub): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_sup(selectors: xtermLib.xtermLibStrings.sup): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_svg(selectors: xtermLib.xtermLibStrings.svg): NodeListOf[SVGSVGElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_switch(selectors: xtermLib.xtermLibStrings.switch): NodeListOf[SVGSwitchElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_symbol(selectors: xtermLib.xtermLibStrings.symbol): NodeListOf[SVGSymbolElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_table(selectors: xtermLib.xtermLibStrings.table): NodeListOf[HTMLTableElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_tbody(selectors: xtermLib.xtermLibStrings.tbody): NodeListOf[HTMLTableSectionElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_td(selectors: xtermLib.xtermLibStrings.td): NodeListOf[HTMLTableDataCellElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_template(selectors: xtermLib.xtermLibStrings.template): NodeListOf[HTMLTemplateElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_text(selectors: xtermLib.xtermLibStrings.text): NodeListOf[SVGTextElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_textPath(selectors: xtermLib.xtermLibStrings.textPath): NodeListOf[SVGTextPathElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_textarea(selectors: xtermLib.xtermLibStrings.textarea): NodeListOf[HTMLTextAreaElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_tfoot(selectors: xtermLib.xtermLibStrings.tfoot): NodeListOf[HTMLTableSectionElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_th(selectors: xtermLib.xtermLibStrings.th): NodeListOf[HTMLTableHeaderCellElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_thead(selectors: xtermLib.xtermLibStrings.thead): NodeListOf[HTMLTableSectionElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_time(selectors: xtermLib.xtermLibStrings.time): NodeListOf[HTMLTimeElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_title(selectors: xtermLib.xtermLibStrings.title): NodeListOf[HTMLTitleElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_tr(selectors: xtermLib.xtermLibStrings.tr): NodeListOf[HTMLTableRowElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_track(selectors: xtermLib.xtermLibStrings.track): NodeListOf[HTMLTrackElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_tspan(selectors: xtermLib.xtermLibStrings.tspan): NodeListOf[SVGTSpanElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_u(selectors: xtermLib.xtermLibStrings.u): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_ul(selectors: xtermLib.xtermLibStrings.ul): NodeListOf[HTMLUListElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_use(selectors: xtermLib.xtermLibStrings.use): NodeListOf[SVGUseElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_var(selectors: xtermLib.xtermLibStrings.`var`): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_video(selectors: xtermLib.xtermLibStrings.video): NodeListOf[HTMLVideoElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_view(selectors: xtermLib.xtermLibStrings.view): NodeListOf[SVGViewElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_wbr(selectors: xtermLib.xtermLibStrings.wbr): NodeListOf[HTMLElement] = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_a(selectors: xtermLib.xtermLibStrings.a): HTMLAnchorElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_abbr(selectors: xtermLib.xtermLibStrings.abbr): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_address(selectors: xtermLib.xtermLibStrings.address): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_applet(selectors: xtermLib.xtermLibStrings.applet): HTMLAppletElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_area(selectors: xtermLib.xtermLibStrings.area): HTMLAreaElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_article(selectors: xtermLib.xtermLibStrings.article): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_aside(selectors: xtermLib.xtermLibStrings.aside): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_audio(selectors: xtermLib.xtermLibStrings.audio): HTMLAudioElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_b(selectors: xtermLib.xtermLibStrings.b): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_base(selectors: xtermLib.xtermLibStrings.base): HTMLBaseElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_basefont(selectors: xtermLib.xtermLibStrings.basefont): HTMLBaseFontElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_bdo(selectors: xtermLib.xtermLibStrings.bdo): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_blockquote(selectors: xtermLib.xtermLibStrings.blockquote): HTMLQuoteElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_body(selectors: xtermLib.xtermLibStrings.body): HTMLBodyElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_br(selectors: xtermLib.xtermLibStrings.br): HTMLBRElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_button(selectors: xtermLib.xtermLibStrings.button): HTMLButtonElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_canvas(selectors: xtermLib.xtermLibStrings.canvas): HTMLCanvasElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_caption(selectors: xtermLib.xtermLibStrings.caption): HTMLTableCaptionElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_circle(selectors: xtermLib.xtermLibStrings.circle): SVGCircleElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_cite(selectors: xtermLib.xtermLibStrings.cite): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_clipPath(selectors: xtermLib.xtermLibStrings.clipPath): SVGClipPathElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_code(selectors: xtermLib.xtermLibStrings.code): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_col(selectors: xtermLib.xtermLibStrings.col): HTMLTableColElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_colgroup(selectors: xtermLib.xtermLibStrings.colgroup): HTMLTableColElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_data(selectors: xtermLib.xtermLibStrings.data): HTMLDataElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_datalist(selectors: xtermLib.xtermLibStrings.datalist): HTMLDataListElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_dd(selectors: xtermLib.xtermLibStrings.dd): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_defs(selectors: xtermLib.xtermLibStrings.defs): SVGDefsElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_del(selectors: xtermLib.xtermLibStrings.del): HTMLModElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_desc(selectors: xtermLib.xtermLibStrings.desc): SVGDescElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_details(selectors: xtermLib.xtermLibStrings.details): HTMLDetailsElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_dfn(selectors: xtermLib.xtermLibStrings.dfn): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_dialog(selectors: xtermLib.xtermLibStrings.dialog): HTMLDialogElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_dir(selectors: xtermLib.xtermLibStrings.dir): HTMLDirectoryElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_div(selectors: xtermLib.xtermLibStrings.div): HTMLDivElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_dl(selectors: xtermLib.xtermLibStrings.dl): HTMLDListElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_dt(selectors: xtermLib.xtermLibStrings.dt): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_ellipse(selectors: xtermLib.xtermLibStrings.ellipse): SVGEllipseElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_em(selectors: xtermLib.xtermLibStrings.em): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_embed(selectors: xtermLib.xtermLibStrings.embed): HTMLEmbedElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feBlend(selectors: xtermLib.xtermLibStrings.feBlend): SVGFEBlendElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feColorMatrix(selectors: xtermLib.xtermLibStrings.feColorMatrix): SVGFEColorMatrixElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feComponentTransfer(selectors: xtermLib.xtermLibStrings.feComponentTransfer): SVGFEComponentTransferElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feComposite(selectors: xtermLib.xtermLibStrings.feComposite): SVGFECompositeElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feConvolveMatrix(selectors: xtermLib.xtermLibStrings.feConvolveMatrix): SVGFEConvolveMatrixElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feDiffuseLighting(selectors: xtermLib.xtermLibStrings.feDiffuseLighting): SVGFEDiffuseLightingElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feDisplacementMap(selectors: xtermLib.xtermLibStrings.feDisplacementMap): SVGFEDisplacementMapElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feDistantLight(selectors: xtermLib.xtermLibStrings.feDistantLight): SVGFEDistantLightElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feFlood(selectors: xtermLib.xtermLibStrings.feFlood): SVGFEFloodElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feFuncA(selectors: xtermLib.xtermLibStrings.feFuncA): SVGFEFuncAElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feFuncB(selectors: xtermLib.xtermLibStrings.feFuncB): SVGFEFuncBElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feFuncG(selectors: xtermLib.xtermLibStrings.feFuncG): SVGFEFuncGElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feFuncR(selectors: xtermLib.xtermLibStrings.feFuncR): SVGFEFuncRElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feGaussianBlur(selectors: xtermLib.xtermLibStrings.feGaussianBlur): SVGFEGaussianBlurElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feImage(selectors: xtermLib.xtermLibStrings.feImage): SVGFEImageElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feMerge(selectors: xtermLib.xtermLibStrings.feMerge): SVGFEMergeElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feMergeNode(selectors: xtermLib.xtermLibStrings.feMergeNode): SVGFEMergeNodeElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feMorphology(selectors: xtermLib.xtermLibStrings.feMorphology): SVGFEMorphologyElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feOffset(selectors: xtermLib.xtermLibStrings.feOffset): SVGFEOffsetElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_fePointLight(selectors: xtermLib.xtermLibStrings.fePointLight): SVGFEPointLightElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feSpecularLighting(selectors: xtermLib.xtermLibStrings.feSpecularLighting): SVGFESpecularLightingElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feSpotLight(selectors: xtermLib.xtermLibStrings.feSpotLight): SVGFESpotLightElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feTile(selectors: xtermLib.xtermLibStrings.feTile): SVGFETileElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feTurbulence(selectors: xtermLib.xtermLibStrings.feTurbulence): SVGFETurbulenceElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_fieldset(selectors: xtermLib.xtermLibStrings.fieldset): HTMLFieldSetElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_figcaption(selectors: xtermLib.xtermLibStrings.figcaption): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_figure(selectors: xtermLib.xtermLibStrings.figure): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_filter(selectors: xtermLib.xtermLibStrings.filter): SVGFilterElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_font(selectors: xtermLib.xtermLibStrings.font): HTMLFontElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_footer(selectors: xtermLib.xtermLibStrings.footer): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_foreignObject(selectors: xtermLib.xtermLibStrings.foreignObject): SVGForeignObjectElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_form(selectors: xtermLib.xtermLibStrings.form): HTMLFormElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_frame(selectors: xtermLib.xtermLibStrings.frame): HTMLFrameElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_frameset(selectors: xtermLib.xtermLibStrings.frameset): HTMLFrameSetElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_g(selectors: xtermLib.xtermLibStrings.g): SVGGElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_h1(selectors: xtermLib.xtermLibStrings.h1): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_h2(selectors: xtermLib.xtermLibStrings.h2): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_h3(selectors: xtermLib.xtermLibStrings.h3): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_h4(selectors: xtermLib.xtermLibStrings.h4): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_h5(selectors: xtermLib.xtermLibStrings.h5): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_h6(selectors: xtermLib.xtermLibStrings.h6): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_head(selectors: xtermLib.xtermLibStrings.head): HTMLHeadElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_header(selectors: xtermLib.xtermLibStrings.header): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_hgroup(selectors: xtermLib.xtermLibStrings.hgroup): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_hr(selectors: xtermLib.xtermLibStrings.hr): HTMLHRElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_html(selectors: xtermLib.xtermLibStrings.html): HTMLHtmlElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_i(selectors: xtermLib.xtermLibStrings.i): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_iframe(selectors: xtermLib.xtermLibStrings.iframe): HTMLIFrameElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_image(selectors: xtermLib.xtermLibStrings.image): SVGImageElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_img(selectors: xtermLib.xtermLibStrings.img): HTMLImageElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_input(selectors: xtermLib.xtermLibStrings.input): HTMLInputElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_ins(selectors: xtermLib.xtermLibStrings.ins): HTMLModElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_kbd(selectors: xtermLib.xtermLibStrings.kbd): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_label(selectors: xtermLib.xtermLibStrings.label): HTMLLabelElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_legend(selectors: xtermLib.xtermLibStrings.legend): HTMLLegendElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_li(selectors: xtermLib.xtermLibStrings.li): HTMLLIElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_line(selectors: xtermLib.xtermLibStrings.line): SVGLineElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_linearGradient(selectors: xtermLib.xtermLibStrings.linearGradient): SVGLinearGradientElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_link(selectors: xtermLib.xtermLibStrings.link): HTMLLinkElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_map(selectors: xtermLib.xtermLibStrings.map): HTMLMapElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_mark(selectors: xtermLib.xtermLibStrings.mark): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_marker(selectors: xtermLib.xtermLibStrings.marker): SVGMarkerElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_marquee(selectors: xtermLib.xtermLibStrings.marquee): HTMLMarqueeElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_mask(selectors: xtermLib.xtermLibStrings.mask): SVGMaskElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_menu(selectors: xtermLib.xtermLibStrings.menu): HTMLMenuElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_meta(selectors: xtermLib.xtermLibStrings.meta): HTMLMetaElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_metadata(selectors: xtermLib.xtermLibStrings.metadata): SVGMetadataElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_meter(selectors: xtermLib.xtermLibStrings.meter): HTMLMeterElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_nav(selectors: xtermLib.xtermLibStrings.nav): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_noscript(selectors: xtermLib.xtermLibStrings.noscript): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_object(selectors: xtermLib.xtermLibStrings.`object`): HTMLObjectElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_ol(selectors: xtermLib.xtermLibStrings.ol): HTMLOListElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_optgroup(selectors: xtermLib.xtermLibStrings.optgroup): HTMLOptGroupElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_option(selectors: xtermLib.xtermLibStrings.option): HTMLOptionElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_output(selectors: xtermLib.xtermLibStrings.output): HTMLOutputElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_p(selectors: xtermLib.xtermLibStrings.p): HTMLParagraphElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_param(selectors: xtermLib.xtermLibStrings.param): HTMLParamElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_path(selectors: xtermLib.xtermLibStrings.path): SVGPathElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_pattern(selectors: xtermLib.xtermLibStrings.pattern): SVGPatternElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_picture(selectors: xtermLib.xtermLibStrings.picture): HTMLPictureElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_polygon(selectors: xtermLib.xtermLibStrings.polygon): SVGPolygonElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_polyline(selectors: xtermLib.xtermLibStrings.polyline): SVGPolylineElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_pre(selectors: xtermLib.xtermLibStrings.pre): HTMLPreElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_progress(selectors: xtermLib.xtermLibStrings.progress): HTMLProgressElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_q(selectors: xtermLib.xtermLibStrings.q): HTMLQuoteElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_radialGradient(selectors: xtermLib.xtermLibStrings.radialGradient): SVGRadialGradientElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_rect(selectors: xtermLib.xtermLibStrings.rect): SVGRectElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_rt(selectors: xtermLib.xtermLibStrings.rt): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_ruby(selectors: xtermLib.xtermLibStrings.ruby): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_s(selectors: xtermLib.xtermLibStrings.s): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_samp(selectors: xtermLib.xtermLibStrings.samp): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_script(selectors: xtermLib.xtermLibStrings.script): HTMLScriptElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_section(selectors: xtermLib.xtermLibStrings.section): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_select(selectors: xtermLib.xtermLibStrings.select): HTMLSelectElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_slot(selectors: xtermLib.xtermLibStrings.slot): HTMLSlotElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_small(selectors: xtermLib.xtermLibStrings.small): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_source(selectors: xtermLib.xtermLibStrings.source): HTMLSourceElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_span(selectors: xtermLib.xtermLibStrings.span): HTMLSpanElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_stop(selectors: xtermLib.xtermLibStrings.stop): SVGStopElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_strong(selectors: xtermLib.xtermLibStrings.strong): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_style(selectors: xtermLib.xtermLibStrings.style): HTMLStyleElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_sub(selectors: xtermLib.xtermLibStrings.sub): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_sup(selectors: xtermLib.xtermLibStrings.sup): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_svg(selectors: xtermLib.xtermLibStrings.svg): SVGSVGElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_switch(selectors: xtermLib.xtermLibStrings.switch): SVGSwitchElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_symbol(selectors: xtermLib.xtermLibStrings.symbol): SVGSymbolElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_table(selectors: xtermLib.xtermLibStrings.table): HTMLTableElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_tbody(selectors: xtermLib.xtermLibStrings.tbody): HTMLTableSectionElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_td(selectors: xtermLib.xtermLibStrings.td): HTMLTableDataCellElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_template(selectors: xtermLib.xtermLibStrings.template): HTMLTemplateElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_text(selectors: xtermLib.xtermLibStrings.text): SVGTextElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_textPath(selectors: xtermLib.xtermLibStrings.textPath): SVGTextPathElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_textarea(selectors: xtermLib.xtermLibStrings.textarea): HTMLTextAreaElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_tfoot(selectors: xtermLib.xtermLibStrings.tfoot): HTMLTableSectionElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_th(selectors: xtermLib.xtermLibStrings.th): HTMLTableHeaderCellElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_thead(selectors: xtermLib.xtermLibStrings.thead): HTMLTableSectionElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_time(selectors: xtermLib.xtermLibStrings.time): HTMLTimeElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_title(selectors: xtermLib.xtermLibStrings.title): HTMLTitleElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_tr(selectors: xtermLib.xtermLibStrings.tr): HTMLTableRowElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_track(selectors: xtermLib.xtermLibStrings.track): HTMLTrackElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_tspan(selectors: xtermLib.xtermLibStrings.tspan): SVGTSpanElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_u(selectors: xtermLib.xtermLibStrings.u): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_ul(selectors: xtermLib.xtermLibStrings.ul): HTMLUListElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_use(selectors: xtermLib.xtermLibStrings.use): SVGUseElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_var(selectors: xtermLib.xtermLibStrings.`var`): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_video(selectors: xtermLib.xtermLibStrings.video): HTMLVideoElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_view(selectors: xtermLib.xtermLibStrings.view): SVGViewElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_wbr(selectors: xtermLib.xtermLibStrings.wbr): HTMLElement | scala.Null = js.native
}

