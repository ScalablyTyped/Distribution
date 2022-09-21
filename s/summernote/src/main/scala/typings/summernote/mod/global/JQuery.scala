package typings.summernote.mod.global

import typings.jquery.JQuery.Node
import typings.summernote.mod.global.Summernote.CreateLinkOptions
import typings.summernote.mod.global.Summernote.EditImageCallback
import typings.summernote.mod.global.Summernote.Options
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def summernote(): JQuery = js.native
  def summernote(command: editorDotisEmpty | isEmpty): Boolean = js.native
  def summernote(command: editorDotfontSize | fontSize, fontSize: Double): JQuery = js.native
  // Insertion API
  def summernote(
    command: editorDotinsertImage | editorDotinsertText | editorDotpasteHTML | insertImage | insertText | pasteHTML,
    markup: String
  ): JQuery = js.native
  def summernote(command: editorDotinsertNode | insertNode, node: Node): JQuery = js.native
  def summernote(command: editorDotinsertImage | insertImage, url: String, filename: String): JQuery = js.native
  def summernote(command: editorDotinsertImage | insertImage, url: String, filename: EditImageCallback): JQuery = js.native
  def summernote(command: String): JQuery = js.native
  def summernote(command: String, markupString: String): JQuery = js.native
  def summernote(command: String, node: Node): JQuery = js.native
  def summernote(command: String, url: String, filename: String): JQuery = js.native
  def summernote(command: String, url: String, filename: EditImageCallback): JQuery = js.native
  def summernote(command: String, value: Double): JQuery = js.native
  def summernote(options: Options): JQuery = js.native
  // Basic API
  // Font style API
  // Paragraph API
  @JSName("summernote")
  def summernote_JQuery(
    command: bold | createRange | editorDotbold | editorDotcreateRange | editorDotfocus | editorDotindent | editorDotinsertOrderedList | editorDotinsertUnorderedList | editorDotitalic | editorDotjustifyCenter | editorDotjustifyFull | editorDotjustifyLeft | editorDotjustifyRight | editorDotoutdent | editorDotredo | editorDotremoveFormat | editorDotrestoreRange | editorDotsaveRange | editorDotstrikethrough | editorDotsubscript | editorDotsuperscript | editorDotunderline | editorDotundo | focus | indent | insertOrderedList | insertUnorderedList | italic | justifyCenter | justifyFull | justifyLeft | justifyRight | outdent | redo | removeFormat | restoreRange | saveRange | strikethrough | subscript | superscript | underline | undo
  ): JQuery = js.native
  @JSName("summernote")
  def summernote_backColor(command: backColor, color: String): JQuery = js.native
  @JSName("summernote")
  def summernote_code(command: code): String = js.native
  @JSName("summernote")
  def summernote_code(command: code, markupStr: String): Unit = js.native
  @JSName("summernote")
  def summernote_createLink(command: createLink, options: CreateLinkOptions): JQuery = js.native
  @JSName("summernote")
  def summernote_destroy(command: destroy): JQuery = js.native
  @JSName("summernote")
  def summernote_disable(command: disable): JQuery = js.native
  @JSName("summernote")
  def summernote_enable(command: enable): JQuery = js.native
  @JSName("summernote")
  def summernote_fontName(command: fontName, fontName: String): JQuery = js.native
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
  def summernote_insertParagraph(command: insertParagraph): JQuery = js.native
  @JSName("summernote")
  def summernote_reset(command: reset): JQuery = js.native
}
