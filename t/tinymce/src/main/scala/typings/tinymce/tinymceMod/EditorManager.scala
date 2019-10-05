package typings.tinymce.tinymceMod

import org.scalablytyped.runtime.TopLevel
import typings.tinymce.tinymceMod.dom.DomQuery
import typings.tinymce.tinymceMod.util.Observable
import typings.tinymce.tinymceMod.util.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorManager extends Observable {
  @JSName("$")
  var $: DomQuery = js.native
  var activeEditor: Editor = js.native
  var baseURI: URI = js.native
  var baseURL: String = js.native
  var documentBaseURL: String = js.native
  var editors: js.Array[Editor] = js.native
  var majorVersion: String = js.native
  var minorVersion: String = js.native
  var releaseDate: String = js.native
  var suffix: String = js.native
  def add(editor: Editor): Editor = js.native
  def addI18n(code: String, items: js.Object): Unit = js.native
  def createEditor(id: String, settings: js.Object): Editor = js.native
  def execCommand(cmd: String): Boolean = js.native
  def execCommand(cmd: String, ui: Boolean): Boolean = js.native
  def execCommand(cmd: String, ui: Boolean, value: String): Boolean = js.native
  def get(id: String): Editor = js.native
  def init(settings: Settings): js.Promise[Editor] = js.native
  def overrideDefaults(defaultSettings: js.Object): Unit = js.native
  def remove(selector: Editor): Editor = js.native
  def setActive(editor: Editor): Unit = js.native
  def translate(text: String): String = js.native
  def triggerSave(): Unit = js.native
}

@JSImport("tinymce", "EditorManager")
@js.native
object EditorManager extends TopLevel[EditorManager]

