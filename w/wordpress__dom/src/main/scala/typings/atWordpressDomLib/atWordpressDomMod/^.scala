package typings
package atWordpressDomLib.atWordpressDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/dom", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def computeCaretRect(): js.UndefOr[stdLib.DOMRect] = js.native
  def documentHasSelection(): scala.Boolean = js.native
  def getOffsetParent(node: stdLib.Node): stdLib.Element | scala.Null = js.native
  def getRectangleFromRange(range: stdLib.Range): stdLib.DOMRect = js.native
  def getScrollContainer(element: stdLib.Element): js.UndefOr[stdLib.Element] = js.native
  def insertAfter(newNode: stdLib.Node, referenceNode: stdLib.Node): scala.Unit = js.native
  def isEntirelySelected(element: stdLib.HTMLElement): scala.Boolean = js.native
  def isHorizontalEdge(container: stdLib.HTMLElement, isReverse: scala.Boolean): scala.Boolean = js.native
  def isTextField(element: stdLib.HTMLElement): scala.Boolean = js.native
  def isVerticalEdge(container: stdLib.HTMLElement, isReverse: scala.Boolean): scala.Boolean = js.native
  def placeCaretAtHorizontalEdge(container: js.UndefOr[scala.Nothing], isReverse: scala.Boolean): scala.Unit = js.native
  def placeCaretAtHorizontalEdge(container: stdLib.HTMLElement, isReverse: scala.Boolean): scala.Unit = js.native
  def placeCaretAtVerticalEdge(container: js.UndefOr[scala.Nothing], isReverse: scala.Boolean): scala.Unit = js.native
  def placeCaretAtVerticalEdge(container: js.UndefOr[scala.Nothing], isReverse: scala.Boolean, rect: stdLib.DOMRect): scala.Unit = js.native
  def placeCaretAtVerticalEdge(
    container: js.UndefOr[scala.Nothing],
    isReverse: scala.Boolean,
    rect: stdLib.DOMRect,
    mayUseScroll: scala.Boolean
  ): scala.Unit = js.native
  def placeCaretAtVerticalEdge(container: stdLib.HTMLElement, isReverse: scala.Boolean): scala.Unit = js.native
  def placeCaretAtVerticalEdge(container: stdLib.HTMLElement, isReverse: scala.Boolean, rect: stdLib.DOMRect): scala.Unit = js.native
  def placeCaretAtVerticalEdge(
    container: stdLib.HTMLElement,
    isReverse: scala.Boolean,
    rect: stdLib.DOMRect,
    mayUseScroll: scala.Boolean
  ): scala.Unit = js.native
  def remove(node: stdLib.Node): scala.Unit = js.native
  def replace(processedNode: stdLib.Node, newNode: stdLib.Node): scala.Unit = js.native
  @JSName("replaceTag")
  def replaceTag_a(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.a): stdLib.HTMLAnchorElement = js.native
  @JSName("replaceTag")
  def replaceTag_abbr(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.abbr): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_address(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.address): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_applet(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.applet): stdLib.HTMLAppletElement = js.native
  @JSName("replaceTag")
  def replaceTag_area(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.area): stdLib.HTMLAreaElement = js.native
  @JSName("replaceTag")
  def replaceTag_article(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.article): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_aside(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.aside): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_audio(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.audio): stdLib.HTMLAudioElement = js.native
  @JSName("replaceTag")
  def replaceTag_b(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.b): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_base(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.base): stdLib.HTMLBaseElement = js.native
  @JSName("replaceTag")
  def replaceTag_basefont(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.basefont): stdLib.HTMLBaseFontElement = js.native
  @JSName("replaceTag")
  def replaceTag_bdi(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.bdi): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_bdo(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.bdo): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_blockquote(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.blockquote): stdLib.HTMLQuoteElement = js.native
  @JSName("replaceTag")
  def replaceTag_body(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.body): stdLib.HTMLBodyElement = js.native
  @JSName("replaceTag")
  def replaceTag_br(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.br): stdLib.HTMLBRElement = js.native
  @JSName("replaceTag")
  def replaceTag_button(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.button): stdLib.HTMLButtonElement = js.native
  @JSName("replaceTag")
  def replaceTag_canvas(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.canvas): stdLib.HTMLCanvasElement = js.native
  @JSName("replaceTag")
  def replaceTag_caption(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.caption): stdLib.HTMLTableCaptionElement = js.native
  @JSName("replaceTag")
  def replaceTag_cite(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.cite): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_code(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.code): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_col(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.col): stdLib.HTMLTableColElement = js.native
  @JSName("replaceTag")
  def replaceTag_colgroup(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.colgroup): stdLib.HTMLTableColElement = js.native
  @JSName("replaceTag")
  def replaceTag_data(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.data): stdLib.HTMLDataElement = js.native
  @JSName("replaceTag")
  def replaceTag_datalist(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.datalist): stdLib.HTMLDataListElement = js.native
  @JSName("replaceTag")
  def replaceTag_dd(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.dd): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_del(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.del): stdLib.HTMLModElement = js.native
  @JSName("replaceTag")
  def replaceTag_details(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.details): stdLib.HTMLDetailsElement = js.native
  @JSName("replaceTag")
  def replaceTag_dfn(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.dfn): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_dialog(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.dialog): stdLib.HTMLDialogElement = js.native
  @JSName("replaceTag")
  def replaceTag_dir(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.dir): stdLib.HTMLDirectoryElement = js.native
  @JSName("replaceTag")
  def replaceTag_div(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.div): stdLib.HTMLDivElement = js.native
  @JSName("replaceTag")
  def replaceTag_dl(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.dl): stdLib.HTMLDListElement = js.native
  @JSName("replaceTag")
  def replaceTag_dt(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.dt): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_em(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.em): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_embed(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.embed): stdLib.HTMLEmbedElement = js.native
  @JSName("replaceTag")
  def replaceTag_fieldset(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.fieldset): stdLib.HTMLFieldSetElement = js.native
  @JSName("replaceTag")
  def replaceTag_figcaption(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.figcaption): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_figure(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.figure): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_font(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.font): stdLib.HTMLFontElement = js.native
  @JSName("replaceTag")
  def replaceTag_footer(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.footer): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_form(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.form): stdLib.HTMLFormElement = js.native
  @JSName("replaceTag")
  def replaceTag_frame(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.frame): stdLib.HTMLFrameElement = js.native
  @JSName("replaceTag")
  def replaceTag_frameset(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.frameset): stdLib.HTMLFrameSetElement = js.native
  @JSName("replaceTag")
  def replaceTag_h1(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.h1): stdLib.HTMLHeadingElement = js.native
  @JSName("replaceTag")
  def replaceTag_h2(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.h2): stdLib.HTMLHeadingElement = js.native
  @JSName("replaceTag")
  def replaceTag_h3(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.h3): stdLib.HTMLHeadingElement = js.native
  @JSName("replaceTag")
  def replaceTag_h4(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.h4): stdLib.HTMLHeadingElement = js.native
  @JSName("replaceTag")
  def replaceTag_h5(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.h5): stdLib.HTMLHeadingElement = js.native
  @JSName("replaceTag")
  def replaceTag_h6(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.h6): stdLib.HTMLHeadingElement = js.native
  @JSName("replaceTag")
  def replaceTag_head(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.head): stdLib.HTMLHeadElement = js.native
  @JSName("replaceTag")
  def replaceTag_header(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.header): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_hgroup(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.hgroup): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_hr(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.hr): stdLib.HTMLHRElement = js.native
  @JSName("replaceTag")
  def replaceTag_html(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.html): stdLib.HTMLHtmlElement = js.native
  @JSName("replaceTag")
  def replaceTag_i(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.i): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_iframe(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.iframe): stdLib.HTMLIFrameElement = js.native
  @JSName("replaceTag")
  def replaceTag_img(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.img): stdLib.HTMLImageElement = js.native
  @JSName("replaceTag")
  def replaceTag_input(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.input): stdLib.HTMLInputElement = js.native
  @JSName("replaceTag")
  def replaceTag_ins(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.ins): stdLib.HTMLModElement = js.native
  @JSName("replaceTag")
  def replaceTag_kbd(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.kbd): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_label(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.label): stdLib.HTMLLabelElement = js.native
  @JSName("replaceTag")
  def replaceTag_legend(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.legend): stdLib.HTMLLegendElement = js.native
  @JSName("replaceTag")
  def replaceTag_li(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.li): stdLib.HTMLLIElement = js.native
  @JSName("replaceTag")
  def replaceTag_link(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.link): stdLib.HTMLLinkElement = js.native
  @JSName("replaceTag")
  def replaceTag_main(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.main): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_map(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.map): stdLib.HTMLMapElement = js.native
  @JSName("replaceTag")
  def replaceTag_mark(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.mark): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_marquee(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.marquee): stdLib.HTMLMarqueeElement = js.native
  @JSName("replaceTag")
  def replaceTag_menu(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.menu): stdLib.HTMLMenuElement = js.native
  @JSName("replaceTag")
  def replaceTag_meta(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.meta): stdLib.HTMLMetaElement = js.native
  @JSName("replaceTag")
  def replaceTag_meter(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.meter): stdLib.HTMLMeterElement = js.native
  @JSName("replaceTag")
  def replaceTag_nav(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.nav): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_noscript(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.noscript): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_object(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.`object`): stdLib.HTMLObjectElement = js.native
  @JSName("replaceTag")
  def replaceTag_ol(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.ol): stdLib.HTMLOListElement = js.native
  @JSName("replaceTag")
  def replaceTag_optgroup(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.optgroup): stdLib.HTMLOptGroupElement = js.native
  @JSName("replaceTag")
  def replaceTag_option(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.option): stdLib.HTMLOptionElement = js.native
  @JSName("replaceTag")
  def replaceTag_output(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.output): stdLib.HTMLOutputElement = js.native
  @JSName("replaceTag")
  def replaceTag_p(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.p): stdLib.HTMLParagraphElement = js.native
  @JSName("replaceTag")
  def replaceTag_param(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.param): stdLib.HTMLParamElement = js.native
  @JSName("replaceTag")
  def replaceTag_picture(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.picture): stdLib.HTMLPictureElement = js.native
  @JSName("replaceTag")
  def replaceTag_pre(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.pre): stdLib.HTMLPreElement = js.native
  @JSName("replaceTag")
  def replaceTag_progress(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.progress): stdLib.HTMLProgressElement = js.native
  @JSName("replaceTag")
  def replaceTag_q(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.q): stdLib.HTMLQuoteElement = js.native
  @JSName("replaceTag")
  def replaceTag_rp(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.rp): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_rt(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.rt): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_ruby(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.ruby): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_s(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.s): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_samp(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.samp): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_script(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.script): stdLib.HTMLScriptElement = js.native
  @JSName("replaceTag")
  def replaceTag_section(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.section): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_select(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.select): stdLib.HTMLSelectElement = js.native
  @JSName("replaceTag")
  def replaceTag_slot(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.slot): stdLib.HTMLSlotElement = js.native
  @JSName("replaceTag")
  def replaceTag_small(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.small): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_source(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.source): stdLib.HTMLSourceElement = js.native
  @JSName("replaceTag")
  def replaceTag_span(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.span): stdLib.HTMLSpanElement = js.native
  @JSName("replaceTag")
  def replaceTag_strong(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.strong): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_style(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.style): stdLib.HTMLStyleElement = js.native
  @JSName("replaceTag")
  def replaceTag_sub(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.sub): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_summary(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.summary): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_sup(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.sup): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_table(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.table): stdLib.HTMLTableElement = js.native
  @JSName("replaceTag")
  def replaceTag_tbody(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.tbody): stdLib.HTMLTableSectionElement = js.native
  @JSName("replaceTag")
  def replaceTag_td(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.td): stdLib.HTMLTableDataCellElement = js.native
  @JSName("replaceTag")
  def replaceTag_template(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.template): stdLib.HTMLTemplateElement = js.native
  @JSName("replaceTag")
  def replaceTag_textarea(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.textarea): stdLib.HTMLTextAreaElement = js.native
  @JSName("replaceTag")
  def replaceTag_tfoot(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.tfoot): stdLib.HTMLTableSectionElement = js.native
  @JSName("replaceTag")
  def replaceTag_th(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.th): stdLib.HTMLTableHeaderCellElement = js.native
  @JSName("replaceTag")
  def replaceTag_thead(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.thead): stdLib.HTMLTableSectionElement = js.native
  @JSName("replaceTag")
  def replaceTag_time(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.time): stdLib.HTMLTimeElement = js.native
  @JSName("replaceTag")
  def replaceTag_title(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.title): stdLib.HTMLTitleElement = js.native
  @JSName("replaceTag")
  def replaceTag_tr(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.tr): stdLib.HTMLTableRowElement = js.native
  @JSName("replaceTag")
  def replaceTag_track(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.track): stdLib.HTMLTrackElement = js.native
  @JSName("replaceTag")
  def replaceTag_u(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.u): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_ul(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.ul): stdLib.HTMLUListElement = js.native
  @JSName("replaceTag")
  def replaceTag_var(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.`var`): stdLib.HTMLElement = js.native
  @JSName("replaceTag")
  def replaceTag_video(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.video): stdLib.HTMLVideoElement = js.native
  @JSName("replaceTag")
  def replaceTag_wbr(node: stdLib.Node, tagName: atWordpressDomLib.atWordpressDomLibStrings.wbr): stdLib.HTMLElement = js.native
  def unwrap(node: stdLib.Node): scala.Unit = js.native
  def wrap(newNode: stdLib.Node, referenceNode: stdLib.Node): scala.Unit = js.native
}

