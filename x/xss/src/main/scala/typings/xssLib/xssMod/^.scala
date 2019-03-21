package typings
package xssLib.xssMod

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
  def StripTagBody(tags: js.Array[java.lang.String], next: js.Function0[scala.Unit]): xssLib.Anon_Html = js.native
  def filterXSS(html: java.lang.String): java.lang.String = js.native
  def filterXSS(html: java.lang.String, options: IFilterXSSOptions): java.lang.String = js.native
  def getDefaultCSSWhiteList(): ICSSFilter = js.native
  def getDefaultWhiteList(): IWhiteList = js.native
  def onIgnoreTagStripAll(): java.lang.String = js.native
  def parseAttr(
    html: java.lang.String,
    onAttr: js.Function2[/* name */ java.lang.String, /* value */ java.lang.String, java.lang.String]
  ): java.lang.String = js.native
  def parseTag(
    html: java.lang.String,
    onTag: js.Function5[
      /* sourcePosition */ scala.Double, 
      /* position */ scala.Double, 
      /* tag */ java.lang.String, 
      /* html */ java.lang.String, 
      /* isClosing */ scala.Boolean, 
      java.lang.String
    ],
    escapeHtml: EscapeHandler
  ): java.lang.String = js.native
}

