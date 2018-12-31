package typings
package summernoteLib.summernoteMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def summernote(): JQuery = js.native
  def summernote(command: java.lang.String): JQuery = js.native
  def summernote(command: java.lang.String, markupString: java.lang.String): JQuery = js.native
  def summernote(command: java.lang.String, node: jqueryLib.JQueryNs.Node): JQuery = js.native
  def summernote(command: java.lang.String, url: java.lang.String, filename: java.lang.String): JQuery = js.native
  def summernote(
    command: java.lang.String,
    url: java.lang.String,
    filename: summernoteLib.summernoteMod.Global.SummernoteNs.EditImageCallback
  ): JQuery = js.native
  def summernote(command: java.lang.String, value: scala.Double): JQuery = js.native
  def summernote(options: summernoteLib.summernoteMod.Global.SummernoteNs.Options): JQuery = js.native
  @JSName("summernote")
  def summernote_backColor(command: summernoteLib.summernoteLibStrings.backColor, color: java.lang.String): JQuery = js.native
  @JSName("summernote")
  def summernote_bold(fontStyle: summernoteLib.summernoteLibStrings.bold): JQuery = js.native
  @JSName("summernote")
  def summernote_code(command: summernoteLib.summernoteLibStrings.code): JQuery = js.native
  @JSName("summernote")
  def summernote_code(command: summernoteLib.summernoteLibStrings.code, markupStr: java.lang.String): JQuery = js.native
  @JSName("summernote")
  def summernote_createLink(
    command: summernoteLib.summernoteLibStrings.createLink,
    options: summernoteLib.summernoteMod.Global.SummernoteNs.CreateLinkOptions
  ): JQuery = js.native
  @JSName("summernote")
  def summernote_createRange(command: summernoteLib.summernoteLibStrings.createRange): JQuery = js.native
  @JSName("summernote")
  def summernote_destroy(command: summernoteLib.summernoteLibStrings.destroy): JQuery = js.native
  @JSName("summernote")
  def summernote_disable(command: summernoteLib.summernoteLibStrings.disable): JQuery = js.native
  // Font style API
  @JSName("summernote")
  def summernote_editorbold(fontStyle: summernoteLib.summernoteLibStrings.editorDOTbold): JQuery = js.native
  // Basic API
  @JSName("summernote")
  def summernote_editorcreateRange(command: summernoteLib.summernoteLibStrings.editorDOTcreateRange): JQuery = js.native
  @JSName("summernote")
  def summernote_editorfocus(command: summernoteLib.summernoteLibStrings.editorDOTfocus): JQuery = js.native
  @JSName("summernote")
  def summernote_editorfontSize(command: summernoteLib.summernoteLibStrings.editorDOTfontSize, fontSize: scala.Double): JQuery = js.native
  @JSName("summernote")
  def summernote_editorindent(command: summernoteLib.summernoteLibStrings.editorDOTindent): JQuery = js.native
  // Insertion API
  @JSName("summernote")
  def summernote_editorinsertImage(command: summernoteLib.summernoteLibStrings.editorDOTinsertImage, url: java.lang.String): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertImage(
    command: summernoteLib.summernoteLibStrings.editorDOTinsertImage,
    url: java.lang.String,
    filename: java.lang.String
  ): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertImage(
    command: summernoteLib.summernoteLibStrings.editorDOTinsertImage,
    url: java.lang.String,
    filename: summernoteLib.summernoteMod.Global.SummernoteNs.EditImageCallback
  ): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertNode(command: summernoteLib.summernoteLibStrings.editorDOTinsertNode, node: jqueryLib.JQueryNs.Node): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertOrderedList(command: summernoteLib.summernoteLibStrings.editorDOTinsertOrderedList): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertText(command: summernoteLib.summernoteLibStrings.editorDOTinsertText, text: java.lang.String): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertUnorderedList(command: summernoteLib.summernoteLibStrings.editorDOTinsertUnorderedList): JQuery = js.native
  @JSName("summernote")
  def summernote_editorisEmpty(command: summernoteLib.summernoteLibStrings.editorDOTisEmpty): scala.Boolean = js.native
  @JSName("summernote")
  def summernote_editoritalic(fontStyle: summernoteLib.summernoteLibStrings.editorDOTitalic): JQuery = js.native
  @JSName("summernote")
  def summernote_editorjustifyCenter(command: summernoteLib.summernoteLibStrings.editorDOTjustifyCenter): JQuery = js.native
  @JSName("summernote")
  def summernote_editorjustifyFull(command: summernoteLib.summernoteLibStrings.editorDOTjustifyFull): JQuery = js.native
  // Paragraph API
  @JSName("summernote")
  def summernote_editorjustifyLeft(command: summernoteLib.summernoteLibStrings.editorDOTjustifyLeft): JQuery = js.native
  @JSName("summernote")
  def summernote_editorjustifyRight(command: summernoteLib.summernoteLibStrings.editorDOTjustifyRight): JQuery = js.native
  @JSName("summernote")
  def summernote_editoroutdent(command: summernoteLib.summernoteLibStrings.editorDOToutdent): JQuery = js.native
  @JSName("summernote")
  def summernote_editorpasteHTML(command: summernoteLib.summernoteLibStrings.editorDOTpasteHTML, markup: java.lang.String): JQuery = js.native
  @JSName("summernote")
  def summernote_editorredo(command: summernoteLib.summernoteLibStrings.editorDOTredo): JQuery = js.native
  @JSName("summernote")
  def summernote_editorremoveFormat(command: summernoteLib.summernoteLibStrings.editorDOTremoveFormat): JQuery = js.native
  @JSName("summernote")
  def summernote_editorrestoreRange(command: summernoteLib.summernoteLibStrings.editorDOTrestoreRange): JQuery = js.native
  @JSName("summernote")
  def summernote_editorsaveRange(command: summernoteLib.summernoteLibStrings.editorDOTsaveRange): JQuery = js.native
  @JSName("summernote")
  def summernote_editorstrikethrough(fontStyle: summernoteLib.summernoteLibStrings.editorDOTstrikethrough): JQuery = js.native
  @JSName("summernote")
  def summernote_editorsubscript(command: summernoteLib.summernoteLibStrings.editorDOTsubscript): JQuery = js.native
  @JSName("summernote")
  def summernote_editorsuperscript(command: summernoteLib.summernoteLibStrings.editorDOTsuperscript): JQuery = js.native
  @JSName("summernote")
  def summernote_editorunderline(fontStyle: summernoteLib.summernoteLibStrings.editorDOTunderline): JQuery = js.native
  @JSName("summernote")
  def summernote_editorundo(command: summernoteLib.summernoteLibStrings.editorDOTundo): JQuery = js.native
  @JSName("summernote")
  def summernote_enable(command: summernoteLib.summernoteLibStrings.enable): JQuery = js.native
  @JSName("summernote")
  def summernote_focus(command: summernoteLib.summernoteLibStrings.focus): JQuery = js.native
  @JSName("summernote")
  def summernote_fontName(command: summernoteLib.summernoteLibStrings.fontName, fontName: java.lang.String): JQuery = js.native
  @JSName("summernote")
  def summernote_fontSize(command: summernoteLib.summernoteLibStrings.fontSize, fontSize: scala.Double): JQuery = js.native
  @JSName("summernote")
  def summernote_foreColor(command: summernoteLib.summernoteLibStrings.foreColor, color: java.lang.String): JQuery = js.native
  @JSName("summernote")
  def summernote_formatH1(command: summernoteLib.summernoteLibStrings.formatH1): JQuery = js.native
  @JSName("summernote")
  def summernote_formatH2(command: summernoteLib.summernoteLibStrings.formatH2): JQuery = js.native
  @JSName("summernote")
  def summernote_formatH3(command: summernoteLib.summernoteLibStrings.formatH3): JQuery = js.native
  @JSName("summernote")
  def summernote_formatH4(command: summernoteLib.summernoteLibStrings.formatH4): JQuery = js.native
  @JSName("summernote")
  def summernote_formatH5(command: summernoteLib.summernoteLibStrings.formatH5): JQuery = js.native
  @JSName("summernote")
  def summernote_formatH6(command: summernoteLib.summernoteLibStrings.formatH6): JQuery = js.native
  @JSName("summernote")
  def summernote_formatPara(command: summernoteLib.summernoteLibStrings.formatPara): JQuery = js.native
  @JSName("summernote")
  def summernote_indent(command: summernoteLib.summernoteLibStrings.indent): JQuery = js.native
  @JSName("summernote")
  def summernote_insertImage(command: summernoteLib.summernoteLibStrings.insertImage, url: java.lang.String): JQuery = js.native
  @JSName("summernote")
  def summernote_insertImage(
    command: summernoteLib.summernoteLibStrings.insertImage,
    url: java.lang.String,
    filename: java.lang.String
  ): JQuery = js.native
  @JSName("summernote")
  def summernote_insertImage(
    command: summernoteLib.summernoteLibStrings.insertImage,
    url: java.lang.String,
    filename: summernoteLib.summernoteMod.Global.SummernoteNs.EditImageCallback
  ): JQuery = js.native
  @JSName("summernote")
  def summernote_insertNode(command: summernoteLib.summernoteLibStrings.insertNode, node: jqueryLib.JQueryNs.Node): JQuery = js.native
  @JSName("summernote")
  def summernote_insertOrderedList(command: summernoteLib.summernoteLibStrings.insertOrderedList): JQuery = js.native
  @JSName("summernote")
  def summernote_insertParagraph(command: summernoteLib.summernoteLibStrings.insertParagraph): JQuery = js.native
  @JSName("summernote")
  def summernote_insertText(command: summernoteLib.summernoteLibStrings.insertText, text: java.lang.String): JQuery = js.native
  @JSName("summernote")
  def summernote_insertUnorderedList(command: summernoteLib.summernoteLibStrings.insertUnorderedList): JQuery = js.native
  @JSName("summernote")
  def summernote_isEmpty(command: summernoteLib.summernoteLibStrings.isEmpty): scala.Boolean = js.native
  @JSName("summernote")
  def summernote_italic(fontStyle: summernoteLib.summernoteLibStrings.italic): JQuery = js.native
  @JSName("summernote")
  def summernote_justifyCenter(command: summernoteLib.summernoteLibStrings.justifyCenter): JQuery = js.native
  @JSName("summernote")
  def summernote_justifyFull(command: summernoteLib.summernoteLibStrings.justifyFull): JQuery = js.native
  @JSName("summernote")
  def summernote_justifyLeft(command: summernoteLib.summernoteLibStrings.justifyLeft): JQuery = js.native
  @JSName("summernote")
  def summernote_justifyRight(command: summernoteLib.summernoteLibStrings.justifyRight): JQuery = js.native
  @JSName("summernote")
  def summernote_outdent(command: summernoteLib.summernoteLibStrings.outdent): JQuery = js.native
  @JSName("summernote")
  def summernote_pasteHTML(command: summernoteLib.summernoteLibStrings.pasteHTML, markup: java.lang.String): JQuery = js.native
  @JSName("summernote")
  def summernote_redo(command: summernoteLib.summernoteLibStrings.redo): JQuery = js.native
  @JSName("summernote")
  def summernote_removeFormat(command: summernoteLib.summernoteLibStrings.removeFormat): JQuery = js.native
  @JSName("summernote")
  def summernote_reset(command: summernoteLib.summernoteLibStrings.reset): JQuery = js.native
  @JSName("summernote")
  def summernote_restoreRange(command: summernoteLib.summernoteLibStrings.restoreRange): JQuery = js.native
  @JSName("summernote")
  def summernote_saveRange(command: summernoteLib.summernoteLibStrings.saveRange): JQuery = js.native
  @JSName("summernote")
  def summernote_strikethrough(fontStyle: summernoteLib.summernoteLibStrings.strikethrough): JQuery = js.native
  @JSName("summernote")
  def summernote_subscript(command: summernoteLib.summernoteLibStrings.subscript): JQuery = js.native
  @JSName("summernote")
  def summernote_superscript(command: summernoteLib.summernoteLibStrings.superscript): JQuery = js.native
  @JSName("summernote")
  def summernote_underline(fontStyle: summernoteLib.summernoteLibStrings.underline): JQuery = js.native
  @JSName("summernote")
  def summernote_undo(command: summernoteLib.summernoteLibStrings.undo): JQuery = js.native
}

