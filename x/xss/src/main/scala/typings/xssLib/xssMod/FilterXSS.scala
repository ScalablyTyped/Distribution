package typings
package xssLib.xssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FilterXSS extends js.Object {
  def process(html: java.lang.String): java.lang.String
}

@js.native
trait filterXSS extends js.Object {
  var FilterXSS: ScalablyTyped.runtime.Instantiable1[/* options */ js.UndefOr[/* options */ xssLib.XSSNs.IFilterXSSOptions], FilterXSS] = js.native
  @JSName("StripTagBody")
  var StripTagBody_Original: js.Function2[
    /* tags */ js.Array[java.lang.String], 
    /* next */ js.Function0[scala.Unit], 
    xssLib.Anon_OnIgnoreTag
  ] = js.native
  @JSName("clearNonPrintableCharacter")
  var clearNonPrintableCharacter_Original: xssLib.XSSNs.EscapeHandler = js.native
  var cssFilter: xssLib.XSSNs.ICSSFilter = js.native
  @JSName("escapeAttrValue")
  var escapeAttrValue_Original: xssLib.XSSNs.EscapeHandler = js.native
  @JSName("escapeDangerHtml5Entities")
  var escapeDangerHtml5Entities_Original: xssLib.XSSNs.EscapeHandler = js.native
  @JSName("escapeHtmlEntities")
  var escapeHtmlEntities_Original: xssLib.XSSNs.EscapeHandler = js.native
  @JSName("escapeHtml")
  var escapeHtml_Original: xssLib.XSSNs.EscapeHandler = js.native
  @JSName("escapeQuote")
  var escapeQuote_Original: xssLib.XSSNs.EscapeHandler = js.native
  @JSName("friendlyAttrValue")
  var friendlyAttrValue_Original: xssLib.XSSNs.EscapeHandler = js.native
  @JSName("onIgnoreTagAttr")
  var onIgnoreTagAttr_Original: xssLib.XSSNs.OnTagAttrHandler = js.native
  @JSName("onIgnoreTag")
  var onIgnoreTag_Original: xssLib.XSSNs.OnTagHandler = js.native
  @JSName("onTagAttr")
  var onTagAttr_Original: xssLib.XSSNs.OnTagAttrHandler = js.native
  @JSName("onTag")
  var onTag_Original: xssLib.XSSNs.OnTagHandler = js.native
  @JSName("safeAttrValue")
  var safeAttrValue_Original: xssLib.XSSNs.SafeAttrValueHandler = js.native
  @JSName("stripBlankChar")
  var stripBlankChar_Original: xssLib.XSSNs.EscapeHandler = js.native
  @JSName("stripCommentTag")
  var stripCommentTag_Original: xssLib.XSSNs.EscapeHandler = js.native
  @JSName("unescapeQuote")
  var unescapeQuote_Original: xssLib.XSSNs.EscapeHandler = js.native
  var whiteList: xssLib.XSSNs.IWhiteList = js.native
  def apply(html: java.lang.String): java.lang.String = js.native
  def apply(html: java.lang.String, options: xssLib.XSSNs.IFilterXSSOptions): java.lang.String = js.native
  def StripTagBody(tags: js.Array[java.lang.String], next: js.Function0[scala.Unit]): xssLib.Anon_OnIgnoreTag = js.native
  def clearNonPrintableCharacter(str: java.lang.String): java.lang.String = js.native
  def escapeAttrValue(str: java.lang.String): java.lang.String = js.native
  def escapeDangerHtml5Entities(str: java.lang.String): java.lang.String = js.native
  def escapeHtml(str: java.lang.String): java.lang.String = js.native
  def escapeHtmlEntities(str: java.lang.String): java.lang.String = js.native
  def escapeQuote(str: java.lang.String): java.lang.String = js.native
  def friendlyAttrValue(str: java.lang.String): java.lang.String = js.native
  def getDefaultCSSWhiteList(): xssLib.XSSNs.ICSSFilter = js.native
  def getDefaultWhiteList(): xssLib.XSSNs.IWhiteList = js.native
  def onIgnoreTag(tag: java.lang.String, html: java.lang.String, options: js.Object): java.lang.String | scala.Unit = js.native
  def onIgnoreTagAttr(tag: java.lang.String, name: java.lang.String, value: java.lang.String, isWhiteAttr: scala.Boolean): java.lang.String | scala.Unit = js.native
  def onIgnoreTagStripAll(): java.lang.String = js.native
  def onTag(tag: java.lang.String, html: java.lang.String, options: js.Object): java.lang.String | scala.Unit = js.native
  def onTagAttr(tag: java.lang.String, name: java.lang.String, value: java.lang.String, isWhiteAttr: scala.Boolean): java.lang.String | scala.Unit = js.native
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
    escapeHtml: xssLib.XSSNs.EscapeHandler
  ): java.lang.String = js.native
  def safeAttrValue(
    tag: java.lang.String,
    name: java.lang.String,
    value: java.lang.String,
    cssFilter: xssLib.XSSNs.ICSSFilter
  ): java.lang.String = js.native
  def stripBlankChar(str: java.lang.String): java.lang.String = js.native
  def stripCommentTag(str: java.lang.String): java.lang.String = js.native
  def unescapeQuote(str: java.lang.String): java.lang.String = js.native
}

