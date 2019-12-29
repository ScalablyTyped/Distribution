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
import typings.summernote.summernoteStrings.editorDotbold
import typings.summernote.summernoteStrings.editorDotcreateRange
import typings.summernote.summernoteStrings.editorDotfocus
import typings.summernote.summernoteStrings.editorDotfontSize
import typings.summernote.summernoteStrings.editorDotindent
import typings.summernote.summernoteStrings.editorDotinsertImage
import typings.summernote.summernoteStrings.editorDotinsertNode
import typings.summernote.summernoteStrings.editorDotinsertOrderedList
import typings.summernote.summernoteStrings.editorDotinsertText
import typings.summernote.summernoteStrings.editorDotinsertUnorderedList
import typings.summernote.summernoteStrings.editorDotisEmpty
import typings.summernote.summernoteStrings.editorDotitalic
import typings.summernote.summernoteStrings.editorDotjustifyCenter
import typings.summernote.summernoteStrings.editorDotjustifyFull
import typings.summernote.summernoteStrings.editorDotjustifyLeft
import typings.summernote.summernoteStrings.editorDotjustifyRight
import typings.summernote.summernoteStrings.editorDotoutdent
import typings.summernote.summernoteStrings.editorDotpasteHTML
import typings.summernote.summernoteStrings.editorDotredo
import typings.summernote.summernoteStrings.editorDotremoveFormat
import typings.summernote.summernoteStrings.editorDotrestoreRange
import typings.summernote.summernoteStrings.editorDotsaveRange
import typings.summernote.summernoteStrings.editorDotstrikethrough
import typings.summernote.summernoteStrings.editorDotsubscript
import typings.summernote.summernoteStrings.editorDotsuperscript
import typings.summernote.summernoteStrings.editorDotunderline
import typings.summernote.summernoteStrings.editorDotundo
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
  def summernote_editorbold(fontStyle: editorDotbold): JQuery = js.native
  // Basic API
  @JSName("summernote")
  def summernote_editorcreateRange(command: editorDotcreateRange): JQuery = js.native
  @JSName("summernote")
  def summernote_editorfocus(command: editorDotfocus): JQuery = js.native
  @JSName("summernote")
  def summernote_editorfontSize(command: editorDotfontSize, fontSize: Double): JQuery = js.native
  @JSName("summernote")
  def summernote_editorindent(command: editorDotindent): JQuery = js.native
  // Insertion API
  @JSName("summernote")
  def summernote_editorinsertImage(command: editorDotinsertImage, url: String): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertImage(command: editorDotinsertImage, url: String, filename: String): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertImage(command: editorDotinsertImage, url: String, filename: EditImageCallback): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertNode(command: editorDotinsertNode, node: Node): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertOrderedList(command: editorDotinsertOrderedList): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertText(command: editorDotinsertText, text: String): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertUnorderedList(command: editorDotinsertUnorderedList): JQuery = js.native
  @JSName("summernote")
  def summernote_editorisEmpty(command: editorDotisEmpty): Boolean = js.native
  @JSName("summernote")
  def summernote_editoritalic(fontStyle: editorDotitalic): JQuery = js.native
  @JSName("summernote")
  def summernote_editorjustifyCenter(command: editorDotjustifyCenter): JQuery = js.native
  @JSName("summernote")
  def summernote_editorjustifyFull(command: editorDotjustifyFull): JQuery = js.native
  // Paragraph API
  @JSName("summernote")
  def summernote_editorjustifyLeft(command: editorDotjustifyLeft): JQuery = js.native
  @JSName("summernote")
  def summernote_editorjustifyRight(command: editorDotjustifyRight): JQuery = js.native
  @JSName("summernote")
  def summernote_editoroutdent(command: editorDotoutdent): JQuery = js.native
  @JSName("summernote")
  def summernote_editorpasteHTML(command: editorDotpasteHTML, markup: String): JQuery = js.native
  @JSName("summernote")
  def summernote_editorredo(command: editorDotredo): JQuery = js.native
  @JSName("summernote")
  def summernote_editorremoveFormat(command: editorDotremoveFormat): JQuery = js.native
  @JSName("summernote")
  def summernote_editorrestoreRange(command: editorDotrestoreRange): JQuery = js.native
  @JSName("summernote")
  def summernote_editorsaveRange(command: editorDotsaveRange): JQuery = js.native
  @JSName("summernote")
  def summernote_editorstrikethrough(fontStyle: editorDotstrikethrough): JQuery = js.native
  @JSName("summernote")
  def summernote_editorsubscript(command: editorDotsubscript): JQuery = js.native
  @JSName("summernote")
  def summernote_editorsuperscript(command: editorDotsuperscript): JQuery = js.native
  @JSName("summernote")
  def summernote_editorunderline(fontStyle: editorDotunderline): JQuery = js.native
  @JSName("summernote")
  def summernote_editorundo(command: editorDotundo): JQuery = js.native
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

