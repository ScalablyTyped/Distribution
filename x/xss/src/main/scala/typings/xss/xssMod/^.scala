package typings.xss.xssMod

import typings.xss.Anon_Html
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xss", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val clearNonPrintableCharacter: EscapeHandler = js.native
  val cssFilter: ICSSFilter = js.native
  val escapeAttrValue: EscapeHandler = js.native
  val escapeDangerHtml5Entities: EscapeHandler = js.native
  val escapeHtml: EscapeHandler = js.native
  val escapeHtmlEntities: EscapeHandler = js.native
  val escapeQuote: EscapeHandler = js.native
  val friendlyAttrValue: EscapeHandler = js.native
  val onIgnoreTag: OnTagHandler = js.native
  val onIgnoreTagAttr: OnTagAttrHandler = js.native
  val onTag: OnTagHandler = js.native
  val onTagAttr: OnTagAttrHandler = js.native
  val safeAttrValue: SafeAttrValueHandler = js.native
  val stripBlankChar: EscapeHandler = js.native
  val stripCommentTag: EscapeHandler = js.native
  val unescapeQuote: EscapeHandler = js.native
  val whiteList: IWhiteList = js.native
  def StripTagBody(tags: js.Array[String], next: js.Function0[Unit]): Anon_Html = js.native
  def filterXSS(html: String): String = js.native
  def filterXSS(html: String, options: IFilterXSSOptions): String = js.native
  def getDefaultCSSWhiteList(): ICSSFilter = js.native
  def getDefaultWhiteList(): IWhiteList = js.native
  def onIgnoreTagStripAll(): String = js.native
  def parseAttr(html: String, onAttr: js.Function2[/* name */ String, /* value */ String, String]): String = js.native
  def parseTag(
    html: String,
    onTag: js.Function5[
      /* sourcePosition */ Double, 
      /* position */ Double, 
      /* tag */ String, 
      /* html */ String, 
      /* isClosing */ Boolean, 
      String
    ],
    escapeHtml: EscapeHandler
  ): String = js.native
}

