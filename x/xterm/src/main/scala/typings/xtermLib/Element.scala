package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element
  extends ChildNode
     with ParentNode
     with NonDocumentTypeChildNode
     with Slotable
     with Animatable {
  val attributes: NamedNodeMap = js.native
  /**
       * Allows for manipulation of element's class content attribute as a
       * set of whitespace-separated tokens through a DOMTokenList object.
       */
  val classList: DOMTokenList = js.native
  /**
       * Returns the value of element's class content attribute. Can be set
       * to change it.
       */
  var className: java.lang.String = js.native
  val clientHeight: scala.Double = js.native
  val clientLeft: scala.Double = js.native
  val clientTop: scala.Double = js.native
  val clientWidth: scala.Double = js.native
  /**
       * Returns the value of element's id content attribute. Can be set to
       * change it.
       */
  var id: java.lang.String = js.native
  var innerHTML: java.lang.String = js.native
  /**
       * Returns the local name.
       */
  val localName: java.lang.String = js.native
  var onfullscreenchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onfullscreenerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var outerHTML: java.lang.String = js.native
  /**
       * Returns the namespace prefix.
       */
  val prefix: java.lang.String | scala.Null = js.native
  val scrollHeight: scala.Double = js.native
  var scrollLeft: scala.Double = js.native
  var scrollTop: scala.Double = js.native
  val scrollWidth: scala.Double = js.native
  /**
       * Returns element's shadow root, if any, and if shadow root's mode is "open", and null otherwise.
       */
  val shadowRoot: ShadowRoot | scala.Null = js.native
  /**
       * Returns the value of element's slot content attribute. Can be set to
       * change it.
       */
  var slot: java.lang.String = js.native
  /**
       * Returns the HTML-uppercased qualified name.
       */
  val tagName: java.lang.String = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: xtermLib.xtermLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: xtermLib.xtermLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: xtermLib.xtermLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: xtermLib.xtermLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: xtermLib.xtermLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: xtermLib.xtermLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  /**
       * Creates a shadow root for element and returns it.
       */
  def attachShadow(shadowRootInitDict: ShadowRootInit): ShadowRoot = js.native
  def closest(selector: java.lang.String): Element | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_a(selector: xtermLib.xtermLibStrings.a): HTMLAnchorElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_abbr(selector: xtermLib.xtermLibStrings.abbr): HTMLElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_address(selector: xtermLib.xtermLibStrings.address): HTMLElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_applet(selector: xtermLib.xtermLibStrings.applet): HTMLAppletElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_area(selector: xtermLib.xtermLibStrings.area): HTMLAreaElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_article(selector: xtermLib.xtermLibStrings.article): HTMLElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_aside(selector: xtermLib.xtermLibStrings.aside): HTMLElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_audio(selector: xtermLib.xtermLibStrings.audio): HTMLAudioElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_b(selector: xtermLib.xtermLibStrings.b): HTMLElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_base(selector: xtermLib.xtermLibStrings.base): HTMLBaseElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_basefont(selector: xtermLib.xtermLibStrings.basefont): HTMLBaseFontElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_bdo(selector: xtermLib.xtermLibStrings.bdo): HTMLElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_blockquote(selector: xtermLib.xtermLibStrings.blockquote): HTMLQuoteElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_body(selector: xtermLib.xtermLibStrings.body): HTMLBodyElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_br(selector: xtermLib.xtermLibStrings.br): HTMLBRElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_button(selector: xtermLib.xtermLibStrings.button): HTMLButtonElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_canvas(selector: xtermLib.xtermLibStrings.canvas): HTMLCanvasElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_caption(selector: xtermLib.xtermLibStrings.caption): HTMLTableCaptionElement | scala.Null = js.native
  @JSName("closest")
  def closest_circle(selector: xtermLib.xtermLibStrings.circle): SVGCircleElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_cite(selector: xtermLib.xtermLibStrings.cite): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_clipPath(selector: xtermLib.xtermLibStrings.clipPath): SVGClipPathElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_code(selector: xtermLib.xtermLibStrings.code): HTMLElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_col(selector: xtermLib.xtermLibStrings.col): HTMLTableColElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_colgroup(selector: xtermLib.xtermLibStrings.colgroup): HTMLTableColElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_data(selector: xtermLib.xtermLibStrings.data): HTMLDataElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_datalist(selector: xtermLib.xtermLibStrings.datalist): HTMLDataListElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_dd(selector: xtermLib.xtermLibStrings.dd): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_defs(selector: xtermLib.xtermLibStrings.defs): SVGDefsElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_del(selector: xtermLib.xtermLibStrings.del): HTMLModElement | scala.Null = js.native
  @JSName("closest")
  def closest_desc(selector: xtermLib.xtermLibStrings.desc): SVGDescElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_details(selector: xtermLib.xtermLibStrings.details): HTMLDetailsElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_dfn(selector: xtermLib.xtermLibStrings.dfn): HTMLElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_dialog(selector: xtermLib.xtermLibStrings.dialog): HTMLDialogElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_dir(selector: xtermLib.xtermLibStrings.dir): HTMLDirectoryElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_div(selector: xtermLib.xtermLibStrings.div): HTMLDivElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_dl(selector: xtermLib.xtermLibStrings.dl): HTMLDListElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_dt(selector: xtermLib.xtermLibStrings.dt): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_ellipse(selector: xtermLib.xtermLibStrings.ellipse): SVGEllipseElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_em(selector: xtermLib.xtermLibStrings.em): HTMLElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_embed(selector: xtermLib.xtermLibStrings.embed): HTMLEmbedElement | scala.Null = js.native
  @JSName("closest")
  def closest_feBlend(selector: xtermLib.xtermLibStrings.feBlend): SVGFEBlendElement | scala.Null = js.native
  @JSName("closest")
  def closest_feColorMatrix(selector: xtermLib.xtermLibStrings.feColorMatrix): SVGFEColorMatrixElement | scala.Null = js.native
  @JSName("closest")
  def closest_feComponentTransfer(selector: xtermLib.xtermLibStrings.feComponentTransfer): SVGFEComponentTransferElement | scala.Null = js.native
  @JSName("closest")
  def closest_feComposite(selector: xtermLib.xtermLibStrings.feComposite): SVGFECompositeElement | scala.Null = js.native
  @JSName("closest")
  def closest_feConvolveMatrix(selector: xtermLib.xtermLibStrings.feConvolveMatrix): SVGFEConvolveMatrixElement | scala.Null = js.native
  @JSName("closest")
  def closest_feDiffuseLighting(selector: xtermLib.xtermLibStrings.feDiffuseLighting): SVGFEDiffuseLightingElement | scala.Null = js.native
  @JSName("closest")
  def closest_feDisplacementMap(selector: xtermLib.xtermLibStrings.feDisplacementMap): SVGFEDisplacementMapElement | scala.Null = js.native
  @JSName("closest")
  def closest_feDistantLight(selector: xtermLib.xtermLibStrings.feDistantLight): SVGFEDistantLightElement | scala.Null = js.native
  @JSName("closest")
  def closest_feFlood(selector: xtermLib.xtermLibStrings.feFlood): SVGFEFloodElement | scala.Null = js.native
  @JSName("closest")
  def closest_feFuncA(selector: xtermLib.xtermLibStrings.feFuncA): SVGFEFuncAElement | scala.Null = js.native
  @JSName("closest")
  def closest_feFuncB(selector: xtermLib.xtermLibStrings.feFuncB): SVGFEFuncBElement | scala.Null = js.native
  @JSName("closest")
  def closest_feFuncG(selector: xtermLib.xtermLibStrings.feFuncG): SVGFEFuncGElement | scala.Null = js.native
  @JSName("closest")
  def closest_feFuncR(selector: xtermLib.xtermLibStrings.feFuncR): SVGFEFuncRElement | scala.Null = js.native
  @JSName("closest")
  def closest_feGaussianBlur(selector: xtermLib.xtermLibStrings.feGaussianBlur): SVGFEGaussianBlurElement | scala.Null = js.native
  @JSName("closest")
  def closest_feImage(selector: xtermLib.xtermLibStrings.feImage): SVGFEImageElement | scala.Null = js.native
  @JSName("closest")
  def closest_feMerge(selector: xtermLib.xtermLibStrings.feMerge): SVGFEMergeElement | scala.Null = js.native
  @JSName("closest")
  def closest_feMergeNode(selector: xtermLib.xtermLibStrings.feMergeNode): SVGFEMergeNodeElement | scala.Null = js.native
  @JSName("closest")
  def closest_feMorphology(selector: xtermLib.xtermLibStrings.feMorphology): SVGFEMorphologyElement | scala.Null = js.native
  @JSName("closest")
  def closest_feOffset(selector: xtermLib.xtermLibStrings.feOffset): SVGFEOffsetElement | scala.Null = js.native
  @JSName("closest")
  def closest_fePointLight(selector: xtermLib.xtermLibStrings.fePointLight): SVGFEPointLightElement | scala.Null = js.native
  @JSName("closest")
  def closest_feSpecularLighting(selector: xtermLib.xtermLibStrings.feSpecularLighting): SVGFESpecularLightingElement | scala.Null = js.native
  @JSName("closest")
  def closest_feSpotLight(selector: xtermLib.xtermLibStrings.feSpotLight): SVGFESpotLightElement | scala.Null = js.native
  @JSName("closest")
  def closest_feTile(selector: xtermLib.xtermLibStrings.feTile): SVGFETileElement | scala.Null = js.native
  @JSName("closest")
  def closest_feTurbulence(selector: xtermLib.xtermLibStrings.feTurbulence): SVGFETurbulenceElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_fieldset(selector: xtermLib.xtermLibStrings.fieldset): HTMLFieldSetElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_figcaption(selector: xtermLib.xtermLibStrings.figcaption): HTMLElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_figure(selector: xtermLib.xtermLibStrings.figure): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_filter(selector: xtermLib.xtermLibStrings.filter): SVGFilterElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_font(selector: xtermLib.xtermLibStrings.font): HTMLFontElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_footer(selector: xtermLib.xtermLibStrings.footer): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_foreignObject(selector: xtermLib.xtermLibStrings.foreignObject): SVGForeignObjectElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_form(selector: xtermLib.xtermLibStrings.form): HTMLFormElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_frame(selector: xtermLib.xtermLibStrings.frame): HTMLFrameElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_frameset(selector: xtermLib.xtermLibStrings.frameset): HTMLFrameSetElement | scala.Null = js.native
  @JSName("closest")
  def closest_g(selector: xtermLib.xtermLibStrings.g): SVGGElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_h1(selector: xtermLib.xtermLibStrings.h1): HTMLHeadingElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_h2(selector: xtermLib.xtermLibStrings.h2): HTMLHeadingElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_h3(selector: xtermLib.xtermLibStrings.h3): HTMLHeadingElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_h4(selector: xtermLib.xtermLibStrings.h4): HTMLHeadingElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_h5(selector: xtermLib.xtermLibStrings.h5): HTMLHeadingElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_h6(selector: xtermLib.xtermLibStrings.h6): HTMLHeadingElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_head(selector: xtermLib.xtermLibStrings.head): HTMLHeadElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_header(selector: xtermLib.xtermLibStrings.header): HTMLElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_hgroup(selector: xtermLib.xtermLibStrings.hgroup): HTMLElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_hr(selector: xtermLib.xtermLibStrings.hr): HTMLHRElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_html(selector: xtermLib.xtermLibStrings.html): HTMLHtmlElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_i(selector: xtermLib.xtermLibStrings.i): HTMLElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_iframe(selector: xtermLib.xtermLibStrings.iframe): HTMLIFrameElement | scala.Null = js.native
  @JSName("closest")
  def closest_image(selector: xtermLib.xtermLibStrings.image): SVGImageElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_img(selector: xtermLib.xtermLibStrings.img): HTMLImageElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_input(selector: xtermLib.xtermLibStrings.input): HTMLInputElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_ins(selector: xtermLib.xtermLibStrings.ins): HTMLModElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_kbd(selector: xtermLib.xtermLibStrings.kbd): HTMLElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_label(selector: xtermLib.xtermLibStrings.label): HTMLLabelElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_legend(selector: xtermLib.xtermLibStrings.legend): HTMLLegendElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_li(selector: xtermLib.xtermLibStrings.li): HTMLLIElement | scala.Null = js.native
  @JSName("closest")
  def closest_line(selector: xtermLib.xtermLibStrings.line): SVGLineElement | scala.Null = js.native
  @JSName("closest")
  def closest_linearGradient(selector: xtermLib.xtermLibStrings.linearGradient): SVGLinearGradientElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_link(selector: xtermLib.xtermLibStrings.link): HTMLLinkElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_map(selector: xtermLib.xtermLibStrings.map): HTMLMapElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_mark(selector: xtermLib.xtermLibStrings.mark): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_marker(selector: xtermLib.xtermLibStrings.marker): SVGMarkerElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_marquee(selector: xtermLib.xtermLibStrings.marquee): HTMLMarqueeElement | scala.Null = js.native
  @JSName("closest")
  def closest_mask(selector: xtermLib.xtermLibStrings.mask): SVGMaskElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_menu(selector: xtermLib.xtermLibStrings.menu): HTMLMenuElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_meta(selector: xtermLib.xtermLibStrings.meta): HTMLMetaElement | scala.Null = js.native
  @JSName("closest")
  def closest_metadata(selector: xtermLib.xtermLibStrings.metadata): SVGMetadataElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_meter(selector: xtermLib.xtermLibStrings.meter): HTMLMeterElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_nav(selector: xtermLib.xtermLibStrings.nav): HTMLElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_noscript(selector: xtermLib.xtermLibStrings.noscript): HTMLElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_object(selector: xtermLib.xtermLibStrings.`object`): HTMLObjectElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_ol(selector: xtermLib.xtermLibStrings.ol): HTMLOListElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_optgroup(selector: xtermLib.xtermLibStrings.optgroup): HTMLOptGroupElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_option(selector: xtermLib.xtermLibStrings.option): HTMLOptionElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_output(selector: xtermLib.xtermLibStrings.output): HTMLOutputElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_p(selector: xtermLib.xtermLibStrings.p): HTMLParagraphElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_param(selector: xtermLib.xtermLibStrings.param): HTMLParamElement | scala.Null = js.native
  @JSName("closest")
  def closest_path(selector: xtermLib.xtermLibStrings.path): SVGPathElement | scala.Null = js.native
  @JSName("closest")
  def closest_pattern(selector: xtermLib.xtermLibStrings.pattern): SVGPatternElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_picture(selector: xtermLib.xtermLibStrings.picture): HTMLPictureElement | scala.Null = js.native
  @JSName("closest")
  def closest_polygon(selector: xtermLib.xtermLibStrings.polygon): SVGPolygonElement | scala.Null = js.native
  @JSName("closest")
  def closest_polyline(selector: xtermLib.xtermLibStrings.polyline): SVGPolylineElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_pre(selector: xtermLib.xtermLibStrings.pre): HTMLPreElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_progress(selector: xtermLib.xtermLibStrings.progress): HTMLProgressElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_q(selector: xtermLib.xtermLibStrings.q): HTMLQuoteElement | scala.Null = js.native
  @JSName("closest")
  def closest_radialGradient(selector: xtermLib.xtermLibStrings.radialGradient): SVGRadialGradientElement | scala.Null = js.native
  @JSName("closest")
  def closest_rect(selector: xtermLib.xtermLibStrings.rect): SVGRectElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_rt(selector: xtermLib.xtermLibStrings.rt): HTMLElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_ruby(selector: xtermLib.xtermLibStrings.ruby): HTMLElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_s(selector: xtermLib.xtermLibStrings.s): HTMLElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_samp(selector: xtermLib.xtermLibStrings.samp): HTMLElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_script(selector: xtermLib.xtermLibStrings.script): HTMLScriptElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_section(selector: xtermLib.xtermLibStrings.section): HTMLElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_select(selector: xtermLib.xtermLibStrings.select): HTMLSelectElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_slot(selector: xtermLib.xtermLibStrings.slot): HTMLSlotElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_small(selector: xtermLib.xtermLibStrings.small): HTMLElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_source(selector: xtermLib.xtermLibStrings.source): HTMLSourceElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_span(selector: xtermLib.xtermLibStrings.span): HTMLSpanElement | scala.Null = js.native
  @JSName("closest")
  def closest_stop(selector: xtermLib.xtermLibStrings.stop): SVGStopElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_strong(selector: xtermLib.xtermLibStrings.strong): HTMLElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_style(selector: xtermLib.xtermLibStrings.style): HTMLStyleElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_sub(selector: xtermLib.xtermLibStrings.sub): HTMLElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_sup(selector: xtermLib.xtermLibStrings.sup): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_svg(selector: xtermLib.xtermLibStrings.svg): SVGSVGElement | scala.Null = js.native
  @JSName("closest")
  def closest_switch(selector: xtermLib.xtermLibStrings.switch): SVGSwitchElement | scala.Null = js.native
  @JSName("closest")
  def closest_symbol(selector: xtermLib.xtermLibStrings.symbol): SVGSymbolElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_table(selector: xtermLib.xtermLibStrings.table): HTMLTableElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_tbody(selector: xtermLib.xtermLibStrings.tbody): HTMLTableSectionElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_td(selector: xtermLib.xtermLibStrings.td): HTMLTableDataCellElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_template(selector: xtermLib.xtermLibStrings.template): HTMLTemplateElement | scala.Null = js.native
  @JSName("closest")
  def closest_text(selector: xtermLib.xtermLibStrings.text): SVGTextElement | scala.Null = js.native
  @JSName("closest")
  def closest_textPath(selector: xtermLib.xtermLibStrings.textPath): SVGTextPathElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_textarea(selector: xtermLib.xtermLibStrings.textarea): HTMLTextAreaElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_tfoot(selector: xtermLib.xtermLibStrings.tfoot): HTMLTableSectionElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_th(selector: xtermLib.xtermLibStrings.th): HTMLTableHeaderCellElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_thead(selector: xtermLib.xtermLibStrings.thead): HTMLTableSectionElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_time(selector: xtermLib.xtermLibStrings.time): HTMLTimeElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_title(selector: xtermLib.xtermLibStrings.title): HTMLTitleElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_tr(selector: xtermLib.xtermLibStrings.tr): HTMLTableRowElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_track(selector: xtermLib.xtermLibStrings.track): HTMLTrackElement | scala.Null = js.native
  @JSName("closest")
  def closest_tspan(selector: xtermLib.xtermLibStrings.tspan): SVGTSpanElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_u(selector: xtermLib.xtermLibStrings.u): HTMLElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_ul(selector: xtermLib.xtermLibStrings.ul): HTMLUListElement | scala.Null = js.native
  @JSName("closest")
  def closest_use(selector: xtermLib.xtermLibStrings.use): SVGUseElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_var(selector: xtermLib.xtermLibStrings.`var`): HTMLElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_video(selector: xtermLib.xtermLibStrings.video): HTMLVideoElement | scala.Null = js.native
  @JSName("closest")
  def closest_view(selector: xtermLib.xtermLibStrings.view): SVGViewElement | scala.Null = js.native
  /**
       * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
       */
  @JSName("closest")
  def closest_wbr(selector: xtermLib.xtermLibStrings.wbr): HTMLElement | scala.Null = js.native
  /**
       * Returns element's first attribute whose qualified name is qualifiedName, and null if there is no such attribute otherwise.
       */
  def getAttribute(qualifiedName: java.lang.String): java.lang.String | scala.Null = js.native
  /**
       * Returns element's attribute whose namespace is namespace and local name is localName, and null if there is
       * no such attribute otherwise.
       */
  def getAttributeNS(namespace: java.lang.String, localName: java.lang.String): java.lang.String | scala.Null = js.native
  /**
       * Returns element's attribute whose namespace is namespace and local name is localName, and null if there is
       * no such attribute otherwise.
       */
  def getAttributeNS(namespace: scala.Null, localName: java.lang.String): java.lang.String | scala.Null = js.native
  /**
       * Returns the qualified names of all element's attributes.
       * Can contain duplicates.
       */
  def getAttributeNames(): js.Array[java.lang.String] = js.native
  def getAttributeNode(name: java.lang.String): Attr | scala.Null = js.native
  def getAttributeNodeNS(namespaceURI: java.lang.String, localName: java.lang.String): Attr | scala.Null = js.native
  def getBoundingClientRect(): ClientRect | DOMRect = js.native
  def getClientRects(): ClientRectList | DOMRectList = js.native
  def getElementsByClassName(classNames: java.lang.String): HTMLCollectionOf[Element] = js.native
  def getElementsByTagName(qualifiedName: java.lang.String): HTMLCollectionOf[Element] = js.native
  def getElementsByTagNameNS(namespaceURI: java.lang.String, localName: java.lang.String): HTMLCollectionOf[Element] = js.native
  @JSName("getElementsByTagNameNS")
  def `getElementsByTagNameNS_http://wwww3org/1999/xhtml`(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/1999/xhtml`,
    localName: java.lang.String
  ): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagNameNS")
  def `getElementsByTagNameNS_http://wwww3org/2000/svg`(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    localName: java.lang.String
  ): HTMLCollectionOf[SVGElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_a(qualifiedName: xtermLib.xtermLibStrings.a): HTMLCollectionOf[HTMLAnchorElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_abbr(qualifiedName: xtermLib.xtermLibStrings.abbr): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_address(qualifiedName: xtermLib.xtermLibStrings.address): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_applet(qualifiedName: xtermLib.xtermLibStrings.applet): HTMLCollectionOf[HTMLAppletElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_area(qualifiedName: xtermLib.xtermLibStrings.area): HTMLCollectionOf[HTMLAreaElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_article(qualifiedName: xtermLib.xtermLibStrings.article): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_aside(qualifiedName: xtermLib.xtermLibStrings.aside): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_audio(qualifiedName: xtermLib.xtermLibStrings.audio): HTMLCollectionOf[HTMLAudioElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_b(qualifiedName: xtermLib.xtermLibStrings.b): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_base(qualifiedName: xtermLib.xtermLibStrings.base): HTMLCollectionOf[HTMLBaseElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_basefont(qualifiedName: xtermLib.xtermLibStrings.basefont): HTMLCollectionOf[HTMLBaseFontElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_bdo(qualifiedName: xtermLib.xtermLibStrings.bdo): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_blockquote(qualifiedName: xtermLib.xtermLibStrings.blockquote): HTMLCollectionOf[HTMLQuoteElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_body(qualifiedName: xtermLib.xtermLibStrings.body): HTMLCollectionOf[HTMLBodyElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_br(qualifiedName: xtermLib.xtermLibStrings.br): HTMLCollectionOf[HTMLBRElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_button(qualifiedName: xtermLib.xtermLibStrings.button): HTMLCollectionOf[HTMLButtonElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_canvas(qualifiedName: xtermLib.xtermLibStrings.canvas): HTMLCollectionOf[HTMLCanvasElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_caption(qualifiedName: xtermLib.xtermLibStrings.caption): HTMLCollectionOf[HTMLTableCaptionElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_circle(qualifiedName: xtermLib.xtermLibStrings.circle): HTMLCollectionOf[SVGCircleElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_cite(qualifiedName: xtermLib.xtermLibStrings.cite): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_clipPath(qualifiedName: xtermLib.xtermLibStrings.clipPath): HTMLCollectionOf[SVGClipPathElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_code(qualifiedName: xtermLib.xtermLibStrings.code): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_col(qualifiedName: xtermLib.xtermLibStrings.col): HTMLCollectionOf[HTMLTableColElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_colgroup(qualifiedName: xtermLib.xtermLibStrings.colgroup): HTMLCollectionOf[HTMLTableColElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_data(qualifiedName: xtermLib.xtermLibStrings.data): HTMLCollectionOf[HTMLDataElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_datalist(qualifiedName: xtermLib.xtermLibStrings.datalist): HTMLCollectionOf[HTMLDataListElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_dd(qualifiedName: xtermLib.xtermLibStrings.dd): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_defs(qualifiedName: xtermLib.xtermLibStrings.defs): HTMLCollectionOf[SVGDefsElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_del(qualifiedName: xtermLib.xtermLibStrings.del): HTMLCollectionOf[HTMLModElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_desc(qualifiedName: xtermLib.xtermLibStrings.desc): HTMLCollectionOf[SVGDescElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_details(qualifiedName: xtermLib.xtermLibStrings.details): HTMLCollectionOf[HTMLDetailsElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_dfn(qualifiedName: xtermLib.xtermLibStrings.dfn): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_dialog(qualifiedName: xtermLib.xtermLibStrings.dialog): HTMLCollectionOf[HTMLDialogElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_dir(qualifiedName: xtermLib.xtermLibStrings.dir): HTMLCollectionOf[HTMLDirectoryElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_div(qualifiedName: xtermLib.xtermLibStrings.div): HTMLCollectionOf[HTMLDivElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_dl(qualifiedName: xtermLib.xtermLibStrings.dl): HTMLCollectionOf[HTMLDListElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_dt(qualifiedName: xtermLib.xtermLibStrings.dt): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_ellipse(qualifiedName: xtermLib.xtermLibStrings.ellipse): HTMLCollectionOf[SVGEllipseElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_em(qualifiedName: xtermLib.xtermLibStrings.em): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_embed(qualifiedName: xtermLib.xtermLibStrings.embed): HTMLCollectionOf[HTMLEmbedElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feBlend(qualifiedName: xtermLib.xtermLibStrings.feBlend): HTMLCollectionOf[SVGFEBlendElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feColorMatrix(qualifiedName: xtermLib.xtermLibStrings.feColorMatrix): HTMLCollectionOf[SVGFEColorMatrixElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feComponentTransfer(qualifiedName: xtermLib.xtermLibStrings.feComponentTransfer): HTMLCollectionOf[SVGFEComponentTransferElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feComposite(qualifiedName: xtermLib.xtermLibStrings.feComposite): HTMLCollectionOf[SVGFECompositeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feConvolveMatrix(qualifiedName: xtermLib.xtermLibStrings.feConvolveMatrix): HTMLCollectionOf[SVGFEConvolveMatrixElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feDiffuseLighting(qualifiedName: xtermLib.xtermLibStrings.feDiffuseLighting): HTMLCollectionOf[SVGFEDiffuseLightingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feDisplacementMap(qualifiedName: xtermLib.xtermLibStrings.feDisplacementMap): HTMLCollectionOf[SVGFEDisplacementMapElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feDistantLight(qualifiedName: xtermLib.xtermLibStrings.feDistantLight): HTMLCollectionOf[SVGFEDistantLightElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFlood(qualifiedName: xtermLib.xtermLibStrings.feFlood): HTMLCollectionOf[SVGFEFloodElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFuncA(qualifiedName: xtermLib.xtermLibStrings.feFuncA): HTMLCollectionOf[SVGFEFuncAElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFuncB(qualifiedName: xtermLib.xtermLibStrings.feFuncB): HTMLCollectionOf[SVGFEFuncBElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFuncG(qualifiedName: xtermLib.xtermLibStrings.feFuncG): HTMLCollectionOf[SVGFEFuncGElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFuncR(qualifiedName: xtermLib.xtermLibStrings.feFuncR): HTMLCollectionOf[SVGFEFuncRElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feGaussianBlur(qualifiedName: xtermLib.xtermLibStrings.feGaussianBlur): HTMLCollectionOf[SVGFEGaussianBlurElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feImage(qualifiedName: xtermLib.xtermLibStrings.feImage): HTMLCollectionOf[SVGFEImageElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feMerge(qualifiedName: xtermLib.xtermLibStrings.feMerge): HTMLCollectionOf[SVGFEMergeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feMergeNode(qualifiedName: xtermLib.xtermLibStrings.feMergeNode): HTMLCollectionOf[SVGFEMergeNodeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feMorphology(qualifiedName: xtermLib.xtermLibStrings.feMorphology): HTMLCollectionOf[SVGFEMorphologyElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feOffset(qualifiedName: xtermLib.xtermLibStrings.feOffset): HTMLCollectionOf[SVGFEOffsetElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_fePointLight(qualifiedName: xtermLib.xtermLibStrings.fePointLight): HTMLCollectionOf[SVGFEPointLightElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feSpecularLighting(qualifiedName: xtermLib.xtermLibStrings.feSpecularLighting): HTMLCollectionOf[SVGFESpecularLightingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feSpotLight(qualifiedName: xtermLib.xtermLibStrings.feSpotLight): HTMLCollectionOf[SVGFESpotLightElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feTile(qualifiedName: xtermLib.xtermLibStrings.feTile): HTMLCollectionOf[SVGFETileElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feTurbulence(qualifiedName: xtermLib.xtermLibStrings.feTurbulence): HTMLCollectionOf[SVGFETurbulenceElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_fieldset(qualifiedName: xtermLib.xtermLibStrings.fieldset): HTMLCollectionOf[HTMLFieldSetElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_figcaption(qualifiedName: xtermLib.xtermLibStrings.figcaption): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_figure(qualifiedName: xtermLib.xtermLibStrings.figure): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_filter(qualifiedName: xtermLib.xtermLibStrings.filter): HTMLCollectionOf[SVGFilterElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_font(qualifiedName: xtermLib.xtermLibStrings.font): HTMLCollectionOf[HTMLFontElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_footer(qualifiedName: xtermLib.xtermLibStrings.footer): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_foreignObject(qualifiedName: xtermLib.xtermLibStrings.foreignObject): HTMLCollectionOf[SVGForeignObjectElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_form(qualifiedName: xtermLib.xtermLibStrings.form): HTMLCollectionOf[HTMLFormElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_frame(qualifiedName: xtermLib.xtermLibStrings.frame): HTMLCollectionOf[HTMLFrameElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_frameset(qualifiedName: xtermLib.xtermLibStrings.frameset): HTMLCollectionOf[HTMLFrameSetElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_g(qualifiedName: xtermLib.xtermLibStrings.g): HTMLCollectionOf[SVGGElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_h1(qualifiedName: xtermLib.xtermLibStrings.h1): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_h2(qualifiedName: xtermLib.xtermLibStrings.h2): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_h3(qualifiedName: xtermLib.xtermLibStrings.h3): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_h4(qualifiedName: xtermLib.xtermLibStrings.h4): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_h5(qualifiedName: xtermLib.xtermLibStrings.h5): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_h6(qualifiedName: xtermLib.xtermLibStrings.h6): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_head(qualifiedName: xtermLib.xtermLibStrings.head): HTMLCollectionOf[HTMLHeadElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_header(qualifiedName: xtermLib.xtermLibStrings.header): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_hgroup(qualifiedName: xtermLib.xtermLibStrings.hgroup): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_hr(qualifiedName: xtermLib.xtermLibStrings.hr): HTMLCollectionOf[HTMLHRElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_html(qualifiedName: xtermLib.xtermLibStrings.html): HTMLCollectionOf[HTMLHtmlElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_i(qualifiedName: xtermLib.xtermLibStrings.i): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_iframe(qualifiedName: xtermLib.xtermLibStrings.iframe): HTMLCollectionOf[HTMLIFrameElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_image(qualifiedName: xtermLib.xtermLibStrings.image): HTMLCollectionOf[SVGImageElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_img(qualifiedName: xtermLib.xtermLibStrings.img): HTMLCollectionOf[HTMLImageElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_input(qualifiedName: xtermLib.xtermLibStrings.input): HTMLCollectionOf[HTMLInputElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_ins(qualifiedName: xtermLib.xtermLibStrings.ins): HTMLCollectionOf[HTMLModElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_kbd(qualifiedName: xtermLib.xtermLibStrings.kbd): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_label(qualifiedName: xtermLib.xtermLibStrings.label): HTMLCollectionOf[HTMLLabelElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_legend(qualifiedName: xtermLib.xtermLibStrings.legend): HTMLCollectionOf[HTMLLegendElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_li(qualifiedName: xtermLib.xtermLibStrings.li): HTMLCollectionOf[HTMLLIElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_line(qualifiedName: xtermLib.xtermLibStrings.line): HTMLCollectionOf[SVGLineElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_linearGradient(qualifiedName: xtermLib.xtermLibStrings.linearGradient): HTMLCollectionOf[SVGLinearGradientElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_link(qualifiedName: xtermLib.xtermLibStrings.link): HTMLCollectionOf[HTMLLinkElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_map(qualifiedName: xtermLib.xtermLibStrings.map): HTMLCollectionOf[HTMLMapElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_mark(qualifiedName: xtermLib.xtermLibStrings.mark): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_marker(qualifiedName: xtermLib.xtermLibStrings.marker): HTMLCollectionOf[SVGMarkerElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_marquee(qualifiedName: xtermLib.xtermLibStrings.marquee): HTMLCollectionOf[HTMLMarqueeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_mask(qualifiedName: xtermLib.xtermLibStrings.mask): HTMLCollectionOf[SVGMaskElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_menu(qualifiedName: xtermLib.xtermLibStrings.menu): HTMLCollectionOf[HTMLMenuElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_meta(qualifiedName: xtermLib.xtermLibStrings.meta): HTMLCollectionOf[HTMLMetaElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_metadata(qualifiedName: xtermLib.xtermLibStrings.metadata): HTMLCollectionOf[SVGMetadataElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_meter(qualifiedName: xtermLib.xtermLibStrings.meter): HTMLCollectionOf[HTMLMeterElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_nav(qualifiedName: xtermLib.xtermLibStrings.nav): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_noscript(qualifiedName: xtermLib.xtermLibStrings.noscript): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_object(qualifiedName: xtermLib.xtermLibStrings.`object`): HTMLCollectionOf[HTMLObjectElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_ol(qualifiedName: xtermLib.xtermLibStrings.ol): HTMLCollectionOf[HTMLOListElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_optgroup(qualifiedName: xtermLib.xtermLibStrings.optgroup): HTMLCollectionOf[HTMLOptGroupElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_option(qualifiedName: xtermLib.xtermLibStrings.option): HTMLCollectionOf[HTMLOptionElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_output(qualifiedName: xtermLib.xtermLibStrings.output): HTMLCollectionOf[HTMLOutputElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_p(qualifiedName: xtermLib.xtermLibStrings.p): HTMLCollectionOf[HTMLParagraphElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_param(qualifiedName: xtermLib.xtermLibStrings.param): HTMLCollectionOf[HTMLParamElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_path(qualifiedName: xtermLib.xtermLibStrings.path): HTMLCollectionOf[SVGPathElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_pattern(qualifiedName: xtermLib.xtermLibStrings.pattern): HTMLCollectionOf[SVGPatternElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_picture(qualifiedName: xtermLib.xtermLibStrings.picture): HTMLCollectionOf[HTMLPictureElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_polygon(qualifiedName: xtermLib.xtermLibStrings.polygon): HTMLCollectionOf[SVGPolygonElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_polyline(qualifiedName: xtermLib.xtermLibStrings.polyline): HTMLCollectionOf[SVGPolylineElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_pre(qualifiedName: xtermLib.xtermLibStrings.pre): HTMLCollectionOf[HTMLPreElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_progress(qualifiedName: xtermLib.xtermLibStrings.progress): HTMLCollectionOf[HTMLProgressElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_q(qualifiedName: xtermLib.xtermLibStrings.q): HTMLCollectionOf[HTMLQuoteElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_radialGradient(qualifiedName: xtermLib.xtermLibStrings.radialGradient): HTMLCollectionOf[SVGRadialGradientElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_rect(qualifiedName: xtermLib.xtermLibStrings.rect): HTMLCollectionOf[SVGRectElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_rt(qualifiedName: xtermLib.xtermLibStrings.rt): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_ruby(qualifiedName: xtermLib.xtermLibStrings.ruby): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_s(qualifiedName: xtermLib.xtermLibStrings.s): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_samp(qualifiedName: xtermLib.xtermLibStrings.samp): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_script(qualifiedName: xtermLib.xtermLibStrings.script): HTMLCollectionOf[HTMLScriptElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_section(qualifiedName: xtermLib.xtermLibStrings.section): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_select(qualifiedName: xtermLib.xtermLibStrings.select): HTMLCollectionOf[HTMLSelectElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_slot(qualifiedName: xtermLib.xtermLibStrings.slot): HTMLCollectionOf[HTMLSlotElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_small(qualifiedName: xtermLib.xtermLibStrings.small): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_source(qualifiedName: xtermLib.xtermLibStrings.source): HTMLCollectionOf[HTMLSourceElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_span(qualifiedName: xtermLib.xtermLibStrings.span): HTMLCollectionOf[HTMLSpanElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_stop(qualifiedName: xtermLib.xtermLibStrings.stop): HTMLCollectionOf[SVGStopElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_strong(qualifiedName: xtermLib.xtermLibStrings.strong): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_style(qualifiedName: xtermLib.xtermLibStrings.style): HTMLCollectionOf[HTMLStyleElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_sub(qualifiedName: xtermLib.xtermLibStrings.sub): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_sup(qualifiedName: xtermLib.xtermLibStrings.sup): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_svg(qualifiedName: xtermLib.xtermLibStrings.svg): HTMLCollectionOf[SVGSVGElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_switch(qualifiedName: xtermLib.xtermLibStrings.switch): HTMLCollectionOf[SVGSwitchElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_symbol(qualifiedName: xtermLib.xtermLibStrings.symbol): HTMLCollectionOf[SVGSymbolElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_table(qualifiedName: xtermLib.xtermLibStrings.table): HTMLCollectionOf[HTMLTableElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_tbody(qualifiedName: xtermLib.xtermLibStrings.tbody): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_td(qualifiedName: xtermLib.xtermLibStrings.td): HTMLCollectionOf[HTMLTableDataCellElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_template(qualifiedName: xtermLib.xtermLibStrings.template): HTMLCollectionOf[HTMLTemplateElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_text(qualifiedName: xtermLib.xtermLibStrings.text): HTMLCollectionOf[SVGTextElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_textPath(qualifiedName: xtermLib.xtermLibStrings.textPath): HTMLCollectionOf[SVGTextPathElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_textarea(qualifiedName: xtermLib.xtermLibStrings.textarea): HTMLCollectionOf[HTMLTextAreaElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_tfoot(qualifiedName: xtermLib.xtermLibStrings.tfoot): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_th(qualifiedName: xtermLib.xtermLibStrings.th): HTMLCollectionOf[HTMLTableHeaderCellElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_thead(qualifiedName: xtermLib.xtermLibStrings.thead): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_time(qualifiedName: xtermLib.xtermLibStrings.time): HTMLCollectionOf[HTMLTimeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_title(qualifiedName: xtermLib.xtermLibStrings.title): HTMLCollectionOf[HTMLTitleElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_tr(qualifiedName: xtermLib.xtermLibStrings.tr): HTMLCollectionOf[HTMLTableRowElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_track(qualifiedName: xtermLib.xtermLibStrings.track): HTMLCollectionOf[HTMLTrackElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_tspan(qualifiedName: xtermLib.xtermLibStrings.tspan): HTMLCollectionOf[SVGTSpanElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_u(qualifiedName: xtermLib.xtermLibStrings.u): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_ul(qualifiedName: xtermLib.xtermLibStrings.ul): HTMLCollectionOf[HTMLUListElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_use(qualifiedName: xtermLib.xtermLibStrings.use): HTMLCollectionOf[SVGUseElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_var(qualifiedName: xtermLib.xtermLibStrings.`var`): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_video(qualifiedName: xtermLib.xtermLibStrings.video): HTMLCollectionOf[HTMLVideoElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_view(qualifiedName: xtermLib.xtermLibStrings.view): HTMLCollectionOf[SVGViewElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_wbr(qualifiedName: xtermLib.xtermLibStrings.wbr): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Returns true if element has an attribute whose qualified name is qualifiedName, and false otherwise.
       */
  def hasAttribute(qualifiedName: java.lang.String): scala.Boolean = js.native
  /**
       * Returns true if element has an attribute whose namespace is namespace and local name is localName.
       */
  def hasAttributeNS(namespace: java.lang.String, localName: java.lang.String): scala.Boolean = js.native
  /**
       * Returns true if element has an attribute whose namespace is namespace and local name is localName.
       */
  def hasAttributeNS(namespace: scala.Null, localName: java.lang.String): scala.Boolean = js.native
  /**
       * Returns true if element has attributes, and false otherwise.
       */
  def hasAttributes(): scala.Boolean = js.native
  def hasPointerCapture(pointerId: scala.Double): scala.Boolean = js.native
  def insertAdjacentElement(position: InsertPosition, insertedElement: Element): Element | scala.Null = js.native
  def insertAdjacentHTML(where: InsertPosition, html: java.lang.String): scala.Unit = js.native
  def insertAdjacentText(where: InsertPosition, text: java.lang.String): scala.Unit = js.native
  /**
       * Returns true if matching selectors against element's root yields element, and false otherwise.
       */
  def matches(selectors: java.lang.String): scala.Boolean = js.native
  def msGetRegionContent(): js.Any = js.native
  def releasePointerCapture(pointerId: scala.Double): scala.Unit = js.native
  /**
       * Removes element's first attribute whose qualified name is qualifiedName.
       */
  def removeAttribute(qualifiedName: java.lang.String): scala.Unit = js.native
  /**
       * Removes element's attribute whose namespace is namespace and local name is localName.
       */
  def removeAttributeNS(namespace: java.lang.String, localName: java.lang.String): scala.Unit = js.native
  /**
       * Removes element's attribute whose namespace is namespace and local name is localName.
       */
  def removeAttributeNS(namespace: scala.Null, localName: java.lang.String): scala.Unit = js.native
  def removeAttributeNode(attr: Attr): Attr = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    `type`: xtermLib.xtermLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    `type`: xtermLib.xtermLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    `type`: xtermLib.xtermLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: xtermLib.xtermLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: xtermLib.xtermLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: xtermLib.xtermLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  /**
       * Displays element fullscreen and resolves promise when done.
       */
  def requestFullscreen(): js.Promise[scala.Unit] = js.native
  def scroll(): scala.Unit = js.native
  def scroll(options: ScrollToOptions): scala.Unit = js.native
  def scroll(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scrollBy(): scala.Unit = js.native
  def scrollBy(options: ScrollToOptions): scala.Unit = js.native
  def scrollBy(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scrollIntoView(): scala.Unit = js.native
  def scrollIntoView(arg: scala.Boolean): scala.Unit = js.native
  def scrollIntoView(arg: ScrollIntoViewOptions): scala.Unit = js.native
  def scrollTo(): scala.Unit = js.native
  def scrollTo(options: ScrollToOptions): scala.Unit = js.native
  def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
       * Sets the value of element's first attribute whose qualified name is qualifiedName to value.
       */
  def setAttribute(qualifiedName: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
       * Sets the value of element's attribute whose namespace is namespace and local name is localName to value.
       */
  def setAttributeNS(namespace: java.lang.String, qualifiedName: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
       * Sets the value of element's attribute whose namespace is namespace and local name is localName to value.
       */
  def setAttributeNS(namespace: scala.Null, qualifiedName: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setAttributeNode(attr: Attr): Attr | scala.Null = js.native
  def setAttributeNodeNS(attr: Attr): Attr | scala.Null = js.native
  def setPointerCapture(pointerId: scala.Double): scala.Unit = js.native
  /**
       * If force is not given, "toggles" qualifiedName, removing it if it is
       * present and adding it if it is not present. If force is true, adds qualifiedName. If force is false, removes qualifiedName.
       * Returns true if qualifiedName is now present, and false otherwise.
       */
  def toggleAttribute(qualifiedName: java.lang.String): scala.Boolean = js.native
  /**
       * If force is not given, "toggles" qualifiedName, removing it if it is
       * present and adding it if it is not present. If force is true, adds qualifiedName. If force is false, removes qualifiedName.
       * Returns true if qualifiedName is now present, and false otherwise.
       */
  def toggleAttribute(qualifiedName: java.lang.String, force: scala.Boolean): scala.Boolean = js.native
  def webkitMatchesSelector(selectors: java.lang.String): scala.Boolean = js.native
}

@JSGlobal("Element")
@js.native
object Element
  extends ScalablyTyped.runtime.Instantiable0[Element]

