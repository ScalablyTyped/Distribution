package typings.summernote.summernoteMod._Global_

import typings.jquery.JQuery.Node
import typings.summernote.summernoteMod._Global_.Summernote.CreateLinkOptions
import typings.summernote.summernoteMod._Global_.Summernote.EditImageCallback
import typings.summernote.summernoteMod._Global_.Summernote.Options
import typings.summernote.summernoteStrings.backColor
import typings.summernote.summernoteStrings.bold
import typings.summernote.summernoteStrings.code
import typings.summernote.summernoteStrings.createLink
import typings.summernote.summernoteStrings.createRange
import typings.summernote.summernoteStrings.destroy
import typings.summernote.summernoteStrings.disable
import typings.summernote.summernoteStrings.editorDOTbold
import typings.summernote.summernoteStrings.editorDOTcreateRange
import typings.summernote.summernoteStrings.editorDOTfocus
import typings.summernote.summernoteStrings.editorDOTfontSize
import typings.summernote.summernoteStrings.editorDOTindent
import typings.summernote.summernoteStrings.editorDOTinsertImage
import typings.summernote.summernoteStrings.editorDOTinsertNode
import typings.summernote.summernoteStrings.editorDOTinsertOrderedList
import typings.summernote.summernoteStrings.editorDOTinsertText
import typings.summernote.summernoteStrings.editorDOTinsertUnorderedList
import typings.summernote.summernoteStrings.editorDOTisEmpty
import typings.summernote.summernoteStrings.editorDOTitalic
import typings.summernote.summernoteStrings.editorDOTjustifyCenter
import typings.summernote.summernoteStrings.editorDOTjustifyFull
import typings.summernote.summernoteStrings.editorDOTjustifyLeft
import typings.summernote.summernoteStrings.editorDOTjustifyRight
import typings.summernote.summernoteStrings.editorDOToutdent
import typings.summernote.summernoteStrings.editorDOTpasteHTML
import typings.summernote.summernoteStrings.editorDOTredo
import typings.summernote.summernoteStrings.editorDOTremoveFormat
import typings.summernote.summernoteStrings.editorDOTrestoreRange
import typings.summernote.summernoteStrings.editorDOTsaveRange
import typings.summernote.summernoteStrings.editorDOTstrikethrough
import typings.summernote.summernoteStrings.editorDOTsubscript
import typings.summernote.summernoteStrings.editorDOTsuperscript
import typings.summernote.summernoteStrings.editorDOTunderline
import typings.summernote.summernoteStrings.editorDOTundo
import typings.summernote.summernoteStrings.enable
import typings.summernote.summernoteStrings.focus
import typings.summernote.summernoteStrings.fontName
import typings.summernote.summernoteStrings.fontSize
import typings.summernote.summernoteStrings.foreColor
import typings.summernote.summernoteStrings.formatH1
import typings.summernote.summernoteStrings.formatH2
import typings.summernote.summernoteStrings.formatH3
import typings.summernote.summernoteStrings.formatH4
import typings.summernote.summernoteStrings.formatH5
import typings.summernote.summernoteStrings.formatH6
import typings.summernote.summernoteStrings.formatPara
import typings.summernote.summernoteStrings.indent
import typings.summernote.summernoteStrings.insertImage
import typings.summernote.summernoteStrings.insertNode
import typings.summernote.summernoteStrings.insertOrderedList
import typings.summernote.summernoteStrings.insertParagraph
import typings.summernote.summernoteStrings.insertText
import typings.summernote.summernoteStrings.insertUnorderedList
import typings.summernote.summernoteStrings.isEmpty
import typings.summernote.summernoteStrings.italic
import typings.summernote.summernoteStrings.justifyCenter
import typings.summernote.summernoteStrings.justifyFull
import typings.summernote.summernoteStrings.justifyLeft
import typings.summernote.summernoteStrings.justifyRight
import typings.summernote.summernoteStrings.outdent
import typings.summernote.summernoteStrings.pasteHTML
import typings.summernote.summernoteStrings.redo
import typings.summernote.summernoteStrings.removeFormat
import typings.summernote.summernoteStrings.reset
import typings.summernote.summernoteStrings.restoreRange
import typings.summernote.summernoteStrings.saveRange
import typings.summernote.summernoteStrings.strikethrough
import typings.summernote.summernoteStrings.subscript
import typings.summernote.summernoteStrings.superscript
import typings.summernote.summernoteStrings.underline
import typings.summernote.summernoteStrings.undo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def summernote(): JQuery = js.native
  def summernote(command: String): JQuery = js.native
  def summernote(command: String, markupString: String): JQuery = js.native
  def summernote(command: String, node: Node): JQuery = js.native
  def summernote(command: String, url: String, filename: String): JQuery = js.native
  def summernote(command: String, url: String, filename: EditImageCallback): JQuery = js.native
  def summernote(command: String, value: Double): JQuery = js.native
  def summernote(options: Options): JQuery = js.native
  @JSName("summernote")
  def summernote_backColor(command: backColor, color: String): JQuery = js.native
  @JSName("summernote")
  def summernote_bold(fontStyle: bold): JQuery = js.native
  @JSName("summernote")
  def summernote_code(command: code): JQuery = js.native
  @JSName("summernote")
  def summernote_code(command: code, markupStr: String): JQuery = js.native
  @JSName("summernote")
  def summernote_createLink(command: createLink, options: CreateLinkOptions): JQuery = js.native
  @JSName("summernote")
  def summernote_createRange(command: createRange): JQuery = js.native
  @JSName("summernote")
  def summernote_destroy(command: destroy): JQuery = js.native
  @JSName("summernote")
  def summernote_disable(command: disable): JQuery = js.native
  // Font style API
  @JSName("summernote")
  def summernote_editorbold(fontStyle: editorDOTbold): JQuery = js.native
  // Basic API
  @JSName("summernote")
  def summernote_editorcreateRange(command: editorDOTcreateRange): JQuery = js.native
  @JSName("summernote")
  def summernote_editorfocus(command: editorDOTfocus): JQuery = js.native
  @JSName("summernote")
  def summernote_editorfontSize(command: editorDOTfontSize, fontSize: Double): JQuery = js.native
  @JSName("summernote")
  def summernote_editorindent(command: editorDOTindent): JQuery = js.native
  // Insertion API
  @JSName("summernote")
  def summernote_editorinsertImage(command: editorDOTinsertImage, url: String): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertImage(command: editorDOTinsertImage, url: String, filename: String): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertImage(command: editorDOTinsertImage, url: String, filename: EditImageCallback): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertNode(command: editorDOTinsertNode, node: Node): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertOrderedList(command: editorDOTinsertOrderedList): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertText(command: editorDOTinsertText, text: String): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertUnorderedList(command: editorDOTinsertUnorderedList): JQuery = js.native
  @JSName("summernote")
  def summernote_editorisEmpty(command: editorDOTisEmpty): Boolean = js.native
  @JSName("summernote")
  def summernote_editoritalic(fontStyle: editorDOTitalic): JQuery = js.native
  @JSName("summernote")
  def summernote_editorjustifyCenter(command: editorDOTjustifyCenter): JQuery = js.native
  @JSName("summernote")
  def summernote_editorjustifyFull(command: editorDOTjustifyFull): JQuery = js.native
  // Paragraph API
  @JSName("summernote")
  def summernote_editorjustifyLeft(command: editorDOTjustifyLeft): JQuery = js.native
  @JSName("summernote")
  def summernote_editorjustifyRight(command: editorDOTjustifyRight): JQuery = js.native
  @JSName("summernote")
  def summernote_editoroutdent(command: editorDOToutdent): JQuery = js.native
  @JSName("summernote")
  def summernote_editorpasteHTML(command: editorDOTpasteHTML, markup: String): JQuery = js.native
  @JSName("summernote")
  def summernote_editorredo(command: editorDOTredo): JQuery = js.native
  @JSName("summernote")
  def summernote_editorremoveFormat(command: editorDOTremoveFormat): JQuery = js.native
  @JSName("summernote")
  def summernote_editorrestoreRange(command: editorDOTrestoreRange): JQuery = js.native
  @JSName("summernote")
  def summernote_editorsaveRange(command: editorDOTsaveRange): JQuery = js.native
  @JSName("summernote")
  def summernote_editorstrikethrough(fontStyle: editorDOTstrikethrough): JQuery = js.native
  @JSName("summernote")
  def summernote_editorsubscript(command: editorDOTsubscript): JQuery = js.native
  @JSName("summernote")
  def summernote_editorsuperscript(command: editorDOTsuperscript): JQuery = js.native
  @JSName("summernote")
  def summernote_editorunderline(fontStyle: editorDOTunderline): JQuery = js.native
  @JSName("summernote")
  def summernote_editorundo(command: editorDOTundo): JQuery = js.native
  @JSName("summernote")
  def summernote_enable(command: enable): JQuery = js.native
  @JSName("summernote")
  def summernote_focus(command: focus): JQuery = js.native
  @JSName("summernote")
  def summernote_fontName(command: fontName, fontName: String): JQuery = js.native
  @JSName("summernote")
  def summernote_fontSize(command: fontSize, fontSize: Double): JQuery = js.native
  @JSName("summernote")
  def summernote_foreColor(command: foreColor, color: String): JQuery = js.native
  @JSName("summernote")
  def summernote_formatH1(command: formatH1): JQuery = js.native
  @JSName("summernote")
  def summernote_formatH2(command: formatH2): JQuery = js.native
  @JSName("summernote")
  def summernote_formatH3(command: formatH3): JQuery = js.native
  @JSName("summernote")
  def summernote_formatH4(command: formatH4): JQuery = js.native
  @JSName("summernote")
  def summernote_formatH5(command: formatH5): JQuery = js.native
  @JSName("summernote")
  def summernote_formatH6(command: formatH6): JQuery = js.native
  @JSName("summernote")
  def summernote_formatPara(command: formatPara): JQuery = js.native
  @JSName("summernote")
  def summernote_indent(command: indent): JQuery = js.native
  @JSName("summernote")
  def summernote_insertImage(command: insertImage, url: String): JQuery = js.native
  @JSName("summernote")
  def summernote_insertImage(command: insertImage, url: String, filename: String): JQuery = js.native
  @JSName("summernote")
  def summernote_insertImage(command: insertImage, url: String, filename: EditImageCallback): JQuery = js.native
  @JSName("summernote")
  def summernote_insertNode(command: insertNode, node: Node): JQuery = js.native
  @JSName("summernote")
  def summernote_insertOrderedList(command: insertOrderedList): JQuery = js.native
  @JSName("summernote")
  def summernote_insertParagraph(command: insertParagraph): JQuery = js.native
  @JSName("summernote")
  def summernote_insertText(command: insertText, text: String): JQuery = js.native
  @JSName("summernote")
  def summernote_insertUnorderedList(command: insertUnorderedList): JQuery = js.native
  @JSName("summernote")
  def summernote_isEmpty(command: isEmpty): Boolean = js.native
  @JSName("summernote")
  def summernote_italic(fontStyle: italic): JQuery = js.native
  @JSName("summernote")
  def summernote_justifyCenter(command: justifyCenter): JQuery = js.native
  @JSName("summernote")
  def summernote_justifyFull(command: justifyFull): JQuery = js.native
  @JSName("summernote")
  def summernote_justifyLeft(command: justifyLeft): JQuery = js.native
  @JSName("summernote")
  def summernote_justifyRight(command: justifyRight): JQuery = js.native
  @JSName("summernote")
  def summernote_outdent(command: outdent): JQuery = js.native
  @JSName("summernote")
  def summernote_pasteHTML(command: pasteHTML, markup: String): JQuery = js.native
  @JSName("summernote")
  def summernote_redo(command: redo): JQuery = js.native
  @JSName("summernote")
  def summernote_removeFormat(command: removeFormat): JQuery = js.native
  @JSName("summernote")
  def summernote_reset(command: reset): JQuery = js.native
  @JSName("summernote")
  def summernote_restoreRange(command: restoreRange): JQuery = js.native
  @JSName("summernote")
  def summernote_saveRange(command: saveRange): JQuery = js.native
  @JSName("summernote")
  def summernote_strikethrough(fontStyle: strikethrough): JQuery = js.native
  @JSName("summernote")
  def summernote_subscript(command: subscript): JQuery = js.native
  @JSName("summernote")
  def summernote_superscript(command: superscript): JQuery = js.native
  @JSName("summernote")
  def summernote_underline(fontStyle: underline): JQuery = js.native
  @JSName("summernote")
  def summernote_undo(command: undo): JQuery = js.native
}

